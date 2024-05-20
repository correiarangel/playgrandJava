package br.com.rangeldev.functional_interface;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionImpl {

    public void run() {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        // lista
        List<Integer> numerosDodrados = numeros.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("\n Numeros Dodrados / \n");
        numerosDodrados.forEach(System.out::println);

    }
    // Usar a Function com expressão lambda para dobrar todos os números

    Function<Integer, Integer> dobrar = numero -> numero * 2;

    public void dobrarRun(Integer num) {
          Integer n = dobrar.apply(num);
          System.out.println("\n Numero Dodrado ///>  " + n);
    }

}
