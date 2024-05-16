package br.com.list.tarefas;

import java.util.UUID;

public class Tarefa {
    
    private String descricao;
    private UUID uuid;
   
    public Tarefa(String descricao) {
        this.descricao = descricao;
        uuid = UUID.randomUUID();
    }
   
    public UUID getUuid() {
        return uuid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
