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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FN=6, IF=7, THEN=8, ELSE=9, BEGIN=10, 
		END=11, EXIST=12, PRINT=13, RENAME=14, REMOVE=15, MOVE=16, COPY=17, DOWNLOAD=18, 
		WRITE=19, WAIT=20, EXECUTE=21, EXIT=22, TIME=23, GET_FILES=24, DATE_MODIFIED=25, 
		FILE=26, FOLDER=27, ARGS=28, SIZE=29, READ=30, CMP_OP=31, LOG_OP=32, BOOL=33, 
		STR=34, ID=35, NUM=36, WS=37, NL=38, END_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FN", "IF", "THEN", "ELSE", "BEGIN", 
			"END", "EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", 
			"WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", 
			"FILE", "FOLDER", "ARGS", "SIZE", "READ", "CMP_OP", "LOG_OP", "BOOL", 
			"STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "INT_PART", "OPT_CHARS", 
			"OTHER_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'fn'", "'if'", "'then'", "'else'", 
			"'begin'", "'end'", "'exist'", "'print'", "'rename'", "'remove'", "'move'", 
			"'copy'", "'download'", "'write'", "'wait'", "'execute'", "'exit'", "'time'", 
			"'getFiles'", "'dateModified'", "'file'", "'folder'", "'args'", "'size'", 
			"'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FN", "IF", "THEN", "ELSE", "BEGIN", 
			"END", "EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", 
			"WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", 
			"FILE", "FOLDER", "ARGS", "SIZE", "READ", "CMP_OP", "LOG_OP", "BOOL", 
			"STR", "ID", "NUM", "WS", "NL", "END_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u0100\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u010a\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0115\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\7#\u0122\n#\f#\16#\u0125\13#\3#\3#\3$\3$\7$\u012b\n$\f$\16$\u012e"+
		"\13$\3%\5%\u0131\n%\3%\3%\3%\6%\u0136\n%\r%\16%\u0137\5%\u013a\n%\3&\3"+
		"&\3\'\3\'\5\'\u0140\n\'\3\'\3\'\3(\3(\3(\3)\3)\7)\u0149\n)\f)\16)\u014c"+
		"\13)\3)\5)\u014f\n)\3*\3*\7*\u0153\n*\f*\16*\u0156\13*\3+\3+\2\2,\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q\2S\2U\2\3\2\n\4\2>>@@\5\2\62;C\\c|\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2\62;\4\2\13\13\"\"\3\2\63;\t\2\13\13\"#%\61<B]]_b}\u0080\2"+
		"\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3W\3\2\2\2\5Y\3"+
		"\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17d\3\2\2\2\21g\3"+
		"\2\2\2\23l\3\2\2\2\25q\3\2\2\2\27w\3\2\2\2\31{\3\2\2\2\33\u0081\3\2\2"+
		"\2\35\u0087\3\2\2\2\37\u008e\3\2\2\2!\u0095\3\2\2\2#\u009a\3\2\2\2%\u009f"+
		"\3\2\2\2\'\u00a8\3\2\2\2)\u00ae\3\2\2\2+\u00b3\3\2\2\2-\u00bb\3\2\2\2"+
		"/\u00c0\3\2\2\2\61\u00c5\3\2\2\2\63\u00ce\3\2\2\2\65\u00db\3\2\2\2\67"+
		"\u00e0\3\2\2\29\u00e7\3\2\2\2;\u00ec\3\2\2\2=\u00f1\3\2\2\2?\u00ff\3\2"+
		"\2\2A\u0109\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u0128\3\2\2\2I\u0130"+
		"\3\2\2\2K\u013b\3\2\2\2M\u013f\3\2\2\2O\u0143\3\2\2\2Q\u014e\3\2\2\2S"+
		"\u0154\3\2\2\2U\u0157\3\2\2\2WX\7=\2\2X\4\3\2\2\2YZ\7*\2\2Z\6\3\2\2\2"+
		"[\\\7.\2\2\\\b\3\2\2\2]^\7+\2\2^\n\3\2\2\2_`\7?\2\2`\f\3\2\2\2ab\7h\2"+
		"\2bc\7p\2\2c\16\3\2\2\2de\7k\2\2ef\7h\2\2f\20\3\2\2\2gh\7v\2\2hi\7j\2"+
		"\2ij\7g\2\2jk\7p\2\2k\22\3\2\2\2lm\7g\2\2mn\7n\2\2no\7u\2\2op\7g\2\2p"+
		"\24\3\2\2\2qr\7d\2\2rs\7g\2\2st\7i\2\2tu\7k\2\2uv\7p\2\2v\26\3\2\2\2w"+
		"x\7g\2\2xy\7p\2\2yz\7f\2\2z\30\3\2\2\2{|\7g\2\2|}\7z\2\2}~\7k\2\2~\177"+
		"\7u\2\2\177\u0080\7v\2\2\u0080\32\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7o\2\2\u008c\u008d\7g\2\2\u008d\36\3\2\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7o\2\2\u0091\u0092\7q\2\2"+
		"\u0092\u0093\7x\2\2\u0093\u0094\7g\2\2\u0094 \3\2\2\2\u0095\u0096\7o\2"+
		"\2\u0096\u0097\7q\2\2\u0097\u0098\7x\2\2\u0098\u0099\7g\2\2\u0099\"\3"+
		"\2\2\2\u009a\u009b\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7{\2\2\u009e$\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7y\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7y\2"+
		"\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad(\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1"+
		"\7k\2\2\u00b1\u00b2\7v\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7z\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc"+
		"\u00bd\7z\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\60\3\2\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7"+
		"v\2\2\u00c8\u00c9\7H\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7O\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2"+
		"\u00d7\u00d8\7k\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7f\2\2\u00da\64\3\2"+
		"\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7n\2\2\u00de\u00df"+
		"\7g\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3"+
		"\7n\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"8\3\2\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7i\2\2\u00ea"+
		"\u00eb\7u\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7|\2\2\u00ef\u00f0\7g\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7f\2\2\u00f5>\3\2\2\2\u00f6"+
		"\u00f7\7#\2\2\u00f7\u0100\7?\2\2\u00f8\u0100\t\2\2\2\u00f9\u00fa\7?\2"+
		"\2\u00fa\u0100\7?\2\2\u00fb\u00fc\7>\2\2\u00fc\u0100\7?\2\2\u00fd\u00fe"+
		"\7@\2\2\u00fe\u0100\7?\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff"+
		"\u00f9\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100@\3\2\2\2"+
		"\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2\u0103\u010a\7f\2\2\u0104\u0105"+
		"\7q\2\2\u0105\u010a\7t\2\2\u0106\u0107\7p\2\2\u0107\u0108\7q\2\2\u0108"+
		"\u010a\7v\2\2\u0109\u0101\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0106\3\2"+
		"\2\2\u010aB\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7w\2\2\u010e\u0115\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0115\7g\2\2\u0114\u010b\3\2\2"+
		"\2\u0114\u010f\3\2\2\2\u0115D\3\2\2\2\u0116\u0123\7$\2\2\u0117\u0122\t"+
		"\3\2\2\u0118\u0122\5U+\2\u0119\u011a\7^\2\2\u011a\u0122\7$\2\2\u011b\u011c"+
		"\7^\2\2\u011c\u0122\7^\2\2\u011d\u011e\7^\2\2\u011e\u0122\7p\2\2\u011f"+
		"\u0120\7^\2\2\u0120\u0122\7t\2\2\u0121\u0117\3\2\2\2\u0121\u0118\3\2\2"+
		"\2\u0121\u0119\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7$\2\2\u0127F\3\2\2\2\u0128"+
		"\u012c\t\4\2\2\u0129\u012b\t\5\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dH\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0131\7/\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0139\5Q)\2\u0133\u0135\7\60\2\2\u0134\u0136\t\6"+
		"\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013aJ\3\2\2\2\u013b\u013c\t\7\2\2\u013cL\3\2\2\2\u013d\u013e\7%"+
		"\2\2\u013e\u0140\5S*\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0142\7\f\2\2\u0142N\3\2\2\2\u0143\u0144\7%\2\2\u0144\u0145"+
		"\5S*\2\u0145P\3\2\2\2\u0146\u014a\t\b\2\2\u0147\u0149\t\6\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014f\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\62\2\2\u014e\u0146\3"+
		"\2\2\2\u014e\u014d\3\2\2\2\u014fR\3\2\2\2\u0150\u0153\t\3\2\2\u0151\u0153"+
		"\5U+\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155T\3\2\2\2\u0156\u0154\3\2\2\2"+
		"\u0157\u0158\t\t\2\2\u0158V\3\2\2\2\22\2\u00ff\u0109\u0114\u0121\u0123"+
		"\u012a\u012c\u0130\u0137\u0139\u013f\u014a\u014e\u0152\u0154\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}