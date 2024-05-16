package br.com.list.carrinhocompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, double quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemList.remove(i);
                    return;
                }
            }
            System.out.println("Nome não encontrado!");
            return;
        }

        System.out.println("A lista está vazia!");
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getCustoVenda() * item.getQuantidade();
                valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }
        throw new RuntimeException("A lista está vazia!");
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
            return;
        }
        System.out.println("A lista está vazia!");

    }

    @Override
    public String toString() {
      return "CarrinhoDeCompras : " + " itens : " + itemList +"\n";
    }
}
