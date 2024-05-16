package br.com.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsSet {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();

        conjuntoSemGenerics.add("AMC");
        Integer n = 12;
        conjuntoSemGenerics.add(n); // Permite adicionar qualquer tipo de objeto 
           
        
        // Exemplo com Generics
		Set<String> conjuntoGenerics = new HashSet<>();
		conjuntoGenerics.add("Elemento 1");
		conjuntoGenerics.add("Elemento 2");

        		// Iterando sobre o conjunto com Generics
		for (String elemento : conjuntoGenerics) {
			System.out.println(elemento);
		}

		// Iterando sobre o conjunto sem Generics (necessário fazer cast)
		for (Object elemento : conjuntoSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
    }
}
