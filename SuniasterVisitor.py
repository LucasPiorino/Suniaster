# Generated from Suniaster.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SuniasterParser import SuniasterParser
else:
    from SuniasterParser import SuniasterParser

# This class defines a complete generic visitor for a parse tree produced by SuniasterParser.

class SuniasterVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SuniasterParser#programa.
    def visitPrograma(self, ctx:SuniasterParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#linha.
    def visitLinha(self, ctx:SuniasterParser.LinhaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#declaracao.
    def visitDeclaracao(self, ctx:SuniasterParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#comando.
    def visitComando(self, ctx:SuniasterParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#condicional.
    def visitCondicional(self, ctx:SuniasterParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#bloco.
    def visitBloco(self, ctx:SuniasterParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#repeticao.
    def visitRepeticao(self, ctx:SuniasterParser.RepeticaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#escrita.
    def visitEscrita(self, ctx:SuniasterParser.EscritaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#listaArgs.
    def visitListaArgs(self, ctx:SuniasterParser.ListaArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#leitura.
    def visitLeitura(self, ctx:SuniasterParser.LeituraContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#atribuicao.
    def visitAtribuicao(self, ctx:SuniasterParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#destino.
    def visitDestino(self, ctx:SuniasterParser.DestinoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#expressao.
    def visitExpressao(self, ctx:SuniasterParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#exprLogica.
    def visitExprLogica(self, ctx:SuniasterParser.ExprLogicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#exprComparacao.
    def visitExprComparacao(self, ctx:SuniasterParser.ExprComparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#exprSoma.
    def visitExprSoma(self, ctx:SuniasterParser.ExprSomaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#exprMult.
    def visitExprMult(self, ctx:SuniasterParser.ExprMultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#exprPrimaria.
    def visitExprPrimaria(self, ctx:SuniasterParser.ExprPrimariaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#acesso.
    def visitAcesso(self, ctx:SuniasterParser.AcessoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#listaLiteral.
    def visitListaLiteral(self, ctx:SuniasterParser.ListaLiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SuniasterParser#literal.
    def visitLiteral(self, ctx:SuniasterParser.LiteralContext):
        return self.visitChildren(ctx)



del SuniasterParser