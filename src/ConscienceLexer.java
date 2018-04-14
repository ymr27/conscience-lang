// Generated from Conscience.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConscienceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, BOOLEAN=24, 
		INTEGER=25, STRING=26, ID=27, WS=28, COMMENT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "BOOLEAN", "INTEGER", 
		"STRING", "ID", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'='", "';'", "'print'", "'if'", "'{'", "'}'", "'while'", 
		"'fn'", "'('", "')'", "'=>'", "','", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'>'", "'<'", "'<='", "'>='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"BOOLEAN", "INTEGER", "STRING", "ID", "WS", "COMMENT"
	};
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


	public ConscienceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Conscience.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0085\n\31\3\32\6\32\u0088\n\32\r\32\16"+
		"\32\u0089\3\33\3\33\7\33\u008e\n\33\f\33\16\33\u0091\13\33\3\33\3\33\3"+
		"\34\6\34\u0096\n\34\r\34\16\34\u0097\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u00a2\n\36\f\36\16\36\u00a5\13\36\3\36\3\36\3\36\3\36\3\36"+
		"\4\u008f\u00a3\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00af"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13K\3\2\2\2\rN\3\2"+
		"\2\2\17P\3\2\2\2\21R\3\2\2\2\23X\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3"+
		"\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2"+
		"\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-u\3\2\2\2/x\3\2\2\2\61\u0084\3\2\2\2"+
		"\63\u0087\3\2\2\2\65\u008b\3\2\2\2\67\u0095\3\2\2\29\u0099\3\2\2\2;\u009d"+
		"\3\2\2\2=>\7n\2\2>?\7g\2\2?@\7v\2\2@\4\3\2\2\2AB\7?\2\2B\6\3\2\2\2CD\7"+
		"=\2\2D\b\3\2\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\n\3\2\2"+
		"\2KL\7k\2\2LM\7h\2\2M\f\3\2\2\2NO\7}\2\2O\16\3\2\2\2PQ\7\177\2\2Q\20\3"+
		"\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\22\3\2\2\2XY\7h\2"+
		"\2YZ\7p\2\2Z\24\3\2\2\2[\\\7*\2\2\\\26\3\2\2\2]^\7+\2\2^\30\3\2\2\2_`"+
		"\7?\2\2`a\7@\2\2a\32\3\2\2\2bc\7.\2\2c\34\3\2\2\2de\7,\2\2e\36\3\2\2\2"+
		"fg\7\61\2\2g \3\2\2\2hi\7\'\2\2i\"\3\2\2\2jk\7-\2\2k$\3\2\2\2lm\7/\2\2"+
		"m&\3\2\2\2no\7@\2\2o(\3\2\2\2pq\7>\2\2q*\3\2\2\2rs\7>\2\2st\7?\2\2t,\3"+
		"\2\2\2uv\7@\2\2vw\7?\2\2w.\3\2\2\2xy\7?\2\2yz\7?\2\2z\60\3\2\2\2{|\7v"+
		"\2\2|}\7t\2\2}~\7w\2\2~\u0085\7g\2\2\177\u0080\7h\2\2\u0080\u0081\7c\2"+
		"\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0085\7g\2\2\u0084{\3\2"+
		"\2\2\u0084\177\3\2\2\2\u0085\62\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\64\3\2\2\2\u008b\u008f\7$\2\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\66\3\2\2\2\u0094"+
		"\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u00988\3\2\2\2\u0099\u009a\t\4\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\b\35\2\2\u009c:\3\2\2\2\u009d\u009e\7\61\2\2\u009e"+
		"\u009f\7,\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\36\2\2\u00aa<\3\2\2\2\b\2\u0084"+
		"\u0089\u008f\u0097\u00a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}