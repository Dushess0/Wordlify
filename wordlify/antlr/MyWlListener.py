from antlr4 import *
from WordlifyParser import WordlifyParser
from WordlifyListener import WordlifyListener
# This class defines a complete listener for a parse tree produced by WordlifyParser.
class MyWlListener(WordlifyListener):
    def __init__(self, output, src_lines, functions):
        self.output = output
        self.src_lines = src_lines
        self.imports = []
        self.functions = []
        self.fn_specs = {}

        self.vars = {}
        for name in functions:
            self.fn_specs[name] = functions[name]

        self.indent = 0

    def add_imps(self, imps):
        for imp in imps:
            if imp not in self.imports:
                self.imports.append(imp)

    # Enter a parse tree produced by WordlifyParser#program.
    def enterProgram(self, ctx:WordlifyParser.ProgramContext):
        ctx.lines = []
        ctx.localVars = []

    # Exit a parse tree produced by WordlifyParser#program.
    def exitProgram(self, ctx:WordlifyParser.ProgramContext):
        if len(self.imports) != 0:
            for line in self.imports:
                self.output.write(line + "\n")
            self.output.write("\n")
        
        if len(self.functions) != 0:
            for line in self.functions:
                self.output.write(line + "\n")

        for line in ctx.lines:
            self.output.write(line + "\n")

    # Enter a parse tree produced by WordlifyParser#fn_def.
    def enterFn_def(self, ctx:WordlifyParser.Fn_defContext):
        ctx.lines = []
        ctx.localVars = []
        header = "def {}(".format(ctx.ID()[0].getText())

        if len(ctx.ID()) > 1:
            header += ctx.ID()[1].getText()
            ctx.localVars.append(ctx.ID()[1].getText())
            self.vars[ctx.ID()[1].getText()] = "any"

            for i in range(2, len(ctx.ID())):
                header += ", {}".format(ctx.ID()[i].getText())
                ctx.localVars.append(ctx.ID()[i].getText())
                self.vars[ctx.ID()[i].getText()] = "any"

        header += "):"
        self.indent+=4
        ctx.lines.append(header)

    # Exit a parse tree produced by WordlifyParser#fn_def.
    def exitFn_def(self, ctx:WordlifyParser.Fn_defContext):
        if len(ctx.lines) == 1:
            ctx.lines.append(" "*self.indent + "pass")
        ctx.lines.append("")
        self.indent-=4
        self.functions += ctx.lines
        for v in ctx.localVars:
            if v not in ctx.parentCtx.localVars:
                del self.vars[v]

    # Enter a parse tree produced by WordlifyParser#block_instr.
    def enterBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#block_instr.
    def exitBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Enter a parse tree produced by WordlifyParser#foreach.
    def enterForeach(self, ctx:WordlifyParser.ForeachContext):
        if ctx.ID()[1].getText() not in self.vars:
            line_nr = ctx.ID()[1].getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID()[1].getSymbol().column
            raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.ID()[1].getText(), line))
        if self.vars[ctx.ID()[1].getText()] not in ["array", "any"]:
            line_nr = ctx.ID()[1].getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID()[1].getSymbol().column
            raise Exception("Line {}, column {}: variable '{}' must be of type 'array':\n    {}".format(line_nr, col_nr, ctx.ID()[1].getText(), line))

        ctx.lines = [" "*self.indent + "for " + ctx.ID()[0].getText() + " in " + ctx.ID()[1].getText() + ":"]

        ctx.localVars = [ctx.ID()[0].getText()]
        self.vars[ctx.ID()[0].getText()] = "any"

        self.indent += 4

    # Exit a parse tree produced by WordlifyParser#foreach.
    def exitForeach(self, ctx:WordlifyParser.ForeachContext):
        if len(ctx.lines) == 1:
            ctx.lines.append(" "*self.indent + "pass")
        ctx.parentCtx.parentCtx.lines += ctx.lines
        self.indent -= 4

        for localVar in ctx.localVars:
            if localVar not in ctx.parentCtx.parentCtx.localVars:
                del self.vars[localVar]

    # Enter a parse tree produced by WordlifyParser#while_instr.
    def enterWhile_instr(self, ctx:WordlifyParser.While_instrContext):
        ctx.lines = [" "*self.indent + "while " + ctx.cond().getText() + ":"]
        ctx.localVars = []
        self.indent += 4

    # Exit a parse tree produced by WordlifyParser#while_instr.
    def exitWhile_instr(self, ctx:WordlifyParser.While_instrContext):
        if len(ctx.lines) == 1:
            ctx.lines.append(" "*self.indent + "pass")
        ctx.parentCtx.parentCtx.lines += ctx.lines
        self.indent -= 4

        for localVar in ctx.localVars:
            if localVar not in ctx.parentCtx.parentCtx.localVars:
                del self.vars[localVar]

    # Enter a parse tree produced by WordlifyParser#if_instr.
    def enterIf_instr(self, ctx:WordlifyParser.If_instrContext):
        ctx.lines = [" "*self.indent + "if "]

    # Exit a parse tree produced by WordlifyParser#if_instr.
    def exitIf_instr(self, ctx:WordlifyParser.If_instrContext):
        ctx.parentCtx.parentCtx.lines += ctx.lines

    # Enter a parse tree produced by WordlifyParser#if_cond.
    def enterIf_cond(self, ctx:WordlifyParser.If_condContext):
        pass

    # Exit a parse tree produced by WordlifyParser#if_cond.
    def exitIf_cond(self, ctx:WordlifyParser.If_condContext):
        ctx.parentCtx.lines[0] += ctx.cond().text + ":"

    # Enter a parse tree produced by WordlifyParser#then.
    def enterThen(self, ctx:WordlifyParser.ThenContext):
        ctx.lines = []
        ctx.localVars = []
        self.indent += 4

    # Exit a parse tree produced by WordlifyParser#then.
    def exitThen(self, ctx:WordlifyParser.ThenContext):
        if ctx.lines == []:
            ctx.parentCtx.lines.append(" "*self.indent + "pass")
        else:
            ctx.parentCtx.lines += ctx.lines
        self.indent -= 4
        for localVar in ctx.localVars:
            if localVar not in ctx.parentCtx.parentCtx.parentCtx.localVars:
                del self.vars[localVar]

    # Enter a parse tree produced by WordlifyParser#else_if.
    def enterElse_if(self, ctx:WordlifyParser.Else_ifContext):
        ctx.lines = [" "*self.indent + "elif "]
        ctx.localVars = []

    # Exit a parse tree produced by WordlifyParser#else_if.
    def exitElse_if(self, ctx:WordlifyParser.Else_ifContext):
        if ctx.lines == []:
            ctx.parentCtx.lines.append(" "*self.indent + "pass")
        else:
            for line in ctx.lines:
                ctx.parentCtx.lines.append(line)
        for localVar in ctx.localVars:
            if localVar not in ctx.parentCtx.parentCtx.parentCtx.localVars:
                del self.vars[localVar]

    # Enter a parse tree produced by WordlifyParser#else_block.
    def enterElse_block(self, ctx:WordlifyParser.Else_blockContext):
        ctx.lines = []
        ctx.localVars = []
        self.indent += 4

    # Exit a parse tree produced by WordlifyParser#else_block.
    def exitElse_block(self, ctx:WordlifyParser.Else_blockContext):
        ctx.parentCtx.lines.append(" "*(self.indent-4) + "else:")
        if ctx.lines == []:
            ctx.parentCtx.lines.append(" "*self.indent + "pass")
        else:
            for line in ctx.lines:
                ctx.parentCtx.lines.append(line)
        self.indent -= 4
        for localVar in ctx.localVars:
            if localVar not in ctx.parentCtx.parentCtx.parentCtx.localVars:
                del self.vars[localVar]

    # Enter a parse tree produced by WordlifyParser#cond.
    def enterCond(self, ctx:WordlifyParser.CondContext):
        pass
    def getTextFromComparsion(self,comparsion):
        text = comparsion.expr()[0].text
        text2 = comparsion.expr()[1].text
        op= comparsion.CMP_OP().getText()
        return text + " " + op + " " + text2

    # Exit a parse tree produced by WordlifyParser#cond.
    def exitCond(self, ctx:WordlifyParser.CondContext):
        if ctx.BOOL() != None:
            if ctx.BOOL().getText() == "true":
                ctx.text = "True"
            else:
                ctx.text = "False"
        elif ctx.comparison() != None:

            ctx.text = self.getTextFromComparsion(ctx.comparison())
        elif ctx.double_comparsion() != None:
            op= ctx.double_comparsion().LOG_OP().getText()
            cmp1= ctx.double_comparsion().comparison()[0]
            cmp2= ctx.double_comparsion().comparison()[1]
            ctx.text = self.getTextFromComparsion(cmp1) + " " + op + " " +self.getTextFromComparsion(cmp2)
        elif ctx.fn_call() != None:
            # TODO check if return type is bool
            ctx.text = ""
            if hasattr(ctx.fn_call(),'lines') != None:
                ctx.text = ctx.fn_call().lines[0]

    # Enter a parse tree produced by WordlifyParser#comparison.
    def enterComparison(self, ctx:WordlifyParser.ComparisonContext):
        pass

    # Exit a parse tree produced by WordlifyParser#comparison.
    def exitComparison(self, ctx:WordlifyParser.ComparisonContext):
        pass


    # Enter a parse tree produced by WordlifyParser#atom_instr.
    def enterAtom_instr(self, ctx:WordlifyParser.Atom_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#atom_instr.
    def exitAtom_instr(self, ctx:WordlifyParser.Atom_instrContext):
        for line in ctx.lines:
            ctx.parentCtx.lines.append(" "*self.indent + line)

    # Enter a parse tree produced by WordlifyParser#assign.
    def enterAssign(self, ctx:WordlifyParser.AssignContext):
        pass

    # Exit a parse tree produced by WordlifyParser#assign.
    def exitAssign(self, ctx:WordlifyParser.AssignContext):
        obj=None
        # TODO return_fn:
        if (ctx.ID()!=None):
            obj = ctx.ID()
        if (ctx.array_elem()!=None):
            obj = ctx.array_elem()
        
        text =obj.getText()
       
        ctx.parentCtx.lines = ["{} = {}".format(obj.getText(), ctx.expr().text)]
        self.vars[obj.getText()] = ctx.expr().type
        ctx.parentCtx.parentCtx.localVars.append(obj.getText())

    # Enter a parse tree produced by WordlifyParser#expr.
    def enterExpr(self, ctx:WordlifyParser.ExprContext):
        pass

    # Exit a parse tree produced by WordlifyParser#expr.
    def exitExpr(self, ctx:WordlifyParser.ExprContext):
        if ctx.STR() != None:
            ctx.type = "str"
            ctx.text = ctx.getText()
        elif ctx.NUM() != None:
            ctx.type = "num"
            ctx.text = ctx.getText()
        elif ctx.array() != None:
            ctx.type = "array"
            ctx.text = ctx.array().text
        elif ctx.ID() != None:
            id = ctx.ID().getText()
            if id not in self.vars:
                line_nr = ctx.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = ctx.ID().getSymbol().column
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            ctx.type = self.vars[id]
            ctx.text = ctx.getText()
        elif ctx.arith_expr() != None:
            ctx.text = ctx.arith_expr().text
            ctx.type = "num"
        elif ctx.fn_call() != None:
            ctx.text = ""
            call= ctx.fn_call()
            if hasattr(ctx.fn_call(),'lines'):
                ctx.text = ctx.fn_call().lines[0]
            ctx.type = "any" # TODO
        elif ctx.array_elem() != None:
            ctx.text = ctx.array_elem().text
            ctx.type = "any"
        elif ctx.concat() != None:
            ctx.text = ctx.concat().text
            ctx.type = "str"

      # Enter a parse tree produced by WordlifyParser#arith_expr.
    def enterArith_expr(self, ctx:WordlifyParser.Arith_exprContext):
        pass

    # Exit a parse tree produced by WordlifyParser#arith_expr.
    def exitArith_expr(self, ctx:WordlifyParser.Arith_exprContext):
        for voi in ctx.value_or_id():
            id = voi.ID()
            if id != None:
                if id.getText() not in self.vars:
                    line_nr = id.getSymbol().line
                    line = self.src_lines[line_nr-1].lstrip()
                    col_nr = id.getSymbol().column
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id.getText(), line))
                if self.vars[id.getText()] not in ["num", "any"]:
                    line_nr = id.getSymbol().line
                    line = self.src_lines[line_nr-1].lstrip()
                    col_nr = id.getSymbol().column
                    raise Exception("Line {}, column {}: variable '{}' should be a 'num', but is '{}':\n    {}".format(line_nr, col_nr, id.getText(), self.vars[id.getText()], line))
        
        ctx.text = "{} {} {}".format(ctx.value_or_id()[0].getText(), ctx.ARITH_OP(), ctx.value_or_id()[1].getText())


    # Enter a parse tree produced by WordlifyParser#concat.
    def enterConcat(self, ctx:WordlifyParser.ConcatContext):
        pass

    # Exit a parse tree produced by WordlifyParser#concat.
    def exitConcat(self, ctx:WordlifyParser.ConcatContext):
        for voi in ctx.value_or_id():
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        ctx.text = "str(" +  ctx.value_or_id()[0].getText() + ")"
        for i in range(1, len(ctx.value_or_id())):
            ctx.text += " + " + "str(" + ctx.value_or_id()[i].getText() + ")"

    # Enter a parse tree produced by WordlifyParser#fn_call.
    def enterFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass

    # Exit a parse tree produced by WordlifyParser#fn_call.
    def exitFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass


    # Enter a parse tree produced by WordlifyParser#array_append.
    def enterArray_append(self, ctx:WordlifyParser.Array_appendContext):
        pass

    # Exit a parse tree produced by WordlifyParser#array_append.
    def exitArray_append(self, ctx:WordlifyParser.Array_appendContext):
        ctx.parentCtx.lines = ["{}.append({})".format(ctx.ID(), ctx.expr().text)]

    # Enter a parse tree produced by WordlifyParser#array_elem.
    def enterArray_elem(self, ctx:WordlifyParser.Array_elemContext):
        pass

    # Exit a parse tree produced by WordlifyParser#array_elem.
    def exitArray_elem(self, ctx:WordlifyParser.Array_elemContext):
        line_nr = ctx.ID().getSymbol().line
        line = self.src_lines[line_nr-1].lstrip()
        col_nr = ctx.ID().getSymbol().column
        
        arrayName=ctx.ID().getText()
        if arrayName not in self.vars:
            raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, arrayName, line))
        if self.vars[arrayName] not in ["array", "any"]:
            raise Exception("Line {}, column {}: variable '{}' should be an 'array':\n    {}".format(line_nr, col_nr, arrayName, line))
        #----------------------------
        
        if ctx.expr().ID() == None and ctx.expr().NUM() == None:
            line_nr = ctx.expr().getSymbol().line
            col_nr = ctx.expr().getSymbol().column
            line = self.src_lines[line_nr-1].lstrip()
            raise Exception("Line {}, column {}: array index must be a 'num':\n    {}".format(line_nr, col_nr, line))
        if ctx.expr().ID() != None:
            if ctx.expr().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.expr().ID().getText(), line))
            if self.vars[ctx.expr().ID().getText()] not in ["num", "any"]:
                raise Exception("Line {}, column {}: array index must be a 'num':\n    {}".format(line_nr, col_nr, line))

        ctx.text = "{}[{}]".format(ctx.ID().getText(), ctx.expr().getText())

    # Enter a parse tree produced by WordlifyParser#own_fn_call.
    def enterOwn_fn_call(self, ctx:WordlifyParser.Own_fn_callContext):
        pass

    # Exit a parse tree produced by WordlifyParser#own_fn_call.
    def exitOwn_fn_call(self, ctx:WordlifyParser.Own_fn_callContext):
        line_nr = ctx.ID().getSymbol().line
        col_nr = ctx.ID().getSymbol().column
        line = self.src_lines[line_nr-1].lstrip()
        id = ctx.ID().getText()

        if ctx.ID().getText() not in self.fn_specs:
            raise Exception("Line {}, column {}: function '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
        if self.fn_specs[ctx.ID().getText()] != len(ctx.value_or_id()):
            raise Exception("Line {}, column {}: function '{}' expects {} arguments, found {}:\n    {}".format(line_nr, col_nr, id, self.fn_specs[ctx.ID().getText()], len(ctx.value_or_id()), line))

        header = "{}(".format(ctx.ID().getText())
        if len(ctx.value_or_id()) > 0:
            header += ctx.value_or_id()[0].getText()

            for i in range(1, len(ctx.value_or_id()) ):
                header += ", {}".format(ctx.value_or_id()[i].getText())

        header += ")"
        ctx.parentCtx.lines = [header]

    # Enter a parse tree produced by WordlifyParser#exist.
    def enterExist(self, ctx:WordlifyParser.ExistContext):
        pass

    # Exit a parse tree produced by WordlifyParser#exist.
    def exitExist(self, ctx:WordlifyParser.ExistContext):
        pass


    # Enter a parse tree produced by WordlifyParser#print_instr.
    def enterPrint_instr(self, ctx:WordlifyParser.Print_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#print_instr.
    def exitPrint_instr(self, ctx:WordlifyParser.Print_instrContext):
        if ctx.value_or_id().ID() != None: # are args of type 'num' or 'str'?
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        ctx.parentCtx.lines = ["print({})".format(ctx.value_or_id().getText())]

    # Enter a parse tree produced by WordlifyParser#rename.
    def enterRename(self, ctx:WordlifyParser.RenameContext):
        pass

    # Exit a parse tree produced by WordlifyParser#rename.
    def exitRename(self, ctx:WordlifyParser.RenameContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.STR() == None and voi.ID() == None:
                line_nr = voi.NUM().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.NUM().getSymbol().column
                raise Exception("Line {}, column {}: arguments of 'rename' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
                if self.vars[voi.ID().getText()] not in ["str", "any"]:
                    raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        self.add_imps(["import os.path"])
        
        ctx.parentCtx.lines = ["rename({}, {})".format(ctx.value_or_id()[0].getText(), str(ctx.value_or_id()[1].getText()))]

        self.functions += [
'def rename(old, new):',
'    new=str(new)',
'    old = str(old)',
'    if os.name == "nt": # Windows',
'        if old[-1] == ":" or old[-2:] == ":/":',
'            print("Error: file to rename cannot be root")',
'            quit()',
'    else:',
'        if old == "/":',
"""            print("Error: file to rename cannot be '/'")""",
'            quit()',
'',
'    if "/" in new:',
'        print("Error: new name cannot be a path")',
'        quit()',
'    try:',
'        if not os.path.exists(old):',
"""            print("Error: '%s' doesn't exist" % old)""",
'            quit()',
'',
'        v0 = ""',
'        v2 = old',
'        if old[-1] == "/":',
'            v2 = old[:-1]',
'        if "/" in v2:',
'            v0 = v2[:v2.rfind("/")+1]',
'',
'        v0 += new',
'        if os.path.exists(v0):',
"""            print("Error: '%s' already exists" % v0)""",
'            quit()',
'        os.replace(v2, v0)',
'    except PermissionError:',
'        print("Error: Permission denied to rename %s to %s" % (old, new))',
'']

    # Enter a parse tree produced by WordlifyParser#remove.
    def enterRemove(self, ctx:WordlifyParser.RemoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#remove.
    def exitRemove(self, ctx:WordlifyParser.RemoveContext):
        if ctx.value_or_id().STR() == None and ctx.value_or_id().ID() == None: # are args of type 'str'? 
            line_nr = ctx.value_or_id().NUM().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().NUM().getSymbol().column
            raise Exception("Line {}, column {}: argument of 'remove' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
        if ctx.value_or_id().ID() != None:
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))
            if self.vars[ctx.value_or_id().ID().getText()] not in ["str", "any"]:
                raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        self.add_imps(["import shutil", "import os"])
        ctx.parentCtx.lines = ["remove({})".format(ctx.value_or_id().getText())]

        self.functions += [
'def remove(filename):',
'    try:',
'        os.remove(filename)',
'    except PermissionError as v0:',
'        print("Error: %s - Permission denied to delete" % v0.filename)',
'        quit()',
'    except OSError:',
'        try:',
'            shutil.rmtree(filename)',
'        except PermissionError as v0:',
'            print("Error: %s - Permission denied to delete" % v0.filename)',
'            quit()',
'        except OSError as v0:',
'            print("Error: %s - No such file or directory" % v0.filename)',
'            quit()',
'']
    
    # Enter a parse tree produced by WordlifyParser#move.
    def enterMove(self, ctx:WordlifyParser.MoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#move.
    def exitMove(self, ctx:WordlifyParser.MoveContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.STR() == None and voi.ID() == None:
                line_nr = voi.NUM().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.NUM().getSymbol().column
                raise Exception("Line {}, column {}: arguments of 'move' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
                if self.vars[voi.ID().getText()] not in ["str", "any"]:
                    raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        self.add_imps(["import shutil", "import os"])
        ctx.parentCtx.lines = ["move({}, {})".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText())]

        self.functions += [
'def move(old, new):',
'v0 = "%s/%s" % (new, old.split("/")[-1])',
'try:',
'    if not os.path.exists(old):',
'        print("Error: %s doesn\'t exist" % old)',
'        quit()',
'    if os.name == "nt": # Windows',
'        if old[1] == ":" and len(old) < 4:',
'            print("Error: file to move cannot be root")',
'            quit()',
'    else:',
'        if(old == "/"):',
'            print("Error: file to move cannot be root")',
'            quit()',
'    if not os.path.isdir(new):',
'        v1 = new',
'        v2 = []',
'        if os.name == "nt": # Windows',
'            if new[-1] == "/":',
'                v1 = new[:-1]',
'',
'            v1 = v1.split("/")',
'',
'            if v1 == [""]:',
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif "" in v1:',
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v4 in range(0, len(v1)):',
'                    v3 = v1[0]',
'                    for v5 in range(1, v4+1):',
'                        v3 += "/" + v1[v5]',
'                    v2.append(v3)',
'        else:',
'            if new != "/" and new[-1] == "/":',
'                v1 = new[:-1]',
'',
'            v1 = v1.split("/")',
'',
'            if v1 == [""]:',
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif v1[0] == "": # e.g. /wef/we',
'                for v4 in range(0, len(v1)):',
'                    v3 = v1[0]',
'                    for v5 in range(1, v4+1):',
'                        v3 += "/" + v1[v5]',
'                    v2.append(v3)',
'                v2[0] = "/"',
'            elif "" in v1:',
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v4 in range(0, len(v1)):',
'                    v3 = v1[0]',
'                    for v5 in range(1, v4+1):',
'                        v3 += "/" + v1[v5]',
'                    v2.append(v3)',
'',
'        for v6 in v2:',
'            if os.path.isfile(v6):',
'                print("Error: %s is a file - cannot create a directory there" % v6)',
'                quit()',
'            elif not os.path.exists(v6):',
'                os.mkdir(v6)',
'        shutil.move(old, new)',
'    elif os.path.exists(v0):',
'        try:',
'            os.remove(v0)',
'        except OSError:',
'            shutil.rmtree(v0)',
'        shutil.move(old, new)',
'    else:',
'        shutil.move(old, new)',
'except PermissionError:',
"""    print("Error: Permission denied to move '%s' to '%s'" % (old, new))""",
'    quit()',
'']

    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.STR() == None and voi.ID() == None:
                line_nr = voi.NUM().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.NUM().getSymbol().column
                raise Exception("Line {}, column {}: arguments of 'copy' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
                if self.vars[voi.ID().getText()] not in ["str", "any"]:
                    raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
        self.add_imps(["import shutil", "import os"])
        ctx.parentCtx.lines = ["copy({}, {})".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText())]

        self.functions += [
'def copy(old, new):',
'    v0 = "%s/%s" % (new, old.split("/")[-1])',
'    try:',
'        if not os.path.exists(old):',
'            print("Error: %s doesn\'t exist" % old)',
'            quit()',
'        elif not os.path.isdir(new):',
'            v1 = new',
'            v2 = []',
'            if os.name == "nt": # Windows',
'                if new[-1] == "/":',
'                    v1 = new[:-1]',
'',
'                v3 = v1.split("/")',
'',
'                if v3 == [""]:',
'                    print("Error: destination directory cannot be empty")',
'                    quit()',
'                elif "" in v3:',
'                    print("Error: invalid path")',
'                    quit()',
'                else:',
'                    for v4 in range(0, len(v3)):',
'                        v6 = v3[0]',
'                        for v5 in range(1, v4+1):',
'                            v6 += "/" + v3[v5]',
'                        v2.append(v6)',
'            else:',
'                if new != "/" and new[-1] == "/":',
'                    v1 = new[:-1]',
'',
'                v3 = v1.split("/")',
'',
'                if v3 == [""]:',
'                    print("Error: destination directory cannot be empty")',
'                    quit()',
'                elif v3[0] == "": # e.g. /wef/we',
'                    for v4 in range(0, len(v3)):',
'                        v6 = v3[0]',
'                        for v5 in range(1, v4+1):',
'                            v6 += "/" + v3[v5]',
'                        v2.append(v6)',
'                    v2[0] = "/"',
'                elif "" in v3:',
'                    print("Error: invalid path")',
'                    quit()',
'                else:',
'                    for v4 in range(0, len(v3)):',
'                        v6 = v3[0]',
'                        for v5 in range(1, v4+1):',
'                            v6 += "/" + v3[v5]',
'                        v2.append(v6)',
'',
'            for v7 in v2:',
'                if os.path.isfile(v7):',
'                    print("Error: %s is a file - cannot create a directory there" % v7)',
'                    quit()',
'                elif not os.path.exists(v7):',
'                    os.mkdir(v7)',
'            if os.path.isfile(old):',
'                shutil.copy2(old, v1)',
'            else:',
'                shutil.copytree(old, v1 + "/" + old)',
'        elif os.path.exists(v0):',
'            try:',
'                os.remove(v0)',
'            except  OSError:',
'                shutil.rmtree(v0)',
'            if os.path.isfile(old):',
'                shutil.copy2(old, v1)',
'            else:',
'                shutil.copytree(old, v1 + "/" + old)',
'        else:',
'            if os.path.isfile(old):',
'                shutil.copy2(old, v1)',
'            else:',
'                shutil.copytree(old, v1 + "/" + old)',
'    except PermissionError:',
"""        print("Error: Permission denied to copy '%s' to '%s'" % (old, new))""",
'        quit()',
'']


    # Enter a parse tree produced by WordlifyParser#download.
    def enterDownload(self, ctx:WordlifyParser.DownloadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#download.
    def exitDownload(self, ctx:WordlifyParser.DownloadContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.STR() == None and voi.ID() == None:
                line_nr = voi.NUM().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.NUM().getSymbol().column
                raise Exception("Line {}, column {}: arguments of 'download' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
                if self.vars[voi.ID().getText()] not in ["str", "any"]:
                    raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        self.add_imps(["import urllib.request", "from urllib.error import *", "import os"])
        ctx.parentCtx.lines = ["download({}, {})".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText())]

        self.functions += [
'def download(url, filename):'
'    try:',
'        if filename == "":',
'            print("Error: Empty destination file name")',
'            quit()',
'        v6 = filename',
'',
'        if os.path.isdir(filename):',
"""            print("Error: '%s' is a directory" % filename)""",
'            quit()',
'        if "/" in filename: # a (in)valid path',
'            v4 = []',
'            v0 = filename',
'            if v0[-2:] == "//":',
'                print("Error: invalid path")',
'                quit()',
'            if os.name == "nt":',
"""                if v0[-1] == "/": # trim unnecessary last '/'""",
'                    v0 = v0[:-1]',
'                    v6 = v0[:-1]',
'                v0 = v0.split("/")',
'                del v0[-1]',
'',
'                if "" in v0:',
'                    print("Error: invalid path")',
'                    quit()',
'                else:',
'                    for v1 in range(0, len(v0)):',
'                        v2 = v0[0]',
'                        for v3 in range(1, v1+1):',
'                            v2 += "/" + v0[v3]',
'                        v4.append(v2)',
'            else:',
'                if v0 != "/" and v0[-1] == "/": # trim unnecessary last "/"',
'                    v0 = v0[:-1]',
'                    v6 = v0[:-1]',
'                v0 = v0.split("/")',
'                del v0[-1]',
'',
'                if v0[0] == "":  # if is absolute path',
'                    for v1 in range(0, len(v0)):',
'                        v2 = ""',
'                        for v3 in range(1, v1 + 1):',
'                            v2 += "/" + v0[v3]',
'                        v4.append(v2)',
'                    v4[0] = "/"',
'                elif "" in v0:',
'                    print("Error: invalid path")',
'                    quit()',
'                else:',
'                    for v1 in range(0, len(v0)):',
'                        v2 = v0[0]',
'                        for v3 in range(1, v1+1):',
'                            v2 += "/" + v0[v3]',
'                        v4.append(v2)',
'',
'            for v5 in v4:',
'                if os.path.isfile(v5):',
'                    print("Error: %s is a file - cannot create a directory there" % v5)',
'                    quit()',
'                elif not os.path.exists(v5):',
'                    os.mkdir(v5)',
'    except PermissionError:',
"""        print("Error: Permission denied to download file as '%s'" % v6)""",
'        quit()',
'    try:',
'        urllib.request.urlretrieve(url, v6)',
'    except PermissionError:',
"""        print("Error: Permission denied to download file as '%s'" % v6)""",
'        quit()',
'    except URLError as v0:',
'        print("Network error: " + str(v0))',
'        quit()',
'']

    # Enter a parse tree produced by WordlifyParser#write.
    def enterWrite(self, ctx:WordlifyParser.WriteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#write.
    def exitWrite(self, ctx:WordlifyParser.WriteContext):
        voi0 = ctx.value_or_id()[0]
        voi1 = ctx.value_or_id()[1]
        if voi0.STR() == None and voi0.ID() == None:
            line_nr = voi0.NUM().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = voi0.NUM().getSymbol().column
            raise Exception("Line {}, column {}: arguments of 'write' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
        if voi0.ID() != None:
            line_nr = voi0.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = voi0.ID().getSymbol().column
            if voi0.ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi0.ID().getText(), line))
            if self.vars[voi0.ID().getText()] not in ["str", "any"]:
                raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi0.ID().getText(), line))
        if voi1.ID() != None:
            line_nr = voi1.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = voi1.ID().getSymbol().column
            if voi1.ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi1.ID().getText(), line))


        ctx.parentCtx.lines = ["write({}, {})".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText())]

        self.functions += [
'def write(filename, content):',
'    try:',
'        with open(filename, "a") as v0:',
'            v0.write(str(content))',
'    except PermissionError as v1:',
'        print("Error: Permission denied to write to file %s" % v1.filename)',
'        quit()',
'']

    # Enter a parse tree produced by WordlifyParser#read.
    def enterRead(self, ctx:WordlifyParser.ReadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#read.
    def exitRead(self, ctx:WordlifyParser.ReadContext):
        pass
        


    # Enter a parse tree produced by WordlifyParser#wait_instr.
    def enterWait_instr(self, ctx:WordlifyParser.Wait_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#wait_instr.
    def exitWait_instr(self, ctx:WordlifyParser.Wait_instrContext):
        if ctx.value_or_id().NUM() == None and ctx.value_or_id().ID() == None: # is arg of type 'num'?
            line_nr = ctx.value_or_id().STR().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().STR().getSymbol().column
            raise Exception("Line {}, column {}: argument of 'wait' function must be of type 'num':\n    {}".format(line_nr, col_nr, line))
        if ctx.value_or_id().ID() != None:
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))
            if self.vars[ctx.value_or_id().ID().getText()] not in ["num", "any"]:
                raise Exception("Line {}, column {}: variable '{}' should be a 'num':\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        self.add_imps(["import time"])
        ctx.parentCtx.lines = ['time.sleep({})'.format(ctx.value_or_id().getText())]


    # Enter a parse tree produced by WordlifyParser#execute.
    def enterExecute(self, ctx:WordlifyParser.ExecuteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#execute.
    def exitExecute(self, ctx:WordlifyParser.ExecuteContext):
        # TODO arguments for program to execute
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.STR() == None and voi.ID() == None:
                line_nr = voi.NUM().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.NUM().getSymbol().column
                raise Exception("Line {}, column {}: arguments of 'execute' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
            if voi.ID() != None:
                line_nr = voi.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = voi.ID().getSymbol().column
                if voi.ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))
                if self.vars[voi.ID().getText()] not in ["str", "any"]:
                    raise Exception("Line {}, column {}: variable '{}' should be an 'str':\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        self.add_imps(["import os"])
        ctx.parentCtx.lines = ["execute({})".format(ctx.value_or_id()[0].getText())]

        self.functions += [
'def execute(command):',
'    try:',
'        os.system(command)'.format(ctx.value_or_id()[0].getText()),
'    except PermissionError:',
"        print('Error: Permission denied to execute command %s' % command)",
'        quit()',
'    except OSError:',
"        print('Error: System error occured when executing %s' % command)",
'        quit()',
'']
        
    # Enter a parse tree produced by WordlifyParser#get_files.
    def enterGet_files(self, ctx:WordlifyParser.Get_filesContext):
        pass

    # Exit a parse tree produced by WordlifyParser#get_files.
    def exitGet_files(self, ctx:WordlifyParser.Get_filesContext):
        if ctx.value_or_id().STR() == None and ctx.value_or_id().ID() == None: # is arg of type 'str'?
            line_nr = ctx.value_or_id().STR().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().STR().getSymbol().column
            raise Exception("Line {}, column {}: argument of 'wait' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
        if ctx.value_or_id().ID() != None:
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))
            if self.vars[ctx.value_or_id().ID().getText()] not in ["str", "any"]:
                raise Exception("Line {}, column {}: variable '{}' should be a 'str':\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        self.add_imps(["import os"])
        ctx.parentCtx.lines = ["getFiles({})".format(ctx.value_or_id().getText())]

        self.functions += [
'def getFiles(dir):',
'    try:',
'        return os.listdir(dir)',
'    except PermissionError:',
"""        print("Error: Permission denied to list directory '%s'" % dir)""",
'        quit()',
'']

    # Enter a parse tree produced by WordlifyParser#date_modified.
    def enterDate_modified(self, ctx:WordlifyParser.Date_modifiedContext):
        
        pass

    # Exit a parse tree produced by WordlifyParser#date_modified.
    def exitDate_modified(self, ctx:WordlifyParser.Date_modifiedContext):
        if ctx.value_or_id().STR() == None and ctx.value_or_id().ID() == None: # is arg of type 'str'?
            line_nr = ctx.value_or_id().STR().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().STR().getSymbol().column
            raise Exception("Line {}, column {}: argument of 'wait' function must be of type 'str':\n    {}".format(line_nr, col_nr, line))
        if ctx.value_or_id().ID() != None:
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))
            if self.vars[ctx.value_or_id().ID().getText()] not in ["str", "any"]:
                raise Exception("Line {}, column {}: variable '{}' should be a 'str':\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        self.add_imps(["import pathlib", "import datetime"])
        ctx.parentCtx.lines = ["dateModified({})".format(ctx.value_or_id().getText())]
        self.functions +=[
'def dateModified(file):',
'    fname = pathlib.Path(file)',
'    if not fname.exists():',
"""        print("Error: No such file '%s'" % file)""",
'        quit()',
'    mtime = datetime.datetime.fromtimestamp(fname.stat().st_mtime)',
'    return str(mtime)',
'']


    # Enter a parse tree produced by WordlifyParser#size.
    def enterSize(self, ctx:WordlifyParser.SizeContext):
        pass

    # Exit a parse tree produced by WordlifyParser#size.
    def exitSize(self, ctx:WordlifyParser.SizeContext):
        pass


    # Enter a parse tree produced by WordlifyParser#exit.
    def enterExit(self, ctx:WordlifyParser.ExitContext):
        pass

    # Exit a parse tree produced by WordlifyParser#exit.
    def exitExit(self, ctx:WordlifyParser.ExitContext):
        if ctx.value_or_id().ID() != None:
            line_nr = ctx.value_or_id().ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.value_or_id().ID().getSymbol().column
            if ctx.value_or_id().ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        ctx.parentCtx.lines = ['quit({0})'.format(ctx.value_or_id().getText())]

    # Enter a parse tree produced by WordlifyParser#create.
    def enterCreate(self, ctx:WordlifyParser.CreateContext):
        pass

    # Exit a parse tree produced by WordlifyParser#create.
    def exitCreate(self, ctx:WordlifyParser.CreateContext):
        voi = ctx.value_or_id()
        if voi.ID() != None:
            line_nr = voi.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = voi.ID().getSymbol().column
            if voi.ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, voi.ID().getText(), line))

        ctx.parentCtx.lines = ["create({})".format(ctx.value_or_id().getText())]
        self.functions += [
'def create(filename):',
'    try:',
'        with open(str(filename), "x"):',
'            pass',
'    except PermissionError as v0:',
'        print("Error: Permission denied to write to file %s" % v0.filename)',
'        quit()',
'']


    # Enter a parse tree produced by WordlifyParser#length.
    def enterLength(self, ctx:WordlifyParser.LengthContext):
        pass

    # Exit a parse tree produced by WordlifyParser#length.
    def exitLength(self, ctx:WordlifyParser.LengthContext):
        if ctx.ID() != None:
            line_nr = ctx.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID().getSymbol().column
            if ctx.ID().getText() not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.ID().getText(), line))
            if self.vars[ctx.ID().getText()] not in ["array", "any"]:
                raise Exception("Line {}, column {}: variable '{}' must be of type 'array':\n    {}".format(line_nr, col_nr, ctx.ID().getText(), line))
            text = ctx.ID().getText()
        else:
            text = ctx.array().text

        ctx.parentCtx.lines = ["len({})".format(text)]

    # Enter a parse tree produced by WordlifyParser#array.
    def enterArray(self, ctx:WordlifyParser.ArrayContext):
        ctx.text = "["

    # Exit a parse tree produced by WordlifyParser#array.
    def exitArray(self, ctx:WordlifyParser.ArrayContext):
        vois = ctx.value_or_id()
        if len(vois) > 0:
            if vois[0].ID() != None:
                line_nr = vois[0].ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = vois[0].ID().getSymbol().column
                if vois[0].ID().getText() not in self.vars:
                    raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, vois[0].ID().getText(), line))
            ctx.text += vois[0].getText()
            for i in range(1, len(vois)):
                if vois[i].ID() != None:
                    line_nr = vois[i].ID().getSymbol().line
                    line = self.src_lines[line_nr-1].lstrip()
                    col_nr = vois[i].ID().getSymbol().column
                    if vois[i].ID().getText() not in self.vars:
                        raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, vois[i].ID().getText(), line))
                ctx.text += ", " + vois[i].getText()
        ctx.text += "]"

    # Enter a parse tree produced by WordlifyParser#value_or_id.
    def enterValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value_or_id.
    def exitValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

del WordlifyParser
