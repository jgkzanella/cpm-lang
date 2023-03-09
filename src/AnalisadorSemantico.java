import antlr.cpmLexer;
import antlr.cpmParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AnalisadorSemantico {
    public static void main(String[] args){
        //parsing the input
        cpmParser parser = getParser("./codigos/hello_world.cpm");

        //obter arvore
        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static cpmParser getParser(String fileName){
        cpmParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            cpmLexer lexer = new cpmLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new cpmParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}