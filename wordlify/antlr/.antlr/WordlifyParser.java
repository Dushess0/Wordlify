// Generated from /home/wojtek/Dokumenty/agh/sem6/kompilatory/Wordlify/wordlify/antlr/Wordlify.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FN=8, WHILE=9, 
		FOREACH=10, IN=11, DO=12, IF=13, THEN=14, ELSE=15, BEGIN=16, END=17, EXIST=18, 
		PRINT=19, RENAME=20, REMOVE=21, MOVE=22, COPY=23, DOWNLOAD=24, WRITE=25, 
		WAIT=26, EXECUTE=27, EXIT=28, TIME=29, GET_FILES=30, DATE_MODIFIED=31, 
		FILE=32, FOLDER=33, ARGS=34, SIZE=35, READ=36, CREATE=37, CMP_OP=38, ARITH_OP=39, 
		LOG_OP=40, BOOL=41, STR=42, ID=43, NUM=44, WS=45, NL=46, END_COMMENT=47;
	public static final int
		RULE_program = 0, RULE_fn_def = 1, RULE_block_instr = 2, RULE_foreach = 3, 
		RULE_while_instr = 4, RULE_if_instr = 5, RULE_if_cond = 6, RULE_then = 7, 
		RULE_else_if = 8, RULE_else_block = 9, RULE_cond = 10, RULE_comparison = 11, 
		RULE_expr = 12, RULE_arith_expr = 13, RULE_fn_call = 14, RULE_atom_instr = 15, 
		RULE_assign = 16, RULE_own_fn_call = 17, RULE_exist = 18, RULE_print_instr = 19, 
		RULE_rename = 20, RULE_remove = 21, RULE_move = 22, RULE_copy = 23, RULE_download = 24, 
		RULE_write = 25, RULE_read = 26, RULE_wait_instr = 27, RULE_execute = 28, 
		RULE_get_files = 29, RULE_date_modified = 30, RULE_size = 31, RULE_exit = 32, 
		RULE_create = 33, RULE_array = 34, RULE_value_or_id = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fn_def", "block_instr", "foreach", "while_instr", "if_instr", 
			"if_cond", "then", "else_if", "else_block", "cond", "comparison", "expr", 
			"arith_expr", "fn_call", "atom_instr", "assign", "own_fn_call", "exist", 
			"print_instr", "rename", "remove", "move", "copy", "download", "write", 
			"read", "wait_instr", "execute", "get_files", "date_modified", "size", 
			"exit", "create", "array", "value_or_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'['", "']'", "'fn'", "'while'", 
			"'foreach'", "'in'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'end'", 
			"'exist'", "'print'", "'rename'", "'remove'", "'move'", "'copy'", "'download'", 
			"'write'", "'wait'", "'execute'", "'exit'", "'time'", "'getFiles'", "'dateModified'", 
			"'file'", "'folder'", "'args'", "'size'", "'read'", "'create'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FN", "WHILE", "FOREACH", 
			"IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", 
			"REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", 
			"TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", 
			"READ", "CREATE", "CMP_OP", "ARITH_OP", "LOG_OP", "BOOL", "STR", "ID", 
			"NUM", "WS", "NL", "END_COMMENT"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
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
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN) | (1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(119);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(78);
							atom_instr();
							setState(82);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(79);
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
								setState(84);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(85);
							match(T__0);
							setState(89);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(86);
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
								setState(91);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(92);
							atom_instr();
							setState(106); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(96);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(93);
									match(WS);
									}
									}
									setState(98);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(99);
								match(NL);
								setState(103);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(100);
										match(WS);
										}
										} 
									}
									setState(105);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								}
								}
								}
								setState(108); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(112);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case WHILE:
							case FOREACH:
							case IF:
								{
								setState(110);
								block_instr();
								}
								break;
							case FN:
								{
								setState(111);
								fn_def();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(115); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(114);
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
								setState(117); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(138);
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
					setState(124);
					atom_instr();
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(125);
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
						setState(130);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(131);
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
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
					case FOREACH:
					case IF:
						{
						setState(134);
						block_instr();
						}
						break;
					case FN:
						{
						setState(135);
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

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(142);
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
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_COMMENT) {
				{
				setState(148);
				match(END_COMMENT);
				}
			}

			setState(151);
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
	}

	public final Fn_defContext fn_def() throws RecognitionException {
		Fn_defContext _localctx = new Fn_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fn_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FN);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
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
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(159);
			match(ID);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(160);
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
			}
			setState(166);
			match(T__1);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(167);
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
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(173);
				match(ID);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(174);
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
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(180);
					match(T__2);
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(181);
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
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(187);
					match(ID);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(188);
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
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(T__3);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(202);
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
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(BEGIN);
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
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
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(252);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(214);
							atom_instr();
							setState(218);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(215);
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
							}
							setState(221);
							match(T__0);
							setState(225);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(222);
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
								setState(227);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(228);
							atom_instr();
							setState(242); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(232);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(229);
									match(WS);
									}
									}
									setState(234);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(235);
								match(NL);
								setState(239);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(236);
										match(WS);
										}
										} 
									}
									setState(241);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								}
								}
								}
								setState(244); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(246);
							block_instr();
							setState(248); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(247);
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
								setState(250); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(268);
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
					setState(257);
					atom_instr();
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(258);
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
						setState(263);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(264);
						match(T__0);
						}
					}

					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(267);
					block_instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
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
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS || _la==NL );
				}
			}

			setState(277);
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
	}

	public final Block_instrContext block_instr() throws RecognitionException {
		Block_instrContext _localctx = new Block_instrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_instr);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				if_instr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				while_instr();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
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
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_foreach);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOREACH);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
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
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(290);
			match(ID);
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291);
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
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(296);
			match(IN);
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
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
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(302);
			match(ID);
			setState(304); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(303);
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
				setState(306); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(308);
			match(DO);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
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
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(352);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(314);
							atom_instr();
							setState(318);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(315);
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
							}
							setState(321);
							match(T__0);
							setState(325);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(322);
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
								setState(327);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(328);
							atom_instr();
							setState(342); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(332);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(329);
									match(WS);
									}
									}
									setState(334);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(335);
								match(NL);
								setState(339);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(336);
										match(WS);
										}
										} 
									}
									setState(341);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								}
								}
								}
								setState(344); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(346);
							block_instr();
							setState(348); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(347);
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
								setState(350); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(378);
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
					setState(357);
					atom_instr();
					setState(361);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(358);
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
						setState(363);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(370);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(364);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(366); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(365);
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
							setState(368); 
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
					setState(372);
					block_instr();
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
			}

			setState(382);
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
	}

	public final While_instrContext while_instr() throws RecognitionException {
		While_instrContext _localctx = new While_instrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(WHILE);
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(385);
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
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(390);
			cond();
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
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
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(396);
			match(DO);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(397);
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
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(440);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(402);
							atom_instr();
							setState(406);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(403);
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
							}
							setState(409);
							match(T__0);
							setState(413);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(410);
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
								setState(415);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(416);
							atom_instr();
							setState(430); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(420);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(417);
									match(WS);
									}
									}
									setState(422);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(423);
								match(NL);
								setState(427);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(424);
										match(WS);
										}
										} 
									}
									setState(429);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								}
								}
								}
								setState(432); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(434);
							block_instr();
							setState(436); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(435);
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
								setState(438); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(466);
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
					setState(445);
					atom_instr();
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(446);
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
						setState(451);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(458);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(452);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(454); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(453);
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
							setState(456); 
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
					setState(460);
					block_instr();
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
			}

			setState(470);
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
	}

	public final If_instrContext if_instr() throws RecognitionException {
		If_instrContext _localctx = new If_instrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			if_cond();
			setState(473);
			then();
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(474);
					else_if();
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(480);
				else_block();
				}
			}

			setState(483);
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
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(IF);
			setState(487); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(486);
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
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(491);
			cond();
			setState(493); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(492);
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
				setState(495); 
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
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(THEN);
			setState(499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
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
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(541);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(503);
							atom_instr();
							setState(507);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(504);
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
							}
							setState(510);
							match(T__0);
							setState(514);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(511);
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
								setState(516);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(517);
							atom_instr();
							setState(531); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(521);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(518);
									match(WS);
									}
									}
									setState(523);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(524);
								match(NL);
								setState(528);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(525);
										match(WS);
										}
										} 
									}
									setState(530);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								}
								}
								}
								setState(533); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(535);
							block_instr();
							setState(537); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(536);
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
								setState(539); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(567);
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
					setState(546);
					atom_instr();
					setState(550);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(547);
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
						setState(552);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(553);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(555); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(554);
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
							setState(557); 
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
					setState(561);
					block_instr();
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
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(ELSE);
			setState(573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(572);
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
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(577);
			if_cond();
			setState(578);
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
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(ELSE);
			setState(582); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(581);
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
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(624);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(586);
							atom_instr();
							setState(590);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(587);
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
							}
							setState(593);
							match(T__0);
							setState(597);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(594);
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
								setState(599);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(600);
							atom_instr();
							setState(614); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(604);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(601);
									match(WS);
									}
									}
									setState(606);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(607);
								match(NL);
								setState(611);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(608);
										match(WS);
										}
										} 
									}
									setState(613);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								}
								}
								}
								setState(616); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(618);
							block_instr();
							setState(620); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(619);
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
								setState(622); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(650);
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
					setState(629);
					atom_instr();
					setState(633);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(630);
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
						setState(635);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(642);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(636);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(638); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(637);
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
							setState(640); 
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
					setState(644);
					block_instr();
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(656);
				comparison();
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			expr();
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(660);
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
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			match(CMP_OP);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(667);
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
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				arith_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				array();
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
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			value_or_id();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(684);
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
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			match(ARITH_OP);
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(691);
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
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
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
		public TerminalNode TIME() { return getToken(WordlifyParser.TIME, 0); }
		public TerminalNode FILE() { return getToken(WordlifyParser.FILE, 0); }
		public TerminalNode FOLDER() { return getToken(WordlifyParser.FOLDER, 0); }
		public TerminalNode ARGS() { return getToken(WordlifyParser.ARGS, 0); }
		public Fn_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_call; }
	}

	public final Fn_callContext fn_call() throws RecognitionException {
		Fn_callContext _localctx = new Fn_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fn_call);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				own_fn_call();
				}
				break;
			case EXIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				exist();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				print_instr();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				rename();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(703);
				remove();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(704);
				move();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 7);
				{
				setState(705);
				copy();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(706);
				download();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(707);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 10);
				{
				setState(708);
				read();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(709);
				wait_instr();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(710);
				execute();
				}
				break;
			case GET_FILES:
				enterOuterAlt(_localctx, 13);
				{
				setState(711);
				get_files();
				}
				break;
			case DATE_MODIFIED:
				enterOuterAlt(_localctx, 14);
				{
				setState(712);
				date_modified();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 15);
				{
				setState(713);
				size();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 16);
				{
				setState(714);
				exit();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 17);
				{
				setState(715);
				create();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 18);
				{
				setState(716);
				match(TIME);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 19);
				{
				setState(717);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 20);
				{
				setState(718);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 21);
				{
				setState(719);
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
	}

	public final Atom_instrContext atom_instr() throws RecognitionException {
		Atom_instrContext _localctx = new Atom_instrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom_instr);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				own_fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				exist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				print_instr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(725);
				rename();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(726);
				remove();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(727);
				move();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(728);
				copy();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(729);
				download();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(730);
				write();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(731);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(732);
				wait_instr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(733);
				execute();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(734);
				get_files();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(735);
				date_modified();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(736);
				size();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(737);
				exit();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(738);
				create();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(739);
				assign();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(740);
				match(TIME);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(741);
				match(FILE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(742);
				match(FOLDER);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(743);
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
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(ID);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(747);
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
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(753);
			match(T__4);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(754);
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
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(760);
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
	}

	public final Own_fn_callContext own_fn_call() throws RecognitionException {
		Own_fn_callContext _localctx = new Own_fn_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_own_fn_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(ID);
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(763);
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
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
			match(T__1);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(770);
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
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(776);
				value_or_id();
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(777);
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
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(783);
					match(T__2);
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(784);
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
						setState(789);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(790);
					value_or_id();
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(791);
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
						setState(796);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(804);
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
	}

	public final ExistContext exist() throws RecognitionException {
		ExistContext _localctx = new ExistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(EXIST);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(807);
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
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			match(T__1);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(814);
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
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			value_or_id();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(821);
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
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(827);
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
	}

	public final Print_instrContext print_instr() throws RecognitionException {
		Print_instrContext _localctx = new Print_instrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(PRINT);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(830);
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
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836);
			match(T__1);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(837);
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
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
			value_or_id();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(844);
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
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
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
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(RENAME);
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
			match(T__1);
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
			setState(866);
			value_or_id();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(867);
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
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
			match(T__2);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(874);
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
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			value_or_id();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(881);
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
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(887);
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
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(REMOVE);
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
			match(T__1);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(897);
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
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(903);
			value_or_id();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(904);
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
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
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
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(MOVE);
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
			match(T__1);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(920);
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
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(926);
			value_or_id();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(927);
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
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
			match(T__2);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(934);
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
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			value_or_id();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(941);
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
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(947);
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
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(COPY);
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
			match(T__1);
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(957);
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
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			value_or_id();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(964);
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
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(970);
			match(T__2);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(971);
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
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(977);
			value_or_id();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(978);
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
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(984);
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
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_download);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(DOWNLOAD);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(987);
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
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(993);
			match(T__1);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(994);
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
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			value_or_id();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1001);
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
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			match(T__2);
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1008);
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
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1014);
			value_or_id();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1015);
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
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
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
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(WRITE);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1024);
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
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030);
			match(T__1);
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1031);
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
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1037);
			value_or_id();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1038);
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
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1044);
			match(T__2);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1045);
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
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
			value_or_id();
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1052);
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
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
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
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(READ);
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1061);
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
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067);
			match(T__1);
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1068);
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
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
			value_or_id();
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1075);
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
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1081);
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
	}

	public final Wait_instrContext wait_instr() throws RecognitionException {
		Wait_instrContext _localctx = new Wait_instrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_wait_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(WAIT);
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
			match(T__1);
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1091);
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
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			value_or_id();
			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1098);
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
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1104);
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
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(EXECUTE);
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
			match(T__1);
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
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(T__2);
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1128);
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
						setState(1133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(1138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1139);
			value_or_id();
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1140);
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
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1146);
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
	}

	public final Get_filesContext get_files() throws RecognitionException {
		Get_filesContext _localctx = new Get_filesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_get_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(GET_FILES);
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1149);
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
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1155);
			match(T__1);
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1156);
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
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1162);
			value_or_id();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1163);
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
				setState(1168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1169);
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
	}

	public final Date_modifiedContext date_modified() throws RecognitionException {
		Date_modifiedContext _localctx = new Date_modifiedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_date_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(DATE_MODIFIED);
			setState(1175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1172);
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
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1178);
			match(T__1);
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1179);
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
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1185);
			value_or_id();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1186);
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
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1192);
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
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(SIZE);
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1195);
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
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1201);
			match(T__1);
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1202);
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
				setState(1207);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(EXIT);
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
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(CREATE);
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
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(T__5);
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
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(1270);
				value_or_id();
				setState(1287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						match(T__2);
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
						value_or_id();
						}
						} 
					}
					setState(1289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(1290);
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
					setState(1295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1298);
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
	}

	public final Value_or_idContext value_or_id() throws RecognitionException {
		Value_or_idContext _localctx = new Value_or_idContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0519\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\7\2"+
		"S\n\2\f\2\16\2V\13\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\7\2a\n\2"+
		"\f\2\16\2d\13\2\3\2\3\2\7\2h\n\2\f\2\16\2k\13\2\6\2m\n\2\r\2\16\2n\3\2"+
		"\3\2\5\2s\n\2\3\2\6\2v\n\2\r\2\16\2w\7\2z\n\2\f\2\16\2}\13\2\3\2\3\2\7"+
		"\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2\5\2\u0087\n\2\3\2\3\2\5\2\u008b\n"+
		"\2\5\2\u008d\n\2\5\2\u008f\n\2\3\2\7\2\u0092\n\2\f\2\16\2\u0095\13\2\3"+
		"\2\5\2\u0098\n\2\3\2\3\2\3\3\3\3\6\3\u009e\n\3\r\3\16\3\u009f\3\3\3\3"+
		"\7\3\u00a4\n\3\f\3\16\3\u00a7\13\3\3\3\3\3\7\3\u00ab\n\3\f\3\16\3\u00ae"+
		"\13\3\3\3\3\3\7\3\u00b2\n\3\f\3\16\3\u00b5\13\3\3\3\3\3\7\3\u00b9\n\3"+
		"\f\3\16\3\u00bc\13\3\3\3\3\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3\7\3\u00c5"+
		"\n\3\f\3\16\3\u00c8\13\3\5\3\u00ca\n\3\3\3\3\3\7\3\u00ce\n\3\f\3\16\3"+
		"\u00d1\13\3\3\3\3\3\6\3\u00d5\n\3\r\3\16\3\u00d6\3\3\3\3\7\3\u00db\n\3"+
		"\f\3\16\3\u00de\13\3\3\3\3\3\7\3\u00e2\n\3\f\3\16\3\u00e5\13\3\3\3\3\3"+
		"\7\3\u00e9\n\3\f\3\16\3\u00ec\13\3\3\3\3\3\7\3\u00f0\n\3\f\3\16\3\u00f3"+
		"\13\3\6\3\u00f5\n\3\r\3\16\3\u00f6\3\3\3\3\6\3\u00fb\n\3\r\3\16\3\u00fc"+
		"\7\3\u00ff\n\3\f\3\16\3\u0102\13\3\3\3\3\3\7\3\u0106\n\3\f\3\16\3\u0109"+
		"\13\3\3\3\5\3\u010c\n\3\3\3\5\3\u010f\n\3\3\3\6\3\u0112\n\3\r\3\16\3\u0113"+
		"\5\3\u0116\n\3\3\3\3\3\3\4\3\4\3\4\5\4\u011d\n\4\3\5\3\5\6\5\u0121\n\5"+
		"\r\5\16\5\u0122\3\5\3\5\6\5\u0127\n\5\r\5\16\5\u0128\3\5\3\5\6\5\u012d"+
		"\n\5\r\5\16\5\u012e\3\5\3\5\6\5\u0133\n\5\r\5\16\5\u0134\3\5\3\5\6\5\u0139"+
		"\n\5\r\5\16\5\u013a\3\5\3\5\7\5\u013f\n\5\f\5\16\5\u0142\13\5\3\5\3\5"+
		"\7\5\u0146\n\5\f\5\16\5\u0149\13\5\3\5\3\5\7\5\u014d\n\5\f\5\16\5\u0150"+
		"\13\5\3\5\3\5\7\5\u0154\n\5\f\5\16\5\u0157\13\5\6\5\u0159\n\5\r\5\16\5"+
		"\u015a\3\5\3\5\6\5\u015f\n\5\r\5\16\5\u0160\7\5\u0163\n\5\f\5\16\5\u0166"+
		"\13\5\3\5\3\5\7\5\u016a\n\5\f\5\16\5\u016d\13\5\3\5\3\5\6\5\u0171\n\5"+
		"\r\5\16\5\u0172\5\5\u0175\n\5\3\5\3\5\6\5\u0179\n\5\r\5\16\5\u017a\5\5"+
		"\u017d\n\5\5\5\u017f\n\5\3\5\3\5\3\6\3\6\6\6\u0185\n\6\r\6\16\6\u0186"+
		"\3\6\3\6\6\6\u018b\n\6\r\6\16\6\u018c\3\6\3\6\6\6\u0191\n\6\r\6\16\6\u0192"+
		"\3\6\3\6\7\6\u0197\n\6\f\6\16\6\u019a\13\6\3\6\3\6\7\6\u019e\n\6\f\6\16"+
		"\6\u01a1\13\6\3\6\3\6\7\6\u01a5\n\6\f\6\16\6\u01a8\13\6\3\6\3\6\7\6\u01ac"+
		"\n\6\f\6\16\6\u01af\13\6\6\6\u01b1\n\6\r\6\16\6\u01b2\3\6\3\6\6\6\u01b7"+
		"\n\6\r\6\16\6\u01b8\7\6\u01bb\n\6\f\6\16\6\u01be\13\6\3\6\3\6\7\6\u01c2"+
		"\n\6\f\6\16\6\u01c5\13\6\3\6\3\6\6\6\u01c9\n\6\r\6\16\6\u01ca\5\6\u01cd"+
		"\n\6\3\6\3\6\6\6\u01d1\n\6\r\6\16\6\u01d2\5\6\u01d5\n\6\5\6\u01d7\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\7\7\u01de\n\7\f\7\16\7\u01e1\13\7\3\7\5\7\u01e4\n"+
		"\7\3\7\3\7\3\b\3\b\6\b\u01ea\n\b\r\b\16\b\u01eb\3\b\3\b\6\b\u01f0\n\b"+
		"\r\b\16\b\u01f1\3\t\3\t\6\t\u01f6\n\t\r\t\16\t\u01f7\3\t\3\t\7\t\u01fc"+
		"\n\t\f\t\16\t\u01ff\13\t\3\t\3\t\7\t\u0203\n\t\f\t\16\t\u0206\13\t\3\t"+
		"\3\t\7\t\u020a\n\t\f\t\16\t\u020d\13\t\3\t\3\t\7\t\u0211\n\t\f\t\16\t"+
		"\u0214\13\t\6\t\u0216\n\t\r\t\16\t\u0217\3\t\3\t\6\t\u021c\n\t\r\t\16"+
		"\t\u021d\7\t\u0220\n\t\f\t\16\t\u0223\13\t\3\t\3\t\7\t\u0227\n\t\f\t\16"+
		"\t\u022a\13\t\3\t\3\t\6\t\u022e\n\t\r\t\16\t\u022f\5\t\u0232\n\t\3\t\3"+
		"\t\6\t\u0236\n\t\r\t\16\t\u0237\5\t\u023a\n\t\5\t\u023c\n\t\3\n\3\n\6"+
		"\n\u0240\n\n\r\n\16\n\u0241\3\n\3\n\3\n\3\13\3\13\6\13\u0249\n\13\r\13"+
		"\16\13\u024a\3\13\3\13\7\13\u024f\n\13\f\13\16\13\u0252\13\13\3\13\3\13"+
		"\7\13\u0256\n\13\f\13\16\13\u0259\13\13\3\13\3\13\7\13\u025d\n\13\f\13"+
		"\16\13\u0260\13\13\3\13\3\13\7\13\u0264\n\13\f\13\16\13\u0267\13\13\6"+
		"\13\u0269\n\13\r\13\16\13\u026a\3\13\3\13\6\13\u026f\n\13\r\13\16\13\u0270"+
		"\7\13\u0273\n\13\f\13\16\13\u0276\13\13\3\13\3\13\7\13\u027a\n\13\f\13"+
		"\16\13\u027d\13\13\3\13\3\13\6\13\u0281\n\13\r\13\16\13\u0282\5\13\u0285"+
		"\n\13\3\13\3\13\6\13\u0289\n\13\r\13\16\13\u028a\5\13\u028d\n\13\5\13"+
		"\u028f\n\13\3\f\3\f\3\f\5\f\u0294\n\f\3\r\3\r\7\r\u0298\n\r\f\r\16\r\u029b"+
		"\13\r\3\r\3\r\7\r\u029f\n\r\f\r\16\r\u02a2\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u02ac\n\16\3\17\3\17\7\17\u02b0\n\17\f\17\16\17\u02b3"+
		"\13\17\3\17\3\17\7\17\u02b7\n\17\f\17\16\17\u02ba\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u02d3\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u02eb\n\21\3\22\3\22\7\22\u02ef\n\22\f\22\16\22\u02f2"+
		"\13\22\3\22\3\22\7\22\u02f6\n\22\f\22\16\22\u02f9\13\22\3\22\3\22\3\23"+
		"\3\23\7\23\u02ff\n\23\f\23\16\23\u0302\13\23\3\23\3\23\7\23\u0306\n\23"+
		"\f\23\16\23\u0309\13\23\3\23\3\23\7\23\u030d\n\23\f\23\16\23\u0310\13"+
		"\23\3\23\3\23\7\23\u0314\n\23\f\23\16\23\u0317\13\23\3\23\3\23\7\23\u031b"+
		"\n\23\f\23\16\23\u031e\13\23\7\23\u0320\n\23\f\23\16\23\u0323\13\23\5"+
		"\23\u0325\n\23\3\23\3\23\3\24\3\24\7\24\u032b\n\24\f\24\16\24\u032e\13"+
		"\24\3\24\3\24\7\24\u0332\n\24\f\24\16\24\u0335\13\24\3\24\3\24\7\24\u0339"+
		"\n\24\f\24\16\24\u033c\13\24\3\24\3\24\3\25\3\25\7\25\u0342\n\25\f\25"+
		"\16\25\u0345\13\25\3\25\3\25\7\25\u0349\n\25\f\25\16\25\u034c\13\25\3"+
		"\25\3\25\7\25\u0350\n\25\f\25\16\25\u0353\13\25\3\25\3\25\3\26\3\26\7"+
		"\26\u0359\n\26\f\26\16\26\u035c\13\26\3\26\3\26\7\26\u0360\n\26\f\26\16"+
		"\26\u0363\13\26\3\26\3\26\7\26\u0367\n\26\f\26\16\26\u036a\13\26\3\26"+
		"\3\26\7\26\u036e\n\26\f\26\16\26\u0371\13\26\3\26\3\26\7\26\u0375\n\26"+
		"\f\26\16\26\u0378\13\26\3\26\3\26\3\27\3\27\7\27\u037e\n\27\f\27\16\27"+
		"\u0381\13\27\3\27\3\27\7\27\u0385\n\27\f\27\16\27\u0388\13\27\3\27\3\27"+
		"\7\27\u038c\n\27\f\27\16\27\u038f\13\27\3\27\3\27\3\30\3\30\7\30\u0395"+
		"\n\30\f\30\16\30\u0398\13\30\3\30\3\30\7\30\u039c\n\30\f\30\16\30\u039f"+
		"\13\30\3\30\3\30\7\30\u03a3\n\30\f\30\16\30\u03a6\13\30\3\30\3\30\7\30"+
		"\u03aa\n\30\f\30\16\30\u03ad\13\30\3\30\3\30\7\30\u03b1\n\30\f\30\16\30"+
		"\u03b4\13\30\3\30\3\30\3\31\3\31\7\31\u03ba\n\31\f\31\16\31\u03bd\13\31"+
		"\3\31\3\31\7\31\u03c1\n\31\f\31\16\31\u03c4\13\31\3\31\3\31\7\31\u03c8"+
		"\n\31\f\31\16\31\u03cb\13\31\3\31\3\31\7\31\u03cf\n\31\f\31\16\31\u03d2"+
		"\13\31\3\31\3\31\7\31\u03d6\n\31\f\31\16\31\u03d9\13\31\3\31\3\31\3\32"+
		"\3\32\7\32\u03df\n\32\f\32\16\32\u03e2\13\32\3\32\3\32\7\32\u03e6\n\32"+
		"\f\32\16\32\u03e9\13\32\3\32\3\32\7\32\u03ed\n\32\f\32\16\32\u03f0\13"+
		"\32\3\32\3\32\7\32\u03f4\n\32\f\32\16\32\u03f7\13\32\3\32\3\32\7\32\u03fb"+
		"\n\32\f\32\16\32\u03fe\13\32\3\32\3\32\3\33\3\33\7\33\u0404\n\33\f\33"+
		"\16\33\u0407\13\33\3\33\3\33\7\33\u040b\n\33\f\33\16\33\u040e\13\33\3"+
		"\33\3\33\7\33\u0412\n\33\f\33\16\33\u0415\13\33\3\33\3\33\7\33\u0419\n"+
		"\33\f\33\16\33\u041c\13\33\3\33\3\33\7\33\u0420\n\33\f\33\16\33\u0423"+
		"\13\33\3\33\3\33\3\34\3\34\7\34\u0429\n\34\f\34\16\34\u042c\13\34\3\34"+
		"\3\34\7\34\u0430\n\34\f\34\16\34\u0433\13\34\3\34\3\34\7\34\u0437\n\34"+
		"\f\34\16\34\u043a\13\34\3\34\3\34\3\35\3\35\7\35\u0440\n\35\f\35\16\35"+
		"\u0443\13\35\3\35\3\35\7\35\u0447\n\35\f\35\16\35\u044a\13\35\3\35\3\35"+
		"\7\35\u044e\n\35\f\35\16\35\u0451\13\35\3\35\3\35\3\36\3\36\7\36\u0457"+
		"\n\36\f\36\16\36\u045a\13\36\3\36\3\36\7\36\u045e\n\36\f\36\16\36\u0461"+
		"\13\36\3\36\3\36\7\36\u0465\n\36\f\36\16\36\u0468\13\36\3\36\3\36\7\36"+
		"\u046c\n\36\f\36\16\36\u046f\13\36\7\36\u0471\n\36\f\36\16\36\u0474\13"+
		"\36\3\36\3\36\7\36\u0478\n\36\f\36\16\36\u047b\13\36\3\36\3\36\3\37\3"+
		"\37\7\37\u0481\n\37\f\37\16\37\u0484\13\37\3\37\3\37\7\37\u0488\n\37\f"+
		"\37\16\37\u048b\13\37\3\37\3\37\7\37\u048f\n\37\f\37\16\37\u0492\13\37"+
		"\3\37\3\37\3 \3 \7 \u0498\n \f \16 \u049b\13 \3 \3 \7 \u049f\n \f \16"+
		" \u04a2\13 \3 \3 \7 \u04a6\n \f \16 \u04a9\13 \3 \3 \3!\3!\7!\u04af\n"+
		"!\f!\16!\u04b2\13!\3!\3!\7!\u04b6\n!\f!\16!\u04b9\13!\3!\3!\7!\u04bd\n"+
		"!\f!\16!\u04c0\13!\3!\3!\3\"\3\"\7\"\u04c6\n\"\f\"\16\"\u04c9\13\"\3\""+
		"\3\"\7\"\u04cd\n\"\f\"\16\"\u04d0\13\"\3\"\3\"\7\"\u04d4\n\"\f\"\16\""+
		"\u04d7\13\"\3\"\3\"\3#\3#\7#\u04dd\n#\f#\16#\u04e0\13#\3#\3#\7#\u04e4"+
		"\n#\f#\16#\u04e7\13#\3#\3#\7#\u04eb\n#\f#\16#\u04ee\13#\3#\3#\3$\3$\7"+
		"$\u04f4\n$\f$\16$\u04f7\13$\3$\3$\7$\u04fb\n$\f$\16$\u04fe\13$\3$\3$\7"+
		"$\u0502\n$\f$\16$\u0505\13$\3$\7$\u0508\n$\f$\16$\u050b\13$\3$\7$\u050e"+
		"\n$\f$\16$\u0511\13$\5$\u0513\n$\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\4\3\2/\60\3\2+."+
		"\2\u05eb\2M\3\2\2\2\4\u009b\3\2\2\2\6\u011c\3\2\2\2\b\u011e\3\2\2\2\n"+
		"\u0182\3\2\2\2\f\u01da\3\2\2\2\16\u01e7\3\2\2\2\20\u01f3\3\2\2\2\22\u023d"+
		"\3\2\2\2\24\u0246\3\2\2\2\26\u0293\3\2\2\2\30\u0295\3\2\2\2\32\u02ab\3"+
		"\2\2\2\34\u02ad\3\2\2\2\36\u02d2\3\2\2\2 \u02ea\3\2\2\2\"\u02ec\3\2\2"+
		"\2$\u02fc\3\2\2\2&\u0328\3\2\2\2(\u033f\3\2\2\2*\u0356\3\2\2\2,\u037b"+
		"\3\2\2\2.\u0392\3\2\2\2\60\u03b7\3\2\2\2\62\u03dc\3\2\2\2\64\u0401\3\2"+
		"\2\2\66\u0426\3\2\2\28\u043d\3\2\2\2:\u0454\3\2\2\2<\u047e\3\2\2\2>\u0495"+
		"\3\2\2\2@\u04ac\3\2\2\2B\u04c3\3\2\2\2D\u04da\3\2\2\2F\u04f1\3\2\2\2H"+
		"\u0516\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\u008e"+
		"\3\2\2\2OM\3\2\2\2PT\5 \21\2QS\t\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2T"+
		"U\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7\3\2\2XZ\t\2\2\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\z\3\2\2\2][\3\2\2\2^l\5 \21\2_a\7/\2\2`_\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ei\7\60\2\2fh\7/\2"+
		"\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2lb\3\2\2"+
		"\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oz\3\2\2\2ps\5\6\4\2qs\5\4\3\2rp\3\2\2"+
		"\2rq\3\2\2\2su\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2xz\3\2\2\2yP\3\2\2\2y^\3\2\2\2yr\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\u008c\3\2\2\2}{\3\2\2\2~\u0082\5 \21\2\177\u0081\t\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\3\2\2\u0086\u0085\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008d\3\2\2\2\u0088\u008b\5\6\4\2\u0089"+
		"\u008b\5\4\3\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c~\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\3\2\2\2\u008e{\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090\u0092\t\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\61\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\2"+
		"\2\3\u009a\3\3\2\2\2\u009b\u009d\7\n\2\2\u009c\u009e\t\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a5\7-\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ac\7\4\2\2\u00a9\u00ab\t\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00c9\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\7-"+
		"\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00ba\7\5\2\2\u00b7\u00b9\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7-\2\2\u00be\u00c0\t\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00af\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cf\7\6\2\2\u00cc\u00ce\t\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\22\2\2\u00d3\u00d5\t"+
		"\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u0115\3\2\2\2\u00d8\u00dc\5 \21\2\u00d9\u00db\t\2"+
		"\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\7\3"+
		"\2\2\u00e0\u00e2\t\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00ff\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00f4\5 \21\2\u00e7\u00e9\7/\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\7\60\2\2\u00ee\u00f0\7/\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00ff\3\2"+
		"\2\2\u00f8\u00fa\5\6\4\2\u00f9\u00fb\t\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00d8\3\2\2\2\u00fe\u00e6\3\2\2\2\u00fe\u00f8\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010e\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0107\5 \21\2\u0104\u0106\t\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\7\3\2\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010f\5\6"+
		"\4\2\u010e\u0103\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0112\t\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0100\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\23\2\2\u0118\5\3\2\2"+
		"\2\u0119\u011d\5\f\7\2\u011a\u011d\5\n\6\2\u011b\u011d\5\b\5\2\u011c\u0119"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\7\3\2\2\2\u011e"+
		"\u0120\7\f\2\2\u011f\u0121\t\2\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\7-\2\2\u0125\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\7\r\2\2\u012b\u012d\t\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\7-\2\2\u0131\u0133\t\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\7\16\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u017e\3\2\2\2\u013c"+
		"\u0140\5 \21\2\u013d\u013f\t\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0147\7\3\2\2\u0144\u0146\t\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0163\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0158\5 \21\2\u014b\u014d\7/"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155\7\60"+
		"\2\2\u0152\u0154\7/\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0158\u014e\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0163\3\2\2\2\u015c\u015e\5\6\4\2\u015d\u015f\t\2"+
		"\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u013c\3\2\2\2\u0162\u014a\3\2"+
		"\2\2\u0162\u015c\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u017c\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016b\5 "+
		"\21\2\u0168\u016a\t\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0174\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016e\u0175\7\3\2\2\u016f\u0171\t\2\2\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u016e\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u017d\3\2\2\2\u0176"+
		"\u0178\5\6\4\2\u0177\u0179\t\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u0167\3\2\2\2\u017c\u0176\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0164\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\23\2\2\u0181"+
		"\t\3\2\2\2\u0182\u0184\7\13\2\2\u0183\u0185\t\2\2\2\u0184\u0183\3\2\2"+
		"\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018a\5\26\f\2\u0189\u018b\t\2\2\2\u018a\u0189\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u0190\7\16\2\2\u018f\u0191\t\2\2\2\u0190\u018f\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u01d6"+
		"\3\2\2\2\u0194\u0198\5 \21\2\u0195\u0197\t\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019b\u019f\7\3\2\2\u019c\u019e\t\2\2\2\u019d"+
		"\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01bb\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01b0\5 \21\2\u01a3"+
		"\u01a5\7/\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01ad\7\60\2\2\u01aa\u01ac\7/\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u01a6\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bb\3\2\2\2\u01b4\u01b6\5\6\4\2\u01b5"+
		"\u01b7\t\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u0194\3\2\2\2\u01ba"+
		"\u01a2\3\2\2\2\u01ba\u01b4\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01d4\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c3\5 \21\2\u01c0\u01c2\t\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01cc\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01cd\7\3\2\2\u01c7\u01c9\t\2\2\2\u01c8\u01c7\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb"+
		"\u01cd\3\2\2\2\u01cc\u01c6\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cd\u01d5\3\2"+
		"\2\2\u01ce\u01d0\5\6\4\2\u01cf\u01d1\t\2\2\2\u01d0\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01bf\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01bc\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7\23"+
		"\2\2\u01d9\13\3\2\2\2\u01da\u01db\5\16\b\2\u01db\u01df\5\20\t\2\u01dc"+
		"\u01de\5\22\n\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3"+
		"\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e4\5\24\13\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3"+
		"\2\2\2\u01e5\u01e6\7\23\2\2\u01e6\r\3\2\2\2\u01e7\u01e9\7\17\2\2\u01e8"+
		"\u01ea\t\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\5\26\f\2\u01ee"+
		"\u01f0\t\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\17\3\2\2\2\u01f3\u01f5\7\20\2\2\u01f4\u01f6"+
		"\t\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u023b\3\2\2\2\u01f9\u01fd\5 \21\2\u01fa\u01fc\t\2"+
		"\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\7\3"+
		"\2\2\u0201\u0203\t\2\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0220\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0215\5 \21\2\u0208\u020a\7/\2\2\u0209\u0208\3\2\2\2\u020a"+
		"\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020e\u0212\7\60\2\2\u020f\u0211\7/\2\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u020b\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0220\3\2"+
		"\2\2\u0219\u021b\5\6\4\2\u021a\u021c\t\2\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u01f9\3\2\2\2\u021f\u0207\3\2\2\2\u021f\u0219\3\2\2\2\u0220"+
		"\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0239\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0224\u0228\5 \21\2\u0225\u0227\t\2\2\2\u0226"+
		"\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u0231\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u0232\7\3\2\2\u022c"+
		"\u022e\t\2\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022b\3\2\2\2\u0231"+
		"\u022d\3\2\2\2\u0232\u023a\3\2\2\2\u0233\u0235\5\6\4\2\u0234\u0236\t\2"+
		"\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0224\3\2\2\2\u0239\u0233\3\2"+
		"\2\2\u023a\u023c\3\2\2\2\u023b\u0221\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\21\3\2\2\2\u023d\u023f\7\21\2\2\u023e\u0240\t\2\2\2\u023f\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0244\5\16\b\2\u0244\u0245\5\20\t\2\u0245\23\3\2\2\2\u0246"+
		"\u0248\7\21\2\2\u0247\u0249\t\2\2\2\u0248\u0247\3\2\2\2\u0249\u024a\3"+
		"\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u028e\3\2\2\2\u024c"+
		"\u0250\5 \21\2\u024d\u024f\t\2\2\2\u024e\u024d\3\2\2\2\u024f\u0252\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0257\7\3\2\2\u0254\u0256\t\2\2\2\u0255\u0254\3\2"+
		"\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0273\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u0268\5 \21\2\u025b\u025d\7/"+
		"\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0265\7\60"+
		"\2\2\u0262\u0264\7/\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0268\u025e\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0273\3\2\2\2\u026c\u026e\5\6\4\2\u026d\u026f\t\2"+
		"\2\2\u026e\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u024c\3\2\2\2\u0272\u025a\3\2"+
		"\2\2\u0272\u026c\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u028c\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u027b\5 "+
		"\21\2\u0278\u027a\t\2\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0284\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u0285\7\3\2\2\u027f\u0281\t\2\2\2\u0280\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2"+
		"\2\2\u0284\u027e\3\2\2\2\u0284\u0280\3\2\2\2\u0285\u028d\3\2\2\2\u0286"+
		"\u0288\5\6\4\2\u0287\u0289\t\2\2\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c"+
		"\u0277\3\2\2\2\u028c\u0286\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0274\3\2"+
		"\2\2\u028e\u028f\3\2\2\2\u028f\25\3\2\2\2\u0290\u0294\5\36\20\2\u0291"+
		"\u0294\7+\2\2\u0292\u0294\5\30\r\2\u0293\u0290\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0292\3\2\2\2\u0294\27\3\2\2\2\u0295\u0299\5\32\16\2\u0296"+
		"\u0298\t\2\2\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2"+
		"\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c"+
		"\u02a0\7(\2\2\u029d\u029f\t\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2"+
		"\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a3\u02a4\5\32\16\2\u02a4\31\3\2\2\2\u02a5\u02ac\5\36"+
		"\20\2\u02a6\u02ac\7,\2\2\u02a7\u02ac\7.\2\2\u02a8\u02ac\7-\2\2\u02a9\u02ac"+
		"\5\34\17\2\u02aa\u02ac\5F$\2\u02ab\u02a5\3\2\2\2\u02ab\u02a6\3\2\2\2\u02ab"+
		"\u02a7\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02aa\3\2"+
		"\2\2\u02ac\33\3\2\2\2\u02ad\u02b1\5H%\2\u02ae\u02b0\t\2\2\2\u02af\u02ae"+
		"\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b8\7)\2\2\u02b5\u02b7\t\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\5H"+
		"%\2\u02bc\35\3\2\2\2\u02bd\u02d3\5$\23\2\u02be\u02d3\5&\24\2\u02bf\u02d3"+
		"\5(\25\2\u02c0\u02d3\5*\26\2\u02c1\u02d3\5,\27\2\u02c2\u02d3\5.\30\2\u02c3"+
		"\u02d3\5\60\31\2\u02c4\u02d3\5\62\32\2\u02c5\u02d3\5\64\33\2\u02c6\u02d3"+
		"\5\66\34\2\u02c7\u02d3\58\35\2\u02c8\u02d3\5:\36\2\u02c9\u02d3\5<\37\2"+
		"\u02ca\u02d3\5> \2\u02cb\u02d3\5@!\2\u02cc\u02d3\5B\"\2\u02cd\u02d3\5"+
		"D#\2\u02ce\u02d3\7\37\2\2\u02cf\u02d3\7\"\2\2\u02d0\u02d3\7#\2\2\u02d1"+
		"\u02d3\7$\2\2\u02d2\u02bd\3\2\2\2\u02d2\u02be\3\2\2\2\u02d2\u02bf\3\2"+
		"\2\2\u02d2\u02c0\3\2\2\2\u02d2\u02c1\3\2\2\2\u02d2\u02c2\3\2\2\2\u02d2"+
		"\u02c3\3\2\2\2\u02d2\u02c4\3\2\2\2\u02d2\u02c5\3\2\2\2\u02d2\u02c6\3\2"+
		"\2\2\u02d2\u02c7\3\2\2\2\u02d2\u02c8\3\2\2\2\u02d2\u02c9\3\2\2\2\u02d2"+
		"\u02ca\3\2\2\2\u02d2\u02cb\3\2\2\2\u02d2\u02cc\3\2\2\2\u02d2\u02cd\3\2"+
		"\2\2\u02d2\u02ce\3\2\2\2\u02d2\u02cf\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\37\3\2\2\2\u02d4\u02eb\5$\23\2\u02d5\u02eb\5&\24"+
		"\2\u02d6\u02eb\5(\25\2\u02d7\u02eb\5*\26\2\u02d8\u02eb\5,\27\2\u02d9\u02eb"+
		"\5.\30\2\u02da\u02eb\5\60\31\2\u02db\u02eb\5\62\32\2\u02dc\u02eb\5\64"+
		"\33\2\u02dd\u02eb\5\66\34\2\u02de\u02eb\58\35\2\u02df\u02eb\5:\36\2\u02e0"+
		"\u02eb\5<\37\2\u02e1\u02eb\5> \2\u02e2\u02eb\5@!\2\u02e3\u02eb\5B\"\2"+
		"\u02e4\u02eb\5D#\2\u02e5\u02eb\5\"\22\2\u02e6\u02eb\7\37\2\2\u02e7\u02eb"+
		"\7\"\2\2\u02e8\u02eb\7#\2\2\u02e9\u02eb\7$\2\2\u02ea\u02d4\3\2\2\2\u02ea"+
		"\u02d5\3\2\2\2\u02ea\u02d6\3\2\2\2\u02ea\u02d7\3\2\2\2\u02ea\u02d8\3\2"+
		"\2\2\u02ea\u02d9\3\2\2\2\u02ea\u02da\3\2\2\2\u02ea\u02db\3\2\2\2\u02ea"+
		"\u02dc\3\2\2\2\u02ea\u02dd\3\2\2\2\u02ea\u02de\3\2\2\2\u02ea\u02df\3\2"+
		"\2\2\u02ea\u02e0\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea"+
		"\u02e3\3\2\2\2\u02ea\u02e4\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e6\3\2"+
		"\2\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"!\3\2\2\2\u02ec\u02f0\7-\2\2\u02ed\u02ef\t\2\2\2\u02ee\u02ed\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02f7\7\7\2\2\u02f4\u02f6\t\2\2\2\u02f5"+
		"\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\5\32\16\2\u02fb"+
		"#\3\2\2\2\u02fc\u0300\7-\2\2\u02fd\u02ff\t\2\2\2\u02fe\u02fd\3\2\2\2\u02ff"+
		"\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2"+
		"\2\2\u0302\u0300\3\2\2\2\u0303\u0307\7\4\2\2\u0304\u0306\t\2\2\2\u0305"+
		"\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u0324\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030e\5H%\2\u030b\u030d"+
		"\t\2\2\2\u030c\u030b\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0321\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0315\7\5"+
		"\2\2\u0312\u0314\t\2\2\2\u0313\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315"+
		"\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2"+
		"\2\2\u0318\u031c\5H%\2\u0319\u031b\t\2\2\2\u031a\u0319\3\2\2\2\u031b\u031e"+
		"\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031f\u0311\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0324"+
		"\u030a\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\7\6"+
		"\2\2\u0327%\3\2\2\2\u0328\u032c\7\24\2\2\u0329\u032b\t\2\2\2\u032a\u0329"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0333\7\4\2\2\u0330\u0332\t\2"+
		"\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u033a\5H"+
		"%\2\u0337\u0339\t\2\2\2\u0338\u0337\3\2\2\2\u0339\u033c\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033d\u033e\7\6\2\2\u033e\'\3\2\2\2\u033f\u0343\7\25\2\2\u0340\u0342"+
		"\t\2\2\2\u0341\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u034a\7\4"+
		"\2\2\u0347\u0349\t\2\2\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u034a\3\2"+
		"\2\2\u034d\u0351\5H%\2\u034e\u0350\t\2\2\2\u034f\u034e\3\2\2\2\u0350\u0353"+
		"\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0354\u0355\7\6\2\2\u0355)\3\2\2\2\u0356\u035a\7\26\2\2"+
		"\u0357\u0359\t\2\2\2\u0358\u0357\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u035a\3\2\2\2\u035d"+
		"\u0361\7\4\2\2\u035e\u0360\t\2\2\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0361\3\2\2\2\u0364\u0368\5H%\2\u0365\u0367\t\2\2\2\u0366\u0365\3\2\2"+
		"\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036f\7\5\2\2\u036c\u036e\t\2\2\2\u036d"+
		"\u036c\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0376\5H%\2\u0373\u0375"+
		"\t\2\2\2\u0374\u0373\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u0376\3\2\2\2\u0379\u037a\7\6"+
		"\2\2\u037a+\3\2\2\2\u037b\u037f\7\27\2\2\u037c\u037e\t\2\2\2\u037d\u037c"+
		"\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0382\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u0386\7\4\2\2\u0383\u0385\t\2"+
		"\2\2\u0384\u0383\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038d\5H"+
		"%\2\u038a\u038c\t\2\2\2\u038b\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d"+
		"\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2"+
		"\2\2\u0390\u0391\7\6\2\2\u0391-\3\2\2\2\u0392\u0396\7\30\2\2\u0393\u0395"+
		"\t\2\2\2\u0394\u0393\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039d\7\4"+
		"\2\2\u039a\u039c\t\2\2\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u039d\3\2"+
		"\2\2\u03a0\u03a4\5H%\2\u03a1\u03a3\t\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6"+
		"\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a7\u03ab\7\5\2\2\u03a8\u03aa\t\2\2\2\u03a9\u03a8\3\2"+
		"\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03b2\5H%\2\u03af\u03b1\t\2\2"+
		"\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3"+
		"\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\7\6\2\2\u03b6"+
		"/\3\2\2\2\u03b7\u03bb\7\31\2\2\u03b8\u03ba\t\2\2\2\u03b9\u03b8\3\2\2\2"+
		"\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be"+
		"\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03c2\7\4\2\2\u03bf\u03c1\t\2\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2"+
		"\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c9\5H%\2\u03c6\u03c8"+
		"\t\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03d0\7\5"+
		"\2\2\u03cd\u03cf\t\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2"+
		"\2\2\u03d3\u03d7\5H%\2\u03d4\u03d6\t\2\2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d9"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03db\7\6\2\2\u03db\61\3\2\2\2\u03dc\u03e0\7\32\2"+
		"\2\u03dd\u03df\t\2\2\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e3"+
		"\u03e7\7\4\2\2\u03e4\u03e6\t\2\2\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03ea\u03ee\5H%\2\u03eb\u03ed\t\2\2\2\u03ec\u03eb\3\2\2"+
		"\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1"+
		"\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f5\7\5\2\2\u03f2\u03f4\t\2\2\2\u03f3"+
		"\u03f2\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2"+
		"\2\2\u03f6\u03f8\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03fc\5H%\2\u03f9\u03fb"+
		"\t\2\2\2\u03fa\u03f9\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0400\7\6"+
		"\2\2\u0400\63\3\2\2\2\u0401\u0405\7\33\2\2\u0402\u0404\t\2\2\2\u0403\u0402"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u040c\7\4\2\2\u0409\u040b\t\2"+
		"\2\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0413\5H"+
		"%\2\u0410\u0412\t\2\2\2\u0411\u0410\3\2\2\2\u0412\u0415\3\2\2\2\u0413"+
		"\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0413\3\2"+
		"\2\2\u0416\u041a\7\5\2\2\u0417\u0419\t\2\2\2\u0418\u0417\3\2\2\2\u0419"+
		"\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2"+
		"\2\2\u041c\u041a\3\2\2\2\u041d\u0421\5H%\2\u041e\u0420\t\2\2\2\u041f\u041e"+
		"\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0424\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u0425\7\6\2\2\u0425\65\3\2\2"+
		"\2\u0426\u042a\7&\2\2\u0427\u0429\t\2\2\2\u0428\u0427\3\2\2\2\u0429\u042c"+
		"\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042d\u0431\7\4\2\2\u042e\u0430\t\2\2\2\u042f\u042e\3\2"+
		"\2\2\u0430\u0433\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0434\3\2\2\2\u0433\u0431\3\2\2\2\u0434\u0438\5H%\2\u0435\u0437\t\2\2"+
		"\2\u0436\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439"+
		"\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u043c\7\6\2\2\u043c"+
		"\67\3\2\2\2\u043d\u0441\7\34\2\2\u043e\u0440\t\2\2\2\u043f\u043e\3\2\2"+
		"\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0444"+
		"\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0448\7\4\2\2\u0445\u0447\t\2\2\2\u0446"+
		"\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2"+
		"\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044f\5H%\2\u044c\u044e"+
		"\t\2\2\2\u044d\u044c\3\2\2\2\u044e\u0451\3\2\2\2\u044f\u044d\3\2\2\2\u044f"+
		"\u0450\3\2\2\2\u0450\u0452\3\2\2\2\u0451\u044f\3\2\2\2\u0452\u0453\7\6"+
		"\2\2\u04539\3\2\2\2\u0454\u0458\7\35\2\2\u0455\u0457\t\2\2\2\u0456\u0455"+
		"\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045b\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045f\7\4\2\2\u045c\u045e\t\2"+
		"\2\2\u045d\u045c\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u045d\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0472\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0466\5H"+
		"%\2\u0463\u0465\t\2\2\2\u0464\u0463\3\2\2\2\u0465\u0468\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0469\3\2\2\2\u0468\u0466\3\2"+
		"\2\2\u0469\u046d\7\5\2\2\u046a\u046c\t\2\2\2\u046b\u046a\3\2\2\2\u046c"+
		"\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0471\3\2"+
		"\2\2\u046f\u046d\3\2\2\2\u0470\u0462\3\2\2\2\u0471\u0474\3\2\2\2\u0472"+
		"\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\3\2\2\2\u0474\u0472\3\2"+
		"\2\2\u0475\u0479\5H%\2\u0476\u0478\t\2\2\2\u0477\u0476\3\2\2\2\u0478\u047b"+
		"\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2\2\2\u047b"+
		"\u0479\3\2\2\2\u047c\u047d\7\6\2\2\u047d;\3\2\2\2\u047e\u0482\7 \2\2\u047f"+
		"\u0481\t\2\2\2\u0480\u047f\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2"+
		"\2\2\u0482\u0483\3\2\2\2\u0483\u0485\3\2\2\2\u0484\u0482\3\2\2\2\u0485"+
		"\u0489\7\4\2\2\u0486\u0488\t\2\2\2\u0487\u0486\3\2\2\2\u0488\u048b\3\2"+
		"\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c\3\2\2\2\u048b"+
		"\u0489\3\2\2\2\u048c\u0490\5H%\2\u048d\u048f\t\2\2\2\u048e\u048d\3\2\2"+
		"\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493"+
		"\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0494\7\6\2\2\u0494=\3\2\2\2\u0495"+
		"\u0499\7!\2\2\u0496\u0498\t\2\2\2\u0497\u0496\3\2\2\2\u0498\u049b\3\2"+
		"\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\3\2\2\2\u049b"+
		"\u0499\3\2\2\2\u049c\u04a0\7\4\2\2\u049d\u049f\t\2\2\2\u049e\u049d\3\2"+
		"\2\2\u049f\u04a2\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a3\3\2\2\2\u04a2\u04a0\3\2\2\2\u04a3\u04a7\5H%\2\u04a4\u04a6\t\2\2"+
		"\2\u04a5\u04a4\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ab\7\6\2\2\u04ab"+
		"?\3\2\2\2\u04ac\u04b0\7%\2\2\u04ad\u04af\t\2\2\2\u04ae\u04ad\3\2\2\2\u04af"+
		"\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2"+
		"\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b7\7\4\2\2\u04b4\u04b6\t\2\2\2\u04b5"+
		"\u04b4\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2"+
		"\2\2\u04b8\u04ba\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04be\5H%\2\u04bb\u04bd"+
		"\t\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04c2\7\6"+
		"\2\2\u04c2A\3\2\2\2\u04c3\u04c7\7\36\2\2\u04c4\u04c6\t\2\2\2\u04c5\u04c4"+
		"\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8"+
		"\u04ca\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u04ce\7\4\2\2\u04cb\u04cd\t\2"+
		"\2\2\u04cc\u04cb\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d1\u04d5\5H"+
		"%\2\u04d2\u04d4\t\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5"+
		"\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d5\3\2"+
		"\2\2\u04d8\u04d9\7\6\2\2\u04d9C\3\2\2\2\u04da\u04de\7\'\2\2\u04db\u04dd"+
		"\t\2\2\2\u04dc\u04db\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2\2\2\u04de"+
		"\u04df\3\2\2\2\u04df\u04e1\3\2\2\2\u04e0\u04de\3\2\2\2\u04e1\u04e5\7\4"+
		"\2\2\u04e2\u04e4\t\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5"+
		"\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\3\2\2\2\u04e7\u04e5\3\2"+
		"\2\2\u04e8\u04ec\5H%\2\u04e9\u04eb\t\2\2\2\u04ea\u04e9\3\2\2\2\u04eb\u04ee"+
		"\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee"+
		"\u04ec\3\2\2\2\u04ef\u04f0\7\6\2\2\u04f0E\3\2\2\2\u04f1\u04f5\7\b\2\2"+
		"\u04f2\u04f4\t\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3"+
		"\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u0512\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f8"+
		"\u0509\5H%\2\u04f9\u04fb\t\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u04fe\3\2\2"+
		"\2\u04fc\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fc"+
		"\3\2\2\2\u04ff\u0503\7\5\2\2\u0500\u0502\t\2\2\2\u0501\u0500\3\2\2\2\u0502"+
		"\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\3\2"+
		"\2\2\u0505\u0503\3\2\2\2\u0506\u0508\5H%\2\u0507\u04fc\3\2\2\2\u0508\u050b"+
		"\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050f\3\2\2\2\u050b"+
		"\u0509\3\2\2\2\u050c\u050e\t\2\2\2\u050d\u050c\3\2\2\2\u050e\u0511\3\2"+
		"\2\2\u050f\u050d\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0513\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0512\u04f8\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2"+
		"\2\2\u0514\u0515\7\t\2\2\u0515G\3\2\2\2\u0516\u0517\t\3\2\2\u0517I\3\2"+
		"\2\2\u00c6MT[binrwy{\u0082\u0086\u008a\u008c\u008e\u0093\u0097\u009f\u00a5"+
		"\u00ac\u00b3\u00ba\u00c1\u00c6\u00c9\u00cf\u00d6\u00dc\u00e3\u00ea\u00f1"+
		"\u00f6\u00fc\u00fe\u0100\u0107\u010b\u010e\u0113\u0115\u011c\u0122\u0128"+
		"\u012e\u0134\u013a\u0140\u0147\u014e\u0155\u015a\u0160\u0162\u0164\u016b"+
		"\u0172\u0174\u017a\u017c\u017e\u0186\u018c\u0192\u0198\u019f\u01a6\u01ad"+
		"\u01b2\u01b8\u01ba\u01bc\u01c3\u01ca\u01cc\u01d2\u01d4\u01d6\u01df\u01e3"+
		"\u01eb\u01f1\u01f7\u01fd\u0204\u020b\u0212\u0217\u021d\u021f\u0221\u0228"+
		"\u022f\u0231\u0237\u0239\u023b\u0241\u024a\u0250\u0257\u025e\u0265\u026a"+
		"\u0270\u0272\u0274\u027b\u0282\u0284\u028a\u028c\u028e\u0293\u0299\u02a0"+
		"\u02ab\u02b1\u02b8\u02d2\u02ea\u02f0\u02f7\u0300\u0307\u030e\u0315\u031c"+
		"\u0321\u0324\u032c\u0333\u033a\u0343\u034a\u0351\u035a\u0361\u0368\u036f"+
		"\u0376\u037f\u0386\u038d\u0396\u039d\u03a4\u03ab\u03b2\u03bb\u03c2\u03c9"+
		"\u03d0\u03d7\u03e0\u03e7\u03ee\u03f5\u03fc\u0405\u040c\u0413\u041a\u0421"+
		"\u042a\u0431\u0438\u0441\u0448\u044f\u0458\u045f\u0466\u046d\u0472\u0479"+
		"\u0482\u0489\u0490\u0499\u04a0\u04a7\u04b0\u04b7\u04be\u04c7\u04ce\u04d5"+
		"\u04de\u04e5\u04ec\u04f5\u04fc\u0503\u0509\u050f\u0512";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}