package br.com.rangeldev.verificadornumeroconta;

import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String opImput = scanner.nextLine();
            verificarNumeroConta(opImput);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws Exception {

        if (numeroConta.length() < 8 || numeroConta.length() > 8) {
            throw new Exception("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
        System.out.println("Numero de conta valido.");
    }
}
