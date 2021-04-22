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
        self.out_str = ""
        self.vars = {}
        self.var_nr = 0

    def add_imps(self, imps):
        for imp in imps:
            if imp not in self.imports:
                self.imports.append(imp)

    # Enter a parse tree produced by WordlifyParser#program.
    def enterProgram(self, ctx:WordlifyParser.ProgramContext):
        pass

    # Exit a parse tree produced by WordlifyParser#program.
    def exitProgram(self, ctx:WordlifyParser.ProgramContext):
        if len(self.imports) != 0:
            for line in self.imports:
                self.output.write(line + "\n")
            self.output.write("\n")
        
        self.output.write(self.out_str)

    # Enter a parse tree produced by WordlifyParser#if_instr.
    def enterIf_instr(self, ctx:WordlifyParser.If_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#if_instr.
    def exitIf_instr(self, ctx:WordlifyParser.If_instrContext):
        pass


    # Enter a parse tree produced by WordlifyParser#if_cond.
    def enterIf_cond(self, ctx:WordlifyParser.If_condContext):
        pass

    # Exit a parse tree produced by WordlifyParser#if_cond.
    def exitIf_cond(self, ctx:WordlifyParser.If_condContext):
        pass


    # Enter a parse tree produced by WordlifyParser#then.
    def enterThen(self, ctx:WordlifyParser.ThenContext):
        pass

    # Exit a parse tree produced by WordlifyParser#then.
    def exitThen(self, ctx:WordlifyParser.ThenContext):
        pass


    # Enter a parse tree produced by WordlifyParser#else_if.
    def enterElse_if(self, ctx:WordlifyParser.Else_ifContext):
        pass

    # Exit a parse tree produced by WordlifyParser#else_if.
    def exitElse_if(self, ctx:WordlifyParser.Else_ifContext):
        pass


    # Enter a parse tree produced by WordlifyParser#else_block.
    def enterElse_block(self, ctx:WordlifyParser.Else_blockContext):
        pass

    # Exit a parse tree produced by WordlifyParser#else_block.
    def exitElse_block(self, ctx:WordlifyParser.Else_blockContext):
        pass


    # Enter a parse tree produced by WordlifyParser#cond.
    def enterCond(self, ctx:WordlifyParser.CondContext):
        pass

    # Exit a parse tree produced by WordlifyParser#cond.
    def exitCond(self, ctx:WordlifyParser.CondContext):
        pass


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
        self.out_str += ctx.text + "\n"

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
        pass


    # Enter a parse tree produced by WordlifyParser#value.
    def enterValue(self, ctx:WordlifyParser.ValueContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value.
    def exitValue(self, ctx:WordlifyParser.ValueContext):
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
        ctx.parentCtx.text = "print({})".format(ctx.str_or_id().getText())

    # Enter a parse tree produced by WordlifyParser#rename.
    def enterRename(self, ctx:WordlifyParser.RenameContext):
        pass

    # Exit a parse tree produced by WordlifyParser#rename.
    def exitRename(self, ctx:WordlifyParser.RenameContext):
        self.add_imps(["import os"])

        ctx.parentCtx.text = "os.rename({}, {})".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText())

    # Enter a parse tree produced by WordlifyParser#remove.
    def enterRemove(self, ctx:WordlifyParser.RemoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#remove.
    def exitRemove(self, ctx:WordlifyParser.RemoveContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.text = """try:
    os.remove({0})
except OSError:
    try:
        shutil.rmtree({0})
    except PermissionError as v{1}:
        print("Error: %s - Permission denied to delete" % v{1}.filename)
        quit()
    except OSError as v{1}:
        print("Error: %s - No such file or directory" % v{1}.filename)
        quit()""".format(ctx.str_or_id().getText(), self.var_nr) 
        # don't delete v{1} because it doesn't exist
    
    # Enter a parse tree produced by WordlifyParser#move.
    def enterMove(self, ctx:WordlifyParser.MoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#move.
    def exitMove(self, ctx:WordlifyParser.MoveContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.text = """v{2} = "%s/%s" % ({1}, {0}.split("/")[-1])
if not os.path.exists({0}):
    print("Error: %s doesn't exist" % {0})
    quit()
elif not os.path.isdir({1}):
    v{3} = {1}
    v{4} = []
    if os.name == "nt": # Windows
        if {1}[-1] == "/":
            v{3} = {1}[:-1]
            
        v{3} = v{3}.split("/")
        
        if v{3} == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif "" in v{3}:
            print("Error: invalid path")
            quit()
        else:
            for v{6} in range(0, len(v{3})):
                v{5} = v{3}[0]
                for v{7} in range(1, v{6}+1):
                    v{5} += "/" + v{3}[v{7}]
                v{4}.append(v{5})
    else:
        if {1} != "/" and {1}[-1] == "/":
            v{3} = {1}[:-1]
            
        v{3} = v{3}.split("/")
        
        if v{3} == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif v{3}[0] == "": # e.g. /wef/we
            for v{6} in range(0, len(v{3})):
                v{5} = v{3}[0]
                for v{7} in range(1, v{6}+1):
                    v{5} += "/" + v{3}[v{7}]
                v{4}.append(v{5})
            v{4}[0] = "/"
        elif "" in v{3}:
            print("Error: invalid path")
            quit()
        else:
            for v{6} in range(0, len(v{3})):
                v{5} = v{3}[0]
                for v{7} in range(1, v{6}+1):
                    v{5} += "/" + v{3}[v{7}]
                v{4}.append(v{5})
    
    for v{8} in v{4}:
        if os.path.isfile(v{8}):
            print("Error: %s is a file - cannot create a directory there" % v{8})
            quit()
        elif not os.path.exists(v{8}):
            os.mkdir(v{8})
    shutil.move({0}, {1})
elif os.path.exists(v{2}):
    try:
        os.remove(v{2})
    except PermissionError as v{9}:
        print("Error: %s - Permission denied to delete" % v{9}.filename)
        quit()
    except OSError:
        shutil.rmtree(v{2})
    shutil.move({0}, {1})
else:
    shutil.move({0}, {1})
del v{2}, v{3}, v{4}, v{5}, v{6}, v{7}, v{8}, v{9}""".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText(), self.var_nr, self.var_nr+1, self.var_nr+2, self.var_nr+3, self.var_nr+4, self.var_nr+5, self.var_nr+6) # TODO może być brak uprawnień


    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.text = """v{2} = "%s/%s" % ({1}, {0}.split("/")[-1])
if not os.path.exists({0}):
    print("Error: %s doesn't exist" % {0})
    quit()
elif not os.path.isdir({1}):
    v{3} = {1}
    v{4} = []
    if os.name == "nt": # Windows
        if {1}[-1] == "/":
            v{3} = {1}[:-1]
            
        v{5} = v{3}.split("/")
        
        if v{5} == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif "" in v{5}:
            print("Error: invalid path")
            quit()
        else:
            for v{6} in range(0, len(v{5})):
                v{8} = v{5}[0]
                for v{7} in range(1, v{6}+1):
                    v{8} += "/" + v{5}[v{7}]
                v{4}.append(v{8})
    else:
        if {1} != "/" and {1}[-1] == "/":
            v{3} = {1}[:-1]
            
        v{5} = v{3}.split("/")
        
        if v{5} == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif v{5}[0] == "": # e.g. /wef/we
            for v{6} in range(0, len(v{5})):
                v{8} = v{5}[0]
                for v{7} in range(1, v{6}+1):
                    v{8} += "/" + v{5}[v{7}]
                v{4}.append(v{8})
            v{4}[0] = "/"
        elif "" in v{5}:
            print("Error: invalid path")
            quit()
        else:
            for v{6} in range(0, len(v{5})):
                v{8} = v{5}[0]
                for v{7} in range(1, v{6}+1):
                    v{8} += "/" + v{5}[v{7}]
                v{4}.append(v{8})
    
    for v{9} in v{4}:
        if os.path.isfile(v{9}):
            print("Error: %s is a file - cannot create a directory there" % v{9})
            quit()
        elif not os.path.exists(v{9}):
            os.mkdir(v{9})
    if os.path.isfile({0}):
        shutil.copy2({0}, v{3})
    else:
        shutil.copytree({0}, v{3} + "/" + {0})
elif os.path.exists(v{2}):
    try:
        os.remove(v{2})
    except PermissionError:
        print("Error: - Permission denied to delete")
        quit()
    except OSError:
        shutil.rmtree(v{2})
    if os.path.isfile({0}):
        shutil.copy2({0}, v{3})
    else:
        shutil.copytree({0}, v{3} + "/" + {0})
else:
    if os.path.isfile({0}):
        shutil.copy2({0}, v{3})
    else:
        shutil.copytree({0}, v{3} + "/" + {0})
del v{2}, v{3}, v{4}, v{5}, v{6}, v{7}, v{8}, v{9}""".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText(), self.var_nr, self.var_nr+1, self.var_nr+2, self.var_nr+3, self.var_nr+4, self.var_nr+5, self.var_nr+6, self.var_nr+7)


    # Enter a parse tree produced by WordlifyParser#download.
    def enterDownload(self, ctx:WordlifyParser.DownloadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#download.
    def exitDownload(self, ctx:WordlifyParser.DownloadContext):
        self.add_imps(["import urllib.request"]) # TODO same checking as in "move", also permissions
        ctx.parentCtx.text = "urllib.request.urlretrieve({}, {})".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText())

    # Enter a parse tree produced by WordlifyParser#write.
    def enterWrite(self, ctx:WordlifyParser.WriteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#write.
    def exitWrite(self, ctx:WordlifyParser.WriteContext):
        ctx.parentCtx.text = """try:
    f = open({0}, "w")
    f.write({1})
except PermissionError as e:
        print("Error: %s - Permission denied to write to file" % e.filename)
        quit()""".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText()) 
        


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
        ctx.parentCtx.text = """time.sleep({0})""".format(ctx.num_or_id().getText()) 


    # Enter a parse tree produced by WordlifyParser#execute.
    def enterExecute(self, ctx:WordlifyParser.ExecuteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#execute.
    def exitExecute(self, ctx:WordlifyParser.ExecuteContext):
        self.add_imps(["import os"])
        ctx.parentCtx.text = """try:
    os.system({0})
except PermissionError as e:
        print("Error: %s - Permission denied to execute command {0})
        quit()
except OSError as e:
        print("Error: %s - System error occured when executing {0})
        quit()""".format(ctx.str_or_id()[0].getText()) 
        


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
        ctx.parentCtx.text = """quit({0})""".format(ctx.value_or_id().getText()) 

    # Enter a parse tree produced by WordlifyParser#str_or_id.
    def enterStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#str_or_id.
    def exitStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        if ctx.ID() != None:
            if ctx.ID().getText() not in self.vars:
                line_nr = ctx.ID().getSymbol().line
                raise Exception("Line {}, column {}: variable {} doesn't exist:\n    {}".format(line_nr, ctx.ID().getSymbol().column, ctx.ID().getText(), self.src_lines[line_nr-1].lstrip()))

    # Enter a parse tree produced by WordlifyParser#value_or_id.
    def enterValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value_or_id.
    def exitValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass
del WordlifyParser
