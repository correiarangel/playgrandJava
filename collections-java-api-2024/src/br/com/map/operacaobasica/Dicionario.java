package br.com.map.operacaobasica;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
            return;
        }
        System.out.println("O dicionário está vazio.");

    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Ops! Linguagem não encontrada no dicionário.\n";
    }

    public void exibirPalavras() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario + "\n");
            return;
        }
        System.out.println("O dicionário está vazio.");
    }
}
