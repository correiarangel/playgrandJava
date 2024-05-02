package br.com.avaliablestundent;

import java.util.Scanner;

public class AvaliableStundet {
    public static void main(String[] args){
        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);
    }
/*     public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int imput = imputNote(scanner);
        isAproved(scanner, imput);

    }

    public static void isAproved(Scanner scanner, int note) {
        
        if (note == 10) {
            System.out.println("APROVADO COM LOUVOR");
            exitSystem(scanner);
        }
        if (note <= 5) {
            System.out.println("REPROVADO");
            exitSystem(scanner);
        }
        if (note == 6) {
            System.out.println("CONSELHO");
            exitSystem(scanner);
        }
        if (note >= 7) {
            System.out.println("APROVADO");
            exitSystem(scanner);
        }

   

    }

    public static int imputNote(Scanner scanner) {
        System.out.println("Digite sua nota: ");
        return scanner.nextInt();
    }


    public static void exitSystem(Scanner scanner) {
        String result = "";
        boolean repter = true;

        while (repter) {
            result = scanner.nextLine().toUpperCase();
            if (result.equals("S") || result.equals("N")) repter = false;
           
            if (repter) System.out.println("Deseja sair  S/N ? : ");
            
        }

        switch (result) {
            case "S":
                return;
            case "N":
                int imput = imputNote(scanner);
                isAproved(scanner, imput);
                break;
        }
    } */
}
