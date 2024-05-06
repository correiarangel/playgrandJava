package br.com.rangeldev.verificacaochequeespecial;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        validSaldo(saque, saldo, limiteChequeEspecial);
        scanner.close();
    }

    static void validSaldo(double saque, double saldo, double limiteEspecial) {
        if (saldo >= saque) {
            System.out.println("Transação realizada com sucesso");
            return;
        }

        if (saldo < saque) {
            validSaldoEspecial(saque, saldo, limiteEspecial);
            return;
        }
        return;
    }

    static void validSaldoEspecial(double saque, double saldo, double limiteEspecial) {

        if ((saldo + limiteEspecial) < saque) {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            return;
        }
        System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
    }
}