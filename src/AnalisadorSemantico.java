import antlr.cpmLexer;
import antlr.cpmParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Scanner;

public class AnalisadorSemantico {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Entre o código fonte: ");
        String filename = "./src/codigos/" + scanner.nextLine();
        //parsing the input
        cpmParser parser = getParser(filename);

        //obter arvore
        ParseTree ast = parser.programa();

        //System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }
    private static cpmParser getParser(String fileName) {
        cpmParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            cpmLexer lexer = new cpmLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new cpmParser(tokens);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}