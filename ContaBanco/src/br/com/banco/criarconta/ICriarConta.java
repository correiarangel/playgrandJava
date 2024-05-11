package br.com.banco.criarconta;

import java.util.Scanner;

import br.com.banco.contamodel.ContaModel;

public interface ICriarConta {
    public  ContaModel criar() throws Exception;
    public  ContaModel getConta(ContaModel conta, Scanner scanner);
    public  ContaModel getSaldo(ContaModel conta, Scanner scanner);
    public  void showConta(ContaModel conta);
}
