package br.com.banco.criarconta;

import java.util.Scanner;

import br.com.banco.contamodel.ContaModel;

public class CriarConta implements ICriarConta {
    // Note que implemento a interface ICriarConta
    // pocibilita inverção de dependencia se precisar de CriarConta 
    // intacimos ICriarConta assim dependo de um interface e nã de uma implementação 
    private final Scanner scanner;  //injeta Scanner no construtor -> injeção de dependencia

    public CriarConta(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public ContaModel criar() throws Exception {
        ContaModel conta = new ContaModel();

        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Bem Vindo vamos abrir sua conta");

        System.out.println("Digite seu nome ex MARIO ANDRADE: ");
        String nome = scanner.nextLine();
        conta.setClienteName(nome);

        System.out.println("Digite a Agencia ex. 067-8: ");
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

            conta = getConta(conta, scanner);
            if(conta.getNumero() ==-1){
                System.out.println("OPS! falha ou criar conta utilize apenas numeros para conta.");
                return conta;
            }
            
            conta = getSaldo(conta, scanner);
            if(conta.getSaldo() ==-1){
                System.out.println("OPS! falha ou criar conta utilize apenas numeros para saldo.");
                return conta;
            }


        return conta;
    }

    @Override
    public ContaModel getConta(ContaModel conta, Scanner scanner) {

        System.out.println("Digite o numero da conta ex. 250005: ");
        try {
            int numeroConta = scanner.nextInt();
            conta.setNumero(numeroConta);
        } catch (Exception e) {
            System.out.println(" ERRO : " + e.getMessage());
            conta.setNumero(-1);
        }

        return conta;
    }

    public ContaModel getSaldo(ContaModel conta, Scanner scanner) {

        System.out.println("Digite seu Saldo ex. 1254,88: ");

        try {
            double saldo = scanner.nextDouble();
            conta.setSaldo(saldo);
        } catch (Exception e) {
            conta.setSaldo(-1);
            System.out.println("ERRO : " + e.getMessage());
        }

        return conta;

    }

    @Override
    public void showConta(ContaModel conta) {
        System.out.println("Olá " + conta.getClienteName() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta.getAgencia() + ", conta " + conta.getAgencia());
        System.out.println("Seu saldo R$:" + conta.getSaldo() + " já está disponível para saque");
    }

}
