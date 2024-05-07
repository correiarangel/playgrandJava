package br.com.rangeldev.controlesimplesdesaques;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = scanner.nextDouble();

        if (saque > 0 && saque > limiteDiario || limiteDiario == 0 & saque == 0) {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            scanner.close();
            return;
        }

        for (double i = saque; i <= limiteDiario; limiteDiario = -i) {
            if (saque <= limiteDiario)
                saque = saque(limiteDiario, saque);
            saque = scanner.nextDouble();
            if (saque == 0) {
                scanner.close();
                return;
            }
        }

        scanner.close();
        return;
    }

    static double saque(double limiteDiario, double saque) {
        String msg = "Saque realizado. Limite restante: ";

        double saldo = limiteDiario - saque;
        message(saldo, msg);
        return saldo;

    }

    static void message(double limiteDiario, String msg) {
        System.out.println(msg + limiteDiario);
        System.out.println("Transacoes encerradas.");
    }
}

/*
 * 
 * public class ControleSimplesDeSaques {
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * double limiteDiario = scanner.nextDouble();
 * double saque = scanner.nextDouble();
 * 
 * if (saque > 0 && saque > limiteDiario) {
 * System.out.println("Limite diario de saque atingido. Transacoes encerradas."
 * );
 * scanner.close();
 * return;
 * }
 * 
 * for (double i = saque; i <= limiteDiario; limiteDiario = -i) {
 * if (saque <= limiteDiario)
 * saque(limiteDiario, saque);
 * saque = scanner.nextDouble();
 * }
 * 
 * scanner.close();
 * }
 * 
 * static boolean isLimiteDiario(double limiteDiario, double saque, Scanner
 * scanner) {
 * if (saque > limiteDiario) {
 * System.out.println("Limite diario de saque atingido. Transacoes encerradas."
 * );
 * scanner.close();
 * return false;
 * }
 * return true;
 * }
 * 
 * static double saque(double limiteDiario, double saque) {
 * String msg = "Saque realizado. Limite restante:";
 * 
 * double saldo = limiteDiario - saque;
 * message(saldo, msg);
 * return saldo;
 * 
 * }
 * 
 * static void message(double limiteDiario, String msg) {
 * System.out.println(msg + limiteDiario);
 * System.out.println("Transacoes encerradas.");
 * }
 * }
 * 
 * 
 */