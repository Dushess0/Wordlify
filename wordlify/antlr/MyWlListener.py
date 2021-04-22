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
    except PermissionError as e:
        print("Error: %s - Permission denied to delete" % e.filename)
        quit()
    except OSError as e:
        print("Error: %s - No such file or directory" % e.filename)
        quit()""".format(ctx.str_or_id().getText()) 

    # Enter a parse tree produced by WordlifyParser#move.
    def enterMove(self, ctx:WordlifyParser.MoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#move.
    def exitMove(self, ctx:WordlifyParser.MoveContext):
        self.add_imps(["import shutil", "import os"])


        if self.vars["file_in_dir_path"]:
            new_var= "file_in_dir_path" + random.randint(0,200)
        else:
            new_var="file_in_dir_path"
        self.vars[new_var]=""
        ctx.parentCtx.text = """{2} = "%s/%s" % ({1}, {0}.split("/")[-1])
if not os.path.exists({0}):
    print("Error: %s doesn't exist" % {0})
    quit()
elif not os.path.isdir({1}):
    dir_parts = {1}
    if os.name == "nt": # Windows
        if {1}[-1] == "/":
            dir_parts = {1}[:-1]
            
        dir_parts = dir_parts.split("/")
        next_paths = []
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    else:
        if {1} != "/" and {1}[-1] == "/":
            dir_parts = {1}[:-1]
            
        dir_parts = dir_parts.split("/")
        next_paths = []
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif dir_parts[0] == "": # e.g. /wef/we
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
            next_paths[0] = "/"
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    
    for part in next_paths:
        if os.path.isfile(part):
            print("Error: %s is a file - cannot create a directory there" % part)
            quit()
        elif not os.path.exists(part):
            os.mkdir(part)
    shutil.move({0}, {1})
elif os.path.exists({2}):
    try:
        os.remove({2})
    except OSError:
        shutil.rmtree({2})
    except PermissionError as e:
        print("Error: %s - Permission denied to delete" {2})
        quit()
    shutil.move({0}, {1})
else:
    shutil.move({0}, {1})""".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText(),self.vars[new_var]) # TODO może być brak uprawnień


    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        self.add_imps(["import shutil", "import os"])

        ctx.parentCtx.text = """file_in_dir_path = "%s/%s" % ({1}, {0}.split("/")[-1])
if not os.path.exists({0}):
    print("Error: %s doesn't exist" % {0})
    quit()
elif not os.path.isdir({1}):
    dir_tmp = {1}
    next_paths = []
    if os.name == "nt": # Windows
        if {1}[-1] == "/":
            dir_tmp = {1}[:-1]
            
        dir_parts = dir_tmp.split("/")
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    else:
        if {1} != "/" and {1}[-1] == "/":
            dir_tmp = {1}[:-1]
            
        dir_parts = dir_tmp.split("/")
        
        if dir_parts == [""]:
            print("Error: destination directory cannot be empty")
            quit()
        elif dir_parts[0] == "": # e.g. /wef/we
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
            next_paths[0] = "/"
        elif "" in dir_parts:
            print("Error: invalid path")
            quit()
        else:
            for i in range(0, len(dir_parts)):
                path = dir_parts[0]
                for j in range(1, i+1):
                    path += "/" + dir_parts[j]
                next_paths.append(path)
    
    for part in next_paths:
        if os.path.isfile(part):
            print("Error: %s is a file - cannot create a directory there" % part)
            quit()
        elif not os.path.exists(part):
            os.mkdir(part)
    if os.path.isfile({0}):
        shutil.copy2({0}, dir_tmp)
    else:
        shutil.copytree({0}, dir_tmp + "/" + {0})
elif os.path.exists(file_in_dir_path):
    try:
        os.remove(file_in_dir_path)
    except OSError:
        shutil.rmtree(file_in_dir_path)
    except PermissionError as e:
        print("Error: - Permission denied to delete")
        quit()
    if os.path.isfile({0}):
        shutil.copy2({0}, dir_tmp)
    else:
        shutil.copytree({0}, dir_tmp + "/" + {0})
else:
    if os.path.isfile({0}):
        shutil.copy2({0}, dir_tmp)
    else:
        shutil.copytree({0}, dir_tmp + "/" + {0})""".format(ctx.str_or_id()[0].getText(), ctx.str_or_id()[1].getText())


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
        pass


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
        pass


    # Enter a parse tree produced by WordlifyParser#execute.
    def enterExecute(self, ctx:WordlifyParser.ExecuteContext):
        pass

    # Exit a parse tree produced by WordlifyParser#execute.
    def exitExecute(self, ctx:WordlifyParser.ExecuteContext):
        pass


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
        pass

    # Enter a parse tree produced by WordlifyParser#str_or_id.
    def enterStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#str_or_id.
    def exitStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        if ctx.ID() != None:
            if ctx.ID().getText() not in self.vars:
                line_nr = ctx.ID().getSymbol().line
                raise Exception("Line {}, column {}: variable {} doesn't exist:\n    {}".format(line_nr, ctx.ID().getSymbol().column, ctx.ID().getText(), self.src_lines[line_nr-1].lstrip()))
del WordlifyParser
