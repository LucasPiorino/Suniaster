grammar Suniaster;

// ============================================================================
// PARTE 1: REGRAS DO PARSER
// ============================================================================
//
// Ideia geral:
// programa -> várias linhas;
// linha -> pode ser declaração, comando, etc.
// comando -> if/while/escreva/leia/atribuição
//
// Também definimos expressões com precedência:
// nivel lógico (e/ou) > comparação (> < == ...) > soma/sub > mult/div > primário
// ============================================================================

// programa completo: várias linhas até EOF
programa
    : linha* EOF
    ;

// uma "linha" do programa pode ser:
// - declaração de variável com atribuição inicial
// - comando de controle/ação
linha
    : declaracao
    | comando
    ;

// --------------------------------------------------------------------------
// DECLARAÇÃO DE VARIÁVEL
// Ex: inteiro contador = 0
//     lista nomes = ["Frieren", "Himmel"]
// --------------------------------------------------------------------------
declaracao
    : TIPO ID ATRIB expressao
    ;

// --------------------------------------------------------------------------
// COMANDOS
// --------------------------------------------------------------------------
comando
    : condicional
    | repeticao
    | escrita
    | leitura
    | atribuicao
    ;

// --------------------------------------------------------------------------
// IF / ELSE
// se <expressao> então
//     <linhas>
// senão
//     <linhas>
// fim
// "senão" é opcional
// --------------------------------------------------------------------------
condicional
    : SE expressao ENTAO bloco (SENAO bloco)? FIM
    ;

// bloco interno: uma ou mais linhas
bloco
    : linha*
    ;

// --------------------------------------------------------------------------
// ENQUANTO
// enquanto <expressao> então
//     <linhas>
// fim
// --------------------------------------------------------------------------
repeticao
    : ENQUANTO expressao ENTAO bloco FIM
    ;

// --------------------------------------------------------------------------
// ESCREVA
// escreva("texto", x, y)
// escreva("Herói: ", nomes[contador])
// --------------------------------------------------------------------------
escrita
    : ESCREVA ABRE_PAREN listaArgs? FECHA_PAREN
    ;

// argumentos de escrita separados por vírgula
listaArgs
    : expressao (VIRGULA expressao)*
    ;

// --------------------------------------------------------------------------
// LEIA
// leia(variavel)
// leia(nomes[0])
// --------------------------------------------------------------------------
leitura
    : LEIA ABRE_PAREN destino FECHA_PAREN
    ;

// --------------------------------------------------------------------------
// ATRIBUIÇÃO
// x = x + 1
// nomes[0] = "Frieren"
// --------------------------------------------------------------------------
atribuicao
    : destino ATRIB expressao
    ;

// destino de atribuição pode ser uma variável simples (ID)
// ou um acesso por índice: nomes[contador]
destino
    : ID
    | ID ABRE_COL expressao FECHA_COL
    ;

// ============================================================================
// EXPRESSÕES
// ============================================================================
//
// Ordem de precedência que vamos aplicar (de menor prioridade pra maior):
//
// 1) exprLogica      -> usa 'e', 'ou', 'não' / && || !
// 2) exprComparacao  -> x é maior que y, x >= y, x == y ...
// 3) exprSoma        -> +, -, mais, menos
// 4) exprMult        -> *, /, %, vezes, dividido por, resto de
// 5) exprPrimaria    -> literais, IDs, chamadas de função, parênteses, listas
//
// A regra "expressao" começa do nível MAIS EXTERNO (lógica)
// e vai descendo.
// ============================================================================

expressao
    : exprLogica
    ;

// nível lógico: combinações com OP_LOG (e/ou/não/etc.)
exprLogica
    : exprComparacao (OP_LOG exprComparacao)*
    ;

// nível de comparação relacional: <, >, ==, "é maior que", ...
exprComparacao
    : exprSoma (OP_REL exprSoma)*
    ;

// nível de soma/sub
exprSoma
    : exprMult (OP_ARIT_SOMA exprMult)*
    ;

// nível de mult/div/resto
exprMult
    : exprPrimaria (OP_ARIT_MULT exprPrimaria)*
    ;

// nível primário: literais, ID, indexação, lista literal, parênteses
exprPrimaria
    : literal
    | acesso
    | listaLiteral
    | ABRE_PAREN expressao FECHA_PAREN
    ;

// acesso pode ser só ID ou ID[index]
acesso
    : ID
    | ID ABRE_COL expressao FECHA_COL
    ;

// lista/vetor literal: [1, 2, 3]
listaLiteral
    : ABRE_COL (expressao (VIRGULA expressao)*)? FECHA_COL
    ;

// literal: número, string, booleano, nulo
literal
    : NUM_REAL
    | NUM_INT
    | STRING
    | VERDADEIRO
    | FALSO
    | NULO
    ;

// ============================================================================
// PARTE 2: TOKENS DO LEXER
// ============================================================================
//
// IMPORTANTE: dividimos alguns operadores em categorias
// OP_ARIT_SOMA: soma/sub (mais, menos, +, -)
// OP_ARIT_MULT: mult/div/resto (*, /, %, vezes, dividido por, resto de)
// OP_REL: comparação (>, <, >=, ... "é maior que", ...)
// OP_LOG: lógico (e, ou, não, &&, ||, !)
//
// Também incluímos palavras-chave, tipos e símbolos.
// ============================================================================

// -------- Palavras-chave de controle --------
SE          : 'se';
ENTAO       : 'então';
SENAO       : 'senão';
FIM         : 'fim';
ENQUANTO    : 'enquanto';

// -------- IO --------
LEIA        : 'leia';
ESCREVA     : 'escreva';

// -------- Booleanos e nulo --------
VERDADEIRO  : 'verdadeiro';
FALSO       : 'falso';
NULO        : 'nulo';

// -------- Tipos de dado --------
// Obs: "nulo" é valor, não tipo. Tipos aqui são variáveis declaráveis.
TIPO
    : 'inteiro'
    | 'real'
    | 'booleano'
    | 'vetor'
    | 'lista'
    ;

// -------- Palavras reservadas para operadores (ANTES do ID) --------
// CRÍTICO: Devem vir antes de ID para evitar serem capturados como identificadores
MAIS_OP     : 'mais';
MENOS_OP    : 'menos';
VEZES_OP    : 'vezes';
E_OP        : 'e';
OU_OP       : 'ou';

// -------- Identificador --------
// nomes de variáveis: contador, nomes, x1, valor_total
ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// -------- Números --------
NUM_REAL
    : [0-9]+ '.' [0-9]+
    ;

NUM_INT
    : [0-9]+
    ;

// -------- String --------
STRING
    : '"' (~["\r\n])* '"'
    ;

// -------- Símbolos isolados --------
ATRIB       : '=';
VIRGULA     : ',';
ABRE_PAREN  : '(';
FECHA_PAREN : ')';
ABRE_COL    : '[';
FECHA_COL   : ']';

// ============================================================================
// OPERADORES
// ============================================================================
//
// Separação importante:
// - OP_ARIT_SOMA: soma/sub
// - OP_ARIT_MULT: mult/div/resto
// Isso facilita a precedência, porque soma/sub tem menos prioridade que mult/div
// e nós referenciamos cada grupo em exprSoma e exprMult.
//
// ---------------------------------------------------------------------------

// Operadores de soma/subtração
OP_ARIT_SOMA
    : MAIS_OP
    | MENOS_OP
    | '+'
    | '-'
    ;

// Operadores de multiplicação/divisão/resto  
OP_ARIT_MULT
    : VEZES_OP
    | 'dividido' [ ] 'por'
    | 'resto' [ ] 'de'
    | '*'
    | '/'
    | '%'
    ;

// Operadores relacionais (comparação)
OP_REL
    : 'é maior ou igual a'
    | 'é menor ou igual a'
    | 'é maior que'
    | 'é menor que'
    | 'é igual a'
    | 'é diferente de'
    | '>='
    | '<='
    | '>'
    | '<'
    | '=='
    | '!='
    ;

// Operadores lógicos
OP_LOG
    : E_OP
    | OU_OP
    | 'não'
    | '&&'
    | '||'
    | '!'
    ;

// ============================================================================
// IGNORAR ESPAÇOS E COMENTÁRIOS
// Requisito do projeto: espaços em branco, tabs e quebras de linha devem ser
// ignorados pelo parser. Também colocamos comentário de linha começando com //.
// ============================================================================

WS
    : [ \t\r\n]+ -> skip
    ;

COMENTARIO
    : '//' ~[\r\n]* -> skip
    ;
