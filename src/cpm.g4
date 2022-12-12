grammar cpm;

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

// Incluir bibliotecas
USE: 'use';

// Tipos primitivos
TIPO: 'int' | 'float' | 'void';

// Função principal
MAIN: 'main';

// Definir funções
DEF: 'def';

// Retorno de valor por função
RETURN: 'return';

// Estruturas condicionais
IF: 'if';
IFSE: 'ifse';
ELSE: 'else';

// Estruturas de repetição
WHILE: 'while';
FOR: 'for';

// Separadores
SEP_RE: '::';
SEP_EX: ';';

// Delimitadores
AC: '{';
FC: '}';
AP: '(';
FP: ')';
ACOL : '[';
FCOL : ']';

// Nome de variáveis e funções
ID: (LETRA | '_')(DIGITO | LETRA | '_')*;

// Atribuição
ATR: '=';

// Operadores aritméticos
MAISMENOS: '+-';
MAISMAIS: '++';
MENOSMENOS: '--';
OP_ARIT: '+' | '-' | '*' | '/' | '%';

// Operadores relacionais
OP_REL: ('<' | '<=' | '>=' | '>' | '==' | '!=');

// Operadores lógicos
OP_LOG: ('and' | 'or' | 'not');

// Números
NUM_INT: ('-' | '+')?DIGITO+;
NUM_FLOAT: ('-' | '+')?DIGITO+('.'DIGITO+);

// Strings
STR: '"' ('\\' ["\\] | ~["\\\r\n])* '"';

// Caracteres inúteis
WS: [ \r\t\n]* -> skip;

// Erro
ERROR: . ;