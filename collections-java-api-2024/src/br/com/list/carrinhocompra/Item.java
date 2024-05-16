package br.com.list.carrinhocompra;

import java.util.UUID;

public class Item {
   
    private UUID uuid;
    private String nome;
    private double custoVenda;
    private double quantidade;

    public Item(String nome, double custoVenda, double quantidade) {
        uuid = UUID.randomUUID();
        this.nome = nome;
        this.custoVenda = custoVenda;
        this.quantidade = quantidade;
    }


    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getCustoVenda() {
        return custoVenda;
    }

    public void setCustoVenda(double vslorVenda) {
        this.custoVenda = vslorVenda;
    }


    public UUID getUuid() {
        return uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String descricao) {
        this.nome = descricao;
    }

    @Override
    public String toString() {
        return "| ID : " + uuid + "\n" +
               "| Nome : " + nome + "\n" +
               "| Qt : " + quantidade + "\n" +
               "| R$ : " + custoVenda + "\n\n";
    }
}
