# Linguagem C Mais ou Menos - **C** **P**lus **M**inus (**CPM**)

<center>

Henrique Curi de Miranda - 202020087

João Gabriel Kondarzewski Zanella - 202020091

Nathan Felipe de Assis - 202020774

Victor Gonçalves Lima - 202020775

</center>

## 1. Visão Geral

A linguagem projetada foi nomeada como C+-. Pode ser lida como “C mais ou menos”, “C plus
minus” ou apenas “cpm”, que é a extensão de arquivos da linguagem.

Alguns algoritmos elaborados em C+-:

### 1.1. hello_world.cpm

    use "stdio";

    def main() :: int {
        print("Hello, World!");
        return 0;
    }

### 1.2. plus_minus.cpm

    use "stdio";

    def main() :: int {
        int c = 0;
        read(c);
        c+-;
        print(c);
        return 0;
    }

### 1.3. fatorial.cpm

    use "stdio";

    def fatorial(int n) :: int {
        int f = 1;
        while (n > 1) {
            f = f * n;
            n--;
        }
        return f;
    }

    def main() :: int {
        int n = 0;
        read(n);
        n = fatorial(n);
        print(n);
        return 0;
    }

## 2. Definição Léxica: lexemas aceitos, classes de lexemas e seus padrões de identificação

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

## 3. Casos de Teste

### 3.1 hello_world.cpm sem erro

    use "stdio";

    def main() :: int {
        print("Hello, World!");
        return 0;
    }

O código acima sem nenhum erro gera a seguinte saída de tokens:

    Lexema: use
        Classe: 'use'
        Linha: 1
    Lexema: "stdio"
        Classe: STR
        Linha: 1
    Lexema: ;
        Classe: ';'
        Linha: 1
    Lexema: def
        Classe: 'def'
        Linha: 3
    Lexema: main
        Classe: 'main'
        Linha: 3
    Lexema: (
        Classe: '('
        Linha: 3
    Lexema: )
        Classe: ')'
        Linha: 3
    Lexema: ::
        Classe: '::'
        Linha: 3
    Lexema: int
        Classe: TIPO
        Linha: 3
    Lexema: {
        Classe: '{'
        Linha: 3
    Lexema: print
        Classe: ID
        Linha: 5
    Lexema: (
        Classe: '('
        Linha: 5
    Lexema: "Hello, World!"
        Classe: STR
        Linha: 5
    Lexema: )
        Classe: ')'
        Linha: 5
    Lexema: ;
        Classe: ';'
        Linha: 5
    Lexema: return
        Classe: 'return'
        Linha: 7
    Lexema: 0
        Classe: NUM_INT
        Linha: 7
    Lexema: ;
        Classe: ';'
        Linha: 7
    Lexema: }
        Classe: '}'
        Linha: 8
    Lexema: <EOF>
        Classe: EOF
        Linha: 9

### 3.2. hello_world.cpm com erro

    use "stdio";
    deaf main() :: int {
        print(~"Hello, World!");
        return 0;
    }

O código acima com dois erros, um sintático em “deaf” ao invés de “def” e um léxico com a presença de um lexema não identificável “~”, gera a seguinte saída de tokens:

    Lexema: use
        Classe: 'use'
        Linha: 1
    Lexema: "stdio"
        Classe: STR
        Linha: 1
    Lexema: ;
        Classe: ';'
        Linha: 1
    Lexema: deaf
        Classe: ID
        Linha: 3
    Lexema: main
        Classe: 'main'
        Linha: 3
    Lexema: (
        Classe: '('
        Linha: 3
    Lexema: )
        Classe: ')'
        Linha: 3
    Lexema: ::
        Classe: '::'
        Linha: 3
    Lexema: int
        Classe: TIPO
        Linha: 3
    Lexema: {
        Classe: '{'
        Linha: 3
    Lexema: print
        Classe: ID
        Linha: 5
    Lexema: (
        Classe: '('
        Linha: 5
    ==========================================
    Lexema invalido identificado!
        Lexema: ~
        Linha: 5
        Inicio: 46
        Fim: 46
    ==========================================
    Lexema: "Hello, World!"
        Classe: STR
        Linha: 5
    Lexema: )
        Classe: ')'
        Linha: 5
    Lexema: ;
        Classe: ';'
        Linha: 5
    Lexema: return
        Classe: 'return'
        Linha: 7
    Lexema: 0
        Classe: NUM_INT
        Linha: 7
    Lexema: ;
        Classe: ';'
        Linha: 7
    Lexema: }
        Classe: '}'
        Linha: 8
    Lexema: <EOF>
        Classe: EOF
        Linha: 9

## 4. Detalhes da Implementação

A equipe gerou os algoritmos de exemplo (arquivos do diretório “codigos”), “cpm.g4”,
“testarLexer.java”, “README.md” e “.gitignore”. O restante dos arquivos foi gerado utilizando o
ANTLR.

### 4.1. Algoritmos de exemplo

Foram gerados cinco códigos de exemplo para o analisador léxico. Todos são individuais e
demonstram alguma característica diferente dos outros.

- hello_wordl.cpm

        use "stdio";

        def main() :: int {

            print("Hello, World!");

            return 0;
        }

- plus_minus.cpm

        use "stdio";

        def main() :: int {
            int c = 0;
            read(c);
            c+-;
            print(c);
            return 0;
        }

- arranjo.cpm

        use "stdio"

        def main() :: int {

            int n = 0;
            read(n);

            int[n] arranjo;

            for (int i = 0; i < n; i++) {
                read(arranjo[i]);
            }

            for (int i = 0; i < n; i++) {
                print(arranjo[i]);
                print(" ");
            }

            return 0;
        }

- conversor_temperatura.cpm

        use "stdio"

        def Celsius_para_Fahrenheit(float c) :: float {
            float f = (9.0 * c / 5.0) + 32.0;
            return f;
        }

        def main() :: int {

            float c = 0.0;
            read(c);

            float f = 0;
            f = Celsius_para_Fahrenheit(c);
            print(f);

            return 0;
        }

- fatorial.cpm

        use "stdio";

        def fatorial(int n) :: int {
            int f = 1;
            while (n > 1) {
                f = f * n;
                n--;
            }
            return f;
        }

        def main() :: int {
            int n = 0;
            read(n);
            n = fatorial(n);
            print(n);
            return 0;
        }

4.2. Gerador de Gramática

O código abaixo foi usado para gerar os tokens dos algoritmos de exemplo. Nele estão definidos as classes e suas expressões regulares.

    grammar cpm;

    fragment LETRA: [a-zA-Z];
    fragment DIGITO: [0-9];

    // Incluir bibliotecas
    USE: 'use';

    // Comentário
    COMMENT: '/*' .* '*/';

    // Tipos primitivos
    TIPO: 'int' | 'float' | 'void' | 'double' | 'str';

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

### 4.3. Análise Léxica

O código abaixo foi usado para imprimir o resultado da análise léxica dos algoritmos de exemplo. Nele estão sendo impressos os lexemas, juntamente com sua classe e linha que está presente. Também, em caso de lexema inválido, é chamada a função para imprimir uma mensagem de erro informando qual o lexema não identificado, a linha e os índices de início e fim do mesmo. Para ler um algoritmo de exemplo e fazer a análise léxica, é feita uma leitura do nome do arquivo desejável.

    import org.antlr.v4.runtime.CharStream;
    import org.antlr.v4.runtime.CharStreams;
    import org.antlr.v4.runtime.Token;

    import java.io.IOException;
    import java.util.Scanner;

    public class testarLexer {

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
            String filename = "./codigos/" + scanner.nextLine();
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

## 5. Repositório no GitHub

A implementação do analisador léxico está disponível em: https://github.com/jgkzanella/analisador-lexico-cpm.