# Generated from Wordlify.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .WordlifyParser import WordlifyParser
else:
    from WordlifyParser import WordlifyParser

# This class defines a complete listener for a parse tree produced by WordlifyParser.
class WordlifyListener(ParseTreeListener):

    # Enter a parse tree produced by WordlifyParser#program.
    def enterProgram(self, ctx:WordlifyParser.ProgramContext):
        pass

    # Exit a parse tree produced by WordlifyParser#program.
    def exitProgram(self, ctx:WordlifyParser.ProgramContext):
        pass


    # Enter a parse tree produced by WordlifyParser#instrs.
    def enterInstrs(self, ctx:WordlifyParser.InstrsContext):
        pass

    # Exit a parse tree produced by WordlifyParser#instrs.
    def exitInstrs(self, ctx:WordlifyParser.InstrsContext):
        pass


    # Enter a parse tree produced by WordlifyParser#instrs_line.
    def enterInstrs_line(self, ctx:WordlifyParser.Instrs_lineContext):
        pass

    # Exit a parse tree produced by WordlifyParser#instrs_line.
    def exitInstrs_line(self, ctx:WordlifyParser.Instrs_lineContext):
        pass


    # Enter a parse tree produced by WordlifyParser#instrs_line_without_last_instr.
    def enterInstrs_line_without_last_instr(self, ctx:WordlifyParser.Instrs_line_without_last_instrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#instrs_line_without_last_instr.
    def exitInstrs_line_without_last_instr(self, ctx:WordlifyParser.Instrs_line_without_last_instrContext):
        pass


    # Enter a parse tree produced by WordlifyParser#instr.
    def enterInstr(self, ctx:WordlifyParser.InstrContext):
        pass

    # Exit a parse tree produced by WordlifyParser#instr.
    def exitInstr(self, ctx:WordlifyParser.InstrContext):
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


    # Enter a parse tree produced by WordlifyParser#exit.
    def enterExit(self, ctx:WordlifyParser.ExitContext):
        pass

    # Exit a parse tree produced by WordlifyParser#exit.
    def exitExit(self, ctx:WordlifyParser.ExitContext):
        pass


    # Enter a parse tree produced by WordlifyParser#nneg_num_or_id.
    def enterNneg_num_or_id(self, ctx:WordlifyParser.Nneg_num_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#nneg_num_or_id.
    def exitNneg_num_or_id(self, ctx:WordlifyParser.Nneg_num_or_idContext):
        pass


    # Enter a parse tree produced by WordlifyParser#nneg_int_or_id.
    def enterNneg_int_or_id(self, ctx:WordlifyParser.Nneg_int_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#nneg_int_or_id.
    def exitNneg_int_or_id(self, ctx:WordlifyParser.Nneg_int_or_idContext):
        pass


    # Enter a parse tree produced by WordlifyParser#str_or_id.
    def enterStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        pass

    # Exit a parse tree produced by WordlifyParser#str_or_id.
    def exitStr_or_id(self, ctx:WordlifyParser.Str_or_idContext):
        pass



del WordlifyParser