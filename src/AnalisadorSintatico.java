import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.cpmLexer;
import antlr.cpmParser;

public class AnalisadorSintatico {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.print("Entre o código fonte: ");
        String filename = "./src/codigos/" + scanner.nextLine();
        // cria um CharStream contendo a entrada a ser analisada.
        CharStream entrada = CharStreams.fromFileName(filename);

        // cria um analisador léxico para criar tokens da entrada.
        cpmLexer lexer = new cpmLexer(entrada);

        // cria um buffer de tokens para fornecer ao analisador sintático.
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // cria um analisador sintático para analisar a entrada e criar a árvore sintática.
        cpmParser parser = new cpmParser(tokens);
        ParseTree tree = parser.programa();

        // Mostrar a árvore sintática no GUI do ANTLR.
        // cria um painel para a árvore.
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.5);//aumenta o tamanho da fonte
        panel.add(viewer);

        // cria uma janela para o painel.
        JFrame frame = new JFrame("Árvore Sintática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
