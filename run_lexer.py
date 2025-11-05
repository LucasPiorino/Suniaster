import sys
from antlr4 import FileStream, CommonTokenStream
from antlr4 import InputStream
from SuniasterLexer import SuniasterLexer

# esse script lê um arquivo .suni e imprime os tokens gerados pelo lexer

def listar_tokens(caminho_arquivo):
    # Lê o código fonte Suniaster
    stream = FileStream(caminho_arquivo, encoding='utf-8')

    # Cria o lexer
    lexer = SuniasterLexer(stream)

    # Gera a lista de tokens
    tokens = lexer.getAllTokens()

    # Mostra cada token encontrado
    for t in tokens:
        print(f"Token: {t.text!r}  ->  Tipo: {lexer.symbolicNames[t.type]}  (pos {t.start}:{t.stop})")

if __name__ == "__main__":
    # você pode trocar "teste.suni" por outro arquivo depois
    listar_tokens("teste.suni")
