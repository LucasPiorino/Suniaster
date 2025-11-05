# Generated from Suniaster.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SuniasterParser import SuniasterParser
else:
    from SuniasterParser import SuniasterParser

# This class defines a complete listener for a parse tree produced by SuniasterParser.
class SuniasterListener(ParseTreeListener):

    # Enter a parse tree produced by SuniasterParser#programa.
    def enterPrograma(self, ctx:SuniasterParser.ProgramaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#programa.
    def exitPrograma(self, ctx:SuniasterParser.ProgramaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#linha.
    def enterLinha(self, ctx:SuniasterParser.LinhaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#linha.
    def exitLinha(self, ctx:SuniasterParser.LinhaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#declaracao.
    def enterDeclaracao(self, ctx:SuniasterParser.DeclaracaoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#declaracao.
    def exitDeclaracao(self, ctx:SuniasterParser.DeclaracaoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#comando.
    def enterComando(self, ctx:SuniasterParser.ComandoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#comando.
    def exitComando(self, ctx:SuniasterParser.ComandoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#condicional.
    def enterCondicional(self, ctx:SuniasterParser.CondicionalContext):
        pass

    # Exit a parse tree produced by SuniasterParser#condicional.
    def exitCondicional(self, ctx:SuniasterParser.CondicionalContext):
        pass


    # Enter a parse tree produced by SuniasterParser#bloco.
    def enterBloco(self, ctx:SuniasterParser.BlocoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#bloco.
    def exitBloco(self, ctx:SuniasterParser.BlocoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#repeticao.
    def enterRepeticao(self, ctx:SuniasterParser.RepeticaoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#repeticao.
    def exitRepeticao(self, ctx:SuniasterParser.RepeticaoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#escrita.
    def enterEscrita(self, ctx:SuniasterParser.EscritaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#escrita.
    def exitEscrita(self, ctx:SuniasterParser.EscritaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#listaArgs.
    def enterListaArgs(self, ctx:SuniasterParser.ListaArgsContext):
        pass

    # Exit a parse tree produced by SuniasterParser#listaArgs.
    def exitListaArgs(self, ctx:SuniasterParser.ListaArgsContext):
        pass


    # Enter a parse tree produced by SuniasterParser#atribuicao.
    def enterAtribuicao(self, ctx:SuniasterParser.AtribuicaoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#atribuicao.
    def exitAtribuicao(self, ctx:SuniasterParser.AtribuicaoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#destino.
    def enterDestino(self, ctx:SuniasterParser.DestinoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#destino.
    def exitDestino(self, ctx:SuniasterParser.DestinoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#expressao.
    def enterExpressao(self, ctx:SuniasterParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#expressao.
    def exitExpressao(self, ctx:SuniasterParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#exprLogica.
    def enterExprLogica(self, ctx:SuniasterParser.ExprLogicaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#exprLogica.
    def exitExprLogica(self, ctx:SuniasterParser.ExprLogicaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#exprComparacao.
    def enterExprComparacao(self, ctx:SuniasterParser.ExprComparacaoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#exprComparacao.
    def exitExprComparacao(self, ctx:SuniasterParser.ExprComparacaoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#exprSoma.
    def enterExprSoma(self, ctx:SuniasterParser.ExprSomaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#exprSoma.
    def exitExprSoma(self, ctx:SuniasterParser.ExprSomaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#exprMult.
    def enterExprMult(self, ctx:SuniasterParser.ExprMultContext):
        pass

    # Exit a parse tree produced by SuniasterParser#exprMult.
    def exitExprMult(self, ctx:SuniasterParser.ExprMultContext):
        pass


    # Enter a parse tree produced by SuniasterParser#exprPrimaria.
    def enterExprPrimaria(self, ctx:SuniasterParser.ExprPrimariaContext):
        pass

    # Exit a parse tree produced by SuniasterParser#exprPrimaria.
    def exitExprPrimaria(self, ctx:SuniasterParser.ExprPrimariaContext):
        pass


    # Enter a parse tree produced by SuniasterParser#acesso.
    def enterAcesso(self, ctx:SuniasterParser.AcessoContext):
        pass

    # Exit a parse tree produced by SuniasterParser#acesso.
    def exitAcesso(self, ctx:SuniasterParser.AcessoContext):
        pass


    # Enter a parse tree produced by SuniasterParser#listaLiteral.
    def enterListaLiteral(self, ctx:SuniasterParser.ListaLiteralContext):
        pass

    # Exit a parse tree produced by SuniasterParser#listaLiteral.
    def exitListaLiteral(self, ctx:SuniasterParser.ListaLiteralContext):
        pass


    # Enter a parse tree produced by SuniasterParser#literal.
    def enterLiteral(self, ctx:SuniasterParser.LiteralContext):
        pass

    # Exit a parse tree produced by SuniasterParser#literal.
    def exitLiteral(self, ctx:SuniasterParser.LiteralContext):
        pass



del SuniasterParser