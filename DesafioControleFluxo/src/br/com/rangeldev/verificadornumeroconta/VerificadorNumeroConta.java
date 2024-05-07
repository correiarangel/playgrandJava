package br.com.rangeldev.verificadornumeroconta;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o limite diário de saque
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        // Laço for para iterar sobre os saques
        for (int i = 1;; i++) {
            // Solicita ao usuário que informe o valor do saque
           // System.out.println("Informe o valor do saque " + i + " (ou 0 para encerrar):");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é 0 para encerrar o loop
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Se não ultrapassar o limite, realiza o saque com sucesso
            limiteRestante -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + limiteRestante);
        }

        scanner.close();
    }
}

/* 
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
 */