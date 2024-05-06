package br.com.rangeldev.simulacaobancaria;

import java.util.Scanner;

public class SimulacaoBancaria {
    private static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    static void menu(Scanner scanner) {
        while (true) {
            /*
             * System.out.println(
             * "\n 1 - Depositar \n" +
             * " 2 - Sacar \n" +
             * " 3 - Consultar Saldo \n" +
             * " 4 - Encerrar \n");
             */

             
            String opImput = scanner.nextLine();
            int opcao = validImput(opImput);

            switch (opcao) {
                case 1:
                    depositar(scanner);
                    break;
                case 2:
                    sacar(scanner);
                    break;
                case 3:
                    saldo();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;

/*                 case -1:
                    System.out.println("Opção inválida. Tente novamente.");
                    break; */

            }

        }
    }

    private static int validImput(String opImput) {
        if (opImput.equals("1")) return 1;
        if (opImput.equals("2")) return 2;
        if (opImput.equals("3")) return 3;
        if (opImput.equals("0")) return 0;

        return -1;
    }

    public static void sacar(Scanner scanner) {

        // System.out.print("Digite o valor do Saque : ");
        double saque = scanner.nextDouble();
        if (saldo < saque) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo = saldo - saque;
        saldo();
    }

    public static void saldo() {
        System.out.print("Saldo atual: "+saldo+"\n");
    }

    public static void depositar(Scanner scanner) {
        // System.out.print("Digite o valor do Deposito : ");
        double deposito = scanner.nextDouble();
        saldo = saldo + deposito;
        saldo();
    }
}