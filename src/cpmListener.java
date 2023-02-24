// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cpmParser}.
 */
public interface cpmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cpmParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(cpmParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(cpmParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#funcao_principal}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_principal(cpmParser.Funcao_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#funcao_principal}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_principal(cpmParser.Funcao_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#declaracoes_externas}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_externas(cpmParser.Declaracoes_externasContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#declaracoes_externas}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_externas(cpmParser.Declaracoes_externasContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(cpmParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(cpmParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#tipos_primitivos}.
	 * @param ctx the parse tree
	 */
	void enterTipos_primitivos(cpmParser.Tipos_primitivosContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#tipos_primitivos}.
	 * @param ctx the parse tree
	 */
	void exitTipos_primitivos(cpmParser.Tipos_primitivosContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#tipos_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterTipos_atribuicao(cpmParser.Tipos_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#tipos_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitTipos_atribuicao(cpmParser.Tipos_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_aritmetico(cpmParser.Termo_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_aritmetico(cpmParser.Termo_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#fator_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFator_aritmetico(cpmParser.Fator_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#fator_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFator_aritmetico(cpmParser.Fator_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(cpmParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(cpmParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(cpmParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(cpmParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void enterTermo_relacional(cpmParser.Termo_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#termo_relacional}.
	 * @param ctx the parse tree
	 */
	void exitTermo_relacional(cpmParser.Termo_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#fator_relacional}.
	 * @param ctx the parse tree
	 */
	void enterFator_relacional(cpmParser.Fator_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#fator_relacional}.
	 * @param ctx the parse tree
	 */
	void exitFator_relacional(cpmParser.Fator_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(cpmParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(cpmParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(cpmParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(cpmParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(cpmParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(cpmParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_relacional(cpmParser.Expressao_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#expressao_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_relacional(cpmParser.Expressao_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(cpmParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(cpmParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variavel(cpmParser.Declaracao_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variavel(cpmParser.Declaracao_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#declaracao_vetor}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_vetor(cpmParser.Declaracao_vetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#declaracao_vetor}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_vetor(cpmParser.Declaracao_vetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcao(cpmParser.Declaracao_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcao(cpmParser.Declaracao_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(cpmParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(cpmParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#repeticao_while}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_while(cpmParser.Repeticao_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#repeticao_while}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_while(cpmParser.Repeticao_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#repeticao_for}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao_for(cpmParser.Repeticao_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#repeticao_for}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao_for(cpmParser.Repeticao_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(cpmParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(cpmParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_if(cpmParser.Condicional_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_if(cpmParser.Condicional_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#condcional_ifse}.
	 * @param ctx the parse tree
	 */
	void enterCondcional_ifse(cpmParser.Condcional_ifseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#condcional_ifse}.
	 * @param ctx the parse tree
	 */
	void exitCondcional_ifse(cpmParser.Condcional_ifseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#condicional_else}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_else(cpmParser.Condicional_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#condicional_else}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_else(cpmParser.Condicional_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(cpmParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(cpmParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(cpmParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(cpmParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(cpmParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(cpmParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#importar}.
	 * @param ctx the parse tree
	 */
	void enterImportar(cpmParser.ImportarContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#importar}.
	 * @param ctx the parse tree
	 */
	void exitImportar(cpmParser.ImportarContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#vetor}.
	 * @param ctx the parse tree
	 */
	void enterVetor(cpmParser.VetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#vetor}.
	 * @param ctx the parse tree
	 */
	void exitVetor(cpmParser.VetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cpmParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(cpmParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link cpmParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(cpmParser.RetornarContext ctx);
}