# Analisador Léxico da Linguagem C Mais ou Menos - **C** **P**lus **M**inus (**CPM**)

## Gerar lexer em Java a partir da gramática:

    java -jar ./antlr-4.11.1-complete.jar ./src/cpm.g4

## Executar lexer sobre código fonte:

1. Colocar código na pasta `./codigos`.

    Exemplo de código fonte: `./codigos/hello_world.cpm`.

        use "stdio";

        def main() :: int {

            print("Hello, World!");

            return 0;
        }

2. Executar `./src/testarLexer.java`.

    Entrada:

        Entre o código fonte: hello_world.cpm

    Saída:

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
        Lexema: (
            Classe: '('
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
        Lexema: print
            Classe: ID
            Linha:  5
        Lexema: (
            Classe: '('
            Linha:  5
        Lexema: "Hello, World!"
            Classe: STR
            Linha:  5
        Lexema: )
            Classe: ')'
            Linha:  5
        Lexema: ;
            Classe: ';'
            Linha:  5
        Lexema: return
            Classe: 'return'
            Linha:  7
        Lexema: 0
            Classe: NUM_INT
            Linha:  7
        Lexema: ;
            Classe: ';'
            Linha:  7
        Lexema: }
            Classe: '}'
            Linha:  8