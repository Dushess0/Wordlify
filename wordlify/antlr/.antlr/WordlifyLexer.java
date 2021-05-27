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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, FN=8, WHILE=9, 
		FOREACH=10, IN=11, DO=12, IF=13, THEN=14, ELSE=15, BEGIN=16, END=17, EXIST=18, 
		PRINT=19, RENAME=20, REMOVE=21, MOVE=22, COPY=23, DOWNLOAD=24, WRITE=25, 
		WAIT=26, EXECUTE=27, EXIT=28, TIME=29, GET_FILES=30, DATE_MODIFIED=31, 
		FILE=32, FOLDER=33, ARGS=34, SIZE=35, READ=36, CREATE=37, LENGTH=38, APPEND=39, 
		CMP_OP=40, ARITH_OP=41, CONCAT_OP=42, LOG_OP=43, BOOL=44, STR=45, ID=46, 
		NUM=47, WS=48, NL=49, END_COMMENT=50;
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
			"ARGS", "SIZE", "READ", "CREATE", "LENGTH", "APPEND", "CMP_OP", "ARITH_OP", 
			"CONCAT_OP", "LOG_OP", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT", 
			"INT_PART", "OPT_CHARS", "LETTER", "OTHER_CHAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0141\n)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u014f\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u015a\n-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\7.\u0168\n.\f.\16.\u016b\13.\3.\3.\3/\3/\3/\7/"+
		"\u0172\n/\f/\16/\u0175\13/\3\60\5\60\u0178\n\60\3\60\3\60\3\60\6\60\u017d"+
		"\n\60\r\60\16\60\u017e\5\60\u0181\n\60\3\61\3\61\3\62\3\62\5\62\u0187"+
		"\n\62\3\62\5\62\u018a\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\7\64\u0193"+
		"\n\64\f\64\16\64\u0196\13\64\3\64\5\64\u0199\n\64\3\65\3\65\3\65\3\65"+
		"\7\65\u019f\n\65\f\65\16\65\u01a2\13\65\3\66\5\66\u01a5\n\66\3\67\3\67"+
		"\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\2"+
		"\3\2\n\4\2>>@@\5\2,-//\61\61\3\2\62;\4\2\62;aa\4\2\13\13\"\"\3\2\63;\13"+
		"\2C\\c|\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146\u015c"+
		"\u015d\u017b\u017e\t\2\13\13\"#%\61<B]]_b}\u0080\2\u01be\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2"+
		"\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\u0080\3\2\2\2\25\u0086\3\2\2\2"+
		"\27\u008e\3\2\2\2\31\u0091\3\2\2\2\33\u0094\3\2\2\2\35\u0097\3\2\2\2\37"+
		"\u009c\3\2\2\2!\u00a1\3\2\2\2#\u00a7\3\2\2\2%\u00ab\3\2\2\2\'\u00b1\3"+
		"\2\2\2)\u00b7\3\2\2\2+\u00be\3\2\2\2-\u00c5\3\2\2\2/\u00ca\3\2\2\2\61"+
		"\u00cf\3\2\2\2\63\u00d8\3\2\2\2\65\u00de\3\2\2\2\67\u00e3\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00f0\3\2\2\2=\u00f5\3\2\2\2?\u00fe\3\2\2\2A\u010b\3\2\2\2C"+
		"\u0110\3\2\2\2E\u0117\3\2\2\2G\u011c\3\2\2\2I\u0121\3\2\2\2K\u0126\3\2"+
		"\2\2M\u012d\3\2\2\2O\u0134\3\2\2\2Q\u0140\3\2\2\2S\u0142\3\2\2\2U\u0144"+
		"\3\2\2\2W\u014e\3\2\2\2Y\u0159\3\2\2\2[\u015b\3\2\2\2]\u016e\3\2\2\2_"+
		"\u0177\3\2\2\2a\u0182\3\2\2\2c\u0186\3\2\2\2e\u018d\3\2\2\2g\u0198\3\2"+
		"\2\2i\u01a0\3\2\2\2k\u01a4\3\2\2\2m\u01a6\3\2\2\2op\7=\2\2p\4\3\2\2\2"+
		"qr\7*\2\2r\6\3\2\2\2st\7.\2\2t\b\3\2\2\2uv\7+\2\2v\n\3\2\2\2wx\7?\2\2"+
		"x\f\3\2\2\2yz\7]\2\2z\16\3\2\2\2{|\7_\2\2|\20\3\2\2\2}~\7h\2\2~\177\7"+
		"p\2\2\177\22\3\2\2\2\u0080\u0081\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\24\3\2\2\2\u0086\u0087"+
		"\7h\2\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7e\2\2\u008c\u008d\7j\2\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\30\3\2\2\2\u0091\u0092\7f\2\2\u0092"+
		"\u0093\7q\2\2\u0093\32\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096"+
		"\34\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7j\2\2\u0099\u009a\7g\2\2\u009a"+
		"\u009b\7p\2\2\u009b\36\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7d\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7i\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\"\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7f"+
		"\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7z\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd*\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7o\2"+
		"\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7g\2\2\u00c4,\3\2"+
		"\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd"+
		"\7r\2\2\u00cd\u00ce\7{\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7f\2\2\u00d7\62\3\2\2\2\u00d8"+
		"\u00d9\7y\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7v\2\2"+
		"\u00dc\u00dd\7g\2\2\u00dd\64\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7"+
		"c\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7v\2\2\u00e2\66\3\2\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7z\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7e\2\2\u00e7"+
		"\u00e8\7w\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea8\3\2\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7z\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7v\2\2"+
		"\u00ef:\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7o\2"+
		"\2\u00f3\u00f4\7g\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7"+
		"g\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7H\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb"+
		"\7n\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7u\2\2\u00fd>\3\2\2\2\u00fe\u00ff"+
		"\7f\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7O\2\2\u0103\u0104\7q\2\2\u0104\u0105\7f\2\2\u0105\u0106\7k\2\2"+
		"\u0106\u0107\7h\2\2\u0107\u0108\7k\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7f\2\2\u010a@\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7n\2\2\u010e\u010f\7g\2\2\u010fB\3\2\2\2\u0110\u0111\7h\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\7n\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7t\2\2\u0116D\3\2\2\2\u0117\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119"+
		"\u011a\7i\2\2\u011a\u011b\7u\2\2\u011bF\3\2\2\2\u011c\u011d\7u\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7|\2\2\u011f\u0120\7g\2\2\u0120H\3\2\2\2\u0121"+
		"\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124\u0125\7f\2\2"+
		"\u0125J\3\2\2\2\u0126\u0127\7e\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2"+
		"\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2\u012b\u012c\7g\2\2\u012cL\3\2"+
		"\2\2\u012d\u012e\7n\2\2\u012e\u012f\7g\2\2\u012f\u0130\7p\2\2\u0130\u0131"+
		"\7i\2\2\u0131\u0132\7v\2\2\u0132\u0133\7j\2\2\u0133N\3\2\2\2\u0134\u0135"+
		"\7>\2\2\u0135\u0136\7/\2\2\u0136P\3\2\2\2\u0137\u0138\7#\2\2\u0138\u0141"+
		"\7?\2\2\u0139\u0141\t\2\2\2\u013a\u013b\7?\2\2\u013b\u0141\7?\2\2\u013c"+
		"\u013d\7>\2\2\u013d\u0141\7?\2\2\u013e\u013f\7@\2\2\u013f\u0141\7?\2\2"+
		"\u0140\u0137\3\2\2\2\u0140\u0139\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013c"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141R\3\2\2\2\u0142\u0143\t\3\2\2\u0143"+
		"T\3\2\2\2\u0144\u0145\7\60\2\2\u0145V\3\2\2\2\u0146\u0147\7c\2\2\u0147"+
		"\u0148\7p\2\2\u0148\u014f\7f\2\2\u0149\u014a\7q\2\2\u014a\u014f\7t\2\2"+
		"\u014b\u014c\7p\2\2\u014c\u014d\7q\2\2\u014d\u014f\7v\2\2\u014e\u0146"+
		"\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014b\3\2\2\2\u014fX\3\2\2\2\u0150"+
		"\u0151\7v\2\2\u0151\u0152\7t\2\2\u0152\u0153\7w\2\2\u0153\u015a\7g\2\2"+
		"\u0154\u0155\7h\2\2\u0155\u0156\7c\2\2\u0156\u0157\7n\2\2\u0157\u0158"+
		"\7u\2\2\u0158\u015a\7g\2\2\u0159\u0150\3\2\2\2\u0159\u0154\3\2\2\2\u015a"+
		"Z\3\2\2\2\u015b\u0169\7$\2\2\u015c\u0168\5k\66\2\u015d\u0168\t\4\2\2\u015e"+
		"\u0168\5m\67\2\u015f\u0160\7^\2\2\u0160\u0168\7$\2\2\u0161\u0162\7^\2"+
		"\2\u0162\u0168\7^\2\2\u0163\u0164\7^\2\2\u0164\u0168\7p\2\2\u0165\u0166"+
		"\7^\2\2\u0166\u0168\7t\2\2\u0167\u015c\3\2\2\2\u0167\u015d\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0163\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7$"+
		"\2\2\u016d\\\3\2\2\2\u016e\u0173\5k\66\2\u016f\u0172\5k\66\2\u0170\u0172"+
		"\t\5\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174^\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0176\u0178\7/\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u0180\5g\64\2\u017a\u017c\7\60\2\2\u017b\u017d\t\4\2\2"+
		"\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"`\3\2\2\2\u0182\u0183\t\6\2\2\u0183b\3\2\2\2\u0184\u0185\7%\2\2\u0185"+
		"\u0187\5i\65\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u018a\7\17\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\f\2\2\u018cd\3\2\2\2\u018d\u018e\7%\2\2\u018e"+
		"\u018f\5i\65\2\u018ff\3\2\2\2\u0190\u0194\t\7\2\2\u0191\u0193\t\4\2\2"+
		"\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0199\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7\62\2\2"+
		"\u0198\u0190\3\2\2\2\u0198\u0197\3\2\2\2\u0199h\3\2\2\2\u019a\u019f\5"+
		"k\66\2\u019b\u019f\t\4\2\2\u019c\u019f\5m\67\2\u019d\u019f\7$\2\2\u019e"+
		"\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2"+
		"\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"j\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\t\b\2\2\u01a4\u01a3\3\2\2\2"+
		"\u01a5l\3\2\2\2\u01a6\u01a7\t\t\2\2\u01a7n\3\2\2\2\24\2\u0140\u014e\u0159"+
		"\u0167\u0169\u0171\u0173\u0177\u017e\u0180\u0186\u0189\u0194\u0198\u019e"+
		"\u01a0\u01a4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}