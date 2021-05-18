import sys
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

        self.vars = {}
        for name in functions:
            self.vars[name] = ("function", functions[name])

        self.var_nr = 0
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

            if ctx.ID()[1].getText()[0] == "v":
                try:
                    nr = ctx.ID()[1].getText()[1:]
                    self.var_nr = nr+1
                except ValueError:
                    pass

            for i in range(2, len(ctx.ID())):
                header += ", {}".format(ctx.ID()[i])
                ctx.localVars.append(ctx.ID()[i].getText())
                self.vars[ctx.ID()[i].getText()] = "any"

                if ctx.ID()[i].getText()[0] == "v":
                    try:
                        nr = ctx.ID()[i].getText()[1:]
                        self.var_nr = nr+1
                    except ValueError:
                        pass
        header += "):"
        self.indent+=4
        ctx.lines.append(header)

    # Exit a parse tree produced by WordlifyParser#fn_def.
    def exitFn_def(self, ctx:WordlifyParser.Fn_defContext):
        if len(ctx.lines) == 1:
            ctx.lines.append("    pass")
        ctx.lines.append("")
        self.indent-=4
        self.functions += ctx.lines
        for v in ctx.localVars:
            del self.vars[v]

    # Enter a parse tree produced by WordlifyParser#block_instr.
    def enterBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#block_instr.
    def exitBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Enter a parse tree produced by WordlifyParser#foreach.
    def enterForeach(self, ctx:WordlifyParser.ForeachContext):
        if ctx.ID()[0].getText() in self.vars and self.vars[ctx.ID()[0].getText()][0] == "function":
            line_nr = ctx.ID()[0].getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID()[0].getSymbol().column
            raise Exception("Line {}, column {}: cannot create variable '{}' - a function with this name already exists:\n    {}".format(line_nr, col_nr, ctx.ID()[0].getText(), line))

        if ctx.ID()[1].getText() not in self.vars:
            line_nr = ctx.ID()[0].getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID()[0].getSymbol().column
            raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, ctx.ID()[1].getText(), line))
        # TODO add lists as a data type

        ctx.lines = [" "*self.indent + "for " + ctx.ID()[0].getText() + " in " + ctx.ID()[1].getText() + ":"]
        ctx.localVars = []
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

    # Exit a parse tree produced by WordlifyParser#cond.
    def exitCond(self, ctx:WordlifyParser.CondContext):
        if ctx.BOOL() != None:
            if ctx.BOOL().getText() == "true":
                ctx.text = "True"
            else:
                ctx.text = "False"
        elif ctx.comparison() != None:
            ctx.text = ctx.comparison().expr()[0].getText() + " " + ctx.comparison().CMP_OP().getText() + " " + ctx.comparison().expr()[1].getText()
        else:
            ctx.text = "Tu ma być funkcja" # TODO

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
        if ctx.ID().getText()[0] == "v":
            try:
                nr = ctx.ID().getText()[1:]
                self.var_nr = int(nr) + 1
            except Exception:
                pass

        # TODO return_fn:
        line_nr = ctx.ID().getSymbol().line
        line = self.src_lines[line_nr-1].lstrip()
        col_nr = ctx.ID().getSymbol().column
        try:
            if self.vars[ctx.ID().getText()][0] == "function":
                raise Exception("Line {}, column {}: '{}' is a function\n    {}".format(line_nr, col_nr, ctx.ID().getText(), line))
        except KeyError:
            pass
        except Exception as e:
            raise e

        ctx.parentCtx.lines = ["{} = {}".format(ctx.ID().getText(), ctx.expr().getText())]
        self.vars[ctx.ID().getText()] = ctx.expr().type
        ctx.parentCtx.parentCtx.localVars.append(ctx.ID().getText())

    # Enter a parse tree produced by WordlifyParser#expr.
    def enterExpr(self, ctx:WordlifyParser.ExprContext):
        pass

    # Exit a parse tree produced by WordlifyParser#expr.
    def exitExpr(self, ctx:WordlifyParser.ExprContext):
        if ctx.STR() != None:
            ctx.type = "str"
        elif ctx.NUM() != None:
            ctx.type = "num"
        elif ctx.ID() != None:
            id = ctx.ID().getText()
            if id not in self.vars or self.vars[id][0] == "function":
                line_nr = ctx.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = ctx.ID().getSymbol().column
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            ctx.type = self.vars[id]
        elif ctx.arith_expr() != None:
            ctx.type = "num"
        # TODO fn_call

      # Enter a parse tree produced by WordlifyParser#arith_expr.
    def enterArith_expr(self, ctx:WordlifyParser.Arith_exprContext):
        pass

    # Exit a parse tree produced by WordlifyParser#arith_expr.
    def exitArith_expr(self, ctx:WordlifyParser.Arith_exprContext):
        for id in ctx.ID():
            if id.getText() not in self.vars or self.vars[id.getText()][0] == "function":
                line_nr = id.getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = id.getSymbol().column
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id.getText(), line))
            if self.vars[id.getText()] not in ["num", "any"]:
                line_nr = id.getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = id.getSymbol().column
                raise Exception("Line {}, column {}: variable '{}' should be a 'num', but is '{}':\n    {}".format(line_nr, col_nr, id.getText(), self.vars[id.getText()], line))

    # Enter a parse tree produced by WordlifyParser#fn_call.
    def enterFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass

    # Exit a parse tree produced by WordlifyParser#fn_call.
    def exitFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass

    # Enter a parse tree produced by WordlifyParser#own_fn_call.
    def enterOwn_fn_call(self, ctx:WordlifyParser.Own_fn_callContext):
        pass

    # Exit a parse tree produced by WordlifyParser#own_fn_call.
    def exitOwn_fn_call(self, ctx:WordlifyParser.Own_fn_callContext):
        line_nr = ctx.ID().getSymbol().line
        col_nr = ctx.ID().getSymbol().column
        line = self.src_lines[line_nr-1].lstrip()
        id = ctx.ID().getText()

        try:
            if self.vars[ctx.ID().getText()][0] != "function":
                raise Exception("Line {}, column {}: '{}' is not a function:\n    {}".format(line_nr, col_nr, id, line))
            if self.vars[ctx.ID().getText()][1] != len(ctx.value_or_id()):
                raise Exception("Line {}, column {}: function '{}' expects {} arguments, found {}:\n    {}".format(line_nr, col_nr, id, self.vars[ctx.ID().getText()][1], len(ctx.value_or_id()), line))
        except KeyError:
            raise Exception("Line {}, column {}: '{}' is not a function:\n    {}".format(line_nr, col_nr, id, line))

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
            if self.vars[ctx.value_or_id().ID().getText()][0] == "function":
                raise Exception("Line {}, column {}: '{}' is a function, expected 'str' or 'num':\n    {}".format(line_nr, col_nr, ctx.value_or_id().ID().getText(), line))

        ctx.parentCtx.lines = ["print({})".format(ctx.value_or_id().getText())]

    # Enter a parse tree produced by WordlifyParser#rename.
    def enterRename(self, ctx:WordlifyParser.RenameContext):
        pass

    # Exit a parse tree produced by WordlifyParser#rename.
    def exitRename(self, ctx:WordlifyParser.RenameContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.NUM() != None:
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

        ctx.parentCtx.lines = [
'if os.name == "nt": # Windows',
'    if {0}[-1] == ":" or {0}[-2:] == ":/":'.format(ctx.value_or_id()[0].getText()),
'        print("Error: old file cannot be root")',
'        quit()',
'else:',
'    if {} == "/":'.format(ctx.value_or_id()[0].getText()),
"""        print("Error: old file cannot be '/'")""",
'        quit()',
'',
'if "/" in {}:'.format(ctx.value_or_id()[1].getText()),
'    print("Error: new name cannot be a path")',
'    quit()',
'try:',
'    if not os.path.exists({}):'.format(ctx.value_or_id()[0].getText()),
"""        print("Error: '%s' doesn't exist" % {})""".format(ctx.value_or_id()[0].getText()),
'        quit()',
'',
'    v{} = ""'.format(self.var_nr),
'    v{} = {}'.format(self.var_nr+2, ctx.value_or_id()[0].getText()),
'    if {}[-1] == "/":'.format(ctx.value_or_id()[0].getText()),
'        v{} = {}[:-1]'.format(self.var_nr+2 ,ctx.value_or_id()[0].getText()),
'    if "/" in v{}:'.format(self.var_nr+2),
'        v{0} = v{1}[:v{1}.rfind("/")+1]'.format(self.var_nr, self.var_nr+2),
'',
'    v{} += {}'.format(self.var_nr, ctx.value_or_id()[1].getText()),
'    if os.path.exists(v{}):'.format(self.var_nr),
"""        print("Error: '%s' already exists" % v{})""".format(self.var_nr),
'        quit()',
'    os.replace(v{}, v{})'.format(self.var_nr+2, self.var_nr),
'except PermissionError:',
'    print("Error: Permission denied to rename %s to %s" % ({}, {}))'.format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText())]

    # Enter a parse tree produced by WordlifyParser#remove.
    def enterRemove(self, ctx:WordlifyParser.RemoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#remove.
    def exitRemove(self, ctx:WordlifyParser.RemoveContext):
        if ctx.value_or_id().NUM() != None: # are args of type 'str'? 
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

        ctx.parentCtx.lines = [
'try:',
'    os.remove({})'.format(ctx.value_or_id().getText()),
'except PermissionError as v{}:'.format(self.var_nr),
'    print("Error: %s - Permission denied to delete" % v{}.filename)'.format(self.var_nr),
'    quit()',
'except OSError:',
'    try:',
'        shutil.rmtree({})'.format(ctx.value_or_id().getText()),
'    except PermissionError as v{}:'.format(self.var_nr),
'        print("Error: %s - Permission denied to delete" % v{}.filename)'.format(self.var_nr),
'        quit()',
'    except OSError as v{}:'.format(self.var_nr),
'        print("Error: %s - No such file or directory" % v{}.filename)'.format(self.var_nr),
'        quit()']
        # don't delete v{1} because it doesn't exist
    
    # Enter a parse tree produced by WordlifyParser#move.
    def enterMove(self, ctx:WordlifyParser.MoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#move.
    def exitMove(self, ctx:WordlifyParser.MoveContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.NUM() != None:
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

        ctx.parentCtx.lines = [
'v{} = "%s/%s" % ({}, {}.split("/")[-1])'.format(self.var_nr, ctx.value_or_id()[1].getText(), ctx.value_or_id()[0].getText()),
'try:',
'    if not os.path.exists({}):'.format(ctx.value_or_id()[0].getText()),
'        print("Error: %s doesn\'t exist" % {})'.format(ctx.value_or_id()[0].getText()),
'        quit()',
'    if os.name == "nt": # Windows',
'        if {}[1] == ":" and len({}) < 4:'.format(ctx.value_or_id()[0].getText()),
'            print("Error: file to move cannot be root")',
'            quit()',
'    else:',
'        if({} == "/"):'.format(ctx.value_or_id()[0].getText()),
'            print("Error: file to move cannot be root")',
'            quit()',
'    if not os.path.isdir({}):'.format(ctx.value_or_id()[1].getText()),
'        v{} = {}'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'        v{} = []'.format(self.var_nr+2),
'        if os.name == "nt": # Windows',
'            if {}[-1] == "/":'.format(ctx.value_or_id()[1].getText()),
'                v{} = {}[:-1]'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'',
'            v{0} = v{0}.split("/")'.format(self.var_nr+1),
'',
'            if v{} == [""]:'.format(self.var_nr+1),
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif "" in v{}:'.format(self.var_nr+1),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                    v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'        else:',
'            if {0} != "/" and {0}[-1] == "/":'.format(ctx.value_or_id()[1].getText()),
'                v{} = {}[:-1]'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'',
'            v{0} = v{0}.split("/")'.format(self.var_nr+1),
'',
'            if v{} == [""]:'.format(self.var_nr+1),
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif v{}[0] == "": # e.g. /wef/we'.format(self.var_nr+1),
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                    v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'                v{}[0] = "/"'.format(self.var_nr+2),
'            elif "" in v{}:'.format(self.var_nr+1),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                    v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'',
'        for v{} in v{}:'.format(self.var_nr+6, self.var_nr+2),
'            if os.path.isfile(v{}):'.format(self.var_nr+6),
'                print("Error: %s is a file - cannot create a directory there" % v{})'.format(self.var_nr+6),
'                quit()',
'            elif not os.path.exists(v{}):'.format(self.var_nr+6),
'                os.mkdir(v{})'.format(self.var_nr+6),
'        shutil.move({}, {})'.format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText()),
'    elif os.path.exists(v{}):'.format(self.var_nr),
'        try:',
'            os.remove(v{})'.format(self.var_nr),
'        except OSError:',
'            shutil.rmtree(v{})'.format(self.var_nr),
'        shutil.move({}, {})'.format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText()),
'    else:',
'        shutil.move({}, {})'.format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText()),
'except PermissionError:',
"""    print("Error: Permission denied to move '%s' to '%s'" % ({}, {}))""".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText()),
'    quit()']

    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.NUM() != None:
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

        ctx.parentCtx.lines = [
'v{} = "%s/%s" % ({}, {}.split("/")[-1])'.format(self.var_nr, ctx.value_or_id()[1].getText(), ctx.value_or_id()[0].getText()),
'try:',
'    if not os.path.exists({}):'.format(ctx.value_or_id()[0].getText()),
'        print("Error: %s doesn\'t exist" % {})'.format(ctx.value_or_id()[0].getText()),
'        quit()',
'    elif not os.path.isdir({}):'.format(ctx.value_or_id()[1].getText()),
'        v{} = {}'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'        v{} = []'.format(self.var_nr+2),
'        if os.name == "nt": # Windows',
'            if {}[-1] == "/":'.format(ctx.value_or_id()[1].getText()),
'                v{} = {}[:-1]'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'',
'            v{} = v{}.split("/")'.format(self.var_nr+3, self.var_nr+1),
'',
'            if v{} == [""]:'.format(self.var_nr+3),
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif "" in v{}:'.format(self.var_nr+3),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                    v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'        else:',
'            if {0} != "/" and {0}[-1] == "/":'.format(ctx.value_or_id()[1].getText()),
'                v{} = {}[:-1]'.format(self.var_nr+1, ctx.value_or_id()[1].getText()),
'',
'            v{} = v{}.split("/")'.format(self.var_nr+3, self.var_nr+1),
'',
'            if v{} == [""]:'.format(self.var_nr+3),
'                print("Error: destination directory cannot be empty")',
'                quit()',
'            elif v{}[0] == "": # e.g. /wef/we'.format(self.var_nr+3),
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                    v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'                v{}[0] = "/"'.format(self.var_nr+2),
'            elif "" in v{}:'.format(self.var_nr+3),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                    v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                    v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'',
'        for v{} in v{}:'.format(self.var_nr+7, self.var_nr+2),
'            if os.path.isfile(v{}):'.format(self.var_nr+7),
'                print("Error: %s is a file - cannot create a directory there" % v{})'.format(self.var_nr+7),
'                quit()',
'            elif not os.path.exists(v{}):'.format(self.var_nr+7),
'                os.mkdir(v{})'.format(self.var_nr+7),
'        if os.path.isfile({}):'.format(ctx.value_or_id()[0].getText()),
'            shutil.copy2({}, v{})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'        else:',
'            shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'    elif os.path.exists(v{}):'.format(self.var_nr),
'        try:',
'            os.remove(v{})'.format(self.var_nr),
'        except OSError:',
'            shutil.rmtree(v{})'.format(self.var_nr),
'        if os.path.isfile({}):'.format(ctx.value_or_id()[0].getText()),
'            shutil.copy2({}, v{})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'        else:',
'            shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'    else:',
'        if os.path.isfile({}):'.format(ctx.value_or_id()[0].getText()),
'            shutil.copy2({}, v{})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'        else:',
'            shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.value_or_id()[0].getText(), self.var_nr+1),
'except PermissionError:',
"""    print("Error: Permission denied to copy '%s' to '%s'" % ({}, {}))""".format(ctx.value_or_id()[0].getText(), ctx.value_or_id()[1].getText()),
'    quit()']


    # Enter a parse tree produced by WordlifyParser#download.
    def enterDownload(self, ctx:WordlifyParser.DownloadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#download.
    def exitDownload(self, ctx:WordlifyParser.DownloadContext):
        for voi in ctx.value_or_id(): # are args of type 'str'?  
            if voi.NUM() != None:
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
        ctx.parentCtx.lines = [
'try:',
'    if {} == "":'.format(ctx.value_or_id()[1].getText()),
'        print("Error: Empty destination file name")',
'        quit()',
'    v{} = {}'.format(self.var_nr+6, ctx.value_or_id()[1].getText()),
'',
'    if os.path.isdir({}):'.format(ctx.value_or_id()[1].getText()),
"""        print("Error: '%s' is a directory" % {})""".format(ctx.value_or_id()[1].getText()),
'        quit()',
'    if "/" in {}: # a (in)valid path'.format(ctx.value_or_id()[1].getText()),
'        v{} = []'.format(self.var_nr+4),
'        v{} = {}'.format(self.var_nr, ctx.value_or_id()[1].getText()),
'        if v{}[-2:] == "//":'.format(self.var_nr),
'            print("Error: invalid path")',
'            quit()',
'        if os.name == "nt":',
"""            if v{}[-1] == "/": # trim unnecessary last '/'""".format(self.var_nr),
'                v{0} = v{0}[:-1]'.format(self.var_nr),
'                v{} = v{}[:-1]'.format(self.var_nr+6, self.var_nr),
'            v{0} = v{0}.split("/")'.format(self.var_nr),
'            del v{}[-1]'.format(self.var_nr),
'',
'            if "" in v{}:'.format(self.var_nr),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+1, self.var_nr),
'                    v{} = v{}[0]'.format(self.var_nr+2, self.var_nr),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+3, self.var_nr+1),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+2, self.var_nr, self.var_nr+3),
'                    v{}.append(v{})'.format(self.var_nr+4, self.var_nr+2),
'        else:',
'            if v{0} != "/" and v{0}[-1] == "/": # trim unnecessary last "/"'.format(self.var_nr),
'                v{0} = v{0}[:-1]'.format(self.var_nr),
'                v{} = v{}[:-1]'.format(self.var_nr+6, self.var_nr),
'            v{0} = v{0}.split("/")'.format(self.var_nr),
'            del v{}[-1]'.format(self.var_nr),
'',
'            if v{}[0] == "":  # if is absolute path'.format(self.var_nr),
'                for v{} in range(0, len(v{})):'.format(self.var_nr+1, self.var_nr),
'                    v{} = ""'.format(self.var_nr+2),
'                    for v{} in range(1, v{} + 1):'.format(self.var_nr+3, self.var_nr+1),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+2, self.var_nr, self.var_nr+3),
'                    v{}.append(v{})'.format(self.var_nr+4, self.var_nr+2),
'                v{}[0] = "/"'.format(self.var_nr+4),
'            elif "" in v{}:'.format(self.var_nr),
'                print("Error: invalid path")',
'                quit()',
'            else:',
'                for v{} in range(0, len(v{})):'.format(self.var_nr+1, self.var_nr),
'                    v{} = v{}[0]'.format(self.var_nr+2, self.var_nr),
'                    for v{} in range(1, v{}+1):'.format(self.var_nr+3, self.var_nr+1),
'                        v{} += "/" + v{}[v{}]'.format(self.var_nr+2, self.var_nr, self.var_nr+3),
'                    v{}.append(v{})'.format(self.var_nr+4, self.var_nr+2),
'',
'        for v{} in v{}:'.format(self.var_nr+5, self.var_nr+4),
'            if os.path.isfile(v{}):'.format(self.var_nr+5),
'                print("Error: %s is a file - cannot create a directory there" % v{})'.format(self.var_nr+5),
'                quit()',
'            elif not os.path.exists(v{}):'.format(self.var_nr+5),
'                os.mkdir(v{})'.format(self.var_nr+5),
'except PermissionError:',
"""    print("Error: Permission denied to download file as '%s'" % v{})""".format(self.var_nr+6),
'    quit()',
'try:',
'    urllib.request.urlretrieve({}, v{})'.format(ctx.value_or_id()[0].getText(), self.var_nr+6),
'except PermissionError:',
"""    print("Error: Permission denied to download file as '%s'" % v{})""".format(self.var_nr+6),
'    quit()',
'except URLError as v{}:'.format(self.var_nr),
'    print("Network error: " + str(v{}))'.format(self.var_nr),
'    quit()']

    # Enter a parse tree produced by WordlifyParser#write.
    def enterWrite(self, ctx:WordlifyParser.WriteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#write.
    def exitWrite(self, ctx:WordlifyParser.WriteContext):
        voi0 = ctx.value_or_id()[0]
        voi1 = ctx.value_or_id()[1]
        if voi0.NUM() != None:
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

        ctx.parentCtx.lines = [
'try:',
'    with open({}, "a") as v{}:'.format(ctx.value_or_id()[0].getText(), self.var_nr),
'        v{}.write(str({}))'.format(self.var_nr, ctx.value_or_id()[1].getText()),
'except PermissionError as v{}:'.format(self.var_nr+1),
'    print("Error: Permission denied to write to file %s" % v{}.filename)'.format(self.var_nr+1),
'    quit()']

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
        if ctx.value_or_id().STR() != None: # is arg of type 'num'?
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
            if voi.NUM() != None:
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
        ctx.parentCtx.lines = [
'try:',
'    os.system({0})'.format(ctx.value_or_id()[0].getText()),
'except PermissionError:',
"    print('Error: Permission denied to execute command %s' % {})".format(ctx.value_or_id()[0].getText()) ,
'    quit()',
'except OSError:',
"    print('Error: System error occured when executing %s' % {})".format(ctx.value_or_id()[0].getText()) ,
'    quit()']
        
    # Enter a parse tree produced by WordlifyParser#get_files.
    def enterGet_files(self, ctx:WordlifyParser.Get_filesContext):
        pass

    # Exit a parse tree produced by WordlifyParser#get_files.
    def exitGet_files(self, ctx:WordlifyParser.Get_filesContext):
        pass


    # Enter a parse tree produced by WordlifyParser#date_modified.
    def enterDate_modified(self, ctx:WordlifyParser.Date_modifiedContext):
        pass

    # Exit a parse tree produced by WordlifyParser#date_modified.
    def exitDate_modified(self, ctx:WordlifyParser.Date_modifiedContext):
        pass


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
            if self.vars[ctx.value_or_id().ID().getText()][0] == "function":
                raise Exception("Line {}, column {}: argument of 'exit' function can't be a function:\n    {}".format(line_nr, col_nr, line))

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

        ctx.parentCtx.lines = [
'try:',
'    with open(str({}), "x"):'.format(ctx.value_or_id().getText()),
'        pass'.format(ctx.value_or_id().getText()),
'except PermissionError as v{}:'.format(self.var_nr),
'    print("Error: Permission denied to write to file %s" % v{}.filename)'.format(self.var_nr),
'    quit()']

    # Enter a parse tree produced by WordlifyParser#value_or_id.
    def enterValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value_or_id.
    def exitValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

del WordlifyParser