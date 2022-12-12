# 2. Definição Léxica: lexemas aceitos, classes de lexemas e seus padrões de identificação

Classe | Sigla | Padrão
-------|-------|-------
Comentário | COMMENT | Cadeia de caracteres iniciadas com "/*" e terminadas com "*/"
Tipos primitivos | TIPO | "int", "float", "void", "double", "str" |
Identificação da função principal | MAIN | "main"
Definir funções | DEF | "def"
Retorno de valor por função | RETURN | "return"
Estrutura condicional "se" | IF | "if"
Estrutura condicional "se não se" | IFSE | "ifse"
Estrutura condicional "se não" | ELSE | "else"
Estrutura de repetição "enquanto" | WHILE | "while"
Estrutura de repetição "para" | FOR | "for"
Separador de tipo da função | SEP_RE: "::"
Separador de linha de expressão | SEP_EX | ";"
Abre chave | AC | "{"
Fecha chave | FC | "}"
Abre parêntese | AP | "("
Fecha parêntese | FP | ")"
Abre colchete | ACOL | "["
Fecha colchete | FCOL | "]"
Identificador de variáveis e funções | ID | Cadeia de caracteres incluindo dígitos, letras maiúsculas, letras minúsculas e sublinhado, devendo começar com sublinhado ou letra minúscula.
Atribuiçao de valor à variável | ATR | "="
Incrementador de mais menos | MAISMENOS | "+-"
Incrementador | MAISMAIS | "++"
Decrementador | MENOSMENOS | "--"
Operadores aritméticos | OP_ARIT | "+" ou "-" ou "*" ou "/" ou "%"
Operadores relacionais | OP_REL | "<" ou ">" ou "<=" ou ">=" ou "==" ou "!="
Operadores lógicos | OP_LOG | "and" ou "or" ou "not"
Números inteiros | NUM_INT | Sequência de dígitos que, opcionalmente, iniciar ou com um símbolo negativo ou um símbolo positivo
Números reais | NUM_FLOAT | Sequência de dígitos que, opcionalmente, iniciar ou com um símbolo negativo ou um símbolo positivo seguidas de um ponto e outra sequência de dígitos
Cadeias de caracteres (strings) | STR | Cadeia de caracteres delimitados por aspas duplas