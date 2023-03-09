import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.cpmLexer;
import antlr.cpmParser;

public class AnalisadorSintatico {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.print("Entre o código fonte: ");
        String filename = "./src/codigos/" + scanner.nextLine();
        // Crie um CharStream contendo a entrada a ser analisada.
        CharStream entrada = CharStreams.fromFileName(filename);

        // Crie um analisador léxico para criar tokens da entrada.
        cpmLexer lexer = new cpmLexer(entrada);

        // Crie um buffer de tokens para fornecer ao analisador sintático.
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crie um analisador sintático para analisar a entrada e criar a árvore sintática.
        cpmParser parser = new cpmParser(tokens);
        ParseTree tree = parser.programa();

        // Faça o processamento que desejar com a árvore sintática.
        // Por exemplo, imprimir a árvore em formato de texto:
        System.out.println(tree.toStringTree(parser));
    }
}
