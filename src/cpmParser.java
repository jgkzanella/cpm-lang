// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class cpmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, USE=3, COMMENT=4, TIPO=5, BOOL=6, DEF=7, MAIN=8, RETURN=9, 
		IF=10, IFSE=11, ELSE=12, WHILE=13, FOR=14, SEP_RE=15, SEP_EX=16, AC=17, 
		FC=18, AP=19, FP=20, ACOL=21, FCOL=22, OP_LOG=23, VARIAVEL=24, ATR=25, 
		MAISMENOS=26, MAISMAIS=27, MENOSMENOS=28, OP_ARIT=29, OP_REL=30, NUM_INT=31, 
		NUM_FLOAT=32, STR=33, WS=34, ERROR=35;
	public static final int
		RULE_programa = 0, RULE_declaracoes_externas = 1, RULE_importar = 2, RULE_retornar = 3, 
		RULE_primitivos = 4, RULE_expressao_aritmetica = 5, RULE_condicao = 6, 
		RULE_expressao_relacional = 7, RULE_expressao_logica = 8, RULE_declaracao_variavel = 9, 
		RULE_bloco = 10, RULE_atribuicao = 11, RULE_declaracao_funcao = 12, RULE_funcao = 13, 
		RULE_declaracao_vetor = 14, RULE_vetor = 15, RULE_tipos_loop = 16, RULE_repeticao_while = 17, 
		RULE_repeticao_for = 18, RULE_condicional_if = 19, RULE_condcional_ifse = 20, 
		RULE_condicional_else = 21, RULE_funcao_principal = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes_externas", "importar", "retornar", "primitivos", 
			"expressao_aritmetica", "condicao", "expressao_relacional", "expressao_logica", 
			"declaracao_variavel", "bloco", "atribuicao", "declaracao_funcao", "funcao", 
			"declaracao_vetor", "vetor", "tipos_loop", "repeticao_while", "repeticao_for", 
			"condicional_if", "condcional_ifse", "condicional_else", "funcao_principal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'()'", "'use'", null, null, null, "'def'", "'main'", "'return'", 
			"'if'", "'ifse'", "'else'", "'while'", "'for'", "'::'", "';'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", null, null, "'='", "'+-'", "'++'", 
			"'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "USE", "COMMENT", "TIPO", "BOOL", "DEF", "MAIN", "RETURN", 
			"IF", "IFSE", "ELSE", "WHILE", "FOR", "SEP_RE", "SEP_EX", "AC", "FC", 
			"AP", "FP", "ACOL", "FCOL", "OP_LOG", "VARIAVEL", "ATR", "MAISMENOS", 
			"MAISMAIS", "MENOSMENOS", "OP_ARIT", "OP_REL", "NUM_INT", "NUM_FLOAT", 
			"STR", "WS", "ERROR"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cpmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Declaracoes_externasContext declaracoes_externas() {
			return getRuleContext(Declaracoes_externasContext.class,0);
		}
		public Funcao_principalContext funcao_principal() {
			return getRuleContext(Funcao_principalContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			declaracoes_externas();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(47);
				funcao_principal();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_externasContext extends ParserRuleContext {
		public List<ImportarContext> importar() {
			return getRuleContexts(ImportarContext.class);
		}
		public ImportarContext importar(int i) {
			return getRuleContext(ImportarContext.class,i);
		}
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public List<Declaracao_funcaoContext> declaracao_funcao() {
			return getRuleContexts(Declaracao_funcaoContext.class);
		}
		public Declaracao_funcaoContext declaracao_funcao(int i) {
			return getRuleContext(Declaracao_funcaoContext.class,i);
		}
		public List<Declaracao_vetorContext> declaracao_vetor() {
			return getRuleContexts(Declaracao_vetorContext.class);
		}
		public Declaracao_vetorContext declaracao_vetor(int i) {
			return getRuleContext(Declaracao_vetorContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public List<Repeticao_whileContext> repeticao_while() {
			return getRuleContexts(Repeticao_whileContext.class);
		}
		public Repeticao_whileContext repeticao_while(int i) {
			return getRuleContext(Repeticao_whileContext.class,i);
		}
		public List<Condicional_ifContext> condicional_if() {
			return getRuleContexts(Condicional_ifContext.class);
		}
		public Condicional_ifContext condicional_if(int i) {
			return getRuleContext(Condicional_ifContext.class,i);
		}
		public List<Condcional_ifseContext> condcional_ifse() {
			return getRuleContexts(Condcional_ifseContext.class);
		}
		public Condcional_ifseContext condcional_ifse(int i) {
			return getRuleContext(Condcional_ifseContext.class,i);
		}
		public List<Condicional_elseContext> condicional_else() {
			return getRuleContexts(Condicional_elseContext.class);
		}
		public Condicional_elseContext condicional_else(int i) {
			return getRuleContext(Condicional_elseContext.class,i);
		}
		public List<Repeticao_forContext> repeticao_for() {
			return getRuleContexts(Repeticao_forContext.class);
		}
		public Repeticao_forContext repeticao_for(int i) {
			return getRuleContext(Repeticao_forContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public Declaracoes_externasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_externas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterDeclaracoes_externas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitDeclaracoes_externas(this);
		}
	}

	public final Declaracoes_externasContext declaracoes_externas() throws RecognitionException {
		Declaracoes_externasContext _localctx = new Declaracoes_externasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes_externas);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(63);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(50);
						importar();
						}
						break;
					case 2:
						{
						setState(51);
						declaracao_variavel();
						}
						break;
					case 3:
						{
						setState(52);
						declaracao_funcao();
						}
						break;
					case 4:
						{
						setState(53);
						declaracao_vetor();
						}
						break;
					case 5:
						{
						setState(54);
						bloco();
						}
						break;
					case 6:
						{
						setState(55);
						funcao();
						}
						break;
					case 7:
						{
						setState(56);
						expressao_aritmetica();
						}
						break;
					case 8:
						{
						setState(57);
						repeticao_while();
						}
						break;
					case 9:
						{
						setState(58);
						condicional_if();
						}
						break;
					case 10:
						{
						setState(59);
						condcional_ifse();
						}
						break;
					case 11:
						{
						setState(60);
						condicional_else();
						}
						break;
					case 12:
						{
						setState(61);
						repeticao_for();
						}
						break;
					case 13:
						{
						setState(62);
						atribuicao();
						}
						break;
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportarContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(cpmParser.USE, 0); }
		public TerminalNode STR() { return getToken(cpmParser.STR, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public ImportarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterImportar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitImportar(this);
		}
	}

	public final ImportarContext importar() throws RecognitionException {
		ImportarContext _localctx = new ImportarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(USE);
			setState(69);
			match(STR);
			setState(70);
			match(SEP_EX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(cpmParser.RETURN, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitRetornar(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(RETURN);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
				{
				setState(73);
				primitivos();
				}
				break;
			case VARIAVEL:
				{
				setState(74);
				match(VARIAVEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			match(SEP_EX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitivosContext extends ParserRuleContext {
		public TerminalNode NUM_FLOAT() { return getToken(cpmParser.NUM_FLOAT, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public TerminalNode STR() { return getToken(cpmParser.STR, 0); }
		public PrimitivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterPrimitivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitPrimitivos(this);
		}
	}

	public final PrimitivosContext primitivos() throws RecognitionException {
		PrimitivosContext _localctx = new PrimitivosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitivos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode OP_ARIT() { return getToken(cpmParser.OP_ARIT, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public List<PrimitivosContext> primitivos() {
			return getRuleContexts(PrimitivosContext.class);
		}
		public PrimitivosContext primitivos(int i) {
			return getRuleContext(PrimitivosContext.class,i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode MAISMAIS() { return getToken(cpmParser.MAISMAIS, 0); }
		public TerminalNode MAISMENOS() { return getToken(cpmParser.MAISMENOS, 0); }
		public TerminalNode MENOSMENOS() { return getToken(cpmParser.MENOSMENOS, 0); }
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterExpressao_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitExpressao_aritmetica(this);
		}
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressao_aritmetica);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(AP);
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
				case NUM_FLOAT:
				case STR:
					{
					setState(82);
					primitivos();
					}
					break;
				case VARIAVEL:
					{
					setState(83);
					match(VARIAVEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86);
				match(OP_ARIT);
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(87);
					expressao_aritmetica();
					}
					break;
				case 2:
					{
					setState(88);
					primitivos();
					}
					break;
				case 3:
					{
					setState(89);
					match(VARIAVEL);
					}
					break;
				}
				setState(92);
				match(FP);
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(93);
					expressao_aritmetica();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
				case NUM_FLOAT:
				case STR:
					{
					setState(96);
					primitivos();
					}
					break;
				case VARIAVEL:
					{
					setState(97);
					match(VARIAVEL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100);
				match(OP_ARIT);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(101);
					expressao_aritmetica();
					}
					break;
				case 2:
					{
					setState(102);
					primitivos();
					}
					break;
				case 3:
					{
					setState(103);
					match(VARIAVEL);
					}
					break;
				}
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(106);
					expressao_aritmetica();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(VARIAVEL);
				setState(110);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(SEP_EX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public List<Tipos_loopContext> tipos_loop() {
			return getRuleContexts(Tipos_loopContext.class);
		}
		public Tipos_loopContext tipos_loop(int i) {
			return getRuleContext(Tipos_loopContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(cpmParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(cpmParser.OP_REL, i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(cpmParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(cpmParser.OP_LOG, i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicao);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(AP);
				{
				setState(115);
				tipos_loop();
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==OP_LOG || _la==OP_REL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				tipos_loop();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_LOG) {
					{
					{
					setState(118);
					match(OP_LOG);
					setState(119);
					tipos_loop();
					setState(120);
					_la = _input.LA(1);
					if ( !(_la==OP_LOG || _la==OP_REL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(121);
					tipos_loop();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(128);
				match(FP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(130);
				tipos_loop();
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==OP_LOG || _la==OP_REL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				tipos_loop();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_LOG) {
					{
					{
					setState(133);
					match(OP_LOG);
					setState(134);
					tipos_loop();
					setState(135);
					_la = _input.LA(1);
					if ( !(_la==OP_LOG || _la==OP_REL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(136);
					tipos_loop();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode OP_REL() { return getToken(cpmParser.OP_REL, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public List<TerminalNode> BOOL() { return getTokens(cpmParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(cpmParser.BOOL, i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterExpressao_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitExpressao_relacional(this);
		}
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao_relacional);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(AP);
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
					{
					setState(146);
					match(BOOL);
					}
					break;
				case VARIAVEL:
					{
					setState(147);
					match(VARIAVEL);
					}
					break;
				case NUM_INT:
				case NUM_FLOAT:
				case STR:
					{
					setState(148);
					primitivos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151);
				match(OP_REL);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(152);
					expressao_relacional();
					}
					break;
				case 2:
					{
					setState(153);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(154);
					match(VARIAVEL);
					}
					break;
				}
				setState(157);
				match(FP);
				}
				break;
			case BOOL:
			case VARIAVEL:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
					{
					setState(158);
					match(BOOL);
					}
					break;
				case VARIAVEL:
					{
					setState(159);
					match(VARIAVEL);
					}
					break;
				case NUM_INT:
				case NUM_FLOAT:
				case STR:
					{
					setState(160);
					primitivos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163);
				match(OP_REL);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(164);
					expressao_relacional();
					}
					break;
				case 2:
					{
					setState(165);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(166);
					match(VARIAVEL);
					}
					break;
				}
				}
				break;
			case SEP_EX:
			case AC:
			case FP:
			case OP_LOG:
			case OP_REL:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_logicaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode OP_LOG() { return getToken(cpmParser.OP_LOG, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public List<TerminalNode> BOOL() { return getTokens(cpmParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(cpmParser.BOOL, i);
		}
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterExpressao_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitExpressao_logica(this);
		}
	}

	public final Expressao_logicaContext expressao_logica() throws RecognitionException {
		Expressao_logicaContext _localctx = new Expressao_logicaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressao_logica);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(AP);
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==BOOL || _la==VARIAVEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				match(OP_LOG);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(175);
					expressao_logica();
					}
					break;
				case 2:
					{
					setState(176);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(177);
					match(VARIAVEL);
					}
					break;
				}
				setState(180);
				match(FP);
				}
				break;
			case BOOL:
			case VARIAVEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==BOOL || _la==VARIAVEL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(OP_LOG);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(183);
					expressao_logica();
					}
					break;
				case 2:
					{
					setState(184);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(185);
					match(VARIAVEL);
					}
					break;
				}
				}
				break;
			case SEP_EX:
			case AC:
			case FP:
			case OP_LOG:
			case OP_REL:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(cpmParser.TIPO, 0); }
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterDeclaracao_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitDeclaracao_variavel(this);
		}
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(TIPO);
			setState(192);
			match(VARIAVEL);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATR) {
				{
				setState(193);
				match(ATR);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(194);
					primitivos();
					}
					break;
				case 2:
					{
					setState(195);
					expressao_aritmetica();
					}
					break;
				case 3:
					{
					setState(196);
					funcao();
					}
					break;
				}
				}
			}

			setState(201);
			match(SEP_EX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(cpmParser.AC, 0); }
		public TerminalNode FC() { return getToken(cpmParser.FC, 0); }
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public List<ImportarContext> importar() {
			return getRuleContexts(ImportarContext.class);
		}
		public ImportarContext importar(int i) {
			return getRuleContext(ImportarContext.class,i);
		}
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<Declaracao_funcaoContext> declaracao_funcao() {
			return getRuleContexts(Declaracao_funcaoContext.class);
		}
		public Declaracao_funcaoContext declaracao_funcao(int i) {
			return getRuleContext(Declaracao_funcaoContext.class,i);
		}
		public List<Repeticao_whileContext> repeticao_while() {
			return getRuleContexts(Repeticao_whileContext.class);
		}
		public Repeticao_whileContext repeticao_while(int i) {
			return getRuleContext(Repeticao_whileContext.class,i);
		}
		public List<Condicional_ifContext> condicional_if() {
			return getRuleContexts(Condicional_ifContext.class);
		}
		public Condicional_ifContext condicional_if(int i) {
			return getRuleContext(Condicional_ifContext.class,i);
		}
		public List<Condcional_ifseContext> condcional_ifse() {
			return getRuleContexts(Condcional_ifseContext.class);
		}
		public Condcional_ifseContext condcional_ifse(int i) {
			return getRuleContext(Condcional_ifseContext.class,i);
		}
		public List<Condicional_elseContext> condicional_else() {
			return getRuleContexts(Condicional_elseContext.class);
		}
		public Condicional_elseContext condicional_else(int i) {
			return getRuleContext(Condicional_elseContext.class,i);
		}
		public List<RetornarContext> retornar() {
			return getRuleContexts(RetornarContext.class);
		}
		public RetornarContext retornar(int i) {
			return getRuleContext(RetornarContext.class,i);
		}
		public List<Declaracao_vetorContext> declaracao_vetor() {
			return getRuleContexts(Declaracao_vetorContext.class);
		}
		public Declaracao_vetorContext declaracao_vetor(int i) {
			return getRuleContext(Declaracao_vetorContext.class,i);
		}
		public List<Repeticao_forContext> repeticao_for() {
			return getRuleContexts(Repeticao_forContext.class);
		}
		public Repeticao_forContext repeticao_for(int i) {
			return getRuleContext(Repeticao_forContext.class,i);
		}
		public List<VetorContext> vetor() {
			return getRuleContexts(VetorContext.class);
		}
		public VetorContext vetor(int i) {
			return getRuleContext(VetorContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(AC);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 15049719464L) != 0) {
				{
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(204);
					declaracao_variavel();
					}
					break;
				case 2:
					{
					setState(205);
					importar();
					}
					break;
				case 3:
					{
					setState(206);
					expressao_aritmetica();
					}
					break;
				case 4:
					{
					setState(207);
					funcao();
					}
					break;
				case 5:
					{
					setState(208);
					declaracao_funcao();
					}
					break;
				case 6:
					{
					setState(209);
					repeticao_while();
					}
					break;
				case 7:
					{
					setState(210);
					condicional_if();
					}
					break;
				case 8:
					{
					setState(211);
					condcional_ifse();
					}
					break;
				case 9:
					{
					setState(212);
					condicional_else();
					}
					break;
				case 10:
					{
					setState(213);
					retornar();
					}
					break;
				case 11:
					{
					setState(214);
					declaracao_vetor();
					}
					break;
				case 12:
					{
					setState(215);
					repeticao_for();
					}
					break;
				case 13:
					{
					setState(216);
					vetor();
					}
					break;
				case 14:
					{
					setState(217);
					atribuicao();
					}
					break;
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(VARIAVEL);
			setState(226);
			match(ATR);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(227);
				primitivos();
				}
				break;
			case 2:
				{
				setState(228);
				expressao_aritmetica();
				}
				break;
			case 3:
				{
				setState(229);
				funcao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(cpmParser.DEF, 0); }
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public TerminalNode SEP_RE() { return getToken(cpmParser.SEP_RE, 0); }
		public List<TerminalNode> TIPO() { return getTokens(cpmParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(cpmParser.TIPO, i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Declaracao_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterDeclaracao_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitDeclaracao_funcao(this);
		}
	}

	public final Declaracao_funcaoContext declaracao_funcao() throws RecognitionException {
		Declaracao_funcaoContext _localctx = new Declaracao_funcaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao_funcao);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(DEF);
				setState(233);
				match(VARIAVEL);
				setState(234);
				match(AP);
				{
				setState(235);
				match(TIPO);
				setState(236);
				match(VARIAVEL);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(237);
					match(T__0);
					setState(238);
					match(TIPO);
					setState(239);
					match(VARIAVEL);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(245);
				match(FP);
				setState(246);
				match(SEP_RE);
				setState(247);
				match(TIPO);
				setState(248);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(DEF);
				setState(250);
				match(VARIAVEL);
				setState(251);
				match(T__1);
				setState(252);
				match(SEP_RE);
				setState(253);
				match(TIPO);
				setState(254);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(VARIAVEL);
			setState(258);
			match(AP);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(259);
				primitivos();
				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				setState(261);
				vetor();
				}
				break;
			case 4:
				{
				setState(262);
				match(VARIAVEL);
				}
				break;
			case 5:
				{
				setState(263);
				expressao_aritmetica();
				}
				break;
			case 6:
				{
				setState(264);
				expressao_logica();
				}
				break;
			case 7:
				{
				setState(265);
				expressao_relacional();
				}
				break;
			}
			setState(268);
			match(FP);
			setState(269);
			match(SEP_EX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_vetorContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(cpmParser.TIPO, 0); }
		public TerminalNode ACOL() { return getToken(cpmParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(cpmParser.FCOL, 0); }
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public Declaracao_vetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterDeclaracao_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitDeclaracao_vetor(this);
		}
	}

	public final Declaracao_vetorContext declaracao_vetor() throws RecognitionException {
		Declaracao_vetorContext _localctx = new Declaracao_vetorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracao_vetor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TIPO);
			setState(272);
			match(ACOL);
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==VARIAVEL || _la==NUM_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			match(FCOL);
			setState(275);
			match(VARIAVEL);
			setState(276);
			match(SEP_EX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VetorContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public TerminalNode ACOL() { return getToken(cpmParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(cpmParser.FCOL, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public VetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitVetor(this);
		}
	}

	public final VetorContext vetor() throws RecognitionException {
		VetorContext _localctx = new VetorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vetor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(VARIAVEL);
			setState(279);
			match(ACOL);
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==VARIAVEL || _la==NUM_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(281);
			match(FCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipos_loopContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public PrimitivosContext primitivos() {
			return getRuleContext(PrimitivosContext.class,0);
		}
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Tipos_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTipos_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTipos_loop(this);
		}
	}

	public final Tipos_loopContext tipos_loop() throws RecognitionException {
		Tipos_loopContext _localctx = new Tipos_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipos_loop);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(VARIAVEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				primitivos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				expressao_aritmetica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				expressao_logica();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				expressao_relacional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeticao_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(cpmParser.WHILE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Repeticao_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterRepeticao_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitRepeticao_while(this);
		}
	}

	public final Repeticao_whileContext repeticao_while() throws RecognitionException {
		Repeticao_whileContext _localctx = new Repeticao_whileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repeticao_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(WHILE);
			setState(292);
			condicao();
			setState(293);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeticao_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(cpmParser.FOR, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public TerminalNode MAISMAIS() { return getToken(cpmParser.MAISMAIS, 0); }
		public TerminalNode MAISMENOS() { return getToken(cpmParser.MAISMENOS, 0); }
		public TerminalNode MENOSMENOS() { return getToken(cpmParser.MENOSMENOS, 0); }
		public Repeticao_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterRepeticao_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitRepeticao_for(this);
		}
	}

	public final Repeticao_forContext repeticao_for() throws RecognitionException {
		Repeticao_forContext _localctx = new Repeticao_forContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_repeticao_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(FOR);
			setState(296);
			match(AP);
			setState(297);
			declaracao_variavel();
			setState(298);
			condicao();
			setState(299);
			match(SEP_EX);
			{
			setState(300);
			match(VARIAVEL);
			setState(301);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(303);
			match(FP);
			setState(304);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condicional_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cpmParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Condicional_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterCondicional_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitCondicional_if(this);
		}
	}

	public final Condicional_ifContext condicional_if() throws RecognitionException {
		Condicional_ifContext _localctx = new Condicional_ifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicional_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IF);
			setState(307);
			condicao();
			setState(308);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condcional_ifseContext extends ParserRuleContext {
		public TerminalNode IFSE() { return getToken(cpmParser.IFSE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Condcional_ifseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condcional_ifse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterCondcional_ifse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitCondcional_ifse(this);
		}
	}

	public final Condcional_ifseContext condcional_ifse() throws RecognitionException {
		Condcional_ifseContext _localctx = new Condcional_ifseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condcional_ifse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IFSE);
			setState(311);
			condicao();
			setState(312);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condicional_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(cpmParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Condicional_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterCondicional_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitCondicional_else(this);
		}
	}

	public final Condicional_elseContext condicional_else() throws RecognitionException {
		Condicional_elseContext _localctx = new Condicional_elseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicional_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ELSE);
			setState(315);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcao_principalContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(cpmParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(cpmParser.MAIN, 0); }
		public TerminalNode SEP_RE() { return getToken(cpmParser.SEP_RE, 0); }
		public TerminalNode TIPO() { return getToken(cpmParser.TIPO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Funcao_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterFuncao_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitFuncao_principal(this);
		}
	}

	public final Funcao_principalContext funcao_principal() throws RecognitionException {
		Funcao_principalContext _localctx = new Funcao_principalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcao_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(DEF);
			setState(318);
			match(MAIN);
			setState(319);
			match(T__1);
			setState(320);
			match(SEP_RE);
			setState(321);
			match(TIPO);
			setState(322);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"i\b\u0005\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006|\b\u0006\n\u0006\f\u0006\u007f\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u008b\b\u0006\n\u0006\f\u0006\u008e"+
		"\t\u0006\u0003\u0006\u0090\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0096\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u009c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a8\b\u0007\u0001\u0007\u0003\u0007\u00ab\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b3\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bb\b\b\u0001"+
		"\b\u0003\b\u00be\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c6\b\t\u0003\t\u00c8\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00db\b\n\n\n\f\n\u00de\t\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00f1\b\f\n\f\f\f\u00f4\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0100"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u010b\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0122\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0005\u0001\u0000\u001f!\u0001\u0000\u001a\u001c\u0002"+
		"\u0000\u0017\u0017\u001e\u001e\u0002\u0000\u0006\u0006\u0018\u0018\u0002"+
		"\u0000\u0018\u0018\u001f\u001f\u0179\u0000.\u0001\u0000\u0000\u0000\u0002"+
		"A\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006H\u0001"+
		"\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\np\u0001\u0000\u0000\u0000"+
		"\f\u008f\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010"+
		"\u00bd\u0001\u0000\u0000\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014"+
		"\u00cb\u0001\u0000\u0000\u0000\u0016\u00e1\u0001\u0000\u0000\u0000\u0018"+
		"\u00ff\u0001\u0000\u0000\u0000\u001a\u0101\u0001\u0000\u0000\u0000\u001c"+
		"\u010f\u0001\u0000\u0000\u0000\u001e\u0116\u0001\u0000\u0000\u0000 \u0121"+
		"\u0001\u0000\u0000\u0000\"\u0123\u0001\u0000\u0000\u0000$\u0127\u0001"+
		"\u0000\u0000\u0000&\u0132\u0001\u0000\u0000\u0000(\u0136\u0001\u0000\u0000"+
		"\u0000*\u013a\u0001\u0000\u0000\u0000,\u013d\u0001\u0000\u0000\u0000."+
		"0\u0003\u0002\u0001\u0000/1\u0003,\u0016\u00000/\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000\u00002@\u0003\u0004"+
		"\u0002\u00003@\u0003\u0012\t\u00004@\u0003\u0018\f\u00005@\u0003\u001c"+
		"\u000e\u00006@\u0003\u0014\n\u00007@\u0003\u001a\r\u00008@\u0003\n\u0005"+
		"\u00009@\u0003\"\u0011\u0000:@\u0003&\u0013\u0000;@\u0003(\u0014\u0000"+
		"<@\u0003*\u0015\u0000=@\u0003$\u0012\u0000>@\u0003\u0016\u000b\u0000?"+
		"2\u0001\u0000\u0000\u0000?3\u0001\u0000\u0000\u0000?4\u0001\u0000\u0000"+
		"\u0000?5\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000?7\u0001\u0000"+
		"\u0000\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001"+
		"\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0003\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0003\u0000\u0000"+
		"EF\u0005!\u0000\u0000FG\u0005\u0010\u0000\u0000G\u0005\u0001\u0000\u0000"+
		"\u0000HK\u0005\t\u0000\u0000IL\u0003\b\u0004\u0000JL\u0005\u0018\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0005\u0010\u0000\u0000N\u0007\u0001\u0000\u0000\u0000"+
		"OP\u0007\u0000\u0000\u0000P\t\u0001\u0000\u0000\u0000QT\u0005\u0013\u0000"+
		"\u0000RU\u0003\b\u0004\u0000SU\u0005\u0018\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VZ\u0005\u001d"+
		"\u0000\u0000W[\u0003\n\u0005\u0000X[\u0003\b\u0004\u0000Y[\u0005\u0018"+
		"\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005\u0014\u0000\u0000"+
		"]_\u0003\n\u0005\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_q\u0001\u0000\u0000\u0000`c\u0003\b\u0004\u0000ac\u0005\u0018\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000dh\u0005\u001d\u0000\u0000ei\u0003\n\u0005\u0000fi\u0003\b\u0004"+
		"\u0000gi\u0005\u0018\u0000\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hg\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u0003"+
		"\n\u0005\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lq\u0001"+
		"\u0000\u0000\u0000mn\u0005\u0018\u0000\u0000no\u0007\u0001\u0000\u0000"+
		"oq\u0005\u0010\u0000\u0000pQ\u0001\u0000\u0000\u0000pb\u0001\u0000\u0000"+
		"\u0000pm\u0001\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0013\u0000\u0000st\u0003 \u0010\u0000tu\u0007\u0002\u0000\u0000u}\u0003"+
		" \u0010\u0000vw\u0005\u0017\u0000\u0000wx\u0003 \u0010\u0000xy\u0007\u0002"+
		"\u0000\u0000yz\u0003 \u0010\u0000z|\u0001\u0000\u0000\u0000{v\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0090\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0003 \u0010\u0000\u0083\u0084\u0007\u0002"+
		"\u0000\u0000\u0084\u008c\u0003 \u0010\u0000\u0085\u0086\u0005\u0017\u0000"+
		"\u0000\u0086\u0087\u0003 \u0010\u0000\u0087\u0088\u0007\u0002\u0000\u0000"+
		"\u0088\u0089\u0003 \u0010\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0085\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"r\u0001\u0000\u0000\u0000\u008f\u0082\u0001\u0000\u0000\u0000\u0090\r"+
		"\u0001\u0000\u0000\u0000\u0091\u0095\u0005\u0013\u0000\u0000\u0092\u0096"+
		"\u0005\u0006\u0000\u0000\u0093\u0096\u0005\u0018\u0000\u0000\u0094\u0096"+
		"\u0003\b\u0004\u0000\u0095\u0092\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u009b\u0005\u001e\u0000\u0000\u0098\u009c\u0003"+
		"\u000e\u0007\u0000\u0099\u009c\u0005\u0006\u0000\u0000\u009a\u009c\u0005"+
		"\u0018\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u00ab\u0005\u0014\u0000\u0000\u009e\u00a2\u0005"+
		"\u0006\u0000\u0000\u009f\u00a2\u0005\u0018\u0000\u0000\u00a0\u00a2\u0003"+
		"\b\u0004\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a7\u0005\u001e\u0000\u0000\u00a4\u00a8\u0003\u000e"+
		"\u0007\u0000\u00a5\u00a8\u0005\u0006\u0000\u0000\u00a6\u00a8\u0005\u0018"+
		"\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u0091\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013"+
		"\u0000\u0000\u00ad\u00ae\u0007\u0003\u0000\u0000\u00ae\u00b2\u0005\u0017"+
		"\u0000\u0000\u00af\u00b3\u0003\u0010\b\u0000\u00b0\u00b3\u0005\u0006\u0000"+
		"\u0000\u00b1\u00b3\u0005\u0018\u0000\u0000\u00b2\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00be\u0005\u0014\u0000"+
		"\u0000\u00b5\u00b6\u0007\u0003\u0000\u0000\u00b6\u00ba\u0005\u0017\u0000"+
		"\u0000\u00b7\u00bb\u0003\u0010\b\u0000\u00b8\u00bb\u0005\u0006\u0000\u0000"+
		"\u00b9\u00bb\u0005\u0018\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000"+
		"\u00bd\u00ac\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u0011\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c7\u0005\u0018\u0000\u0000"+
		"\u00c1\u00c5\u0005\u0019\u0000\u0000\u00c2\u00c6\u0003\b\u0004\u0000\u00c3"+
		"\u00c6\u0003\n\u0005\u0000\u00c4\u00c6\u0003\u001a\r\u0000\u00c5\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca\u0013"+
		"\u0001\u0000\u0000\u0000\u00cb\u00dc\u0005\u0011\u0000\u0000\u00cc\u00db"+
		"\u0003\u0012\t\u0000\u00cd\u00db\u0003\u0004\u0002\u0000\u00ce\u00db\u0003"+
		"\n\u0005\u0000\u00cf\u00db\u0003\u001a\r\u0000\u00d0\u00db\u0003\u0018"+
		"\f\u0000\u00d1\u00db\u0003\"\u0011\u0000\u00d2\u00db\u0003&\u0013\u0000"+
		"\u00d3\u00db\u0003(\u0014\u0000\u00d4\u00db\u0003*\u0015\u0000\u00d5\u00db"+
		"\u0003\u0006\u0003\u0000\u00d6\u00db\u0003\u001c\u000e\u0000\u00d7\u00db"+
		"\u0003$\u0012\u0000\u00d8\u00db\u0003\u001e\u000f\u0000\u00d9\u00db\u0003"+
		"\u0016\u000b\u0000\u00da\u00cc\u0001\u0000\u0000\u0000\u00da\u00cd\u0001"+
		"\u0000\u0000\u0000\u00da\u00ce\u0001\u0000\u0000\u0000\u00da\u00cf\u0001"+
		"\u0000\u0000\u0000\u00da\u00d0\u0001\u0000\u0000\u0000\u00da\u00d1\u0001"+
		"\u0000\u0000\u0000\u00da\u00d2\u0001\u0000\u0000\u0000\u00da\u00d3\u0001"+
		"\u0000\u0000\u0000\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d5\u0001"+
		"\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u0012\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u0018\u0000\u0000\u00e2\u00e6\u0005\u0019\u0000\u0000\u00e3\u00e7\u0003"+
		"\b\u0004\u0000\u00e4\u00e7\u0003\n\u0005\u0000\u00e5\u00e7\u0003\u001a"+
		"\r\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0017\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0007\u0000\u0000\u00e9\u00ea\u0005\u0018\u0000"+
		"\u0000\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb\u00ec\u0005\u0005\u0000"+
		"\u0000\u00ec\u00f2\u0005\u0018\u0000\u0000\u00ed\u00ee\u0005\u0001\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f1\u0005\u0018\u0000"+
		"\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0014\u0000\u0000\u00f6\u00f7\u0005\u000f\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8\u0100\u0003\u0014\n\u0000"+
		"\u00f9\u00fa\u0005\u0007\u0000\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u0005\u000f\u0000\u0000"+
		"\u00fd\u00fe\u0005\u0005\u0000\u0000\u00fe\u0100\u0003\u0014\n\u0000\u00ff"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ff\u00f9\u0001\u0000\u0000\u0000\u0100"+
		"\u0019\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0018\u0000\u0000\u0102"+
		"\u010a\u0005\u0013\u0000\u0000\u0103\u010b\u0003\b\u0004\u0000\u0104\u010b"+
		"\u0001\u0000\u0000\u0000\u0105\u010b\u0003\u001e\u000f\u0000\u0106\u010b"+
		"\u0005\u0018\u0000\u0000\u0107\u010b\u0003\n\u0005\u0000\u0108\u010b\u0003"+
		"\u0010\b\u0000\u0109\u010b\u0003\u000e\u0007\u0000\u010a\u0103\u0001\u0000"+
		"\u0000\u0000\u010a\u0104\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000"+
		"\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0014"+
		"\u0000\u0000\u010d\u010e\u0005\u0010\u0000\u0000\u010e\u001b\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0005\u0005\u0000\u0000\u0110\u0111\u0005\u0015"+
		"\u0000\u0000\u0111\u0112\u0007\u0004\u0000\u0000\u0112\u0113\u0005\u0016"+
		"\u0000\u0000\u0113\u0114\u0005\u0018\u0000\u0000\u0114\u0115\u0005\u0010"+
		"\u0000\u0000\u0115\u001d\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0018"+
		"\u0000\u0000\u0117\u0118\u0005\u0015\u0000\u0000\u0118\u0119\u0007\u0004"+
		"\u0000\u0000\u0119\u011a\u0005\u0016\u0000\u0000\u011a\u001f\u0001\u0000"+
		"\u0000\u0000\u011b\u0122\u0005\u0018\u0000\u0000\u011c\u0122\u0003\b\u0004"+
		"\u0000\u011d\u0122\u0003\n\u0005\u0000\u011e\u0122\u0005\u0006\u0000\u0000"+
		"\u011f\u0122\u0003\u0010\b\u0000\u0120\u0122\u0003\u000e\u0007\u0000\u0121"+
		"\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121"+
		"\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"+
		"!\u0001\u0000\u0000\u0000\u0123\u0124\u0005\r\u0000\u0000\u0124\u0125"+
		"\u0003\f\u0006\u0000\u0125\u0126\u0003\u0014\n\u0000\u0126#\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u000e\u0000\u0000\u0128\u0129\u0005\u0013"+
		"\u0000\u0000\u0129\u012a\u0003\u0012\t\u0000\u012a\u012b\u0003\f\u0006"+
		"\u0000\u012b\u012c\u0005\u0010\u0000\u0000\u012c\u012d\u0005\u0018\u0000"+
		"\u0000\u012d\u012e\u0007\u0001\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005\u0014\u0000\u0000\u0130\u0131\u0003\u0014\n\u0000"+
		"\u0131%\u0001\u0000\u0000\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133"+
		"\u0134\u0003\f\u0006\u0000\u0134\u0135\u0003\u0014\n\u0000\u0135\'\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u000b\u0000\u0000\u0137\u0138\u0003"+
		"\f\u0006\u0000\u0138\u0139\u0003\u0014\n\u0000\u0139)\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005\f\u0000\u0000\u013b\u013c\u0003\u0014\n\u0000"+
		"\u013c+\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0007\u0000\u0000\u013e"+
		"\u013f\u0005\b\u0000\u0000\u013f\u0140\u0005\u0002\u0000\u0000\u0140\u0141"+
		"\u0005\u000f\u0000\u0000\u0141\u0142\u0005\u0005\u0000\u0000\u0142\u0143"+
		"\u0003\u0014\n\u0000\u0143-\u0001\u0000\u0000\u0000\u001f0?AKTZ^bhkp}"+
		"\u008c\u008f\u0095\u009b\u00a1\u00a7\u00aa\u00b2\u00ba\u00bd\u00c5\u00c7"+
		"\u00da\u00dc\u00e6\u00f2\u00ff\u010a\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}