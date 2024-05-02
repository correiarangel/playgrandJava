package br.com.banco.criarconta;

import java.util.Scanner;

import br.com.banco.conta.Conta;

public class CriarConta {

    public static void main(String[] args) throws Exception {
        Conta conta = criar();

        if(conta.getNumero() == -1) return;
        showConta(conta);
    }

    public static Conta criar() throws Exception {
        Conta conta = new Conta();

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

        try {
            conta = getConta(conta, scanner);
        } catch (Exception e) {
            System.out.println("Digite numeros validos para conta \n");
            conta.setNumero(-1);
            return conta;
        }

        try {

            conta = getSaldo(conta, scanner);
        } catch (Exception e) {
            System.out.println("Digite numeros validos \n");
            conta.setNumero(-1);
            return conta;
        }

        return conta;
    }

    public static Conta getConta(Conta conta, Scanner scanner) {

        System.out.println("Digite o numero da conta ex. 250005: ");
        int numeroConta = scanner.nextInt();
        conta.setNumero(numeroConta);

        return conta;
    }

    public static Conta getSaldo(Conta conta, Scanner scanner) {

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
