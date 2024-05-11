package br.com.banco.main;


import java.util.Scanner;

import br.com.banco.criarconta.CriarConta;
import br.com.banco.criarconta.ICriarConta;
import br.com.banco.startsystem.IStartSystem;
import br.com.banco.startsystem.StartSystem;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ICriarConta  criarConta = new CriarConta(scanner); //injeta Scanner injeção de dependencia
        IStartSystem system = new StartSystem(criarConta);
        system.run();

    }
}
