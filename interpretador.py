#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Interpretador para a Linguagem Suniaster
Executa programas .suni usando a árvore sintática gerada pelo ANTLR4
"""

import sys
from antlr4 import *
from SuniasterLexer import SuniasterLexer
from SuniasterParser import SuniasterParser
from SuniasterVisitor import SuniasterVisitor


class SuniasterInterpreter(SuniasterVisitor):
    """
    Interpretador que percorre a árvore sintática e executa o programa
    """
    
    def __init__(self):
        self.variaveis = {}  # Dicionário para armazenar variáveis
        
    def visitPrograma(self, ctx):
        """Executa o programa inteiro"""
        for linha in ctx.linha():
            self.visit(linha)
        return None
    
    def visitLinha(self, ctx):
        """Processa uma linha (declaração ou comando)"""
        if ctx.declaracao():
            return self.visit(ctx.declaracao())
        elif ctx.comando():
            return self.visit(ctx.comando())
    
    # ========================================================================
    # DECLARAÇÕES
    # ========================================================================
    
    def visitDeclaracao(self, ctx):
        """Processa declaração de variável: tipo id = expressao"""
        nome = ctx.ID().getText()
        valor = self.visit(ctx.expressao())
        self.variaveis[nome] = valor
        return None
    
    # ========================================================================
    # COMANDOS
    # ========================================================================
    
    def visitComando(self, ctx):
        """Delega para o tipo específico de comando"""
        if ctx.condicional():
            return self.visit(ctx.condicional())
        elif ctx.repeticao():
            return self.visit(ctx.repeticao())
        elif ctx.escrita():
            return self.visit(ctx.escrita())
        elif ctx.leitura():
            return self.visit(ctx.leitura())
        elif ctx.atribuicao():
            return self.visit(ctx.atribuicao())
    
    def visitCondicional(self, ctx):
        """Executa estrutura se-então-senão-fim"""
        condicao = self.visit(ctx.expressao())
        
        if condicao:
            # Executa bloco do 'então'
            self.visit(ctx.bloco(0))
        elif len(ctx.bloco()) > 1:
            # Executa bloco do 'senão' se existir
            self.visit(ctx.bloco(1))
        
        return None
    
    def visitRepeticao(self, ctx):
        """Executa estrutura enquanto-então-fim"""
        while True:
            condicao = self.visit(ctx.expressao())
            if not condicao:
                break
            self.visit(ctx.bloco())
        
        return None
    
    def visitBloco(self, ctx):
        """Executa um bloco de linhas"""
        for linha in ctx.linha():
            self.visit(linha)
        return None
    
    def visitEscrita(self, ctx):
        """Executa comando escreva(...)"""
        if ctx.listaArgs():
            valores = self.visit(ctx.listaArgs())
            # Converte todos para string e imprime sem espaços extras
            saida = ''.join(str(v) for v in valores)
            print(saida)
        else:
            print()  # escreva() vazio imprime linha em branco
        return None
    
    def visitListaArgs(self, ctx):
        """Processa lista de argumentos separados por vírgula"""
        valores = []
        for expr in ctx.expressao():
            valor = self.visit(expr)
            valores.append(valor)
        return valores
    
    def visitLeitura(self, ctx):
        """Executa comando leia(variavel)"""
        destino_ctx = ctx.destino()
        
        # Lê entrada do usuário
        entrada = input()
        
        # Tenta converter para número, senão mantém como string
        try:
            if '.' in entrada:
                valor = float(entrada)
            else:
                valor = int(entrada)
        except ValueError:
            valor = entrada
        
        # Atribui ao destino
        if destino_ctx.ID():
            nome = destino_ctx.ID().getText()
            self.variaveis[nome] = valor
        else:
            # leia(lista[indice])
            nome = destino_ctx.ID().getText()
            indice = self.visit(destino_ctx.expressao())
            self.variaveis[nome][indice] = valor
        
        return None
    
    def visitAtribuicao(self, ctx):
        """Executa atribuição: destino = expressao"""
        valor = self.visit(ctx.expressao())
        destino_ctx = ctx.destino()
        
        if destino_ctx.ID() and not destino_ctx.expressao():
            # Atribuição simples: x = valor
            nome = destino_ctx.ID().getText()
            self.variaveis[nome] = valor
        else:
            # Atribuição indexada: lista[i] = valor
            nome = destino_ctx.ID().getText()
            indice = self.visit(destino_ctx.expressao())
            self.variaveis[nome][indice] = valor
        
        return None
    
    # ========================================================================
    # EXPRESSÕES
    # ========================================================================
    
    def visitExpressao(self, ctx):
        """Avalia expressão (delega para exprLogica)"""
        return self.visit(ctx.exprLogica())
    
    def visitExprLogica(self, ctx):
        """Avalia expressões lógicas: e, ou, não"""
        if len(ctx.exprComparacao()) == 1:
            # Sem operador lógico
            return self.visit(ctx.exprComparacao(0))
        
        # Com operadores lógicos
        resultado = self.visit(ctx.exprComparacao(0))
        
        for i in range(1, len(ctx.exprComparacao())):
            op = ctx.OP_LOG(i-1).getText()
            direita = self.visit(ctx.exprComparacao(i))
            
            if op in ['e', '&&']:
                resultado = resultado and direita
            elif op in ['ou', '||']:
                resultado = resultado or direita
        
        return resultado
    
    def visitExprComparacao(self, ctx):
        """Avalia expressões relacionais: >, <, ==, etc."""
        if len(ctx.exprSoma()) == 1:
            # Sem operador relacional
            return self.visit(ctx.exprSoma(0))
        
        # Com operadores relacionais
        esquerda = self.visit(ctx.exprSoma(0))
        
        for i in range(1, len(ctx.exprSoma())):
            op = ctx.OP_REL(i-1).getText()
            direita = self.visit(ctx.exprSoma(i))
            
            if op in ['é maior que', '>']:
                esquerda = esquerda > direita
            elif op in ['é menor que', '<']:
                esquerda = esquerda < direita
            elif op in ['é maior ou igual a', '>=']:
                esquerda = esquerda >= direita
            elif op in ['é menor ou igual a', '<=']:
                esquerda = esquerda <= direita
            elif op in ['é igual a', '==']:
                esquerda = esquerda == direita
            elif op in ['é diferente de', '!=']:
                esquerda = esquerda != direita
        
        return esquerda
    
    def visitExprSoma(self, ctx):
        """Avalia soma e subtração"""
        if len(ctx.exprMult()) == 1:
            # Sem operador de soma/sub
            return self.visit(ctx.exprMult(0))
        
        # Com operadores de soma/sub
        resultado = self.visit(ctx.exprMult(0))
        
        for i in range(1, len(ctx.exprMult())):
            op = ctx.OP_ARIT_SOMA(i-1).getText()
            direita = self.visit(ctx.exprMult(i))
            
            if op in ['mais', '+']:
                resultado = resultado + direita
            elif op in ['menos', '-']:
                resultado = resultado - direita
        
        return resultado
    
    def visitExprMult(self, ctx):
        """Avalia multiplicação, divisão e resto"""
        if len(ctx.exprPrimaria()) == 1:
            # Sem operador de mult/div
            return self.visit(ctx.exprPrimaria(0))
        
        # Com operadores de mult/div/resto
        resultado = self.visit(ctx.exprPrimaria(0))
        
        for i in range(1, len(ctx.exprPrimaria())):
            op = ctx.OP_ARIT_MULT(i-1).getText()
            direita = self.visit(ctx.exprPrimaria(i))
            
            if op in ['vezes', '*']:
                resultado = resultado * direita
            elif op in ['dividido por', '/']:
                resultado = resultado / direita
            elif op in ['resto de', '%']:
                resultado = resultado % direita
        
        return resultado
    
    def visitExprPrimaria(self, ctx):
        """Avalia expressões primárias"""
        if ctx.literal():
            return self.visit(ctx.literal())
        elif ctx.acesso():
            return self.visit(ctx.acesso())
        elif ctx.listaLiteral():
            return self.visit(ctx.listaLiteral())
        elif ctx.expressao():
            # Expressão entre parênteses
            return self.visit(ctx.expressao())
    
    def visitAcesso(self, ctx):
        """Acessa variável ou elemento de lista"""
        nome = ctx.ID().getText()
        
        if ctx.expressao():
            # Acesso indexado: lista[i]
            indice = self.visit(ctx.expressao())
            return self.variaveis[nome][indice]
        else:
            # Acesso simples: variavel
            return self.variaveis.get(nome, 0)
    
    def visitListaLiteral(self, ctx):
        """Cria lista literal: [1, 2, 3]"""
        if not ctx.expressao():
            return []  # Lista vazia
        
        elementos = []
        for expr in ctx.expressao():
            elementos.append(self.visit(expr))
        return elementos
    
    def visitLiteral(self, ctx):
        """Retorna valor literal"""
        if ctx.NUM_INT():
            return int(ctx.NUM_INT().getText())
        elif ctx.NUM_REAL():
            return float(ctx.NUM_REAL().getText())
        elif ctx.STRING():
            # Remove aspas
            texto = ctx.STRING().getText()
            return texto[1:-1]
        elif ctx.VERDADEIRO():
            return True
        elif ctx.FALSO():
            return False
        elif ctx.NULO():
            return None


def interpretar_arquivo(caminho):
    """
    Interpreta um arquivo .suni
    """
    try:
        # Lê o arquivo
        stream = FileStream(caminho, encoding='utf-8')
        
        # Cria lexer e parser
        lexer = SuniasterLexer(stream)
        tokens = CommonTokenStream(lexer)
        parser = SuniasterParser(tokens)
        
        # Gera a árvore sintática
        arvore = parser.programa()
        
        # Verifica erros de sintaxe
        if parser.getNumberOfSyntaxErrors() > 0:
            print(f"❌ Erro: O arquivo contém {parser.getNumberOfSyntaxErrors()} erro(s) de sintaxe")
            return False
        
        # Executa o programa
        interpretador = SuniasterInterpreter()
        interpretador.visit(arvore)
        
        return True
        
    except FileNotFoundError:
        print(f"❌ Erro: Arquivo '{caminho}' não encontrado")
        return False
    except Exception as e:
        print(f"❌ Erro durante execução: {e}")
        import traceback
        traceback.print_exc()
        return False


def main():
    """Função principal"""
    if len(sys.argv) < 2:
        print("Uso: python interpretador.py <arquivo.suni>")
        print("\nExemplo:")
        print("  python interpretador.py teste.suni")
        sys.exit(1)
    
    arquivo = sys.argv[1]
    
    print(f"🚀 Executando: {arquivo}")
    print("=" * 50)
    
    sucesso = interpretar_arquivo(arquivo)
    
    print("=" * 50)
    if sucesso:
        print("✅ Sucesso!")
    else:
        print("❌ ERRO!")
        sys.exit(1)


if __name__ == "__main__":
    main()
