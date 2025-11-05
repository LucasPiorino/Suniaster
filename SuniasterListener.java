// Generated from Suniaster.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SuniasterParser}.
 */
public interface SuniasterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SuniasterParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SuniasterParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(SuniasterParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(SuniasterParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(SuniasterParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(SuniasterParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(SuniasterParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(SuniasterParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(SuniasterParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(SuniasterParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(SuniasterParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(SuniasterParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(SuniasterParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(SuniasterParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(SuniasterParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(SuniasterParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(SuniasterParser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(SuniasterParser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(SuniasterParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(SuniasterParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#destino}.
	 * @param ctx the parse tree
	 */
	void enterDestino(SuniasterParser.DestinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#destino}.
	 * @param ctx the parse tree
	 */
	void exitDestino(SuniasterParser.DestinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SuniasterParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SuniasterParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogica(SuniasterParser.ExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogica(SuniasterParser.ExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#exprComparacao}.
	 * @param ctx the parse tree
	 */
	void enterExprComparacao(SuniasterParser.ExprComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#exprComparacao}.
	 * @param ctx the parse tree
	 */
	void exitExprComparacao(SuniasterParser.ExprComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#exprSoma}.
	 * @param ctx the parse tree
	 */
	void enterExprSoma(SuniasterParser.ExprSomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#exprSoma}.
	 * @param ctx the parse tree
	 */
	void exitExprSoma(SuniasterParser.ExprSomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void enterExprMult(SuniasterParser.ExprMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#exprMult}.
	 * @param ctx the parse tree
	 */
	void exitExprMult(SuniasterParser.ExprMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#exprPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterExprPrimaria(SuniasterParser.ExprPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#exprPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitExprPrimaria(SuniasterParser.ExprPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#acesso}.
	 * @param ctx the parse tree
	 */
	void enterAcesso(SuniasterParser.AcessoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#acesso}.
	 * @param ctx the parse tree
	 */
	void exitAcesso(SuniasterParser.AcessoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#listaLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListaLiteral(SuniasterParser.ListaLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#listaLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListaLiteral(SuniasterParser.ListaLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuniasterParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SuniasterParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuniasterParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SuniasterParser.LiteralContext ctx);
}