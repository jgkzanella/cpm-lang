// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cpmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cpmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cpmParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(cpmParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#funcao_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao_principal(cpmParser.Funcao_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(cpmParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(cpmParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(cpmParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#tipos_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_atribuicao(cpmParser.Tipos_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(cpmParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#indice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndice(cpmParser.IndiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#termo_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_aritmetico(cpmParser.Termo_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#fator_aritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_aritmetico(cpmParser.Fator_aritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(cpmParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(cpmParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#termo_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_relacional(cpmParser.Termo_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#fator_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_relacional(cpmParser.Fator_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(cpmParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#expressao_reduzida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_reduzida(cpmParser.Expressao_reduzidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_aritmetica(cpmParser.Expressao_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#expressao_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_logica(cpmParser.Expressao_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#expressao_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_relacional(cpmParser.Expressao_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(cpmParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#declaracao_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_variavel(cpmParser.Declaracao_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#declaracao_vetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_vetor(cpmParser.Declaracao_vetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#declaracao_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_funcao(cpmParser.Declaracao_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(cpmParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#repeticao_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao_while(cpmParser.Repeticao_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#repeticao_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao_for(cpmParser.Repeticao_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(cpmParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#condicional_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_if(cpmParser.Condicional_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#condcional_ifse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondcional_ifse(cpmParser.Condcional_ifseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#condicional_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_else(cpmParser.Condicional_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada(cpmParser.ChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada_reduzida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_reduzida(cpmParser.Chamada_reduzidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada_funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_funcao(cpmParser.Chamada_funcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_atribuicao(cpmParser.Chamada_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada_importar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_importar(cpmParser.Chamada_importarContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#chamada_retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_retornar(cpmParser.Chamada_retornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#vetor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVetor(cpmParser.VetorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cpmParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(cpmParser.FuncaoContext ctx);
}