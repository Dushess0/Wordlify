// Generated from Wordlify.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WordlifyParser}.
 */
public interface WordlifyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WordlifyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WordlifyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#fn_def}.
	 * @param ctx the parse tree
	 */
	void enterFn_def(WordlifyParser.Fn_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#fn_def}.
	 * @param ctx the parse tree
	 */
	void exitFn_def(WordlifyParser.Fn_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#block_instr}.
	 * @param ctx the parse tree
	 */
	void enterBlock_instr(WordlifyParser.Block_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#block_instr}.
	 * @param ctx the parse tree
	 */
	void exitBlock_instr(WordlifyParser.Block_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(WordlifyParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(WordlifyParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#while_instr}.
	 * @param ctx the parse tree
	 */
	void enterWhile_instr(WordlifyParser.While_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#while_instr}.
	 * @param ctx the parse tree
	 */
	void exitWhile_instr(WordlifyParser.While_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#if_instr}.
	 * @param ctx the parse tree
	 */
	void enterIf_instr(WordlifyParser.If_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#if_instr}.
	 * @param ctx the parse tree
	 */
	void exitIf_instr(WordlifyParser.If_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(WordlifyParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(WordlifyParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(WordlifyParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(WordlifyParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(WordlifyParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(WordlifyParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(WordlifyParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(WordlifyParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(WordlifyParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(WordlifyParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(WordlifyParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(WordlifyParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(WordlifyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(WordlifyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(WordlifyParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(WordlifyParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#fn_call}.
	 * @param ctx the parse tree
	 */
	void enterFn_call(WordlifyParser.Fn_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#fn_call}.
	 * @param ctx the parse tree
	 */
	void exitFn_call(WordlifyParser.Fn_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#atom_instr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_instr(WordlifyParser.Atom_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#atom_instr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_instr(WordlifyParser.Atom_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(WordlifyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(WordlifyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#own_fn_call}.
	 * @param ctx the parse tree
	 */
	void enterOwn_fn_call(WordlifyParser.Own_fn_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#own_fn_call}.
	 * @param ctx the parse tree
	 */
	void exitOwn_fn_call(WordlifyParser.Own_fn_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#exist}.
	 * @param ctx the parse tree
	 */
	void enterExist(WordlifyParser.ExistContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#exist}.
	 * @param ctx the parse tree
	 */
	void exitExist(WordlifyParser.ExistContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#print_instr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_instr(WordlifyParser.Print_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#print_instr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_instr(WordlifyParser.Print_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(WordlifyParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(WordlifyParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(WordlifyParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(WordlifyParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(WordlifyParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(WordlifyParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#copy}.
	 * @param ctx the parse tree
	 */
	void enterCopy(WordlifyParser.CopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#copy}.
	 * @param ctx the parse tree
	 */
	void exitCopy(WordlifyParser.CopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#download}.
	 * @param ctx the parse tree
	 */
	void enterDownload(WordlifyParser.DownloadContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#download}.
	 * @param ctx the parse tree
	 */
	void exitDownload(WordlifyParser.DownloadContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(WordlifyParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(WordlifyParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(WordlifyParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(WordlifyParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#wait_instr}.
	 * @param ctx the parse tree
	 */
	void enterWait_instr(WordlifyParser.Wait_instrContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#wait_instr}.
	 * @param ctx the parse tree
	 */
	void exitWait_instr(WordlifyParser.Wait_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(WordlifyParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(WordlifyParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#get_files}.
	 * @param ctx the parse tree
	 */
	void enterGet_files(WordlifyParser.Get_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#get_files}.
	 * @param ctx the parse tree
	 */
	void exitGet_files(WordlifyParser.Get_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#date_modified}.
	 * @param ctx the parse tree
	 */
	void enterDate_modified(WordlifyParser.Date_modifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#date_modified}.
	 * @param ctx the parse tree
	 */
	void exitDate_modified(WordlifyParser.Date_modifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(WordlifyParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(WordlifyParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(WordlifyParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(WordlifyParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(WordlifyParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(WordlifyParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(WordlifyParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(WordlifyParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordlifyParser#value_or_id}.
	 * @param ctx the parse tree
	 */
	void enterValue_or_id(WordlifyParser.Value_or_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordlifyParser#value_or_id}.
	 * @param ctx the parse tree
	 */
	void exitValue_or_id(WordlifyParser.Value_or_idContext ctx);
}