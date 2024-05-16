package br.com.list.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefaz adicionada : " + descricao);
    }

    public void removeTarefa(String descricao) {
        if (!tarefas.isEmpty()) {

            for (Tarefa t : tarefas) {

                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefas.remove(t);
                    System.out.println("Tarefaz : " + t.getDescricao() + " - ID :" + t.getUuid() + "Romovida");
                    return;
                }
            }

        }
        System.out.println("Tarefaz : " + descricao + " Não encontrada \n");
    }

    public void obterDescricoesTarefas() {
        if (!tarefas.isEmpty()) {
          for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getDescricao()+"\n");
          }
            return;
        }
        System.out.println("A lista está vazia!\n");

    }

    public int obterNumeroTotalTarefas() {
        int  qt = tarefas.size();
        System.out.println("Você tem " + qt + " tarefas na lista \n");
        return qt;
    }

}
