// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		USE=1, TIPO=2, MAIN=3, DEF=4, IF=5, IFSE=6, ELSE=7, WHILE=8, RETURN=9, 
		SEP_RE=10, SEP_EX=11, AC=12, FC=13, AP=14, FP=15, ID=16, ATR=17, MAISMENOS=18, 
		MAISMAIS=19, MENOSMENOS=20, OP_ARIT=21, NUM=22, WS=23, STR=24, ACOL=25, 
		FCOL=26, OP_REL=27, ERROR=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "USE", "TIPO", "MAIN", "DEF", "IF", "IFSE", "ELSE", 
			"WHILE", "RETURN", "SEP_RE", "SEP_EX", "AC", "FC", "AP", "FP", "ID", 
			"ATR", "MAISMENOS", "MAISMAIS", "MENOSMENOS", "OP_ARIT", "NUM", "WS", 
			"STR", "ACOL", "FCOL", "OP_REL", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", null, "'main'", "'def'", "'if'", "'ifse'", "'else'", "'while'", 
			"'return'", "'::'", "';'", "'{'", "'}'", "'('", "')'", null, "'='", "'+-'", 
			"'++'", "'--'", null, null, null, null, "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "USE", "TIPO", "MAIN", "DEF", "IF", "IFSE", "ELSE", "WHILE", "RETURN", 
			"SEP_RE", "SEP_EX", "AC", "FC", "AP", "FP", "ID", "ATR", "MAISMENOS", 
			"MAISMAIS", "MENOSMENOS", "OP_ARIT", "NUM", "WS", "STR", "ACOL", "FCOL", 
			"OP_REL", "ERROR"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\u0004\u0000\u001c\u00c8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0087\b\u0011\n\u0011\f\u0011\u008a\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0004\u0017\u009a\b\u0017\u000b\u0017\f\u0017\u009b\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u00a0\b\u0017\u000b\u0017\f\u0017\u00a1\u0003\u0017"+
		"\u00a4\b\u0017\u0001\u0018\u0005\u0018\u00a7\b\u0018\n\u0018\f\u0018\u00aa"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u00b2\b\u0019\n\u0019\f\u0019\u00b5\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u00c5\b\u001c\u0001\u001d\u0001\u001d\u0000\u0000"+
		"\u001e\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004"+
		"\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015"+
		"/\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c\u0001\u0000\u0006\u0002"+
		"\u0000AZaz\u0001\u000009\u0004\u0000%%*+--//\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000\"\"\\\\\u0004\u0000\n\n\r\r\"\"\\\\\u00d3\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003"+
		"?\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007Q\u0001"+
		"\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000\u000bX\u0001\u0000\u0000"+
		"\u0000\r\\\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011"+
		"d\u0001\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015o\u0001"+
		"\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019y\u0001\u0000\u0000"+
		"\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f"+
		"\u007f\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0083\u0001"+
		"\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'\u008d\u0001\u0000"+
		"\u0000\u0000)\u0090\u0001\u0000\u0000\u0000+\u0093\u0001\u0000\u0000\u0000"+
		"-\u0096\u0001\u0000\u0000\u0000/\u0099\u0001\u0000\u0000\u00001\u00a8"+
		"\u0001\u0000\u0000\u00003\u00ad\u0001\u0000\u0000\u00005\u00b8\u0001\u0000"+
		"\u0000\u00007\u00ba\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000\u0000"+
		";\u00c6\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000>\u0002\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0001\u0000\u0000@\u0004\u0001\u0000\u0000"+
		"\u0000AB\u0005u\u0000\u0000BC\u0005s\u0000\u0000CD\u0005e\u0000\u0000"+
		"D\u0006\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000FG\u0005n\u0000\u0000"+
		"GR\u0005t\u0000\u0000HI\u0005f\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005"+
		"o\u0000\u0000KL\u0005a\u0000\u0000LR\u0005t\u0000\u0000MN\u0005v\u0000"+
		"\u0000NO\u0005o\u0000\u0000OP\u0005i\u0000\u0000PR\u0005d\u0000\u0000"+
		"QE\u0001\u0000\u0000\u0000QH\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000"+
		"\u0000R\b\u0001\u0000\u0000\u0000ST\u0005m\u0000\u0000TU\u0005a\u0000"+
		"\u0000UV\u0005i\u0000\u0000VW\u0005n\u0000\u0000W\n\u0001\u0000\u0000"+
		"\u0000XY\u0005d\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005f\u0000\u0000"+
		"[\f\u0001\u0000\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005f\u0000\u0000"+
		"^\u000e\u0001\u0000\u0000\u0000_`\u0005i\u0000\u0000`a\u0005f\u0000\u0000"+
		"ab\u0005s\u0000\u0000bc\u0005e\u0000\u0000c\u0010\u0001\u0000\u0000\u0000"+
		"de\u0005e\u0000\u0000ef\u0005l\u0000\u0000fg\u0005s\u0000\u0000gh\u0005"+
		"e\u0000\u0000h\u0012\u0001\u0000\u0000\u0000ij\u0005w\u0000\u0000jk\u0005"+
		"h\u0000\u0000kl\u0005i\u0000\u0000lm\u0005l\u0000\u0000mn\u0005e\u0000"+
		"\u0000n\u0014\u0001\u0000\u0000\u0000op\u0005r\u0000\u0000pq\u0005e\u0000"+
		"\u0000qr\u0005t\u0000\u0000rs\u0005u\u0000\u0000st\u0005r\u0000\u0000"+
		"tu\u0005n\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005:\u0000\u0000"+
		"wx\u0005:\u0000\u0000x\u0018\u0001\u0000\u0000\u0000yz\u0005;\u0000\u0000"+
		"z\u001a\u0001\u0000\u0000\u0000{|\u0005{\u0000\u0000|\u001c\u0001\u0000"+
		"\u0000\u0000}~\u0005}\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005(\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		")\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0088\u0003\u0001"+
		"\u0000\u0000\u0084\u0087\u0003\u0003\u0001\u0000\u0085\u0087\u0003\u0001"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089$\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005=\u0000\u0000"+
		"\u008c&\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000\u0000\u008e\u008f"+
		"\u0005-\u0000\u0000\u008f(\u0001\u0000\u0000\u0000\u0090\u0091\u0005+"+
		"\u0000\u0000\u0091\u0092\u0005+\u0000\u0000\u0092*\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005-\u0000\u0000\u0094\u0095\u0005-\u0000\u0000\u0095,"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0007\u0002\u0000\u0000\u0097.\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0003\u0003\u0001\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u00a3\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0005.\u0000\u0000\u009e\u00a0\u0003\u0003"+
		"\u0001\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a40\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0007\u0003\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\u0018\u0000"+
		"\u0000\u00ac2\u0001\u0000\u0000\u0000\u00ad\u00b3\u0005\"\u0000\u0000"+
		"\u00ae\u00af\u0005\\\u0000\u0000\u00af\u00b2\u0007\u0004\u0000\u0000\u00b0"+
		"\u00b2\b\u0005\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0005\"\u0000\u0000\u00b74\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"[\u0000\u0000\u00b96\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005]\u0000"+
		"\u0000\u00bb8\u0001\u0000\u0000\u0000\u00bc\u00c5\u0005<\u0000\u0000\u00bd"+
		"\u00be\u0005<\u0000\u0000\u00be\u00c5\u0005=\u0000\u0000\u00bf\u00c0\u0005"+
		">\u0000\u0000\u00c0\u00c5\u0005=\u0000\u0000\u00c1\u00c5\u0002=>\u0000"+
		"\u00c2\u00c3\u0005!\u0000\u0000\u00c3\u00c5\u0005=\u0000\u0000\u00c4\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000\u0000\u0000\u00c4\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5:\u0001\u0000\u0000\u0000\u00c6\u00c7\t"+
		"\u0000\u0000\u0000\u00c7<\u0001\u0000\u0000\u0000\u000b\u0000Q\u0086\u0088"+
		"\u009b\u00a1\u00a3\u00a8\u00b1\u00b3\u00c4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}