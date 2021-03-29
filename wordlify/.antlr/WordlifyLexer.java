// Generated from /home/wojtek/Dokumenty/agh/sem6/kompilatory/Wordlify/wordlify/Wordlify2.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, STR=13, ID=14, NNEG_FLOAT=15, NNEG_INT=16, 
		OPT_WSS_WITH_NLS=17, WSS=18, NL=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "STR", "ID", "NNEG_FLOAT", "NNEG_INT", "OPT_WSS_WITH_NLS", 
			"WSS", "NL", "OPT_WSS", "INT_PART", "CHARS", "OTHER_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", "';'", "'rename'", "'remove'", "'move'", "'copy'", 
			"'download'", "'write'", "'wait'", "'execute'", "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STR", "ID", "NNEG_FLOAT", "NNEG_INT", "OPT_WSS_WITH_NLS", "WSS", 
			"NL"
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
	public String getGrammarFileName() { return "Wordlify2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3\16\3"+
		"\16\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\20\3\20\3\20\6"+
		"\20\u008d\n\20\r\20\16\20\u008e\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0097"+
		"\n\22\r\22\16\22\u0098\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\24\3\24"+
		"\5\24\u00a2\n\24\3\24\3\24\3\25\7\25\u00a7\n\25\f\25\16\25\u00aa\13\25"+
		"\3\26\3\26\7\26\u00ae\n\26\f\26\16\26\u00b1\13\26\3\26\5\26\u00b4\n\26"+
		"\3\27\3\27\7\27\u00b8\n\27\f\27\16\27\u00bb\13\27\3\30\3\30\2\2\31\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\2+\2-\2/\2\3\2\t\5\2\62;C\\c|\4\2C\\c|\6\2\62;C\\a"+
		"ac|\3\2\62;\4\2\13\13\"\"\3\2\63;\t\2\13\13\"#%\61<B]]_b}\u0080\2\u00c9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67"+
		"\3\2\2\2\13>\3\2\2\2\rE\3\2\2\2\17J\3\2\2\2\21O\3\2\2\2\23X\3\2\2\2\25"+
		"^\3\2\2\2\27c\3\2\2\2\31k\3\2\2\2\33p\3\2\2\2\35\u0082\3\2\2\2\37\u0089"+
		"\3\2\2\2!\u0090\3\2\2\2#\u0096\3\2\2\2%\u009b\3\2\2\2\'\u00a1\3\2\2\2"+
		")\u00a8\3\2\2\2+\u00b3\3\2\2\2-\u00b9\3\2\2\2/\u00bc\3\2\2\2\61\62\7\""+
		"\2\2\62\4\3\2\2\2\63\64\7\13\2\2\64\6\3\2\2\2\65\66\7=\2\2\66\b\3\2\2"+
		"\2\678\7t\2\289\7g\2\29:\7p\2\2:;\7c\2\2;<\7o\2\2<=\7g\2\2=\n\3\2\2\2"+
		">?\7t\2\2?@\7g\2\2@A\7o\2\2AB\7q\2\2BC\7x\2\2CD\7g\2\2D\f\3\2\2\2EF\7"+
		"o\2\2FG\7q\2\2GH\7x\2\2HI\7g\2\2I\16\3\2\2\2JK\7e\2\2KL\7q\2\2LM\7r\2"+
		"\2MN\7{\2\2N\20\3\2\2\2OP\7f\2\2PQ\7q\2\2QR\7y\2\2RS\7p\2\2ST\7n\2\2T"+
		"U\7q\2\2UV\7c\2\2VW\7f\2\2W\22\3\2\2\2XY\7y\2\2YZ\7t\2\2Z[\7k\2\2[\\\7"+
		"v\2\2\\]\7g\2\2]\24\3\2\2\2^_\7y\2\2_`\7c\2\2`a\7k\2\2ab\7v\2\2b\26\3"+
		"\2\2\2cd\7g\2\2de\7z\2\2ef\7g\2\2fg\7e\2\2gh\7w\2\2hi\7v\2\2ij\7g\2\2"+
		"j\30\3\2\2\2kl\7g\2\2lm\7z\2\2mn\7k\2\2no\7v\2\2o\32\3\2\2\2p}\7$\2\2"+
		"q|\t\2\2\2r|\5/\30\2st\7^\2\2t|\7$\2\2uv\7^\2\2v|\7^\2\2wx\7^\2\2x|\7"+
		"p\2\2yz\7^\2\2z|\7t\2\2{q\3\2\2\2{r\3\2\2\2{s\3\2\2\2{u\3\2\2\2{w\3\2"+
		"\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3"+
		"\2\2\2\u0080\u0081\7$\2\2\u0081\34\3\2\2\2\u0082\u0086\t\3\2\2\u0083\u0085"+
		"\t\4\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\36\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5+\26"+
		"\2\u008a\u008c\7\60\2\2\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f \3\2\2\2"+
		"\u0090\u0091\5+\26\2\u0091\"\3\2\2\2\u0092\u0093\5)\25\2\u0093\u0094\5"+
		"\'\24\2\u0094\u0095\5)\25\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099$\3\2\2\2"+
		"\u009a\u009c\t\6\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e&\3\2\2\2\u009f\u00a0\7%\2\2\u00a0\u00a2"+
		"\5-\27\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\7\f\2\2\u00a4(\3\2\2\2\u00a5\u00a7\t\6\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9*\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\t\7\2\2\u00ac\u00ae\t\5\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7\62\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4,\3\2\2\2\u00b5\u00b8\t\2\2\2"+
		"\u00b6\u00b8\5/\30\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba.\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\t\b\2\2\u00bd\60\3\2\2\2\20\2{}\u0084\u0086"+
		"\u008e\u0098\u009d\u00a1\u00a8\u00af\u00b3\u00b7\u00b9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}