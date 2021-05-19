// Generated from Wordlify.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FN", "WHILE", 
			"FOREACH", "IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", 
			"PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", 
			"EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", 
			"ARGS", "SIZE", "READ", "CREATE", "CMP_OP", "ARITH_OP", "LOG_OP", "BOOL", 
			"STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "INT_PART", "OPT_CHARS", 
			"LETTER", "OTHER_CHAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0196\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0131\n\'\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u013d\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0148\n*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u0156\n+\f+\16+\u0159\13+\3+\3+\3,"+
		"\3,\3,\7,\u0160\n,\f,\16,\u0163\13,\3-\5-\u0166\n-\3-\3-\3-\6-\u016b\n"+
		"-\r-\16-\u016c\5-\u016f\n-\3.\3.\3/\3/\5/\u0175\n/\3/\5/\u0178\n/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\7\61\u0181\n\61\f\61\16\61\u0184\13\61\3\61"+
		"\5\61\u0187\n\61\3\62\3\62\3\62\3\62\7\62\u018d\n\62\f\62\16\62\u0190"+
		"\13\62\3\63\5\63\u0193\n\63\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\2c\2e\2g\2\3\2\n\4\2>>@@\5\2,-//\61\61\3\2\62;\4\2"+
		"\62;aa\4\2\13\13\"\"\3\2\63;\13\2C\\c|\u00d5\u00d5\u00f5\u00f5\u0106\u0109"+
		"\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\t\2\13\13\"#%\61<B]]"+
		"_b}\u0080\2\u01ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13q\3\2\2\2\r"+
		"s\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23z\3\2\2\2\25\u0080\3\2\2\2\27\u0088"+
		"\3\2\2\2\31\u008b\3\2\2\2\33\u008e\3\2\2\2\35\u0091\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u009b\3\2\2\2#\u00a1\3\2\2\2%\u00a5\3\2\2\2\'\u00ab\3\2\2\2)\u00b1"+
		"\3\2\2\2+\u00b8\3\2\2\2-\u00bf\3\2\2\2/\u00c4\3\2\2\2\61\u00c9\3\2\2\2"+
		"\63\u00d2\3\2\2\2\65\u00d8\3\2\2\2\67\u00dd\3\2\2\29\u00e5\3\2\2\2;\u00ea"+
		"\3\2\2\2=\u00ef\3\2\2\2?\u00f8\3\2\2\2A\u0105\3\2\2\2C\u010a\3\2\2\2E"+
		"\u0111\3\2\2\2G\u0116\3\2\2\2I\u011b\3\2\2\2K\u0120\3\2\2\2M\u0130\3\2"+
		"\2\2O\u0132\3\2\2\2Q\u013c\3\2\2\2S\u0147\3\2\2\2U\u0149\3\2\2\2W\u015c"+
		"\3\2\2\2Y\u0165\3\2\2\2[\u0170\3\2\2\2]\u0174\3\2\2\2_\u017b\3\2\2\2a"+
		"\u0186\3\2\2\2c\u018e\3\2\2\2e\u0192\3\2\2\2g\u0194\3\2\2\2ij\7=\2\2j"+
		"\4\3\2\2\2kl\7*\2\2l\6\3\2\2\2mn\7.\2\2n\b\3\2\2\2op\7+\2\2p\n\3\2\2\2"+
		"qr\7?\2\2r\f\3\2\2\2st\7]\2\2t\16\3\2\2\2uv\7_\2\2v\20\3\2\2\2wx\7h\2"+
		"\2xy\7p\2\2y\22\3\2\2\2z{\7y\2\2{|\7j\2\2|}\7k\2\2}~\7n\2\2~\177\7g\2"+
		"\2\177\24\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7q\2\2\u0082\u0083\7"+
		"t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7e\2\2\u0086\u0087"+
		"\7j\2\2\u0087\26\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\30"+
		"\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7q\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7h\2\2\u0090\34\3\2\2\2\u0091\u0092\7v\2\2\u0092"+
		"\u0093\7j\2\2\u0093\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\36\3\2\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2"+
		"\u009a \3\2\2\2\u009b\u009c\7d\2\2\u009c\u009d\7g\2\2\u009d\u009e\7i\2"+
		"\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7"+
		"g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4$\3\2\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7z\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7u\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad"+
		"\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0(\3\2\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00b6\7o\2\2\u00b6\u00b7\7g\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7t\2"+
		"\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd"+
		"\7x\2\2\u00bd\u00be\7g\2\2\u00be,\3\2\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7x\2\2\u00c2\u00c3\7g\2\2\u00c3.\3\2\2\2\u00c4\u00c5"+
		"\7e\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7{\2\2\u00c8"+
		"\60\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7y\2\2\u00cc"+
		"\u00cd\7p\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7c\2\2"+
		"\u00d0\u00d1\7f\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7"+
		"t\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\64"+
		"\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7v\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7z\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e48\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7z\2"+
		"\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7v\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7"+
		"v\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7g\2\2\u00ee<"+
		"\3\2\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7H\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6\u00f7\7u\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7c\2"+
		"\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7O\2\2\u00fd\u00fe"+
		"\7q\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7g\2\2\u0103\u0104\7f\2\2\u0104@\3\2\2\2\u0105"+
		"\u0106\7h\2\2\u0106\u0107\7k\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2"+
		"\u0109B\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c\7q\2\2\u010c\u010d\7n\2"+
		"\2\u010d\u010e\7f\2\2\u010e\u010f\7g\2\2\u010f\u0110\7t\2\2\u0110D\3\2"+
		"\2\2\u0111\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113\u0114\7i\2\2\u0114\u0115"+
		"\7u\2\2\u0115F\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7k\2\2\u0118\u0119"+
		"\7|\2\2\u0119\u011a\7g\2\2\u011aH\3\2\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\7g\2\2\u011d\u011e\7c\2\2\u011e\u011f\7f\2\2\u011fJ\3\2\2\2\u0120\u0121"+
		"\7e\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124"+
		"\u0125\7v\2\2\u0125\u0126\7g\2\2\u0126L\3\2\2\2\u0127\u0128\7#\2\2\u0128"+
		"\u0131\7?\2\2\u0129\u0131\t\2\2\2\u012a\u012b\7?\2\2\u012b\u0131\7?\2"+
		"\2\u012c\u012d\7>\2\2\u012d\u0131\7?\2\2\u012e\u012f\7@\2\2\u012f\u0131"+
		"\7?\2\2\u0130\u0127\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131N\3\2\2\2\u0132\u0133\t\3\2\2"+
		"\u0133P\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7p\2\2\u0136\u013d\7f\2"+
		"\2\u0137\u0138\7q\2\2\u0138\u013d\7t\2\2\u0139\u013a\7p\2\2\u013a\u013b"+
		"\7q\2\2\u013b\u013d\7v\2\2\u013c\u0134\3\2\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013dR\3\2\2\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140"+
		"\u0141\7w\2\2\u0141\u0148\7g\2\2\u0142\u0143\7h\2\2\u0143\u0144\7c\2\2"+
		"\u0144\u0145\7n\2\2\u0145\u0146\7u\2\2\u0146\u0148\7g\2\2\u0147\u013e"+
		"\3\2\2\2\u0147\u0142\3\2\2\2\u0148T\3\2\2\2\u0149\u0157\7$\2\2\u014a\u0156"+
		"\5e\63\2\u014b\u0156\t\4\2\2\u014c\u0156\5g\64\2\u014d\u014e\7^\2\2\u014e"+
		"\u0156\7$\2\2\u014f\u0150\7^\2\2\u0150\u0156\7^\2\2\u0151\u0152\7^\2\2"+
		"\u0152\u0156\7p\2\2\u0153\u0154\7^\2\2\u0154\u0156\7t\2\2\u0155\u014a"+
		"\3\2\2\2\u0155\u014b\3\2\2\2\u0155\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155"+
		"\u014f\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\7$\2\2\u015bV\3\2\2\2\u015c\u0161\5e\63\2\u015d"+
		"\u0160\5e\63\2\u015e\u0160\t\5\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2"+
		"\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"X\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7/\2\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016e\5a\61\2\u0168\u016a\7\60"+
		"\2\2\u0169\u016b\t\4\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0168\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016fZ\3\2\2\2\u0170\u0171\t\6\2\2\u0171\\\3"+
		"\2\2\2\u0172\u0173\7%\2\2\u0173\u0175\5c\62\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\7\17\2\2\u0177\u0176\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\f\2\2\u017a"+
		"^\3\2\2\2\u017b\u017c\7%\2\2\u017c\u017d\5c\62\2\u017d`\3\2\2\2\u017e"+
		"\u0182\t\7\2\2\u017f\u0181\t\4\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0187\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0187\7\62\2\2\u0186\u017e\3\2\2\2\u0186\u0185\3"+
		"\2\2\2\u0187b\3\2\2\2\u0188\u018d\5e\63\2\u0189\u018d\t\4\2\2\u018a\u018d"+
		"\5g\64\2\u018b\u018d\7$\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018fd\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0193"+
		"\t\b\2\2\u0192\u0191\3\2\2\2\u0193f\3\2\2\2\u0194\u0195\t\t\2\2\u0195"+
		"h\3\2\2\2\24\2\u0130\u013c\u0147\u0155\u0157\u015f\u0161\u0165\u016c\u016e"+
		"\u0174\u0177\u0182\u0186\u018c\u018e\u0192\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}