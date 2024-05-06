package br.com.rangeldev.verificadorelegibilidadeconta;

import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        validImput(idade); 
        scanner.close();
    }

    private static void validImput(int opImput) {
        if (opImput < 18) {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            return;
        }
        System.out.println("Voce esta elegivel para criar uma conta bancaria.");

    }
}