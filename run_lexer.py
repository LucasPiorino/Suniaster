import sys
from antlr4 import FileStream, CommonTokenStream
from antlr4 import InputStream
from SuniasterLexer import SuniasterLexer



def listar_tokens(caminho_arquivo):

    stream = FileStream(caminho_arquivo, encoding='utf-8')


    lexer = SuniasterLexer(stream)


    tokens = lexer.getAllTokens()


    for t in tokens:
        print(f"Token: {t.text!r}  ->  Tipo: {lexer.symbolicNames[t.type]}  (pos {t.start}:{t.stop})")

if __name__ == "__main__":
    listar_tokens("teste.suni")
