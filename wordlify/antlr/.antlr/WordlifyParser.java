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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, THEN=7, ELSE=8, END=9, EXIST=10, 
		PRINT=11, RENAME=12, REMOVE=13, MOVE=14, COPY=15, DOWNLOAD=16, WRITE=17, 
		WAIT=18, EXECUTE=19, EXIT=20, TIME=21, GET_FILES=22, DATE_MODIFIED=23, 
		FILE=24, FOLDER=25, ARGS=26, SIZE=27, READ=28, CMP_OP=29, LOG_OP=30, BOOL=31, 
		STR=32, ID=33, NUM=34, WS=35, NL=36, END_COMMENT=37;
	public static final int
		RULE_program = 0, RULE_if_instr = 1, RULE_if_cond = 2, RULE_then = 3, 
		RULE_else_if = 4, RULE_else_block = 5, RULE_cond = 6, RULE_comparison = 7, 
		RULE_atom_instr = 8, RULE_bool_fn = 9, RULE_return_fn = 10, RULE_assign = 11, 
		RULE_value = 12, RULE_exist = 13, RULE_print_instr = 14, RULE_rename = 15, 
		RULE_remove = 16, RULE_move = 17, RULE_copy = 18, RULE_download = 19, 
		RULE_write = 20, RULE_read = 21, RULE_wait_instr = 22, RULE_execute = 23, 
		RULE_get_files = 24, RULE_date_modified = 25, RULE_size = 26, RULE_exit = 27, 
		RULE_str_or_id = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "if_instr", "if_cond", "then", "else_if", "else_block", "cond", 
			"comparison", "atom_instr", "bool_fn", "return_fn", "assign", "value", 
			"exist", "print_instr", "rename", "remove", "move", "copy", "download", 
			"write", "read", "wait_instr", "execute", "get_files", "date_modified", 
			"size", "exit", "str_or_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "','", "'if'", "'then'", "'else'", 
			"'end'", "'exist'", "'print'", "'rename'", "'remove'", "'move'", "'copy'", 
			"'download'", "'write'", "'wait'", "'execute'", "'exit'", "'time'", "'getFiles'", 
			"'dateModified'", "'file'", "'folder'", "'args'", "'size'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IF", "THEN", "ELSE", "END", "EXIST", 
			"PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", 
			"EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", 
			"ARGS", "SIZE", "READ", "CMP_OP", "LOG_OP", "BOOL", "STR", "ID", "NUM", 
			"WS", "NL", "END_COMMENT"
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
		public List<If_instrContext> if_instr() {
			return getRuleContexts(If_instrContext.class);
		}
		public If_instrContext if_instr(int i) {
			return getRuleContext(If_instrContext.class,i);
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
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
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << ID))) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(102);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(64);
							atom_instr();
							setState(68);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(65);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(70);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(71);
							match(T__0);
							setState(75);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
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
								setState(77);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(78);
							atom_instr();
							setState(92); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(82);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(79);
									match(WS);
									}
									}
									setState(84);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(85);
								match(NL);
								setState(89);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(86);
										match(WS);
										}
										} 
									}
									setState(91);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								}
								}
								}
								setState(94); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(96);
							if_instr();
							setState(98); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(97);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(100); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				case FILE:
				case FOLDER:
				case ARGS:
				case ID:
					{
					setState(107);
					atom_instr();
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(108);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(113);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(114);
						match(T__0);
						}
					}

					}
					break;
				case IF:
					{
					setState(117);
					if_instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_COMMENT) {
				{
				setState(128);
				match(END_COMMENT);
				}
			}

			setState(131);
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
		enterRule(_localctx, 2, RULE_if_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			if_cond();
			setState(134);
			then();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					else_if();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(141);
				else_block();
				}
			}

			setState(144);
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
		enterRule(_localctx, 4, RULE_if_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(152);
			cond();
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(156); 
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
		public List<If_instrContext> if_instr() {
			return getRuleContexts(If_instrContext.class);
		}
		public If_instrContext if_instr(int i) {
			return getRuleContext(If_instrContext.class,i);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_then);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(THEN);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << ID))) != 0)) {
				{
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(202);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(164);
							atom_instr();
							setState(168);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(165);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(170);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(171);
							match(T__0);
							setState(175);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(172);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(177);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(178);
							atom_instr();
							setState(192); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(182);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(179);
									match(WS);
									}
									}
									setState(184);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(185);
								match(NL);
								setState(189);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(186);
										match(WS);
										}
										} 
									}
									setState(191);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
								}
								}
								}
								setState(194); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(196);
							if_instr();
							setState(198); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(197);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(200); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				case FILE:
				case FOLDER:
				case ARGS:
				case ID:
					{
					setState(207);
					atom_instr();
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(208);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(213);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					setState(220);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(214);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(216); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
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
							setState(218); 
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
				case IF:
					{
					setState(222);
					if_instr();
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
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
						setState(226); 
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
		enterRule(_localctx, 8, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ELSE);
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(238);
			if_cond();
			setState(239);
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
		public List<If_instrContext> if_instr() {
			return getRuleContexts(If_instrContext.class);
		}
		public If_instrContext if_instr(int i) {
			return getRuleContext(If_instrContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ELSE);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << ID))) != 0)) {
				{
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(285);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(247);
							atom_instr();
							setState(251);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(248);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(253);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(254);
							match(T__0);
							setState(258);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
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
								setState(260);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(261);
							atom_instr();
							setState(275); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(265);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(262);
									match(WS);
									}
									}
									setState(267);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(268);
								match(NL);
								setState(272);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(269);
										match(WS);
										}
										} 
									}
									setState(274);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
								}
								}
								}
								setState(277); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(279);
							if_instr();
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
							break;
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(311);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				case FILE:
				case FOLDER:
				case ARGS:
				case ID:
					{
					setState(290);
					atom_instr();
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
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
						}
						setState(296);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
					}
					setState(303);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(297);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(299); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(298);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(301); 
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
				case IF:
					{
					setState(305);
					if_instr();
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(306);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(309); 
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
		public Bool_fnContext bool_fn() {
			return getRuleContext(Bool_fnContext.class,0);
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
		enterRule(_localctx, 12, RULE_cond);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				bool_fn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 14, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			value();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(CMP_OP);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			value();
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
		public Wait_instrContext wait_instr() {
			return getRuleContext(Wait_instrContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
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
		enterRule(_localctx, 16, RULE_atom_instr);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				print_instr();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				rename();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				remove();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				move();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				copy();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				download();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				write();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				wait_instr();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(344);
				execute();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(345);
				exit();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 11);
				{
				setState(346);
				assign();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(347);
				match(TIME);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 13);
				{
				setState(348);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(349);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 15);
				{
				setState(350);
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

	public static class Bool_fnContext extends ParserRuleContext {
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public Bool_fnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_fn; }
	}

	public final Bool_fnContext bool_fn() throws RecognitionException {
		Bool_fnContext _localctx = new Bool_fnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_fn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			exist();
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

	public static class Return_fnContext extends ParserRuleContext {
		public ExistContext exist() {
			return getRuleContext(ExistContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode TIME() { return getToken(WordlifyParser.TIME, 0); }
		public Get_filesContext get_files() {
			return getRuleContext(Get_filesContext.class,0);
		}
		public Date_modifiedContext date_modified() {
			return getRuleContext(Date_modifiedContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode FILE() { return getToken(WordlifyParser.FILE, 0); }
		public TerminalNode FOLDER() { return getToken(WordlifyParser.FOLDER, 0); }
		public TerminalNode ARGS() { return getToken(WordlifyParser.ARGS, 0); }
		public Return_fnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_fn; }
	}

	public final Return_fnContext return_fn() throws RecognitionException {
		Return_fnContext _localctx = new Return_fnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_fn);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				exist();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				read();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(TIME);
				}
				break;
			case GET_FILES:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				get_files();
				}
				break;
			case DATE_MODIFIED:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				date_modified();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				size();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 9);
				{
				setState(363);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ID);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(T__1);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public Return_fnContext return_fn() {
			return getRuleContext(Return_fnContext.class,0);
		}
		public TerminalNode STR() { return getToken(WordlifyParser.STR, 0); }
		public TerminalNode NUM() { return getToken(WordlifyParser.NUM, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXIST:
			case TIME:
			case GET_FILES:
			case DATE_MODIFIED:
			case FILE:
			case FOLDER:
			case ARGS:
			case SIZE:
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				return_fn();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(STR);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(ID);
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

	public static class ExistContext extends ParserRuleContext {
		public TerminalNode EXIST() { return getToken(WordlifyParser.EXIST, 0); }
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 26, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(EXIST);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(389);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
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
			}
			setState(395);
			match(T__2);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			str_or_id();
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 28, RULE_print_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(PRINT);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(T__2);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			str_or_id();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 30, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(RENAME);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(T__2);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(442);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			str_or_id();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(T__4);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
			str_or_id();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 32, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(REMOVE);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(472);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(T__2);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			str_or_id();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 34, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(MOVE);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(495);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(T__2);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			str_or_id();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__4);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(516);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			str_or_id();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 36, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(COPY);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(T__2);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			str_or_id();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(T__4);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(553);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			str_or_id();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
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
			}
			setState(566);
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 38, RULE_download);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(DOWNLOAD);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(569);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(T__2);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			str_or_id();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(583);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(589);
			match(T__4);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(590);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			str_or_id();
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 40, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(WRITE);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(606);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(T__2);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			str_or_id();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(620);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(T__4);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			str_or_id();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(634);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 42, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(READ);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(643);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
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
			}
			setState(649);
			match(T__2);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(650);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			str_or_id();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(657);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 44, RULE_wait_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(WAIT);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			match(T__2);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			str_or_id();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(680);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
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
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
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
		enterRule(_localctx, 46, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(EXECUTE);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(689);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(T__2);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(696);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					str_or_id();
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(703);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(709);
					match(T__4);
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
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			setState(721);
			str_or_id();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(722);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 48, RULE_get_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(GET_FILES);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(731);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(T__2);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(738);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
			str_or_id();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(745);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 50, RULE_date_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(DATE_MODIFIED);
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
			match(T__2);
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(761);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
			str_or_id();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(768);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
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
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
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
		enterRule(_localctx, 52, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(SIZE);
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
			str_or_id();
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
			setState(797);
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
		public TerminalNode NUM() { return getToken(WordlifyParser.NUM, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
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
		enterRule(_localctx, 54, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(EXIT);
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
			match(T__2);
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
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Str_or_idContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(WordlifyParser.STR, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public Str_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_or_id; }
	}

	public final Str_or_idContext str_or_id() throws RecognitionException {
		Str_or_idContext _localctx = new Str_or_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_str_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !(_la==STR || _la==ID) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u033b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13"+
		"\2\3\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\6\2"+
		"_\n\2\r\2\16\2`\3\2\3\2\6\2e\n\2\r\2\16\2f\7\2i\n\2\f\2\16\2l\13\2\3\2"+
		"\3\2\7\2p\n\2\f\2\16\2s\13\2\3\2\5\2v\n\2\3\2\5\2y\n\2\5\2{\n\2\3\2\7"+
		"\2~\n\2\f\2\16\2\u0081\13\2\3\2\5\2\u0084\n\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"\u008b\n\3\f\3\16\3\u008e\13\3\3\3\5\3\u0091\n\3\3\3\3\3\3\4\3\4\6\4\u0097"+
		"\n\4\r\4\16\4\u0098\3\4\3\4\6\4\u009d\n\4\r\4\16\4\u009e\3\5\3\5\6\5\u00a3"+
		"\n\5\r\5\16\5\u00a4\3\5\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac\13\5\3\5\3\5"+
		"\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\3\5\3\5\7\5\u00b7\n\5\f\5\16\5\u00ba"+
		"\13\5\3\5\3\5\7\5\u00be\n\5\f\5\16\5\u00c1\13\5\6\5\u00c3\n\5\r\5\16\5"+
		"\u00c4\3\5\3\5\6\5\u00c9\n\5\r\5\16\5\u00ca\7\5\u00cd\n\5\f\5\16\5\u00d0"+
		"\13\5\3\5\3\5\7\5\u00d4\n\5\f\5\16\5\u00d7\13\5\3\5\3\5\6\5\u00db\n\5"+
		"\r\5\16\5\u00dc\5\5\u00df\n\5\3\5\3\5\6\5\u00e3\n\5\r\5\16\5\u00e4\5\5"+
		"\u00e7\n\5\5\5\u00e9\n\5\3\6\3\6\6\6\u00ed\n\6\r\6\16\6\u00ee\3\6\3\6"+
		"\3\6\3\7\3\7\6\7\u00f6\n\7\r\7\16\7\u00f7\3\7\3\7\7\7\u00fc\n\7\f\7\16"+
		"\7\u00ff\13\7\3\7\3\7\7\7\u0103\n\7\f\7\16\7\u0106\13\7\3\7\3\7\7\7\u010a"+
		"\n\7\f\7\16\7\u010d\13\7\3\7\3\7\7\7\u0111\n\7\f\7\16\7\u0114\13\7\6\7"+
		"\u0116\n\7\r\7\16\7\u0117\3\7\3\7\6\7\u011c\n\7\r\7\16\7\u011d\7\7\u0120"+
		"\n\7\f\7\16\7\u0123\13\7\3\7\3\7\7\7\u0127\n\7\f\7\16\7\u012a\13\7\3\7"+
		"\3\7\6\7\u012e\n\7\r\7\16\7\u012f\5\7\u0132\n\7\3\7\3\7\6\7\u0136\n\7"+
		"\r\7\16\7\u0137\5\7\u013a\n\7\5\7\u013c\n\7\3\b\3\b\3\b\5\b\u0141\n\b"+
		"\3\t\3\t\7\t\u0145\n\t\f\t\16\t\u0148\13\t\3\t\3\t\7\t\u014c\n\t\f\t\16"+
		"\t\u014f\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0162\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u016f\n\f\3\r\3\r\7\r\u0173\n\r\f\r\16\r\u0176\13\r\3\r\3\r\7\r"+
		"\u017a\n\r\f\r\16\r\u017d\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0185"+
		"\n\16\3\17\3\17\7\17\u0189\n\17\f\17\16\17\u018c\13\17\3\17\3\17\7\17"+
		"\u0190\n\17\f\17\16\17\u0193\13\17\3\17\3\17\7\17\u0197\n\17\f\17\16\17"+
		"\u019a\13\17\3\17\3\17\3\20\3\20\7\20\u01a0\n\20\f\20\16\20\u01a3\13\20"+
		"\3\20\3\20\7\20\u01a7\n\20\f\20\16\20\u01aa\13\20\3\20\3\20\7\20\u01ae"+
		"\n\20\f\20\16\20\u01b1\13\20\3\20\3\20\3\21\3\21\7\21\u01b7\n\21\f\21"+
		"\16\21\u01ba\13\21\3\21\3\21\7\21\u01be\n\21\f\21\16\21\u01c1\13\21\3"+
		"\21\3\21\7\21\u01c5\n\21\f\21\16\21\u01c8\13\21\3\21\3\21\7\21\u01cc\n"+
		"\21\f\21\16\21\u01cf\13\21\3\21\3\21\7\21\u01d3\n\21\f\21\16\21\u01d6"+
		"\13\21\3\21\3\21\3\22\3\22\7\22\u01dc\n\22\f\22\16\22\u01df\13\22\3\22"+
		"\3\22\7\22\u01e3\n\22\f\22\16\22\u01e6\13\22\3\22\3\22\7\22\u01ea\n\22"+
		"\f\22\16\22\u01ed\13\22\3\22\3\22\3\23\3\23\7\23\u01f3\n\23\f\23\16\23"+
		"\u01f6\13\23\3\23\3\23\7\23\u01fa\n\23\f\23\16\23\u01fd\13\23\3\23\3\23"+
		"\7\23\u0201\n\23\f\23\16\23\u0204\13\23\3\23\3\23\7\23\u0208\n\23\f\23"+
		"\16\23\u020b\13\23\3\23\3\23\7\23\u020f\n\23\f\23\16\23\u0212\13\23\3"+
		"\23\3\23\3\24\3\24\7\24\u0218\n\24\f\24\16\24\u021b\13\24\3\24\3\24\7"+
		"\24\u021f\n\24\f\24\16\24\u0222\13\24\3\24\3\24\7\24\u0226\n\24\f\24\16"+
		"\24\u0229\13\24\3\24\3\24\7\24\u022d\n\24\f\24\16\24\u0230\13\24\3\24"+
		"\3\24\7\24\u0234\n\24\f\24\16\24\u0237\13\24\3\24\3\24\3\25\3\25\7\25"+
		"\u023d\n\25\f\25\16\25\u0240\13\25\3\25\3\25\7\25\u0244\n\25\f\25\16\25"+
		"\u0247\13\25\3\25\3\25\7\25\u024b\n\25\f\25\16\25\u024e\13\25\3\25\3\25"+
		"\7\25\u0252\n\25\f\25\16\25\u0255\13\25\3\25\3\25\7\25\u0259\n\25\f\25"+
		"\16\25\u025c\13\25\3\25\3\25\3\26\3\26\7\26\u0262\n\26\f\26\16\26\u0265"+
		"\13\26\3\26\3\26\7\26\u0269\n\26\f\26\16\26\u026c\13\26\3\26\3\26\7\26"+
		"\u0270\n\26\f\26\16\26\u0273\13\26\3\26\3\26\7\26\u0277\n\26\f\26\16\26"+
		"\u027a\13\26\3\26\3\26\7\26\u027e\n\26\f\26\16\26\u0281\13\26\3\26\3\26"+
		"\3\27\3\27\7\27\u0287\n\27\f\27\16\27\u028a\13\27\3\27\3\27\7\27\u028e"+
		"\n\27\f\27\16\27\u0291\13\27\3\27\3\27\7\27\u0295\n\27\f\27\16\27\u0298"+
		"\13\27\3\27\3\27\3\30\3\30\7\30\u029e\n\30\f\30\16\30\u02a1\13\30\3\30"+
		"\3\30\7\30\u02a5\n\30\f\30\16\30\u02a8\13\30\3\30\3\30\7\30\u02ac\n\30"+
		"\f\30\16\30\u02af\13\30\3\30\3\30\3\31\3\31\7\31\u02b5\n\31\f\31\16\31"+
		"\u02b8\13\31\3\31\3\31\7\31\u02bc\n\31\f\31\16\31\u02bf\13\31\3\31\3\31"+
		"\7\31\u02c3\n\31\f\31\16\31\u02c6\13\31\3\31\3\31\7\31\u02ca\n\31\f\31"+
		"\16\31\u02cd\13\31\7\31\u02cf\n\31\f\31\16\31\u02d2\13\31\3\31\3\31\7"+
		"\31\u02d6\n\31\f\31\16\31\u02d9\13\31\3\31\3\31\3\32\3\32\7\32\u02df\n"+
		"\32\f\32\16\32\u02e2\13\32\3\32\3\32\7\32\u02e6\n\32\f\32\16\32\u02e9"+
		"\13\32\3\32\3\32\7\32\u02ed\n\32\f\32\16\32\u02f0\13\32\3\32\3\32\3\33"+
		"\3\33\7\33\u02f6\n\33\f\33\16\33\u02f9\13\33\3\33\3\33\7\33\u02fd\n\33"+
		"\f\33\16\33\u0300\13\33\3\33\3\33\7\33\u0304\n\33\f\33\16\33\u0307\13"+
		"\33\3\33\3\33\3\34\3\34\7\34\u030d\n\34\f\34\16\34\u0310\13\34\3\34\3"+
		"\34\7\34\u0314\n\34\f\34\16\34\u0317\13\34\3\34\3\34\7\34\u031b\n\34\f"+
		"\34\16\34\u031e\13\34\3\34\3\34\3\35\3\35\7\35\u0324\n\35\f\35\16\35\u0327"+
		"\13\35\3\35\3\35\7\35\u032b\n\35\f\35\16\35\u032e\13\35\3\35\3\35\7\35"+
		"\u0332\n\35\f\35\16\35\u0335\13\35\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2%&\3"+
		"\2#$\3\2\"#\2\u03ab\2?\3\2\2\2\4\u0087\3\2\2\2\6\u0094\3\2\2\2\b\u00a0"+
		"\3\2\2\2\n\u00ea\3\2\2\2\f\u00f3\3\2\2\2\16\u0140\3\2\2\2\20\u0142\3\2"+
		"\2\2\22\u0161\3\2\2\2\24\u0163\3\2\2\2\26\u016e\3\2\2\2\30\u0170\3\2\2"+
		"\2\32\u0184\3\2\2\2\34\u0186\3\2\2\2\36\u019d\3\2\2\2 \u01b4\3\2\2\2\""+
		"\u01d9\3\2\2\2$\u01f0\3\2\2\2&\u0215\3\2\2\2(\u023a\3\2\2\2*\u025f\3\2"+
		"\2\2,\u0284\3\2\2\2.\u029b\3\2\2\2\60\u02b2\3\2\2\2\62\u02dc\3\2\2\2\64"+
		"\u02f3\3\2\2\2\66\u030a\3\2\2\28\u0321\3\2\2\2:\u0338\3\2\2\2<>\t\2\2"+
		"\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@z\3\2\2\2A?\3\2\2\2BF\5\22"+
		"\n\2CE\t\2\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IM\7\3\2\2JL\t\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2Ni\3\2"+
		"\2\2OM\3\2\2\2P^\5\22\n\2QS\7%\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2UW\3\2\2\2VT\3\2\2\2W[\7&\2\2XZ\7%\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^T\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ai\3\2\2\2bd\5\4\3\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gi\3\2\2\2hB\3\2\2\2hP\3\2\2\2hb\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kx\3\2\2\2lj\3\2\2\2mq\5\22\n\2np\t\2\2\2on\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\7\3\2\2ut\3\2\2\2uv\3\2\2\2vy\3"+
		"\2\2\2wy\5\4\3\2xm\3\2\2\2xw\3\2\2\2y{\3\2\2\2zj\3\2\2\2z{\3\2\2\2{\177"+
		"\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7\'\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\2\2\3\u0086"+
		"\3\3\2\2\2\u0087\u0088\5\6\4\2\u0088\u008c\5\b\5\2\u0089\u008b\5\n\6\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\f\7\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\13"+
		"\2\2\u0093\5\3\2\2\2\u0094\u0096\7\b\2\2\u0095\u0097\t\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\5\16\b\2\u009b\u009d\t\2\2\2\u009c\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\7\3\2\2\2\u00a0\u00a2\7\t\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00e8"+
		"\3\2\2\2\u00a6\u00aa\5\22\n\2\u00a7\u00a9\t\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7\3\2\2\u00ae\u00b0\t\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00cd\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c2\5\22\n\2\u00b5"+
		"\u00b7\7%\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bf\7&\2\2\u00bc\u00be\7%\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00cd\3\2\2\2\u00c6\u00c8\5\4\3\2\u00c7\u00c9\t\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00a6\3\2\2\2\u00cc\u00b4\3\2"+
		"\2\2\u00cc\u00c6\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00e6\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\5\22"+
		"\n\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00de\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00df\7\3\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e7\3\2\2\2\u00e0"+
		"\u00e2\5\4\3\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00d1\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ce\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\t\3\2\2\2\u00ea\u00ec\7\n\2\2\u00eb\u00ed"+
		"\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\6\4\2\u00f1\u00f2\5\b"+
		"\5\2\u00f2\13\3\2\2\2\u00f3\u00f5\7\n\2\2\u00f4\u00f6\t\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u013b\3\2\2\2\u00f9\u00fd\5\22\n\2\u00fa\u00fc\t\2\2\2\u00fb\u00fa\3"+
		"\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\7\3\2\2\u0101\u0103\t\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0120\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0115\5\22"+
		"\n\2\u0108\u010a\7%\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0112\7&\2\2\u010f\u0111\7%\2\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u010b\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u0120\3\2\2\2\u0119\u011b\5\4\3\2\u011a"+
		"\u011c\t\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u00f9\3\2\2\2\u011f"+
		"\u0107\3\2\2\2\u011f\u0119\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0139\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0128\5\22\n\2\u0125\u0127\t\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0131\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u0132\7\3\2\2\u012c\u012e\t\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012d\3\2\2\2\u0132\u013a\3\2"+
		"\2\2\u0133\u0135\5\4\3\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0124\3\2\2\2\u0139\u0133\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0121\3\2\2\2\u013b\u013c\3\2\2\2\u013c\r\3\2\2\2\u013d\u0141\5\24\13"+
		"\2\u013e\u0141\7!\2\2\u013f\u0141\5\20\t\2\u0140\u013d\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141\17\3\2\2\2\u0142\u0146\5\32\16\2\u0143"+
		"\u0145\t\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014d\7\37\2\2\u014a\u014c\t\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\5\32\16\2\u0151\21\3\2\2\2\u0152\u0162\5\36"+
		"\20\2\u0153\u0162\5 \21\2\u0154\u0162\5\"\22\2\u0155\u0162\5$\23\2\u0156"+
		"\u0162\5&\24\2\u0157\u0162\5(\25\2\u0158\u0162\5*\26\2\u0159\u0162\5."+
		"\30\2\u015a\u0162\5\60\31\2\u015b\u0162\58\35\2\u015c\u0162\5\30\r\2\u015d"+
		"\u0162\7\27\2\2\u015e\u0162\7\32\2\2\u015f\u0162\7\33\2\2\u0160\u0162"+
		"\7\34\2\2\u0161\u0152\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0154\3\2\2\2"+
		"\u0161\u0155\3\2\2\2\u0161\u0156\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u0158"+
		"\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161"+
		"\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162\23\3\2\2\2\u0163\u0164\5\34\17\2\u0164"+
		"\25\3\2\2\2\u0165\u016f\5\34\17\2\u0166\u016f\5,\27\2\u0167\u016f\7\27"+
		"\2\2\u0168\u016f\5\62\32\2\u0169\u016f\5\64\33\2\u016a\u016f\5\66\34\2"+
		"\u016b\u016f\7\32\2\2\u016c\u016f\7\33\2\2\u016d\u016f\7\34\2\2\u016e"+
		"\u0165\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2"+
		"\2\2\u016e\u0169\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\27\3\2\2\2\u0170\u0174\7#\2\2"+
		"\u0171\u0173\t\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017b\7\4\2\2\u0178\u017a\t\2\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\5\32\16\2\u017f\31\3\2\2\2\u0180\u0185\5\26"+
		"\f\2\u0181\u0185\7\"\2\2\u0182\u0185\7$\2\2\u0183\u0185\7#\2\2\u0184\u0180"+
		"\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"\33\3\2\2\2\u0186\u018a\7\f\2\2\u0187\u0189\t\2\2\2\u0188\u0187\3\2\2"+
		"\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\7\5\2\2\u018e\u0190\t\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0198\5:\36\2\u0195"+
		"\u0197\t\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019c\7\6\2\2\u019c\35\3\2\2\2\u019d\u01a1\7\r\2\2\u019e\u01a0\t\2\2"+
		"\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a8\7\5\2\2\u01a5"+
		"\u01a7\t\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01af\5:\36\2\u01ac\u01ae\t\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b2\u01b3\7\6\2\2\u01b3\37\3\2\2\2\u01b4\u01b8\7\16\2"+
		"\2\u01b5\u01b7\t\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bf\7\5\2\2\u01bc\u01be\t\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01c6\5:\36\2\u01c3\u01c5\t\2\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cd\7\7\2\2\u01ca\u01cc\t\2"+
		"\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d4\5:"+
		"\36\2\u01d1\u01d3\t\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d7\u01d8\7\6\2\2\u01d8!\3\2\2\2\u01d9\u01dd\7\17\2\2\u01da\u01dc"+
		"\t\2\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\7\5"+
		"\2\2\u01e1\u01e3\t\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01eb\5:\36\2\u01e8\u01ea\t\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\6\2\2\u01ef#\3\2\2\2\u01f0\u01f4"+
		"\7\20\2\2\u01f1\u01f3\t\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01fb\7\5\2\2\u01f8\u01fa\t\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0202\5:\36\2\u01ff\u0201\t\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0209\7\7\2\2\u0206"+
		"\u0208\t\2\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u0210\5:\36\2\u020d\u020f\t\2\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0214\7\6\2\2\u0214%\3\2\2\2\u0215\u0219\7\21\2\2"+
		"\u0216\u0218\t\2\2\2\u0217\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c"+
		"\u0220\7\5\2\2\u021d\u021f\t\2\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0227\5:\36\2\u0224\u0226\t\2\2\2\u0225\u0224\3\2"+
		"\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022e\7\7\2\2\u022b\u022d\t\2"+
		"\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0235\5:"+
		"\36\2\u0232\u0234\t\2\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u0239\7\6\2\2\u0239\'\3\2\2\2\u023a\u023e\7\22\2\2\u023b\u023d"+
		"\t\2\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0245\7\5"+
		"\2\2\u0242\u0244\t\2\2\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0248\u024c\5:\36\2\u0249\u024b\t\2\2\2\u024a\u0249\3\2\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024f\3\2"+
		"\2\2\u024e\u024c\3\2\2\2\u024f\u0253\7\7\2\2\u0250\u0252\t\2\2\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u025a\5:\36\2\u0257"+
		"\u0259\t\2\2\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u025e\7\6\2\2\u025e)\3\2\2\2\u025f\u0263\7\23\2\2\u0260\u0262\t\2\2\2"+
		"\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026a\7\5\2\2\u0267"+
		"\u0269\t\2\2\2\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026a\u026b\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d"+
		"\u0271\5:\36\2\u026e\u0270\t\2\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0278\7\7\2\2\u0275\u0277\t\2\2\2\u0276\u0275\3\2"+
		"\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027f\5:\36\2\u027c\u027e\t\2"+
		"\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\7\6"+
		"\2\2\u0283+\3\2\2\2\u0284\u0288\7\36\2\2\u0285\u0287\t\2\2\2\u0286\u0285"+
		"\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028b\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028f\7\5\2\2\u028c\u028e\t\2"+
		"\2\2\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0296\5:"+
		"\36\2\u0293\u0295\t\2\2\2\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2"+
		"\2\2\u0299\u029a\7\6\2\2\u029a-\3\2\2\2\u029b\u029f\7\24\2\2\u029c\u029e"+
		"\t\2\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a6\7\5"+
		"\2\2\u02a3\u02a5\t\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02ad\5:\36\2\u02aa\u02ac\t\2\2\2\u02ab\u02aa\3\2\2\2\u02ac"+
		"\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b1\7\6\2\2\u02b1/\3\2\2\2\u02b2\u02b6"+
		"\7\25\2\2\u02b3\u02b5\t\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2"+
		"\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b6"+
		"\3\2\2\2\u02b9\u02bd\7\5\2\2\u02ba\u02bc\t\2\2\2\u02bb\u02ba\3\2\2\2\u02bc"+
		"\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02d0\3\2"+
		"\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c4\5:\36\2\u02c1\u02c3\t\2\2\2\u02c2"+
		"\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02cb\7\7\2\2\u02c8"+
		"\u02ca\t\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2"+
		"\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce"+
		"\u02c0\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2"+
		"\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d7\5:\36\2\u02d4"+
		"\u02d6\t\2\2\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da"+
		"\u02db\7\6\2\2\u02db\61\3\2\2\2\u02dc\u02e0\7\30\2\2\u02dd\u02df\t\2\2"+
		"\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1"+
		"\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e7\7\5\2\2\u02e4"+
		"\u02e6\t\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea"+
		"\u02ee\5:\36\2\u02eb\u02ed\t\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f1\u02f2\7\6\2\2\u02f2\63\3\2\2\2\u02f3\u02f7\7\31\2"+
		"\2\u02f4\u02f6\t\2\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa"+
		"\u02fe\7\5\2\2\u02fb\u02fd\t\2\2\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2"+
		"\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0301\u0305\5:\36\2\u0302\u0304\t\2\2\2\u0303\u0302\3\2"+
		"\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\7\6\2\2\u0309\65\3\2\2"+
		"\2\u030a\u030e\7\35\2\2\u030b\u030d\t\2\2\2\u030c\u030b\3\2\2\2\u030d"+
		"\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2"+
		"\2\2\u0310\u030e\3\2\2\2\u0311\u0315\7\5\2\2\u0312\u0314\t\2\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031c\5:\36\2\u0319"+
		"\u031b\t\2\2\2\u031a\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\7\6\2\2\u0320\67\3\2\2\2\u0321\u0325\7\26\2\2\u0322\u0324\t\2\2"+
		"\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032c\7\5\2\2\u0329"+
		"\u032b\t\2\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2"+
		"\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f"+
		"\u0333\t\3\2\2\u0330\u0332\t\2\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2"+
		"\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335"+
		"\u0333\3\2\2\2\u0336\u0337\7\6\2\2\u03379\3\2\2\2\u0338\u0339\t\4\2\2"+
		"\u0339;\3\2\2\2v?FMT[`fhjquxz\177\u0083\u008c\u0090\u0098\u009e\u00a4"+
		"\u00aa\u00b1\u00b8\u00bf\u00c4\u00ca\u00cc\u00ce\u00d5\u00dc\u00de\u00e4"+
		"\u00e6\u00e8\u00ee\u00f7\u00fd\u0104\u010b\u0112\u0117\u011d\u011f\u0121"+
		"\u0128\u012f\u0131\u0137\u0139\u013b\u0140\u0146\u014d\u0161\u016e\u0174"+
		"\u017b\u0184\u018a\u0191\u0198\u01a1\u01a8\u01af\u01b8\u01bf\u01c6\u01cd"+
		"\u01d4\u01dd\u01e4\u01eb\u01f4\u01fb\u0202\u0209\u0210\u0219\u0220\u0227"+
		"\u022e\u0235\u023e\u0245\u024c\u0253\u025a\u0263\u026a\u0271\u0278\u027f"+
		"\u0288\u028f\u0296\u029f\u02a6\u02ad\u02b6\u02bd\u02c4\u02cb\u02d0\u02d7"+
		"\u02e0\u02e7\u02ee\u02f7\u02fe\u0305\u030e\u0315\u031c\u0325\u032c\u0333";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}