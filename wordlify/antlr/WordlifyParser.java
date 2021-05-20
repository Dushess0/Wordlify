// Generated from Wordlify.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WordlifyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FN=8, WHILE=9, 
		FOREACH=10, IN=11, DO=12, IF=13, THEN=14, ELSE=15, BEGIN=16, END=17, EXIST=18, 
		PRINT=19, RENAME=20, REMOVE=21, MOVE=22, COPY=23, DOWNLOAD=24, WRITE=25, 
		WAIT=26, EXECUTE=27, EXIT=28, TIME=29, GET_FILES=30, DATE_MODIFIED=31, 
		FILE=32, FOLDER=33, ARGS=34, SIZE=35, READ=36, CREATE=37, LENGTH=38, APPEND=39, 
		CMP_OP=40, ARITH_OP=41, LOG_OP=42, BOOL=43, STR=44, ID=45, NUM=46, WS=47, 
		NL=48, END_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_fn_def = 1, RULE_block_instr = 2, RULE_foreach = 3, 
		RULE_while_instr = 4, RULE_if_instr = 5, RULE_if_cond = 6, RULE_then = 7, 
		RULE_else_if = 8, RULE_else_block = 9, RULE_cond = 10, RULE_comparison = 11, 
		RULE_double_comparsion = 12, RULE_expr = 13, RULE_arith_expr = 14, RULE_fn_call = 15, 
		RULE_atom_instr = 16, RULE_assign = 17, RULE_array_append = 18, RULE_array_elem = 19, 
		RULE_own_fn_call = 20, RULE_exist = 21, RULE_print_instr = 22, RULE_rename = 23, 
		RULE_remove = 24, RULE_move = 25, RULE_copy = 26, RULE_download = 27, 
		RULE_write = 28, RULE_read = 29, RULE_wait_instr = 30, RULE_execute = 31, 
		RULE_get_files = 32, RULE_date_modified = 33, RULE_size = 34, RULE_exit = 35, 
		RULE_create = 36, RULE_length = 37, RULE_array = 38, RULE_value_or_id = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fn_def", "block_instr", "foreach", "while_instr", "if_instr", 
			"if_cond", "then", "else_if", "else_block", "cond", "comparison", "double_comparsion", 
			"expr", "arith_expr", "fn_call", "atom_instr", "assign", "array_append", 
			"array_elem", "own_fn_call", "exist", "print_instr", "rename", "remove", 
			"move", "copy", "download", "write", "read", "wait_instr", "execute", 
			"get_files", "date_modified", "size", "exit", "create", "length", "array", 
			"value_or_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'['", "']'", "'fn'", "'while'", 
			"'foreach'", "'in'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'end'", 
			"'exist'", "'print'", "'rename'", "'remove'", "'move'", "'copy'", "'download'", 
			"'write'", "'wait'", "'execute'", "'exit'", "'time'", "'getFiles'", "'dateModified'", 
			"'file'", "'folder'", "'args'", "'size'", "'read'", "'create'", "'length'", 
			"'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FN", "WHILE", "FOREACH", 
			"IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", 
			"REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", 
			"TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", 
			"READ", "CREATE", "LENGTH", "APPEND", "CMP_OP", "ARITH_OP", "LOG_OP", 
			"BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Wordlify.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WordlifyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WordlifyParser.EOF, 0); }
		public TerminalNode END_COMMENT() { return getToken(WordlifyParser.END_COMMENT, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public List<Fn_defContext> fn_def() {
			return getRuleContexts(Fn_defContext.class);
		}
		public Fn_defContext fn_def(int i) {
			return getRuleContext(Fn_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN) | (1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(127);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(86);
							atom_instr();
							setState(90);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(87);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(92);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(93);
							match(T__0);
							setState(97);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(94);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(99);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(100);
							atom_instr();
							setState(114); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(104);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(101);
									match(WS);
									}
									}
									setState(106);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(107);
								match(NL);
								setState(111);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(108);
										match(WS);
										}
										} 
									}
									setState(113);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								}
								}
								}
								setState(116); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(120);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case WHILE:
							case FOREACH:
							case IF:
								{
								setState(118);
								block_instr();
								}
								break;
							case FN:
								{
								setState(119);
								fn_def();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(123); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(122);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(125); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(132);
					atom_instr();
					setState(136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(133);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(138);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(139);
						match(T__0);
						}
					}

					}
					break;
				case FN:
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(144);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
					case FOREACH:
					case IF:
						{
						setState(142);
						block_instr();
						}
						break;
					case FN:
						{
						setState(143);
						fn_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_COMMENT) {
				{
				setState(156);
				match(END_COMMENT);
				}
			}

			setState(159);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_defContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(WordlifyParser.FN, 0); }
		public List<TerminalNode> ID() { return getTokens(WordlifyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WordlifyParser.ID, i);
		}
		public TerminalNode BEGIN() { return getToken(WordlifyParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(WordlifyParser.END, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public Fn_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterFn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitFn_def(this);
		}
	}

	public final Fn_defContext fn_def() throws RecognitionException {
		Fn_defContext _localctx = new Fn_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fn_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FN);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(167);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__1);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(181);
				match(ID);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(182);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(188);
					match(T__2);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
					match(ID);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(209);
			match(T__3);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(BEGIN);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(260);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(222);
							atom_instr();
							setState(226);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(223);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(228);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(229);
							match(T__0);
							setState(233);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(230);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(235);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(236);
							atom_instr();
							setState(250); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(240);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(237);
									match(WS);
									}
									}
									setState(242);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(243);
								match(NL);
								setState(247);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(244);
										match(WS);
										}
										} 
									}
									setState(249);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								}
								}
								}
								setState(252); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(254);
							block_instr();
							setState(256); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(255);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(258); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(265);
					atom_instr();
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(266);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(271);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(272);
						match(T__0);
						}
					}

					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(275);
					block_instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(278);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS || _la==NL );
				}
			}

			setState(285);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_instrContext extends ParserRuleContext {
		public If_instrContext if_instr() {
			return getRuleContext(If_instrContext.class,0);
		}
		public While_instrContext while_instr() {
			return getRuleContext(While_instrContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public Block_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterBlock_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitBlock_instr(this);
		}
	}

	public final Block_instrContext block_instr() throws RecognitionException {
		Block_instrContext _localctx = new Block_instrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_instr);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				if_instr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				while_instr();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				foreach();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(WordlifyParser.FOREACH, 0); }
		public List<TerminalNode> ID() { return getTokens(WordlifyParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WordlifyParser.ID, i);
		}
		public TerminalNode IN() { return getToken(WordlifyParser.IN, 0); }
		public TerminalNode DO() { return getToken(WordlifyParser.DO, 0); }
		public TerminalNode END() { return getToken(WordlifyParser.END, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitForeach(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_foreach);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(FOREACH);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(298);
			match(ID);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(304);
			match(IN);
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(310);
			match(ID);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(316);
			match(DO);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(360);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(322);
							atom_instr();
							setState(326);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(323);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(328);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(329);
							match(T__0);
							setState(333);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(330);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(335);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(336);
							atom_instr();
							setState(350); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(340);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(337);
									match(WS);
									}
									}
									setState(342);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(343);
								match(NL);
								setState(347);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(344);
										match(WS);
										}
										} 
									}
									setState(349);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								}
								}
								}
								setState(352); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(354);
							block_instr();
							setState(356); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(355);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(358); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(365);
					atom_instr();
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(366);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(371);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(378);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(372);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(374); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(373);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(376); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS || _la==NL );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(380);
					block_instr();
					setState(382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(381);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(384); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS || _la==NL );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(390);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_instrContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WordlifyParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode DO() { return getToken(WordlifyParser.DO, 0); }
		public TerminalNode END() { return getToken(WordlifyParser.END, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public While_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterWhile_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitWhile_instr(this);
		}
	}

	public final While_instrContext while_instr() throws RecognitionException {
		While_instrContext _localctx = new While_instrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(WHILE);
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(398);
			cond();
			setState(400); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(404);
			match(DO);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(448);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(410);
							atom_instr();
							setState(414);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(411);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(416);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(417);
							match(T__0);
							setState(421);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(418);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(423);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(424);
							atom_instr();
							setState(438); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(428);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(425);
									match(WS);
									}
									}
									setState(430);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(431);
								match(NL);
								setState(435);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(432);
										match(WS);
										}
										} 
									}
									setState(437);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								}
								}
								}
								setState(440); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(442);
							block_instr();
							setState(444); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(443);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(446); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(453);
					atom_instr();
					setState(457);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(454);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(459);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(466);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(460);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(462); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(461);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(464); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS || _la==NL );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(468);
					block_instr();
					setState(470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(469);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(472); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS || _la==NL );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(478);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_instrContext extends ParserRuleContext {
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public TerminalNode END() { return getToken(WordlifyParser.END, 0); }
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterIf_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitIf_instr(this);
		}
	}

	public final If_instrContext if_instr() throws RecognitionException {
		If_instrContext _localctx = new If_instrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			if_cond();
			setState(481);
			then();
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(482);
					else_if();
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(488);
				else_block();
				}
			}

			setState(491);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WordlifyParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterIf_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitIf_cond(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(IF);
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(499);
			cond();
			setState(501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(WordlifyParser.THEN, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitThen(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(THEN);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(549);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(511);
							atom_instr();
							setState(515);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(512);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(517);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(518);
							match(T__0);
							setState(522);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(519);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(524);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(525);
							atom_instr();
							setState(539); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(529);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(526);
									match(WS);
									}
									}
									setState(531);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(532);
								match(NL);
								setState(536);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(533);
										match(WS);
										}
										} 
									}
									setState(538);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								}
								}
								}
								setState(541); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(543);
							block_instr();
							setState(545); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(544);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(547); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(575);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(554);
					atom_instr();
					setState(558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(555);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(560);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					setState(567);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(561);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(563); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(562);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(565); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS || _la==NL );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(569);
					block_instr();
					setState(571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(570);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(573); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS || _la==NL );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WordlifyParser.ELSE, 0); }
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitElse_if(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(ELSE);
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(585);
			if_cond();
			setState(586);
			then();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WordlifyParser.ELSE, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public List<Atom_instrContext> atom_instr() {
			return getRuleContexts(Atom_instrContext.class);
		}
		public Atom_instrContext atom_instr(int i) {
			return getRuleContext(Atom_instrContext.class,i);
		}
		public List<Block_instrContext> block_instr() {
			return getRuleContexts(Block_instrContext.class);
		}
		public Block_instrContext block_instr(int i) {
			return getRuleContext(Block_instrContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(ELSE);
			setState(590); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(589);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(592); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(632);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(594);
							atom_instr();
							setState(598);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(595);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(600);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(601);
							match(T__0);
							setState(605);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(602);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(607);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(608);
							atom_instr();
							setState(622); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(612);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(609);
									match(WS);
									}
									}
									setState(614);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(615);
								match(NL);
								setState(619);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(616);
										match(WS);
										}
										} 
									}
									setState(621);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								}
								}
								}
								setState(624); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(626);
							block_instr();
							setState(628); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(627);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(630); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(636);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(658);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXIST:
				case PRINT:
				case RENAME:
				case REMOVE:
				case MOVE:
				case COPY:
				case DOWNLOAD:
				case WRITE:
				case WAIT:
				case EXECUTE:
				case EXIT:
				case TIME:
				case GET_FILES:
				case DATE_MODIFIED:
				case FILE:
				case FOLDER:
				case ARGS:
				case SIZE:
				case READ:
				case CREATE:
				case ID:
					{
					setState(637);
					atom_instr();
					setState(641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(638);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(643);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(650);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(644);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(646); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(645);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(648); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==WS || _la==NL );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(652);
					block_instr();
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(653);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(656); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS || _la==NL );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public Fn_callContext fn_call() {
			return getRuleContext(Fn_callContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(WordlifyParser.BOOL, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Double_comparsionContext double_comparsion() {
			return getRuleContext(Double_comparsionContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				double_comparsion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CMP_OP() { return getToken(WordlifyParser.CMP_OP, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			expr();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(669);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(CMP_OP);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_comparsionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public TerminalNode LOG_OP() { return getToken(WordlifyParser.LOG_OP, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Double_comparsionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_comparsion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterDouble_comparsion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitDouble_comparsion(this);
		}
	}

	public final Double_comparsionContext double_comparsion() throws RecognitionException {
		Double_comparsionContext _localctx = new Double_comparsionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_double_comparsion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			comparison();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(685);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			match(LOG_OP);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			comparison();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Fn_callContext fn_call() {
			return getRuleContext(Fn_callContext.class,0);
		}
		public TerminalNode STR() { return getToken(WordlifyParser.STR, 0); }
		public TerminalNode NUM() { return getToken(WordlifyParser.NUM, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public Arith_exprContext arith_expr() {
			return getRuleContext(Arith_exprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(703);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
				arith_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(705);
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(706);
				array_elem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_exprContext extends ParserRuleContext {
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public TerminalNode ARITH_OP() { return getToken(WordlifyParser.ARITH_OP, 0); }
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitArith_expr(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			value_or_id();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(716);
			match(ARITH_OP);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(717);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723);
			value_or_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_callContext extends ParserRuleContext {
		public Own_fn_callContext own_fn_call() {
			return getRuleContext(Own_fn_callContext.class,0);
		}
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public Print_instrContext print_instr() {
			return getRuleContext(Print_instrContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public DownloadContext download() {
			return getRuleContext(DownloadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public Wait_instrContext wait_instr() {
			return getRuleContext(Wait_instrContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public Get_filesContext get_files() {
			return getRuleContext(Get_filesContext.class,0);
		}
		public Date_modifiedContext date_modified() {
			return getRuleContext(Date_modifiedContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public TerminalNode TIME() { return getToken(WordlifyParser.TIME, 0); }
		public TerminalNode FILE() { return getToken(WordlifyParser.FILE, 0); }
		public TerminalNode FOLDER() { return getToken(WordlifyParser.FOLDER, 0); }
		public TerminalNode ARGS() { return getToken(WordlifyParser.ARGS, 0); }
		public Fn_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterFn_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitFn_call(this);
		}
	}

	public final Fn_callContext fn_call() throws RecognitionException {
		Fn_callContext _localctx = new Fn_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fn_call);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				own_fn_call();
				}
				break;
			case EXIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				exist();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				print_instr();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				rename();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(729);
				remove();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(730);
				move();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 7);
				{
				setState(731);
				copy();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(732);
				download();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(733);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 10);
				{
				setState(734);
				read();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(735);
				wait_instr();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(736);
				execute();
				}
				break;
			case GET_FILES:
				enterOuterAlt(_localctx, 13);
				{
				setState(737);
				get_files();
				}
				break;
			case DATE_MODIFIED:
				enterOuterAlt(_localctx, 14);
				{
				setState(738);
				date_modified();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 15);
				{
				setState(739);
				size();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 16);
				{
				setState(740);
				exit();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 17);
				{
				setState(741);
				create();
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 18);
				{
				setState(742);
				length();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 19);
				{
				setState(743);
				match(TIME);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 20);
				{
				setState(744);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 21);
				{
				setState(745);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 22);
				{
				setState(746);
				match(ARGS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_instrContext extends ParserRuleContext {
		public Own_fn_callContext own_fn_call() {
			return getRuleContext(Own_fn_callContext.class,0);
		}
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public Print_instrContext print_instr() {
			return getRuleContext(Print_instrContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public CopyContext copy() {
			return getRuleContext(CopyContext.class,0);
		}
		public DownloadContext download() {
			return getRuleContext(DownloadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public Wait_instrContext wait_instr() {
			return getRuleContext(Wait_instrContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public Get_filesContext get_files() {
			return getRuleContext(Get_filesContext.class,0);
		}
		public Date_modifiedContext date_modified() {
			return getRuleContext(Date_modifiedContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public Array_appendContext array_append() {
			return getRuleContext(Array_appendContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode TIME() { return getToken(WordlifyParser.TIME, 0); }
		public TerminalNode FILE() { return getToken(WordlifyParser.FILE, 0); }
		public TerminalNode FOLDER() { return getToken(WordlifyParser.FOLDER, 0); }
		public TerminalNode ARGS() { return getToken(WordlifyParser.ARGS, 0); }
		public Atom_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterAtom_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitAtom_instr(this);
		}
	}

	public final Atom_instrContext atom_instr() throws RecognitionException {
		Atom_instrContext _localctx = new Atom_instrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom_instr);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				own_fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				exist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				print_instr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
				rename();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(753);
				remove();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(754);
				move();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(755);
				copy();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(756);
				download();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(757);
				write();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(758);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(759);
				wait_instr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(760);
				execute();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(761);
				get_files();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(762);
				date_modified();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(763);
				size();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(764);
				exit();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(765);
				create();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(766);
				array_append();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(767);
				assign();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(768);
				match(TIME);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(769);
				match(FILE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(770);
				match(FOLDER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(771);
				match(ARGS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(774);
				match(ID);
				}
				break;
			case 2:
				{
				setState(775);
				array_elem();
				}
				break;
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
			match(T__4);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(785);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(791);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_appendContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public TerminalNode APPEND() { return getToken(WordlifyParser.APPEND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Array_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterArray_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitArray_append(this);
		}
	}

	public final Array_appendContext array_append() throws RecognitionException {
		Array_appendContext _localctx = new Array_appendContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_append);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(ID);
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(794);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800);
			match(APPEND);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(801);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			expr();
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterArray_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitArray_elem(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(ID);
			setState(815);
			match(T__5);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(816);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(822);
			expr();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(823);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Own_fn_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Own_fn_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_own_fn_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterOwn_fn_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitOwn_fn_call(this);
		}
	}

	public final Own_fn_callContext own_fn_call() throws RecognitionException {
		Own_fn_callContext _localctx = new Own_fn_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_own_fn_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(ID);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(832);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838);
			match(T__1);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(839);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(845);
				value_or_id();
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(846);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(852);
					match(T__2);
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(853);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(858);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(859);
					value_or_id();
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(860);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(865);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(873);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistContext extends ParserRuleContext {
		public TerminalNode EXIST() { return getToken(WordlifyParser.EXIST, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitExist(this);
		}
	}

	public final ExistContext exist() throws RecognitionException {
		ExistContext _localctx = new ExistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(EXIST);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(876);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(882);
			match(T__1);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(883);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			value_or_id();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_instrContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(WordlifyParser.PRINT, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Print_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterPrint_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitPrint_instr(this);
		}
	}

	public final Print_instrContext print_instr() throws RecognitionException {
		Print_instrContext _localctx = new Print_instrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(PRINT);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(899);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(905);
			match(T__1);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(906);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(912);
			value_or_id();
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(913);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(919);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(WordlifyParser.RENAME, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitRename(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(RENAME);
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(922);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(928);
			match(T__1);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(929);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			value_or_id();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(936);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(942);
			match(T__2);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(943);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949);
			value_or_id();
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(950);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(956);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(WordlifyParser.REMOVE, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitRemove(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(REMOVE);
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(959);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(965);
			match(T__1);
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(966);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			value_or_id();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(973);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(979);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(WordlifyParser.MOVE, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(MOVE);
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(982);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988);
			match(T__1);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(989);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			value_or_id();
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(996);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
			match(T__2);
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1003);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1009);
			value_or_id();
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1010);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1016);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopyContext extends ParserRuleContext {
		public TerminalNode COPY() { return getToken(WordlifyParser.COPY, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterCopy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitCopy(this);
		}
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(COPY);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1019);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			match(T__1);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1026);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			value_or_id();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1033);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
			match(T__2);
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1040);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046);
			value_or_id();
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1047);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1053);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DownloadContext extends ParserRuleContext {
		public TerminalNode DOWNLOAD() { return getToken(WordlifyParser.DOWNLOAD, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public DownloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_download; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterDownload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitDownload(this);
		}
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_download);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(DOWNLOAD);
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1056);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1062);
			match(T__1);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1063);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1069);
			value_or_id();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1070);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1076);
			match(T__2);
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1083);
			value_or_id();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1084);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(WordlifyParser.WRITE, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(WRITE);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1093);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1099);
			match(T__1);
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1100);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1106);
			value_or_id();
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1107);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1113);
			match(T__2);
			setState(1117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1114);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1120);
			value_or_id();
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1121);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(WordlifyParser.READ, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(READ);
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1136);
			match(T__1);
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1137);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1143);
			value_or_id();
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1144);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1150);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wait_instrContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(WordlifyParser.WAIT, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Wait_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterWait_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitWait_instr(this);
		}
	}

	public final Wait_instrContext wait_instr() throws RecognitionException {
		Wait_instrContext _localctx = new Wait_instrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_wait_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(WAIT);
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1153);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
			match(T__1);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1160);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1166);
			value_or_id();
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1167);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1173);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(WordlifyParser.EXECUTE, 0); }
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitExecute(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(EXECUTE);
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1176);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1182);
			match(T__1);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1183);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1189);
					value_or_id();
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1190);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1195);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1196);
					match(T__2);
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1197);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1208);
			value_or_id();
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1209);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1215);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_filesContext extends ParserRuleContext {
		public TerminalNode GET_FILES() { return getToken(WordlifyParser.GET_FILES, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Get_filesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_files; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterGet_files(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitGet_files(this);
		}
	}

	public final Get_filesContext get_files() throws RecognitionException {
		Get_filesContext _localctx = new Get_filesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_get_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(GET_FILES);
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1218);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1224);
			match(T__1);
			setState(1228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1225);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1231);
			value_or_id();
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1232);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1238);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_modifiedContext extends ParserRuleContext {
		public TerminalNode DATE_MODIFIED() { return getToken(WordlifyParser.DATE_MODIFIED, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public Date_modifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_modified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterDate_modified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitDate_modified(this);
		}
	}

	public final Date_modifiedContext date_modified() throws RecognitionException {
		Date_modifiedContext _localctx = new Date_modifiedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_date_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(DATE_MODIFIED);
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1241);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			match(T__1);
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1248);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1254);
			value_or_id();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1255);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1261);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(WordlifyParser.SIZE, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(SIZE);
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1264);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1270);
			match(T__1);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1271);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1277);
			value_or_id();
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1278);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1284);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(WordlifyParser.EXIT, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(EXIT);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1287);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1293);
			match(T__1);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1294);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1300);
			value_or_id();
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1301);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1307);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(WordlifyParser.CREATE, 0); }
		public Value_or_idContext value_or_id() {
			return getRuleContext(Value_or_idContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitCreate(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(CREATE);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1310);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1316);
			match(T__1);
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1317);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1323);
			value_or_id();
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1324);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1330);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(WordlifyParser.LENGTH, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(LENGTH);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1333);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1339);
			match(T__1);
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1340);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1346);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(1347);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1350);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1356);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(T__5);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1359);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(1365);
				value_or_id();
				setState(1382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1369);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS || _la==NL) {
							{
							{
							setState(1366);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(1371);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1372);
						match(T__2);
						setState(1376);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS || _la==NL) {
							{
							{
							setState(1373);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(1378);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1379);
						value_or_id();
						}
						} 
					}
					setState(1384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(1385);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1393);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_or_idContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(WordlifyParser.NUM, 0); }
		public TerminalNode STR() { return getToken(WordlifyParser.STR, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(WordlifyParser.BOOL, 0); }
		public Value_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_or_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).enterValue_or_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordlifyListener ) ((WordlifyListener)listener).exitValue_or_id(this);
		}
	}

	public final Value_or_idContext value_or_id() throws RecognitionException {
		Value_or_idContext _localctx = new Value_or_idContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0578\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\7\2b\n\2\f\2\16"+
		"\2e\13\2\3\2\3\2\7\2i\n\2\f\2\16\2l\13\2\3\2\3\2\7\2p\n\2\f\2\16\2s\13"+
		"\2\6\2u\n\2\r\2\16\2v\3\2\3\2\5\2{\n\2\3\2\6\2~\n\2\r\2\16\2\177\7\2\u0082"+
		"\n\2\f\2\16\2\u0085\13\2\3\2\3\2\7\2\u0089\n\2\f\2\16\2\u008c\13\2\3\2"+
		"\5\2\u008f\n\2\3\2\3\2\5\2\u0093\n\2\5\2\u0095\n\2\5\2\u0097\n\2\3\2\7"+
		"\2\u009a\n\2\f\2\16\2\u009d\13\2\3\2\5\2\u00a0\n\2\3\2\3\2\3\3\3\3\6\3"+
		"\u00a6\n\3\r\3\16\3\u00a7\3\3\3\3\7\3\u00ac\n\3\f\3\16\3\u00af\13\3\3"+
		"\3\3\3\7\3\u00b3\n\3\f\3\16\3\u00b6\13\3\3\3\3\3\7\3\u00ba\n\3\f\3\16"+
		"\3\u00bd\13\3\3\3\3\3\7\3\u00c1\n\3\f\3\16\3\u00c4\13\3\3\3\3\3\7\3\u00c8"+
		"\n\3\f\3\16\3\u00cb\13\3\7\3\u00cd\n\3\f\3\16\3\u00d0\13\3\5\3\u00d2\n"+
		"\3\3\3\3\3\7\3\u00d6\n\3\f\3\16\3\u00d9\13\3\3\3\3\3\6\3\u00dd\n\3\r\3"+
		"\16\3\u00de\3\3\3\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\3\3\3\7\3\u00ea"+
		"\n\3\f\3\16\3\u00ed\13\3\3\3\3\3\7\3\u00f1\n\3\f\3\16\3\u00f4\13\3\3\3"+
		"\3\3\7\3\u00f8\n\3\f\3\16\3\u00fb\13\3\6\3\u00fd\n\3\r\3\16\3\u00fe\3"+
		"\3\3\3\6\3\u0103\n\3\r\3\16\3\u0104\7\3\u0107\n\3\f\3\16\3\u010a\13\3"+
		"\3\3\3\3\7\3\u010e\n\3\f\3\16\3\u0111\13\3\3\3\5\3\u0114\n\3\3\3\5\3\u0117"+
		"\n\3\3\3\6\3\u011a\n\3\r\3\16\3\u011b\5\3\u011e\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4\u0125\n\4\3\5\3\5\6\5\u0129\n\5\r\5\16\5\u012a\3\5\3\5\6\5\u012f"+
		"\n\5\r\5\16\5\u0130\3\5\3\5\6\5\u0135\n\5\r\5\16\5\u0136\3\5\3\5\6\5\u013b"+
		"\n\5\r\5\16\5\u013c\3\5\3\5\6\5\u0141\n\5\r\5\16\5\u0142\3\5\3\5\7\5\u0147"+
		"\n\5\f\5\16\5\u014a\13\5\3\5\3\5\7\5\u014e\n\5\f\5\16\5\u0151\13\5\3\5"+
		"\3\5\7\5\u0155\n\5\f\5\16\5\u0158\13\5\3\5\3\5\7\5\u015c\n\5\f\5\16\5"+
		"\u015f\13\5\6\5\u0161\n\5\r\5\16\5\u0162\3\5\3\5\6\5\u0167\n\5\r\5\16"+
		"\5\u0168\7\5\u016b\n\5\f\5\16\5\u016e\13\5\3\5\3\5\7\5\u0172\n\5\f\5\16"+
		"\5\u0175\13\5\3\5\3\5\6\5\u0179\n\5\r\5\16\5\u017a\5\5\u017d\n\5\3\5\3"+
		"\5\6\5\u0181\n\5\r\5\16\5\u0182\5\5\u0185\n\5\5\5\u0187\n\5\3\5\3\5\3"+
		"\6\3\6\6\6\u018d\n\6\r\6\16\6\u018e\3\6\3\6\6\6\u0193\n\6\r\6\16\6\u0194"+
		"\3\6\3\6\6\6\u0199\n\6\r\6\16\6\u019a\3\6\3\6\7\6\u019f\n\6\f\6\16\6\u01a2"+
		"\13\6\3\6\3\6\7\6\u01a6\n\6\f\6\16\6\u01a9\13\6\3\6\3\6\7\6\u01ad\n\6"+
		"\f\6\16\6\u01b0\13\6\3\6\3\6\7\6\u01b4\n\6\f\6\16\6\u01b7\13\6\6\6\u01b9"+
		"\n\6\r\6\16\6\u01ba\3\6\3\6\6\6\u01bf\n\6\r\6\16\6\u01c0\7\6\u01c3\n\6"+
		"\f\6\16\6\u01c6\13\6\3\6\3\6\7\6\u01ca\n\6\f\6\16\6\u01cd\13\6\3\6\3\6"+
		"\6\6\u01d1\n\6\r\6\16\6\u01d2\5\6\u01d5\n\6\3\6\3\6\6\6\u01d9\n\6\r\6"+
		"\16\6\u01da\5\6\u01dd\n\6\5\6\u01df\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u01e6"+
		"\n\7\f\7\16\7\u01e9\13\7\3\7\5\7\u01ec\n\7\3\7\3\7\3\b\3\b\6\b\u01f2\n"+
		"\b\r\b\16\b\u01f3\3\b\3\b\6\b\u01f8\n\b\r\b\16\b\u01f9\3\t\3\t\6\t\u01fe"+
		"\n\t\r\t\16\t\u01ff\3\t\3\t\7\t\u0204\n\t\f\t\16\t\u0207\13\t\3\t\3\t"+
		"\7\t\u020b\n\t\f\t\16\t\u020e\13\t\3\t\3\t\7\t\u0212\n\t\f\t\16\t\u0215"+
		"\13\t\3\t\3\t\7\t\u0219\n\t\f\t\16\t\u021c\13\t\6\t\u021e\n\t\r\t\16\t"+
		"\u021f\3\t\3\t\6\t\u0224\n\t\r\t\16\t\u0225\7\t\u0228\n\t\f\t\16\t\u022b"+
		"\13\t\3\t\3\t\7\t\u022f\n\t\f\t\16\t\u0232\13\t\3\t\3\t\6\t\u0236\n\t"+
		"\r\t\16\t\u0237\5\t\u023a\n\t\3\t\3\t\6\t\u023e\n\t\r\t\16\t\u023f\5\t"+
		"\u0242\n\t\5\t\u0244\n\t\3\n\3\n\6\n\u0248\n\n\r\n\16\n\u0249\3\n\3\n"+
		"\3\n\3\13\3\13\6\13\u0251\n\13\r\13\16\13\u0252\3\13\3\13\7\13\u0257\n"+
		"\13\f\13\16\13\u025a\13\13\3\13\3\13\7\13\u025e\n\13\f\13\16\13\u0261"+
		"\13\13\3\13\3\13\7\13\u0265\n\13\f\13\16\13\u0268\13\13\3\13\3\13\7\13"+
		"\u026c\n\13\f\13\16\13\u026f\13\13\6\13\u0271\n\13\r\13\16\13\u0272\3"+
		"\13\3\13\6\13\u0277\n\13\r\13\16\13\u0278\7\13\u027b\n\13\f\13\16\13\u027e"+
		"\13\13\3\13\3\13\7\13\u0282\n\13\f\13\16\13\u0285\13\13\3\13\3\13\6\13"+
		"\u0289\n\13\r\13\16\13\u028a\5\13\u028d\n\13\3\13\3\13\6\13\u0291\n\13"+
		"\r\13\16\13\u0292\5\13\u0295\n\13\5\13\u0297\n\13\3\f\3\f\3\f\3\f\5\f"+
		"\u029d\n\f\3\r\3\r\7\r\u02a1\n\r\f\r\16\r\u02a4\13\r\3\r\3\r\7\r\u02a8"+
		"\n\r\f\r\16\r\u02ab\13\r\3\r\3\r\3\16\3\16\7\16\u02b1\n\16\f\16\16\16"+
		"\u02b4\13\16\3\16\3\16\7\16\u02b8\n\16\f\16\16\16\u02bb\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02c6\n\17\3\20\3\20\7\20\u02ca"+
		"\n\20\f\20\16\20\u02cd\13\20\3\20\3\20\7\20\u02d1\n\20\f\20\16\20\u02d4"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u02ee\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0307\n\22\3\23\3\23"+
		"\5\23\u030b\n\23\3\23\7\23\u030e\n\23\f\23\16\23\u0311\13\23\3\23\3\23"+
		"\7\23\u0315\n\23\f\23\16\23\u0318\13\23\3\23\3\23\3\24\3\24\7\24\u031e"+
		"\n\24\f\24\16\24\u0321\13\24\3\24\3\24\7\24\u0325\n\24\f\24\16\24\u0328"+
		"\13\24\3\24\3\24\7\24\u032c\n\24\f\24\16\24\u032f\13\24\3\25\3\25\3\25"+
		"\7\25\u0334\n\25\f\25\16\25\u0337\13\25\3\25\3\25\7\25\u033b\n\25\f\25"+
		"\16\25\u033e\13\25\3\25\3\25\3\26\3\26\7\26\u0344\n\26\f\26\16\26\u0347"+
		"\13\26\3\26\3\26\7\26\u034b\n\26\f\26\16\26\u034e\13\26\3\26\3\26\7\26"+
		"\u0352\n\26\f\26\16\26\u0355\13\26\3\26\3\26\7\26\u0359\n\26\f\26\16\26"+
		"\u035c\13\26\3\26\3\26\7\26\u0360\n\26\f\26\16\26\u0363\13\26\7\26\u0365"+
		"\n\26\f\26\16\26\u0368\13\26\5\26\u036a\n\26\3\26\3\26\3\27\3\27\7\27"+
		"\u0370\n\27\f\27\16\27\u0373\13\27\3\27\3\27\7\27\u0377\n\27\f\27\16\27"+
		"\u037a\13\27\3\27\3\27\7\27\u037e\n\27\f\27\16\27\u0381\13\27\3\27\3\27"+
		"\3\30\3\30\7\30\u0387\n\30\f\30\16\30\u038a\13\30\3\30\3\30\7\30\u038e"+
		"\n\30\f\30\16\30\u0391\13\30\3\30\3\30\7\30\u0395\n\30\f\30\16\30\u0398"+
		"\13\30\3\30\3\30\3\31\3\31\7\31\u039e\n\31\f\31\16\31\u03a1\13\31\3\31"+
		"\3\31\7\31\u03a5\n\31\f\31\16\31\u03a8\13\31\3\31\3\31\7\31\u03ac\n\31"+
		"\f\31\16\31\u03af\13\31\3\31\3\31\7\31\u03b3\n\31\f\31\16\31\u03b6\13"+
		"\31\3\31\3\31\7\31\u03ba\n\31\f\31\16\31\u03bd\13\31\3\31\3\31\3\32\3"+
		"\32\7\32\u03c3\n\32\f\32\16\32\u03c6\13\32\3\32\3\32\7\32\u03ca\n\32\f"+
		"\32\16\32\u03cd\13\32\3\32\3\32\7\32\u03d1\n\32\f\32\16\32\u03d4\13\32"+
		"\3\32\3\32\3\33\3\33\7\33\u03da\n\33\f\33\16\33\u03dd\13\33\3\33\3\33"+
		"\7\33\u03e1\n\33\f\33\16\33\u03e4\13\33\3\33\3\33\7\33\u03e8\n\33\f\33"+
		"\16\33\u03eb\13\33\3\33\3\33\7\33\u03ef\n\33\f\33\16\33\u03f2\13\33\3"+
		"\33\3\33\7\33\u03f6\n\33\f\33\16\33\u03f9\13\33\3\33\3\33\3\34\3\34\7"+
		"\34\u03ff\n\34\f\34\16\34\u0402\13\34\3\34\3\34\7\34\u0406\n\34\f\34\16"+
		"\34\u0409\13\34\3\34\3\34\7\34\u040d\n\34\f\34\16\34\u0410\13\34\3\34"+
		"\3\34\7\34\u0414\n\34\f\34\16\34\u0417\13\34\3\34\3\34\7\34\u041b\n\34"+
		"\f\34\16\34\u041e\13\34\3\34\3\34\3\35\3\35\7\35\u0424\n\35\f\35\16\35"+
		"\u0427\13\35\3\35\3\35\7\35\u042b\n\35\f\35\16\35\u042e\13\35\3\35\3\35"+
		"\7\35\u0432\n\35\f\35\16\35\u0435\13\35\3\35\3\35\7\35\u0439\n\35\f\35"+
		"\16\35\u043c\13\35\3\35\3\35\7\35\u0440\n\35\f\35\16\35\u0443\13\35\3"+
		"\35\3\35\3\36\3\36\7\36\u0449\n\36\f\36\16\36\u044c\13\36\3\36\3\36\7"+
		"\36\u0450\n\36\f\36\16\36\u0453\13\36\3\36\3\36\7\36\u0457\n\36\f\36\16"+
		"\36\u045a\13\36\3\36\3\36\7\36\u045e\n\36\f\36\16\36\u0461\13\36\3\36"+
		"\3\36\7\36\u0465\n\36\f\36\16\36\u0468\13\36\3\36\3\36\3\37\3\37\7\37"+
		"\u046e\n\37\f\37\16\37\u0471\13\37\3\37\3\37\7\37\u0475\n\37\f\37\16\37"+
		"\u0478\13\37\3\37\3\37\7\37\u047c\n\37\f\37\16\37\u047f\13\37\3\37\3\37"+
		"\3 \3 \7 \u0485\n \f \16 \u0488\13 \3 \3 \7 \u048c\n \f \16 \u048f\13"+
		" \3 \3 \7 \u0493\n \f \16 \u0496\13 \3 \3 \3!\3!\7!\u049c\n!\f!\16!\u049f"+
		"\13!\3!\3!\7!\u04a3\n!\f!\16!\u04a6\13!\3!\3!\7!\u04aa\n!\f!\16!\u04ad"+
		"\13!\3!\3!\7!\u04b1\n!\f!\16!\u04b4\13!\7!\u04b6\n!\f!\16!\u04b9\13!\3"+
		"!\3!\7!\u04bd\n!\f!\16!\u04c0\13!\3!\3!\3\"\3\"\7\"\u04c6\n\"\f\"\16\""+
		"\u04c9\13\"\3\"\3\"\7\"\u04cd\n\"\f\"\16\"\u04d0\13\"\3\"\3\"\7\"\u04d4"+
		"\n\"\f\"\16\"\u04d7\13\"\3\"\3\"\3#\3#\7#\u04dd\n#\f#\16#\u04e0\13#\3"+
		"#\3#\7#\u04e4\n#\f#\16#\u04e7\13#\3#\3#\7#\u04eb\n#\f#\16#\u04ee\13#\3"+
		"#\3#\3$\3$\7$\u04f4\n$\f$\16$\u04f7\13$\3$\3$\7$\u04fb\n$\f$\16$\u04fe"+
		"\13$\3$\3$\7$\u0502\n$\f$\16$\u0505\13$\3$\3$\3%\3%\7%\u050b\n%\f%\16"+
		"%\u050e\13%\3%\3%\7%\u0512\n%\f%\16%\u0515\13%\3%\3%\7%\u0519\n%\f%\16"+
		"%\u051c\13%\3%\3%\3&\3&\7&\u0522\n&\f&\16&\u0525\13&\3&\3&\7&\u0529\n"+
		"&\f&\16&\u052c\13&\3&\3&\7&\u0530\n&\f&\16&\u0533\13&\3&\3&\3\'\3\'\7"+
		"\'\u0539\n\'\f\'\16\'\u053c\13\'\3\'\3\'\7\'\u0540\n\'\f\'\16\'\u0543"+
		"\13\'\3\'\3\'\5\'\u0547\n\'\3\'\7\'\u054a\n\'\f\'\16\'\u054d\13\'\3\'"+
		"\3\'\3(\3(\7(\u0553\n(\f(\16(\u0556\13(\3(\3(\7(\u055a\n(\f(\16(\u055d"+
		"\13(\3(\3(\7(\u0561\n(\f(\16(\u0564\13(\3(\7(\u0567\n(\f(\16(\u056a\13"+
		"(\3(\7(\u056d\n(\f(\16(\u0570\13(\5(\u0572\n(\3(\3(\3)\3)\3)\2\2*\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"\2\4\3\2\61\62\3\2-\60\2\u0656\2U\3\2\2\2\4\u00a3\3\2\2\2\6\u0124\3\2"+
		"\2\2\b\u0126\3\2\2\2\n\u018a\3\2\2\2\f\u01e2\3\2\2\2\16\u01ef\3\2\2\2"+
		"\20\u01fb\3\2\2\2\22\u0245\3\2\2\2\24\u024e\3\2\2\2\26\u029c\3\2\2\2\30"+
		"\u029e\3\2\2\2\32\u02ae\3\2\2\2\34\u02c5\3\2\2\2\36\u02c7\3\2\2\2 \u02ed"+
		"\3\2\2\2\"\u0306\3\2\2\2$\u030a\3\2\2\2&\u031b\3\2\2\2(\u0330\3\2\2\2"+
		"*\u0341\3\2\2\2,\u036d\3\2\2\2.\u0384\3\2\2\2\60\u039b\3\2\2\2\62\u03c0"+
		"\3\2\2\2\64\u03d7\3\2\2\2\66\u03fc\3\2\2\28\u0421\3\2\2\2:\u0446\3\2\2"+
		"\2<\u046b\3\2\2\2>\u0482\3\2\2\2@\u0499\3\2\2\2B\u04c3\3\2\2\2D\u04da"+
		"\3\2\2\2F\u04f1\3\2\2\2H\u0508\3\2\2\2J\u051f\3\2\2\2L\u0536\3\2\2\2N"+
		"\u0550\3\2\2\2P\u0575\3\2\2\2RT\t\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2V\u0096\3\2\2\2WU\3\2\2\2X\\\5\"\22\2Y[\t\2\2\2ZY\3\2\2\2[^"+
		"\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_c\7\3\2\2`b\t\2\2"+
		"\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\u0082\3\2\2\2ec\3\2\2\2ft"+
		"\5\"\22\2gi\7\61\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"lj\3\2\2\2mq\7\62\2\2np\7\61\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2tj\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u0082"+
		"\3\2\2\2x{\5\6\4\2y{\5\4\3\2zx\3\2\2\2zy\3\2\2\2{}\3\2\2\2|~\t\2\2\2}"+
		"|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2"+
		"\2\2\u0081X\3\2\2\2\u0081f\3\2\2\2\u0081z\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0094\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u008a\5\"\22\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\3\2\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0095\3\2\2\2\u0090\u0093\5\6\4\2\u0091\u0093\5\4"+
		"\3\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0086\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0083\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u009b\3\2\2\2\u0098\u009a\t\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\7\63\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\2"+
		"\2\3\u00a2\3\3\2\2\2\u00a3\u00a5\7\n\2\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ad\7/\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b4\7\4\2\2\u00b1\u00b3\t\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00d1\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bb\7/"+
		"\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ce\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c2\7\5\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7/\2\2\u00c6\u00c8\t\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00be\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00b7\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d7\7\6\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7\22\2\2\u00db\u00dd\t"+
		"\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u011d\3\2\2\2\u00e0\u00e4\5\"\22\2\u00e1\u00e3\t"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00eb\7\3"+
		"\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u0107\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00fc\5\"\22\2\u00ef\u00f1\7\61\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\7\62\2\2\u00f6\u00f8\7\61\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0107\3\2"+
		"\2\2\u0100\u0102\5\6\4\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u00e0\3\2\2\2\u0106\u00ee\3\2\2\2\u0106\u0100\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0116\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010f\5\"\22\2\u010c\u010e\t\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7\3\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0117\5\6"+
		"\4\2\u0116\u010b\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u011a\t\2\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0108\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\23\2\2\u0120\5\3\2\2"+
		"\2\u0121\u0125\5\f\7\2\u0122\u0125\5\n\6\2\u0123\u0125\5\b\5\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\7\3\2\2\2\u0126"+
		"\u0128\7\f\2\2\u0127\u0129\t\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\7/\2\2\u012d\u012f\t\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\7\r\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\7/\2\2\u0139\u013b\t\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\7\16\2\2\u013f\u0141\t\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0186\3\2\2\2\u0144"+
		"\u0148\5\"\22\2\u0145\u0147\t\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014f\7\3\2\2\u014c\u014e\t\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u016b\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0160\5\"\22\2\u0153\u0155\7"+
		"\61\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015d\7\62"+
		"\2\2\u015a\u015c\7\61\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0156\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0166\5\6\4\2\u0165\u0167\t\2"+
		"\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0144\3\2\2\2\u016a\u0152\3\2"+
		"\2\2\u016a\u0164\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u0184\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0173\5\""+
		"\22\2\u0170\u0172\t\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u017c\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u017d\7\3\2\2\u0177\u0179\t\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u0176\3\2\2\2\u017c\u0178\3\2\2\2\u017d\u0185\3\2\2\2\u017e"+
		"\u0180\5\6\4\2\u017f\u0181\t\2\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u016f\3\2\2\2\u0184\u017e\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u016c\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\23\2\2\u0189"+
		"\t\3\2\2\2\u018a\u018c\7\13\2\2\u018b\u018d\t\2\2\2\u018c\u018b\3\2\2"+
		"\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0192\5\26\f\2\u0191\u0193\t\2\2\2\u0192\u0191\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0198\7\16\2\2\u0197\u0199\t\2\2\2\u0198\u0197\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01de"+
		"\3\2\2\2\u019c\u01a0\5\"\22\2\u019d\u019f\t\2\2\2\u019e\u019d\3\2\2\2"+
		"\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a7\7\3\2\2\u01a4\u01a6\t\2\2\2\u01a5"+
		"\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01c3\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01b8\5\"\22\2\u01ab"+
		"\u01ad\7\61\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3"+
		"\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b5\7\62\2\2\u01b2\u01b4\7\61\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3"+
		"\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01ae\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c3\3\2\2\2\u01bc\u01be\5\6\4\2\u01bd"+
		"\u01bf\t\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u019c\3\2\2\2\u01c2"+
		"\u01aa\3\2\2\2\u01c2\u01bc\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01dc\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01cb\5\"\22\2\u01c8\u01ca\t\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3"+
		"\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d4\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d5\7\3\2\2\u01cf\u01d1\t\2\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d5\u01dd\3\2"+
		"\2\2\u01d6\u01d8\5\6\4\2\u01d7\u01d9\t\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01c7\3\2\2\2\u01dc\u01d6\3\2\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01c4\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\23"+
		"\2\2\u01e1\13\3\2\2\2\u01e2\u01e3\5\16\b\2\u01e3\u01e7\5\20\t\2\u01e4"+
		"\u01e6\5\22\n\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3"+
		"\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01ec\5\24\13\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3"+
		"\2\2\2\u01ed\u01ee\7\23\2\2\u01ee\r\3\2\2\2\u01ef\u01f1\7\17\2\2\u01f0"+
		"\u01f2\t\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\5\26\f\2\u01f6"+
		"\u01f8\t\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\17\3\2\2\2\u01fb\u01fd\7\20\2\2\u01fc\u01fe"+
		"\t\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0243\3\2\2\2\u0201\u0205\5\"\22\2\u0202\u0204\t"+
		"\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020c\7\3"+
		"\2\2\u0209\u020b\t\2\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0228\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u021d\5\"\22\2\u0210\u0212\7\61\2\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216\u021a\7\62\2\2\u0217\u0219\7\61\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0213\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0228\3\2"+
		"\2\2\u0221\u0223\5\6\4\2\u0222\u0224\t\2\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2"+
		"\2\2\u0227\u0201\3\2\2\2\u0227\u020f\3\2\2\2\u0227\u0221\3\2\2\2\u0228"+
		"\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0241\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022c\u0230\5\"\22\2\u022d\u022f\t\2\2\2\u022e"+
		"\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0239\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u023a\7\3\2\2\u0234"+
		"\u0236\t\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0233\3\2\2\2\u0239"+
		"\u0235\3\2\2\2\u023a\u0242\3\2\2\2\u023b\u023d\5\6\4\2\u023c\u023e\t\2"+
		"\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u022c\3\2\2\2\u0241\u023b\3\2"+
		"\2\2\u0242\u0244\3\2\2\2\u0243\u0229\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\21\3\2\2\2\u0245\u0247\7\21\2\2\u0246\u0248\t\2\2\2\u0247\u0246\3\2\2"+
		"\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024c\5\16\b\2\u024c\u024d\5\20\t\2\u024d\23\3\2\2\2\u024e"+
		"\u0250\7\21\2\2\u024f\u0251\t\2\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3"+
		"\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0296\3\2\2\2\u0254"+
		"\u0258\5\"\22\2\u0255\u0257\t\2\2\2\u0256\u0255\3\2\2\2\u0257\u025a\3"+
		"\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025b\u025f\7\3\2\2\u025c\u025e\t\2\2\2\u025d\u025c\3\2"+
		"\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u027b\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u0270\5\"\22\2\u0263\u0265\7"+
		"\61\2\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026d\7\62"+
		"\2\2\u026a\u026c\7\61\2\2\u026b\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u0270\u0266\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u027b\3\2\2\2\u0274\u0276\5\6\4\2\u0275\u0277\t\2"+
		"\2\2\u0276\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0276\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0254\3\2\2\2\u027a\u0262\3\2"+
		"\2\2\u027a\u0274\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u0294\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0283\5\""+
		"\22\2\u0280\u0282\t\2\2\2\u0281\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u028c\3\2\2\2\u0285\u0283\3\2"+
		"\2\2\u0286\u028d\7\3\2\2\u0287\u0289\t\2\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2"+
		"\2\2\u028c\u0286\3\2\2\2\u028c\u0288\3\2\2\2\u028d\u0295\3\2\2\2\u028e"+
		"\u0290\5\6\4\2\u028f\u0291\t\2\2\2\u0290\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\3\2\2\2\u0294"+
		"\u027f\3\2\2\2\u0294\u028e\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u027c\3\2"+
		"\2\2\u0296\u0297\3\2\2\2\u0297\25\3\2\2\2\u0298\u029d\5 \21\2\u0299\u029d"+
		"\7-\2\2\u029a\u029d\5\30\r\2\u029b\u029d\5\32\16\2\u029c\u0298\3\2\2\2"+
		"\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029d\27"+
		"\3\2\2\2\u029e\u02a2\5\34\17\2\u029f\u02a1\t\2\2\2\u02a0\u029f\3\2\2\2"+
		"\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a9\7*\2\2\u02a6\u02a8\t\2\2\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5\34\17\2\u02ad"+
		"\31\3\2\2\2\u02ae\u02b2\5\30\r\2\u02af\u02b1\t\2\2\2\u02b0\u02af\3\2\2"+
		"\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5"+
		"\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b9\7,\2\2\u02b6\u02b8\t\2\2\2\u02b7"+
		"\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\5\30\r\2\u02bd"+
		"\33\3\2\2\2\u02be\u02c6\5 \21\2\u02bf\u02c6\7.\2\2\u02c0\u02c6\7\60\2"+
		"\2\u02c1\u02c6\7/\2\2\u02c2\u02c6\5\36\20\2\u02c3\u02c6\5N(\2\u02c4\u02c6"+
		"\5(\25\2\u02c5\u02be\3\2\2\2\u02c5\u02bf\3\2\2\2\u02c5\u02c0\3\2\2\2\u02c5"+
		"\u02c1\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2"+
		"\2\2\u02c6\35\3\2\2\2\u02c7\u02cb\5P)\2\u02c8\u02ca\t\2\2\2\u02c9\u02c8"+
		"\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02ce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02d2\7+\2\2\u02cf\u02d1\t\2"+
		"\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\5P"+
		")\2\u02d6\37\3\2\2\2\u02d7\u02ee\5*\26\2\u02d8\u02ee\5,\27\2\u02d9\u02ee"+
		"\5.\30\2\u02da\u02ee\5\60\31\2\u02db\u02ee\5\62\32\2\u02dc\u02ee\5\64"+
		"\33\2\u02dd\u02ee\5\66\34\2\u02de\u02ee\58\35\2\u02df\u02ee\5:\36\2\u02e0"+
		"\u02ee\5<\37\2\u02e1\u02ee\5> \2\u02e2\u02ee\5@!\2\u02e3\u02ee\5B\"\2"+
		"\u02e4\u02ee\5D#\2\u02e5\u02ee\5F$\2\u02e6\u02ee\5H%\2\u02e7\u02ee\5J"+
		"&\2\u02e8\u02ee\5L\'\2\u02e9\u02ee\7\37\2\2\u02ea\u02ee\7\"\2\2\u02eb"+
		"\u02ee\7#\2\2\u02ec\u02ee\7$\2\2\u02ed\u02d7\3\2\2\2\u02ed\u02d8\3\2\2"+
		"\2\u02ed\u02d9\3\2\2\2\u02ed\u02da\3\2\2\2\u02ed\u02db\3\2\2\2\u02ed\u02dc"+
		"\3\2\2\2\u02ed\u02dd\3\2\2\2\u02ed\u02de\3\2\2\2\u02ed\u02df\3\2\2\2\u02ed"+
		"\u02e0\3\2\2\2\u02ed\u02e1\3\2\2\2\u02ed\u02e2\3\2\2\2\u02ed\u02e3\3\2"+
		"\2\2\u02ed\u02e4\3\2\2\2\u02ed\u02e5\3\2\2\2\u02ed\u02e6\3\2\2\2\u02ed"+
		"\u02e7\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ed\u02ea\3\2"+
		"\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee!\3\2\2\2\u02ef\u0307"+
		"\5*\26\2\u02f0\u0307\5,\27\2\u02f1\u0307\5.\30\2\u02f2\u0307\5\60\31\2"+
		"\u02f3\u0307\5\62\32\2\u02f4\u0307\5\64\33\2\u02f5\u0307\5\66\34\2\u02f6"+
		"\u0307\58\35\2\u02f7\u0307\5:\36\2\u02f8\u0307\5<\37\2\u02f9\u0307\5>"+
		" \2\u02fa\u0307\5@!\2\u02fb\u0307\5B\"\2\u02fc\u0307\5D#\2\u02fd\u0307"+
		"\5F$\2\u02fe\u0307\5H%\2\u02ff\u0307\5J&\2\u0300\u0307\5&\24\2\u0301\u0307"+
		"\5$\23\2\u0302\u0307\7\37\2\2\u0303\u0307\7\"\2\2\u0304\u0307\7#\2\2\u0305"+
		"\u0307\7$\2\2\u0306\u02ef\3\2\2\2\u0306\u02f0\3\2\2\2\u0306\u02f1\3\2"+
		"\2\2\u0306\u02f2\3\2\2\2\u0306\u02f3\3\2\2\2\u0306\u02f4\3\2\2\2\u0306"+
		"\u02f5\3\2\2\2\u0306\u02f6\3\2\2\2\u0306\u02f7\3\2\2\2\u0306\u02f8\3\2"+
		"\2\2\u0306\u02f9\3\2\2\2\u0306\u02fa\3\2\2\2\u0306\u02fb\3\2\2\2\u0306"+
		"\u02fc\3\2\2\2\u0306\u02fd\3\2\2\2\u0306\u02fe\3\2\2\2\u0306\u02ff\3\2"+
		"\2\2\u0306\u0300\3\2\2\2\u0306\u0301\3\2\2\2\u0306\u0302\3\2\2\2\u0306"+
		"\u0303\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307#\3\2\2\2"+
		"\u0308\u030b\7/\2\2\u0309\u030b\5(\25\2\u030a\u0308\3\2\2\2\u030a\u0309"+
		"\3\2\2\2\u030b\u030f\3\2\2\2\u030c\u030e\t\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312\3\2"+
		"\2\2\u0311\u030f\3\2\2\2\u0312\u0316\7\7\2\2\u0313\u0315\t\2\2\2\u0314"+
		"\u0313\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2"+
		"\2\2\u0317\u0319\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031a\5\34\17\2\u031a"+
		"%\3\2\2\2\u031b\u031f\7/\2\2\u031c\u031e\t\2\2\2\u031d\u031c\3\2\2\2\u031e"+
		"\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2"+
		"\2\2\u0321\u031f\3\2\2\2\u0322\u0326\7)\2\2\u0323\u0325\t\2\2\2\u0324"+
		"\u0323\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u0329\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032d\5\34\17\2\u032a"+
		"\u032c\t\2\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032e\'\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331"+
		"\7/\2\2\u0331\u0335\7\b\2\2\u0332\u0334\t\2\2\2\u0333\u0332\3\2\2\2\u0334"+
		"\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2"+
		"\2\2\u0337\u0335\3\2\2\2\u0338\u033c\5\34\17\2\u0339\u033b\t\2\2\2\u033a"+
		"\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\7\t\2\2\u0340"+
		")\3\2\2\2\u0341\u0345\7/\2\2\u0342\u0344\t\2\2\2\u0343\u0342\3\2\2\2\u0344"+
		"\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0348\u034c\7\4\2\2\u0349\u034b\t\2\2\2\u034a"+
		"\u0349\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2"+
		"\2\2\u034d\u0369\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0353\5P)\2\u0350\u0352"+
		"\t\2\2\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0366\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u035a\7\5"+
		"\2\2\u0357\u0359\t\2\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a"+
		"\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2"+
		"\2\2\u035d\u0361\5P)\2\u035e\u0360\t\2\2\2\u035f\u035e\3\2\2\2\u0360\u0363"+
		"\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0365\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0364\u0356\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0369"+
		"\u034f\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\7\6"+
		"\2\2\u036c+\3\2\2\2\u036d\u0371\7\24\2\2\u036e\u0370\t\2\2\2\u036f\u036e"+
		"\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372"+
		"\u0374\3\2\2\2\u0373\u0371\3\2\2\2\u0374\u0378\7\4\2\2\u0375\u0377\t\2"+
		"\2\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037f\5P"+
		")\2\u037c\u037e\t\2\2\2\u037d\u037c\3\2\2\2\u037e\u0381\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0383\7\6\2\2\u0383-\3\2\2\2\u0384\u0388\7\25\2\2\u0385\u0387"+
		"\t\2\2\2\u0386\u0385\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038f\7\4"+
		"\2\2\u038c\u038e\t\2\2\2\u038d\u038c\3\2\2\2\u038e\u0391\3\2\2\2\u038f"+
		"\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u038f\3\2"+
		"\2\2\u0392\u0396\5P)\2\u0393\u0395\t\2\2\2\u0394\u0393\3\2\2\2\u0395\u0398"+
		"\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398"+
		"\u0396\3\2\2\2\u0399\u039a\7\6\2\2\u039a/\3\2\2\2\u039b\u039f\7\26\2\2"+
		"\u039c\u039e\t\2\2\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2"+
		"\u03a6\7\4\2\2\u03a3\u03a5\t\2\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2"+
		"\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8"+
		"\u03a6\3\2\2\2\u03a9\u03ad\5P)\2\u03aa\u03ac\t\2\2\2\u03ab\u03aa\3\2\2"+
		"\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0"+
		"\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b4\7\5\2\2\u03b1\u03b3\t\2\2\2\u03b2"+
		"\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03bb\5P)\2\u03b8\u03ba"+
		"\t\2\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf\7\6"+
		"\2\2\u03bf\61\3\2\2\2\u03c0\u03c4\7\27\2\2\u03c1\u03c3\t\2\2\2\u03c2\u03c1"+
		"\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5"+
		"\u03c7\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03cb\7\4\2\2\u03c8\u03ca\t\2"+
		"\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03d2\5P"+
		")\2\u03cf\u03d1\t\2\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2"+
		"\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03d2\3\2"+
		"\2\2\u03d5\u03d6\7\6\2\2\u03d6\63\3\2\2\2\u03d7\u03db\7\30\2\2\u03d8\u03da"+
		"\t\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e2\7\4"+
		"\2\2\u03df\u03e1\t\2\2\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2"+
		"\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e2\3\2"+
		"\2\2\u03e5\u03e9\5P)\2\u03e6\u03e8\t\2\2\2\u03e7\u03e6\3\2\2\2\u03e8\u03eb"+
		"\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb"+
		"\u03e9\3\2\2\2\u03ec\u03f0\7\5\2\2\u03ed\u03ef\t\2\2\2\u03ee\u03ed\3\2"+
		"\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1"+
		"\u03f3\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f7\5P)\2\u03f4\u03f6\t\2\2"+
		"\2\u03f5\u03f4\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8"+
		"\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\6\2\2\u03fb"+
		"\65\3\2\2\2\u03fc\u0400\7\31\2\2\u03fd\u03ff\t\2\2\2\u03fe\u03fd\3\2\2"+
		"\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403"+
		"\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0407\7\4\2\2\u0404\u0406\t\2\2\2\u0405"+
		"\u0404\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0407\u0408\3\2"+
		"\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2\2\2\u040a\u040e\5P)\2\u040b\u040d"+
		"\t\2\2\2\u040c\u040b\3\2\2\2\u040d\u0410\3\2\2\2\u040e\u040c\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0415\7\5"+
		"\2\2\u0412\u0414\t\2\2\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415\3\2"+
		"\2\2\u0418\u041c\5P)\2\u0419\u041b\t\2\2\2\u041a\u0419\3\2\2\2\u041b\u041e"+
		"\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041f\u0420\7\6\2\2\u0420\67\3\2\2\2\u0421\u0425\7\32\2"+
		"\2\u0422\u0424\t\2\2\2\u0423\u0422\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u042c\7\4\2\2\u0429\u042b\t\2\2\2\u042a\u0429\3\2\2\2\u042b\u042e\3\2"+
		"\2\2\u042c\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\3\2\2\2\u042e"+
		"\u042c\3\2\2\2\u042f\u0433\5P)\2\u0430\u0432\t\2\2\2\u0431\u0430\3\2\2"+
		"\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436"+
		"\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u043a\7\5\2\2\u0437\u0439\t\2\2\2\u0438"+
		"\u0437\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2"+
		"\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0441\5P)\2\u043e\u0440"+
		"\t\2\2\2\u043f\u043e\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441"+
		"\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0445\7\6"+
		"\2\2\u04459\3\2\2\2\u0446\u044a\7\33\2\2\u0447\u0449\t\2\2\2\u0448\u0447"+
		"\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u0451\7\4\2\2\u044e\u0450\t\2"+
		"\2\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451"+
		"\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0458\5P"+
		")\2\u0455\u0457\t\2\2\2\u0456\u0455\3\2\2\2\u0457\u045a\3\2\2\2\u0458"+
		"\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a\u0458\3\2"+
		"\2\2\u045b\u045f\7\5\2\2\u045c\u045e\t\2\2\2\u045d\u045c\3\2\2\2\u045e"+
		"\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\3\2"+
		"\2\2\u0461\u045f\3\2\2\2\u0462\u0466\5P)\2\u0463\u0465\t\2\2\2\u0464\u0463"+
		"\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467"+
		"\u0469\3\2\2\2\u0468\u0466\3\2\2\2\u0469\u046a\7\6\2\2\u046a;\3\2\2\2"+
		"\u046b\u046f\7&\2\2\u046c\u046e\t\2\2\2\u046d\u046c\3\2\2\2\u046e\u0471"+
		"\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0476\7\4\2\2\u0473\u0475\t\2\2\2\u0474\u0473\3\2"+
		"\2\2\u0475\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0479\3\2\2\2\u0478\u0476\3\2\2\2\u0479\u047d\5P)\2\u047a\u047c\t\2\2"+
		"\2\u047b\u047a\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d\u047e"+
		"\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0481\7\6\2\2\u0481"+
		"=\3\2\2\2\u0482\u0486\7\34\2\2\u0483\u0485\t\2\2\2\u0484\u0483\3\2\2\2"+
		"\u0485\u0488\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489"+
		"\3\2\2\2\u0488\u0486\3\2\2\2\u0489\u048d\7\4\2\2\u048a\u048c\t\2\2\2\u048b"+
		"\u048a\3\2\2\2\u048c\u048f\3\2\2\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2"+
		"\2\2\u048e\u0490\3\2\2\2\u048f\u048d\3\2\2\2\u0490\u0494\5P)\2\u0491\u0493"+
		"\t\2\2\2\u0492\u0491\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2\2\2\u0494"+
		"\u0495\3\2\2\2\u0495\u0497\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u0498\7\6"+
		"\2\2\u0498?\3\2\2\2\u0499\u049d\7\35\2\2\u049a\u049c\t\2\2\2\u049b\u049a"+
		"\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a4\7\4\2\2\u04a1\u04a3\t\2"+
		"\2\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04b7\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04ab\5P"+
		")\2\u04a8\u04aa\t\2\2\2\u04a9\u04a8\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab"+
		"\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ae\3\2\2\2\u04ad\u04ab\3\2"+
		"\2\2\u04ae\u04b2\7\5\2\2\u04af\u04b1\t\2\2\2\u04b0\u04af\3\2\2\2\u04b1"+
		"\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b6\3\2"+
		"\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04a7\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7"+
		"\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04b7\3\2"+
		"\2\2\u04ba\u04be\5P)\2\u04bb\u04bd\t\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04c0"+
		"\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0"+
		"\u04be\3\2\2\2\u04c1\u04c2\7\6\2\2\u04c2A\3\2\2\2\u04c3\u04c7\7 \2\2\u04c4"+
		"\u04c6\t\2\2\2\u04c5\u04c4\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2"+
		"\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca"+
		"\u04ce\7\4\2\2\u04cb\u04cd\t\2\2\2\u04cc\u04cb\3\2\2\2\u04cd\u04d0\3\2"+
		"\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0"+
		"\u04ce\3\2\2\2\u04d1\u04d5\5P)\2\u04d2\u04d4\t\2\2\2\u04d3\u04d2\3\2\2"+
		"\2\u04d4\u04d7\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8"+
		"\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d8\u04d9\7\6\2\2\u04d9C\3\2\2\2\u04da"+
		"\u04de\7!\2\2\u04db\u04dd\t\2\2\2\u04dc\u04db\3\2\2\2\u04dd\u04e0\3\2"+
		"\2\2\u04de\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0"+
		"\u04de\3\2\2\2\u04e1\u04e5\7\4\2\2\u04e2\u04e4\t\2\2\2\u04e3\u04e2\3\2"+
		"\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"+
		"\u04e8\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e8\u04ec\5P)\2\u04e9\u04eb\t\2\2"+
		"\2\u04ea\u04e9\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f0\7\6\2\2\u04f0"+
		"E\3\2\2\2\u04f1\u04f5\7%\2\2\u04f2\u04f4\t\2\2\2\u04f3\u04f2\3\2\2\2\u04f4"+
		"\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f8\3\2"+
		"\2\2\u04f7\u04f5\3\2\2\2\u04f8\u04fc\7\4\2\2\u04f9\u04fb\t\2\2\2\u04fa"+
		"\u04f9\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2"+
		"\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fc\3\2\2\2\u04ff\u0503\5P)\2\u0500\u0502"+
		"\t\2\2\2\u0501\u0500\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503"+
		"\u0504\3\2\2\2\u0504\u0506\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u0507\7\6"+
		"\2\2\u0507G\3\2\2\2\u0508\u050c\7\36\2\2\u0509\u050b\t\2\2\2\u050a\u0509"+
		"\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0513\7\4\2\2\u0510\u0512\t\2"+
		"\2\2\u0511\u0510\3\2\2\2\u0512\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515\u0513\3\2\2\2\u0516\u051a\5P"+
		")\2\u0517\u0519\t\2\2\2\u0518\u0517\3\2\2\2\u0519\u051c\3\2\2\2\u051a"+
		"\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051a\3\2"+
		"\2\2\u051d\u051e\7\6\2\2\u051eI\3\2\2\2\u051f\u0523\7\'\2\2\u0520\u0522"+
		"\t\2\2\2\u0521\u0520\3\2\2\2\u0522\u0525\3\2\2\2\u0523\u0521\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0523\3\2\2\2\u0526\u052a\7\4"+
		"\2\2\u0527\u0529\t\2\2\2\u0528\u0527\3\2\2\2\u0529\u052c\3\2\2\2\u052a"+
		"\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052d\3\2\2\2\u052c\u052a\3\2"+
		"\2\2\u052d\u0531\5P)\2\u052e\u0530\t\2\2\2\u052f\u052e\3\2\2\2\u0530\u0533"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0534\u0535\7\6\2\2\u0535K\3\2\2\2\u0536\u053a\7(\2\2\u0537"+
		"\u0539\t\2\2\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2"+
		"\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d"+
		"\u0541\7\4\2\2\u053e\u0540\t\2\2\2\u053f\u053e\3\2\2\2\u0540\u0543\3\2"+
		"\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0546\3\2\2\2\u0543"+
		"\u0541\3\2\2\2\u0544\u0547\7/\2\2\u0545\u0547\5N(\2\u0546\u0544\3\2\2"+
		"\2\u0546\u0545\3\2\2\2\u0547\u054b\3\2\2\2\u0548\u054a\t\2\2\2\u0549\u0548"+
		"\3\2\2\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c"+
		"\u054e\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u054f\7\6\2\2\u054fM\3\2\2\2"+
		"\u0550\u0554\7\b\2\2\u0551\u0553\t\2\2\2\u0552\u0551\3\2\2\2\u0553\u0556"+
		"\3\2\2\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0571\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0557\u0568\5P)\2\u0558\u055a\t\2\2\2\u0559\u0558\3\2\2"+
		"\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e"+
		"\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0562\7\5\2\2\u055f\u0561\t\2\2\2\u0560"+
		"\u055f\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0567\5P)\2\u0566\u055b"+
		"\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569\3\2\2\2\u0569"+
		"\u056e\3\2\2\2\u056a\u0568\3\2\2\2\u056b\u056d\t\2\2\2\u056c\u056b\3\2"+
		"\2\2\u056d\u0570\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0572\3\2\2\2\u0570\u056e\3\2\2\2\u0571\u0557\3\2\2\2\u0571\u0572\3\2"+
		"\2\2\u0572\u0573\3\2\2\2\u0573\u0574\7\t\2\2\u0574O\3\2\2\2\u0575\u0576"+
		"\t\3\2\2\u0576Q\3\2\2\2\u00d2U\\cjqvz\177\u0081\u0083\u008a\u008e\u0092"+
		"\u0094\u0096\u009b\u009f\u00a7\u00ad\u00b4\u00bb\u00c2\u00c9\u00ce\u00d1"+
		"\u00d7\u00de\u00e4\u00eb\u00f2\u00f9\u00fe\u0104\u0106\u0108\u010f\u0113"+
		"\u0116\u011b\u011d\u0124\u012a\u0130\u0136\u013c\u0142\u0148\u014f\u0156"+
		"\u015d\u0162\u0168\u016a\u016c\u0173\u017a\u017c\u0182\u0184\u0186\u018e"+
		"\u0194\u019a\u01a0\u01a7\u01ae\u01b5\u01ba\u01c0\u01c2\u01c4\u01cb\u01d2"+
		"\u01d4\u01da\u01dc\u01de\u01e7\u01eb\u01f3\u01f9\u01ff\u0205\u020c\u0213"+
		"\u021a\u021f\u0225\u0227\u0229\u0230\u0237\u0239\u023f\u0241\u0243\u0249"+
		"\u0252\u0258\u025f\u0266\u026d\u0272\u0278\u027a\u027c\u0283\u028a\u028c"+
		"\u0292\u0294\u0296\u029c\u02a2\u02a9\u02b2\u02b9\u02c5\u02cb\u02d2\u02ed"+
		"\u0306\u030a\u030f\u0316\u031f\u0326\u032d\u0335\u033c\u0345\u034c\u0353"+
		"\u035a\u0361\u0366\u0369\u0371\u0378\u037f\u0388\u038f\u0396\u039f\u03a6"+
		"\u03ad\u03b4\u03bb\u03c4\u03cb\u03d2\u03db\u03e2\u03e9\u03f0\u03f7\u0400"+
		"\u0407\u040e\u0415\u041c\u0425\u042c\u0433\u043a\u0441\u044a\u0451\u0458"+
		"\u045f\u0466\u046f\u0476\u047d\u0486\u048d\u0494\u049d\u04a4\u04ab\u04b2"+
		"\u04b7\u04be\u04c7\u04ce\u04d5\u04de\u04e5\u04ec\u04f5\u04fc\u0503\u050c"+
		"\u0513\u051a\u0523\u052a\u0531\u053a\u0541\u0546\u054b\u0554\u055b\u0562"+
		"\u0568\u056e\u0571";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}