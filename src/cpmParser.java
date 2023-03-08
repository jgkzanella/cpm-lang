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
		RULE_argumento = 4, RULE_tipos_atribuicao = 5, RULE_parametro = 6, RULE_indice = 7, 
		RULE_termo_aritmetico = 8, RULE_fator_aritmetico = 9, RULE_termo_logico = 10, 
		RULE_fator_logico = 11, RULE_termo_relacional = 12, RULE_fator_relacional = 13, 
		RULE_expressao = 14, RULE_expressao_reduzida = 15, RULE_expressao_aritmetica = 16, 
		RULE_expressao_logica = 17, RULE_expressao_relacional = 18, RULE_declaracao = 19, 
		RULE_declaracao_variavel = 20, RULE_declaracao_vetor = 21, RULE_declaracao_funcao = 22, 
		RULE_repeticao = 23, RULE_repeticao_while = 24, RULE_repeticao_for = 25, 
		RULE_condicional = 26, RULE_condicional_if = 27, RULE_condcional_ifse = 28, 
		RULE_condicional_else = 29, RULE_chamada = 30, RULE_chamada_reduzida = 31, 
		RULE_chamada_funcao = 32, RULE_chamada_atribuicao = 33, RULE_chamada_importar = 34, 
		RULE_chamada_retornar = 35, RULE_vetor = 36, RULE_funcao = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcao_principal", "global", "bloco", "argumento", "tipos_atribuicao", 
			"parametro", "indice", "termo_aritmetico", "fator_aritmetico", "termo_logico", 
			"fator_logico", "termo_relacional", "fator_relacional", "expressao", 
			"expressao_reduzida", "expressao_aritmetica", "expressao_logica", "expressao_relacional", 
			"declaracao", "declaracao_variavel", "declaracao_vetor", "declaracao_funcao", 
			"repeticao", "repeticao_while", "repeticao_for", "condicional", "condicional_if", 
			"condcional_ifse", "condicional_else", "chamada", "chamada_reduzida", 
			"chamada_funcao", "chamada_atribuicao", "chamada_importar", "chamada_retornar", 
			"vetor", "funcao"
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
			setState(76);
			global();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(77);
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
			setState(80);
			match(DEF);
			setState(81);
			match(MAIN);
			setState(82);
			match(T__0);
			setState(83);
			match(SEP_RE);
			setState(84);
			match(TIPO);
			setState(85);
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
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(87);
						bloco();
						}
						break;
					case 2:
						{
						setState(88);
						expressao();
						}
						break;
					case 3:
						{
						setState(89);
						declaracao();
						}
						break;
					case 4:
						{
						setState(90);
						repeticao();
						}
						break;
					case 5:
						{
						setState(91);
						condicional();
						}
						break;
					case 6:
						{
						setState(92);
						chamada();
						}
						break;
					}
					} 
				}
				setState(97);
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
			setState(98);
			match(AC);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106815208L) != 0) {
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(99);
					bloco();
					}
					break;
				case 2:
					{
					setState(100);
					vetor();
					}
					break;
				case 3:
					{
					setState(101);
					funcao();
					}
					break;
				case 4:
					{
					setState(102);
					expressao();
					}
					break;
				case 5:
					{
					setState(103);
					declaracao();
					}
					break;
				case 6:
					{
					setState(104);
					repeticao();
					}
					break;
				case 7:
					{
					setState(105);
					condicional();
					}
					break;
				case 8:
					{
					setState(106);
					chamada();
					}
					break;
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode NUM_FLOAT() { return getToken(cpmParser.NUM_FLOAT, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public TerminalNode STR() { return getToken(cpmParser.STR, 0); }
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumento);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NUM_FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				vetor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				funcao();
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
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				argumento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
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
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(127);
				argumento();
				}
				break;
			case 2:
				{
				setState(128);
				expressao();
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131);
				match(T__1);
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(132);
					argumento();
					}
					break;
				case 2:
					{
					setState(133);
					expressao();
					}
					break;
				}
				}
				}
				setState(140);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(141);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(142);
				match(ID);
				}
				break;
			case 3:
				{
				setState(143);
				vetor();
				}
				break;
			case 4:
				{
				setState(144);
				funcao();
				}
				break;
			case 5:
				{
				setState(145);
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
			setState(148);
			fator_aritmetico();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(OP_ARIT);
					setState(150);
					fator_aritmetico();
					}
					} 
				}
				setState(155);
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
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				argumento();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(AP);
				setState(158);
				expressao_aritmetica();
				setState(159);
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
			setState(163);
			fator_logico();
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(OP_LOG);
					setState(165);
					fator_logico();
					}
					} 
				}
				setState(170);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(AP);
				setState(175);
				expressao_logica();
				setState(176);
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
			setState(180);
			fator_relacional();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(OP_REL);
					setState(182);
					fator_relacional();
					}
					} 
				}
				setState(187);
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
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				argumento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(AP);
				setState(191);
				expressao_relacional();
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
		public Expressao_reduzidaContext expressao_reduzida() {
			return getRuleContext(Expressao_reduzidaContext.class,0);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				expressao_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				expressao_relacional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				expressao_reduzida();
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
	public static class Expressao_reduzidaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode MENOSMENOS() { return getToken(cpmParser.MENOSMENOS, 0); }
		public TerminalNode MAISMAIS() { return getToken(cpmParser.MAISMAIS, 0); }
		public TerminalNode MAISMENOS() { return getToken(cpmParser.MAISMENOS, 0); }
		public Expressao_reduzidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_reduzida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterExpressao_reduzida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitExpressao_reduzida(this);
		}
	}

	public final Expressao_reduzidaContext expressao_reduzida() throws RecognitionException {
		Expressao_reduzidaContext _localctx = new Expressao_reduzidaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressao_reduzida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			setState(203);
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
		enterRule(_localctx, 32, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			termo_aritmetico();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT) {
				{
				{
				{
				setState(206);
				match(OP_ARIT);
				setState(209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(207);
					termo_aritmetico();
					}
					break;
				case 2:
					{
					setState(208);
					termo_relacional();
					}
					break;
				}
				}
				}
				}
				setState(215);
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
		enterRule(_localctx, 34, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			termo_logico();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOG) {
				{
				{
				setState(217);
				match(OP_LOG);
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(218);
					termo_logico();
					}
					break;
				case 2:
					{
					setState(219);
					termo_relacional();
					}
					break;
				}
				}
				}
				setState(226);
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
		enterRule(_localctx, 36, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			termo_relacional();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				setState(228);
				match(OP_REL);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(229);
					termo_relacional();
					}
					break;
				case 2:
					{
					setState(230);
					termo_logico();
					}
					break;
				}
				}
				}
				setState(237);
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
		enterRule(_localctx, 38, RULE_declaracao);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				declaracao_variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				declaracao_vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 40, RULE_declaracao_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(TIPO);
			setState(244);
			match(ID);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATR) {
				{
				setState(245);
				match(ATR);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(246);
					argumento();
					}
					break;
				case 2:
					{
					setState(247);
					expressao();
					}
					break;
				}
				}
			}

			setState(252);
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
		public List<TerminalNode> ID() { return getTokens(cpmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cpmParser.ID, i);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public TerminalNode AC() { return getToken(cpmParser.AC, 0); }
		public TerminalNode FC() { return getToken(cpmParser.FC, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
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
		enterRule(_localctx, 42, RULE_declaracao_vetor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(TIPO);
			setState(255);
			match(ACOL);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(256);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(257);
				match(ID);
				}
				break;
			case 3:
				{
				setState(258);
				vetor();
				}
				break;
			}
			setState(261);
			match(FCOL);
			setState(262);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATR) {
				{
				setState(263);
				match(ATR);
				setState(264);
				match(AC);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106651712L) != 0) {
					{
					setState(265);
					parametro();
					}
				}

				setState(268);
				match(FC);
				}
			}

			setState(271);
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
		enterRule(_localctx, 44, RULE_declaracao_funcao);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(DEF);
				setState(274);
				match(ID);
				setState(275);
				match(AP);
				{
				setState(276);
				match(TIPO);
				setState(277);
				match(ID);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(278);
					match(T__1);
					setState(279);
					match(TIPO);
					setState(280);
					match(ID);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(286);
				match(FP);
				setState(287);
				match(SEP_RE);
				setState(288);
				match(TIPO);
				setState(289);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(DEF);
				setState(291);
				match(ID);
				setState(292);
				match(T__0);
				setState(293);
				match(SEP_RE);
				setState(294);
				match(TIPO);
				setState(295);
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
		enterRule(_localctx, 46, RULE_repeticao);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				repeticao_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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
		enterRule(_localctx, 48, RULE_repeticao_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(WHILE);
			setState(303);
			expressao();
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
	public static class Repeticao_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(cpmParser.FOR, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public Expressao_reduzidaContext expressao_reduzida() {
			return getRuleContext(Expressao_reduzidaContext.class,0);
		}
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_repeticao_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FOR);
			setState(307);
			match(AP);
			setState(308);
			declaracao_variavel();
			setState(309);
			expressao();
			setState(310);
			match(SEP_EX);
			setState(311);
			expressao_reduzida();
			setState(312);
			match(FP);
			setState(313);
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
		enterRule(_localctx, 52, RULE_condicional);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				condicional_if();
				}
				break;
			case IFSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				condcional_ifse();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
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
		enterRule(_localctx, 54, RULE_condicional_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IF);
			setState(321);
			expressao();
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
		enterRule(_localctx, 56, RULE_condcional_ifse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IFSE);
			setState(325);
			expressao();
			setState(326);
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
		enterRule(_localctx, 58, RULE_condicional_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ELSE);
			setState(329);
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
		public Chamada_importarContext chamada_importar() {
			return getRuleContext(Chamada_importarContext.class,0);
		}
		public Chamada_retornarContext chamada_retornar() {
			return getRuleContext(Chamada_retornarContext.class,0);
		}
		public Chamada_reduzidaContext chamada_reduzida() {
			return getRuleContext(Chamada_reduzidaContext.class,0);
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
		enterRule(_localctx, 60, RULE_chamada);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				chamada_funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				chamada_atribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				chamada_importar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				chamada_retornar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				chamada_reduzida();
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
	public static class Chamada_reduzidaContext extends ParserRuleContext {
		public Expressao_reduzidaContext expressao_reduzida() {
			return getRuleContext(Expressao_reduzidaContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public Chamada_reduzidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_reduzida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada_reduzida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada_reduzida(this);
		}
	}

	public final Chamada_reduzidaContext chamada_reduzida() throws RecognitionException {
		Chamada_reduzidaContext _localctx = new Chamada_reduzidaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chamada_reduzida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			expressao_reduzida();
			setState(339);
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
	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cpmParser.ID, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
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
		enterRule(_localctx, 64, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			setState(342);
			match(AP);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106651712L) != 0) {
				{
				setState(343);
				parametro();
				}
			}

			setState(346);
			match(FP);
			setState(347);
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
	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
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
		enterRule(_localctx, 66, RULE_chamada_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(349);
				match(ID);
				}
				break;
			case 2:
				{
				setState(350);
				vetor();
				}
				break;
			}
			setState(353);
			match(ATR);
			setState(354);
			tipos_atribuicao();
			setState(355);
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
	public static class Chamada_importarContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(cpmParser.USE, 0); }
		public TerminalNode STR() { return getToken(cpmParser.STR, 0); }
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public Chamada_importarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada_importar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada_importar(this);
		}
	}

	public final Chamada_importarContext chamada_importar() throws RecognitionException {
		Chamada_importarContext _localctx = new Chamada_importarContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_chamada_importar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(USE);
			setState(358);
			match(STR);
			setState(359);
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
	public static class Chamada_retornarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(cpmParser.RETURN, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
		public TerminalNode SEP_EX() { return getToken(cpmParser.SEP_EX, 0); }
		public Chamada_retornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).enterChamada_retornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cpmListener ) ((cpmListener)listener).exitChamada_retornar(this);
		}
	}

	public final Chamada_retornarContext chamada_retornar() throws RecognitionException {
		Chamada_retornarContext _localctx = new Chamada_retornarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_chamada_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(RETURN);
			setState(362);
			tipos_atribuicao();
			setState(363);
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
		enterRule(_localctx, 72, RULE_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(366);
			match(ACOL);
			setState(367);
			indice();
			setState(368);
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
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
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
		enterRule(_localctx, 74, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(AP);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106651712L) != 0) {
				{
				setState(372);
				parametro();
				}
			}

			setState(375);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u017a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0003\u0000"+
		"O\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003"+
		"o\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0082\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0087\b\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0093\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0098\b\b\n\b\f\b\u009b"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u00a7\b\n\n\n\f\n\u00aa\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00b3\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00b8\b\f\n\f\f\f"+
		"\u00bb\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c3"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c9"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00d2\b\u0010\u0005\u0010\u00d4\b\u0010"+
		"\n\u0010\f\u0010\u00d7\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00dd\b\u0011\u0005\u0011\u00df\b\u0011\n\u0011\f\u0011"+
		"\u00e2\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e8\b\u0012\u0005\u0012\u00ea\b\u0012\n\u0012\f\u0012\u00ed\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f2\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f9\b\u0014"+
		"\u0003\u0014\u00fb\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0104\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u010b\b\u0015"+
		"\u0001\u0015\u0003\u0015\u010e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u011a\b\u0016\n\u0016\f\u0016\u011d\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0129\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u012d\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u013f\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0151\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u0159\b \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0003!\u0160\b!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0003%\u0176\b%\u0001%\u0001%\u0001%\u0000\u0000"+
		"&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0001\u0001\u0000\u0019\u001b"+
		"\u0196\u0000L\u0001\u0000\u0000\u0000\u0002P\u0001\u0000\u0000\u0000\u0004"+
		"_\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\by\u0001\u0000"+
		"\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000"+
		"\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000"+
		"\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000\u0000\u0000"+
		"\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000"+
		"\u001a\u00c2\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000\u0000"+
		"\u001e\u00ca\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000\""+
		"\u00d8\u0001\u0000\u0000\u0000$\u00e3\u0001\u0000\u0000\u0000&\u00f1\u0001"+
		"\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*\u00fe\u0001\u0000\u0000"+
		"\u0000,\u0128\u0001\u0000\u0000\u0000.\u012c\u0001\u0000\u0000\u00000"+
		"\u012e\u0001\u0000\u0000\u00002\u0132\u0001\u0000\u0000\u00004\u013e\u0001"+
		"\u0000\u0000\u00006\u0140\u0001\u0000\u0000\u00008\u0144\u0001\u0000\u0000"+
		"\u0000:\u0148\u0001\u0000\u0000\u0000<\u0150\u0001\u0000\u0000\u0000>"+
		"\u0152\u0001\u0000\u0000\u0000@\u0155\u0001\u0000\u0000\u0000B\u015f\u0001"+
		"\u0000\u0000\u0000D\u0165\u0001\u0000\u0000\u0000F\u0169\u0001\u0000\u0000"+
		"\u0000H\u016d\u0001\u0000\u0000\u0000J\u0172\u0001\u0000\u0000\u0000L"+
		"N\u0003\u0004\u0002\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\u0001\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0007\u0000\u0000QR\u0005\b\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u0005"+
		"\u000f\u0000\u0000TU\u0005\u0005\u0000\u0000UV\u0003\u0006\u0003\u0000"+
		"V\u0003\u0001\u0000\u0000\u0000W^\u0003\u0006\u0003\u0000X^\u0003\u001c"+
		"\u000e\u0000Y^\u0003&\u0013\u0000Z^\u0003.\u0017\u0000[^\u00034\u001a"+
		"\u0000\\^\u0003<\u001e\u0000]W\u0001\u0000\u0000\u0000]X\u0001\u0000\u0000"+
		"\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0005\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bm\u0005\u0011\u0000\u0000cl\u0003\u0006"+
		"\u0003\u0000dl\u0003H$\u0000el\u0003J%\u0000fl\u0003\u001c\u000e\u0000"+
		"gl\u0003&\u0013\u0000hl\u0003.\u0017\u0000il\u00034\u001a\u0000jl\u0003"+
		"<\u001e\u0000kc\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000ke\u0001"+
		"\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0012\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rz\u0005\u001f\u0000"+
		"\u0000sz\u0005\u001e\u0000\u0000tz\u0005 \u0000\u0000uz\u0005!\u0000\u0000"+
		"vz\u0005\u0006\u0000\u0000wz\u0003H$\u0000xz\u0003J%\u0000yr\u0001\u0000"+
		"\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yu\u0001"+
		"\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z\t\u0001\u0000\u0000\u0000{~\u0003\b\u0004"+
		"\u0000|~\u0003\u001c\u000e\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u000b\u0001\u0000\u0000\u0000\u007f\u0082\u0003\b\u0004"+
		"\u0000\u0080\u0082\u0003\u001c\u000e\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u008a\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0005\u0002\u0000\u0000\u0084\u0087\u0003\b\u0004\u0000"+
		"\u0085\u0087\u0003\u001c\u000e\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0083\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\r\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u0093\u0005\u001e\u0000\u0000\u008e\u0093\u0005!\u0000\u0000\u008f\u0093"+
		"\u0003H$\u0000\u0090\u0093\u0003J%\u0000\u0091\u0093\u0003\u001c\u000e"+
		"\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000"+
		"\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000"+
		"\u0000\u0094\u0099\u0003\u0012\t\u0000\u0095\u0096\u0005\u001c\u0000\u0000"+
		"\u0096\u0098\u0003\u0012\t\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u00a2\u0003\b\u0004\u0000\u009d\u009e"+
		"\u0005\u0013\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f\u00a0\u0005"+
		"\u0014\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009c\u0001"+
		"\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u0013\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a8\u0003\u0016\u000b\u0000\u00a4\u00a5\u0005"+
		"\u0017\u0000\u0000\u00a5\u00a7\u0003\u0016\u000b\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0015\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00b3\u0005"+
		"!\u0000\u0000\u00ac\u00b3\u0003H$\u0000\u00ad\u00b3\u0005\u0006\u0000"+
		"\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af\u00b0\u0003\"\u0011\u0000"+
		"\u00b0\u00b1\u0005\u0014\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b3\u0017\u0001\u0000\u0000\u0000\u00b4\u00b9\u0003\u001a\r\u0000\u00b5"+
		"\u00b6\u0005\u001d\u0000\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u0019"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c3"+
		"\u0003\b\u0004\u0000\u00bd\u00c3\u0005\u0006\u0000\u0000\u00be\u00bf\u0005"+
		"\u0013\u0000\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0005\u0014"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000"+
		"\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003 \u0010"+
		"\u0000\u00c5\u00c9\u0003\"\u0011\u0000\u00c6\u00c9\u0003$\u0012\u0000"+
		"\u00c7\u00c9\u0003\u001e\u000f\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc"+
		"\u001f\u0001\u0000\u0000\u0000\u00cd\u00d5\u0003\u0010\b\u0000\u00ce\u00d1"+
		"\u0005\u001c\u0000\u0000\u00cf\u00d2\u0003\u0010\b\u0000\u00d0\u00d2\u0003"+
		"\u0018\f\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6!\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00e0\u0003\u0014\n\u0000"+
		"\u00d9\u00dc\u0005\u0017\u0000\u0000\u00da\u00dd\u0003\u0014\n\u0000\u00db"+
		"\u00dd\u0003\u0018\f\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d9"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1#\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00eb\u0003"+
		"\u0018\f\u0000\u00e4\u00e7\u0005\u001d\u0000\u0000\u00e5\u00e8\u0003\u0018"+
		"\f\u0000\u00e6\u00e8\u0003\u0014\n\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f2\u0003(\u0014\u0000\u00ef\u00f2\u0003*\u0015\u0000\u00f0\u00f2"+
		"\u0003,\u0016\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\'\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0005\u0000\u0000\u00f4\u00fa\u0005!\u0000"+
		"\u0000\u00f5\u00f8\u0005\u0018\u0000\u0000\u00f6\u00f9\u0003\b\u0004\u0000"+
		"\u00f7\u00f9\u0003\u001c\u000e\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0010\u0000\u0000"+
		"\u00fd)\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff"+
		"\u0103\u0005\u0015\u0000\u0000\u0100\u0104\u0005\u001e\u0000\u0000\u0101"+
		"\u0104\u0005!\u0000\u0000\u0102\u0104\u0003H$\u0000\u0103\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\u0016\u0000\u0000\u0106\u010d\u0005!\u0000\u0000\u0107\u0108\u0005\u0018"+
		"\u0000\u0000\u0108\u010a\u0005\u0011\u0000\u0000\u0109\u010b\u0003\f\u0006"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0005\u0012\u0000"+
		"\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0010\u0000"+
		"\u0000\u0110+\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0007\u0000\u0000"+
		"\u0112\u0113\u0005!\u0000\u0000\u0113\u0114\u0005\u0013\u0000\u0000\u0114"+
		"\u0115\u0005\u0005\u0000\u0000\u0115\u011b\u0005!\u0000\u0000\u0116\u0117"+
		"\u0005\u0002\u0000\u0000\u0117\u0118\u0005\u0005\u0000\u0000\u0118\u011a"+
		"\u0005!\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u011a\u011d\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005\u0014\u0000\u0000\u011f\u0120\u0005"+
		"\u000f\u0000\u0000\u0120\u0121\u0005\u0005\u0000\u0000\u0121\u0129\u0003"+
		"\u0006\u0003\u0000\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u0124\u0005"+
		"!\u0000\u0000\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0126\u0005\u000f"+
		"\u0000\u0000\u0126\u0127\u0005\u0005\u0000\u0000\u0127\u0129\u0003\u0006"+
		"\u0003\u0000\u0128\u0111\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000"+
		"\u0000\u0000\u0129-\u0001\u0000\u0000\u0000\u012a\u012d\u00030\u0018\u0000"+
		"\u012b\u012d\u00032\u0019\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d/\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\r\u0000\u0000\u012f\u0130\u0003\u001c\u000e\u0000\u0130\u0131\u0003"+
		"\u0006\u0003\u0000\u01311\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u000e"+
		"\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u0135\u0003(\u0014"+
		"\u0000\u0135\u0136\u0003\u001c\u000e\u0000\u0136\u0137\u0005\u0010\u0000"+
		"\u0000\u0137\u0138\u0003\u001e\u000f\u0000\u0138\u0139\u0005\u0014\u0000"+
		"\u0000\u0139\u013a\u0003\u0006\u0003\u0000\u013a3\u0001\u0000\u0000\u0000"+
		"\u013b\u013f\u00036\u001b\u0000\u013c\u013f\u00038\u001c\u0000\u013d\u013f"+
		"\u0003:\u001d\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f5\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\n\u0000\u0000\u0141\u0142\u0003\u001c\u000e"+
		"\u0000\u0142\u0143\u0003\u0006\u0003\u0000\u01437\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\u000b\u0000\u0000\u0145\u0146\u0003\u001c\u000e\u0000"+
		"\u0146\u0147\u0003\u0006\u0003\u0000\u01479\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0005\f\u0000\u0000\u0149\u014a\u0003\u0006\u0003\u0000\u014a;"+
		"\u0001\u0000\u0000\u0000\u014b\u0151\u0003@ \u0000\u014c\u0151\u0003B"+
		"!\u0000\u014d\u0151\u0003D\"\u0000\u014e\u0151\u0003F#\u0000\u014f\u0151"+
		"\u0003>\u001f\u0000\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u014c\u0001"+
		"\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151=\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0003\u001e\u000f\u0000\u0153\u0154\u0005\u0010"+
		"\u0000\u0000\u0154?\u0001\u0000\u0000\u0000\u0155\u0156\u0005!\u0000\u0000"+
		"\u0156\u0158\u0005\u0013\u0000\u0000\u0157\u0159\u0003\f\u0006\u0000\u0158"+
		"\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0014\u0000\u0000\u015b"+
		"\u015c\u0005\u0010\u0000\u0000\u015cA\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0005!\u0000\u0000\u015e\u0160\u0003H$\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0005\u0018\u0000\u0000\u0162\u0163\u0003\n\u0005"+
		"\u0000\u0163\u0164\u0005\u0010\u0000\u0000\u0164C\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u0003\u0000\u0000\u0166\u0167\u0005 \u0000\u0000\u0167"+
		"\u0168\u0005\u0010\u0000\u0000\u0168E\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0005\t\u0000\u0000\u016a\u016b\u0003\n\u0005\u0000\u016b\u016c\u0005"+
		"\u0010\u0000\u0000\u016cG\u0001\u0000\u0000\u0000\u016d\u016e\u0005!\u0000"+
		"\u0000\u016e\u016f\u0005\u0015\u0000\u0000\u016f\u0170\u0003\u000e\u0007"+
		"\u0000\u0170\u0171\u0005\u0016\u0000\u0000\u0171I\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0005!\u0000\u0000\u0173\u0175\u0005\u0013\u0000\u0000\u0174"+
		"\u0176\u0003\f\u0006\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005\u0014\u0000\u0000\u0178K\u0001\u0000\u0000\u0000&N]_kmy}\u0081"+
		"\u0086\u008a\u0092\u0099\u00a1\u00a8\u00b2\u00b9\u00c2\u00c8\u00d1\u00d5"+
		"\u00dc\u00e0\u00e7\u00eb\u00f1\u00f8\u00fa\u0103\u010a\u010d\u011b\u0128"+
		"\u012c\u013e\u0150\u0158\u015f\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}