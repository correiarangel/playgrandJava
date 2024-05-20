package br.com.rangeldev.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class SupplierImpl {

    public  void run(int limit) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
    
        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(limit)
         .collect(Collectors.toList());
    
        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
      }
}
