package br.com.banco.criarconta;

import java.util.Scanner;

import br.com.banco.conta.Conta;

public class CriarConta {

    public static void main(String[] args) {
        Conta conta = criar();
        showConta(conta);
    }

    public static Conta criar() {
        Conta conta = new Conta();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Bem Vindo vamos abrir sua conta");

        System.out.println("Digite seu nome ex MARIO ANDRADE: ");
        String nome = scanner.nextLine();
        conta.setClienteName(nome);

        System.out.println("Digite a Agencia ex. 067-8: ");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Digite o numero da conta ex. 250005: ");
        int numeroConta = scanner.nextInt();
        conta.setNumero(numeroConta);

        System.out.println("Digite seu Saldo ex. 1254,88: ");
        double saldo = scanner.nextDouble();
        conta.setSaldo(saldo);
        return conta;

    }

    public static void showConta(Conta conta) {
        System.out.println("Olá " + conta.getClienteName() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta.getAgencia() + ", conta " + conta.getAgencia());
        System.out.println("Seu saldo R$:" + conta.getSaldo() + " já está disponível para saque");
    }

}
