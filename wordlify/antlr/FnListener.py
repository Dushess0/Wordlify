# Generated from Wordlify.g4 by ANTLR 4.9.2
from antlr4 import *
from WordlifyParser import WordlifyParser
from WordlifyListener import WordlifyListener

# This class defines a complete listener for a parse tree produced by WordlifyParser.
class FnListener(WordlifyListener):
    def __init__(self, src_lines):
        self.functions = {}
        self.src_lines = src_lines

    def getFunctions(self):
        return self.functions

    # Enter a parse tree produced by WordlifyParser#program.
    def enterProgram(self, ctx:WordlifyParser.ProgramContext):
        pass

    # Exit a parse tree produced by WordlifyParser#program.
    def exitProgram(self, ctx:WordlifyParser.ProgramContext):
        pass


    # Enter a parse tree produced by WordlifyParser#fn_def.
    def enterFn_def(self, ctx:WordlifyParser.Fn_defContext):
        pass

    # Exit a parse tree produced by WordlifyParser#fn_def.
    def exitFn_def(self, ctx:WordlifyParser.Fn_defContext):
        if ctx.ID()[0].getText() not in self.functions:
            self.functions[ctx.ID()[0].getText()] = len(ctx.ID()) - 1
        else:
            line_nr = ctx.ID()[0].getSymbol().line
            line = self.src_lines[line_nr-1].lstrip()
            col_nr = ctx.ID()[0].getSymbol().column
            id = ctx.ID()[0].getText()
            raise Exception("Line {}, column {}: function '{}' already exists:\n    {}".format(line_nr, col_nr, id, line))

    # Enter a parse tree produced by WordlifyParser#block_instr.
    def enterBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#block_instr.
    def exitBlock_instr(self, ctx:WordlifyParser.Block_instrContext):
        pass


    # Enter a parse tree produced by WordlifyParser#foreach.
    def enterForeach(self, ctx:WordlifyParser.ForeachContext):
        pass

    # Exit a parse tree produced by WordlifyParser#foreach.
    def exitForeach(self, ctx:WordlifyParser.ForeachContext):
        pass


    # Enter a parse tree produced by WordlifyParser#while_instr.
    def enterWhile_instr(self, ctx:WordlifyParser.While_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#while_instr.
    def exitWhile_instr(self, ctx:WordlifyParser.While_instrContext):
        pass

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
        pass

    # Enter a parse tree produced by WordlifyParser#assign.
    def enterAssign(self, ctx:WordlifyParser.AssignContext):
        pass

    # Exit a parse tree produced by WordlifyParser#assign.
    def exitAssign(self, ctx:WordlifyParser.AssignContext):
        pass


    # Enter a parse tree produced by WordlifyParser#expr.
    def enterExpr(self, ctx:WordlifyParser.ExprContext):
        pass

    # Exit a parse tree produced by WordlifyParser#expr.
    def exitExpr(self, ctx:WordlifyParser.ExprContext):
        pass


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
        pass


    # Enter a parse tree produced by WordlifyParser#rename.
    def enterRename(self, ctx:WordlifyParser.RenameContext):
        pass

    # Exit a parse tree produced by WordlifyParser#rename.
    def exitRename(self, ctx:WordlifyParser.RenameContext):
        pass


    # Enter a parse tree produced by WordlifyParser#remove.
    def enterRemove(self, ctx:WordlifyParser.RemoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#remove.
    def exitRemove(self, ctx:WordlifyParser.RemoveContext):
        pass


    # Enter a parse tree produced by WordlifyParser#move.
    def enterMove(self, ctx:WordlifyParser.MoveContext):
        pass

    # Exit a parse tree produced by WordlifyParser#move.
    def exitMove(self, ctx:WordlifyParser.MoveContext):
        pass


    # Enter a parse tree produced by WordlifyParser#copy.
    def enterCopy(self, ctx:WordlifyParser.CopyContext):
        pass

    # Exit a parse tree produced by WordlifyParser#copy.
    def exitCopy(self, ctx:WordlifyParser.CopyContext):
        pass


    # Enter a parse tree produced by WordlifyParser#download.
    def enterDownload(self, ctx:WordlifyParser.DownloadContext):
        pass

    # Exit a parse tree produced by WordlifyParser#download.
    def exitDownload(self, ctx:WordlifyParser.DownloadContext):
        pass


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

    # Enter a parse tree produced by WordlifyParser#create.
    def enterCreate(self, ctx:WordlifyParser.CreateContext):
        pass

    # Exit a parse tree produced by WordlifyParser#create.
    def exitCreate(self, ctx:WordlifyParser.CreateContext):
        pass


    # Enter a parse tree produced by WordlifyParser#array.
    def enterArray(self, ctx:WordlifyParser.ArrayContext):
        pass

    # Exit a parse tree produced by WordlifyParser#array.
    def exitArray(self, ctx:WordlifyParser.ArrayContext):
        pass


    # Enter a parse tree produced by WordlifyParser#value_or_id.
    def enterValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#value_or_id.
    def exitValue_or_id(self, ctx:WordlifyParser.Value_or_idContext):
        pass



del WordlifyParser