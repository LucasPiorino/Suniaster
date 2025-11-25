import os
from antlr4 import *
from SuniasterLexer import SuniasterLexer
from SuniasterParser import SuniasterParser
from antlr4.tree.Trees import Trees
import graphviz


GV_BIN = r"C:\Program Files\Graphviz\bin"
if GV_BIN not in os.environ.get("PATH", ""):
    os.environ["PATH"] = GV_BIN + os.pathsep + os.environ.get("PATH", "")

def gerar_arvore(caminho):
    stream = FileStream(caminho, encoding='utf-8')
    lexer = SuniasterLexer(stream)
    tokens = CommonTokenStream(lexer)
    parser = SuniasterParser(tokens)
    arvore = parser.programa()

    texto = Trees.toStringTree(arvore, None, parser)
    print(texto)

    dot = graphviz.Digraph(comment="Árvore Sintática - Suniaster", format="png")
    dot.attr(rankdir='TB', splines='true', concentrate='true', nodesep='0.25', ranksep='0.35')

    def add_node(dot, node, parent_name=None):
        name = str(id(node))
        label = Trees.getNodeText(node, parser.ruleNames)


        cor = "black"
        forma = "ellipse"

        if label in ["programa", "linha", "bloco"]:
            cor = "#0055FF"  
            forma = "box"
        elif label in ["condicional", "repeticao", "escrita", "atribuicao", "declaracao"]:
            cor = "#FF8800"  
            forma = "folder"
        elif label in ["expressao", "exprLogica", "exprComparacao", "exprSoma", "exprMult", "exprPrimaria", "acesso", "listaLiteral"]:
            cor = "#00AA00"  
        elif label in ["literal", "NUM_INT", "NUM_REAL", "STRING", "VERDADEIRO", "FALSO", "NULO"]:
            cor = "#AA00FF" 
        elif label in ["SE", "ENTAO", "SENAO", "FIM", "ENQUANTO", "ESCREVA"]:
            cor = "#CC0000"  
            forma = "diamond"
        elif label in ["TIPO", "ID", "ATRIB", "VIRGULA", "ABRE_PAREN", "FECHA_PAREN", "ABRE_COL", "FECHA_COL", "OP_REL", "OP_ARIT_SOMA", "OP_ARIT_MULT", "OP_LOG"]:
            cor = "#000000"
            forma = "note"

        dot.node(name, label, color=cor, fontcolor=cor, shape=forma)

        for i in range(node.getChildCount()):
            child = node.getChild(i)
            add_node(dot, child, name)

        if parent_name:
            dot.edge(parent_name, name, color="#888888")

    add_node(dot, arvore)

    dot.render("Arvore_Sintatica_Suniaster", cleanup=True)
    print("✅ Árvore sintática salva como Arvore_Sintatica_Suniaster.png")

if __name__ == "__main__":
    gerar_arvore("teste.suni")
