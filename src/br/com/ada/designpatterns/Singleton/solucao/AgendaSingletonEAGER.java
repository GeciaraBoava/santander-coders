package br.com.ada.designpatterns.Singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER { //EAGER é uma forma de carregamento do Java

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
    //static só aceita 1 instância

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonEAGER() { //CONSTRUTOR
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }
    public static AgendaSingletonEAGER getInstance() {
        return INSTANCE;

        //com o INSTANCE,o método vai trabalhar na mesma instância (espaço na memória)
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }
    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }

}
