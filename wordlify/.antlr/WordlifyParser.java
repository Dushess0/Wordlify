// Generated from /home/wojtek/Dokumenty/agh/sem6/kompilatory/Wordlify/wordlify/Wordlify.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STR=14, ID=15, NNEG_FLOAT=16, NNEG_INT=17, 
		OPT_WSS_WITH_NLS=18, WSS=19, NL=20;
	public static final int
		RULE_program = 0, RULE_instrs = 1, RULE_instrs_line = 2, RULE_instrs_line_without_last_instr = 3, 
		RULE_instr = 4, RULE_print = 5, RULE_rename = 6, RULE_remove = 7, RULE_move = 8, 
		RULE_copy = 9, RULE_download = 10, RULE_write = 11, RULE_wait_instr = 12, 
		RULE_execute = 13, RULE_exit = 14, RULE_nneg_num_or_id = 15, RULE_nneg_int_or_id = 16, 
		RULE_str_or_id = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instrs", "instrs_line", "instrs_line_without_last_instr", 
			"instr", "print", "rename", "remove", "move", "copy", "download", "write", 
			"wait_instr", "execute", "exit", "nneg_num_or_id", "nneg_int_or_id", 
			"str_or_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", "';'", "'print'", "'rename'", "'remove'", "'move'", 
			"'copy'", "'download'", "'write'", "'wait'", "'execute'", "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STR", "ID", "NNEG_FLOAT", "NNEG_INT", "OPT_WSS_WITH_NLS", 
			"WSS", "NL"
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
		public InstrsContext instrs() {
			return getRuleContext(InstrsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(WordlifyParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(WordlifyParser.NL, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NL))) != 0)) {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			instrs();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NL))) != 0)) {
				{
				{
				setState(43);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InstrsContext extends ParserRuleContext {
		public List<Instrs_lineContext> instrs_line() {
			return getRuleContexts(Instrs_lineContext.class);
		}
		public Instrs_lineContext instrs_line(int i) {
			return getRuleContext(Instrs_lineContext.class,i);
		}
		public List<TerminalNode> OPT_WSS_WITH_NLS() { return getTokens(WordlifyParser.OPT_WSS_WITH_NLS); }
		public TerminalNode OPT_WSS_WITH_NLS(int i) {
			return getToken(WordlifyParser.OPT_WSS_WITH_NLS, i);
		}
		public InstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrs; }
	}

	public final InstrsContext instrs() throws RecognitionException {
		InstrsContext _localctx = new InstrsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			instrs_line();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPT_WSS_WITH_NLS) {
				{
				{
				setState(50);
				match(OPT_WSS_WITH_NLS);
				setState(51);
				instrs_line();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Instrs_lineContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public Instrs_line_without_last_instrContext instrs_line_without_last_instr() {
			return getRuleContext(Instrs_line_without_last_instrContext.class,0);
		}
		public Instrs_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrs_line; }
	}

	public final Instrs_lineContext instrs_line() throws RecognitionException {
		Instrs_lineContext _localctx = new Instrs_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrs_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(57);
				instrs_line_without_last_instr();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1) {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(66);
			instr();
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__1) {
					{
					{
					setState(67);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__1) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__2);
				}
				break;
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

	public static class Instrs_line_without_last_instrContext extends ParserRuleContext {
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Instrs_line_without_last_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrs_line_without_last_instr; }
	}

	public final Instrs_line_without_last_instrContext instrs_line_without_last_instr() throws RecognitionException {
		Instrs_line_without_last_instrContext _localctx = new Instrs_line_without_last_instrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrs_line_without_last_instr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					instr();
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0 || _la==T__1) {
						{
						{
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(83);
					match(T__2);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0 || _la==T__1) {
						{
						{
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(95);
			instr();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
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
			setState(102);
			match(T__2);
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

	public static class InstrContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instr);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				print();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				rename();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				remove();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				move();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				copy();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				download();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				write();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				wait_instr();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				execute();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(113);
				exit();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WSS() { return getToken(WordlifyParser.WSS, 0); }
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			match(WSS);
			setState(118);
			str_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__4);
			setState(121);
			match(WSS);
			setState(122);
			str_or_id();
			setState(123);
			match(WSS);
			setState(124);
			str_or_id();
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
		public TerminalNode WSS() { return getToken(WordlifyParser.WSS, 0); }
		public Str_or_idContext str_or_id() {
			return getRuleContext(Str_or_idContext.class,0);
		}
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__5);
			setState(127);
			match(WSS);
			setState(128);
			str_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__6);
			setState(131);
			match(WSS);
			setState(132);
			str_or_id();
			setState(133);
			match(WSS);
			setState(134);
			str_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public CopyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy; }
	}

	public final CopyContext copy() throws RecognitionException {
		CopyContext _localctx = new CopyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_copy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__7);
			setState(137);
			match(WSS);
			setState(138);
			str_or_id();
			setState(139);
			match(WSS);
			setState(140);
			str_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public DownloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_download; }
	}

	public final DownloadContext download() throws RecognitionException {
		DownloadContext _localctx = new DownloadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_download);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			match(WSS);
			setState(144);
			str_or_id();
			setState(145);
			match(WSS);
			setState(146);
			str_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__9);
			setState(149);
			match(WSS);
			setState(150);
			str_or_id();
			setState(151);
			match(WSS);
			setState(152);
			str_or_id();
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
		public TerminalNode WSS() { return getToken(WordlifyParser.WSS, 0); }
		public Nneg_num_or_idContext nneg_num_or_id() {
			return getRuleContext(Nneg_num_or_idContext.class,0);
		}
		public Wait_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wait_instr; }
	}

	public final Wait_instrContext wait_instr() throws RecognitionException {
		Wait_instrContext _localctx = new Wait_instrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wait_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__10);
			setState(155);
			match(WSS);
			setState(156);
			nneg_num_or_id();
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
		public List<TerminalNode> WSS() { return getTokens(WordlifyParser.WSS); }
		public TerminalNode WSS(int i) {
			return getToken(WordlifyParser.WSS, i);
		}
		public List<Str_or_idContext> str_or_id() {
			return getRuleContexts(Str_or_idContext.class);
		}
		public Str_or_idContext str_or_id(int i) {
			return getRuleContext(Str_or_idContext.class,i);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__11);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(WSS);
				setState(160);
				str_or_id();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WSS );
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
		public TerminalNode WSS() { return getToken(WordlifyParser.WSS, 0); }
		public Nneg_int_or_idContext nneg_int_or_id() {
			return getRuleContext(Nneg_int_or_idContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__12);
			setState(166);
			match(WSS);
			setState(167);
			nneg_int_or_id();
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

	public static class Nneg_num_or_idContext extends ParserRuleContext {
		public TerminalNode NNEG_INT() { return getToken(WordlifyParser.NNEG_INT, 0); }
		public TerminalNode NNEG_FLOAT() { return getToken(WordlifyParser.NNEG_FLOAT, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public Nneg_num_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nneg_num_or_id; }
	}

	public final Nneg_num_or_idContext nneg_num_or_id() throws RecognitionException {
		Nneg_num_or_idContext _localctx = new Nneg_num_or_idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nneg_num_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NNEG_FLOAT) | (1L << NNEG_INT))) != 0)) ) {
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

	public static class Nneg_int_or_idContext extends ParserRuleContext {
		public TerminalNode NNEG_INT() { return getToken(WordlifyParser.NNEG_INT, 0); }
		public TerminalNode ID() { return getToken(WordlifyParser.ID, 0); }
		public Nneg_int_or_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nneg_int_or_id; }
	}

	public final Nneg_int_or_idContext nneg_int_or_id() throws RecognitionException {
		Nneg_int_or_idContext _localctx = new Nneg_int_or_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nneg_int_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NNEG_INT) ) {
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
		enterRule(_localctx, 34, RULE_str_or_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\5\4C\n\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\5\4M\n\4\3\5\3\5\7\5Q"+
		"\n\5\f\5\16\5T\13\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\7\5]\n\5\f\5\16\5"+
		"`\13\5\3\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\6\17\u00a4\n\17\r\17\16\17\u00a5\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\7\4\2\3\4\26\26\3\2\3\4\3\2\21\23\4\2\21\21\23\23\3\2\20\21"+
		"\2\u00b4\2)\3\2\2\2\4\63\3\2\2\2\6B\3\2\2\2\b^\3\2\2\2\nt\3\2\2\2\fv\3"+
		"\2\2\2\16z\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u008a\3\2\2\2"+
		"\26\u0090\3\2\2\2\30\u0096\3\2\2\2\32\u009c\3\2\2\2\34\u00a0\3\2\2\2\36"+
		"\u00a7\3\2\2\2 \u00ab\3\2\2\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&(\t\2\2\2"+
		"\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\60\5\4"+
		"\3\2-/\t\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3"+
		"\2\2\2\62\60\3\2\2\2\638\5\6\4\2\64\65\7\24\2\2\65\67\5\6\4\2\66\64\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;?\5\b\5"+
		"\2<>\t\3\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2B;\3\2\2\2BC\3\2\2\2CD\3\2\2\2DL\5\n\6\2EG\t\3\2\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KM\7\5\2\2LH\3\2\2\2LM\3\2\2"+
		"\2M\7\3\2\2\2NR\5\n\6\2OQ\t\3\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UY\7\5\2\2VX\t\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\N\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`^\3\2\2\2ae\5\n\6\2bd\t\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\5\2\2i\t\3\2\2\2ju\5\f\7\2ku"+
		"\5\16\b\2lu\5\20\t\2mu\5\22\n\2nu\5\24\13\2ou\5\26\f\2pu\5\30\r\2qu\5"+
		"\32\16\2ru\5\34\17\2su\5\36\20\2tj\3\2\2\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2"+
		"\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\13\3\2"+
		"\2\2vw\7\6\2\2wx\7\25\2\2xy\5$\23\2y\r\3\2\2\2z{\7\7\2\2{|\7\25\2\2|}"+
		"\5$\23\2}~\7\25\2\2~\177\5$\23\2\177\17\3\2\2\2\u0080\u0081\7\b\2\2\u0081"+
		"\u0082\7\25\2\2\u0082\u0083\5$\23\2\u0083\21\3\2\2\2\u0084\u0085\7\t\2"+
		"\2\u0085\u0086\7\25\2\2\u0086\u0087\5$\23\2\u0087\u0088\7\25\2\2\u0088"+
		"\u0089\5$\23\2\u0089\23\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7\25\2"+
		"\2\u008c\u008d\5$\23\2\u008d\u008e\7\25\2\2\u008e\u008f\5$\23\2\u008f"+
		"\25\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\25\2\2\u0092\u0093\5$\23"+
		"\2\u0093\u0094\7\25\2\2\u0094\u0095\5$\23\2\u0095\27\3\2\2\2\u0096\u0097"+
		"\7\f\2\2\u0097\u0098\7\25\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\25\2\2"+
		"\u009a\u009b\5$\23\2\u009b\31\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e"+
		"\7\25\2\2\u009e\u009f\5 \21\2\u009f\33\3\2\2\2\u00a0\u00a3\7\16\2\2\u00a1"+
		"\u00a2\7\25\2\2\u00a2\u00a4\5$\23\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\35\3\2\2\2\u00a7"+
		"\u00a8\7\17\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\5\"\22\2\u00aa\37\3\2"+
		"\2\2\u00ab\u00ac\t\4\2\2\u00ac!\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae#\3\2"+
		"\2\2\u00af\u00b0\t\6\2\2\u00b0%\3\2\2\2\17)\608?BHLRY^et\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}