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
		NL=54, END_COMMENT=55, ERROR_CHAR=56;
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
			"NOT", "BOOL", "STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "ERROR_CHAR", 
			"INT_PART", "OPT_CHARS", "LETTER", "OTHER_CHAR"
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
			"STR", "ID", "NUM", "WS", "NL", "END_COMMENT", "ERROR_CHAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0167\n-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u0172\n\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0181"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63"+
		"\u018f\n\63\f\63\16\63\u0192\13\63\3\63\3\63\3\64\3\64\3\64\7\64\u0199"+
		"\n\64\f\64\16\64\u019c\13\64\3\65\5\65\u019f\n\65\3\65\3\65\3\65\6\65"+
		"\u01a4\n\65\r\65\16\65\u01a5\5\65\u01a8\n\65\3\66\3\66\3\67\3\67\5\67"+
		"\u01ae\n\67\3\67\5\67\u01b1\n\67\3\67\3\67\38\38\38\39\39\3:\3:\7:\u01bc"+
		"\n:\f:\16:\u01bf\13:\3:\5:\u01c2\n:\3;\3;\3;\3;\7;\u01c8\n;\f;\16;\u01cb"+
		"\13;\3<\5<\u01ce\n<\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2w\2y\2\3\2\n\4\2>>@@\5\2,-//\61\61"+
		"\3\2\62;\4\2\62;aa\4\2\13\13\"\"\3\2\63;\13\2C\\c|\u00d5\u00d5\u00f5\u00f5"+
		"\u0106\u0109\u011a\u011b\u0143\u0146\u015c\u015d\u017b\u017e\t\2\13\13"+
		"\"#%\61<B]]_b}\u0080\2\u01e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3{\3\2\2\2\5}\3\2"+
		"\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17"+
		"\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008c\3\2\2\2\25\u0092\3\2\2\2\27\u009a"+
		"\3\2\2\2\31\u009d\3\2\2\2\33\u00a0\3\2\2\2\35\u00a3\3\2\2\2\37\u00a8\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00b3\3\2\2\2%\u00b7\3\2\2\2\'\u00c0\3\2\2\2)\u00c4"+
		"\3\2\2\2+\u00ca\3\2\2\2-\u00d0\3\2\2\2/\u00d7\3\2\2\2\61\u00de\3\2\2\2"+
		"\63\u00e3\3\2\2\2\65\u00e8\3\2\2\2\67\u00f1\3\2\2\29\u00f7\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0109\3\2\2\2A\u010e\3\2\2\2C\u0117\3\2\2\2E"+
		"\u0124\3\2\2\2G\u012a\3\2\2\2I\u0131\3\2\2\2K\u0136\3\2\2\2M\u013d\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u0147\3\2\2\2S\u014c\3\2\2\2U\u0153\3\2\2\2W\u015a"+
		"\3\2\2\2Y\u0166\3\2\2\2[\u0168\3\2\2\2]\u016a\3\2\2\2_\u0171\3\2\2\2a"+
		"\u0173\3\2\2\2c\u0180\3\2\2\2e\u0182\3\2\2\2g\u0195\3\2\2\2i\u019e\3\2"+
		"\2\2k\u01a9\3\2\2\2m\u01ad\3\2\2\2o\u01b4\3\2\2\2q\u01b7\3\2\2\2s\u01c1"+
		"\3\2\2\2u\u01c9\3\2\2\2w\u01cd\3\2\2\2y\u01cf\3\2\2\2{|\7=\2\2|\4\3\2"+
		"\2\2}~\7*\2\2~\6\3\2\2\2\177\u0080\7.\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7+\2\2\u0082\n\3\2\2\2\u0083\u0084\7?\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7]\2\2\u0086\16\3\2\2\2\u0087\u0088\7_\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7p\2\2\u008b\22\3\2\2\2\u008c\u008d\7y\2\2\u008d\u008e"+
		"\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2\u0090\u0091\7g\2\2\u0091"+
		"\24\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7c\2\2\u0097\u0098\7e\2\2\u0098\u0099\7j\2\2"+
		"\u0099\26\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\30\3\2\2"+
		"\2\u009d\u009e\7f\2\2\u009e\u009f\7q\2\2\u009f\32\3\2\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7j\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\36\3\2\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		" \3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7P\2\2"+
		"\u00bc\u00bd\7c\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7g\2\2\u00bf&\3\2\2"+
		"\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3(\3\2"+
		"\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7z\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7u\2\2\u00c8\u00c9\7v\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		",\3\2\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7c\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7g\2\2\u00d6.\3\2\2\2\u00d7"+
		"\u00d8\7t\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7q\2\2"+
		"\u00db\u00dc\7x\2\2\u00dc\u00dd\7g\2\2\u00dd\60\3\2\2\2\u00de\u00df\7"+
		"o\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7g\2\2\u00e2\62"+
		"\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7r\2\2\u00e6"+
		"\u00e7\7{\2\2\u00e7\64\3\2\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7y\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2"+
		"\u00ee\u00ef\7c\2\2\u00ef\u00f0\7f\2\2\u00f0\66\3\2\2\2\u00f1\u00f2\7"+
		"y\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f68\3\2\2\2\u00f7\u00f8\7y\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7k\2\2\u00fa\u00fb\7v\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe"+
		"\7z\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7e\2\2\u0100\u0101\7w\2\2\u0101"+
		"\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103<\3\2\2\2\u0104\u0105\7g\2\2\u0105"+
		"\u0106\7z\2\2\u0106\u0107\7k\2\2\u0107\u0108\7v\2\2\u0108>\3\2\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7k\2\2\u010b\u010c\7o\2\2\u010c\u010d\7g\2\2"+
		"\u010d@\3\2\2\2\u010e\u010f\7i\2\2\u010f\u0110\7g\2\2\u0110\u0111\7v\2"+
		"\2\u0111\u0112\7H\2\2\u0112\u0113\7k\2\2\u0113\u0114\7n\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7u\2\2\u0116B\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119"+
		"\7c\2\2\u0119\u011a\7v\2\2\u011a\u011b\7g\2\2\u011b\u011c\7O\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7f\2\2\u011e\u011f\7k\2\2\u011f\u0120\7h\2\2"+
		"\u0120\u0121\7k\2\2\u0121\u0122\7g\2\2\u0122\u0123\7f\2\2\u0123D\3\2\2"+
		"\2\u0124\u0125\7k\2\2\u0125\u0126\7u\2\2\u0126\u0127\7F\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7t\2\2\u0129F\3\2\2\2\u012a\u012b\7k\2\2\u012b\u012c"+
		"\7u\2\2\u012c\u012d\7H\2\2\u012d\u012e\7k\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7g\2\2\u0130H\3\2\2\2\u0131\u0132\7h\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135J\3\2\2\2\u0136\u0137\7h\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7n\2\2\u0139\u013a\7f\2\2\u013a\u013b\7g\2\2"+
		"\u013b\u013c\7t\2\2\u013cL\3\2\2\2\u013d\u013e\7c\2\2\u013e\u013f\7t\2"+
		"\2\u013f\u0140\7i\2\2\u0140\u0141\7u\2\2\u0141N\3\2\2\2\u0142\u0143\7"+
		"u\2\2\u0143\u0144\7k\2\2\u0144\u0145\7|\2\2\u0145\u0146\7g\2\2\u0146P"+
		"\3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7c\2\2\u014a"+
		"\u014b\7f\2\2\u014bR\3\2\2\2\u014c\u014d\7e\2\2\u014d\u014e\7t\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7c\2\2\u0150\u0151\7v\2\2\u0151\u0152\7g\2\2"+
		"\u0152T\3\2\2\2\u0153\u0154\7n\2\2\u0154\u0155\7g\2\2\u0155\u0156\7p\2"+
		"\2\u0156\u0157\7i\2\2\u0157\u0158\7v\2\2\u0158\u0159\7j\2\2\u0159V\3\2"+
		"\2\2\u015a\u015b\7>\2\2\u015b\u015c\7/\2\2\u015cX\3\2\2\2\u015d\u015e"+
		"\7#\2\2\u015e\u0167\7?\2\2\u015f\u0167\t\2\2\2\u0160\u0161\7?\2\2\u0161"+
		"\u0167\7?\2\2\u0162\u0163\7>\2\2\u0163\u0167\7?\2\2\u0164\u0165\7@\2\2"+
		"\u0165\u0167\7?\2\2\u0166\u015d\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0160"+
		"\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2\2\u0167Z\3\2\2\2\u0168"+
		"\u0169\t\3\2\2\u0169\\\3\2\2\2\u016a\u016b\7\60\2\2\u016b^\3\2\2\2\u016c"+
		"\u016d\7c\2\2\u016d\u016e\7p\2\2\u016e\u0172\7f\2\2\u016f\u0170\7q\2\2"+
		"\u0170\u0172\7t\2\2\u0171\u016c\3\2\2\2\u0171\u016f\3\2\2\2\u0172`\3\2"+
		"\2\2\u0173\u0174\7p\2\2\u0174\u0175\7q\2\2\u0175\u0176\7v\2\2\u0176b\3"+
		"\2\2\2\u0177\u0178\7v\2\2\u0178\u0179\7t\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u0181\7g\2\2\u017b\u017c\7h\2\2\u017c\u017d\7c\2\2\u017d\u017e\7n\2\2"+
		"\u017e\u017f\7u\2\2\u017f\u0181\7g\2\2\u0180\u0177\3\2\2\2\u0180\u017b"+
		"\3\2\2\2\u0181d\3\2\2\2\u0182\u0190\7$\2\2\u0183\u018f\5w<\2\u0184\u018f"+
		"\t\4\2\2\u0185\u018f\5y=\2\u0186\u0187\7^\2\2\u0187\u018f\7$\2\2\u0188"+
		"\u0189\7^\2\2\u0189\u018f\7^\2\2\u018a\u018b\7^\2\2\u018b\u018f\7p\2\2"+
		"\u018c\u018d\7^\2\2\u018d\u018f\7t\2\2\u018e\u0183\3\2\2\2\u018e\u0184"+
		"\3\2\2\2\u018e\u0185\3\2\2\2\u018e\u0186\3\2\2\2\u018e\u0188\3\2\2\2\u018e"+
		"\u018a\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0194\7$\2\2\u0194f\3\2\2\2\u0195\u019a\5w<\2\u0196\u0199\5w<\2\u0197"+
		"\u0199\t\5\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019bh\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u019f\7/\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a7\5s:\2\u01a1\u01a3\7\60\2\2\u01a2\u01a4\t\4"+
		"\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a1\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8j\3\2\2\2\u01a9\u01aa\t\6\2\2\u01aal\3\2\2\2\u01ab\u01ac\7%"+
		"\2\2\u01ac\u01ae\5u;\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01b1\7\17\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\f\2\2\u01b3n\3\2\2\2\u01b4\u01b5\7"+
		"%\2\2\u01b5\u01b6\5u;\2\u01b6p\3\2\2\2\u01b7\u01b8\13\2\2\2\u01b8r\3\2"+
		"\2\2\u01b9\u01bd\t\7\2\2\u01ba\u01bc\t\4\2\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c2\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2\7\62\2\2\u01c1\u01b9\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2t\3\2\2\2\u01c3\u01c8\5w<\2\u01c4\u01c8\t\4\2\2\u01c5"+
		"\u01c8\5y=\2\u01c6\u01c8\7$\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01cav\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01ce\t\b\2\2\u01cd\u01cc\3\2\2\2\u01cex\3\2\2\2\u01cf\u01d0\t\t\2\2"+
		"\u01d0z\3\2\2\2\24\2\u0166\u0171\u0180\u018e\u0190\u0198\u019a\u019e\u01a5"+
		"\u01a7\u01ad\u01b0\u01bd\u01c1\u01c7\u01c9\u01cd\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}