# <p style="text-align:center"><img src="./images/UFLA.png" width="500"><br><br> Departamento de Ciência da Computação<br><br>GCC130 - Compiladores - 2022/2<br><br>Prof. Dr. Maurício Ronny De Almeida Souza<br><br>

<p style="text-align:center"><br>Henrique Curi de Miranda - 202020087
<br>
<br>João Gabriel Kondarzewski Zanella - 202020091
<br>
<br>Nathan Felipe de Assis - 202020774
<br>
<br>Victor Gonçalves Lima - 202020775

# <p style="text-align:center"><br>Linguagem C Mais ou Menos - **C** **P**lus **M**inus (**CPM**)

# Conteúdo



# 1. Visão Geral

A linguagem de programação projetada foi nomeada C+- ("C Mais ou Menos"). Seu nome pode ser lido de várias maneiras, como "C Mais ou Menos", "C Plus Minus" ou simplesmente "CPM", igual a extensão de código fonte da linguagem (".cpm"). O C+- é uma linguagem inspirada em C, C++ e Python, apresentando sintax simples, mas fortemente tipada. O objeto da linguagem é ser didática e minimalista, assim, não é orienda a objetos e possui tipos primitivos bem definidos. Abaixo temos alguns exemplos de códigos escritos com a linguagem.

## 1.1. hello_world.cpm

    use "stdio";

    def main() :: int {
        print("Hello, World!");
        return 0;
    };

## 1.2. plus_minus.cpm

    use "stdio";

    def main() :: int {
        int c = 0;
        read(c);
        c+-;
        print(c);
        return 0;
    };

## 1.3. fatorial.cpm

    use "stdio";

    def fatorial(int n) :: int {
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        return f;
    };

    def main() :: int {
        int n = 0;
        read(n);
        n = fatorial(n);
        print(n);
        return 0;
    };

# 2. Definição Léxica

A tabela abaixo apresenta uma lista completa dos elementos que compõem a definição léxica da linguagem C+-, incluindo estruturas de controle, operadores aritméticos, relacionais e lógicos, tipos primitivos, delimitadores e identificadores de variáveis e funções. A tabela também inclui especificações para comentários, definição da função principal, definição de funções, retorno de valor por função, estruturas condicionais e de repetição, separadores de tipo da função e linha de expressão, atribuição de valor à variável, incrementadores e decrementadores, números inteiros e reais, e cadeias de caracteres. Esses padrões de uso fornecem as regras fundamentais para que um programa seja escrito em C+-.

Classe | Sigla | Padrão
-------|-------|-------
Comentário | COMMENT | Cadeia de caracteres iniciadas com "/*" e terminadas com "*/"
Tipos primitivos | TIPO | "int", "float", "void", "double", "str", "bool" |
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

# 3. Definição Sintática

A definição sintática de uma linguagem é definida por sua Grmática Livre de Contexto (GLC). Uma GLC é uma quádrupla (N, T, P, S), onde:

- N é um conjunto finito de símbolos não-terminais (variáveis);

- T é um conjunto finito de símbolos terminais (tokens);

- P é um conjunto finito de regras de produção que definem como as variáveis podem ser substituídas por sequências de símbolos terminais e não-terminais;

- S é o símbolo inicial (uma variável distinta de N) que é usado como ponto de partida para gerar todas as sentenças da linguagem.

Abaixo estão as regras da GLC da linguagem C+-,  divididas em grupos.

## 3.1. Estrutura

    programa → global funcao_principal?

    funcao_principal -> DEF MAIN '()' '::' TIPO bloco ';'

    global -> (bloco | expressao | declaracao | repeticao | condicional | chamada)*

    bloco -> '{' (bloco | vetor | funcao | expressao | declaracao | repeticao | condicional | chamada)* '}'

## 3.2. Auxiliares

    argumento -> NUM_FLOAT | NUM_INT | STR | BOOL | ID | vetor | funcao

    tipos_atribuicao -> argumento | expressao

    parametro -> ((argumento | expressao) (',' (argumento | expressao)) *)

    indice -> NUM_INT | ID | vetor | funcao | expressao

    termo_aritmetico -> fator_aritmetico (OP_ARIT fator_aritmetico)*

    fator_aritmetico -> argumento | '(' expressao_aritmetica ')'

    termo_logico -> fator_logico (OP_LOG fator_logico)*

    fator_logico -> ID | vetor | BOOL | '(' expressao_logica ')'

    termo_relacional -> fator_relacional (OP_REL fator_relacional)*

## 3.3. Expressões

    expressao -> expressao_aritmetica | expressao_logica | expressao_relacional | expressao_reduzida

    expressao_reduzida -> ID (MENOSMENOS | MAISMAIS | MAISMENOS)

    expressao_aritmetica -> termo_aritmetico ((OP_ARIT (termo_aritmetico | termo_relacional)))*

    expressao_logica -> termo_logico (OP_LOG (termo_logico | termo_relacional))*

    expressao_relacional -> termo_relacional (OP_REL (termo_relacional | termo_logico))*

## 3.4. Declarações

    declaracao -> declaracao_variavel | declaracao_vetor | declaracao_funcao

    declaracao_variavel -> TIPO ID ('=' (argumento | expressao))? ';'

    declaracao_vetor -> TIPO '[' (NUM_INT | ID | vetor) ']' ID ('=' '{' parametro? '}')? ';'

    declaracao_funcao -> DEF ID '(' (TIPO ID (',' TIPO ID)*) ')' '::' TIPO  bloco? ';' | DEF ID '()' '::' TIPO  bloco? ';'

## 3.5. Repetições

    repeticao -> repeticao_while | repeticao_for

    repeticao_while -> WHILE expressao bloco

    repeticao_for -> FOR '(' declaracao_variavel expressao ';' expressao_reduzida ')' bloco

## 3.6. Condicionais

    condicional -> condicional_if | condcional_ifse | condicional_else

    condicional_if -> IF expressao bloco

    condcional_ifse -> IFSE expressao bloco

    condicional_else -> ELSE bloco

## 3.7. Chamadas

    chamada -> chamada_funcao | chamada_atribuicao | chamada_importar | chamada_retornar | chamada_reduzida

    chamada_reduzida -> expressao_reduzida ';'

    chamada_funcao -> ID '(' parametro? ')'  ';'

    chamada_atribuicao -> (ID | vetor) '=' tipos_atribuicao ';'

    chamada_importar -> USE STR ';'

    chamada_retornar -> RETURN tipos_atribuicao ';'

## 3.8. Outros

    vetor -> ID '[' indice ']'

    funcao -> ID '(' parametro? ')'

# 4. Definição Semântica



# 5 Casos de Teste

## 5.1 Erros léxicos

### hello_world.cpm

- Sem erro:

    use "stdio";

    def main() :: int {
        print("Hello, World!");
        return 0;
    };

    O código sem nenhum erro gera a seguinte saída de tokens pelo nosso Analisador Léxico:

    Lexema: use
        Classe: 'use'
        Linha:  1
    Lexema: "stdio"
        Classe: STR
        Linha:  1
    Lexema: ;
        Classe: ';'
        Linha:  1
    Lexema: def
        Classe: 'def'
        Linha:  3
    Lexema: main
        Classe: 'main'
        Linha:  3
    Lexema: ()
        Classe: '()'
        Linha:  3
    Lexema: ::
        Classe: '::'
        Linha:  3
    Lexema: int
        Classe: TIPO
        Linha:  3
    Lexema: {
        Classe: '{'
        Linha:  3
    Lexema: print
        Classe: ID
        Linha:  4
    Lexema: (
        Classe: '('
        Linha:  4
    Lexema: "Hello, World!"
        Classe: STR
        Linha:  4
    Lexema: )
        Classe: ')'
        Linha:  4
    Lexema: ;
        Classe: ';'
        Linha:  4
    Lexema: return
        Classe: 'return'
        Linha:  5
    Lexema: 0
        Classe: NUM_INT
        Linha:  5
    Lexema: ;
        Classe: ';'
        Linha:  5
    Lexema: }
        Classe: '}'
        Linha:  6
    Lexema: ;
        Classe: ';'
        Linha:  6

- Com erro:

        use "stdio";

        def main() :: int {
            print(~"Hello, World!");
            returm 0;
        }

    O código com um erro léxico pela presença de um lexema não identificável “~”, gera a seguinte saída de tokens pelo nosso Analisador Léxico:

        Lexema: use
            Classe: 'use'
            Linha:  1
        Lexema: "stdio"
            Classe: STR
            Linha:  1
        Lexema: ;
            Classe: ';'
            Linha:  1
        Lexema: def
            Classe: 'def'
            Linha:  3
        Lexema: main
            Classe: 'main'
            Linha:  3
        Lexema: ()
            Classe: '()'
            Linha:  3
        Lexema: ::
            Classe: '::'
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  3
        Lexema: {
            Classe: '{'
            Linha:  3
        Lexema: print
            Classe: ID
            Linha:  4
        Lexema: (
            Classe: '('
            Linha:  4

        ==========================================
        Lexema invalido identificado!
            Lexema: ~
            Linha:  4
            Inicio: 44
            Fim:    44
        ==========================================

        Lexema: "Hello, World!"
            Classe: STR
            Linha:  4
        Lexema: )
            Classe: ')'
            Linha:  4
        Lexema: ;
            Classe: ';'
            Linha:  4
        Lexema: returm
            Classe: ID
            Linha:  5
        Lexema: 0
            Classe: NUM_INT
            Linha:  5
        Lexema: ;
            Classe: ';'
            Linha:  5
        Lexema: }
            Classe: '}'
            Linha:  6

### fatorial.cpm

- Sem erro:

        use "stdio";

        def fatorial(int n) :: int {
            int f = 1;
            while (n > 1) {
                f = f * n;
                n--;
            }
            return f;
        };

        def main() :: int {
            int n = 0;
            read(n);
            n = fatorial(n);
            print(n);
            return 0;
        };

    O código sem nenhum erro gera a seguinte saída de tokens pelo nosso Analisador Léxico:

        Lexema: use
            Classe: 'use'
            Linha:  1
        Lexema: "stdio"
            Classe: STR
            Linha:  1
        Lexema: ;
            Classe: ';'
            Linha:  1
        Lexema: def
            Classe: 'def'
            Linha:  3
        Lexema: fatorial
            Classe: ID
            Linha:  3
        Lexema: (
            Classe: '('
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  3
        Lexema: n
            Classe: ID
            Linha:  3
        Lexema: )
            Classe: ')'
            Linha:  3
        Lexema: ::
            Classe: '::'
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  3
        Lexema: {
            Classe: '{'
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  4
        Lexema: f
            Classe: ID
            Linha:  4
        Lexema: =
            Classe: '='
            Linha:  4
        Lexema: 1
            Classe: NUM_INT
            Linha:  4
        Lexema: ;
            Classe: ';'
            Linha:  4
        Lexema: while
            Classe: 'while'
            Linha:  5
        Lexema: (
            Classe: '('
            Linha:  5
        Lexema: n
            Classe: ID
            Linha:  5
        Lexema: >
            Classe: OP_REL
            Linha:  5
        Lexema: 1
            Classe: NUM_INT
            Linha:  5
        Lexema: )
            Classe: ')'
            Linha:  5
        Lexema: {
            Classe: '{'
            Linha:  5
        Lexema: f
            Classe: ID
            Linha:  6
        Lexema: =
            Classe: '='
            Linha:  6
        Lexema: f
            Classe: ID
            Linha:  6
        Lexema: *
            Classe: OP_ARIT
            Linha:  6
        Lexema: n
            Classe: ID
            Linha:  6
        Lexema: ;
            Classe: ';'
            Linha:  6
        Lexema: n
            Classe: ID
            Linha:  7
        Lexema: --
            Classe: '--'
            Linha:  7
        Lexema: ;
            Classe: ';'
            Linha:  7
        Lexema: }
            Classe: '}'
            Linha:  8
        Lexema: return
            Classe: 'return'
            Linha:  9
        Lexema: f
            Classe: ID
            Linha:  9
        Lexema: ;
            Classe: ';'
            Linha:  9
        Lexema: }
            Classe: '}'
            Linha:  10
        Lexema: ;
            Classe: ';'
            Linha:  10
        Lexema: def
            Classe: 'def'
            Linha:  12
        Lexema: main
            Classe: 'main'
            Linha:  12
        Lexema: ()
            Classe: '()'
            Linha:  12
        Lexema: ::
            Classe: '::'
            Linha:  12
        Lexema: int
            Classe: TIPO
            Linha:  12
        Lexema: {
            Classe: '{'
            Linha:  12
        Lexema: int
            Classe: TIPO
            Linha:  13
        Lexema: n
            Classe: ID
            Linha:  13
        Lexema: =
            Classe: '='
            Linha:  13
        Lexema: 0
            Classe: NUM_INT
            Linha:  13
        Lexema: ;
            Classe: ';'
            Linha:  13
        Lexema: read
            Classe: ID
            Linha:  14
        Lexema: (
            Classe: '('
            Linha:  14
        Lexema: n
            Classe: ID
            Linha:  14
        Lexema: )
            Classe: ')'
            Linha:  14
        Lexema: ;
            Classe: ';'
            Linha:  14
        Lexema: n
            Classe: ID
            Linha:  15
        Lexema: =
            Classe: '='
            Linha:  15
        Lexema: fatorial
            Classe: ID
            Linha:  15
        Lexema: (
            Classe: '('
            Linha:  15
        Lexema: n
            Classe: ID
            Linha:  15
        Lexema: )
            Classe: ')'
            Linha:  15
        Lexema: ;
            Classe: ';'
            Linha:  15
        Lexema: print
            Classe: ID
            Linha:  16
        Lexema: (
            Classe: '('
            Linha:  16
        Lexema: n
            Classe: ID
            Linha:  16
        Lexema: )
            Classe: ')'
            Linha:  16
        Lexema: ;
            Classe: ';'
            Linha:  16
        Lexema: return
            Classe: 'return'
            Linha:  17
        Lexema: 0
            Classe: NUM_INT
            Linha:  17
        Lexema: ;
            Classe: ';'
            Linha:  17
        Lexema: }
            Classe: '}'
            Linha:  18
        Lexema: ;
            Classe: ';'
            Linha:  18

- Com erro:

        use "stdio";

        def fatorial(int n) :: int {
            int f = 1;
            while (n ? 1) {
                f = f * n;
                n--;
            }
            return f;
        };

        def main() :: int {
            int n = 0;
            read(&n);
            n = fatorial(n);
            print(n);
            return 0;
        };

    O código com dois erros léxicos pela presença de dois lexemas não identificáveis: “?” e "&", gera a seguinte saída de tokens pelo nosso Analisador Léxico:

        Lexema: use
            Classe: 'use'
            Linha:  1
        Lexema: "stdio"
            Classe: STR
            Linha:  1
        Lexema: ;
            Classe: ';'
            Linha:  1
        Lexema: def
            Classe: 'def'
            Linha:  3
        Lexema: fatorial
            Classe: ID
            Linha:  3
        Lexema: (
            Classe: '('
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  3
        Lexema: n
            Classe: ID
            Linha:  3
        Lexema: )
            Classe: ')'
            Linha:  3
        Lexema: ::
            Classe: '::'
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  3
        Lexema: {
            Classe: '{'
            Linha:  3
        Lexema: int
            Classe: TIPO
            Linha:  4
        Lexema: f
            Classe: ID
            Linha:  4
        Lexema: =
            Classe: '='
            Linha:  4
        Lexema: 1
            Classe: NUM_INT
            Linha:  4
        Lexema: ;
            Classe: ';'
            Linha:  4
        Lexema: while
            Classe: 'while'
            Linha:  5
        Lexema: (
            Classe: '('
            Linha:  5
        Lexema: n
            Classe: ID
            Linha:  5

        ==========================================
        Lexema invalido identificado!
            Lexema: ?
            Linha:  5
            Inicio: 71
            Fim:    71
        ==========================================

        Lexema: 1
            Classe: NUM_INT
            Linha:  5
        Lexema: )
            Classe: ')'
            Linha:  5
        Lexema: {
            Classe: '{'
            Linha:  5
        Lexema: f
            Classe: ID
            Linha:  6
        Lexema: =
            Classe: '='
            Linha:  6
        Lexema: f
            Classe: ID
            Linha:  6
        Lexema: *
            Classe: OP_ARIT
            Linha:  6
        Lexema: n
            Classe: ID
            Linha:  6
        Lexema: ;
            Classe: ';'
            Linha:  6
        Lexema: n
            Classe: ID
            Linha:  7
        Lexema: --
            Classe: '--'
            Linha:  7
        Lexema: ;
            Classe: ';'
            Linha:  7
        Lexema: }
            Classe: '}'
            Linha:  8
        Lexema: return
            Classe: 'return'
            Linha:  9
        Lexema: f
            Classe: ID
            Linha:  9
        Lexema: ;
            Classe: ';'
            Linha:  9
        Lexema: }
            Classe: '}'
            Linha:  10
        Lexema: ;
            Classe: ';'
            Linha:  10
        Lexema: def
            Classe: 'def'
            Linha:  12
        Lexema: main
            Classe: 'main'
            Linha:  12
        Lexema: ()
            Classe: '()'
            Linha:  12
        Lexema: ::
            Classe: '::'
            Linha:  12
        Lexema: int
            Classe: TIPO
            Linha:  12
        Lexema: {
            Classe: '{'
            Linha:  12
        Lexema: int
            Classe: TIPO
            Linha:  13
        Lexema: n
            Classe: ID
            Linha:  13
        Lexema: =
            Classe: '='
            Linha:  13
        Lexema: 0
            Classe: NUM_INT
            Linha:  13
        Lexema: ;
            Classe: ';'
            Linha:  13
        Lexema: read
            Classe: ID
            Linha:  14
        Lexema: (
            Classe: '('
            Linha:  14

        ==========================================
        Lexema invalido identificado!
            Lexema: &
            Linha:  14
            Inicio: 178
            Fim:    178
        ==========================================

        Lexema: n
            Classe: ID
            Linha:  14
        Lexema: )
            Classe: ')'
            Linha:  14
        Lexema: ;
            Classe: ';'
            Linha:  14
        Lexema: n
            Classe: ID
            Linha:  15
        Lexema: =
            Classe: '='
            Linha:  15
        Lexema: fatorial
            Classe: ID
            Linha:  15
        Lexema: (
            Classe: '('
            Linha:  15
        Lexema: n
            Classe: ID
            Linha:  15
        Lexema: )
            Classe: ')'
            Linha:  15
        Lexema: ;
            Classe: ';'
            Linha:  15
        Lexema: print
            Classe: ID
            Linha:  16
        Lexema: (
            Classe: '('
            Linha:  16
        Lexema: n
            Classe: ID
            Linha:  16
        Lexema: )
            Classe: ')'
            Linha:  16
        Lexema: ;
            Classe: ';'
            Linha:  16
        Lexema: return
            Classe: 'return'
            Linha:  17
        Lexema: 0
            Classe: NUM_INT
            Linha:  17
        Lexema: ;
            Classe: ';'
            Linha:  17
        Lexema: }
            Classe: '}'
            Linha:  18
        Lexema: ;
            Classe: ';'
            Linha:  18

## 5.1 Erros sintáticos

### hello_world.cpm

- Sem erro:

        use "stdio";

        def main() :: int {
            print("Hello, World!");
            return 0;
        };

    O código sem nenhum erro sintático gera a seguinte árvore:

    <img src="./images/hello_word.png" width="1000">

- Com erro:

        use "stdio";

        def main() :: int {
            print(~"Hello, World!");
            returm 0;
        }

    O código com um erro sintático ao escrever "returm" onde deveria ser "return" gera a seguinte árvore:

    <img src="./images/ERRO_SINTATICO-hello_world.png" width="1000">

### fatorial.cpm

- Sem erro:

        use "stdio";

        def fatorial(int n) :: int {
            int f = 1;
            while (n > 1) {
                f = f * n;
                n--;
            }
            return f;
        };

        def main() :: int {
            int n = 0;
            read(n);
            n = fatorial(n);
            print(n);
            return 0;
        };

    O código sem nenhum erro sintático gera a seguinte árvore:

    <img src="./images/fatorial.png" width="1000">

- Com erro:

        use "stdio";

        def fatorial(int n) :: int {
            int f = 1;
            while (n > 1) {
                f = f * n;
                n--;
            return f;
        };

        def main() :: int {
            int n != 0;
            read(n);
            n = fatorial(n);
            print(n);
            return 0;
        };

    O código com dois erros sintáticos ao não fechar as chaves "}" do while e atribuir um valor com "!=", gera a seguinte árvore:

    <img src="./images/ERRO_SINTATICO-fatorial.png" width="1000">

# 6. Detalhes da Implementação

## 6.1. Algoritmos de exemplo

A equipe criou códigos de exemplo da língugem que deram uma base forte para iniciar suas definições formais. Todos são individuais e
demonstram alguma característica diferente dos outros.

### 6.1.1 hello_world.cpm

    use "stdio";

    def main() :: int {
        print("Hello, World!");
        return 0;
    };

### 6.1.2. plus_minus.cpm

    use "stdio";

    def main() :: int {
        int c = 0;
        read(c);
        c+-;
        print(c);
        return 0;
    };

### 6.1.3. fatorial.cpm

    use "stdio";

    def fatorial(int n) :: int {
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        return f;
    };

    def main() :: int {
        int n = 0;
        read(n);
        n = fatorial(n);
        print(n);
        return 0;
    };

### 6.1.4. conversor_temeperatura.cpm

    use "stdio";

    def Celsius_para_Fahrenheit(float c) :: float {
        float f = (9.0 * c / 5.0) + 32.0;
        return f;
    };

    def main() :: int {

        float c = 0.0;
        read(c);

        float f = 0;
        f = Celsius_para_Fahrenheit(c);
        print(f);

        return 0;
    };

### 6.1.5. media_aritmetica.cpm

    use "stdio";

    def media_aritmetica(int a, int b, int c) :: float {
        float media = (a + b + c) / 3.0;
        return media;
    };

    def main() :: int {

        int a = 0, b = 0, c = 0;
        read(a);
        read(b);
        read(c);

        float media = 0.0;
        media = media_aritmetica(a, b, c);
        print(media);

        return 0;
    };

### 6.1.6. soma_naturais.cpm

    use "stdio";

    def soma_naturais(int n) :: int {
        int soma = 0;
        int i = 1;
        while (i <= n) {
            soma = soma + i;
            i++;
        }
        return soma;
    };

    def main() :: int {
        int n = 0;
        read(n);
        int soma = 0;
        soma = soma_naturais(n);
        print(soma);
        return 0;
    };

### 6.1.7. distancia_pontos.cpm

    use "stdio";

    def distancia_pontos(float x1, float y1, float x2, float y2) :: float {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float distancia = sqrt(dx*dx + dy*dy);
        return distancia;
    };

    def main() :: int {
        float x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        read(x1);
        read(y1);
        read(x2);
        read(y2);

        float distancia = 0.0;
        distancia = distancia_pontos(x1, y1, x2, y2);
        print(distancia);

        return 0;
    };

### 6.1.8. maximo.cpm

    use "stdio";

    def maximo(int a, int b) :: int {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    };

    def main() :: int {
        int a = 0, b = 0;
        read(a);
        read(b);

        int max = 0;
        max = maximo(a, b);
        print(max);

        return 0;
    };

### 6.1.9. ordena_numeros.cpm

    use "stdio";

    def ordena_numeros(int a, int b, int c) :: (int, int, int) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        return (a, b, c);
    };

    def main() :: int {
        int a = 0, b = 0, c = 0;
        read(a);
        read(b);
        read(c);

        (a, b, c) = ordena_numeros(a, b, c);
        print(a);
        print(b);
        print(c);

        return 0;
    };

### 6.1.10. area_circulo.cpm

    use "stdio";

    def area_circulo(float raio) :: float {
        float area = 3.14159 * raio * raio;
        return area;
    };

    def main() :: int {
        float raio = 0.0;
        read(raio);

        float area = 0.0;
        area = area_circulo(raio);
        print(area);

        return 0;

## 6.2. Definições Léxicas e Sintáticas

Em seguida, foram criadas as definições léxicas e sintáticas da linguagem C+-, especificando quais palavras pertenciam a linguagem e em quais classes, e as regras de sua GLC. Abaixo está o código fonte do arquivo `cpm.g4`do **ANTLR** para as definições léxicas, sintáticas. Com base nele, executamos o arquivo binário do **ANTLR** para gerar os códigos fontes.

`cpm.g4`

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

## 6.3 Analisador Léxico

Foi criado um código fonte para ler um arquivo fonte da linguagem C+- e imprimir o resultado de sua análise léxica. A execução imprime os lexemas, juntamente com suas classes e linhas que estão presentes. Também, em caso de lexema inválido, é chamada a função para imprimir uma mensagem de erro informando qual o lexema não identificado, a linha e os índices de início e fim do mesmo.

    import antlr.cpmLexer;

    import org.antlr.v4.runtime.CharStream;
    import org.antlr.v4.runtime.CharStreams;
    import org.antlr.v4.runtime.Token;

    import java.io.IOException;
    import java.util.Scanner;

    public class AnalisadorLexico {

        private static Scanner scanner = new Scanner(System.in);

        public static void imprimir_lexema(cpmLexer lexer, Token token) {
            System.out.println("Lexema: " + token.getText());
            System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            System.out.println("    Linha:  " + token.getLine());
        }

        public static void imprimir_erro(Token token) {
            System.out.println("\n==========================================");
            System.out.println("Lexema invalido identificado!");
            System.out.println("    Lexema: " + token.getText());
            System.out.println("    Linha:  " + token.getLine());
            System.out.println("    Inicio: " + token.getStartIndex());
            System.out.println("    Fim:    " + token.getStopIndex());
            System.out.println("==========================================\n");
        }

        public static void  main (String[] args){
            System.out.print("Entre o código fonte: ");
            String filename = "./src/codigos/" + scanner.nextLine();
            try {
                CharStream input = CharStreams.fromFileName(filename);
                cpmLexer lexer = new cpmLexer(input);
                Token token;
                while (!lexer._hitEOF) {
                    token = lexer.nextToken();

                    if (lexer.getVocabulary().getDisplayName(token.getType()).equals("ERROR")) {
                        imprimir_erro(token);
                    }
                    else {
                        imprimir_lexema(lexer, token);
                    }
                }

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

# 6. Repositório no GitHub

Toda a implementação da linguagem C+- está disponível em: https://github.com/jgkzanella/analisador-lexico-cpm.