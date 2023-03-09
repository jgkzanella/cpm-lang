import antlr.cpmBaseListener;
import antlr.cpmParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends cpmBaseListener {
    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();
    private Map<String, Integer> quantidade_parametros = new HashMap<String, Integer>();
    private Map<String, List<String>> tipos_parametros = new HashMap<String, List<String>>();
    private List<String> nao_inicializadas = new ArrayList<String>();

    @Override
    public void exitDeclaracao_variavel(cpmParser.Declaracao_variavelContext ctx) {
        System.out.println("Out declaração: " + ctx.getText());

        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        try {
            ctx.ATR().getText();
        }

        catch(NullPointerException e) {
            nao_inicializadas.add(id);
        }

        if (tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        }
        else {
            tabelaSimbolos.put(id, tipo);
        }
    }
    @Override
    public void exitDeclaracao_funcao(cpmParser.Declaracao_funcaoContext ctx) {
        int tam = ctx.TIPO().size();

        List<String> tipos = new ArrayList<String>();
        for(int i = 0; i < tam-1; i++) {
            tipos.add(String.valueOf(ctx.TIPO().get(i)));
        }
        tipos_parametros.put(ctx.ID(0).getText(), tipos);

        String tipo = String.valueOf(ctx.TIPO(tam - 1));
        String id = String.valueOf(ctx.ID(0));

        quantidade_parametros.put(id, (ctx.ID().size() - 1));

        if (tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Função " + id + " já declarada");
        }
        else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    @Override
    public void exitParametro(cpmParser.ParametroContext ctx) {
        String id = ctx.argumento(0).getText();
        if (nao_inicializadas.contains(id)) {
            System.out.println("Variável " + id + " não foi inicializada.");
        }
    }
    @Override
    public void exitChamada_funcao(cpmParser.Chamada_funcaoContext ctx) {
        int tam = ctx.parametro().argumento().size();
        String id = ctx.ID().getText();

        if (quantidade_parametros.containsKey(id)) {
            if (tam != quantidade_parametros.get(id)) {
                System.out.println("Número incorreto de argumentos");
            }
        }
    }

    @Override
    public void exitIndice(cpmParser.IndiceContext ctx) {
        if (nao_inicializadas.contains(ctx.ID().getText())) {
            System.out.println("Variável " + ctx.ID().getText() + " não foi inicializada.");
        }
    }

    @Override
    public void exitChamada_atribuicao(cpmParser.Chamada_atribuicaoContext ctx) {
        nao_inicializadas.remove(ctx.ID().getText());
    }
    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}