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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FN=6, WHILE=7, DO=8, IF=9, THEN=10, 
		ELSE=11, BEGIN=12, END=13, EXIST=14, PRINT=15, RENAME=16, REMOVE=17, MOVE=18, 
		COPY=19, DOWNLOAD=20, WRITE=21, WAIT=22, EXECUTE=23, EXIT=24, TIME=25, 
		GET_FILES=26, DATE_MODIFIED=27, FILE=28, FOLDER=29, ARGS=30, SIZE=31, 
		READ=32, CMP_OP=33, ARITH_OP=34, LOG_OP=35, BOOL=36, STR=37, ID=38, NUM=39, 
		WS=40, NL=41, END_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FN", "WHILE", "DO", "IF", "THEN", 
			"ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", 
			"COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", 
			"DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", "READ", "CMP_OP", 
			"ARITH_OP", "LOG_OP", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT", 
			"INT_PART", "OPT_CHARS", "LETTER", "OTHER_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'fn'", "'while'", "'do'", "'if'", 
			"'then'", "'else'", "'begin'", "'end'", "'exist'", "'print'", "'rename'", 
			"'remove'", "'move'", "'copy'", "'download'", "'write'", "'wait'", "'execute'", 
			"'exit'", "'time'", "'getFiles'", "'dateModified'", "'file'", "'folder'", 
			"'args'", "'size'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FN", "WHILE", "DO", "IF", "THEN", 
			"ELSE", "BEGIN", "END", "EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", 
			"COPY", "DOWNLOAD", "WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", 
			"DATE_MODIFIED", "FILE", "FOLDER", "ARGS", "SIZE", "READ", "CMP_OP", 
			"ARITH_OP", "LOG_OP", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0111\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u011d\n$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\5%\u0128\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&"+
		"\u0136\n&\f&\16&\u0139\13&\3&\3&\3\'\3\'\3\'\7\'\u0140\n\'\f\'\16\'\u0143"+
		"\13\'\3(\5(\u0146\n(\3(\3(\3(\6(\u014b\n(\r(\16(\u014c\5(\u014f\n(\3)"+
		"\3)\3*\3*\5*\u0155\n*\3*\5*\u0158\n*\3*\3*\3+\3+\3+\3,\3,\7,\u0161\n,"+
		"\f,\16,\u0164\13,\3,\5,\u0167\n,\3-\3-\3-\3-\7-\u016d\n-\f-\16-\u0170"+
		"\13-\3.\5.\u0173\n.\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[\2"+
		"]\2\3\2\n\4\2>>@@\5\2,-//\61\61\3\2\62;\4\2\62;aa\4\2\13\13\"\"\3\2\63"+
		";\13\2C\\c|\u00d5\u00d5\u00f5\u00f5\u0106\u0109\u011a\u011b\u0143\u0146"+
		"\u015c\u015d\u017b\u017e\t\2\13\13\"#%\61<B]]_b}\u0080\2\u018c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2"+
		"\17l\3\2\2\2\21r\3\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27}\3\2\2\2\31\u0082"+
		"\3\2\2\2\33\u0088\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2!\u0098\3\2"+
		"\2\2#\u009f\3\2\2\2%\u00a6\3\2\2\2\'\u00ab\3\2\2\2)\u00b0\3\2\2\2+\u00b9"+
		"\3\2\2\2-\u00bf\3\2\2\2/\u00c4\3\2\2\2\61\u00cc\3\2\2\2\63\u00d1\3\2\2"+
		"\2\65\u00d6\3\2\2\2\67\u00df\3\2\2\29\u00ec\3\2\2\2;\u00f1\3\2\2\2=\u00f8"+
		"\3\2\2\2?\u00fd\3\2\2\2A\u0102\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G"+
		"\u011c\3\2\2\2I\u0127\3\2\2\2K\u0129\3\2\2\2M\u013c\3\2\2\2O\u0145\3\2"+
		"\2\2Q\u0150\3\2\2\2S\u0154\3\2\2\2U\u015b\3\2\2\2W\u0166\3\2\2\2Y\u016e"+
		"\3\2\2\2[\u0172\3\2\2\2]\u0174\3\2\2\2_`\7=\2\2`\4\3\2\2\2ab\7*\2\2b\6"+
		"\3\2\2\2cd\7.\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7?\2\2h\f\3\2\2\2i"+
		"j\7h\2\2jk\7p\2\2k\16\3\2\2\2lm\7y\2\2mn\7j\2\2no\7k\2\2op\7n\2\2pq\7"+
		"g\2\2q\20\3\2\2\2rs\7f\2\2st\7q\2\2t\22\3\2\2\2uv\7k\2\2vw\7h\2\2w\24"+
		"\3\2\2\2xy\7v\2\2yz\7j\2\2z{\7g\2\2{|\7p\2\2|\26\3\2\2\2}~\7g\2\2~\177"+
		"\7n\2\2\177\u0080\7u\2\2\u0080\u0081\7g\2\2\u0081\30\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7g\2\2\u0084\u0085\7i\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\32\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7f\2\2\u008b\34\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7z\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7r\2\2\u0093\u0094\7t\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2"+
		"\u0096\u0097\7v\2\2\u0097 \3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2"+
		"\2\u009a\u009b\7p\2\2\u009b\u009c\7c\2\2\u009c\u009d\7o\2\2\u009d\u009e"+
		"\7g\2\2\u009e\"\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2"+
		"\7o\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7x\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7r\2\2\u00ae\u00af\7{\2\2\u00af(\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\u00b6\7q\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7f\2\2\u00b8*\3\2\2"+
		"\2\u00b9\u00ba\7y\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\u00be\7g\2\2\u00be,\3\2\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3.\3\2\2\2\u00c4\u00c5"+
		"\7g\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7e\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\60\3\2\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7z\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0\62\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7"+
		"o\2\2\u00d4\u00d5\7g\2\2\u00d5\64\3\2\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7H\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7u\2\2\u00de\66\3\2\2\2\u00df"+
		"\u00e0\7f\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\u00e4\7O\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7f\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2"+
		"\u00f3\7q\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6\u00f7\7t\2\2\u00f7<\3\2\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7t\2"+
		"\2\u00fa\u00fb\7i\2\2\u00fb\u00fc\7u\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7"+
		"u\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7|\2\2\u0100\u0101\7g\2\2\u0101@"+
		"\3\2\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7f\2\2\u0106B\3\2\2\2\u0107\u0108\7#\2\2\u0108\u0111\7?\2\2\u0109"+
		"\u0111\t\2\2\2\u010a\u010b\7?\2\2\u010b\u0111\7?\2\2\u010c\u010d\7>\2"+
		"\2\u010d\u0111\7?\2\2\u010e\u010f\7@\2\2\u010f\u0111\7?\2\2\u0110\u0107"+
		"\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010c\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111D\3\2\2\2\u0112\u0113\t\3\2\2\u0113F\3\2\2\2\u0114"+
		"\u0115\7c\2\2\u0115\u0116\7p\2\2\u0116\u011d\7f\2\2\u0117\u0118\7q\2\2"+
		"\u0118\u011d\7t\2\2\u0119\u011a\7p\2\2\u011a\u011b\7q\2\2\u011b\u011d"+
		"\7v\2\2\u011c\u0114\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0119\3\2\2\2\u011d"+
		"H\3\2\2\2\u011e\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7w\2\2\u0121"+
		"\u0128\7g\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2"+
		"\u0125\u0126\7u\2\2\u0126\u0128\7g\2\2\u0127\u011e\3\2\2\2\u0127\u0122"+
		"\3\2\2\2\u0128J\3\2\2\2\u0129\u0137\7$\2\2\u012a\u0136\5[.\2\u012b\u0136"+
		"\t\4\2\2\u012c\u0136\5]/\2\u012d\u012e\7^\2\2\u012e\u0136\7$\2\2\u012f"+
		"\u0130\7^\2\2\u0130\u0136\7^\2\2\u0131\u0132\7^\2\2\u0132\u0136\7p\2\2"+
		"\u0133\u0134\7^\2\2\u0134\u0136\7t\2\2\u0135\u012a\3\2\2\2\u0135\u012b"+
		"\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012f\3\2\2\2\u0135"+
		"\u0131\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013bL\3\2\2\2\u013c\u0141\5[.\2\u013d\u0140\5[.\2\u013e"+
		"\u0140\t\5\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142N\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0146\7/\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014e\5W,\2\u0148\u014a\7\60\2\2\u0149\u014b\t\4"+
		"\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014fP\3\2\2\2\u0150\u0151\t\6\2\2\u0151R\3\2\2\2\u0152\u0153\7%"+
		"\2\2\u0153\u0155\5Y-\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0158\7\17\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015a\7\f\2\2\u015aT\3\2\2\2\u015b\u015c\7"+
		"%\2\2\u015c\u015d\5Y-\2\u015dV\3\2\2\2\u015e\u0162\t\7\2\2\u015f\u0161"+
		"\t\4\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0167\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0167\7\62"+
		"\2\2\u0166\u015e\3\2\2\2\u0166\u0165\3\2\2\2\u0167X\3\2\2\2\u0168\u016d"+
		"\5[.\2\u0169\u016d\t\4\2\2\u016a\u016d\5]/\2\u016b\u016d\7$\2\2\u016c"+
		"\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"Z\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\t\b\2\2\u0172\u0171\3\2\2\2"+
		"\u0173\\\3\2\2\2\u0174\u0175\t\t\2\2\u0175^\3\2\2\2\24\2\u0110\u011c\u0127"+
		"\u0135\u0137\u013f\u0141\u0145\u014c\u014e\u0154\u0157\u0162\u0166\u016c"+
		"\u016e\u0172\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}