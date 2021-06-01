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
		CONCAT_OP=46, LOG_OP=47, BOOL=48, STR=49, ID=50, NUM=51, WS=52, NL=53, 
		END_COMMENT=54;
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
			"LENGTH", "APPEND", "CMP_OP", "ARITH_OP", "CONCAT_OP", "LOG_OP", "BOOL", 
			"STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "INT_PART", "OPT_CHARS", 
			"LETTER", "OTHER_CHAR"
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
			null, null, "'.'"
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
			"APPEND", "CMP_OP", "ARITH_OP", "CONCAT_OP", "LOG_OP", "BOOL", "STR", 
			"ID", "NUM", "WS", "NL", "END_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0163"+
		"\n-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0171\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u017c\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u018a\n\62\f\62"+
		"\16\62\u018d\13\62\3\62\3\62\3\63\3\63\3\63\7\63\u0194\n\63\f\63\16\63"+
		"\u0197\13\63\3\64\5\64\u019a\n\64\3\64\3\64\3\64\6\64\u019f\n\64\r\64"+
		"\16\64\u01a0\5\64\u01a3\n\64\3\65\3\65\3\66\3\66\5\66\u01a9\n\66\3\66"+
		"\5\66\u01ac\n\66\3\66\3\66\3\67\3\67\3\67\38\38\78\u01b5\n8\f8\168\u01b8"+
		"\138\38\58\u01bb\n8\39\39\39\39\79\u01c1\n9\f9\169\u01c4\139\3:\5:\u01c7"+
		"\n:\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o\2q\2s\2u\2\3\2\n\4\2>>@@\5\2,-//\61\61\3\2\62;\4\2\62;"+
		"aa\4\2\13\13\"\"\3\2\63;\13\2C\\c|\u00d5\u00d5\u00f5\u00f5\u0106\u0109"+
		"\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\t\2\13\13\"#%\61<B]]"+
		"_b}\u0080\2\u01e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177"+
		"\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0088\3"+
		"\2\2\2\25\u008e\3\2\2\2\27\u0096\3\2\2\2\31\u0099\3\2\2\2\33\u009c\3\2"+
		"\2\2\35\u009f\3\2\2\2\37\u00a4\3\2\2\2!\u00a9\3\2\2\2#\u00af\3\2\2\2%"+
		"\u00b3\3\2\2\2\'\u00bc\3\2\2\2)\u00c0\3\2\2\2+\u00c6\3\2\2\2-\u00cc\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00da\3\2\2\2\63\u00df\3\2\2\2\65\u00e4\3\2\2"+
		"\2\67\u00ed\3\2\2\29\u00f3\3\2\2\2;\u00f8\3\2\2\2=\u0100\3\2\2\2?\u0105"+
		"\3\2\2\2A\u010a\3\2\2\2C\u0113\3\2\2\2E\u0120\3\2\2\2G\u0126\3\2\2\2I"+
		"\u012d\3\2\2\2K\u0132\3\2\2\2M\u0139\3\2\2\2O\u013e\3\2\2\2Q\u0143\3\2"+
		"\2\2S\u0148\3\2\2\2U\u014f\3\2\2\2W\u0156\3\2\2\2Y\u0162\3\2\2\2[\u0164"+
		"\3\2\2\2]\u0166\3\2\2\2_\u0170\3\2\2\2a\u017b\3\2\2\2c\u017d\3\2\2\2e"+
		"\u0190\3\2\2\2g\u0199\3\2\2\2i\u01a4\3\2\2\2k\u01a8\3\2\2\2m\u01af\3\2"+
		"\2\2o\u01ba\3\2\2\2q\u01c2\3\2\2\2s\u01c6\3\2\2\2u\u01c8\3\2\2\2wx\7="+
		"\2\2x\4\3\2\2\2yz\7*\2\2z\6\3\2\2\2{|\7.\2\2|\b\3\2\2\2}~\7+\2\2~\n\3"+
		"\2\2\2\177\u0080\7?\2\2\u0080\f\3\2\2\2\u0081\u0082\7]\2\2\u0082\16\3"+
		"\2\2\2\u0083\u0084\7_\2\2\u0084\20\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087"+
		"\7p\2\2\u0087\22\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\24\3\2\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094\u0095\7j\2\2\u0095\26\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\30\3\2\2\2\u0099\u009a\7f\2\2\u009a"+
		"\u009b\7q\2\2\u009b\32\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7d\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\"\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f"+
		"\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7c\2\2\u00b9"+
		"\u00ba\7o\2\2\u00ba\u00bb\7g\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7w\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7z\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5*\3\2\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7k\2"+
		"\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7"+
		"t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7o\2\2\u00d1\u00d2\7g\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7x\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\60\3\2\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7g\2\2\u00de\62\3\2\2\2\u00df\u00e0\7e\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7{\2\2\u00e3\64\3\2\2\2\u00e4"+
		"\u00e5\7f\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7y\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8\u00e9\7n\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7f\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f28\3\2\2\2\u00f3\u00f4"+
		"\7y\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7z\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ff<\3\2\2\2\u0100\u0101\7g\2\2\u0101\u0102\7z\2\2\u0102\u0103\7k\2"+
		"\2\u0103\u0104\7v\2\2\u0104>\3\2\2\2\u0105\u0106\7v\2\2\u0106\u0107\7"+
		"k\2\2\u0107\u0108\7o\2\2\u0108\u0109\7g\2\2\u0109@\3\2\2\2\u010a\u010b"+
		"\7i\2\2\u010b\u010c\7g\2\2\u010c\u010d\7v\2\2\u010d\u010e\7H\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u0111\7g\2\2\u0111\u0112\7u\2\2"+
		"\u0112B\3\2\2\2\u0113\u0114\7f\2\2\u0114\u0115\7c\2\2\u0115\u0116\7v\2"+
		"\2\u0116\u0117\7g\2\2\u0117\u0118\7O\2\2\u0118\u0119\7q\2\2\u0119\u011a"+
		"\7f\2\2\u011a\u011b\7k\2\2\u011b\u011c\7h\2\2\u011c\u011d\7k\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u011f\7f\2\2\u011fD\3\2\2\2\u0120\u0121\7k\2\2\u0121"+
		"\u0122\7u\2\2\u0122\u0123\7F\2\2\u0123\u0124\7k\2\2\u0124\u0125\7t\2\2"+
		"\u0125F\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7u\2\2\u0128\u0129\7H\2"+
		"\2\u0129\u012a\7k\2\2\u012a\u012b\7n\2\2\u012b\u012c\7g\2\2\u012cH\3\2"+
		"\2\2\u012d\u012e\7h\2\2\u012e\u012f\7k\2\2\u012f\u0130\7n\2\2\u0130\u0131"+
		"\7g\2\2\u0131J\3\2\2\2\u0132\u0133\7h\2\2\u0133\u0134\7q\2\2\u0134\u0135"+
		"\7n\2\2\u0135\u0136\7f\2\2\u0136\u0137\7g\2\2\u0137\u0138\7t\2\2\u0138"+
		"L\3\2\2\2\u0139\u013a\7c\2\2\u013a\u013b\7t\2\2\u013b\u013c\7i\2\2\u013c"+
		"\u013d\7u\2\2\u013dN\3\2\2\2\u013e\u013f\7u\2\2\u013f\u0140\7k\2\2\u0140"+
		"\u0141\7|\2\2\u0141\u0142\7g\2\2\u0142P\3\2\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7g\2\2\u0145\u0146\7c\2\2\u0146\u0147\7f\2\2\u0147R\3\2\2\2\u0148"+
		"\u0149\7e\2\2\u0149\u014a\7t\2\2\u014a\u014b\7g\2\2\u014b\u014c\7c\2\2"+
		"\u014c\u014d\7v\2\2\u014d\u014e\7g\2\2\u014eT\3\2\2\2\u014f\u0150\7n\2"+
		"\2\u0150\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7i\2\2\u0153\u0154"+
		"\7v\2\2\u0154\u0155\7j\2\2\u0155V\3\2\2\2\u0156\u0157\7>\2\2\u0157\u0158"+
		"\7/\2\2\u0158X\3\2\2\2\u0159\u015a\7#\2\2\u015a\u0163\7?\2\2\u015b\u0163"+
		"\t\2\2\2\u015c\u015d\7?\2\2\u015d\u0163\7?\2\2\u015e\u015f\7>\2\2\u015f"+
		"\u0163\7?\2\2\u0160\u0161\7@\2\2\u0161\u0163\7?\2\2\u0162\u0159\3\2\2"+
		"\2\u0162\u015b\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163Z\3\2\2\2\u0164\u0165\t\3\2\2\u0165\\\3\2\2\2\u0166\u0167"+
		"\7\60\2\2\u0167^\3\2\2\2\u0168\u0169\7c\2\2\u0169\u016a\7p\2\2\u016a\u0171"+
		"\7f\2\2\u016b\u016c\7q\2\2\u016c\u0171\7t\2\2\u016d\u016e\7p\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0171\7v\2\2\u0170\u0168\3\2\2\2\u0170\u016b\3\2\2"+
		"\2\u0170\u016d\3\2\2\2\u0171`\3\2\2\2\u0172\u0173\7v\2\2\u0173\u0174\7"+
		"t\2\2\u0174\u0175\7w\2\2\u0175\u017c\7g\2\2\u0176\u0177\7h\2\2\u0177\u0178"+
		"\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a\7u\2\2\u017a\u017c\7g\2\2\u017b"+
		"\u0172\3\2\2\2\u017b\u0176\3\2\2\2\u017cb\3\2\2\2\u017d\u018b\7$\2\2\u017e"+
		"\u018a\5s:\2\u017f\u018a\t\4\2\2\u0180\u018a\5u;\2\u0181\u0182\7^\2\2"+
		"\u0182\u018a\7$\2\2\u0183\u0184\7^\2\2\u0184\u018a\7^\2\2\u0185\u0186"+
		"\7^\2\2\u0186\u018a\7p\2\2\u0187\u0188\7^\2\2\u0188\u018a\7t\2\2\u0189"+
		"\u017e\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0180\3\2\2\2\u0189\u0181\3\2"+
		"\2\2\u0189\u0183\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7$\2\2\u018fd\3\2\2\2\u0190\u0195"+
		"\5s:\2\u0191\u0194\5s:\2\u0192\u0194\t\5\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196f\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7/\2\2\u0199\u0198"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a2\5o8\2\u019c"+
		"\u019e\7\60\2\2\u019d\u019f\t\4\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u019c\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3h\3\2\2\2\u01a4\u01a5\t\6\2\2"+
		"\u01a5j\3\2\2\2\u01a6\u01a7\7%\2\2\u01a7\u01a9\5q9\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\7\17\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\f"+
		"\2\2\u01ael\3\2\2\2\u01af\u01b0\7%\2\2\u01b0\u01b1\5q9\2\u01b1n\3\2\2"+
		"\2\u01b2\u01b6\t\7\2\2\u01b3\u01b5\t\4\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bb\7\62\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b9\3"+
		"\2\2\2\u01bbp\3\2\2\2\u01bc\u01c1\5s:\2\u01bd\u01c1\t\4\2\2\u01be\u01c1"+
		"\5u;\2\u01bf\u01c1\7$\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3r\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7"+
		"\t\b\2\2\u01c6\u01c5\3\2\2\2\u01c7t\3\2\2\2\u01c8\u01c9\t\t\2\2\u01c9"+
		"v\3\2\2\2\24\2\u0162\u0170\u017b\u0189\u018b\u0193\u0195\u0199\u01a0\u01a2"+
		"\u01a8\u01ab\u01b6\u01ba\u01c0\u01c2\u01c6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}