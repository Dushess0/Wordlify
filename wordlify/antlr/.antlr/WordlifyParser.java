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
		FILE=32, FOLDER=33, ARGS=34, SIZE=35, READ=36, CREATE=37, LENGTH=38, APPEND=39, 
		CMP_OP=40, ARITH_OP=41, CONCAT_OP=42, LOG_OP=43, BOOL=44, STR=45, ID=46, 
		NUM=47, WS=48, NL=49, END_COMMENT=50;
	public static final int
		RULE_program = 0, RULE_fn_def = 1, RULE_block_instr = 2, RULE_foreach = 3, 
		RULE_while_instr = 4, RULE_if_instr = 5, RULE_if_cond = 6, RULE_then = 7, 
		RULE_else_if = 8, RULE_else_block = 9, RULE_cond = 10, RULE_comparison = 11, 
		RULE_double_comparsion = 12, RULE_expr = 13, RULE_arith_expr = 14, RULE_concat = 15, 
		RULE_fn_call = 16, RULE_atom_instr = 17, RULE_assign = 18, RULE_array_append = 19, 
		RULE_array_elem = 20, RULE_own_fn_call = 21, RULE_exist = 22, RULE_print_instr = 23, 
		RULE_rename = 24, RULE_remove = 25, RULE_move = 26, RULE_copy = 27, RULE_download = 28, 
		RULE_write = 29, RULE_read = 30, RULE_wait_instr = 31, RULE_execute = 32, 
		RULE_get_files = 33, RULE_date_modified = 34, RULE_size = 35, RULE_exit = 36, 
		RULE_create = 37, RULE_length = 38, RULE_array = 39, RULE_value_or_id = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fn_def", "block_instr", "foreach", "while_instr", "if_instr", 
			"if_cond", "then", "else_if", "else_block", "cond", "comparison", "double_comparsion", 
			"expr", "arith_expr", "concat", "fn_call", "atom_instr", "assign", "array_append", 
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
			"'<-'", null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FN", "WHILE", "FOREACH", 
			"IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", 
			"REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", 
			"TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", 
			"READ", "CREATE", "LENGTH", "APPEND", "CMP_OP", "ARITH_OP", "CONCAT_OP", 
			"LOG_OP", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT"
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
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
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
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN) | (1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(129);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(88);
							atom_instr();
							setState(92);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(89);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(94);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(95);
							match(T__0);
							setState(99);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(96);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(101);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(102);
							atom_instr();
							setState(116); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(106);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(103);
									match(WS);
									}
									}
									setState(108);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(109);
								match(NL);
								setState(113);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(110);
										match(WS);
										}
										} 
									}
									setState(115);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								}
								}
								}
								setState(118); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(122);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case WHILE:
							case FOREACH:
							case IF:
								{
								setState(120);
								block_instr();
								}
								break;
							case FN:
								{
								setState(121);
								fn_def();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(125); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(124);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(127); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(148);
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
					setState(134);
					atom_instr();
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(135);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(140);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(141);
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
					setState(146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
					case FOREACH:
					case IF:
						{
						setState(144);
						block_instr();
						}
						break;
					case FN:
						{
						setState(145);
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

			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
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
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_COMMENT) {
				{
				setState(158);
				match(END_COMMENT);
				}
			}

			setState(161);
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
			setState(163);
			match(FN);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(169);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(T__1);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(183);
				match(ID);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(190);
					match(T__2);
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(191);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(197);
					match(ID);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(198);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(211);
			match(T__3);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(BEGIN);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(262);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(224);
							atom_instr();
							setState(228);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(225);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(230);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(231);
							match(T__0);
							setState(235);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(232);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(237);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(238);
							atom_instr();
							setState(252); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(242);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(239);
									match(WS);
									}
									}
									setState(244);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(245);
								match(NL);
								setState(249);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(246);
										match(WS);
										}
										} 
									}
									setState(251);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								}
								}
								}
								setState(254); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(256);
							block_instr();
							setState(258); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(257);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(260); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(278);
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
					setState(267);
					atom_instr();
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(268);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(273);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(274);
						match(T__0);
						}
					}

					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(277);
					block_instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS || _la==NL );
				}
			}

			setState(287);
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				if_instr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				while_instr();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
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
			setState(294);
			match(FOREACH);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(300);
			match(ID);
			setState(302); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(306);
			match(IN);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(312);
			match(ID);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(318);
			match(DO);
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(362);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(324);
							atom_instr();
							setState(328);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(325);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(330);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(331);
							match(T__0);
							setState(335);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(332);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(337);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(338);
							atom_instr();
							setState(352); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(342);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(339);
									match(WS);
									}
									}
									setState(344);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(345);
								match(NL);
								setState(349);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(346);
										match(WS);
										}
										} 
									}
									setState(351);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								}
								}
								}
								setState(354); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(356);
							block_instr();
							setState(358); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(357);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(360); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(388);
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
					setState(367);
					atom_instr();
					setState(371);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(368);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(373);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(380);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(374);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(376); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(375);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(378); 
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
					setState(382);
					block_instr();
					setState(384); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(383);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(386); 
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

			setState(392);
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
			setState(394);
			match(WHILE);
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(400);
			cond();
			setState(402); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(406);
			match(DO);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(450);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(412);
							atom_instr();
							setState(416);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(413);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(418);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(419);
							match(T__0);
							setState(423);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(420);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(425);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(426);
							atom_instr();
							setState(440); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(430);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(427);
									match(WS);
									}
									}
									setState(432);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(433);
								match(NL);
								setState(437);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(434);
										match(WS);
										}
										} 
									}
									setState(439);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								}
								}
								}
								setState(442); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(444);
							block_instr();
							setState(446); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(445);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(448); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(476);
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
					setState(455);
					atom_instr();
					setState(459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(456);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(461);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(468);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(462);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(464); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(463);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(466); 
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
					setState(470);
					block_instr();
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(471);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(474); 
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

			setState(480);
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
			setState(482);
			if_cond();
			setState(483);
			then();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					else_if();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(490);
				else_block();
				}
			}

			setState(493);
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
			setState(495);
			match(IF);
			setState(497); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(496);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(499); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(501);
			cond();
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(505); 
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
			setState(507);
			match(THEN);
			setState(509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(513);
							atom_instr();
							setState(517);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(514);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(519);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(520);
							match(T__0);
							setState(524);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(521);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(526);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(527);
							atom_instr();
							setState(541); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(531);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(528);
									match(WS);
									}
									}
									setState(533);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(534);
								match(NL);
								setState(538);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(535);
										match(WS);
										}
										} 
									}
									setState(540);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								}
								}
								}
								setState(543); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(545);
							block_instr();
							setState(547); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(546);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(549); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(555);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(577);
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
					setState(556);
					atom_instr();
					setState(560);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(557);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(562);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					setState(569);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(563);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(565); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(564);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(567); 
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
					setState(571);
					block_instr();
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
			setState(581);
			match(ELSE);
			setState(583); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(582);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(587);
			if_cond();
			setState(588);
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
			setState(590);
			match(ELSE);
			setState(592); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(591);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(634);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(596);
							atom_instr();
							setState(600);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(597);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(602);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(603);
							match(T__0);
							setState(607);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(604);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(609);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(610);
							atom_instr();
							setState(624); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(614);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(611);
									match(WS);
									}
									}
									setState(616);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(617);
								match(NL);
								setState(621);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(618);
										match(WS);
										}
										} 
									}
									setState(623);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								}
								}
								}
								setState(626); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(628);
							block_instr();
							setState(630); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(629);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(632); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(660);
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
					setState(639);
					atom_instr();
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(640);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(645);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(652);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(646);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(648); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(647);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(650); 
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
					setState(654);
					block_instr();
					setState(656); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(655);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(658); 
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				comparison();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			expr();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(CMP_OP);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(678);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
	}

	public final Double_comparsionContext double_comparsion() throws RecognitionException {
		Double_comparsionContext _localctx = new Double_comparsionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_double_comparsion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			comparison();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			match(LOG_OP);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
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
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				match(STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(704);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(705);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				arith_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(707);
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(708);
				array_elem();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(709);
				concat();
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
		enterRule(_localctx, 28, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			value_or_id();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(713);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(ARITH_OP);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
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

	public static class ConcatContext extends ParserRuleContext {
		public List<Value_or_idContext> value_or_id() {
			return getRuleContexts(Value_or_idContext.class);
		}
		public Value_or_idContext value_or_id(int i) {
			return getRuleContext(Value_or_idContext.class,i);
		}
		public List<TerminalNode> CONCAT_OP() { return getTokens(WordlifyParser.CONCAT_OP); }
		public TerminalNode CONCAT_OP(int i) {
			return getToken(WordlifyParser.CONCAT_OP, i);
		}
		public List<TerminalNode> WS() { return getTokens(WordlifyParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(WordlifyParser.WS, i);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			value_or_id();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(735);
				match(CONCAT_OP);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(736);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				value_or_id();
				}
				}
				setState(745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONCAT_OP );
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
	}

	public final Fn_callContext fn_call() throws RecognitionException {
		Fn_callContext _localctx = new Fn_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fn_call);
		try {
			setState(769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				own_fn_call();
				}
				break;
			case EXIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				exist();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				print_instr();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				rename();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				remove();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(752);
				move();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 7);
				{
				setState(753);
				copy();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(754);
				download();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(755);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 10);
				{
				setState(756);
				read();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(757);
				wait_instr();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(758);
				execute();
				}
				break;
			case GET_FILES:
				enterOuterAlt(_localctx, 13);
				{
				setState(759);
				get_files();
				}
				break;
			case DATE_MODIFIED:
				enterOuterAlt(_localctx, 14);
				{
				setState(760);
				date_modified();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 15);
				{
				setState(761);
				size();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 16);
				{
				setState(762);
				exit();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 17);
				{
				setState(763);
				create();
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 18);
				{
				setState(764);
				length();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 19);
				{
				setState(765);
				match(TIME);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 20);
				{
				setState(766);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 21);
				{
				setState(767);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 22);
				{
				setState(768);
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
	}

	public final Atom_instrContext atom_instr() throws RecognitionException {
		Atom_instrContext _localctx = new Atom_instrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom_instr);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				own_fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				exist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				print_instr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(774);
				rename();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(775);
				remove();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(776);
				move();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(777);
				copy();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(778);
				download();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(779);
				write();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(780);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(781);
				wait_instr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(782);
				execute();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(783);
				get_files();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(784);
				date_modified();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(785);
				size();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(786);
				exit();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(787);
				create();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(788);
				array_append();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(789);
				assign();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(790);
				match(TIME);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(791);
				match(FILE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(792);
				match(FOLDER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(793);
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
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(796);
				match(ID);
				}
				break;
			case 2:
				{
				setState(797);
				array_elem();
				}
				break;
			}
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(800);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(T__4);
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
	}

	public final Array_appendContext array_append() throws RecognitionException {
		Array_appendContext _localctx = new Array_appendContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_append);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(ID);
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
			match(APPEND);
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
			expr();
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
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
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(ID);
			setState(837);
			match(T__5);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(838);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			expr();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(845);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
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
	}

	public final Own_fn_callContext own_fn_call() throws RecognitionException {
		Own_fn_callContext _localctx = new Own_fn_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_own_fn_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(ID);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(854);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(860);
			match(T__1);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(861);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(867);
				value_or_id();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(868);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(874);
					match(T__2);
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(875);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(881);
					value_or_id();
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(882);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(887);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(895);
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
		enterRule(_localctx, 44, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(EXIST);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(898);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			match(T__1);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(905);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(911);
			value_or_id();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(912);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(918);
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
		enterRule(_localctx, 46, RULE_print_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(PRINT);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(921);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(927);
			match(T__1);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(928);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
			value_or_id();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(935);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941);
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
		enterRule(_localctx, 48, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			match(RENAME);
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(944);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(950);
			match(T__1);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(951);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			value_or_id();
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(958);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(964);
			match(T__2);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(965);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			value_or_id();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(972);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(978);
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
		enterRule(_localctx, 50, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(REMOVE);
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(981);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987);
			match(T__1);
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(988);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(994);
			value_or_id();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(995);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1001);
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
		enterRule(_localctx, 52, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(MOVE);
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1004);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1010);
			match(T__1);
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			value_or_id();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1018);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1024);
			match(T__2);
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1025);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			value_or_id();
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1032);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1038);
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
		enterRule(_localctx, 54, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(COPY);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1041);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1047);
			match(T__1);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1048);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			value_or_id();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1055);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1061);
			match(T__2);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1062);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1068);
			value_or_id();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1075);
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
		enterRule(_localctx, 56, RULE_download);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(DOWNLOAD);
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1078);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084);
			match(T__1);
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1085);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1091);
			value_or_id();
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1092);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1098);
			match(T__2);
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1099);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1105);
			value_or_id();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1106);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
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
		enterRule(_localctx, 58, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(WRITE);
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1115);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1121);
			match(T__1);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1122);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1128);
			value_or_id();
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1129);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1135);
			match(T__2);
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1136);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1142);
			value_or_id();
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1143);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1149);
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
		enterRule(_localctx, 60, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(READ);
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1152);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1158);
			match(T__1);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1159);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1165);
			value_or_id();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1166);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1172);
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
		enterRule(_localctx, 62, RULE_wait_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(WAIT);
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1175);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1181);
			match(T__1);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1182);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1188);
			value_or_id();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1189);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195);
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
		enterRule(_localctx, 64, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(EXECUTE);
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1198);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1204);
			match(T__1);
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1205);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1211);
					value_or_id();
					setState(1215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1212);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1218);
					match(T__2);
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1219);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(1229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1230);
			value_or_id();
			setState(1234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1231);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1237);
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
		enterRule(_localctx, 66, RULE_get_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			match(GET_FILES);
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1240);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1246);
			match(T__1);
			setState(1250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1247);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1253);
			value_or_id();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1254);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1260);
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
		enterRule(_localctx, 68, RULE_date_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(DATE_MODIFIED);
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1263);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1269);
			match(T__1);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1270);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1276);
			value_or_id();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1277);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1283);
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
		enterRule(_localctx, 70, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(SIZE);
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1286);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1292);
			match(T__1);
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1293);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1299);
			value_or_id();
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1300);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1306);
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
		enterRule(_localctx, 72, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(EXIT);
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1309);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1315);
			match(T__1);
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1316);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1322);
			value_or_id();
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1323);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1329);
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
		enterRule(_localctx, 74, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(CREATE);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1332);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1338);
			match(T__1);
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1339);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1345);
			value_or_id();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1346);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1352);
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
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(LENGTH);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1355);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			match(T__1);
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1362);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1368);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(1369);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1372);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1378);
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
		enterRule(_localctx, 78, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(T__5);
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1381);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(1387);
				value_or_id();
				setState(1404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1391);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS || _la==NL) {
							{
							{
							setState(1388);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(1393);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1394);
						match(T__2);
						setState(1398);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WS || _la==NL) {
							{
							{
							setState(1395);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(1400);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1401);
						value_or_id();
						}
						} 
					}
					setState(1406);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(1407);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1415);
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
		enterRule(_localctx, 80, RULE_value_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u058e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2\16\2`\13\2\3\2\3\2\7\2d\n\2"+
		"\f\2\16\2g\13\2\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\7\2r\n\2\f\2\16"+
		"\2u\13\2\6\2w\n\2\r\2\16\2x\3\2\3\2\5\2}\n\2\3\2\6\2\u0080\n\2\r\2\16"+
		"\2\u0081\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2\7\2\u008b\n\2\f\2\16"+
		"\2\u008e\13\2\3\2\5\2\u0091\n\2\3\2\3\2\5\2\u0095\n\2\5\2\u0097\n\2\5"+
		"\2\u0099\n\2\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2\3\2\5\2\u00a2\n\2\3"+
		"\2\3\2\3\3\3\3\6\3\u00a8\n\3\r\3\16\3\u00a9\3\3\3\3\7\3\u00ae\n\3\f\3"+
		"\16\3\u00b1\13\3\3\3\3\3\7\3\u00b5\n\3\f\3\16\3\u00b8\13\3\3\3\3\3\7\3"+
		"\u00bc\n\3\f\3\16\3\u00bf\13\3\3\3\3\3\7\3\u00c3\n\3\f\3\16\3\u00c6\13"+
		"\3\3\3\3\3\7\3\u00ca\n\3\f\3\16\3\u00cd\13\3\7\3\u00cf\n\3\f\3\16\3\u00d2"+
		"\13\3\5\3\u00d4\n\3\3\3\3\3\7\3\u00d8\n\3\f\3\16\3\u00db\13\3\3\3\3\3"+
		"\6\3\u00df\n\3\r\3\16\3\u00e0\3\3\3\3\7\3\u00e5\n\3\f\3\16\3\u00e8\13"+
		"\3\3\3\3\3\7\3\u00ec\n\3\f\3\16\3\u00ef\13\3\3\3\3\3\7\3\u00f3\n\3\f\3"+
		"\16\3\u00f6\13\3\3\3\3\3\7\3\u00fa\n\3\f\3\16\3\u00fd\13\3\6\3\u00ff\n"+
		"\3\r\3\16\3\u0100\3\3\3\3\6\3\u0105\n\3\r\3\16\3\u0106\7\3\u0109\n\3\f"+
		"\3\16\3\u010c\13\3\3\3\3\3\7\3\u0110\n\3\f\3\16\3\u0113\13\3\3\3\5\3\u0116"+
		"\n\3\3\3\5\3\u0119\n\3\3\3\6\3\u011c\n\3\r\3\16\3\u011d\5\3\u0120\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\5\4\u0127\n\4\3\5\3\5\6\5\u012b\n\5\r\5\16\5\u012c"+
		"\3\5\3\5\6\5\u0131\n\5\r\5\16\5\u0132\3\5\3\5\6\5\u0137\n\5\r\5\16\5\u0138"+
		"\3\5\3\5\6\5\u013d\n\5\r\5\16\5\u013e\3\5\3\5\6\5\u0143\n\5\r\5\16\5\u0144"+
		"\3\5\3\5\7\5\u0149\n\5\f\5\16\5\u014c\13\5\3\5\3\5\7\5\u0150\n\5\f\5\16"+
		"\5\u0153\13\5\3\5\3\5\7\5\u0157\n\5\f\5\16\5\u015a\13\5\3\5\3\5\7\5\u015e"+
		"\n\5\f\5\16\5\u0161\13\5\6\5\u0163\n\5\r\5\16\5\u0164\3\5\3\5\6\5\u0169"+
		"\n\5\r\5\16\5\u016a\7\5\u016d\n\5\f\5\16\5\u0170\13\5\3\5\3\5\7\5\u0174"+
		"\n\5\f\5\16\5\u0177\13\5\3\5\3\5\6\5\u017b\n\5\r\5\16\5\u017c\5\5\u017f"+
		"\n\5\3\5\3\5\6\5\u0183\n\5\r\5\16\5\u0184\5\5\u0187\n\5\5\5\u0189\n\5"+
		"\3\5\3\5\3\6\3\6\6\6\u018f\n\6\r\6\16\6\u0190\3\6\3\6\6\6\u0195\n\6\r"+
		"\6\16\6\u0196\3\6\3\6\6\6\u019b\n\6\r\6\16\6\u019c\3\6\3\6\7\6\u01a1\n"+
		"\6\f\6\16\6\u01a4\13\6\3\6\3\6\7\6\u01a8\n\6\f\6\16\6\u01ab\13\6\3\6\3"+
		"\6\7\6\u01af\n\6\f\6\16\6\u01b2\13\6\3\6\3\6\7\6\u01b6\n\6\f\6\16\6\u01b9"+
		"\13\6\6\6\u01bb\n\6\r\6\16\6\u01bc\3\6\3\6\6\6\u01c1\n\6\r\6\16\6\u01c2"+
		"\7\6\u01c5\n\6\f\6\16\6\u01c8\13\6\3\6\3\6\7\6\u01cc\n\6\f\6\16\6\u01cf"+
		"\13\6\3\6\3\6\6\6\u01d3\n\6\r\6\16\6\u01d4\5\6\u01d7\n\6\3\6\3\6\6\6\u01db"+
		"\n\6\r\6\16\6\u01dc\5\6\u01df\n\6\5\6\u01e1\n\6\3\6\3\6\3\7\3\7\3\7\7"+
		"\7\u01e8\n\7\f\7\16\7\u01eb\13\7\3\7\5\7\u01ee\n\7\3\7\3\7\3\b\3\b\6\b"+
		"\u01f4\n\b\r\b\16\b\u01f5\3\b\3\b\6\b\u01fa\n\b\r\b\16\b\u01fb\3\t\3\t"+
		"\6\t\u0200\n\t\r\t\16\t\u0201\3\t\3\t\7\t\u0206\n\t\f\t\16\t\u0209\13"+
		"\t\3\t\3\t\7\t\u020d\n\t\f\t\16\t\u0210\13\t\3\t\3\t\7\t\u0214\n\t\f\t"+
		"\16\t\u0217\13\t\3\t\3\t\7\t\u021b\n\t\f\t\16\t\u021e\13\t\6\t\u0220\n"+
		"\t\r\t\16\t\u0221\3\t\3\t\6\t\u0226\n\t\r\t\16\t\u0227\7\t\u022a\n\t\f"+
		"\t\16\t\u022d\13\t\3\t\3\t\7\t\u0231\n\t\f\t\16\t\u0234\13\t\3\t\3\t\6"+
		"\t\u0238\n\t\r\t\16\t\u0239\5\t\u023c\n\t\3\t\3\t\6\t\u0240\n\t\r\t\16"+
		"\t\u0241\5\t\u0244\n\t\5\t\u0246\n\t\3\n\3\n\6\n\u024a\n\n\r\n\16\n\u024b"+
		"\3\n\3\n\3\n\3\13\3\13\6\13\u0253\n\13\r\13\16\13\u0254\3\13\3\13\7\13"+
		"\u0259\n\13\f\13\16\13\u025c\13\13\3\13\3\13\7\13\u0260\n\13\f\13\16\13"+
		"\u0263\13\13\3\13\3\13\7\13\u0267\n\13\f\13\16\13\u026a\13\13\3\13\3\13"+
		"\7\13\u026e\n\13\f\13\16\13\u0271\13\13\6\13\u0273\n\13\r\13\16\13\u0274"+
		"\3\13\3\13\6\13\u0279\n\13\r\13\16\13\u027a\7\13\u027d\n\13\f\13\16\13"+
		"\u0280\13\13\3\13\3\13\7\13\u0284\n\13\f\13\16\13\u0287\13\13\3\13\3\13"+
		"\6\13\u028b\n\13\r\13\16\13\u028c\5\13\u028f\n\13\3\13\3\13\6\13\u0293"+
		"\n\13\r\13\16\13\u0294\5\13\u0297\n\13\5\13\u0299\n\13\3\f\3\f\3\f\3\f"+
		"\5\f\u029f\n\f\3\r\3\r\7\r\u02a3\n\r\f\r\16\r\u02a6\13\r\3\r\3\r\7\r\u02aa"+
		"\n\r\f\r\16\r\u02ad\13\r\3\r\3\r\3\16\3\16\7\16\u02b3\n\16\f\16\16\16"+
		"\u02b6\13\16\3\16\3\16\7\16\u02ba\n\16\f\16\16\16\u02bd\13\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02c9\n\17\3\20\3\20\7\20"+
		"\u02cd\n\20\f\20\16\20\u02d0\13\20\3\20\3\20\7\20\u02d4\n\20\f\20\16\20"+
		"\u02d7\13\20\3\20\3\20\3\21\3\21\7\21\u02dd\n\21\f\21\16\21\u02e0\13\21"+
		"\3\21\3\21\7\21\u02e4\n\21\f\21\16\21\u02e7\13\21\3\21\6\21\u02ea\n\21"+
		"\r\21\16\21\u02eb\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0304"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u031d\n\23\3\24"+
		"\3\24\5\24\u0321\n\24\3\24\7\24\u0324\n\24\f\24\16\24\u0327\13\24\3\24"+
		"\3\24\7\24\u032b\n\24\f\24\16\24\u032e\13\24\3\24\3\24\3\25\3\25\7\25"+
		"\u0334\n\25\f\25\16\25\u0337\13\25\3\25\3\25\7\25\u033b\n\25\f\25\16\25"+
		"\u033e\13\25\3\25\3\25\7\25\u0342\n\25\f\25\16\25\u0345\13\25\3\26\3\26"+
		"\3\26\7\26\u034a\n\26\f\26\16\26\u034d\13\26\3\26\3\26\7\26\u0351\n\26"+
		"\f\26\16\26\u0354\13\26\3\26\3\26\3\27\3\27\7\27\u035a\n\27\f\27\16\27"+
		"\u035d\13\27\3\27\3\27\7\27\u0361\n\27\f\27\16\27\u0364\13\27\3\27\3\27"+
		"\7\27\u0368\n\27\f\27\16\27\u036b\13\27\3\27\3\27\7\27\u036f\n\27\f\27"+
		"\16\27\u0372\13\27\3\27\3\27\7\27\u0376\n\27\f\27\16\27\u0379\13\27\7"+
		"\27\u037b\n\27\f\27\16\27\u037e\13\27\5\27\u0380\n\27\3\27\3\27\3\30\3"+
		"\30\7\30\u0386\n\30\f\30\16\30\u0389\13\30\3\30\3\30\7\30\u038d\n\30\f"+
		"\30\16\30\u0390\13\30\3\30\3\30\7\30\u0394\n\30\f\30\16\30\u0397\13\30"+
		"\3\30\3\30\3\31\3\31\7\31\u039d\n\31\f\31\16\31\u03a0\13\31\3\31\3\31"+
		"\7\31\u03a4\n\31\f\31\16\31\u03a7\13\31\3\31\3\31\7\31\u03ab\n\31\f\31"+
		"\16\31\u03ae\13\31\3\31\3\31\3\32\3\32\7\32\u03b4\n\32\f\32\16\32\u03b7"+
		"\13\32\3\32\3\32\7\32\u03bb\n\32\f\32\16\32\u03be\13\32\3\32\3\32\7\32"+
		"\u03c2\n\32\f\32\16\32\u03c5\13\32\3\32\3\32\7\32\u03c9\n\32\f\32\16\32"+
		"\u03cc\13\32\3\32\3\32\7\32\u03d0\n\32\f\32\16\32\u03d3\13\32\3\32\3\32"+
		"\3\33\3\33\7\33\u03d9\n\33\f\33\16\33\u03dc\13\33\3\33\3\33\7\33\u03e0"+
		"\n\33\f\33\16\33\u03e3\13\33\3\33\3\33\7\33\u03e7\n\33\f\33\16\33\u03ea"+
		"\13\33\3\33\3\33\3\34\3\34\7\34\u03f0\n\34\f\34\16\34\u03f3\13\34\3\34"+
		"\3\34\7\34\u03f7\n\34\f\34\16\34\u03fa\13\34\3\34\3\34\7\34\u03fe\n\34"+
		"\f\34\16\34\u0401\13\34\3\34\3\34\7\34\u0405\n\34\f\34\16\34\u0408\13"+
		"\34\3\34\3\34\7\34\u040c\n\34\f\34\16\34\u040f\13\34\3\34\3\34\3\35\3"+
		"\35\7\35\u0415\n\35\f\35\16\35\u0418\13\35\3\35\3\35\7\35\u041c\n\35\f"+
		"\35\16\35\u041f\13\35\3\35\3\35\7\35\u0423\n\35\f\35\16\35\u0426\13\35"+
		"\3\35\3\35\7\35\u042a\n\35\f\35\16\35\u042d\13\35\3\35\3\35\7\35\u0431"+
		"\n\35\f\35\16\35\u0434\13\35\3\35\3\35\3\36\3\36\7\36\u043a\n\36\f\36"+
		"\16\36\u043d\13\36\3\36\3\36\7\36\u0441\n\36\f\36\16\36\u0444\13\36\3"+
		"\36\3\36\7\36\u0448\n\36\f\36\16\36\u044b\13\36\3\36\3\36\7\36\u044f\n"+
		"\36\f\36\16\36\u0452\13\36\3\36\3\36\7\36\u0456\n\36\f\36\16\36\u0459"+
		"\13\36\3\36\3\36\3\37\3\37\7\37\u045f\n\37\f\37\16\37\u0462\13\37\3\37"+
		"\3\37\7\37\u0466\n\37\f\37\16\37\u0469\13\37\3\37\3\37\7\37\u046d\n\37"+
		"\f\37\16\37\u0470\13\37\3\37\3\37\7\37\u0474\n\37\f\37\16\37\u0477\13"+
		"\37\3\37\3\37\7\37\u047b\n\37\f\37\16\37\u047e\13\37\3\37\3\37\3 \3 \7"+
		" \u0484\n \f \16 \u0487\13 \3 \3 \7 \u048b\n \f \16 \u048e\13 \3 \3 \7"+
		" \u0492\n \f \16 \u0495\13 \3 \3 \3!\3!\7!\u049b\n!\f!\16!\u049e\13!\3"+
		"!\3!\7!\u04a2\n!\f!\16!\u04a5\13!\3!\3!\7!\u04a9\n!\f!\16!\u04ac\13!\3"+
		"!\3!\3\"\3\"\7\"\u04b2\n\"\f\"\16\"\u04b5\13\"\3\"\3\"\7\"\u04b9\n\"\f"+
		"\"\16\"\u04bc\13\"\3\"\3\"\7\"\u04c0\n\"\f\"\16\"\u04c3\13\"\3\"\3\"\7"+
		"\"\u04c7\n\"\f\"\16\"\u04ca\13\"\7\"\u04cc\n\"\f\"\16\"\u04cf\13\"\3\""+
		"\3\"\7\"\u04d3\n\"\f\"\16\"\u04d6\13\"\3\"\3\"\3#\3#\7#\u04dc\n#\f#\16"+
		"#\u04df\13#\3#\3#\7#\u04e3\n#\f#\16#\u04e6\13#\3#\3#\7#\u04ea\n#\f#\16"+
		"#\u04ed\13#\3#\3#\3$\3$\7$\u04f3\n$\f$\16$\u04f6\13$\3$\3$\7$\u04fa\n"+
		"$\f$\16$\u04fd\13$\3$\3$\7$\u0501\n$\f$\16$\u0504\13$\3$\3$\3%\3%\7%\u050a"+
		"\n%\f%\16%\u050d\13%\3%\3%\7%\u0511\n%\f%\16%\u0514\13%\3%\3%\7%\u0518"+
		"\n%\f%\16%\u051b\13%\3%\3%\3&\3&\7&\u0521\n&\f&\16&\u0524\13&\3&\3&\7"+
		"&\u0528\n&\f&\16&\u052b\13&\3&\3&\7&\u052f\n&\f&\16&\u0532\13&\3&\3&\3"+
		"\'\3\'\7\'\u0538\n\'\f\'\16\'\u053b\13\'\3\'\3\'\7\'\u053f\n\'\f\'\16"+
		"\'\u0542\13\'\3\'\3\'\7\'\u0546\n\'\f\'\16\'\u0549\13\'\3\'\3\'\3(\3("+
		"\7(\u054f\n(\f(\16(\u0552\13(\3(\3(\7(\u0556\n(\f(\16(\u0559\13(\3(\3"+
		"(\5(\u055d\n(\3(\7(\u0560\n(\f(\16(\u0563\13(\3(\3(\3)\3)\7)\u0569\n)"+
		"\f)\16)\u056c\13)\3)\3)\7)\u0570\n)\f)\16)\u0573\13)\3)\3)\7)\u0577\n"+
		")\f)\16)\u057a\13)\3)\7)\u057d\n)\f)\16)\u0580\13)\3)\7)\u0583\n)\f)\16"+
		")\u0586\13)\5)\u0588\n)\3)\3)\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\4\3\2\62\63\3\2.\61"+
		"\2\u066f\2W\3\2\2\2\4\u00a5\3\2\2\2\6\u0126\3\2\2\2\b\u0128\3\2\2\2\n"+
		"\u018c\3\2\2\2\f\u01e4\3\2\2\2\16\u01f1\3\2\2\2\20\u01fd\3\2\2\2\22\u0247"+
		"\3\2\2\2\24\u0250\3\2\2\2\26\u029e\3\2\2\2\30\u02a0\3\2\2\2\32\u02b0\3"+
		"\2\2\2\34\u02c8\3\2\2\2\36\u02ca\3\2\2\2 \u02da\3\2\2\2\"\u0303\3\2\2"+
		"\2$\u031c\3\2\2\2&\u0320\3\2\2\2(\u0331\3\2\2\2*\u0346\3\2\2\2,\u0357"+
		"\3\2\2\2.\u0383\3\2\2\2\60\u039a\3\2\2\2\62\u03b1\3\2\2\2\64\u03d6\3\2"+
		"\2\2\66\u03ed\3\2\2\28\u0412\3\2\2\2:\u0437\3\2\2\2<\u045c\3\2\2\2>\u0481"+
		"\3\2\2\2@\u0498\3\2\2\2B\u04af\3\2\2\2D\u04d9\3\2\2\2F\u04f0\3\2\2\2H"+
		"\u0507\3\2\2\2J\u051e\3\2\2\2L\u0535\3\2\2\2N\u054c\3\2\2\2P\u0566\3\2"+
		"\2\2R\u058b\3\2\2\2TV\t\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2"+
		"X\u0098\3\2\2\2YW\3\2\2\2Z^\5$\23\2[]\t\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ae\7\3\2\2bd\t\2\2\2cb\3\2\2\2d"+
		"g\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\u0084\3\2\2\2ge\3\2\2\2hv\5$\23\2ik\7\62"+
		"\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2os\7\63"+
		"\2\2pr\7\62\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2vl\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0084\3\2\2\2z}\5\6\4"+
		"\2{}\5\4\3\2|z\3\2\2\2|{\3\2\2\2}\177\3\2\2\2~\u0080\t\2\2\2\177~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083Z\3\2\2\2\u0083h\3\2\2\2\u0083|\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0096\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008c\5$\23\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7\3\2\2\u0090\u008f\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0097\3\2\2\2\u0092\u0095\5\6\4\2\u0093"+
		"\u0095\5\4\3\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0088\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0085\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u009c\t\2"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\64"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\7\2\2\3\u00a4\3\3\2\2\2\u00a5\u00a7\7\n\2\2\u00a6\u00a8\t\2\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00af\7\60\2\2\u00ac\u00ae\t\2\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\7\4\2\2\u00b3"+
		"\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00d3\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bd\7\60\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c4\7\5\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\7\60\2\2\u00c8\u00ca\t"+
		"\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00c0\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00b9\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\7\6\2\2\u00d6\u00d8\t\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\22\2\2\u00dd"+
		"\u00df\t\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u011f\3\2\2\2\u00e2\u00e6\5$\23\2\u00e3"+
		"\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ed\7\3\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u0109\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00fe\5$\23\2\u00f1\u00f3\7\62\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\7\63\2\2\u00f8\u00fa\7"+
		"\62\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f4\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0109\3\2\2\2\u0102\u0104\5\6\4\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u00e2\3\2\2\2\u0108\u00f0\3\2\2\2\u0108\u0102\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0118\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\5$\23\2\u010e\u0110\t\2"+
		"\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\7\3"+
		"\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0119\5\6\4\2\u0118\u010d\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u010a\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\23\2\2\u0122"+
		"\5\3\2\2\2\u0123\u0127\5\f\7\2\u0124\u0127\5\n\6\2\u0125\u0127\5\b\5\2"+
		"\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\7\3"+
		"\2\2\2\u0128\u012a\7\f\2\2\u0129\u012b\t\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\7\60\2\2\u012f\u0131\t\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0136\7\r\2\2\u0135\u0137\t\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\7\60\2\2\u013b\u013d\t\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\7\16\2\2\u0141\u0143\t\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0188\3\2"+
		"\2\2\u0146\u014a\5$\23\2\u0147\u0149\t\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u0151\7\3\2\2\u014e\u0150\t\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u016d\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0162\5$\23\2\u0155"+
		"\u0157\7\62\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015f\7\63\2\2\u015c\u015e\7\62\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0158\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u016d\3\2\2\2\u0166\u0168\5\6\4\2\u0167"+
		"\u0169\t\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0146\3\2\2\2\u016c"+
		"\u0154\3\2\2\2\u016c\u0166\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0186\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0175\5$\23\2\u0172\u0174\t\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017e\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017f\7\3\2\2\u0179\u017b\t\2\2\2\u017a\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0178\3\2\2\2\u017e\u017a\3\2\2\2\u017f\u0187\3\2"+
		"\2\2\u0180\u0182\5\6\4\2\u0181\u0183\t\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0171\3\2\2\2\u0186\u0180\3\2\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u016e\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7\23"+
		"\2\2\u018b\t\3\2\2\2\u018c\u018e\7\13\2\2\u018d\u018f\t\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\5\26\f\2\u0193\u0195\t\2\2\2\u0194\u0193\3"+
		"\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\7\16\2\2\u0199\u019b\t\2\2\2\u019a\u0199\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u01e0\3\2\2\2\u019e\u01a2\5$\23\2\u019f\u01a1\t\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a9\7\3\2\2\u01a6\u01a8\t\2"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01c5\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ba\5$"+
		"\23\2\u01ad\u01af\7\62\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b7\7\63\2\2\u01b4\u01b6\7\62\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01b0\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c5\3\2\2\2\u01be\u01c0\5\6"+
		"\4\2\u01bf\u01c1\t\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u019e\3\2"+
		"\2\2\u01c4\u01ac\3\2\2\2\u01c4\u01be\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01de\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01cd\5$\23\2\u01ca\u01cc\t\2\2\2\u01cb\u01ca\3\2\2\2\u01cc"+
		"\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d6\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d7\7\3\2\2\u01d1\u01d3\t\2\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d0\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d7"+
		"\u01df\3\2\2\2\u01d8\u01da\5\6\4\2\u01d9\u01db\t\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01c9\3\2\2\2\u01de\u01d8\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01c6\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\7\23\2\2\u01e3\13\3\2\2\2\u01e4\u01e5\5\16\b\2\u01e5\u01e9\5\20"+
		"\t\2\u01e6\u01e8\5\22\n\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ee\5\24\13\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\7\23\2\2\u01f0\r\3\2\2\2\u01f1\u01f3\7\17\2"+
		"\2\u01f2\u01f4\t\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\5\26\f\2"+
		"\u01f8\u01fa\t\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\17\3\2\2\2\u01fd\u01ff\7\20\2\2\u01fe"+
		"\u0200\t\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0245\3\2\2\2\u0203\u0207\5$\23\2\u0204"+
		"\u0206\t\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"\u020e\7\3\2\2\u020b\u020d\t\2\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u022a\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0211\u021f\5$\23\2\u0212\u0214\7\62\2\2\u0213\u0212\3"+
		"\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021c\7\63\2\2\u0219\u021b\7"+
		"\62\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0215\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u022a\3\2\2\2\u0223\u0225\5\6\4\2\u0224\u0226\t\2\2\2\u0225\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0203\3\2\2\2\u0229\u0211\3\2\2\2\u0229\u0223\3\2"+
		"\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u0243\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0232\5$\23\2\u022f\u0231\t\2"+
		"\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u023b\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u023c\7\3"+
		"\2\2\u0236\u0238\t\2\2\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0235\3\2"+
		"\2\2\u023b\u0237\3\2\2\2\u023c\u0244\3\2\2\2\u023d\u023f\5\6\4\2\u023e"+
		"\u0240\t\2\2\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u022e\3\2\2\2\u0243"+
		"\u023d\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u022b\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\21\3\2\2\2\u0247\u0249\7\21\2\2\u0248\u024a\t\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\5\16\b\2\u024e\u024f\5\20\t\2\u024f\23\3\2"+
		"\2\2\u0250\u0252\7\21\2\2\u0251\u0253\t\2\2\2\u0252\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0298\3\2"+
		"\2\2\u0256\u025a\5$\23\2\u0257\u0259\t\2\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u0261\7\3\2\2\u025e\u0260\t\2\2\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u027d\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0272\5$\23\2\u0265"+
		"\u0267\7\62\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3"+
		"\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b"+
		"\u026f\7\63\2\2\u026c\u026e\7\62\2\2\u026d\u026c\3\2\2\2\u026e\u0271\3"+
		"\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0268\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u027d\3\2\2\2\u0276\u0278\5\6\4\2\u0277"+
		"\u0279\t\2\2\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u0256\3\2\2\2\u027c"+
		"\u0264\3\2\2\2\u027c\u0276\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0296\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0285\5$\23\2\u0282\u0284\t\2\2\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2"+
		"\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028e\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u028f\7\3\2\2\u0289\u028b\t\2\2\2\u028a\u0289\3\2"+
		"\2\2\u028b\u028c\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028f\3\2\2\2\u028e\u0288\3\2\2\2\u028e\u028a\3\2\2\2\u028f\u0297\3\2"+
		"\2\2\u0290\u0292\5\6\4\2\u0291\u0293\t\2\2\2\u0292\u0291\3\2\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2"+
		"\2\2\u0296\u0281\3\2\2\2\u0296\u0290\3\2\2\2\u0297\u0299\3\2\2\2\u0298"+
		"\u027e\3\2\2\2\u0298\u0299\3\2\2\2\u0299\25\3\2\2\2\u029a\u029f\5\"\22"+
		"\2\u029b\u029f\7.\2\2\u029c\u029f\5\30\r\2\u029d\u029f\5\32\16\2\u029e"+
		"\u029a\3\2\2\2\u029e\u029b\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2"+
		"\2\2\u029f\27\3\2\2\2\u02a0\u02a4\5\34\17\2\u02a1\u02a3\t\2\2\2\u02a2"+
		"\u02a1\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02ab\7*\2\2\u02a8"+
		"\u02aa\t\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02af\5\34\17\2\u02af\31\3\2\2\2\u02b0\u02b4\5\30\r\2\u02b1\u02b3\t\2"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02bb\7-"+
		"\2\2\u02b8\u02ba\t\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02bf\5\30\r\2\u02bf\33\3\2\2\2\u02c0\u02c9\5\"\22\2\u02c1"+
		"\u02c9\7/\2\2\u02c2\u02c9\7\61\2\2\u02c3\u02c9\7\60\2\2\u02c4\u02c9\5"+
		"\36\20\2\u02c5\u02c9\5P)\2\u02c6\u02c9\5*\26\2\u02c7\u02c9\5 \21\2\u02c8"+
		"\u02c0\3\2\2\2\u02c8\u02c1\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c3\3\2"+
		"\2\2\u02c8\u02c4\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c7\3\2\2\2\u02c9\35\3\2\2\2\u02ca\u02ce\5R*\2\u02cb\u02cd\t\2\2\2"+
		"\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d5\7+\2\2\u02d2"+
		"\u02d4\t\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8"+
		"\u02d9\5R*\2\u02d9\37\3\2\2\2\u02da\u02de\5R*\2\u02db\u02dd\t\2\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u02e9\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e5\7,\2\2\u02e2"+
		"\u02e4\t\2\2\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8"+
		"\u02ea\5R*\2\u02e9\u02e1\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02e9\3\2\2"+
		"\2\u02eb\u02ec\3\2\2\2\u02ec!\3\2\2\2\u02ed\u0304\5,\27\2\u02ee\u0304"+
		"\5.\30\2\u02ef\u0304\5\60\31\2\u02f0\u0304\5\62\32\2\u02f1\u0304\5\64"+
		"\33\2\u02f2\u0304\5\66\34\2\u02f3\u0304\58\35\2\u02f4\u0304\5:\36\2\u02f5"+
		"\u0304\5<\37\2\u02f6\u0304\5> \2\u02f7\u0304\5@!\2\u02f8\u0304\5B\"\2"+
		"\u02f9\u0304\5D#\2\u02fa\u0304\5F$\2\u02fb\u0304\5H%\2\u02fc\u0304\5J"+
		"&\2\u02fd\u0304\5L\'\2\u02fe\u0304\5N(\2\u02ff\u0304\7\37\2\2\u0300\u0304"+
		"\7\"\2\2\u0301\u0304\7#\2\2\u0302\u0304\7$\2\2\u0303\u02ed\3\2\2\2\u0303"+
		"\u02ee\3\2\2\2\u0303\u02ef\3\2\2\2\u0303\u02f0\3\2\2\2\u0303\u02f1\3\2"+
		"\2\2\u0303\u02f2\3\2\2\2\u0303\u02f3\3\2\2\2\u0303\u02f4\3\2\2\2\u0303"+
		"\u02f5\3\2\2\2\u0303\u02f6\3\2\2\2\u0303\u02f7\3\2\2\2\u0303\u02f8\3\2"+
		"\2\2\u0303\u02f9\3\2\2\2\u0303\u02fa\3\2\2\2\u0303\u02fb\3\2\2\2\u0303"+
		"\u02fc\3\2\2\2\u0303\u02fd\3\2\2\2\u0303\u02fe\3\2\2\2\u0303\u02ff\3\2"+
		"\2\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304"+
		"#\3\2\2\2\u0305\u031d\5,\27\2\u0306\u031d\5.\30\2\u0307\u031d\5\60\31"+
		"\2\u0308\u031d\5\62\32\2\u0309\u031d\5\64\33\2\u030a\u031d\5\66\34\2\u030b"+
		"\u031d\58\35\2\u030c\u031d\5:\36\2\u030d\u031d\5<\37\2\u030e\u031d\5>"+
		" \2\u030f\u031d\5@!\2\u0310\u031d\5B\"\2\u0311\u031d\5D#\2\u0312\u031d"+
		"\5F$\2\u0313\u031d\5H%\2\u0314\u031d\5J&\2\u0315\u031d\5L\'\2\u0316\u031d"+
		"\5(\25\2\u0317\u031d\5&\24\2\u0318\u031d\7\37\2\2\u0319\u031d\7\"\2\2"+
		"\u031a\u031d\7#\2\2\u031b\u031d\7$\2\2\u031c\u0305\3\2\2\2\u031c\u0306"+
		"\3\2\2\2\u031c\u0307\3\2\2\2\u031c\u0308\3\2\2\2\u031c\u0309\3\2\2\2\u031c"+
		"\u030a\3\2\2\2\u031c\u030b\3\2\2\2\u031c\u030c\3\2\2\2\u031c\u030d\3\2"+
		"\2\2\u031c\u030e\3\2\2\2\u031c\u030f\3\2\2\2\u031c\u0310\3\2\2\2\u031c"+
		"\u0311\3\2\2\2\u031c\u0312\3\2\2\2\u031c\u0313\3\2\2\2\u031c\u0314\3\2"+
		"\2\2\u031c\u0315\3\2\2\2\u031c\u0316\3\2\2\2\u031c\u0317\3\2\2\2\u031c"+
		"\u0318\3\2\2\2\u031c\u0319\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031b\3\2"+
		"\2\2\u031d%\3\2\2\2\u031e\u0321\7\60\2\2\u031f\u0321\5*\26\2\u0320\u031e"+
		"\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u0325\3\2\2\2\u0322\u0324\t\2\2\2\u0323"+
		"\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2"+
		"\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032c\7\7\2\2\u0329"+
		"\u032b\t\2\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f"+
		"\u0330\5\34\17\2\u0330\'\3\2\2\2\u0331\u0335\7\60\2\2\u0332\u0334\t\2"+
		"\2\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033c\7)"+
		"\2\2\u0339\u033b\t\2\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2"+
		"\2\2\u033f\u0343\5\34\17\2\u0340\u0342\t\2\2\2\u0341\u0340\3\2\2\2\u0342"+
		"\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344)\3\2\2\2"+
		"\u0345\u0343\3\2\2\2\u0346\u0347\7\60\2\2\u0347\u034b\7\b\2\2\u0348\u034a"+
		"\t\2\2\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0352\5\34"+
		"\17\2\u034f\u0351\t\2\2\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2"+
		"\2\2\u0355\u0356\7\t\2\2\u0356+\3\2\2\2\u0357\u035b\7\60\2\2\u0358\u035a"+
		"\t\2\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0362\7\4"+
		"\2\2\u035f\u0361\t\2\2\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u037f\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0365\u0369\5R*\2\u0366\u0368\t\2\2\2\u0367\u0366\3\2\2\2\u0368\u036b"+
		"\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u037c\3\2\2\2\u036b"+
		"\u0369\3\2\2\2\u036c\u0370\7\5\2\2\u036d\u036f\t\2\2\2\u036e\u036d\3\2"+
		"\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0377\5R*\2\u0374\u0376\t\2\2"+
		"\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378"+
		"\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u036c\3\2\2\2\u037b"+
		"\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0380\3\2"+
		"\2\2\u037e\u037c\3\2\2\2\u037f\u0365\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0382\7\6\2\2\u0382-\3\2\2\2\u0383\u0387\7\24\2\2"+
		"\u0384\u0386\t\2\2\2\u0385\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a"+
		"\u038e\7\4\2\2\u038b\u038d\t\2\2\2\u038c\u038b\3\2\2\2\u038d\u0390\3\2"+
		"\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0395\5R*\2\u0392\u0394\t\2\2\2\u0393\u0392\3\2\2"+
		"\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398"+
		"\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u0399\7\6\2\2\u0399/\3\2\2\2\u039a"+
		"\u039e\7\25\2\2\u039b\u039d\t\2\2\2\u039c\u039b\3\2\2\2\u039d\u03a0\3"+
		"\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0"+
		"\u039e\3\2\2\2\u03a1\u03a5\7\4\2\2\u03a2\u03a4\t\2\2\2\u03a3\u03a2\3\2"+
		"\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6"+
		"\u03a8\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03ac\5R*\2\u03a9\u03ab\t\2\2"+
		"\2\u03aa\u03a9\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\7\6\2\2\u03b0"+
		"\61\3\2\2\2\u03b1\u03b5\7\26\2\2\u03b2\u03b4\t\2\2\2\u03b3\u03b2\3\2\2"+
		"\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8"+
		"\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03bc\7\4\2\2\u03b9\u03bb\t\2\2\2\u03ba"+
		"\u03b9\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2"+
		"\2\2\u03bd\u03bf\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c3\5R*\2\u03c0\u03c2"+
		"\t\2\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03ca\7\5"+
		"\2\2\u03c7\u03c9\t\2\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03cc\3\2\2\2\u03ca"+
		"\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ca\3\2"+
		"\2\2\u03cd\u03d1\5R*\2\u03ce\u03d0\t\2\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3"+
		"\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d4\u03d5\7\6\2\2\u03d5\63\3\2\2\2\u03d6\u03da\7\27\2"+
		"\2\u03d7\u03d9\t\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8"+
		"\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd"+
		"\u03e1\7\4\2\2\u03de\u03e0\t\2\2\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2"+
		"\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e8\5R*\2\u03e5\u03e7\t\2\2\2\u03e6\u03e5\3\2\2"+
		"\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb"+
		"\3\2\2\2\u03ea\u03e8\3\2\2\2\u03eb\u03ec\7\6\2\2\u03ec\65\3\2\2\2\u03ed"+
		"\u03f1\7\30\2\2\u03ee\u03f0\t\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3"+
		"\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f4\u03f8\7\4\2\2\u03f5\u03f7\t\2\2\2\u03f6\u03f5\3\2"+
		"\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03ff\5R*\2\u03fc\u03fe\t\2\2"+
		"\2\u03fd\u03fc\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400"+
		"\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0406\7\5\2\2\u0403"+
		"\u0405\t\2\2\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2"+
		"\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2\2\2\u0409"+
		"\u040d\5R*\2\u040a\u040c\t\2\2\2\u040b\u040a\3\2\2\2\u040c\u040f\3\2\2"+
		"\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040d"+
		"\3\2\2\2\u0410\u0411\7\6\2\2\u0411\67\3\2\2\2\u0412\u0416\7\31\2\2\u0413"+
		"\u0415\t\2\2\2\u0414\u0413\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2"+
		"\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2\2\u0418\u0416\3\2\2\2\u0419"+
		"\u041d\7\4\2\2\u041a\u041c\t\2\2\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2\2\2\u041f"+
		"\u041d\3\2\2\2\u0420\u0424\5R*\2\u0421\u0423\t\2\2\2\u0422\u0421\3\2\2"+
		"\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427"+
		"\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u042b\7\5\2\2\u0428\u042a\t\2\2\2\u0429"+
		"\u0428\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2"+
		"\2\2\u042c\u042e\3\2\2\2\u042d\u042b\3\2\2\2\u042e\u0432\5R*\2\u042f\u0431"+
		"\t\2\2\2\u0430\u042f\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432"+
		"\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7\6"+
		"\2\2\u04369\3\2\2\2\u0437\u043b\7\32\2\2\u0438\u043a\t\2\2\2\u0439\u0438"+
		"\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043e\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0442\7\4\2\2\u043f\u0441\t\2"+
		"\2\2\u0440\u043f\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445\u0449\5R"+
		"*\2\u0446\u0448\t\2\2\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044c\u0450\7\5\2\2\u044d\u044f\t\2\2\2\u044e\u044d\3\2\2\2\u044f"+
		"\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0453\u0457\5R*\2\u0454\u0456\t\2\2\2\u0455\u0454"+
		"\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\7\6\2\2\u045b;\3\2\2\2"+
		"\u045c\u0460\7\33\2\2\u045d\u045f\t\2\2\2\u045e\u045d\3\2\2\2\u045f\u0462"+
		"\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0463\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u0463\u0467\7\4\2\2\u0464\u0466\t\2\2\2\u0465\u0464\3\2"+
		"\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u046a\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046e\5R*\2\u046b\u046d\t\2\2"+
		"\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0475\7\5\2\2\u0472"+
		"\u0474\t\2\2\2\u0473\u0472\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0475\3\2\2\2\u0478"+
		"\u047c\5R*\2\u0479\u047b\t\2\2\2\u047a\u0479\3\2\2\2\u047b\u047e\3\2\2"+
		"\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\3\2\2\2\u047e\u047c"+
		"\3\2\2\2\u047f\u0480\7\6\2\2\u0480=\3\2\2\2\u0481\u0485\7&\2\2\u0482\u0484"+
		"\t\2\2\2\u0483\u0482\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048c\7\4"+
		"\2\2\u0489\u048b\t\2\2\2\u048a\u0489\3\2\2\2\u048b\u048e\3\2\2\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u048c\3\2"+
		"\2\2\u048f\u0493\5R*\2\u0490\u0492\t\2\2\2\u0491\u0490\3\2\2\2\u0492\u0495"+
		"\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495"+
		"\u0493\3\2\2\2\u0496\u0497\7\6\2\2\u0497?\3\2\2\2\u0498\u049c\7\34\2\2"+
		"\u0499\u049b\t\2\2\2\u049a\u0499\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a"+
		"\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u049c\3\2\2\2\u049f"+
		"\u04a3\7\4\2\2\u04a0\u04a2\t\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04a5\3\2"+
		"\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a6\u04aa\5R*\2\u04a7\u04a9\t\2\2\2\u04a8\u04a7\3\2\2"+
		"\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad"+
		"\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04ae\7\6\2\2\u04aeA\3\2\2\2\u04af"+
		"\u04b3\7\35\2\2\u04b0\u04b2\t\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04b5\3"+
		"\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5"+
		"\u04b3\3\2\2\2\u04b6\u04ba\7\4\2\2\u04b7\u04b9\t\2\2\2\u04b8\u04b7\3\2"+
		"\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb"+
		"\u04cd\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd\u04c1\5R*\2\u04be\u04c0\t\2\2"+
		"\2\u04bf\u04be\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2"+
		"\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c8\7\5\2\2\u04c5"+
		"\u04c7\t\2\2\2\u04c6\u04c5\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3\2"+
		"\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb"+
		"\u04bd\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2"+
		"\2\2\u04ce\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d4\5R*\2\u04d1\u04d3"+
		"\t\2\2\2\u04d2\u04d1\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d4"+
		"\u04d5\3\2\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d7\u04d8\7\6"+
		"\2\2\u04d8C\3\2\2\2\u04d9\u04dd\7 \2\2\u04da\u04dc\t\2\2\2\u04db\u04da"+
		"\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04e0\3\2\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e4\7\4\2\2\u04e1\u04e3\t\2"+
		"\2\2\u04e2\u04e1\3\2\2\2\u04e3\u04e6\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4"+
		"\u04e5\3\2\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04eb\5R"+
		"*\2\u04e8\u04ea\t\2\2\2\u04e9\u04e8\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04eb\3\2"+
		"\2\2\u04ee\u04ef\7\6\2\2\u04efE\3\2\2\2\u04f0\u04f4\7!\2\2\u04f1\u04f3"+
		"\t\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f7\u04fb\7\4"+
		"\2\2\u04f8\u04fa\t\2\2\2\u04f9\u04f8\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb\3\2"+
		"\2\2\u04fe\u0502\5R*\2\u04ff\u0501\t\2\2\2\u0500\u04ff\3\2\2\2\u0501\u0504"+
		"\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0505\u0506\7\6\2\2\u0506G\3\2\2\2\u0507\u050b\7%\2\2\u0508"+
		"\u050a\t\2\2\2\u0509\u0508\3\2\2\2\u050a\u050d\3\2\2\2\u050b\u0509\3\2"+
		"\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050b\3\2\2\2\u050e"+
		"\u0512\7\4\2\2\u050f\u0511\t\2\2\2\u0510\u050f\3\2\2\2\u0511\u0514\3\2"+
		"\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0515\u0519\5R*\2\u0516\u0518\t\2\2\2\u0517\u0516\3\2\2"+
		"\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c"+
		"\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d\7\6\2\2\u051dI\3\2\2\2\u051e"+
		"\u0522\7\36\2\2\u051f\u0521\t\2\2\2\u0520\u051f\3\2\2\2\u0521\u0524\3"+
		"\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0525\u0529\7\4\2\2\u0526\u0528\t\2\2\2\u0527\u0526\3\2"+
		"\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u052c\3\2\2\2\u052b\u0529\3\2\2\2\u052c\u0530\5R*\2\u052d\u052f\t\2\2"+
		"\2\u052e\u052d\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531"+
		"\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0534\7\6\2\2\u0534"+
		"K\3\2\2\2\u0535\u0539\7\'\2\2\u0536\u0538\t\2\2\2\u0537\u0536\3\2\2\2"+
		"\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053c"+
		"\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u0540\7\4\2\2\u053d\u053f\t\2\2\2\u053e"+
		"\u053d\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2"+
		"\2\2\u0541\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0547\5R*\2\u0544\u0546"+
		"\t\2\2\2\u0545\u0544\3\2\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547"+
		"\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054b\7\6"+
		"\2\2\u054bM\3\2\2\2\u054c\u0550\7(\2\2\u054d\u054f\t\2\2\2\u054e\u054d"+
		"\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"\u0553\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0557\7\4\2\2\u0554\u0556\t\2"+
		"\2\2\u0555\u0554\3\2\2\2\u0556\u0559\3\2\2\2\u0557\u0555\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u055c\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u055d\7\60"+
		"\2\2\u055b\u055d\5P)\2\u055c\u055a\3\2\2\2\u055c\u055b\3\2\2\2\u055d\u0561"+
		"\3\2\2\2\u055e\u0560\t\2\2\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561"+
		"\u055f\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2"+
		"\2\2\u0564\u0565\7\6\2\2\u0565O\3\2\2\2\u0566\u056a\7\b\2\2\u0567\u0569"+
		"\t\2\2\2\u0568\u0567\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u0587\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u057e\5R"+
		"*\2\u056e\u0570\t\2\2\2\u056f\u056e\3\2\2\2\u0570\u0573\3\2\2\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0571\3\2"+
		"\2\2\u0574\u0578\7\5\2\2\u0575\u0577\t\2\2\2\u0576\u0575\3\2\2\2\u0577"+
		"\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057b\3\2"+
		"\2\2\u057a\u0578\3\2\2\2\u057b\u057d\5R*\2\u057c\u0571\3\2\2\2\u057d\u0580"+
		"\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0584\3\2\2\2\u0580"+
		"\u057e\3\2\2\2\u0581\u0583\t\2\2\2\u0582\u0581\3\2\2\2\u0583\u0586\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0588\3\2\2\2\u0586"+
		"\u0584\3\2\2\2\u0587\u056d\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2"+
		"\2\2\u0589\u058a\7\t\2\2\u058aQ\3\2\2\2\u058b\u058c\t\3\2\2\u058cS\3\2"+
		"\2\2\u00d5W^elsx|\u0081\u0083\u0085\u008c\u0090\u0094\u0096\u0098\u009d"+
		"\u00a1\u00a9\u00af\u00b6\u00bd\u00c4\u00cb\u00d0\u00d3\u00d9\u00e0\u00e6"+
		"\u00ed\u00f4\u00fb\u0100\u0106\u0108\u010a\u0111\u0115\u0118\u011d\u011f"+
		"\u0126\u012c\u0132\u0138\u013e\u0144\u014a\u0151\u0158\u015f\u0164\u016a"+
		"\u016c\u016e\u0175\u017c\u017e\u0184\u0186\u0188\u0190\u0196\u019c\u01a2"+
		"\u01a9\u01b0\u01b7\u01bc\u01c2\u01c4\u01c6\u01cd\u01d4\u01d6\u01dc\u01de"+
		"\u01e0\u01e9\u01ed\u01f5\u01fb\u0201\u0207\u020e\u0215\u021c\u0221\u0227"+
		"\u0229\u022b\u0232\u0239\u023b\u0241\u0243\u0245\u024b\u0254\u025a\u0261"+
		"\u0268\u026f\u0274\u027a\u027c\u027e\u0285\u028c\u028e\u0294\u0296\u0298"+
		"\u029e\u02a4\u02ab\u02b4\u02bb\u02c8\u02ce\u02d5\u02de\u02e5\u02eb\u0303"+
		"\u031c\u0320\u0325\u032c\u0335\u033c\u0343\u034b\u0352\u035b\u0362\u0369"+
		"\u0370\u0377\u037c\u037f\u0387\u038e\u0395\u039e\u03a5\u03ac\u03b5\u03bc"+
		"\u03c3\u03ca\u03d1\u03da\u03e1\u03e8\u03f1\u03f8\u03ff\u0406\u040d\u0416"+
		"\u041d\u0424\u042b\u0432\u043b\u0442\u0449\u0450\u0457\u0460\u0467\u046e"+
		"\u0475\u047c\u0485\u048c\u0493\u049c\u04a3\u04aa\u04b3\u04ba\u04c1\u04c8"+
		"\u04cd\u04d4\u04dd\u04e4\u04eb\u04f4\u04fb\u0502\u050b\u0512\u0519\u0522"+
		"\u0529\u0530\u0539\u0540\u0547\u0550\u0557\u055c\u0561\u056a\u0571\u0578"+
		"\u057e\u0584\u0587";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}