package br.com.rangeldev.functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
    /**
     * Representa uma operação que aceita um argumento do tipo T e não retorna
     * nenhum resultado.
     * É utilizada principalmente para realizar ações, ou efeitos colaterais nos
     * elementos do Stream sem modificar, ou
     * retornar um valor.
     */

    public void imprimirNumeroParLambda(List<Integer> numeros) {
        System.out.println("\n");
        System.out.println("imprimirNumeroParLambda \n");
        if (numeros.isEmpty())
            throw new RuntimeException("Ops! Listas Zerada");

        // Usar o Consumer com expressão lambda para imprimir números pares

            Consumer<Integer> imprimirNumeroPar = numero -> {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            };

            numeros.stream().forEach(imprimirNumeroPar); 

    }

    public void imprimirNumeroParStream(List<Integer> numeros) {
        System.out.println("imprimirNumeroParStream \n");
        if (numeros.isEmpty())
            throw new RuntimeException("Ops! Listas Zerada");

        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
