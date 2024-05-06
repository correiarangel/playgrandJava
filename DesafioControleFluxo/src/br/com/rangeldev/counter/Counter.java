package br.com.rangeldev.counter;

import java.util.Scanner;

import br.com.rangeldev.exception.ParamitterInvalidException;

public class Counter {
    public static void main(String[] args) {
        Scanner cli = new Scanner(System.in);
        cleanCli();
        getNumbers(cli);
        //menu(cli);
    }


    static void getNumbers(Scanner cli) {

        System.out.print("Digite o primeiro parâmetro :");
        int imputOne = cli.nextInt();
        System.out.print("Digite o segundo parâmetro :");
        int imputTwo = cli.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            counter(cli, imputOne, imputTwo);

        } catch (ParamitterInvalidException err) {

            System.out.println("\nOPS! O segundo parâmetro deve ser maior que o primeiro :(\n\n");
        }

    }

    static void counter(Scanner cli, int imputOne, int imputTwo) throws ParamitterInvalidException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (imputOne > imputTwo)
            throw new ParamitterInvalidException();
        int count = imputTwo - imputOne;
        System.out.println("Contator = " + count + "\n");
        for (int i = 0; i < count; i++) {
            System.out.println("Numero : " + i);
        } 
    }

    static void cleanCli() {
        final String os = System.getProperty("os.name");
        try {
            if (os.contains("Windows"))
            {
                new ProcessBuilder("cls").inheritIO().start().waitFor();  // Para windows
                return;
            }
            new ProcessBuilder("clear").inheritIO().start().waitFor(); // Para linux (acho que para mac também)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
       /*  static void menu(Scanner cli) {
        String imputOne = "";
        boolean run = true;

        while (run) {
            System.out.println(
                    "\n| Menu ------------ |\n|" +
                            " - C para calcular |\n|" +
                            " - L Limpar CLI    |\n|" +
                            " - S para sair     |\n");

            imputOne = cli.nextLine().toUpperCase();

            switch (imputOne) {
                case "L":
                    run = false;
                    cleanCli();
                    menu(cli);
                    break;
                case "S":
                    run = false;
                    return;
                case "C":
                    getNumbers(cli);
                    run = false;
                    break;

            }

        }

    } */

