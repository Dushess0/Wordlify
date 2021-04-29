import sys
from antlr4 import *
from WordlifyParser import WordlifyParser
from WordlifyListener import WordlifyListener
import random
# This class defines a complete listener for a parse tree produced by WordlifyParser.
class MyWlListener(WordlifyListener):
    def __init__(self, output, src_lines):
        self.output = output
        self.src_lines = src_lines
        self.imports = []
        self.functions = []
        self.vars = {}
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
            self.output.write("\n")

        for line in ctx.lines:
            self.output.write(line + "\n")

    # Enter a parse tree produced by WordlifyParser#fn_def.
    def enterFn_def(self, ctx:WordlifyParser.Fn_defContext):
        ctx.lines = []
        header = "def {}(".format(ctx.ID()[0].getText())

        if len(ctx.ID()) > 1:
            header += ctx.ID()[1].getText()

            for i in range(2, len(ctx.ID())):
                header += ", {}".format(ctx.ID()[i])
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

    # Enter a parse tree produced by WordlifyParser#block_instr.
    def enterBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#block_instr.
    def exitBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass


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
            for line in ctx.lines:
                ctx.parentCtx.lines.append(line)
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
            ctx.text = ctx.comparison().value()[0].getText() + " " + ctx.comparison().CMP_OP().getText() + " " + ctx.comparison().value()[1].getText()
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

    # Enter a parse tree produced by WordlifyParser#bool_fn.
    def enterBool_fn(self, ctx:WordlifyParser.Bool_fnContext):
        pass

    # Exit a parse tree produced by WordlifyParser#bool_fn.
    def exitBool_fn(self, ctx:WordlifyParser.Bool_fnContext):
        pass


    # Enter a parse tree produced by WordlifyParser#return_fn.
    def enterReturn_fn(self, ctx:WordlifyParser.Return_fnContext):
        pass

    # Exit a parse tree produced by WordlifyParser#return_fn.
    def exitReturn_fn(self, ctx:WordlifyParser.Return_fnContext):
        pass


    # Enter a parse tree produced by WordlifyParser#assign.
    def enterAssign(self, ctx:WordlifyParser.AssignContext):
        pass

    # Exit a parse tree produced by WordlifyParser#assign.
    def exitAssign(self, ctx:WordlifyParser.AssignContext):
        if ctx.ID().getText()[0] == "v":
            try:
                nr = ctx.ID().getText()[1:]
                self.var_nr = nr+1
            except ValueError:
                pass

        # TODO return_fn:
        ctx.parentCtx.lines = ["{} = {}".format(ctx.ID().getText(), ctx.value().getText())]
        self.vars[ctx.ID().getText()] = ctx.value().type
        ctx.parentCtx.parentCtx.localVars.append(ctx.ID().getText())

    # Enter a parse tree produced by WordlifyParser#value.
    def enterValue(self, ctx:WordlifyParser.ValueContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value.
    def exitValue(self, ctx:WordlifyParser.ValueContext):
        if ctx.STR() != None:
            ctx.type = "str"
        elif ctx.NUM() != None:
            ctx.type = "num"
        elif ctx.ID() != None:
            id = ctx.ID().getText()
            if id not in self.vars:
                line_nr = ctx.ID().getSymbol().line
                line = self.src_lines[line_nr-1].lstrip()
                col_nr = ctx.ID().getSymbol().column
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            ctx.type = self.vars[id]
        print(self.vars)
        # TODO return_fn

    # Enter a parse tree produced by WordlifyParser#fn_call.
    def enterFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass

    # Exit a parse tree produced by WordlifyParser#fn_call.
    def exitFn_call(self, ctx:WordlifyParser.Fn_callContext):
        pass


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
        ctx.parentCtx.lines = ["print({})".format(ctx.value_or_id().getText())]

    # Enter a parse tree produced by WordlifyParser#rename.
    def enterRename(self, ctx:WordlifyParser.RenameContext):
        pass

    # Exit a parse tree produced by WordlifyParser#rename.
    def exitRename(self, ctx:WordlifyParser.RenameContext):
        self.add_imps(["import os"])

        # TODO
        ctx.parentCtx.lines = [
'try:',
'    os.rename({}, {})'.format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()),
'except Exception as v{}:'.format(self.var_nr),
'    print(str(v{}))'.format(self.var_nr)]

    # Enter a parse tree produced by WordlifyParser#remove.
    def enterRemove(self, ctx:WordlifyParser.RemoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#remove.
    def exitRemove(self, ctx:WordlifyParser.RemoveContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.lines = [
'try:',
'    os.remove({})'.format(ctx.str_or_id().getText()),
'except PermissionError as v{}:'.format(self.var_nr),
'    print("Error: %s - Permission denied to delete" % v{}.filename)'.format(self.var_nr),
'    quit()',
'except OSError:',
'    try:',
'        shutil.rmtree({})'.format(ctx.str_or_id().getText()),
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
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.lines = [
'v{} = "%s/%s" % ({}, {}.split("/")[-1])'.format(self.var_nr, ctx.str_or_id()[1].getText(), ctx.str_or_id()[0].getText()),
'if not os.path.exists({}):'.format(ctx.str_or_id()[0].getText()),
'    print("Error: %s doesn\'t exist" % {})'.format(ctx.str_or_id()[0].getText()),
'    quit()',
'elif not os.path.isdir({}):'.format(ctx.str_or_id()[1].getText()),
'    v{} = {}'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'    v{} = []'.format(self.var_nr+2),
'    if os.name == "nt": # Windows',
'        if {}[-1] == "/":'.format(ctx.str_or_id()[1].getText()),
'            v{} = {}[:-1]'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'',
'        v{0} = v{0}.split("/")'.format(self.var_nr+1),
'',
'        if v{} == [""]:'.format(self.var_nr+1),
'            print("Error: destination directory cannot be empty")',
'            quit()',
'        elif "" in v{}:'.format(self.var_nr+1),
'            print("Error: invalid path")',
'            quit()',
'        else:',
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'    else:',
'        if {0} != "/" and {0}[-1] == "/":'.format(ctx.str_or_id()[1].getText()),
'            v{} = {}[:-1]'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'',
'        v{0} = v{0}.split("/")'.format(self.var_nr+1),
'',
'        if v{} == [""]:'.format(self.var_nr+1),
'            print("Error: destination directory cannot be empty")',
'            quit()',
'        elif v{}[0] == "": # e.g. /wef/we'.format(self.var_nr+1),
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'            v{}[0] = "/"'.format(self.var_nr+2),
'        elif "" in v{}:'.format(self.var_nr+1),
'            print("Error: invalid path")',
'            quit()',
'        else:',
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+1),
'                v{} = v{}[0]'.format(self.var_nr+3, self.var_nr+1),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+3, self.var_nr+1, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+3),
'',
'    for v{} in v{}:'.format(self.var_nr+6, self.var_nr+2),
'        if os.path.isfile(v{}):'.format(self.var_nr+6),
'            print("Error: %s is a file - cannot create a directory there" % v{})'.format(self.var_nr+6),
'            quit()',
'        elif not os.path.exists(v{}):'.format(self.var_nr+6),
'            os.mkdir(v{})'.format(self.var_nr+6),
'    shutil.move({}, {})'.format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()),
'elif os.path.exists(v{}):'.format(self.var_nr),
'    try:',
'        os.remove(v{})'.format(self.var_nr),
'    except PermissionError as v{}:'.format(self.var_nr+7),
'        print("Error: %s - Permission denied to delete" % v{}.filename)'.format(self.var_nr+7),
'        quit()',
'    except OSError:',
'        shutil.rmtree(v{})'.format(self.var_nr),
'    shutil.move({}, {})'.format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()),
'else:',
'    shutil.move({}, {})'.format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()),
'del v{}, v{}, v{}, v{}, v{}, v{}, v{}'.format(self.var_nr, self.var_nr+1, self.var_nr+2, self.var_nr+3, self.var_nr+4, self.var_nr+5, self.var_nr+6)]
    # TODO może być brak uprawnień


    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.lines = [
'v{} = "%s/%s" % ({}, {}.split("/")[-1])'.format(self.var_nr, ctx.str_or_id()[1].getText(), ctx.str_or_id()[0].getText()),
'if not os.path.exists({}):'.format(ctx.str_or_id()[0].getText()),
'    print("Error: %s doesn\'t exist" % {})'.format(ctx.str_or_id()[0].getText()),
'    quit()',
'elif not os.path.isdir({}):'.format(ctx.str_or_id()[1].getText()),
'    v{} = {}'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'    v{} = []'.format(self.var_nr+2),
'    if os.name == "nt": # Windows',
'        if {}[-1] == "/":'.format(ctx.str_or_id()[1].getText()),
'            v{} = {}[:-1]'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'',
'        v{} = v{}.split("/")'.format(self.var_nr+3, self.var_nr+1),
'',
'        if v{} == [""]:'.format(self.var_nr+3),
'            print("Error: destination directory cannot be empty")',
'            quit()',
'        elif "" in v{}:'.format(self.var_nr+3),
'            print("Error: invalid path")',
'            quit()',
'        else:',
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'    else:',
'        if {0} != "/" and {0}[-1] == "/":'.format(ctx.str_or_id()[1].getText()),
'            v{} = {}[:-1]'.format(self.var_nr+1, ctx.str_or_id()[1].getText()),
'',
'        v{} = v{}.split("/")'.format(self.var_nr+3, self.var_nr+1),
'',
'        if v{} == [""]:'.format(self.var_nr+3),
'            print("Error: destination directory cannot be empty")',
'            quit()',
'        elif v{}[0] == "": # e.g. /wef/we'.format(self.var_nr+3),
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'            v{}[0] = "/"'.format(self.var_nr+2),
'        elif "" in v{}:'.format(self.var_nr+3),
'            print("Error: invalid path")',
'            quit()',
'        else:',
'            for v{} in range(0, len(v{})):'.format(self.var_nr+4, self.var_nr+3),
'                v{} = v{}[0]'.format(self.var_nr+6, self.var_nr+3),
'                for v{} in range(1, v{}+1):'.format(self.var_nr+5, self.var_nr+4),
'                    v{} += "/" + v{}[v{}]'.format(self.var_nr+6, self.var_nr+3, self.var_nr+5),
'                v{}.append(v{})'.format(self.var_nr+2, self.var_nr+6),
'',
'    for v{} in v{}:'.format(self.var_nr+7, self.var_nr+2),
'        if os.path.isfile(v{}):'.format(self.var_nr+7),
'            print("Error: %s is a file - cannot create a directory there" % v{})'.format(self.var_nr+7),
'            quit()',
'        elif not os.path.exists(v{}):'.format(self.var_nr+7),
'            os.mkdir(v{})'.format(self.var_nr+7),
'    if os.path.isfile({}):'.format(ctx.str_or_id()[0].getText()),
'        shutil.copy2({}, v{})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'    else:',
'        shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'elif os.path.exists(v{}):'.format(self.var_nr),
'    try:',
'        os.remove(v{})'.format(self.var_nr),
'    except PermissionError as v{}:'.format(self.var_nr+8),
'        print("Error: %s - Permission denied to delete" % v{}.filename)'.format(self.var_nr+8),
'        quit()',
'    except OSError:',
'        shutil.rmtree(v{})'.format(self.var_nr),
'    if os.path.isfile({}):'.format(ctx.str_or_id()[0].getText()),
'        shutil.copy2({}, v{})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'    else:',
'        shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'else:',
'    if os.path.isfile({}):'.format(ctx.str_or_id()[0].getText()),
'        shutil.copy2({}, v{})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'    else:',
'        shutil.copytree({0}, v{1} + "/" + {0})'.format(ctx.str_or_id()[0].getText(), self.var_nr+1),
'del v{}, v{}, v{}, v{}, v{}, v{}, v{}, v{}'.format(self.var_nr, self.var_nr+1, self.var_nr+2, self.var_nr+3, self.var_nr+4, self.var_nr+5, self.var_nr+6, self.var_nr+7)]


    # Enter a parse tree produced by WordlifyParser#download.
    def enterDownload(self, ctx:WordlifyParser.DownloadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#download.
    def exitDownload(self, ctx:WordlifyParser.DownloadContext):
        self.add_imps(["import urllib.request"]) # TODO same checking as in "move", also permissions
        ctx.parentCtx.lines = [
'try:',
'    urllib.request.urlretrieve({}, {})'.format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()),
'except Exception as v{}:'.format(self.var_nr),
'    print(str(v{}))'.format(self.var_nr)]

    # Enter a parse tree produced by WordlifyParser#write.
    def enterWrite(self, ctx:WordlifyParser.WriteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#write.
    def exitWrite(self, ctx:WordlifyParser.WriteContext):
        ctx.parentCtx.lines = [
'try:',
'    f = open({}, "w")'.format(ctx.str_or_id()[0].getText()),
'    f.write({})'.format(ctx.str_or_id()[1].getText()),
'except PermissionError as v{}:'.format(self.var_nr),
'    print("Error: %s - Permission denied to write to file" % v{}.filename)'.format(self.var_nr),
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
        self.add_imps(["import time"])
        ctx.parentCtx.lines = ['time.sleep({})'.format(ctx.num_or_id().getText())]


    # Enter a parse tree produced by WordlifyParser#execute.
    def enterExecute(self, ctx:WordlifyParser.ExecuteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#execute.
    def exitExecute(self, ctx:WordlifyParser.ExecuteContext):
        self.add_imps(["import os"])
        ctx.parentCtx.lines = [
'try:',
'    os.system({0})'.format(ctx.str_or_id()[0].getText()),
'except PermissionError:',
'    print("Error: %s - Permission denied to execute command {0})'.format(ctx.str_or_id()[0].getText()) ,
'    quit()',
'except OSError:',
'    print("Error: %s - System error occured when executing {0})'.format(ctx.str_or_id()[0].getText()) ,
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
        ctx.parentCtx.lines = ['quit({0})'.format(ctx.value_or_id().getText())]

    # Enter a parse tree produced by WordlifyParser#str_or_id.
    def enterStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#str_or_id.
    def exitStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        if ctx.ID() != None:
            line_nr = ctx.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID().getSymbol().column
            id = ctx.ID().getText()
            if id not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            # ID is in self.vars:
            type = self.vars[id]
            if type != "str":
                raise Exception("Line {}, column {}: variable '{}' has type '{}', but 'str' expected:\n    {}".format(line_nr, col_nr, id, type, line))

    # Enter a parse tree produced by WordlifyParser#num_or_id.
    def enterNum_or_id(self, ctx:WordlifyParser.Num_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#num_or_id.
    def exitNum_or_id(self, ctx:WordlifyParser.Num_or_idContext):
        if ctx.ID() != None:
            line_nr = ctx.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID().getSymbol().column
            id = ctx.ID().getText()
            if id not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            # ID is in self.vars:
            type = self.vars[id]
            if type != "num":
                raise Exception("Line {}, column {}: variable '{}' has type '{}', but 'num' expected:\n    {}".format(line_nr, col_nr, id, type, line))

    # Enter a parse tree produced by WordlifyParser#value_or_id.
    def enterValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value_or_id.
    def exitValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        if ctx.ID() != None:
            line_nr = ctx.ID().getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID().getSymbol().column
            id = ctx.ID().getText()
            if id not in self.vars:
                raise Exception("Line {}, column {}: variable '{}' doesn't exist:\n    {}".format(line_nr, col_nr, id, line))
            # ID is in self.vars:
            type = self.vars[id]
            if type != "str" and type != "num":
                raise Exception("Line {}, column {}: variable '{}' has type '{}', but 'str' or 'num' expected:\n    {}".format(line_nr, col_nr, id, type, line))

del WordlifyParser
