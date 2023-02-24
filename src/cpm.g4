grammar cpm;

/*
 -------------------------------------------- LEXER RULES ------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Incluir bibliotecas
USE: 'use' ;

// Comentário
COMMENT: '/*' .* '*/' ;

// Tipos primitivos
TIPO: 'int' | 'float' | 'void' | 'double' | 'str' ;

// Booleanos
BOOL: 'true' | 'false' ;

// Definir funções
DEF: 'def' ;

// Função principal
MAIN: 'main' ;

// Retorno de valor por função
RETURN: 'return' ;

// Estruturas condicionais
IF: 'if' ;
IFSE: 'ifse' ;
ELSE: 'else' ;

// Estruturas de repetição
WHILE: 'while' ;
FOR: 'for' ;

// Separadores
SEP_RE: '::' ;
SEP_EX: ';' ;

// Delimitadores
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
ACOL : '[' ;
FCOL : ']' ;

// Operadores lógicos
OP_LOG: 'and' | 'or' | 'not' ;

// Nome de variáveis e funções
VARIAVEL: (LETRA | '_')(DIGITO | LETRA | '_')* ;

// Atribuição
ATR: '=' ;

// Operadores aritméticos
MAISMENOS: '+-' ;
MAISMAIS: '++' ;
MENOSMENOS: '--' ;
OP_ARIT: '+' | '-' | '*' | '/' | '%' ;

// Operadores relacionais
OP_REL: '<' | '<=' | '>=' | '>' | '==' | '!=' ;

// Números
NUM_INT: ('-' | '+')?DIGITO+ ;
NUM_FLOAT: ('-' | '+')?DIGITO+('.'DIGITO+) ;

// Strings
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;

// Caracteres inúteis
WS: [ \r\t\n]* -> skip ;

// Erro
ERROR: . ;

/*
 -------------------------------------------- PARSER RULES -----------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

programa:
    declaracoes_externas funcao_principal?
    ;

declaracoes_externas:
    (
    importar
    | declaracao_variavel
    | declaracao_funcao
    | declaracao_vetor
    | bloco
    | funcao
    | expressao_aritmetica
    | repeticao_while
    | condicional_if
    | condcional_ifse
    | condicional_else
    | repeticao_for
    | atribuicao
    )*
    ;

importar:
    USE STR ';'
    ;

retornar:
    RETURN (primitivos | VARIAVEL) ';'
    ;

primitivos:
    (NUM_FLOAT | NUM_INT | STR)
    ;

expressao_aritmetica:
    '(' (primitivos | VARIAVEL ) OP_ARIT (expressao_aritmetica | primitivos | VARIAVEL) ')' |
        (primitivos | VARIAVEL ) OP_ARIT (expressao_aritmetica | primitivos | VARIAVEL)     |
        VARIAVEL (MAISMAIS | MAISMENOS | MENOSMENOS) ';'
    ;

condicao:
     '(' (tipos_loop (OP_REL | OP_LOG) tipos_loop (OP_LOG tipos_loop (OP_REL | OP_LOG) tipos_loop)*) ')' |
         (tipos_loop (OP_REL | OP_LOG) tipos_loop (OP_LOG tipos_loop (OP_REL | OP_LOG) tipos_loop)*)
    ;

expressao_relacional:
    '(' (BOOL | VARIAVEL | primitivos) OP_REL (expressao_relacional | BOOL | VARIAVEL) ')' |
        (BOOL | VARIAVEL | primitivos) OP_REL (expressao_relacional | BOOL | VARIAVEL)     |
    ;

expressao_logica:
    '(' (BOOL | VARIAVEL) OP_LOG (expressao_logica | BOOL | VARIAVEL) ')' |
        (BOOL | VARIAVEL) OP_LOG (expressao_logica | BOOL | VARIAVEL)     |
    ;

declaracao_variavel:
    TIPO VARIAVEL ('=' (primitivos | expressao_aritmetica | funcao))? ';'
    ;

bloco:
   '{'
   (
   declaracao_variavel
   | importar
   | expressao_aritmetica
   | funcao
   | declaracao_funcao
   | repeticao_while
   | condicional_if
   | condcional_ifse
   | condicional_else
   | retornar
   | declaracao_vetor
   | repeticao_for
   | vetor
   | atribuicao
   )*
   '}'
   ;

atribuicao:
    VARIAVEL '=' (primitivos | expressao_aritmetica | funcao)
    ;

declaracao_funcao:
    DEF VARIAVEL '(' (TIPO VARIAVEL (',' TIPO VARIAVEL)*) ')' '::' TIPO  bloco |
    DEF VARIAVEL '()' '::' TIPO  bloco  // Gambiarra
    ;

funcao:
    VARIAVEL '(' (primitivos | /*vazio*/ | vetor | VARIAVEL | expressao_aritmetica | expressao_logica | expressao_relacional) ')' ';'
    ;

declaracao_vetor:
    TIPO '[' (NUM_INT | VARIAVEL) ']' VARIAVEL ';'
    ;

vetor:
    VARIAVEL '[' (NUM_INT | VARIAVEL) ']'
    ;

tipos_loop:  // Mudar nome
    VARIAVEL | primitivos | expressao_aritmetica | BOOL | expressao_logica | expressao_relacional
    ;

repeticao_while:
    WHILE condicao bloco
    ;

repeticao_for:
    FOR '(' declaracao_variavel  condicao ';' (VARIAVEL (MAISMAIS | MAISMENOS | MENOSMENOS)) ')' bloco
    ;

condicional_if:
    IF condicao bloco
    ;

condcional_ifse:
    IFSE condicao bloco
    ;

condicional_else:
    ELSE bloco
    ;

funcao_principal:
    DEF MAIN '()' '::' TIPO bloco
    ;