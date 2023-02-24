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
		FC=18, AP=19, FP=20, ACOL=21, FCOL=22, OP_LOG=23, ATR=24, MAISMENOS=25, 
		MAISMAIS=26, MENOSMENOS=27, OP_ARIT=28, OP_REL=29, NUM_INT=30, NUM_FLOAT=31, 
		STR=32, ID=33, WS=34, ERROR=35;
	public static final int
		RULE_programa = 0, RULE_funcao_principal = 1, RULE_global = 2, RULE_bloco = 3, 
		RULE_tipos_primitivos = 4, RULE_tipos_atribuicao = 5, RULE_parametro = 6, 
		RULE_indice = 7, RULE_termo_aritmetico = 8, RULE_fator_aritmetico = 9, 
		RULE_termo_logico = 10, RULE_fator_logico = 11, RULE_termo_relacional = 12, 
		RULE_fator_relacional = 13, RULE_expressao = 14, RULE_expressao_aritmetica = 15, 
		RULE_expressao_logica = 16, RULE_expressao_relacional = 17, RULE_declaracao = 18, 
		RULE_declaracao_variavel = 19, RULE_declaracao_vetor = 20, RULE_declaracao_funcao = 21, 
		RULE_repeticao = 22, RULE_repeticao_while = 23, RULE_repeticao_for = 24, 
		RULE_condicional = 25, RULE_condicional_if = 26, RULE_condcional_ifse = 27, 
		RULE_condicional_else = 28, RULE_chamada = 29, RULE_chamada_funcao = 30, 
		RULE_chamada_atribuicao = 31, RULE_importar = 32, RULE_vetor = 33, RULE_funcao = 34, 
		RULE_retornar = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcao_principal", "global", "bloco", "tipos_primitivos", 
			"tipos_atribuicao", "parametro", "indice", "termo_aritmetico", "fator_aritmetico", 
			"termo_logico", "fator_logico", "termo_relacional", "fator_relacional", 
			"expressao", "expressao_aritmetica", "expressao_logica", "expressao_relacional", 
			"declaracao", "declaracao_variavel", "declaracao_vetor", "declaracao_funcao", 
			"repeticao", "repeticao_while", "repeticao_for", "condicional", "condicional_if", 
			"condcional_ifse", "condicional_else", "chamada", "chamada_funcao", "chamada_atribuicao", 
			"importar", "vetor", "funcao", "retornar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'()'", "','", "'use'", null, null, null, "'def'", "'main'", "'return'", 
			"'if'", "'ifse'", "'else'", "'while'", "'for'", "'::'", "';'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", null, "'='", "'+-'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "USE", "COMMENT", "TIPO", "BOOL", "DEF", "MAIN", "RETURN", 
			"IF", "IFSE", "ELSE", "WHILE", "FOR", "SEP_RE", "SEP_EX", "AC", "FC", 
			"AP", "FP", "ACOL", "FCOL", "OP_LOG", "ATR", "MAISMENOS", "MAISMAIS", 
			"MENOSMENOS", "OP_ARIT", "OP_REL", "NUM_INT", "NUM_FLOAT", "STR", "ID", 
			"WS", "ERROR"
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
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
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
			setState(72);
			global();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(73);
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
		enterRule(_localctx, 2, RULE_funcao_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(DEF);
			setState(77);
			match(MAIN);
			setState(78);
			match(T__0);
			setState(79);
			match(SEP_RE);
			setState(80);
			match(TIPO);
			setState(81);
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
	public static class GlobalContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> SEP_EX() { return getTokens(cpmParser.SEP_EX); }
		public TerminalNode SEP_EX(int i) {
			return getToken(cpmParser.SEP_EX, i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<RepeticaoContext> repeticao() {
			return getRuleContexts(RepeticaoContext.class);
		}
		public RepeticaoContext repeticao(int i) {
			return getRuleContext(RepeticaoContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<ChamadaContext> chamada() {
			return getRuleContexts(ChamadaContext.class);
		}
		public ChamadaContext chamada(int i) {
			return getRuleContext(ChamadaContext.class,i);
		}
		public List<ImportarContext> importar() {
			return getRuleContexts(ImportarContext.class);
		}
		public ImportarContext importar(int i) {
			return getRuleContext(ImportarContext.class,i);
		}
		public List<RetornarContext> retornar() {
			return getRuleContexts(RetornarContext.class);
		}
		public RetornarContext retornar(int i) {
			return getRuleContext(RetornarContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(83);
						bloco();
						}
						break;
					case 2:
						{
						setState(84);
						expressao();
						setState(85);
						match(SEP_EX);
						}
						break;
					case 3:
						{
						setState(87);
						declaracao();
						}
						break;
					case 4:
						{
						setState(88);
						repeticao();
						}
						break;
					case 5:
						{
						setState(89);
						condicional();
						}
						break;
					case 6:
						{
						setState(90);
						chamada();
						setState(91);
						match(SEP_EX);
						}
						break;
					case 7:
						{
						setState(93);
						importar();
						setState(94);
						match(SEP_EX);
						}
						break;
					case 8:
						{
						setState(96);
						retornar();
						setState(97);
						match(SEP_EX);
						}
						break;
					}
					} 
				}
				setState(103);
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
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(cpmParser.AC, 0); }
		public TerminalNode FC() { return getToken(cpmParser.FC, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<VetorContext> vetor() {
			return getRuleContexts(VetorContext.class);
		}
		public VetorContext vetor(int i) {
			return getRuleContext(VetorContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> SEP_EX() { return getTokens(cpmParser.SEP_EX); }
		public TerminalNode SEP_EX(int i) {
			return getToken(cpmParser.SEP_EX, i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<RepeticaoContext> repeticao() {
			return getRuleContexts(RepeticaoContext.class);
		}
		public RepeticaoContext repeticao(int i) {
			return getRuleContext(RepeticaoContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<ChamadaContext> chamada() {
			return getRuleContexts(ChamadaContext.class);
		}
		public ChamadaContext chamada(int i) {
			return getRuleContext(ChamadaContext.class,i);
		}
		public List<ImportarContext> importar() {
			return getRuleContexts(ImportarContext.class);
		}
		public ImportarContext importar(int i) {
			return getRuleContext(ImportarContext.class,i);
		}
		public List<RetornarContext> retornar() {
			return getRuleContexts(RetornarContext.class);
		}
		public RetornarContext retornar(int i) {
			return getRuleContext(RetornarContext.class,i);
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
		enterRule(_localctx, 6, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(AC);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106815208L) != 0) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(105);
					bloco();
					}
					break;
				case 2:
					{
					setState(106);
					vetor();
					}
					break;
				case 3:
					{
					setState(107);
					funcao();
					}
					break;
				case 4:
					{
					setState(108);
					expressao();
					setState(109);
					match(SEP_EX);
					}
					break;
				case 5:
					{
					setState(111);
					declaracao();
					}
					break;
				case 6:
					{
					setState(112);
					repeticao();
					}
					break;
				case 7:
					{
					setState(113);
					condicional();
					}
					break;
				case 8:
					{
					setState(114);
					chamada();
					setState(115);
					match(SEP_EX);
					}
					break;
				case 9:
					{
					setState(117);
					importar();
					setState(118);
					match(SEP_EX);
					}
					break;
				case 10:
					{
					setState(120);
					retornar();
					setState(121);
					match(SEP_EX);
					}
					break;
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
	public static class Tipos_primitivosContext extends ParserRuleContext {
		public TerminalNode NUM_FLOAT() { return getToken(cpmParser.NUM_FLOAT, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public TerminalNode STR() { return getToken(cpmParser.STR, 0); }
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public Tipos_primitivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_primitivos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTipos_primitivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTipos_primitivos(this);
		}
	}

	public final Tipos_primitivosContext tipos_primitivos() throws RecognitionException {
		Tipos_primitivosContext _localctx = new Tipos_primitivosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipos_primitivos);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUM_FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				funcao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				vetor();
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
	public static class Tipos_atribuicaoContext extends ParserRuleContext {
		public Tipos_primitivosContext tipos_primitivos() {
			return getRuleContext(Tipos_primitivosContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Tipos_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTipos_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTipos_atribuicao(this);
		}
	}

	public final Tipos_atribuicaoContext tipos_atribuicao() throws RecognitionException {
		Tipos_atribuicaoContext _localctx = new Tipos_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos_atribuicao);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				tipos_primitivos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				expressao();
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
	public static class ParametroContext extends ParserRuleContext {
		public List<Tipos_primitivosContext> tipos_primitivos() {
			return getRuleContexts(Tipos_primitivosContext.class);
		}
		public Tipos_primitivosContext tipos_primitivos(int i) {
			return getRuleContext(Tipos_primitivosContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(143);
				tipos_primitivos();
				}
				break;
			case 2:
				{
				setState(144);
				expressao();
				}
				break;
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(147);
				match(T__1);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(148);
					tipos_primitivos();
					}
					break;
				case 2:
					{
					setState(149);
					expressao();
					}
					break;
				}
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class IndiceContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitIndice(this);
		}
	}

	public final IndiceContext indice() throws RecognitionException {
		IndiceContext _localctx = new IndiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_indice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(157);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(158);
				match(ID);
				}
				break;
			case 3:
				{
				setState(159);
				vetor();
				}
				break;
			case 4:
				{
				setState(160);
				funcao();
				}
				break;
			case 5:
				{
				setState(161);
				expressao();
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
	public static class Termo_aritmeticoContext extends ParserRuleContext {
		public List<Fator_aritmeticoContext> fator_aritmetico() {
			return getRuleContexts(Fator_aritmeticoContext.class);
		}
		public Fator_aritmeticoContext fator_aritmetico(int i) {
			return getRuleContext(Fator_aritmeticoContext.class,i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(cpmParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(cpmParser.OP_ARIT, i);
		}
		public Termo_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTermo_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTermo_aritmetico(this);
		}
	}

	public final Termo_aritmeticoContext termo_aritmetico() throws RecognitionException {
		Termo_aritmeticoContext _localctx = new Termo_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo_aritmetico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			fator_aritmetico();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(OP_ARIT);
					setState(166);
					fator_aritmetico();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class Fator_aritmeticoContext extends ParserRuleContext {
		public Tipos_primitivosContext tipos_primitivos() {
			return getRuleContext(Tipos_primitivosContext.class,0);
		}
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public Fator_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterFator_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitFator_aritmetico(this);
		}
	}

	public final Fator_aritmeticoContext fator_aritmetico() throws RecognitionException {
		Fator_aritmeticoContext _localctx = new Fator_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fator_aritmetico);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				tipos_primitivos();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(AP);
				setState(174);
				expressao_aritmetica();
				setState(175);
				match(FP);
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
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(cpmParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(cpmParser.OP_LOG, i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termo_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			fator_logico();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(OP_LOG);
					setState(181);
					fator_logico();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class Fator_logicoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fator_logico);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(AP);
				setState(191);
				expressao_logica();
				setState(192);
				match(FP);
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
	public static class Termo_relacionalContext extends ParserRuleContext {
		public List<Fator_relacionalContext> fator_relacional() {
			return getRuleContexts(Fator_relacionalContext.class);
		}
		public Fator_relacionalContext fator_relacional(int i) {
			return getRuleContext(Fator_relacionalContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(cpmParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(cpmParser.OP_REL, i);
		}
		public Termo_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterTermo_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitTermo_relacional(this);
		}
	}

	public final Termo_relacionalContext termo_relacional() throws RecognitionException {
		Termo_relacionalContext _localctx = new Termo_relacionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo_relacional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			fator_relacional();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(OP_REL);
					setState(198);
					fator_relacional();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class Fator_relacionalContext extends ParserRuleContext {
		public Tipos_primitivosContext tipos_primitivos() {
			return getRuleContext(Tipos_primitivosContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public Fator_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterFator_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitFator_relacional(this);
		}
	}

	public final Fator_relacionalContext fator_relacional() throws RecognitionException {
		Fator_relacionalContext _localctx = new Fator_relacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fator_relacional);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				tipos_primitivos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(AP);
				setState(207);
				expressao_relacional();
				setState(208);
				match(FP);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressao);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				expressao_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<Termo_aritmeticoContext> termo_aritmetico() {
			return getRuleContexts(Termo_aritmeticoContext.class);
		}
		public Termo_aritmeticoContext termo_aritmetico(int i) {
			return getRuleContext(Termo_aritmeticoContext.class,i);
		}
		public List<TerminalNode> MENOSMENOS() { return getTokens(cpmParser.MENOSMENOS); }
		public TerminalNode MENOSMENOS(int i) {
			return getToken(cpmParser.MENOSMENOS, i);
		}
		public List<TerminalNode> MAISMAIS() { return getTokens(cpmParser.MAISMAIS); }
		public TerminalNode MAISMAIS(int i) {
			return getToken(cpmParser.MAISMAIS, i);
		}
		public List<TerminalNode> MAISMENOS() { return getTokens(cpmParser.MAISMENOS); }
		public TerminalNode MAISMENOS(int i) {
			return getToken(cpmParser.MAISMENOS, i);
		}
		public List<TerminalNode> OP_ARIT() { return getTokens(cpmParser.OP_ARIT); }
		public TerminalNode OP_ARIT(int i) {
			return getToken(cpmParser.OP_ARIT, i);
		}
		public List<Termo_relacionalContext> termo_relacional() {
			return getRuleContexts(Termo_relacionalContext.class);
		}
		public Termo_relacionalContext termo_relacional(int i) {
			return getRuleContext(Termo_relacionalContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			termo_aritmetico();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) {
				{
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_ARIT:
					{
					{
					setState(218);
					match(OP_ARIT);
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(219);
						termo_aritmetico();
						}
						break;
					case 2:
						{
						setState(220);
						termo_relacional();
						}
						break;
					}
					}
					}
					break;
				case MENOSMENOS:
					{
					setState(223);
					match(MENOSMENOS);
					}
					break;
				case MAISMAIS:
					{
					setState(224);
					match(MAISMAIS);
					}
					break;
				case MAISMENOS:
					{
					setState(225);
					match(MAISMENOS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Expressao_logicaContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(cpmParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(cpmParser.OP_LOG, i);
		}
		public List<Termo_relacionalContext> termo_relacional() {
			return getRuleContexts(Termo_relacionalContext.class);
		}
		public Termo_relacionalContext termo_relacional(int i) {
			return getRuleContext(Termo_relacionalContext.class,i);
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
		enterRule(_localctx, 32, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			termo_logico();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOG) {
				{
				{
				setState(232);
				match(OP_LOG);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(233);
					termo_logico();
					}
					break;
				case 2:
					{
					setState(234);
					termo_relacional();
					}
					break;
				}
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public List<Termo_relacionalContext> termo_relacional() {
			return getRuleContexts(Termo_relacionalContext.class);
		}
		public Termo_relacionalContext termo_relacional(int i) {
			return getRuleContext(Termo_relacionalContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(cpmParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(cpmParser.OP_REL, i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
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
		enterRule(_localctx, 34, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			termo_relacional();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				setState(243);
				match(OP_REL);
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(244);
					termo_relacional();
					}
					break;
				case 2:
					{
					setState(245);
					termo_logico();
					}
					break;
				}
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public Declaracao_vetorContext declaracao_vetor() {
			return getRuleContext(Declaracao_vetorContext.class,0);
		}
		public Declaracao_funcaoContext declaracao_funcao() {
			return getRuleContext(Declaracao_funcaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				declaracao_variavel();
				setState(254);
				match(SEP_EX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				declaracao_vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				declaracao_funcao();
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
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(cpmParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
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
		enterRule(_localctx, 38, RULE_declaracao_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(TIPO);
			setState(261);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATR) {
				{
				setState(262);
				match(ATR);
				setState(263);
				tipos_atribuicao();
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
	public static class Declaracao_vetorContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(cpmParser.TIPO, 0); }
		public TerminalNode ACOL() { return getToken(cpmParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(cpmParser.FCOL, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_declaracao_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TIPO);
			setState(267);
			match(ACOL);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(268);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(269);
				match(ID);
				}
				break;
			case 3:
				{
				setState(270);
				vetor();
				}
				break;
			}
			setState(273);
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
	public static class Declaracao_funcaoContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(cpmParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(cpmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cpmParser.ID, i);
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
		enterRule(_localctx, 42, RULE_declaracao_funcao);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(DEF);
				setState(276);
				match(ID);
				setState(277);
				match(AP);
				{
				setState(278);
				match(TIPO);
				setState(279);
				match(ID);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(280);
					match(T__1);
					setState(281);
					match(TIPO);
					setState(282);
					match(ID);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(288);
				match(FP);
				setState(289);
				match(SEP_RE);
				setState(290);
				match(TIPO);
				setState(291);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(DEF);
				setState(293);
				match(ID);
				setState(294);
				match(T__0);
				setState(295);
				match(SEP_RE);
				setState(296);
				match(TIPO);
				setState(297);
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
	public static class RepeticaoContext extends ParserRuleContext {
		public Repeticao_whileContext repeticao_while() {
			return getRuleContext(Repeticao_whileContext.class,0);
		}
		public Repeticao_forContext repeticao_for() {
			return getRuleContext(Repeticao_forContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeticao);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				repeticao_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				repeticao_for();
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
	public static class Repeticao_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(cpmParser.WHILE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 46, RULE_repeticao_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(WHILE);
			setState(305);
			expressao();
			setState(306);
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
		public List<TerminalNode> SEP_EX() { return getTokens(cpmParser.SEP_EX); }
		public TerminalNode SEP_EX(int i) {
			return getToken(cpmParser.SEP_EX, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
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
		enterRule(_localctx, 48, RULE_repeticao_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(FOR);
			setState(309);
			match(AP);
			setState(310);
			declaracao_variavel();
			setState(311);
			match(SEP_EX);
			setState(312);
			expressao();
			setState(313);
			match(SEP_EX);
			{
			setState(314);
			match(ID);
			setState(315);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(317);
			match(FP);
			setState(318);
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
	public static class CondicionalContext extends ParserRuleContext {
		public Condicional_ifContext condicional_if() {
			return getRuleContext(Condicional_ifContext.class,0);
		}
		public Condcional_ifseContext condcional_ifse() {
			return getRuleContext(Condcional_ifseContext.class,0);
		}
		public Condicional_elseContext condicional_else() {
			return getRuleContext(Condicional_elseContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condicional);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				condicional_if();
				}
				break;
			case IFSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				condcional_ifse();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				condicional_else();
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
	public static class Condicional_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cpmParser.IF, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 52, RULE_condicional_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(IF);
			setState(326);
			expressao();
			setState(327);
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 54, RULE_condcional_ifse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IFSE);
			setState(330);
			expressao();
			setState(331);
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
		enterRule(_localctx, 56, RULE_condicional_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ELSE);
			setState(334);
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
	public static class ChamadaContext extends ParserRuleContext {
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				chamada_funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				chamada_atribuicao();
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
	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			match(AP);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case AP:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
			case ID:
				{
				setState(342);
				tipos_atribuicao();
				}
				break;
			case FP:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(346);
			match(FP);
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
	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chamada_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(348);
				match(ID);
				}
				break;
			case 2:
				{
				setState(349);
				vetor();
				}
				break;
			}
			setState(352);
			match(ATR);
			setState(353);
			tipos_atribuicao();
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
		enterRule(_localctx, 64, RULE_importar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(USE);
			setState(356);
			match(STR);
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
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode ACOL() { return getToken(cpmParser.ACOL, 0); }
		public IndiceContext indice() {
			return getRuleContext(IndiceContext.class,0);
		}
		public TerminalNode FCOL() { return getToken(cpmParser.FCOL, 0); }
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
		enterRule(_localctx, 66, RULE_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ID);
			setState(359);
			match(ACOL);
			setState(360);
			indice();
			setState(361);
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
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
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
		enterRule(_localctx, 68, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(ID);
			setState(364);
			match(AP);
			setState(365);
			parametro();
			setState(366);
			match(FP);
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
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(RETURN);
			setState(369);
			tipos_atribuicao();
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
		"\u0004\u0001#\u0174\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0003\u0000K\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002d\b\u0002\n\u0002"+
		"\f\u0002g\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003|\b\u0003\n\u0003\f\u0003\u007f"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0092\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0097"+
		"\b\u0006\u0005\u0006\u0099\b\u0006\n\u0006\f\u0006\u009c\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a3"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b2\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c3\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u00c8\b\f\n\f\f\f\u00cb\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00de\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00e3\b\u000f\n\u000f\f\u000f\u00e6\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ec\b\u0010\u0005\u0010"+
		"\u00ee\b\u0010\n\u0010\f\u0010\u00f1\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00f7\b\u0011\u0005\u0011\u00f9\b\u0011"+
		"\n\u0011\f\u0011\u00fc\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0109\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0110\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u011c\b\u0015\n\u0015\f\u0015"+
		"\u011f\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u012b\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u012f\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0144\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0153\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0159\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u015f\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0001\u0001\u0000\u0019\u001b\u0191\u0000H\u0001\u0000\u0000\u0000\u0002"+
		"L\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006h\u0001"+
		"\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000\u0000\n\u008d\u0001\u0000"+
		"\u0000\u0000\f\u0091\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000\u0000"+
		"\u0000\u0010\u00a4\u0001\u0000\u0000\u0000\u0012\u00b1\u0001\u0000\u0000"+
		"\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00c2\u0001\u0000\u0000"+
		"\u0000\u0018\u00c4\u0001\u0000\u0000\u0000\u001a\u00d2\u0001\u0000\u0000"+
		"\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000"+
		"\u0000 \u00e7\u0001\u0000\u0000\u0000\"\u00f2\u0001\u0000\u0000\u0000"+
		"$\u0102\u0001\u0000\u0000\u0000&\u0104\u0001\u0000\u0000\u0000(\u010a"+
		"\u0001\u0000\u0000\u0000*\u012a\u0001\u0000\u0000\u0000,\u012e\u0001\u0000"+
		"\u0000\u0000.\u0130\u0001\u0000\u0000\u00000\u0134\u0001\u0000\u0000\u0000"+
		"2\u0143\u0001\u0000\u0000\u00004\u0145\u0001\u0000\u0000\u00006\u0149"+
		"\u0001\u0000\u0000\u00008\u014d\u0001\u0000\u0000\u0000:\u0152\u0001\u0000"+
		"\u0000\u0000<\u0154\u0001\u0000\u0000\u0000>\u015e\u0001\u0000\u0000\u0000"+
		"@\u0163\u0001\u0000\u0000\u0000B\u0166\u0001\u0000\u0000\u0000D\u016b"+
		"\u0001\u0000\u0000\u0000F\u0170\u0001\u0000\u0000\u0000HJ\u0003\u0004"+
		"\u0002\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\u0001\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000"+
		"\u0000MN\u0005\b\u0000\u0000NO\u0005\u0001\u0000\u0000OP\u0005\u000f\u0000"+
		"\u0000PQ\u0005\u0005\u0000\u0000QR\u0003\u0006\u0003\u0000R\u0003\u0001"+
		"\u0000\u0000\u0000Sd\u0003\u0006\u0003\u0000TU\u0003\u001c\u000e\u0000"+
		"UV\u0005\u0010\u0000\u0000Vd\u0001\u0000\u0000\u0000Wd\u0003$\u0012\u0000"+
		"Xd\u0003,\u0016\u0000Yd\u00032\u0019\u0000Z[\u0003:\u001d\u0000[\\\u0005"+
		"\u0010\u0000\u0000\\d\u0001\u0000\u0000\u0000]^\u0003@ \u0000^_\u0005"+
		"\u0010\u0000\u0000_d\u0001\u0000\u0000\u0000`a\u0003F#\u0000ab\u0005\u0010"+
		"\u0000\u0000bd\u0001\u0000\u0000\u0000cS\u0001\u0000\u0000\u0000cT\u0001"+
		"\u0000\u0000\u0000cW\u0001\u0000\u0000\u0000cX\u0001\u0000\u0000\u0000"+
		"cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000"+
		"\u0000c`\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0005\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000h}\u0005\u0011\u0000\u0000i|\u0003\u0006\u0003"+
		"\u0000j|\u0003B!\u0000k|\u0003D\"\u0000lm\u0003\u001c\u000e\u0000mn\u0005"+
		"\u0010\u0000\u0000n|\u0001\u0000\u0000\u0000o|\u0003$\u0012\u0000p|\u0003"+
		",\u0016\u0000q|\u00032\u0019\u0000rs\u0003:\u001d\u0000st\u0005\u0010"+
		"\u0000\u0000t|\u0001\u0000\u0000\u0000uv\u0003@ \u0000vw\u0005\u0010\u0000"+
		"\u0000w|\u0001\u0000\u0000\u0000xy\u0003F#\u0000yz\u0005\u0010\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{i\u0001\u0000\u0000\u0000{j\u0001\u0000\u0000"+
		"\u0000{k\u0001\u0000\u0000\u0000{l\u0001\u0000\u0000\u0000{o\u0001\u0000"+
		"\u0000\u0000{p\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000\u0000{r\u0001"+
		"\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0007\u0001\u0000\u0000\u0000"+
		"\u0082\u008a\u0005\u001f\u0000\u0000\u0083\u008a\u0005\u001e\u0000\u0000"+
		"\u0084\u008a\u0005 \u0000\u0000\u0085\u008a\u0005!\u0000\u0000\u0086\u008a"+
		"\u0005\u0006\u0000\u0000\u0087\u008a\u0003D\"\u0000\u0088\u008a\u0003"+
		"B!\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000"+
		"\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000"+
		"\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\t\u0001\u0000\u0000\u0000"+
		"\u008b\u008e\u0003\b\u0004\u0000\u008c\u008e\u0003\u001c\u000e\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u000b\u0001\u0000\u0000\u0000\u008f\u0092\u0003\b\u0004\u0000\u0090\u0092"+
		"\u0003\u001c\u000e\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u009a\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0005\u0002\u0000\u0000\u0094\u0097\u0003\b\u0004\u0000\u0095\u0097\u0003"+
		"\u001c\u000e\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0093\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\r\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a3\u0005\u001e"+
		"\u0000\u0000\u009e\u00a3\u0005!\u0000\u0000\u009f\u00a3\u0003B!\u0000"+
		"\u00a0\u00a3\u0003D\"\u0000\u00a1\u00a3\u0003\u001c\u000e\u0000\u00a2"+
		"\u009d\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0003\u0012\t\u0000\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6\u00a8"+
		"\u0003\u0012\t\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b2\u0003\b\u0004\u0000\u00ad\u00ae\u0005\u0013"+
		"\u0000\u0000\u00ae\u00af\u0003\u001e\u000f\u0000\u00af\u00b0\u0005\u0014"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b2\u0013\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b8\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005\u0017"+
		"\u0000\u0000\u00b5\u00b7\u0003\u0016\u000b\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0015\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c3\u0005!\u0000"+
		"\u0000\u00bc\u00c3\u0003B!\u0000\u00bd\u00c3\u0005\u0006\u0000\u0000\u00be"+
		"\u00bf\u0005\u0013\u0000\u0000\u00bf\u00c0\u0003 \u0010\u0000\u00c0\u00c1"+
		"\u0005\u0014\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c3\u0017"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003\u001a\r\u0000\u00c5\u00c6\u0005"+
		"\u001d\u0000\u0000\u00c6\u00c8\u0003\u001a\r\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u0019\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00d3\u0003\b\u0004"+
		"\u0000\u00cd\u00d3\u0005\u0006\u0000\u0000\u00ce\u00cf\u0005\u0013\u0000"+
		"\u0000\u00cf\u00d0\u0003\"\u0011\u0000\u00d0\u00d1\u0005\u0014\u0000\u0000"+
		"\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003\u001e\u000f\u0000"+
		"\u00d5\u00d8\u0003 \u0010\u0000\u00d6\u00d8\u0003\"\u0011\u0000\u00d7"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u001d\u0001\u0000\u0000\u0000\u00d9"+
		"\u00e4\u0003\u0010\b\u0000\u00da\u00dd\u0005\u001c\u0000\u0000\u00db\u00de"+
		"\u0003\u0010\b\u0000\u00dc\u00de\u0003\u0018\f\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e3\u0001"+
		"\u0000\u0000\u0000\u00df\u00e3\u0005\u001b\u0000\u0000\u00e0\u00e3\u0005"+
		"\u001a\u0000\u0000\u00e1\u00e3\u0005\u0019\u0000\u0000\u00e2\u00da\u0001"+
		"\u0000\u0000\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u001f\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ef\u0003\u0014\n\u0000\u00e8\u00eb\u0005\u0017"+
		"\u0000\u0000\u00e9\u00ec\u0003\u0014\n\u0000\u00ea\u00ec\u0003\u0018\f"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0!\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00fa\u0003\u0018\f\u0000\u00f3"+
		"\u00f6\u0005\u001d\u0000\u0000\u00f4\u00f7\u0003\u0018\f\u0000\u00f5\u00f7"+
		"\u0003\u0014\n\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb#\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003&\u0013"+
		"\u0000\u00fe\u00ff\u0005\u0010\u0000\u0000\u00ff\u0103\u0001\u0000\u0000"+
		"\u0000\u0100\u0103\u0003(\u0014\u0000\u0101\u0103\u0003*\u0015\u0000\u0102"+
		"\u00fd\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0101\u0001\u0000\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u0005\u0000\u0000\u0105\u0108\u0005!\u0000\u0000\u0106\u0107\u0005"+
		"\u0018\u0000\u0000\u0107\u0109\u0003\n\u0005\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\'\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005\u0005\u0000\u0000\u010b\u010f\u0005\u0015\u0000"+
		"\u0000\u010c\u0110\u0005\u001e\u0000\u0000\u010d\u0110\u0005!\u0000\u0000"+
		"\u010e\u0110\u0003B!\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0016\u0000\u0000\u0112)\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\u0007\u0000\u0000\u0114\u0115\u0005"+
		"!\u0000\u0000\u0115\u0116\u0005\u0013\u0000\u0000\u0116\u0117\u0005\u0005"+
		"\u0000\u0000\u0117\u011d\u0005!\u0000\u0000\u0118\u0119\u0005\u0002\u0000"+
		"\u0000\u0119\u011a\u0005\u0005\u0000\u0000\u011a\u011c\u0005!\u0000\u0000"+
		"\u011b\u0118\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0005\u0014\u0000\u0000\u0121\u0122\u0005\u000f\u0000\u0000"+
		"\u0122\u0123\u0005\u0005\u0000\u0000\u0123\u012b\u0003\u0006\u0003\u0000"+
		"\u0124\u0125\u0005\u0007\u0000\u0000\u0125\u0126\u0005!\u0000\u0000\u0126"+
		"\u0127\u0005\u0001\u0000\u0000\u0127\u0128\u0005\u000f\u0000\u0000\u0128"+
		"\u0129\u0005\u0005\u0000\u0000\u0129\u012b\u0003\u0006\u0003\u0000\u012a"+
		"\u0113\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012b"+
		"+\u0001\u0000\u0000\u0000\u012c\u012f\u0003.\u0017\u0000\u012d\u012f\u0003"+
		"0\u0018\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012f-\u0001\u0000\u0000\u0000\u0130\u0131\u0005\r\u0000"+
		"\u0000\u0131\u0132\u0003\u001c\u000e\u0000\u0132\u0133\u0003\u0006\u0003"+
		"\u0000\u0133/\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u000e\u0000\u0000"+
		"\u0135\u0136\u0005\u0013\u0000\u0000\u0136\u0137\u0003&\u0013\u0000\u0137"+
		"\u0138\u0005\u0010\u0000\u0000\u0138\u0139\u0003\u001c\u000e\u0000\u0139"+
		"\u013a\u0005\u0010\u0000\u0000\u013a\u013b\u0005!\u0000\u0000\u013b\u013c"+
		"\u0007\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u0014\u0000\u0000\u013e\u013f\u0003\u0006\u0003\u0000\u013f1\u0001"+
		"\u0000\u0000\u0000\u0140\u0144\u00034\u001a\u0000\u0141\u0144\u00036\u001b"+
		"\u0000\u0142\u0144\u00038\u001c\u0000\u0143\u0140\u0001\u0000\u0000\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000"+
		"\u01443\u0001\u0000\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146"+
		"\u0147\u0003\u001c\u000e\u0000\u0147\u0148\u0003\u0006\u0003\u0000\u0148"+
		"5\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u000b\u0000\u0000\u014a\u014b"+
		"\u0003\u001c\u000e\u0000\u014b\u014c\u0003\u0006\u0003\u0000\u014c7\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005\f\u0000\u0000\u014e\u014f\u0003\u0006"+
		"\u0003\u0000\u014f9\u0001\u0000\u0000\u0000\u0150\u0153\u0003<\u001e\u0000"+
		"\u0151\u0153\u0003>\u001f\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0151\u0001\u0000\u0000\u0000\u0153;\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005!\u0000\u0000\u0155\u0158\u0005\u0013\u0000\u0000\u0156\u0159\u0003"+
		"\n\u0005\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005\u0014\u0000\u0000\u015b=\u0001\u0000\u0000"+
		"\u0000\u015c\u015f\u0005!\u0000\u0000\u015d\u015f\u0003B!\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0018\u0000\u0000\u0161"+
		"\u0162\u0003\n\u0005\u0000\u0162?\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0005\u0003\u0000\u0000\u0164\u0165\u0005 \u0000\u0000\u0165A\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005!\u0000\u0000\u0167\u0168\u0005\u0015\u0000"+
		"\u0000\u0168\u0169\u0003\u000e\u0007\u0000\u0169\u016a\u0005\u0016\u0000"+
		"\u0000\u016aC\u0001\u0000\u0000\u0000\u016b\u016c\u0005!\u0000\u0000\u016c"+
		"\u016d\u0005\u0013\u0000\u0000\u016d\u016e\u0003\f\u0006\u0000\u016e\u016f"+
		"\u0005\u0014\u0000\u0000\u016fE\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\t\u0000\u0000\u0171\u0172\u0003\n\u0005\u0000\u0172G\u0001\u0000\u0000"+
		"\u0000#Jce{}\u0089\u008d\u0091\u0096\u009a\u00a2\u00a9\u00b1\u00b8\u00c2"+
		"\u00c9\u00d2\u00d7\u00dd\u00e2\u00e4\u00eb\u00ef\u00f6\u00fa\u0102\u0108"+
		"\u010f\u011d\u012a\u012e\u0143\u0152\u0158\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}