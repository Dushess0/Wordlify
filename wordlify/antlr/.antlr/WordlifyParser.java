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
		CMP_OP=40, ARITH_OP=41, LOG_OP=42, BOOL=43, STR=44, ID=45, NUM=46, WS=47, 
		NL=48, END_COMMENT=49;
	public static final int
		RULE_program = 0, RULE_fn_def = 1, RULE_block_instr = 2, RULE_foreach = 3, 
		RULE_while_instr = 4, RULE_if_instr = 5, RULE_if_cond = 6, RULE_then = 7, 
		RULE_else_if = 8, RULE_else_block = 9, RULE_cond = 10, RULE_comparison = 11, 
		RULE_expr = 12, RULE_arith_expr = 13, RULE_fn_call = 14, RULE_atom_instr = 15, 
		RULE_assign = 16, RULE_array_append = 17, RULE_array_elem = 18, RULE_own_fn_call = 19, 
		RULE_exist = 20, RULE_print_instr = 21, RULE_rename = 22, RULE_remove = 23, 
		RULE_move = 24, RULE_copy = 25, RULE_download = 26, RULE_write = 27, RULE_read = 28, 
		RULE_wait_instr = 29, RULE_execute = 30, RULE_get_files = 31, RULE_date_modified = 32, 
		RULE_size = 33, RULE_exit = 34, RULE_create = 35, RULE_length = 36, RULE_array = 37, 
		RULE_value_or_id = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fn_def", "block_instr", "foreach", "while_instr", "if_instr", 
			"if_cond", "then", "else_if", "else_block", "cond", "comparison", "expr", 
			"arith_expr", "fn_call", "atom_instr", "assign", "array_append", "array_elem", 
			"own_fn_call", "exist", "print_instr", "rename", "remove", "move", "copy", 
			"download", "write", "read", "wait_instr", "execute", "get_files", "date_modified", 
			"size", "exit", "create", "length", "array", "value_or_id"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
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
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FN) | (1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(125);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(84);
							atom_instr();
							setState(88);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(85);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(90);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(91);
							match(T__0);
							setState(95);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(92);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(97);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(98);
							atom_instr();
							setState(112); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(102);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(99);
									match(WS);
									}
									}
									setState(104);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(105);
								match(NL);
								setState(109);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(106);
										match(WS);
										}
										} 
									}
									setState(111);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
								}
								}
								}
								setState(114); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(118);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case WHILE:
							case FOREACH:
							case IF:
								{
								setState(116);
								block_instr();
								}
								break;
							case FN:
								{
								setState(117);
								fn_def();
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(121); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(120);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(123); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(144);
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
					setState(130);
					atom_instr();
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(131);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(136);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(137);
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
					setState(142);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WHILE:
					case FOREACH:
					case IF:
						{
						setState(140);
						block_instr();
						}
						break;
					case FN:
						{
						setState(141);
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

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==END_COMMENT) {
				{
				setState(154);
				match(END_COMMENT);
				}
			}

			setState(157);
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
			setState(159);
			match(FN);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(165);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__1);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(179);
				match(ID);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(180);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(186);
					match(T__2);
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(187);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(193);
					match(ID);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(194);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
			match(T__3);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
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
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(BEGIN);
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
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(258);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(220);
							atom_instr();
							setState(224);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(221);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
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
							}
							setState(227);
							match(T__0);
							setState(231);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(228);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(233);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(234);
							atom_instr();
							setState(248); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(238);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(235);
									match(WS);
									}
									}
									setState(240);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(241);
								match(NL);
								setState(245);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(242);
										match(WS);
										}
										} 
									}
									setState(247);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								}
								}
								}
								setState(250); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(252);
							block_instr();
							setState(254); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(253);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(256); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(262);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(274);
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
					setState(263);
					atom_instr();
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(264);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(269);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(270);
						match(T__0);
						}
					}

					}
					break;
				case WHILE:
				case FOREACH:
				case IF:
					{
					setState(273);
					block_instr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(276);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS || _la==NL );
				}
			}

			setState(283);
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
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				if_instr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				while_instr();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
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
			setState(290);
			match(FOREACH);
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
			match(ID);
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
			match(IN);
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
			match(ID);
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
			setState(314);
			match(DO);
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(320);
							atom_instr();
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
							match(T__0);
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
							}
							break;
						case 2:
							{
							setState(334);
							atom_instr();
							setState(348); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(338);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(335);
									match(WS);
									}
									}
									setState(340);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(341);
								match(NL);
								setState(345);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(342);
										match(WS);
										}
										} 
									}
									setState(347);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
								}
								}
								}
								setState(350); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(352);
							block_instr();
							setState(354); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(353);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(356); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(384);
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
					setState(363);
					atom_instr();
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(364);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(369);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
					}
					setState(376);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(370);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(372); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(371);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(374); 
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
					setState(378);
					block_instr();
					setState(380); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(379);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(382); 
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

			setState(388);
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
			setState(390);
			match(WHILE);
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
			cond();
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
			setState(402);
			match(DO);
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(446);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(408);
							atom_instr();
							setState(412);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(409);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(414);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(415);
							match(T__0);
							setState(419);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(416);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(421);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(422);
							atom_instr();
							setState(436); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(426);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(423);
									match(WS);
									}
									}
									setState(428);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(429);
								match(NL);
								setState(433);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(430);
										match(WS);
										}
										} 
									}
									setState(435);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
								}
								}
								}
								setState(438); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(440);
							block_instr();
							setState(442); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(441);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(444); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(472);
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
					setState(451);
					atom_instr();
					setState(455);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(452);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(457);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
					}
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(458);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(460); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(459);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(462); 
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
					setState(466);
					block_instr();
					setState(468); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(467);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(470); 
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

			setState(476);
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
			setState(478);
			if_cond();
			setState(479);
			then();
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					else_if();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(486);
				else_block();
				}
			}

			setState(489);
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
			setState(491);
			match(IF);
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
			setState(497);
			cond();
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
			setState(503);
			match(THEN);
			setState(505); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(547);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
						case 1:
							{
							setState(509);
							atom_instr();
							setState(513);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(510);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(515);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(516);
							match(T__0);
							setState(520);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(517);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(522);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(523);
							atom_instr();
							setState(537); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(527);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(524);
									match(WS);
									}
									}
									setState(529);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(530);
								match(NL);
								setState(534);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(531);
										match(WS);
										}
										} 
									}
									setState(536);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
								}
								}
								}
								setState(539); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(541);
							block_instr();
							setState(543); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(542);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(545); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(573);
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
					setState(552);
					atom_instr();
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
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
						}
						setState(558);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					setState(565);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(559);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(561); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
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
							setState(563); 
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
					setState(567);
					block_instr();
					setState(569); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(568);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(571); 
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
			setState(577);
			match(ELSE);
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
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
			} while ( _la==WS || _la==NL );
			setState(583);
			if_cond();
			setState(584);
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
			setState(586);
			match(ELSE);
			setState(588); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
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
				setState(590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS || _la==NL );
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << FOREACH) | (1L << IF) | (1L << EXIST) | (1L << PRINT) | (1L << RENAME) | (1L << REMOVE) | (1L << MOVE) | (1L << COPY) | (1L << DOWNLOAD) | (1L << WRITE) | (1L << WAIT) | (1L << EXECUTE) | (1L << EXIT) | (1L << TIME) | (1L << GET_FILES) | (1L << DATE_MODIFIED) | (1L << FILE) | (1L << FOLDER) | (1L << ARGS) | (1L << SIZE) | (1L << READ) | (1L << CREATE) | (1L << ID))) != 0)) {
				{
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(630);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
						case 1:
							{
							setState(592);
							atom_instr();
							setState(596);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(593);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(598);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(599);
							match(T__0);
							setState(603);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==WS || _la==NL) {
								{
								{
								setState(600);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(605);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							break;
						case 2:
							{
							setState(606);
							atom_instr();
							setState(620); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(610);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==WS) {
									{
									{
									setState(607);
									match(WS);
									}
									}
									setState(612);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(613);
								match(NL);
								setState(617);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(614);
										match(WS);
										}
										} 
									}
									setState(619);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
								}
								}
								}
								setState(622); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						case 3:
							{
							setState(624);
							block_instr();
							setState(626); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(625);
								_la = _input.LA(1);
								if ( !(_la==WS || _la==NL) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								setState(628); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==WS || _la==NL );
							}
							break;
						}
						} 
					}
					setState(634);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				setState(656);
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
					setState(635);
					atom_instr();
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(636);
							_la = _input.LA(1);
							if ( !(_la==WS || _la==NL) ) {
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
						setState(641);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					setState(648);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(642);
						match(T__0);
						}
						break;
					case WS:
					case NL:
						{
						setState(644); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
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
							setState(646); 
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
					setState(650);
					block_instr();
					setState(652); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(651);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(654); 
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
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(662);
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
			setState(665);
			expr();
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
			match(CMP_OP);
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
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
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
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(STR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				arith_expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(686);
				array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(687);
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
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			value_or_id();
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
			match(ARITH_OP);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(698);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
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
	}

	public final Fn_callContext fn_call() throws RecognitionException {
		Fn_callContext _localctx = new Fn_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fn_call);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				own_fn_call();
				}
				break;
			case EXIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				exist();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				print_instr();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(709);
				rename();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(710);
				remove();
				}
				break;
			case MOVE:
				enterOuterAlt(_localctx, 6);
				{
				setState(711);
				move();
				}
				break;
			case COPY:
				enterOuterAlt(_localctx, 7);
				{
				setState(712);
				copy();
				}
				break;
			case DOWNLOAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(713);
				download();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(714);
				write();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 10);
				{
				setState(715);
				read();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(716);
				wait_instr();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(717);
				execute();
				}
				break;
			case GET_FILES:
				enterOuterAlt(_localctx, 13);
				{
				setState(718);
				get_files();
				}
				break;
			case DATE_MODIFIED:
				enterOuterAlt(_localctx, 14);
				{
				setState(719);
				date_modified();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 15);
				{
				setState(720);
				size();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 16);
				{
				setState(721);
				exit();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 17);
				{
				setState(722);
				create();
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 18);
				{
				setState(723);
				length();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 19);
				{
				setState(724);
				match(TIME);
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 20);
				{
				setState(725);
				match(FILE);
				}
				break;
			case FOLDER:
				enterOuterAlt(_localctx, 21);
				{
				setState(726);
				match(FOLDER);
				}
				break;
			case ARGS:
				enterOuterAlt(_localctx, 22);
				{
				setState(727);
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
		enterRule(_localctx, 30, RULE_atom_instr);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				own_fn_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				exist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732);
				print_instr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				rename();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(734);
				remove();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735);
				move();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(736);
				copy();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737);
				download();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(738);
				write();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(739);
				read();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(740);
				wait_instr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(741);
				execute();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(742);
				get_files();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(743);
				date_modified();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(744);
				size();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(745);
				exit();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(746);
				create();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(747);
				array_append();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(748);
				assign();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(749);
				match(TIME);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(750);
				match(FILE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(751);
				match(FOLDER);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(752);
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
			setState(755);
			match(ID);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(T__4);
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
		enterRule(_localctx, 34, RULE_array_append);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(ID);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(772);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
			match(APPEND);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(779);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
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

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
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
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(ID);
			setState(788);
			match(T__5);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(789);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
			value_or_id();
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(796);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
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
		enterRule(_localctx, 38, RULE_own_fn_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(ID);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(805);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(T__1);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(812);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(818);
				value_or_id();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(819);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(825);
					match(T__2);
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(826);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(831);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(832);
					value_or_id();
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(833);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(838);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(846);
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
		enterRule(_localctx, 40, RULE_exist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(EXIST);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(849);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(855);
			match(T__1);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(856);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(862);
			value_or_id();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(863);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869);
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
		enterRule(_localctx, 42, RULE_print_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(PRINT);
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(878);
			match(T__1);
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			value_or_id();
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(892);
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
		enterRule(_localctx, 44, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(RENAME);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(895);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(901);
			match(T__1);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(902);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			value_or_id();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(909);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(915);
			match(T__2);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(916);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(922);
			value_or_id();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(923);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(929);
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
		enterRule(_localctx, 46, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(REMOVE);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(932);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(938);
			match(T__1);
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(939);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
			value_or_id();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(946);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(952);
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
		enterRule(_localctx, 48, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(MOVE);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(955);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(961);
			match(T__1);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(962);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(968);
			value_or_id();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(969);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			match(T__2);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(976);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
			value_or_id();
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(983);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(989);
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
		enterRule(_localctx, 50, RULE_copy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(COPY);
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(992);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(998);
			match(T__1);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(999);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005);
			value_or_id();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1006);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012);
			match(T__2);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1013);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			value_or_id();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1020);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1026);
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
		enterRule(_localctx, 52, RULE_download);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(DOWNLOAD);
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1029);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035);
			match(T__1);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1036);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			value_or_id();
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1043);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			match(T__2);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1050);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
			value_or_id();
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1057);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
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
		enterRule(_localctx, 54, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(WRITE);
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1066);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1072);
			match(T__1);
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1073);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
			value_or_id();
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1080);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1086);
			match(T__2);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1087);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
			value_or_id();
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1094);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1100);
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
		enterRule(_localctx, 56, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(READ);
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1103);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1109);
			match(T__1);
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
			value_or_id();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1117);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123);
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
		enterRule(_localctx, 58, RULE_wait_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			match(WAIT);
			setState(1129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1126);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1132);
			match(T__1);
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1133);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 60, RULE_execute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(EXECUTE);
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
			setState(1178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
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
					match(T__2);
					setState(1173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==NL) {
						{
						{
						setState(1170);
						_la = _input.LA(1);
						if ( !(_la==WS || _la==NL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(1180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			setState(1181);
			value_or_id();
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
		enterRule(_localctx, 62, RULE_get_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(GET_FILES);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1191);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1197);
			match(T__1);
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
			value_or_id();
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
			setState(1211);
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
		enterRule(_localctx, 64, RULE_date_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(DATE_MODIFIED);
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1214);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1220);
			match(T__1);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1221);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1227);
			value_or_id();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1228);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
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
		enterRule(_localctx, 66, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(SIZE);
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1237);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			match(T__1);
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1244);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1250);
			value_or_id();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1251);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1257);
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
		enterRule(_localctx, 68, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(EXIT);
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1260);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1266);
			match(T__1);
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1267);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1273);
			value_or_id();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1274);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280);
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
		enterRule(_localctx, 70, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(CREATE);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1283);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1289);
			match(T__1);
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
			setState(1296);
			value_or_id();
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1297);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1303);
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
		enterRule(_localctx, 72, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			match(LENGTH);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1306);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1312);
			match(T__1);
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==NL) {
				{
				{
				setState(1313);
				_la = _input.LA(1);
				if ( !(_la==WS || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(1319);
				match(ID);
				}
				break;
			case T__5:
				{
				setState(1320);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		enterRule(_localctx, 74, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			match(T__5);
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
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << STR) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(1338);
				value_or_id();
				setState(1355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
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
						match(T__2);
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
						value_or_id();
						}
						} 
					}
					setState(1357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==NL) {
					{
					{
					setState(1358);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1366);
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
		enterRule(_localctx, 76, RULE_value_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u055d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13"+
		"\2\3\2\3\2\7\2g\n\2\f\2\16\2j\13\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\6\2"+
		"s\n\2\r\2\16\2t\3\2\3\2\5\2y\n\2\3\2\6\2|\n\2\r\2\16\2}\7\2\u0080\n\2"+
		"\f\2\16\2\u0083\13\2\3\2\3\2\7\2\u0087\n\2\f\2\16\2\u008a\13\2\3\2\5\2"+
		"\u008d\n\2\3\2\3\2\5\2\u0091\n\2\5\2\u0093\n\2\5\2\u0095\n\2\3\2\7\2\u0098"+
		"\n\2\f\2\16\2\u009b\13\2\3\2\5\2\u009e\n\2\3\2\3\2\3\3\3\3\6\3\u00a4\n"+
		"\3\r\3\16\3\u00a5\3\3\3\3\7\3\u00aa\n\3\f\3\16\3\u00ad\13\3\3\3\3\3\7"+
		"\3\u00b1\n\3\f\3\16\3\u00b4\13\3\3\3\3\3\7\3\u00b8\n\3\f\3\16\3\u00bb"+
		"\13\3\3\3\3\3\7\3\u00bf\n\3\f\3\16\3\u00c2\13\3\3\3\3\3\7\3\u00c6\n\3"+
		"\f\3\16\3\u00c9\13\3\7\3\u00cb\n\3\f\3\16\3\u00ce\13\3\5\3\u00d0\n\3\3"+
		"\3\3\3\7\3\u00d4\n\3\f\3\16\3\u00d7\13\3\3\3\3\3\6\3\u00db\n\3\r\3\16"+
		"\3\u00dc\3\3\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3\3\7\3\u00e8\n"+
		"\3\f\3\16\3\u00eb\13\3\3\3\3\3\7\3\u00ef\n\3\f\3\16\3\u00f2\13\3\3\3\3"+
		"\3\7\3\u00f6\n\3\f\3\16\3\u00f9\13\3\6\3\u00fb\n\3\r\3\16\3\u00fc\3\3"+
		"\3\3\6\3\u0101\n\3\r\3\16\3\u0102\7\3\u0105\n\3\f\3\16\3\u0108\13\3\3"+
		"\3\3\3\7\3\u010c\n\3\f\3\16\3\u010f\13\3\3\3\5\3\u0112\n\3\3\3\5\3\u0115"+
		"\n\3\3\3\6\3\u0118\n\3\r\3\16\3\u0119\5\3\u011c\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4\u0123\n\4\3\5\3\5\6\5\u0127\n\5\r\5\16\5\u0128\3\5\3\5\6\5\u012d"+
		"\n\5\r\5\16\5\u012e\3\5\3\5\6\5\u0133\n\5\r\5\16\5\u0134\3\5\3\5\6\5\u0139"+
		"\n\5\r\5\16\5\u013a\3\5\3\5\6\5\u013f\n\5\r\5\16\5\u0140\3\5\3\5\7\5\u0145"+
		"\n\5\f\5\16\5\u0148\13\5\3\5\3\5\7\5\u014c\n\5\f\5\16\5\u014f\13\5\3\5"+
		"\3\5\7\5\u0153\n\5\f\5\16\5\u0156\13\5\3\5\3\5\7\5\u015a\n\5\f\5\16\5"+
		"\u015d\13\5\6\5\u015f\n\5\r\5\16\5\u0160\3\5\3\5\6\5\u0165\n\5\r\5\16"+
		"\5\u0166\7\5\u0169\n\5\f\5\16\5\u016c\13\5\3\5\3\5\7\5\u0170\n\5\f\5\16"+
		"\5\u0173\13\5\3\5\3\5\6\5\u0177\n\5\r\5\16\5\u0178\5\5\u017b\n\5\3\5\3"+
		"\5\6\5\u017f\n\5\r\5\16\5\u0180\5\5\u0183\n\5\5\5\u0185\n\5\3\5\3\5\3"+
		"\6\3\6\6\6\u018b\n\6\r\6\16\6\u018c\3\6\3\6\6\6\u0191\n\6\r\6\16\6\u0192"+
		"\3\6\3\6\6\6\u0197\n\6\r\6\16\6\u0198\3\6\3\6\7\6\u019d\n\6\f\6\16\6\u01a0"+
		"\13\6\3\6\3\6\7\6\u01a4\n\6\f\6\16\6\u01a7\13\6\3\6\3\6\7\6\u01ab\n\6"+
		"\f\6\16\6\u01ae\13\6\3\6\3\6\7\6\u01b2\n\6\f\6\16\6\u01b5\13\6\6\6\u01b7"+
		"\n\6\r\6\16\6\u01b8\3\6\3\6\6\6\u01bd\n\6\r\6\16\6\u01be\7\6\u01c1\n\6"+
		"\f\6\16\6\u01c4\13\6\3\6\3\6\7\6\u01c8\n\6\f\6\16\6\u01cb\13\6\3\6\3\6"+
		"\6\6\u01cf\n\6\r\6\16\6\u01d0\5\6\u01d3\n\6\3\6\3\6\6\6\u01d7\n\6\r\6"+
		"\16\6\u01d8\5\6\u01db\n\6\5\6\u01dd\n\6\3\6\3\6\3\7\3\7\3\7\7\7\u01e4"+
		"\n\7\f\7\16\7\u01e7\13\7\3\7\5\7\u01ea\n\7\3\7\3\7\3\b\3\b\6\b\u01f0\n"+
		"\b\r\b\16\b\u01f1\3\b\3\b\6\b\u01f6\n\b\r\b\16\b\u01f7\3\t\3\t\6\t\u01fc"+
		"\n\t\r\t\16\t\u01fd\3\t\3\t\7\t\u0202\n\t\f\t\16\t\u0205\13\t\3\t\3\t"+
		"\7\t\u0209\n\t\f\t\16\t\u020c\13\t\3\t\3\t\7\t\u0210\n\t\f\t\16\t\u0213"+
		"\13\t\3\t\3\t\7\t\u0217\n\t\f\t\16\t\u021a\13\t\6\t\u021c\n\t\r\t\16\t"+
		"\u021d\3\t\3\t\6\t\u0222\n\t\r\t\16\t\u0223\7\t\u0226\n\t\f\t\16\t\u0229"+
		"\13\t\3\t\3\t\7\t\u022d\n\t\f\t\16\t\u0230\13\t\3\t\3\t\6\t\u0234\n\t"+
		"\r\t\16\t\u0235\5\t\u0238\n\t\3\t\3\t\6\t\u023c\n\t\r\t\16\t\u023d\5\t"+
		"\u0240\n\t\5\t\u0242\n\t\3\n\3\n\6\n\u0246\n\n\r\n\16\n\u0247\3\n\3\n"+
		"\3\n\3\13\3\13\6\13\u024f\n\13\r\13\16\13\u0250\3\13\3\13\7\13\u0255\n"+
		"\13\f\13\16\13\u0258\13\13\3\13\3\13\7\13\u025c\n\13\f\13\16\13\u025f"+
		"\13\13\3\13\3\13\7\13\u0263\n\13\f\13\16\13\u0266\13\13\3\13\3\13\7\13"+
		"\u026a\n\13\f\13\16\13\u026d\13\13\6\13\u026f\n\13\r\13\16\13\u0270\3"+
		"\13\3\13\6\13\u0275\n\13\r\13\16\13\u0276\7\13\u0279\n\13\f\13\16\13\u027c"+
		"\13\13\3\13\3\13\7\13\u0280\n\13\f\13\16\13\u0283\13\13\3\13\3\13\6\13"+
		"\u0287\n\13\r\13\16\13\u0288\5\13\u028b\n\13\3\13\3\13\6\13\u028f\n\13"+
		"\r\13\16\13\u0290\5\13\u0293\n\13\5\13\u0295\n\13\3\f\3\f\3\f\5\f\u029a"+
		"\n\f\3\r\3\r\7\r\u029e\n\r\f\r\16\r\u02a1\13\r\3\r\3\r\7\r\u02a5\n\r\f"+
		"\r\16\r\u02a8\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u02b3"+
		"\n\16\3\17\3\17\7\17\u02b7\n\17\f\17\16\17\u02ba\13\17\3\17\3\17\7\17"+
		"\u02be\n\17\f\17\16\17\u02c1\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u02db\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u02f4\n\21\3\22\3\22\7\22\u02f8\n\22\f\22\16\22\u02fb\13\22"+
		"\3\22\3\22\7\22\u02ff\n\22\f\22\16\22\u0302\13\22\3\22\3\22\3\23\3\23"+
		"\7\23\u0308\n\23\f\23\16\23\u030b\13\23\3\23\3\23\7\23\u030f\n\23\f\23"+
		"\16\23\u0312\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u0319\n\24\f\24\16\24"+
		"\u031c\13\24\3\24\3\24\7\24\u0320\n\24\f\24\16\24\u0323\13\24\3\24\3\24"+
		"\3\25\3\25\7\25\u0329\n\25\f\25\16\25\u032c\13\25\3\25\3\25\7\25\u0330"+
		"\n\25\f\25\16\25\u0333\13\25\3\25\3\25\7\25\u0337\n\25\f\25\16\25\u033a"+
		"\13\25\3\25\3\25\7\25\u033e\n\25\f\25\16\25\u0341\13\25\3\25\3\25\7\25"+
		"\u0345\n\25\f\25\16\25\u0348\13\25\7\25\u034a\n\25\f\25\16\25\u034d\13"+
		"\25\5\25\u034f\n\25\3\25\3\25\3\26\3\26\7\26\u0355\n\26\f\26\16\26\u0358"+
		"\13\26\3\26\3\26\7\26\u035c\n\26\f\26\16\26\u035f\13\26\3\26\3\26\7\26"+
		"\u0363\n\26\f\26\16\26\u0366\13\26\3\26\3\26\3\27\3\27\7\27\u036c\n\27"+
		"\f\27\16\27\u036f\13\27\3\27\3\27\7\27\u0373\n\27\f\27\16\27\u0376\13"+
		"\27\3\27\3\27\7\27\u037a\n\27\f\27\16\27\u037d\13\27\3\27\3\27\3\30\3"+
		"\30\7\30\u0383\n\30\f\30\16\30\u0386\13\30\3\30\3\30\7\30\u038a\n\30\f"+
		"\30\16\30\u038d\13\30\3\30\3\30\7\30\u0391\n\30\f\30\16\30\u0394\13\30"+
		"\3\30\3\30\7\30\u0398\n\30\f\30\16\30\u039b\13\30\3\30\3\30\7\30\u039f"+
		"\n\30\f\30\16\30\u03a2\13\30\3\30\3\30\3\31\3\31\7\31\u03a8\n\31\f\31"+
		"\16\31\u03ab\13\31\3\31\3\31\7\31\u03af\n\31\f\31\16\31\u03b2\13\31\3"+
		"\31\3\31\7\31\u03b6\n\31\f\31\16\31\u03b9\13\31\3\31\3\31\3\32\3\32\7"+
		"\32\u03bf\n\32\f\32\16\32\u03c2\13\32\3\32\3\32\7\32\u03c6\n\32\f\32\16"+
		"\32\u03c9\13\32\3\32\3\32\7\32\u03cd\n\32\f\32\16\32\u03d0\13\32\3\32"+
		"\3\32\7\32\u03d4\n\32\f\32\16\32\u03d7\13\32\3\32\3\32\7\32\u03db\n\32"+
		"\f\32\16\32\u03de\13\32\3\32\3\32\3\33\3\33\7\33\u03e4\n\33\f\33\16\33"+
		"\u03e7\13\33\3\33\3\33\7\33\u03eb\n\33\f\33\16\33\u03ee\13\33\3\33\3\33"+
		"\7\33\u03f2\n\33\f\33\16\33\u03f5\13\33\3\33\3\33\7\33\u03f9\n\33\f\33"+
		"\16\33\u03fc\13\33\3\33\3\33\7\33\u0400\n\33\f\33\16\33\u0403\13\33\3"+
		"\33\3\33\3\34\3\34\7\34\u0409\n\34\f\34\16\34\u040c\13\34\3\34\3\34\7"+
		"\34\u0410\n\34\f\34\16\34\u0413\13\34\3\34\3\34\7\34\u0417\n\34\f\34\16"+
		"\34\u041a\13\34\3\34\3\34\7\34\u041e\n\34\f\34\16\34\u0421\13\34\3\34"+
		"\3\34\7\34\u0425\n\34\f\34\16\34\u0428\13\34\3\34\3\34\3\35\3\35\7\35"+
		"\u042e\n\35\f\35\16\35\u0431\13\35\3\35\3\35\7\35\u0435\n\35\f\35\16\35"+
		"\u0438\13\35\3\35\3\35\7\35\u043c\n\35\f\35\16\35\u043f\13\35\3\35\3\35"+
		"\7\35\u0443\n\35\f\35\16\35\u0446\13\35\3\35\3\35\7\35\u044a\n\35\f\35"+
		"\16\35\u044d\13\35\3\35\3\35\3\36\3\36\7\36\u0453\n\36\f\36\16\36\u0456"+
		"\13\36\3\36\3\36\7\36\u045a\n\36\f\36\16\36\u045d\13\36\3\36\3\36\7\36"+
		"\u0461\n\36\f\36\16\36\u0464\13\36\3\36\3\36\3\37\3\37\7\37\u046a\n\37"+
		"\f\37\16\37\u046d\13\37\3\37\3\37\7\37\u0471\n\37\f\37\16\37\u0474\13"+
		"\37\3\37\3\37\7\37\u0478\n\37\f\37\16\37\u047b\13\37\3\37\3\37\3 \3 \7"+
		" \u0481\n \f \16 \u0484\13 \3 \3 \7 \u0488\n \f \16 \u048b\13 \3 \3 \7"+
		" \u048f\n \f \16 \u0492\13 \3 \3 \7 \u0496\n \f \16 \u0499\13 \7 \u049b"+
		"\n \f \16 \u049e\13 \3 \3 \7 \u04a2\n \f \16 \u04a5\13 \3 \3 \3!\3!\7"+
		"!\u04ab\n!\f!\16!\u04ae\13!\3!\3!\7!\u04b2\n!\f!\16!\u04b5\13!\3!\3!\7"+
		"!\u04b9\n!\f!\16!\u04bc\13!\3!\3!\3\"\3\"\7\"\u04c2\n\"\f\"\16\"\u04c5"+
		"\13\"\3\"\3\"\7\"\u04c9\n\"\f\"\16\"\u04cc\13\"\3\"\3\"\7\"\u04d0\n\""+
		"\f\"\16\"\u04d3\13\"\3\"\3\"\3#\3#\7#\u04d9\n#\f#\16#\u04dc\13#\3#\3#"+
		"\7#\u04e0\n#\f#\16#\u04e3\13#\3#\3#\7#\u04e7\n#\f#\16#\u04ea\13#\3#\3"+
		"#\3$\3$\7$\u04f0\n$\f$\16$\u04f3\13$\3$\3$\7$\u04f7\n$\f$\16$\u04fa\13"+
		"$\3$\3$\7$\u04fe\n$\f$\16$\u0501\13$\3$\3$\3%\3%\7%\u0507\n%\f%\16%\u050a"+
		"\13%\3%\3%\7%\u050e\n%\f%\16%\u0511\13%\3%\3%\7%\u0515\n%\f%\16%\u0518"+
		"\13%\3%\3%\3&\3&\7&\u051e\n&\f&\16&\u0521\13&\3&\3&\7&\u0525\n&\f&\16"+
		"&\u0528\13&\3&\3&\5&\u052c\n&\3&\7&\u052f\n&\f&\16&\u0532\13&\3&\3&\3"+
		"\'\3\'\7\'\u0538\n\'\f\'\16\'\u053b\13\'\3\'\3\'\7\'\u053f\n\'\f\'\16"+
		"\'\u0542\13\'\3\'\3\'\7\'\u0546\n\'\f\'\16\'\u0549\13\'\3\'\7\'\u054c"+
		"\n\'\f\'\16\'\u054f\13\'\3\'\7\'\u0552\n\'\f\'\16\'\u0555\13\'\5\'\u0557"+
		"\n\'\3\'\3\'\3(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLN\2\4\3\2\61\62\3\2-\60\2\u0637\2S\3\2\2\2"+
		"\4\u00a1\3\2\2\2\6\u0122\3\2\2\2\b\u0124\3\2\2\2\n\u0188\3\2\2\2\f\u01e0"+
		"\3\2\2\2\16\u01ed\3\2\2\2\20\u01f9\3\2\2\2\22\u0243\3\2\2\2\24\u024c\3"+
		"\2\2\2\26\u0299\3\2\2\2\30\u029b\3\2\2\2\32\u02b2\3\2\2\2\34\u02b4\3\2"+
		"\2\2\36\u02da\3\2\2\2 \u02f3\3\2\2\2\"\u02f5\3\2\2\2$\u0305\3\2\2\2&\u0315"+
		"\3\2\2\2(\u0326\3\2\2\2*\u0352\3\2\2\2,\u0369\3\2\2\2.\u0380\3\2\2\2\60"+
		"\u03a5\3\2\2\2\62\u03bc\3\2\2\2\64\u03e1\3\2\2\2\66\u0406\3\2\2\28\u042b"+
		"\3\2\2\2:\u0450\3\2\2\2<\u0467\3\2\2\2>\u047e\3\2\2\2@\u04a8\3\2\2\2B"+
		"\u04bf\3\2\2\2D\u04d6\3\2\2\2F\u04ed\3\2\2\2H\u0504\3\2\2\2J\u051b\3\2"+
		"\2\2L\u0535\3\2\2\2N\u055a\3\2\2\2PR\t\2\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2T\u0094\3\2\2\2US\3\2\2\2VZ\5 \21\2WY\t\2\2\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]a\7\3\2\2^`\t\2\2"+
		"\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\u0080\3\2\2\2ca\3\2\2\2dr"+
		"\5 \21\2eg\7\61\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2ko\7\62\2\2ln\7\61\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2rh\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\u0080"+
		"\3\2\2\2vy\5\6\4\2wy\5\4\3\2xv\3\2\2\2xw\3\2\2\2y{\3\2\2\2z|\t\2\2\2{"+
		"z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177V\3\2\2\2\177"+
		"d\3\2\2\2\177x\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0092\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\5 \21\2\u0085"+
		"\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008d\7\3\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0093\3\2"+
		"\2\2\u008e\u0091\5\6\4\2\u008f\u0091\5\4\3\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0081\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0099\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\7\63\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\2\2\3\u00a0\3\3\2\2\2\u00a1\u00a3"+
		"\7\n\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\7/"+
		"\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b2\7\4\2\2\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00cf\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b9\7/\2\2\u00b6\u00b8\t\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00cc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0\7\5\2\2\u00bd"+
		"\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c7\7/\2\2\u00c4\u00c6\t\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00bc\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00b5\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\7\6"+
		"\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00da\7\22\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u011b\3\2"+
		"\2\2\u00de\u00e2\5 \21\2\u00df\u00e1\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\7\3\2\2\u00e6\u00e8\t\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u0105\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00fa\5 \21\2\u00ed"+
		"\u00ef\7\61\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f7\7\62\2\2\u00f4\u00f6\7\61\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0105\3\2\2\2\u00fe\u0100\5\6\4\2\u00ff"+
		"\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00de\3\2\2\2\u0104"+
		"\u00ec\3\2\2\2\u0104\u00fe\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0114\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010d\5 \21\2\u010a\u010c\t\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\7\3\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0115\5\6\4\2\u0114\u0109\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\7\23\2\2\u011e\5\3\2\2\2\u011f\u0123\5\f\7\2\u0120\u0123"+
		"\5\n\6\2\u0121\u0123\5\b\5\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\7\3\2\2\2\u0124\u0126\7\f\2\2\u0125\u0127\t\2\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7/\2\2\u012b\u012d\t\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\r\2\2\u0131\u0133\t\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\7/\2\2\u0137\u0139\t\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\7\16\2\2\u013d\u013f\t\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0184\3\2\2\2\u0142\u0146\5 \21\2\u0143\u0145\t\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014d\7\3\2\2\u014a"+
		"\u014c\t\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0169\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u015e\5 \21\2\u0151\u0153\7\61\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u015b\7\62\2\2\u0158\u015a\7\61\2\2\u0159\u0158\3"+
		"\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0154\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0169\3\2\2\2\u0162"+
		"\u0164\5\6\4\2\u0163\u0165\t\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0142\3\2\2\2\u0168\u0150\3\2\2\2\u0168\u0162\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0182\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0171\5 \21\2\u016e\u0170\t\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u017a\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u017b\7\3\2\2\u0175\u0177\t\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0176\3\2"+
		"\2\2\u017b\u0183\3\2\2\2\u017c\u017e\5\6\4\2\u017d\u017f\t\2\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u016d\3\2\2\2\u0182\u017c\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u016a\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0187\7\23\2\2\u0187\t\3\2\2\2\u0188\u018a\7\13\2\2\u0189\u018b"+
		"\t\2\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\5\26\f\2\u018f\u0191\t"+
		"\2\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\7\16\2\2\u0195\u0197\t"+
		"\2\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u01dc\3\2\2\2\u019a\u019e\5 \21\2\u019b\u019d\t\2"+
		"\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a5\7\3"+
		"\2\2\u01a2\u01a4\t\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01c1\3\2\2\2\u01a7\u01a5\3\2"+
		"\2\2\u01a8\u01b6\5 \21\2\u01a9\u01ab\7\61\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\7\62\2\2\u01b0\u01b2\7\61\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ac\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c1\3\2"+
		"\2\2\u01ba\u01bc\5\6\4\2\u01bb\u01bd\t\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2"+
		"\2\2\u01c0\u019a\3\2\2\2\u01c0\u01a8\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01da\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c9\5 \21\2\u01c6\u01c8\t\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01ca\u01d2\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d3\7\3\2\2\u01cd"+
		"\u01cf\t\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2"+
		"\u01ce\3\2\2\2\u01d3\u01db\3\2\2\2\u01d4\u01d6\5\6\4\2\u01d5\u01d7\t\2"+
		"\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01c5\3\2\2\2\u01da\u01d4\3\2"+
		"\2\2\u01db\u01dd\3\2\2\2\u01dc\u01c2\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01df\7\23\2\2\u01df\13\3\2\2\2\u01e0\u01e1\5\16"+
		"\b\2\u01e1\u01e5\5\20\t\2\u01e2\u01e4\5\22\n\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\5\24\13\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7\23\2\2\u01ec\r\3\2\2"+
		"\2\u01ed\u01ef\7\17\2\2\u01ee\u01f0\t\2\2\2\u01ef\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f5\5\26\f\2\u01f4\u01f6\t\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\17\3\2\2"+
		"\2\u01f9\u01fb\7\20\2\2\u01fa\u01fc\t\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0241\3\2"+
		"\2\2\u01ff\u0203\5 \21\2\u0200\u0202\t\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u020a\7\3\2\2\u0207\u0209\t\2\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u0226\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u021b\5 \21\2\u020e"+
		"\u0210\7\61\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3"+
		"\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214"+
		"\u0218\7\62\2\2\u0215\u0217\7\61\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3"+
		"\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u0211\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u0226\3\2\2\2\u021f\u0221\5\6\4\2\u0220"+
		"\u0222\t\2\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u01ff\3\2\2\2\u0225"+
		"\u020d\3\2\2\2\u0225\u021f\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u023f\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022e\5 \21\2\u022b\u022d\t\2\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0237\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0238\7\3\2\2\u0232\u0234\t\2\2\2\u0233\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0231\3\2\2\2\u0237\u0233\3\2\2\2\u0238\u0240\3\2"+
		"\2\2\u0239\u023b\5\6\4\2\u023a\u023c\t\2\2\2\u023b\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2"+
		"\2\2\u023f\u022a\3\2\2\2\u023f\u0239\3\2\2\2\u0240\u0242\3\2\2\2\u0241"+
		"\u0227\3\2\2\2\u0241\u0242\3\2\2\2\u0242\21\3\2\2\2\u0243\u0245\7\21\2"+
		"\2\u0244\u0246\t\2\2\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\5\16\b\2"+
		"\u024a\u024b\5\20\t\2\u024b\23\3\2\2\2\u024c\u024e\7\21\2\2\u024d\u024f"+
		"\t\2\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0294\3\2\2\2\u0252\u0256\5 \21\2\u0253\u0255\t\2"+
		"\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025d\7\3"+
		"\2\2\u025a\u025c\t\2\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0279\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u0260\u026e\5 \21\2\u0261\u0263\7\61\2\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u026b\7\62\2\2\u0268\u026a\7\61\2\2\u0269"+
		"\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0264\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0279\3\2"+
		"\2\2\u0272\u0274\5\6\4\2\u0273\u0275\t\2\2\2\u0274\u0273\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2"+
		"\2\2\u0278\u0252\3\2\2\2\u0278\u0260\3\2\2\2\u0278\u0272\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0292\3\2"+
		"\2\2\u027c\u027a\3\2\2\2\u027d\u0281\5 \21\2\u027e\u0280\t\2\2\2\u027f"+
		"\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u028a\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u028b\7\3\2\2\u0285"+
		"\u0287\t\2\2\2\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u0284\3\2\2\2\u028a"+
		"\u0286\3\2\2\2\u028b\u0293\3\2\2\2\u028c\u028e\5\6\4\2\u028d\u028f\t\2"+
		"\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u027d\3\2\2\2\u0292\u028c\3\2"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u027a\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\25\3\2\2\2\u0296\u029a\5\36\20\2\u0297\u029a\7-\2\2\u0298\u029a\5\30"+
		"\r\2\u0299\u0296\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\27\3\2\2\2\u029b\u029f\5\32\16\2\u029c\u029e\t\2\2\2\u029d\u029c\3\2"+
		"\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a6\7*\2\2\u02a3\u02a5\t\2"+
		"\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\5\32"+
		"\16\2\u02aa\31\3\2\2\2\u02ab\u02b3\5\36\20\2\u02ac\u02b3\7.\2\2\u02ad"+
		"\u02b3\7\60\2\2\u02ae\u02b3\7/\2\2\u02af\u02b3\5\34\17\2\u02b0\u02b3\5"+
		"L\'\2\u02b1\u02b3\5&\24\2\u02b2\u02ab\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b2"+
		"\u02ad\3\2\2\2\u02b2\u02ae\3\2\2\2\u02b2\u02af\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b3\33\3\2\2\2\u02b4\u02b8\5N(\2\u02b5\u02b7"+
		"\t\2\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bf\7+"+
		"\2\2\u02bc\u02be\t\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2"+
		"\2\2\u02c2\u02c3\5N(\2\u02c3\35\3\2\2\2\u02c4\u02db\5(\25\2\u02c5\u02db"+
		"\5*\26\2\u02c6\u02db\5,\27\2\u02c7\u02db\5.\30\2\u02c8\u02db\5\60\31\2"+
		"\u02c9\u02db\5\62\32\2\u02ca\u02db\5\64\33\2\u02cb\u02db\5\66\34\2\u02cc"+
		"\u02db\58\35\2\u02cd\u02db\5:\36\2\u02ce\u02db\5<\37\2\u02cf\u02db\5>"+
		" \2\u02d0\u02db\5@!\2\u02d1\u02db\5B\"\2\u02d2\u02db\5D#\2\u02d3\u02db"+
		"\5F$\2\u02d4\u02db\5H%\2\u02d5\u02db\5J&\2\u02d6\u02db\7\37\2\2\u02d7"+
		"\u02db\7\"\2\2\u02d8\u02db\7#\2\2\u02d9\u02db\7$\2\2\u02da\u02c4\3\2\2"+
		"\2\u02da\u02c5\3\2\2\2\u02da\u02c6\3\2\2\2\u02da\u02c7\3\2\2\2\u02da\u02c8"+
		"\3\2\2\2\u02da\u02c9\3\2\2\2\u02da\u02ca\3\2\2\2\u02da\u02cb\3\2\2\2\u02da"+
		"\u02cc\3\2\2\2\u02da\u02cd\3\2\2\2\u02da\u02ce\3\2\2\2\u02da\u02cf\3\2"+
		"\2\2\u02da\u02d0\3\2\2\2\u02da\u02d1\3\2\2\2\u02da\u02d2\3\2\2\2\u02da"+
		"\u02d3\3\2\2\2\u02da\u02d4\3\2\2\2\u02da\u02d5\3\2\2\2\u02da\u02d6\3\2"+
		"\2\2\u02da\u02d7\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02db"+
		"\37\3\2\2\2\u02dc\u02f4\5(\25\2\u02dd\u02f4\5*\26\2\u02de\u02f4\5,\27"+
		"\2\u02df\u02f4\5.\30\2\u02e0\u02f4\5\60\31\2\u02e1\u02f4\5\62\32\2\u02e2"+
		"\u02f4\5\64\33\2\u02e3\u02f4\5\66\34\2\u02e4\u02f4\58\35\2\u02e5\u02f4"+
		"\5:\36\2\u02e6\u02f4\5<\37\2\u02e7\u02f4\5> \2\u02e8\u02f4\5@!\2\u02e9"+
		"\u02f4\5B\"\2\u02ea\u02f4\5D#\2\u02eb\u02f4\5F$\2\u02ec\u02f4\5H%\2\u02ed"+
		"\u02f4\5$\23\2\u02ee\u02f4\5\"\22\2\u02ef\u02f4\7\37\2\2\u02f0\u02f4\7"+
		"\"\2\2\u02f1\u02f4\7#\2\2\u02f2\u02f4\7$\2\2\u02f3\u02dc\3\2\2\2\u02f3"+
		"\u02dd\3\2\2\2\u02f3\u02de\3\2\2\2\u02f3\u02df\3\2\2\2\u02f3\u02e0\3\2"+
		"\2\2\u02f3\u02e1\3\2\2\2\u02f3\u02e2\3\2\2\2\u02f3\u02e3\3\2\2\2\u02f3"+
		"\u02e4\3\2\2\2\u02f3\u02e5\3\2\2\2\u02f3\u02e6\3\2\2\2\u02f3\u02e7\3\2"+
		"\2\2\u02f3\u02e8\3\2\2\2\u02f3\u02e9\3\2\2\2\u02f3\u02ea\3\2\2\2\u02f3"+
		"\u02eb\3\2\2\2\u02f3\u02ec\3\2\2\2\u02f3\u02ed\3\2\2\2\u02f3\u02ee\3\2"+
		"\2\2\u02f3\u02ef\3\2\2\2\u02f3\u02f0\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3"+
		"\u02f2\3\2\2\2\u02f4!\3\2\2\2\u02f5\u02f9\7/\2\2\u02f6\u02f8\t\2\2\2\u02f7"+
		"\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u0300\7\7\2\2\u02fd"+
		"\u02ff\t\2\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303"+
		"\u0304\5\32\16\2\u0304#\3\2\2\2\u0305\u0309\7/\2\2\u0306\u0308\t\2\2\2"+
		"\u0307\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a"+
		"\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u0310\7)\2\2\u030d"+
		"\u030f\t\2\2\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0314\5\32\16\2\u0314%\3\2\2\2\u0315\u0316\7/\2\2\u0316\u031a\7\b\2\2"+
		"\u0317\u0319\t\2\2\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d"+
		"\u0321\5N(\2\u031e\u0320\t\2\2\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2"+
		"\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0324\u0325\7\t\2\2\u0325\'\3\2\2\2\u0326\u032a\7/\2\2\u0327"+
		"\u0329\t\2\2\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2\2\2\u032c\u032a\3\2\2\2\u032d"+
		"\u0331\7\4\2\2\u032e\u0330\t\2\2\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2"+
		"\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u034e\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0338\5N(\2\u0335\u0337\t\2\2\2\u0336\u0335\3\2\2"+
		"\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u034b"+
		"\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033f\7\5\2\2\u033c\u033e\t\2\2\2\u033d"+
		"\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2"+
		"\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0346\5N(\2\u0343\u0345"+
		"\t\2\2\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u033b\3\2"+
		"\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0334\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0350\3\2\2\2\u0350\u0351\7\6\2\2\u0351)\3\2\2\2\u0352\u0356"+
		"\7\24\2\2\u0353\u0355\t\2\2\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2\2\2"+
		"\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356"+
		"\3\2\2\2\u0359\u035d\7\4\2\2\u035a\u035c\t\2\2\2\u035b\u035a\3\2\2\2\u035c"+
		"\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2"+
		"\2\2\u035f\u035d\3\2\2\2\u0360\u0364\5N(\2\u0361\u0363\t\2\2\2\u0362\u0361"+
		"\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0367\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\7\6\2\2\u0368+\3\2\2\2"+
		"\u0369\u036d\7\25\2\2\u036a\u036c\t\2\2\2\u036b\u036a\3\2\2\2\u036c\u036f"+
		"\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0374\7\4\2\2\u0371\u0373\t\2\2\2\u0372\u0371\3\2"+
		"\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u037b\5N(\2\u0378\u037a\t\2\2"+
		"\2\u0379\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u037e\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\7\6\2\2\u037f"+
		"-\3\2\2\2\u0380\u0384\7\26\2\2\u0381\u0383\t\2\2\2\u0382\u0381\3\2\2\2"+
		"\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387"+
		"\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u038b\7\4\2\2\u0388\u038a\t\2\2\2\u0389"+
		"\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u038e\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u0392\5N(\2\u038f\u0391"+
		"\t\2\2\2\u0390\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0399\7\5"+
		"\2\2\u0396\u0398\t\2\2\2\u0397\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399"+
		"\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b\u0399\3\2"+
		"\2\2\u039c\u03a0\5N(\2\u039d\u039f\t\2\2\2\u039e\u039d\3\2\2\2\u039f\u03a2"+
		"\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a3\u03a4\7\6\2\2\u03a4/\3\2\2\2\u03a5\u03a9\7\27\2\2"+
		"\u03a6\u03a8\t\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7"+
		"\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac"+
		"\u03b0\7\4\2\2\u03ad\u03af\t\2\2\2\u03ae\u03ad\3\2\2\2\u03af\u03b2\3\2"+
		"\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b3\u03b7\5N(\2\u03b4\u03b6\t\2\2\2\u03b5\u03b4\3\2\2"+
		"\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba\u03bb\7\6\2\2\u03bb\61\3\2\2\2\u03bc"+
		"\u03c0\7\30\2\2\u03bd\u03bf\t\2\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3"+
		"\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c3\u03c7\7\4\2\2\u03c4\u03c6\t\2\2\2\u03c5\u03c4\3\2"+
		"\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03ca\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03ce\5N(\2\u03cb\u03cd\t\2\2"+
		"\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d5\7\5\2\2\u03d2"+
		"\u03d4\t\2\2\2\u03d3\u03d2\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03dc\5N(\2\u03d9\u03db\t\2\2\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de\u03dc"+
		"\3\2\2\2\u03df\u03e0\7\6\2\2\u03e0\63\3\2\2\2\u03e1\u03e5\7\31\2\2\u03e2"+
		"\u03e4\t\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2"+
		"\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03ec\7\4\2\2\u03e9\u03eb\t\2\2\2\u03ea\u03e9\3\2\2\2\u03eb\u03ee\3\2"+
		"\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ef\u03f3\5N(\2\u03f0\u03f2\t\2\2\2\u03f1\u03f0\3\2\2"+
		"\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6"+
		"\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03fa\7\5\2\2\u03f7\u03f9\t\2\2\2\u03f8"+
		"\u03f7\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa\u03fb\3\2"+
		"\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0401\5N(\2\u03fe\u0400"+
		"\t\2\2\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0405\7\6"+
		"\2\2\u0405\65\3\2\2\2\u0406\u040a\7\32\2\2\u0407\u0409\t\2\2\2\u0408\u0407"+
		"\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u0411\7\4\2\2\u040e\u0410\t\2"+
		"\2\2\u040f\u040e\3\2\2\2\u0410\u0413\3\2\2\2\u0411\u040f\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u0418\5N"+
		"(\2\u0415\u0417\t\2\2\2\u0416\u0415\3\2\2\2\u0417\u041a\3\2\2\2\u0418"+
		"\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u0418\3\2"+
		"\2\2\u041b\u041f\7\5\2\2\u041c\u041e\t\2\2\2\u041d\u041c\3\2\2\2\u041e"+
		"\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\3\2"+
		"\2\2\u0421\u041f\3\2\2\2\u0422\u0426\5N(\2\u0423\u0425\t\2\2\2\u0424\u0423"+
		"\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042a\7\6\2\2\u042a\67\3\2\2"+
		"\2\u042b\u042f\7\33\2\2\u042c\u042e\t\2\2\2\u042d\u042c\3\2\2\2\u042e"+
		"\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0432\u0436\7\4\2\2\u0433\u0435\t\2\2\2\u0434"+
		"\u0433\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2"+
		"\2\2\u0437\u0439\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u043d\5N(\2\u043a\u043c"+
		"\t\2\2\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d"+
		"\u043e\3\2\2\2\u043e\u0440\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0444\7\5"+
		"\2\2\u0441\u0443\t\2\2\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444"+
		"\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0447\3\2\2\2\u0446\u0444\3\2"+
		"\2\2\u0447\u044b\5N(\2\u0448\u044a\t\2\2\2\u0449\u0448\3\2\2\2\u044a\u044d"+
		"\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e\3\2\2\2\u044d"+
		"\u044b\3\2\2\2\u044e\u044f\7\6\2\2\u044f9\3\2\2\2\u0450\u0454\7&\2\2\u0451"+
		"\u0453\t\2\2\2\u0452\u0451\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2"+
		"\2\2\u0454\u0455\3\2\2\2\u0455\u0457\3\2\2\2\u0456\u0454\3\2\2\2\u0457"+
		"\u045b\7\4\2\2\u0458\u045a\t\2\2\2\u0459\u0458\3\2\2\2\u045a\u045d\3\2"+
		"\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045e\u0462\5N(\2\u045f\u0461\t\2\2\2\u0460\u045f\3\2\2"+
		"\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465"+
		"\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7\6\2\2\u0466;\3\2\2\2\u0467"+
		"\u046b\7\34\2\2\u0468\u046a\t\2\2\2\u0469\u0468\3\2\2\2\u046a\u046d\3"+
		"\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\3\2\2\2\u046d"+
		"\u046b\3\2\2\2\u046e\u0472\7\4\2\2\u046f\u0471\t\2\2\2\u0470\u046f\3\2"+
		"\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473"+
		"\u0475\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0479\5N(\2\u0476\u0478\t\2\2"+
		"\2\u0477\u0476\3\2\2\2\u0478\u047b\3\2\2\2\u0479\u0477\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u047c\3\2\2\2\u047b\u0479\3\2\2\2\u047c\u047d\7\6\2\2\u047d"+
		"=\3\2\2\2\u047e\u0482\7\35\2\2\u047f\u0481\t\2\2\2\u0480\u047f\3\2\2\2"+
		"\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0485"+
		"\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u0489\7\4\2\2\u0486\u0488\t\2\2\2\u0487"+
		"\u0486\3\2\2\2\u0488\u048b\3\2\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2"+
		"\2\2\u048a\u049c\3\2\2\2\u048b\u0489\3\2\2\2\u048c\u0490\5N(\2\u048d\u048f"+
		"\t\2\2\2\u048e\u048d\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0493\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u0497\7\5"+
		"\2\2\u0494\u0496\t\2\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497"+
		"\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2"+
		"\2\2\u049a\u048c\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049a\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u049c\3\2\2\2\u049f\u04a3\5N"+
		"(\2\u04a0\u04a2\t\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3"+
		"\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u04a3\3\2"+
		"\2\2\u04a6\u04a7\7\6\2\2\u04a7?\3\2\2\2\u04a8\u04ac\7 \2\2\u04a9\u04ab"+
		"\t\2\2\2\u04aa\u04a9\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b3\7\4"+
		"\2\2\u04b0\u04b2\t\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3"+
		"\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b3\3\2"+
		"\2\2\u04b6\u04ba\5N(\2\u04b7\u04b9\t\2\2\2\u04b8\u04b7\3\2\2\2\u04b9\u04bc"+
		"\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2\2\u04bc"+
		"\u04ba\3\2\2\2\u04bd\u04be\7\6\2\2\u04beA\3\2\2\2\u04bf\u04c3\7!\2\2\u04c0"+
		"\u04c2\t\2\2\2\u04c1\u04c0\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2"+
		"\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6"+
		"\u04ca\7\4\2\2\u04c7\u04c9\t\2\2\2\u04c8\u04c7\3\2\2\2\u04c9\u04cc\3\2"+
		"\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\3\2\2\2\u04cc"+
		"\u04ca\3\2\2\2\u04cd\u04d1\5N(\2\u04ce\u04d0\t\2\2\2\u04cf\u04ce\3\2\2"+
		"\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4"+
		"\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5\7\6\2\2\u04d5C\3\2\2\2\u04d6"+
		"\u04da\7%\2\2\u04d7\u04d9\t\2\2\2\u04d8\u04d7\3\2\2\2\u04d9\u04dc\3\2"+
		"\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dd\u04e1\7\4\2\2\u04de\u04e0\t\2\2\2\u04df\u04de\3\2"+
		"\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e4\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e8\5N(\2\u04e5\u04e7\t\2\2"+
		"\2\u04e6\u04e5\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04ec\7\6\2\2\u04ec"+
		"E\3\2\2\2\u04ed\u04f1\7\36\2\2\u04ee\u04f0\t\2\2\2\u04ef\u04ee\3\2\2\2"+
		"\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4"+
		"\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f8\7\4\2\2\u04f5\u04f7\t\2\2\2\u04f6"+
		"\u04f5\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8\u04f9\3\2"+
		"\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04ff\5N(\2\u04fc\u04fe"+
		"\t\2\2\2\u04fd\u04fc\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04ff\3\2\2\2\u0502\u0503\7\6"+
		"\2\2\u0503G\3\2\2\2\u0504\u0508\7\'\2\2\u0505\u0507\t\2\2\2\u0506\u0505"+
		"\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\u050b\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050f\7\4\2\2\u050c\u050e\t\2"+
		"\2\2\u050d\u050c\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u0516\5N"+
		"(\2\u0513\u0515\t\2\2\2\u0514\u0513\3\2\2\2\u0515\u0518\3\2\2\2\u0516"+
		"\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u0516\3\2"+
		"\2\2\u0519\u051a\7\6\2\2\u051aI\3\2\2\2\u051b\u051f\7(\2\2\u051c\u051e"+
		"\t\2\2\2\u051d\u051c\3\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f"+
		"\u0520\3\2\2\2\u0520\u0522\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0526\7\4"+
		"\2\2\u0523\u0525\t\2\2\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052b\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0529\u052c\7/\2\2\u052a\u052c\5L\'\2\u052b\u0529\3\2\2\2\u052b\u052a"+
		"\3\2\2\2\u052c\u0530\3\2\2\2\u052d\u052f\t\2\2\2\u052e\u052d\3\2\2\2\u052f"+
		"\u0532\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2"+
		"\2\2\u0532\u0530\3\2\2\2\u0533\u0534\7\6\2\2\u0534K\3\2\2\2\u0535\u0539"+
		"\7\b\2\2\u0536\u0538\t\2\2\2\u0537\u0536\3\2\2\2\u0538\u053b\3\2\2\2\u0539"+
		"\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u0556\3\2\2\2\u053b\u0539\3\2"+
		"\2\2\u053c\u054d\5N(\2\u053d\u053f\t\2\2\2\u053e\u053d\3\2\2\2\u053f\u0542"+
		"\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542"+
		"\u0540\3\2\2\2\u0543\u0547\7\5\2\2\u0544\u0546\t\2\2\2\u0545\u0544\3\2"+
		"\2\2\u0546\u0549\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u054a\3\2\2\2\u0549\u0547\3\2\2\2\u054a\u054c\5N(\2\u054b\u0540\3\2\2"+
		"\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0553"+
		"\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0552\t\2\2\2\u0551\u0550\3\2\2\2\u0552"+
		"\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0557\3\2"+
		"\2\2\u0555\u0553\3\2\2\2\u0556\u053c\3\2\2\2\u0556\u0557\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u0559\7\t\2\2\u0559M\3\2\2\2\u055a\u055b\t\3\2\2"+
		"\u055bO\3\2\2\2\u00ceSZahotx}\177\u0081\u0088\u008c\u0090\u0092\u0094"+
		"\u0099\u009d\u00a5\u00ab\u00b2\u00b9\u00c0\u00c7\u00cc\u00cf\u00d5\u00dc"+
		"\u00e2\u00e9\u00f0\u00f7\u00fc\u0102\u0104\u0106\u010d\u0111\u0114\u0119"+
		"\u011b\u0122\u0128\u012e\u0134\u013a\u0140\u0146\u014d\u0154\u015b\u0160"+
		"\u0166\u0168\u016a\u0171\u0178\u017a\u0180\u0182\u0184\u018c\u0192\u0198"+
		"\u019e\u01a5\u01ac\u01b3\u01b8\u01be\u01c0\u01c2\u01c9\u01d0\u01d2\u01d8"+
		"\u01da\u01dc\u01e5\u01e9\u01f1\u01f7\u01fd\u0203\u020a\u0211\u0218\u021d"+
		"\u0223\u0225\u0227\u022e\u0235\u0237\u023d\u023f\u0241\u0247\u0250\u0256"+
		"\u025d\u0264\u026b\u0270\u0276\u0278\u027a\u0281\u0288\u028a\u0290\u0292"+
		"\u0294\u0299\u029f\u02a6\u02b2\u02b8\u02bf\u02da\u02f3\u02f9\u0300\u0309"+
		"\u0310\u031a\u0321\u032a\u0331\u0338\u033f\u0346\u034b\u034e\u0356\u035d"+
		"\u0364\u036d\u0374\u037b\u0384\u038b\u0392\u0399\u03a0\u03a9\u03b0\u03b7"+
		"\u03c0\u03c7\u03ce\u03d5\u03dc\u03e5\u03ec\u03f3\u03fa\u0401\u040a\u0411"+
		"\u0418\u041f\u0426\u042f\u0436\u043d\u0444\u044b\u0454\u045b\u0462\u046b"+
		"\u0472\u0479\u0482\u0489\u0490\u0497\u049c\u04a3\u04ac\u04b3\u04ba\u04c3"+
		"\u04ca\u04d1\u04da\u04e1\u04e8\u04f1\u04f8\u04ff\u0508\u050f\u0516\u051f"+
		"\u0526\u052b\u0530\u0539\u0540\u0547\u054d\u0553\u0556";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}