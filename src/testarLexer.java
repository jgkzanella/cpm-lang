import antlr.cpmLexer;

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