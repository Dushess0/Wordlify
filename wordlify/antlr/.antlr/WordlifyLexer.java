// Generated from /home/wojtek/Dokumenty/agh/sem6/kompilatory/Wordlify/wordlify/antlr/Wordlify.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FN=6, WHILE=7, FOREACH=8, IN=9, 
		DO=10, IF=11, THEN=12, ELSE=13, BEGIN=14, END=15, EXIST=16, PRINT=17, 
		RENAME=18, REMOVE=19, MOVE=20, COPY=21, DOWNLOAD=22, WRITE=23, WAIT=24, 
		EXECUTE=25, EXIT=26, TIME=27, GET_FILES=28, DATE_MODIFIED=29, FILE=30, 
		FOLDER=31, ARGS=32, SIZE=33, READ=34, CREATE=35, CMP_OP=36, ARITH_OP=37, 
		LOG_OP=38, BOOL=39, STR=40, ID=41, NUM=42, WS=43, NL=44, END_COMMENT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FN", "WHILE", "FOREACH", "IN", 
			"DO", "IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", 
			"REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", 
			"TIME", "GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", 
			"READ", "CREATE", "CMP_OP", "ARITH_OP", "LOG_OP", "BOOL", "STR", "ID", 
			"NUM", "WS", "NL", "END_COMMENT", "INT_PART", "OPT_CHARS", "LETTER", 
			"OTHER_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'fn'", "'while'", "'foreach'", 
			"'in'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'end'", "'exist'", 
			"'print'", "'rename'", "'remove'", "'move'", "'copy'", "'download'", 
			"'write'", "'wait'", "'execute'", "'exit'", "'time'", "'getFiles'", "'dateModified'", 
			"'file'", "'folder'", "'args'", "'size'", "'read'", "'create'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FN", "WHILE", "FOREACH", "IN", "DO", 
			"IF", "THEN", "ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", "REMOVE", 
			"MOVE", "COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", 
			"GET_FILES", "DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", "READ", 
			"CREATE", "CMP_OP", "ARITH_OP", "LOG_OP", "BOOL", "STR", "ID", "NUM", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u018e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u0129\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0135"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0140\n(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\7)\u014e\n)\f)\16)\u0151\13)\3)\3)\3*\3*\3*\7*\u0158\n*\f*"+
		"\16*\u015b\13*\3+\5+\u015e\n+\3+\3+\3+\6+\u0163\n+\r+\16+\u0164\5+\u0167"+
		"\n+\3,\3,\3-\3-\5-\u016d\n-\3-\5-\u0170\n-\3-\3-\3.\3.\3.\3/\3/\7/\u0179"+
		"\n/\f/\16/\u017c\13/\3/\5/\u017f\n/\3\60\3\60\3\60\3\60\7\60\u0185\n\60"+
		"\f\60\16\60\u0188\13\60\3\61\5\61\u018b\n\61\3\62\3\62\2\2\63\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2\3\2\n\4\2>>@@\5\2,-//\61\61\3\2"+
		"\62;\4\2\62;aa\4\2\13\13\"\"\3\2\63;\13\2C\\c|\u00d5\u00d5\u00f5\u00f5"+
		"\u0106\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\t\2\13\13"+
		"\"#%\61<B]]_b}\u0080\2\u01a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17"+
		"r\3\2\2\2\21x\3\2\2\2\23\u0080\3\2\2\2\25\u0083\3\2\2\2\27\u0086\3\2\2"+
		"\2\31\u0089\3\2\2\2\33\u008e\3\2\2\2\35\u0093\3\2\2\2\37\u0099\3\2\2\2"+
		"!\u009d\3\2\2\2#\u00a3\3\2\2\2%\u00a9\3\2\2\2\'\u00b0\3\2\2\2)\u00b7\3"+
		"\2\2\2+\u00bc\3\2\2\2-\u00c1\3\2\2\2/\u00ca\3\2\2\2\61\u00d0\3\2\2\2\63"+
		"\u00d5\3\2\2\2\65\u00dd\3\2\2\2\67\u00e2\3\2\2\29\u00e7\3\2\2\2;\u00f0"+
		"\3\2\2\2=\u00fd\3\2\2\2?\u0102\3\2\2\2A\u0109\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0118\3\2\2\2I\u0128\3\2\2\2K\u012a\3\2\2\2M\u0134\3\2"+
		"\2\2O\u013f\3\2\2\2Q\u0141\3\2\2\2S\u0154\3\2\2\2U\u015d\3\2\2\2W\u0168"+
		"\3\2\2\2Y\u016c\3\2\2\2[\u0173\3\2\2\2]\u017e\3\2\2\2_\u0186\3\2\2\2a"+
		"\u018a\3\2\2\2c\u018c\3\2\2\2ef\7=\2\2f\4\3\2\2\2gh\7*\2\2h\6\3\2\2\2"+
		"ij\7.\2\2j\b\3\2\2\2kl\7+\2\2l\n\3\2\2\2mn\7?\2\2n\f\3\2\2\2op\7h\2\2"+
		"pq\7p\2\2q\16\3\2\2\2rs\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\20"+
		"\3\2\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{|\7g\2\2|}\7c\2\2}~\7e\2\2~\177\7"+
		"j\2\2\177\22\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\24\3"+
		"\2\2\2\u0083\u0084\7f\2\2\u0084\u0085\7q\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088\30\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b"+
		"\7j\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2\u008d\32\3\2\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7g\2\2\u0095\u0096\7i\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\36\3\2\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7f\2\2\u009c \3\2\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7z\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\"\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k"+
		"\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8$\3\2\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7o\2\2\u00ae\u00af\7g\2\2\u00af&\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7x\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7q\2"+
		"\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7g\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7"+
		"e\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7{\2\2\u00c0,"+
		"\3\2\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7y\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7f\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7t\2"+
		"\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\60\3"+
		"\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7z\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7"+
		"z\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7v\2\2\u00e1\66\3\2\2\2\u00e2\u00e3"+
		"\7v\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7g\2\2\u00e6"+
		"8\3\2\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7H\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7u\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7c\2"+
		"\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7O\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7h\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7f\2\2\u00fc<\3\2\2\2\u00fd"+
		"\u00fe\7h\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2"+
		"\u0101>\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7q\2\2\u0104\u0105\7n\2"+
		"\2\u0105\u0106\7f\2\2\u0106\u0107\7g\2\2\u0107\u0108\7t\2\2\u0108@\3\2"+
		"\2\2\u0109\u010a\7c\2\2\u010a\u010b\7t\2\2\u010b\u010c\7i\2\2\u010c\u010d"+
		"\7u\2\2\u010dB\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7k\2\2\u0110\u0111"+
		"\7|\2\2\u0111\u0112\7g\2\2\u0112D\3\2\2\2\u0113\u0114\7t\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7c\2\2\u0116\u0117\7f\2\2\u0117F\3\2\2\2\u0118\u0119"+
		"\7e\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u011e\7g\2\2\u011eH\3\2\2\2\u011f\u0120\7#\2\2\u0120"+
		"\u0129\7?\2\2\u0121\u0129\t\2\2\2\u0122\u0123\7?\2\2\u0123\u0129\7?\2"+
		"\2\u0124\u0125\7>\2\2\u0125\u0129\7?\2\2\u0126\u0127\7@\2\2\u0127\u0129"+
		"\7?\2\2\u0128\u011f\3\2\2\2\u0128\u0121\3\2\2\2\u0128\u0122\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129J\3\2\2\2\u012a\u012b\t\3\2\2"+
		"\u012bL\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e\7p\2\2\u012e\u0135\7f\2"+
		"\2\u012f\u0130\7q\2\2\u0130\u0135\7t\2\2\u0131\u0132\7p\2\2\u0132\u0133"+
		"\7q\2\2\u0133\u0135\7v\2\2\u0134\u012c\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0135N\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138"+
		"\u0139\7w\2\2\u0139\u0140\7g\2\2\u013a\u013b\7h\2\2\u013b\u013c\7c\2\2"+
		"\u013c\u013d\7n\2\2\u013d\u013e\7u\2\2\u013e\u0140\7g\2\2\u013f\u0136"+
		"\3\2\2\2\u013f\u013a\3\2\2\2\u0140P\3\2\2\2\u0141\u014f\7$\2\2\u0142\u014e"+
		"\5a\61\2\u0143\u014e\t\4\2\2\u0144\u014e\5c\62\2\u0145\u0146\7^\2\2\u0146"+
		"\u014e\7$\2\2\u0147\u0148\7^\2\2\u0148\u014e\7^\2\2\u0149\u014a\7^\2\2"+
		"\u014a\u014e\7p\2\2\u014b\u014c\7^\2\2\u014c\u014e\7t\2\2\u014d\u0142"+
		"\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0144\3\2\2\2\u014d\u0145\3\2\2\2\u014d"+
		"\u0147\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0153\7$\2\2\u0153R\3\2\2\2\u0154\u0159\5a\61\2\u0155"+
		"\u0158\5a\61\2\u0156\u0158\t\5\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"T\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\7/\2\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0166\5]/\2\u0160\u0162\7\60"+
		"\2\2\u0161\u0163\t\4\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0160\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167V\3\2\2\2\u0168\u0169\t\6\2\2\u0169X\3\2"+
		"\2\2\u016a\u016b\7%\2\2\u016b\u016d\5_\60\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\7\17\2\2\u016f\u016e\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\f\2\2\u0172"+
		"Z\3\2\2\2\u0173\u0174\7%\2\2\u0174\u0175\5_\60\2\u0175\\\3\2\2\2\u0176"+
		"\u017a\t\7\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017f\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\7\62\2\2\u017e\u0176\3\2\2\2\u017e\u017d\3"+
		"\2\2\2\u017f^\3\2\2\2\u0180\u0185\5a\61\2\u0181\u0185\t\4\2\2\u0182\u0185"+
		"\5c\62\2\u0183\u0185\7$\2\2\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187`\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b"+
		"\t\b\2\2\u018a\u0189\3\2\2\2\u018bb\3\2\2\2\u018c\u018d\t\t\2\2\u018d"+
		"d\3\2\2\2\24\2\u0128\u0134\u013f\u014d\u014f\u0157\u0159\u015d\u0164\u0166"+
		"\u016c\u016f\u017a\u017e\u0184\u0186\u018a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}