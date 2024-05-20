package br.com.rangeldev.functional_interface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {

    public void run(
            List<String> palavras, int qtCaracter) {
        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> textoComMaisDeCincoCaracter = palavra -> palavra.length() > qtCaracter;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em
        // seguida,
        // imprimir cada palavra que passou no filtro

        palavras.stream()
                .filter(textoComMaisDeCincoCaracter)
                .forEach(System.out::println);
    }

}
