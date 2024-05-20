package br.com.rangeldev.functional_interface;


import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    public  void binaryOperatorRun(List<Integer> numeros ) {

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum;
                
        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
            .reduce(0, Integer::sum);
    
        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
      }
}
