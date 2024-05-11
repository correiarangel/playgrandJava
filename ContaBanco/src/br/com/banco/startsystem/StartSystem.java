package br.com.banco.startsystem;

import br.com.banco.contamodel.ContaModel;
import br.com.banco.criarconta.ICriarConta;

public class StartSystem implements IStartSystem {
    private final ICriarConta criarConta;

    public StartSystem(ICriarConta criarConta) {
        this.criarConta = criarConta;
    }

    @Override
    public void run() {

        try {
            ContaModel conta = criarConta.criar();
            if (conta.getNumero() == -1 || conta.getSaldo() == -1) return;
            criarConta.showConta(conta);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }



}
