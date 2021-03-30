// Generated from /home/wojtek/Dokumenty/agh/sem6/kompilatory/Wordlify/wordlify/Wordlify.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WordlifyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STR=14, ID=15, NNEG_FLOAT=16, NNEG_INT=17, 
		OPT_WSS_WITH_NLS=18, WSS=19, NL=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "STR", "ID", "NNEG_FLOAT", "NNEG_INT", 
			"OPT_WSS_WITH_NLS", "WSS", "NL", "OPT_WSS", "INT_PART", "OPT_CHARS", 
			"OTHER_CHAR"
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


	public WordlifyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wordlify.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u0084\n\17\f\17\16\17\u0087\13\17\3\17\3\17\3\20\3\20\7\20\u008d\n"+
		"\20\f\20\16\20\u0090\13\20\3\21\3\21\3\21\6\21\u0095\n\21\r\21\16\21\u0096"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\6\23\u009f\n\23\r\23\16\23\u00a0\3\24\6"+
		"\24\u00a4\n\24\r\24\16\24\u00a5\3\25\3\25\5\25\u00aa\n\25\3\25\3\25\3"+
		"\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\27\3\27\7\27\u00b6\n\27\f"+
		"\27\16\27\u00b9\13\27\3\27\5\27\u00bc\n\27\3\30\3\30\7\30\u00c0\n\30\f"+
		"\30\16\30\u00c3\13\30\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2"+
		"/\2\61\2\3\2\t\5\2\62;C\\c|\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\4\2\13\13"+
		"\"\"\3\2\63;\t\2\13\13\"#%\61<B]]_b}\u0080\2\u00d1\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13"+
		"?\3\2\2\2\rF\3\2\2\2\17M\3\2\2\2\21R\3\2\2\2\23W\3\2\2\2\25`\3\2\2\2\27"+
		"f\3\2\2\2\31k\3\2\2\2\33s\3\2\2\2\35x\3\2\2\2\37\u008a\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0098\3\2\2\2%\u009e\3\2\2\2\'\u00a3\3\2\2\2)\u00a9\3\2\2\2"+
		"+\u00b0\3\2\2\2-\u00bb\3\2\2\2/\u00c1\3\2\2\2\61\u00c4\3\2\2\2\63\64\7"+
		"\"\2\2\64\4\3\2\2\2\65\66\7\13\2\2\66\6\3\2\2\2\678\7=\2\28\b\3\2\2\2"+
		"9:\7r\2\2:;\7t\2\2;<\7k\2\2<=\7p\2\2=>\7v\2\2>\n\3\2\2\2?@\7t\2\2@A\7"+
		"g\2\2AB\7p\2\2BC\7c\2\2CD\7o\2\2DE\7g\2\2E\f\3\2\2\2FG\7t\2\2GH\7g\2\2"+
		"HI\7o\2\2IJ\7q\2\2JK\7x\2\2KL\7g\2\2L\16\3\2\2\2MN\7o\2\2NO\7q\2\2OP\7"+
		"x\2\2PQ\7g\2\2Q\20\3\2\2\2RS\7e\2\2ST\7q\2\2TU\7r\2\2UV\7{\2\2V\22\3\2"+
		"\2\2WX\7f\2\2XY\7q\2\2YZ\7y\2\2Z[\7p\2\2[\\\7n\2\2\\]\7q\2\2]^\7c\2\2"+
		"^_\7f\2\2_\24\3\2\2\2`a\7y\2\2ab\7t\2\2bc\7k\2\2cd\7v\2\2de\7g\2\2e\26"+
		"\3\2\2\2fg\7y\2\2gh\7c\2\2hi\7k\2\2ij\7v\2\2j\30\3\2\2\2kl\7g\2\2lm\7"+
		"z\2\2mn\7g\2\2no\7e\2\2op\7w\2\2pq\7v\2\2qr\7g\2\2r\32\3\2\2\2st\7g\2"+
		"\2tu\7z\2\2uv\7k\2\2vw\7v\2\2w\34\3\2\2\2x\u0085\7$\2\2y\u0084\t\2\2\2"+
		"z\u0084\5\61\31\2{|\7^\2\2|\u0084\7$\2\2}~\7^\2\2~\u0084\7^\2\2\177\u0080"+
		"\7^\2\2\u0080\u0084\7p\2\2\u0081\u0082\7^\2\2\u0082\u0084\7t\2\2\u0083"+
		"y\3\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7$\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008e\t\3\2\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f "+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5-\27\2\u0092\u0094\7\60\2\2"+
		"\u0093\u0095\t\5\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\"\3\2\2\2\u0098\u0099\5-\27\2\u0099"+
		"$\3\2\2\2\u009a\u009b\5+\26\2\u009b\u009c\5)\25\2\u009c\u009d\5+\26\2"+
		"\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1&\3\2\2\2\u00a2\u00a4\t\6\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8\u00aa\5/\30\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"*\3\2\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1,\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b3\u00b7\t\7\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bc\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\7\62\2\2\u00bb\u00b3\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc.\3\2\2\2\u00bd\u00c0\t\2\2\2\u00be\u00c0\5\61\31"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\60\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\t\b\2\2\u00c5\62\3\2\2\2\20\2\u0083\u0085\u008c\u008e\u0096\u00a0"+
		"\u00a5\u00a9\u00b0\u00b7\u00bb\u00bf\u00c1\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}