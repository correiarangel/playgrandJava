package br.com.map.operacaobasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
            System.out.println(nome + " removido da agenda de contatos.\n\n");
            return;
        }
        System.out.println("A agenda de contatos está vazia.\n\n");

    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
            return;
        }
        System.out.println("A agenda de contatos está vazia.\n\n");

    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            return numeroENull(numeroPorNome);
        }
        System.out.println("A agenda de contatos está vazia.\n\n");

        return numeroPorNome;
    }

    private Integer numeroENull(Integer numeroPorNome) {
        if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.\n\n");
            return numeroPorNome;
        }
        return numeroPorNome;
    }
}
