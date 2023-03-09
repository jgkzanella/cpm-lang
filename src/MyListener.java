import antlr.cpmBaseListener;
import antlr.cpmParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends cpmBaseListener {
    private Map<String,String> ids_declarados = new HashMap<String,String>();
    private Map<String, Integer> quantidade_parametros = new HashMap<String, Integer>();
    private List<String> nao_inicializadas = new ArrayList<String>();

    @Override
    public void exitDeclaracao_variavel(cpmParser.Declaracao_variavelContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        // se tentar pegar o "=" e não existir (retorna nulo), adiciona no vetor
        // de variáveis não inicializadas
        try {
            ctx.ATR().getText();
        }
        catch(NullPointerException e) {
            nao_inicializadas.add(id);
        }

        // verifica se variável foi anteriormente declarada
        if (ids_declarados.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        }
        else {
            ids_declarados.put(id, tipo);
        }
    }
    @Override
    public void exitDeclaracao_funcao(cpmParser.Declaracao_funcaoContext ctx) {
        int tam = ctx.TIPO().size();
        String tipo = String.valueOf(ctx.TIPO(tam - 1));
        String id = String.valueOf(ctx.ID(0));

        // armazena a quantidade de parâmetros na declaração de uma função
        quantidade_parametros.put(id, (ctx.ID().size() - 1));

        // verifica se função foi anteriormente declarada
        if (ids_declarados.containsKey(id)) {
            System.out.println("Declaração duplicada! Função " + id + " já declarada");
        }
        else {
            ids_declarados.put(id, tipo);
        }
    }

    @Override
    public void exitParametro(cpmParser.ParametroContext ctx) {
        List<cpmParser.ArgumentoContext> argumentos = ctx.argumento();

        for (cpmParser.ArgumentoContext argumento : argumentos) {
            // se conseguir pegar uma variável no parâmetro da função,
            // faz as verificações adequadas
            try {
                String id = argumento.ID().getText();
                String linha = String.valueOf(ctx.getStart().getLine());

                // verifica se variável foi declarada
                if (!ids_declarados.containsKey(id)) {
                    System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
                }
                else {
                    if (nao_inicializadas.contains(id)) {
                        System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                    }
                }
            }
            catch (NullPointerException ignored) {

            }
        }
    }
    @Override
    public void exitChamada_funcao(cpmParser.Chamada_funcaoContext ctx) {
        int tam = ctx.parametro().argumento().size();
        String linha = String.valueOf(ctx.getStart().getLine());
        String id = ctx.ID().getText();

        // verifica se função não foi declarada
        if (!ids_declarados.containsKey(id)) {
            System.out.println("Função '" + id + "' não foi declarada mas foi usada na linha " + linha);
        }
        else {
            // verifica se a quantidade de parâmetros é a mesma da declaração
            if (tam != quantidade_parametros.get(id)) {
                System.out.println("Número incorreto de argumentos na chamada da função '" + id + "' na linha " + linha);
            }
        }
    }

    @Override
    public void exitChamada_retornar(cpmParser.Chamada_retornarContext ctx) {
        try {
            String id = ctx.tipos_atribuicao().argumento().ID().getText();
            String linha = String.valueOf(ctx.getStart().getLine());

            if (!ids_declarados.containsKey(id)) {
                System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
            }
            else {
                if (nao_inicializadas.contains(id)) {
                    System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                }
            }
        }
        catch (NullPointerException ignored) {

        }
    }

    @Override
    public void exitIndice(cpmParser.IndiceContext ctx) {
        String id = ctx.ID().getText();
        String linha = String.valueOf(ctx.getStart().getLine());

        if (ids_declarados.containsKey(id)) {
            System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
        }
        else {
            if (nao_inicializadas.contains(id)) {
                System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
            }
        }
    }

    @Override
    public void exitExpressao_reduzida(cpmParser.Expressao_reduzidaContext ctx) {
        String id = ctx.ID().getText();
        String linha = String.valueOf(ctx.getStart().getLine());

        if (ids_declarados.containsKey(id)) {
            System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
        }
        else {
            if (nao_inicializadas.contains(id)) {
                System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
            }
        }
    }

    @Override
    public void exitExpressao_aritmetica(cpmParser.Expressao_aritmeticaContext ctx) {
        List<cpmParser.Termo_aritmeticoContext> termos = ctx.termo_aritmetico();

        for (cpmParser.Termo_aritmeticoContext termo: termos) {
            List<cpmParser.Fator_aritmeticoContext> fatores = termo.fator_aritmetico();

            for (cpmParser.Fator_aritmeticoContext fator: fatores) {
                cpmParser.ArgumentoContext argumento = fator.argumento();

                // se conseguir pegar uma variável na expressão,
                // faz as verificações adequadas
                try {
                    String id = argumento.ID().getText();
                    String linha = String.valueOf(ctx.getStart().getLine());

                    // verifica se variável foi declarada
                    if (!ids_declarados.containsKey(id)) {
                        System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
                    }
                    else {
                        if (nao_inicializadas.contains(id)) {
                            System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                        }
                    }
                }
                catch (NullPointerException ignored) {

                }
            }
        }
    }

    @Override
    public void exitExpressao_logica(cpmParser.Expressao_logicaContext ctx) {
        List<cpmParser.Termo_logicoContext> termos = ctx.termo_logico();

        for (cpmParser.Termo_logicoContext termo: termos) {
            List<cpmParser.Fator_logicoContext> fatores = termo.fator_logico();

            for (cpmParser.Fator_logicoContext fator: fatores) {
                // se conseguir pegar uma variável na expressão,
                // faz as verificações adequadas
                try {
                    String id = fator.ID().getText();
                    String linha = String.valueOf(ctx.getStart().getLine());

                    // verifica se variável foi declarada
                    if (!ids_declarados.containsKey(id)) {
                        System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
                    }
                    else {
                        if (nao_inicializadas.contains(id)) {
                            System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                        }
                    }
                }
                catch (NullPointerException ignored) {

                }
            }
        }
    }

    @Override
    public void exitExpressao_relacional(cpmParser.Expressao_relacionalContext ctx) {
        List<cpmParser.Termo_relacionalContext> termos = ctx.termo_relacional();

        for (cpmParser.Termo_relacionalContext termo: termos) {
            List<cpmParser.Fator_relacionalContext> fatores = termo.fator_relacional();

            for (cpmParser.Fator_relacionalContext fator: fatores) {
                cpmParser.ArgumentoContext argumento = fator.argumento();

                // se conseguir pegar uma variável na expressão,
                // faz as verificações adequadas
                try {
                    String id = argumento.ID().getText();
                    String linha = String.valueOf(ctx.getStart().getLine());

                    // verifica se variável foi declarada
                    if (!ids_declarados.containsKey(id)) {
                        System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
                    }
                    else {
                        if (nao_inicializadas.contains(id)) {
                            System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                        }
                    }
                }
                catch (NullPointerException ignored) {

                }
            }
        }
    }
    @Override
    public void exitChamada_atribuicao(cpmParser.Chamada_atribuicaoContext ctx) {
        // remove da lista pois foi atribuído algum valor
        nao_inicializadas.remove(ctx.ID().getText());
    }

    private void verificar_expressoes(cpmParser.Expressao_aritmeticaContext ctx) {
        List<cpmParser.Termo_aritmeticoContext> termos = ctx.termo_aritmetico();

        for (cpmParser.Termo_aritmeticoContext termo: termos) {
            List<cpmParser.Fator_aritmeticoContext> fatores = termo.fator_aritmetico();

            for (cpmParser.Fator_aritmeticoContext fator: fatores) {
                cpmParser.ArgumentoContext argumento = fator.argumento();

                // se conseguir pegar uma variável na expressão,
                // faz as verificações adequadas
                try {
                    String id = argumento.ID().getText();
                    String linha = String.valueOf(ctx.getStart().getLine());

                    // verifica se variável foi declarada
                    if (!ids_declarados.containsKey(id)) {
                        System.out.println("Variável '" + id + "' não foi declarada mas foi usada na linha " + linha);
                    }
                    else {
                        if (nao_inicializadas.contains(id)) {
                            System.out.println("Variável '" + id + "' não foi inicializada mas foi usada na linha " + linha);
                        }
                    }
                }
                catch (NullPointerException ignored) {

                }
            }
        }
    }
}