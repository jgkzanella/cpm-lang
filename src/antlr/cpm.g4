grammar cpm;

@header {
    package antlr;
}

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
TIPO: 'int' | 'float' | 'void' | 'double' | 'str' | 'bool';

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

// Nome de variáveis e funções
ID: (LETRA | '_')(DIGITO | LETRA | '_')* ;

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

/*
 -------------------------------------------- Estrutura --------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

// Estrutura padrão de um programa cpm
programa:
    global funcao_principal?
    ;

funcao_principal:
    DEF MAIN '()' '::' TIPO bloco ';'
    ;

global:
    (
    bloco
    | expressao
    | declaracao
    | repeticao
    | condicional
    | chamada
    )*
    ;

// Um bloco é tudo aquilo em que é necessário {}
bloco:
   '{'
   (
    bloco
    | vetor
    | funcao
    | expressao
    | declaracao
    | repeticao
    | condicional
    | chamada
   )*
   '}'
   ;


/*
 -------------------------------------------- Auxiliares -------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

// Necessário para não causar recursão à esquerda nas expressões
// Mudar nome

argumento:
    NUM_FLOAT
    | NUM_INT
    | STR
    | BOOL
    | ID
    | vetor
    | funcao
    ;

tipos_atribuicao:
    argumento
    | expressao
    ;

parametro:
    ((argumento | expressao) (',' (argumento | expressao))*)
    ;

indice:
    (NUM_INT | ID | vetor | funcao | expressao)
    ;

termo_aritmetico:
    fator_aritmetico (OP_ARIT fator_aritmetico)*
    ;

fator_aritmetico:
    argumento | '(' expressao_aritmetica ')'
    ;

termo_logico:
    fator_logico (OP_LOG fator_logico)*
    ;

fator_logico:
    ID | vetor | BOOL | '(' expressao_logica ')'
    ;

termo_relacional:
    fator_relacional (OP_REL fator_relacional)*
    ;

fator_relacional:
    argumento  | BOOL | '(' expressao_relacional ')'
    ;

/*
 -------------------------------------------- Expressões -------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

expressao:
    expressao_aritmetica
    | expressao_logica
    | expressao_relacional
    | expressao_reduzida
    ;

expressao_reduzida:
    ID (MENOSMENOS | MAISMAIS | MAISMENOS)
    ;

expressao_aritmetica:
    termo_aritmetico ((OP_ARIT (termo_aritmetico | termo_relacional)))*
    ;

expressao_logica:
    termo_logico (OP_LOG (termo_logico | termo_relacional))*
    ;

expressao_relacional:
    termo_relacional (OP_REL (termo_relacional | termo_logico))*
    ;

/*
 -------------------------------------------- Declarações ------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

declaracao:
    declaracao_variavel
    | declaracao_vetor
    | declaracao_funcao
    ;

declaracao_variavel:
    TIPO ID ('=' (argumento | expressao))? ';'
    ;

declaracao_vetor:
    TIPO '[' (NUM_INT | ID | vetor) ']' ID ('=' '{' parametro? '}')? ';'
    ;

declaracao_funcao:
    DEF ID '(' (TIPO ID (',' TIPO ID)*) ')' '::' TIPO  bloco? ';'
    | DEF ID '()' '::' TIPO  bloco? ';'
    ;

/*
 -------------------------------------------- Repetições -------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

repeticao:
    repeticao_while
    | repeticao_for
    ;

repeticao_while:
    WHILE expressao bloco
    ;

repeticao_for:
    FOR '(' declaracao_variavel expressao ';' expressao_reduzida ')' bloco
    ;

/*
 -------------------------------------------- Condicionais -----------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

condicional:
    condicional_if
    | condcional_ifse
    | condicional_else
    ;

condicional_if:
    IF expressao bloco
    ;

condcional_ifse:
    IFSE expressao bloco
    ;

condicional_else:
    ELSE bloco
    ;

/*
 -------------------------------------------- Chamadas ---------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

chamada:
    chamada_funcao
    | chamada_atribuicao
    | chamada_importar
    | chamada_retornar
    | chamada_reduzida
    ;

chamada_reduzida:
    expressao_reduzida ';'
    ;

chamada_funcao:
    ID '(' parametro? ')'  ';'
    ;

chamada_atribuicao:
    (ID | vetor) '=' tipos_atribuicao ';'
    ;

chamada_importar:
    USE STR ';'
    ;

chamada_retornar:
    RETURN tipos_atribuicao ';'
    ;

/*
 -------------------------------------------- Outros -----------------------------------------------------
----------------------------------------------------------------------------------------------------------
*/

vetor:
    ID '[' indice ']'
    ;

funcao:
    ID '(' parametro? ')'
    ;
