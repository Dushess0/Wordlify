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
		FOREACH=10, IN=11, DO=12, IF=13, THEN=14, ELSE=15, BEGIN=16, END=17, BASENAME=18, 
		IMPORT=19, EXIST=20, PRINT=21, RENAME=22, REMOVE=23, MOVE=24, COPY=25, 
		DOWNLOAD=26, WRITE=27, WAIT=28, EXECUTE=29, EXIT=30, TIME=31, GET_FILES=32, 
		DATE_MODIFIED=33, IS_DIR=34, IS_FILE=35, FILE=36, FOLDER=37, ARGS=38, 
		SIZE=39, READ=40, CREATE=41, LENGTH=42, APPEND=43, CMP_OP=44, ARITH_OP=45, 
		CONCAT_OP=46, BIN_LOG_OP=47, NOT=48, BOOL=49, STR=50, ID=51, NUM=52, WS=53, 
		NL=54, END_COMMENT=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "FN", "WHILE", 
			"FOREACH", "IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "BASENAME", 
			"IMPORT", "EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", 
			"WRITE", "WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", 
			"IS_DIR", "IS_FILE", "FILE", "FOLDER", "ARGS", "SIZE", "READ", "CREATE", 
			"LENGTH", "APPEND", "CMP_OP", "ARITH_OP", "CONCAT_OP", "BIN_LOG_OP", 
			"NOT", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "INT_PART", 
			"OPT_CHARS", "LETTER", "OTHER_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "','", "')'", "'='", "'['", "']'", "'fn'", "'while'", 
			"'foreach'", "'in'", "'do'", "'if'", "'then'", "'else'", "'begin'", "'end'", 
			"'baseName'", "'use'", "'exist'", "'print'", "'rename'", "'remove'", 
			"'move'", "'copy'", "'download'", "'write'", "'wait'", "'execute'", "'exit'", 
			"'time'", "'getFiles'", "'dateModified'", "'isDir'", "'isFile'", "'file'", 
			"'folder'", "'args'", "'size'", "'read'", "'create'", "'length'", "'<-'", 
			null, null, "'.'", null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "FN", "WHILE", "FOREACH", 
			"IN", "DO", "IF", "THEN", "ELSE", "BEGIN", "END", "BASENAME", "IMPORT", 
			"EXIST", "PRINT", "RENAME", "REMOVE", "MOVE", "COPY", "DOWNLOAD", "WRITE", 
			"WAIT", "EXECUTE", "EXIT", "TIME", "GET_FILES", "DATE_MODIFIED", "IS_DIR", 
			"IS_FILE", "FILE", "FOLDER", "ARGS", "SIZE", "READ", "CREATE", "LENGTH", 
			"APPEND", "CMP_OP", "ARITH_OP", "CONCAT_OP", "BIN_LOG_OP", "NOT", "BOOL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u01cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0165"+
		"\n-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u0170\n\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u017f\n\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u018d\n\63"+
		"\f\63\16\63\u0190\13\63\3\63\3\63\3\64\3\64\3\64\7\64\u0197\n\64\f\64"+
		"\16\64\u019a\13\64\3\65\5\65\u019d\n\65\3\65\3\65\3\65\6\65\u01a2\n\65"+
		"\r\65\16\65\u01a3\5\65\u01a6\n\65\3\66\3\66\3\67\3\67\5\67\u01ac\n\67"+
		"\3\67\5\67\u01af\n\67\3\67\3\67\38\38\38\39\39\79\u01b8\n9\f9\169\u01bb"+
		"\139\39\59\u01be\n9\3:\3:\3:\3:\7:\u01c4\n:\f:\16:\u01c7\13:\3;\5;\u01ca"+
		"\n;\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q\2s\2u\2w\2\3\2\n\4\2>>@@\5\2,-//\61\61\3\2\62;\4\2\62"+
		";aa\4\2\13\13\"\"\3\2\63;\13\2C\\c|\u00d5\u00d5\u00f5\u00f5\u0106\u0109"+
		"\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\t\2\13\13\"#%\61<B]]"+
		"_b}\u0080\2\u01e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177"+
		"\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3"+
		"\2\2\2\23\u008a\3\2\2\2\25\u0090\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2"+
		"\2\2\33\u009e\3\2\2\2\35\u00a1\3\2\2\2\37\u00a6\3\2\2\2!\u00ab\3\2\2\2"+
		"#\u00b1\3\2\2\2%\u00b5\3\2\2\2\'\u00be\3\2\2\2)\u00c2\3\2\2\2+\u00c8\3"+
		"\2\2\2-\u00ce\3\2\2\2/\u00d5\3\2\2\2\61\u00dc\3\2\2\2\63\u00e1\3\2\2\2"+
		"\65\u00e6\3\2\2\2\67\u00ef\3\2\2\29\u00f5\3\2\2\2;\u00fa\3\2\2\2=\u0102"+
		"\3\2\2\2?\u0107\3\2\2\2A\u010c\3\2\2\2C\u0115\3\2\2\2E\u0122\3\2\2\2G"+
		"\u0128\3\2\2\2I\u012f\3\2\2\2K\u0134\3\2\2\2M\u013b\3\2\2\2O\u0140\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u014a\3\2\2\2U\u0151\3\2\2\2W\u0158\3\2\2\2Y\u0164"+
		"\3\2\2\2[\u0166\3\2\2\2]\u0168\3\2\2\2_\u016f\3\2\2\2a\u0171\3\2\2\2c"+
		"\u017e\3\2\2\2e\u0180\3\2\2\2g\u0193\3\2\2\2i\u019c\3\2\2\2k\u01a7\3\2"+
		"\2\2m\u01ab\3\2\2\2o\u01b2\3\2\2\2q\u01bd\3\2\2\2s\u01c5\3\2\2\2u\u01c9"+
		"\3\2\2\2w\u01cb\3\2\2\2yz\7=\2\2z\4\3\2\2\2{|\7*\2\2|\6\3\2\2\2}~\7.\2"+
		"\2~\b\3\2\2\2\177\u0080\7+\2\2\u0080\n\3\2\2\2\u0081\u0082\7?\2\2\u0082"+
		"\f\3\2\2\2\u0083\u0084\7]\2\2\u0084\16\3\2\2\2\u0085\u0086\7_\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7p\2\2\u0089\22\3\2\2\2\u008a"+
		"\u008b\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u008f\7g\2\2\u008f\24\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7"+
		"q\2\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7c\2\2\u0095\u0096"+
		"\7e\2\2\u0096\u0097\7j\2\2\u0097\26\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7p\2\2\u009a\30\3\2\2\2\u009b\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\32"+
		"\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0\34\3\2\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2"+
		"\u00a5\36\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7"+
		"u\2\2\u00a9\u00aa\7g\2\2\u00aa \3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\"\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7f\2\2\u00b4"+
		"$\3\2\2\2\u00b5\u00b6\7d\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7o\2\2"+
		"\u00bc\u00bd\7g\2\2\u00bd&\3\2\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7u\2"+
		"\2\u00c0\u00c1\7g\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7"+
		"z\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7v\2\2\u00c7*"+
		"\3\2\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7o\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2"+
		"\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7x\2\2\u00da\u00db"+
		"\7g\2\2\u00db\60\3\2\2\2\u00dc\u00dd\7o\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7x\2\2\u00df\u00e0\7g\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7{\2\2\u00e5\64\3\2\2\2\u00e6\u00e7"+
		"\7f\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7p\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7f\2\2"+
		"\u00ee\66\3\2\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7"+
		"k\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7g\2\2\u00f48\3\2\2\2\u00f5\u00f6"+
		"\7y\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		":\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7z\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u00fe\7e\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7g\2\2"+
		"\u0101<\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7z\2\2\u0104\u0105\7k\2"+
		"\2\u0105\u0106\7v\2\2\u0106>\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7"+
		"k\2\2\u0109\u010a\7o\2\2\u010a\u010b\7g\2\2\u010b@\3\2\2\2\u010c\u010d"+
		"\7i\2\2\u010d\u010e\7g\2\2\u010e\u010f\7v\2\2\u010f\u0110\7H\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113\u0114\7u\2\2"+
		"\u0114B\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117\7c\2\2\u0117\u0118\7v\2"+
		"\2\u0118\u0119\7g\2\2\u0119\u011a\7O\2\2\u011a\u011b\7q\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u011d\7k\2\2\u011d\u011e\7h\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7g\2\2\u0120\u0121\7f\2\2\u0121D\3\2\2\2\u0122\u0123\7k\2\2\u0123"+
		"\u0124\7u\2\2\u0124\u0125\7F\2\2\u0125\u0126\7k\2\2\u0126\u0127\7t\2\2"+
		"\u0127F\3\2\2\2\u0128\u0129\7k\2\2\u0129\u012a\7u\2\2\u012a\u012b\7H\2"+
		"\2\u012b\u012c\7k\2\2\u012c\u012d\7n\2\2\u012d\u012e\7g\2\2\u012eH\3\2"+
		"\2\2\u012f\u0130\7h\2\2\u0130\u0131\7k\2\2\u0131\u0132\7n\2\2\u0132\u0133"+
		"\7g\2\2\u0133J\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7q\2\2\u0136\u0137"+
		"\7n\2\2\u0137\u0138\7f\2\2\u0138\u0139\7g\2\2\u0139\u013a\7t\2\2\u013a"+
		"L\3\2\2\2\u013b\u013c\7c\2\2\u013c\u013d\7t\2\2\u013d\u013e\7i\2\2\u013e"+
		"\u013f\7u\2\2\u013fN\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7k\2\2\u0142"+
		"\u0143\7|\2\2\u0143\u0144\7g\2\2\u0144P\3\2\2\2\u0145\u0146\7t\2\2\u0146"+
		"\u0147\7g\2\2\u0147\u0148\7c\2\2\u0148\u0149\7f\2\2\u0149R\3\2\2\2\u014a"+
		"\u014b\7e\2\2\u014b\u014c\7t\2\2\u014c\u014d\7g\2\2\u014d\u014e\7c\2\2"+
		"\u014e\u014f\7v\2\2\u014f\u0150\7g\2\2\u0150T\3\2\2\2\u0151\u0152\7n\2"+
		"\2\u0152\u0153\7g\2\2\u0153\u0154\7p\2\2\u0154\u0155\7i\2\2\u0155\u0156"+
		"\7v\2\2\u0156\u0157\7j\2\2\u0157V\3\2\2\2\u0158\u0159\7>\2\2\u0159\u015a"+
		"\7/\2\2\u015aX\3\2\2\2\u015b\u015c\7#\2\2\u015c\u0165\7?\2\2\u015d\u0165"+
		"\t\2\2\2\u015e\u015f\7?\2\2\u015f\u0165\7?\2\2\u0160\u0161\7>\2\2\u0161"+
		"\u0165\7?\2\2\u0162\u0163\7@\2\2\u0163\u0165\7?\2\2\u0164\u015b\3\2\2"+
		"\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u0160\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165Z\3\2\2\2\u0166\u0167\t\3\2\2\u0167\\\3\2\2\2\u0168\u0169"+
		"\7\60\2\2\u0169^\3\2\2\2\u016a\u016b\7c\2\2\u016b\u016c\7p\2\2\u016c\u0170"+
		"\7f\2\2\u016d\u016e\7q\2\2\u016e\u0170\7t\2\2\u016f\u016a\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170`\3\2\2\2\u0171\u0172\7p\2\2\u0172\u0173\7q\2\2\u0173"+
		"\u0174\7v\2\2\u0174b\3\2\2\2\u0175\u0176\7v\2\2\u0176\u0177\7t\2\2\u0177"+
		"\u0178\7w\2\2\u0178\u017f\7g\2\2\u0179\u017a\7h\2\2\u017a\u017b\7c\2\2"+
		"\u017b\u017c\7n\2\2\u017c\u017d\7u\2\2\u017d\u017f\7g\2\2\u017e\u0175"+
		"\3\2\2\2\u017e\u0179\3\2\2\2\u017fd\3\2\2\2\u0180\u018e\7$\2\2\u0181\u018d"+
		"\5u;\2\u0182\u018d\t\4\2\2\u0183\u018d\5w<\2\u0184\u0185\7^\2\2\u0185"+
		"\u018d\7$\2\2\u0186\u0187\7^\2\2\u0187\u018d\7^\2\2\u0188\u0189\7^\2\2"+
		"\u0189\u018d\7p\2\2\u018a\u018b\7^\2\2\u018b\u018d\7t\2\2\u018c\u0181"+
		"\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0183\3\2\2\2\u018c\u0184\3\2\2\2\u018c"+
		"\u0186\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7$\2\2\u0192f\3\2\2\2\u0193\u0198\5u;\2\u0194"+
		"\u0197\5u;\2\u0195\u0197\t\5\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2"+
		"\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199h"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\7/\2\2\u019c\u019b\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a5\5q9\2\u019f\u01a1\7\60"+
		"\2\2\u01a0\u01a2\t\4\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u019f\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6j\3\2\2\2\u01a7\u01a8\t\6\2\2\u01a8l\3\2"+
		"\2\2\u01a9\u01aa\7%\2\2\u01aa\u01ac\5s:\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\7\17\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7\f\2\2\u01b1n\3"+
		"\2\2\2\u01b2\u01b3\7%\2\2\u01b3\u01b4\5s:\2\u01b4p\3\2\2\2\u01b5\u01b9"+
		"\t\7\2\2\u01b6\u01b8\t\4\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01be\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01be\7\62\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be"+
		"r\3\2\2\2\u01bf\u01c4\5u;\2\u01c0\u01c4\t\4\2\2\u01c1\u01c4\5w<\2\u01c2"+
		"\u01c4\7$\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2"+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6t\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01ca\t\b\2\2"+
		"\u01c9\u01c8\3\2\2\2\u01cav\3\2\2\2\u01cb\u01cc\t\t\2\2\u01ccx\3\2\2\2"+
		"\24\2\u0164\u016f\u017e\u018c\u018e\u0196\u0198\u019c\u01a3\u01a5\u01ab"+
		"\u01ae\u01b9\u01bd\u01c3\u01c5\u01c9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}