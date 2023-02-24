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
		STR=32, VARIAVEL=33, WS=34, ERROR=35;
	public static final int
		RULE_programa = 0, RULE_funcao_principal = 1, RULE_declaracoes_externas = 2, 
		RULE_bloco = 3, RULE_tipos_primitivos = 4, RULE_tipos_atribuicao = 5, 
		RULE_termo_aritmetico = 6, RULE_fator_aritmetico = 7, RULE_termo_logico = 8, 
		RULE_fator_logico = 9, RULE_termo_relacional = 10, RULE_fator_relacional = 11, 
		RULE_expressao = 12, RULE_expressao_aritmetica = 13, RULE_expressao_logica = 14, 
		RULE_expressao_relacional = 15, RULE_declaracao = 16, RULE_declaracao_variavel = 17, 
		RULE_declaracao_vetor = 18, RULE_declaracao_funcao = 19, RULE_repeticao = 20, 
		RULE_repeticao_while = 21, RULE_repeticao_for = 22, RULE_condicional = 23, 
		RULE_condicional_if = 24, RULE_condcional_ifse = 25, RULE_condicional_else = 26, 
		RULE_chamada = 27, RULE_funcao = 28, RULE_atribuicao = 29, RULE_importar = 30, 
		RULE_vetor = 31, RULE_retornar = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcao_principal", "declaracoes_externas", "bloco", "tipos_primitivos", 
			"tipos_atribuicao", "termo_aritmetico", "fator_aritmetico", "termo_logico", 
			"fator_logico", "termo_relacional", "fator_relacional", "expressao", 
			"expressao_aritmetica", "expressao_logica", "expressao_relacional", "declaracao", 
			"declaracao_variavel", "declaracao_vetor", "declaracao_funcao", "repeticao", 
			"repeticao_while", "repeticao_for", "condicional", "condicional_if", 
			"condcional_ifse", "condicional_else", "chamada", "funcao", "atribuicao", 
			"importar", "vetor", "retornar"
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
			"MENOSMENOS", "OP_ARIT", "OP_REL", "NUM_INT", "NUM_FLOAT", "STR", "VARIAVEL", 
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
			setState(66);
			declaracoes_externas();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF) {
				{
				setState(67);
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
			setState(70);
			match(DEF);
			setState(71);
			match(MAIN);
			setState(72);
			match(T__0);
			setState(73);
			match(SEP_RE);
			setState(74);
			match(TIPO);
			setState(75);
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
	public static class Declaracoes_externasContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_declaracoes_externas);
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
						setState(77);
						bloco();
						}
						break;
					case 2:
						{
						setState(78);
						expressao();
						setState(79);
						match(SEP_EX);
						}
						break;
					case 3:
						{
						setState(81);
						declaracao();
						}
						break;
					case 4:
						{
						setState(82);
						repeticao();
						}
						break;
					case 5:
						{
						setState(83);
						condicional();
						}
						break;
					case 6:
						{
						setState(84);
						chamada();
						setState(85);
						match(SEP_EX);
						}
						break;
					case 7:
						{
						setState(87);
						importar();
						setState(88);
						match(SEP_EX);
						}
						break;
					case 8:
						{
						setState(90);
						retornar();
						setState(91);
						match(SEP_EX);
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
			setState(98);
			match(AC);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16106815208L) != 0) {
				{
				setState(115);
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
					expressao();
					setState(101);
					match(SEP_EX);
					}
					break;
				case 3:
					{
					setState(103);
					declaracao();
					}
					break;
				case 4:
					{
					setState(104);
					repeticao();
					}
					break;
				case 5:
					{
					setState(105);
					condicional();
					}
					break;
				case 6:
					{
					setState(106);
					chamada();
					setState(107);
					match(SEP_EX);
					}
					break;
				case 7:
					{
					setState(109);
					importar();
					setState(110);
					match(SEP_EX);
					}
					break;
				case 8:
					{
					setState(112);
					retornar();
					setState(113);
					match(SEP_EX);
					}
					break;
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(cpmParser.BOOL, 0); }
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(NUM_FLOAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(STR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(VARIAVEL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				vetor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(BOOL);
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
		public Expressao_aritmeticaContext expressao_aritmetica() {
			return getRuleContext(Expressao_aritmeticaContext.class,0);
		}
		public Expressao_logicaContext expressao_logica() {
			return getRuleContext(Expressao_logicaContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				tipos_primitivos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expressao_aritmetica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				expressao_logica();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				expressao_relacional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
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
		enterRule(_localctx, 12, RULE_termo_aritmetico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			fator_aritmetico();
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(OP_ARIT);
					setState(139);
					fator_aritmetico();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_fator_aritmetico);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				tipos_primitivos();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(AP);
				setState(147);
				expressao_aritmetica();
				setState(148);
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
		enterRule(_localctx, 16, RULE_termo_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			fator_logico();
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(OP_LOG);
					setState(154);
					fator_logico();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
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
		enterRule(_localctx, 18, RULE_fator_logico);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(VARIAVEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(AP);
				setState(164);
				expressao_logica();
				setState(165);
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
		enterRule(_localctx, 20, RULE_termo_relacional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			fator_relacional();
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					match(OP_REL);
					setState(171);
					fator_relacional();
					}
					} 
				}
				setState(176);
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
		enterRule(_localctx, 22, RULE_fator_relacional);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				tipos_primitivos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(AP);
				setState(180);
				expressao_relacional();
				setState(181);
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
		enterRule(_localctx, 24, RULE_expressao);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expressao_aritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				expressao_logica();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
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
		enterRule(_localctx, 26, RULE_expressao_aritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			termo_aritmetico();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_ARIT:
					{
					{
					setState(191);
					match(OP_ARIT);
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(192);
						termo_aritmetico();
						}
						break;
					case 2:
						{
						setState(193);
						termo_relacional();
						}
						break;
					}
					}
					}
					break;
				case MENOSMENOS:
					{
					setState(196);
					match(MENOSMENOS);
					}
					break;
				case MAISMAIS:
					{
					setState(197);
					match(MAISMAIS);
					}
					break;
				case MAISMENOS:
					{
					setState(198);
					match(MAISMENOS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
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
		enterRule(_localctx, 28, RULE_expressao_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			termo_logico();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOG) {
				{
				{
				setState(205);
				match(OP_LOG);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(206);
					termo_logico();
					}
					break;
				case 2:
					{
					setState(207);
					termo_relacional();
					}
					break;
				}
				}
				}
				setState(214);
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
		enterRule(_localctx, 30, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			termo_relacional();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				setState(216);
				match(OP_REL);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(217);
					termo_relacional();
					}
					break;
				case 2:
					{
					setState(218);
					termo_logico();
					}
					break;
				}
				}
				}
				setState(225);
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
		enterRule(_localctx, 32, RULE_declaracao);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				declaracao_variavel();
				setState(227);
				match(SEP_EX);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				declaracao_vetor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
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
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
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
		enterRule(_localctx, 34, RULE_declaracao_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(TIPO);
			setState(234);
			match(VARIAVEL);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATR) {
				{
				setState(235);
				match(ATR);
				setState(236);
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
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
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
		enterRule(_localctx, 36, RULE_declaracao_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TIPO);
			setState(240);
			match(ACOL);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(241);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(242);
				match(VARIAVEL);
				}
				break;
			case 3:
				{
				setState(243);
				vetor();
				}
				break;
			}
			setState(246);
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
		enterRule(_localctx, 38, RULE_declaracao_funcao);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(DEF);
				setState(249);
				match(VARIAVEL);
				setState(250);
				match(AP);
				{
				setState(251);
				match(TIPO);
				setState(252);
				match(VARIAVEL);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(253);
					match(T__1);
					setState(254);
					match(TIPO);
					setState(255);
					match(VARIAVEL);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(261);
				match(FP);
				setState(262);
				match(SEP_RE);
				setState(263);
				match(TIPO);
				setState(264);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(DEF);
				setState(266);
				match(VARIAVEL);
				setState(267);
				match(T__0);
				setState(268);
				match(SEP_RE);
				setState(269);
				match(TIPO);
				setState(270);
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
		enterRule(_localctx, 40, RULE_repeticao);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				repeticao_while();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		enterRule(_localctx, 42, RULE_repeticao_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(WHILE);
			setState(278);
			expressao();
			setState(279);
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
		enterRule(_localctx, 44, RULE_repeticao_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(FOR);
			setState(282);
			match(AP);
			setState(283);
			declaracao_variavel();
			setState(284);
			match(SEP_EX);
			setState(285);
			expressao();
			setState(286);
			match(SEP_EX);
			{
			setState(287);
			match(VARIAVEL);
			setState(288);
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
			setState(290);
			match(FP);
			setState(291);
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
		enterRule(_localctx, 46, RULE_condicional);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				condicional_if();
				}
				break;
			case IFSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				condcional_ifse();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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
		enterRule(_localctx, 48, RULE_condicional_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IF);
			setState(299);
			expressao();
			setState(300);
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
		enterRule(_localctx, 50, RULE_condcional_ifse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(IFSE);
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
		enterRule(_localctx, 52, RULE_condicional_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ELSE);
			setState(307);
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
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
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
		enterRule(_localctx, 54, RULE_chamada);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				funcao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				atribuicao();
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
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public TerminalNode AP() { return getToken(cpmParser.AP, 0); }
		public TerminalNode FP() { return getToken(cpmParser.FP, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
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
		enterRule(_localctx, 56, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(VARIAVEL);
			setState(314);
			match(AP);
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case AP:
			case NUM_INT:
			case NUM_FLOAT:
			case STR:
			case VARIAVEL:
				{
				setState(315);
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
			setState(319);
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(cpmParser.ATR, 0); }
		public Tipos_atribuicaoContext tipos_atribuicao() {
			return getRuleContext(Tipos_atribuicaoContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(cpmParser.VARIAVEL, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
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
		enterRule(_localctx, 58, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(321);
				match(VARIAVEL);
				}
				break;
			case 2:
				{
				setState(322);
				vetor();
				}
				break;
			}
			setState(325);
			match(ATR);
			setState(326);
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
		enterRule(_localctx, 60, RULE_importar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(USE);
			setState(329);
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
		public List<TerminalNode> VARIAVEL() { return getTokens(cpmParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(cpmParser.VARIAVEL, i);
		}
		public TerminalNode ACOL() { return getToken(cpmParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(cpmParser.FCOL, 0); }
		public TerminalNode NUM_INT() { return getToken(cpmParser.NUM_INT, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_vetor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(VARIAVEL);
			setState(332);
			match(ACOL);
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(333);
				match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(334);
				match(VARIAVEL);
				}
				break;
			case 3:
				{
				setState(335);
				vetor();
				}
				break;
			}
			setState(338);
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
		enterRule(_localctx, 64, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(RETURN);
			setState(341);
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
		"\u0004\u0001#\u0158\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0003\u0000"+
		"E\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003t\b\u0003\n\u0003\f\u0003"+
		"w\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0081\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008d\b\u0006\n\u0006"+
		"\f\u0006\u0090\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0097\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u009c\b\b\n\b\f\b\u009f\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00a8\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00ad\b\n"+
		"\n\n\f\n\u00b0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b8\b\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00bd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00c8\b\r\n\r\f\r\u00cb\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0005\u000e\u00d3"+
		"\b\u000e\n\u000e\f\u000e\u00d6\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0005\u000f\u00de\b\u000f\n\u000f"+
		"\f\u000f\u00e1\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00e8\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00ee\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00f5\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0101\b\u0013\n\u0013\f\u0013\u0104"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0110"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0114\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0129\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0138\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013e\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u0144\b\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0151\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0000\u0000!\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@\u0000\u0001\u0001\u0000\u0019\u001b\u0173\u0000"+
		"B\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004_\u0001"+
		"\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\b\u0080\u0001\u0000"+
		"\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u0089\u0001\u0000\u0000"+
		"\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000\u0000"+
		"\u0000\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000"+
		"\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000"+
		"\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c\u00cc\u0001\u0000\u0000"+
		"\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00e7\u0001\u0000\u0000\u0000"+
		"\"\u00e9\u0001\u0000\u0000\u0000$\u00ef\u0001\u0000\u0000\u0000&\u010f"+
		"\u0001\u0000\u0000\u0000(\u0113\u0001\u0000\u0000\u0000*\u0115\u0001\u0000"+
		"\u0000\u0000,\u0119\u0001\u0000\u0000\u0000.\u0128\u0001\u0000\u0000\u0000"+
		"0\u012a\u0001\u0000\u0000\u00002\u012e\u0001\u0000\u0000\u00004\u0132"+
		"\u0001\u0000\u0000\u00006\u0137\u0001\u0000\u0000\u00008\u0139\u0001\u0000"+
		"\u0000\u0000:\u0143\u0001\u0000\u0000\u0000<\u0148\u0001\u0000\u0000\u0000"+
		">\u014b\u0001\u0000\u0000\u0000@\u0154\u0001\u0000\u0000\u0000BD\u0003"+
		"\u0004\u0002\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000E\u0001\u0001\u0000\u0000\u0000FG\u0005\u0007"+
		"\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0005\u000f"+
		"\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0003\u0006\u0003\u0000L\u0003"+
		"\u0001\u0000\u0000\u0000M^\u0003\u0006\u0003\u0000NO\u0003\u0018\f\u0000"+
		"OP\u0005\u0010\u0000\u0000P^\u0001\u0000\u0000\u0000Q^\u0003 \u0010\u0000"+
		"R^\u0003(\u0014\u0000S^\u0003.\u0017\u0000TU\u00036\u001b\u0000UV\u0005"+
		"\u0010\u0000\u0000V^\u0001\u0000\u0000\u0000WX\u0003<\u001e\u0000XY\u0005"+
		"\u0010\u0000\u0000Y^\u0001\u0000\u0000\u0000Z[\u0003@ \u0000[\\\u0005"+
		"\u0010\u0000\u0000\\^\u0001\u0000\u0000\u0000]M\u0001\u0000\u0000\u0000"+
		"]N\u0001\u0000\u0000\u0000]Q\u0001\u0000\u0000\u0000]R\u0001\u0000\u0000"+
		"\u0000]S\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]W\u0001\u0000"+
		"\u0000\u0000]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0005\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bu\u0005\u0011\u0000\u0000ct\u0003\u0006"+
		"\u0003\u0000de\u0003\u0018\f\u0000ef\u0005\u0010\u0000\u0000ft\u0001\u0000"+
		"\u0000\u0000gt\u0003 \u0010\u0000ht\u0003(\u0014\u0000it\u0003.\u0017"+
		"\u0000jk\u00036\u001b\u0000kl\u0005\u0010\u0000\u0000lt\u0001\u0000\u0000"+
		"\u0000mn\u0003<\u001e\u0000no\u0005\u0010\u0000\u0000ot\u0001\u0000\u0000"+
		"\u0000pq\u0003@ \u0000qr\u0005\u0010\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sc\u0001\u0000\u0000\u0000sd\u0001\u0000\u0000\u0000sg\u0001\u0000\u0000"+
		"\u0000sh\u0001\u0000\u0000\u0000si\u0001\u0000\u0000\u0000sj\u0001\u0000"+
		"\u0000\u0000sm\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000"+
		"\u0000y\u0007\u0001\u0000\u0000\u0000z\u0081\u0005\u001f\u0000\u0000{"+
		"\u0081\u0005\u001e\u0000\u0000|\u0081\u0005 \u0000\u0000}\u0081\u0005"+
		"!\u0000\u0000~\u0081\u0003>\u001f\u0000\u007f\u0081\u0005\u0006\u0000"+
		"\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080"+
		"|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\t\u0001\u0000"+
		"\u0000\u0000\u0082\u0088\u0003\b\u0004\u0000\u0083\u0088\u0003\u001a\r"+
		"\u0000\u0084\u0088\u0003\u001c\u000e\u0000\u0085\u0088\u0003\u001e\u000f"+
		"\u0000\u0086\u0088\u00038\u001c\u0000\u0087\u0082\u0001\u0000\u0000\u0000"+
		"\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u000b\u0001\u0000\u0000\u0000\u0089\u008e\u0003\u000e\u0007\u0000"+
		"\u008a\u008b\u0005\u001c\u0000\u0000\u008b\u008d\u0003\u000e\u0007\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\r\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0097\u0003\b\u0004\u0000\u0092\u0093\u0005\u0013\u0000\u0000\u0093\u0094"+
		"\u0003\u001a\r\u0000\u0094\u0095\u0005\u0014\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001"+
		"\u0000\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000\u0098\u009d\u0003"+
		"\u0012\t\u0000\u0099\u009a\u0005\u0017\u0000\u0000\u009a\u009c\u0003\u0012"+
		"\t\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a8\u0005!\u0000\u0000\u00a1\u00a8\u0003>\u001f\u0000\u00a2"+
		"\u00a8\u0005\u0006\u0000\u0000\u00a3\u00a4\u0005\u0013\u0000\u0000\u00a4"+
		"\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a8\u0013\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0003\u0016\u000b\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000\u00ab"+
		"\u00ad\u0003\u0016\u000b\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b8\u0003\b\u0004\u0000\u00b2\u00b8"+
		"\u0005\u0006\u0000\u0000\u00b3\u00b4\u0005\u0013\u0000\u0000\u00b4\u00b5"+
		"\u0003\u001e\u000f\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b8\u0017"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003\u001a\r\u0000\u00ba\u00bd\u0003"+
		"\u001c\u000e\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00c9\u0003"+
		"\f\u0006\u0000\u00bf\u00c2\u0005\u001c\u0000\u0000\u00c0\u00c3\u0003\f"+
		"\u0006\u0000\u00c1\u00c3\u0003\u0014\n\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c8\u0005\u001b\u0000\u0000\u00c5\u00c8\u0005\u001a\u0000"+
		"\u0000\u00c6\u00c8\u0005\u0019\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d4\u0003\u0010\b\u0000\u00cd\u00d0\u0005\u0017\u0000\u0000"+
		"\u00ce\u00d1\u0003\u0010\b\u0000\u00cf\u00d1\u0003\u0014\n\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00df\u0003\u0014\n\u0000\u00d8\u00db"+
		"\u0005\u001d\u0000\u0000\u00d9\u00dc\u0003\u0014\n\u0000\u00da\u00dc\u0003"+
		"\u0010\b\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u001f\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\"\u0011"+
		"\u0000\u00e3\u00e4\u0005\u0010\u0000\u0000\u00e4\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0003$\u0012\u0000\u00e6\u00e8\u0003&\u0013\u0000\u00e7"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005\u0005\u0000\u0000\u00ea\u00ed\u0005!\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0018\u0000\u0000\u00ec\u00ee\u0003\n\u0005\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee#\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0\u00f4\u0005\u0015\u0000"+
		"\u0000\u00f1\u00f5\u0005\u001e\u0000\u0000\u00f2\u00f5\u0005!\u0000\u0000"+
		"\u00f3\u00f5\u0003>\u001f\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0016\u0000\u0000\u00f7"+
		"%\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0007\u0000\u0000\u00f9\u00fa"+
		"\u0005!\u0000\u0000\u00fa\u00fb\u0005\u0013\u0000\u0000\u00fb\u00fc\u0005"+
		"\u0005\u0000\u0000\u00fc\u0102\u0005!\u0000\u0000\u00fd\u00fe\u0005\u0002"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff\u0101\u0005!\u0000"+
		"\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u0107\u0005\u000f\u0000"+
		"\u0000\u0107\u0108\u0005\u0005\u0000\u0000\u0108\u0110\u0003\u0006\u0003"+
		"\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u010b\u0005!\u0000\u0000"+
		"\u010b\u010c\u0005\u0001\u0000\u0000\u010c\u010d\u0005\u000f\u0000\u0000"+
		"\u010d\u010e\u0005\u0005\u0000\u0000\u010e\u0110\u0003\u0006\u0003\u0000"+
		"\u010f\u00f8\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000\u0000"+
		"\u0110\'\u0001\u0000\u0000\u0000\u0111\u0114\u0003*\u0015\u0000\u0112"+
		"\u0114\u0003,\u0016\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114)\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"\r\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000\u0117\u0118\u0003\u0006"+
		"\u0003\u0000\u0118+\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u000e\u0000"+
		"\u0000\u011a\u011b\u0005\u0013\u0000\u0000\u011b\u011c\u0003\"\u0011\u0000"+
		"\u011c\u011d\u0005\u0010\u0000\u0000\u011d\u011e\u0003\u0018\f\u0000\u011e"+
		"\u011f\u0005\u0010\u0000\u0000\u011f\u0120\u0005!\u0000\u0000\u0120\u0121"+
		"\u0007\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005\u0014\u0000\u0000\u0123\u0124\u0003\u0006\u0003\u0000\u0124-\u0001"+
		"\u0000\u0000\u0000\u0125\u0129\u00030\u0018\u0000\u0126\u0129\u00032\u0019"+
		"\u0000\u0127\u0129\u00034\u001a\u0000\u0128\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129/\u0001\u0000\u0000\u0000\u012a\u012b\u0005\n\u0000\u0000\u012b"+
		"\u012c\u0003\u0018\f\u0000\u012c\u012d\u0003\u0006\u0003\u0000\u012d1"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u000b\u0000\u0000\u012f\u0130"+
		"\u0003\u0018\f\u0000\u0130\u0131\u0003\u0006\u0003\u0000\u01313\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u0003\u0006"+
		"\u0003\u0000\u01345\u0001\u0000\u0000\u0000\u0135\u0138\u00038\u001c\u0000"+
		"\u0136\u0138\u0003:\u001d\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u01387\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005!\u0000\u0000\u013a\u013d\u0005\u0013\u0000\u0000\u013b\u013e\u0003"+
		"\n\u0005\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005\u0014\u0000\u0000\u01409\u0001\u0000\u0000"+
		"\u0000\u0141\u0144\u0005!\u0000\u0000\u0142\u0144\u0003>\u001f\u0000\u0143"+
		"\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0018\u0000\u0000\u0146"+
		"\u0147\u0003\n\u0005\u0000\u0147;\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005\u0003\u0000\u0000\u0149\u014a\u0005 \u0000\u0000\u014a=\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0005!\u0000\u0000\u014c\u0150\u0005\u0015\u0000"+
		"\u0000\u014d\u0151\u0005\u001e\u0000\u0000\u014e\u0151\u0005!\u0000\u0000"+
		"\u014f\u0151\u0003>\u001f\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0016\u0000\u0000\u0153"+
		"?\u0001\u0000\u0000\u0000\u0154\u0155\u0005\t\u0000\u0000\u0155\u0156"+
		"\u0003\n\u0005\u0000\u0156A\u0001\u0000\u0000\u0000 D]_su\u0080\u0087"+
		"\u008e\u0096\u009d\u00a7\u00ae\u00b7\u00bc\u00c2\u00c7\u00c9\u00d0\u00d4"+
		"\u00db\u00df\u00e7\u00ed\u00f4\u0102\u010f\u0113\u0128\u0137\u013d\u0143"+
		"\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}