package br.com.rangeldev.optional;

import java.util.*;

public class OptionalImpl {
    public void optionalOf() {
        // of(value): Cria um Optional contendo o valor fornecido.
        // Se o valor for nulo, lançará uma exceção NullPointerException.
        Optional<String> optionalValue = Optional.of("Optional Of");
        System.out.println(optionalValue.get());
    }

    public void optionalOfNullable(String value) {
        // ofNullable(value): Cria um Optional contendo o valor
        // fornecido, mas permite que o valor seja nulo.

        Optional<String> optionalValue = Optional.ofNullable(value);
        System.out.println("\n Optional Of Nullable  : " + optionalValue.isPresent());
    }

    public void optionalEmpty() {
        // empty(): Retorna um Optional vazio (sem valor).
        Optional<String> optionalValue = Optional.empty();

        System.out.println("\nOptional Empty : " + optionalValue.isPresent() + "\n");

    }

    public void optionalIsPresent() {
        // isPresent(): Verifica se o Optional contém um valor não nulo.
        Optional<String> optionalValue = Optional.of("Não é nulo");
        System.out.println("optionalValue : " + optionalValue.isPresent());

        Optional<String> optionalValueTwo = Optional.of(null);
        System.out.println("optionalValueTwo : " + optionalValueTwo.isPresent());
    }

    public void optionalOfNullableJdk11(String value) {
        // isEmpty() (A partir do Java 11): Verifica se o O
        // ptional está vazio (não contém um valor não nulo).
        Optional<String> optionalValue = Optional.ofNullable(value);
        System.out.println(optionalValue.isEmpty());

        System.out.println("\n Optional Of Nullable SDK 11 ou sup. : " + optionalValue.isEmpty());
    }

    public void optionalOfSdk11(String value) {
        // of(value): Cria um Optional contendo o valor fornecido.
        // Se o valor for nulo, lançará uma exceção NullPointerException.
        Optional<String> optionalValue = Optional.of(value);
        System.out.println("Optional Of  SDK 11 ou sup :\n" + optionalValue.get());
    }

    public void optionalOfOrElse(String value) {
        // orElse(defaultValue): Obtém o valor contido no Optional,
        // ou retorna um valor padrão se o Optional estiver vazio
        Optional<String> optionalValue = Optional.of(value);
        String result = optionalValue.orElse("Default****");
        System.out.println("optionalOf orElse  SDK 11 :" + result);
    }

    public void optionalOfOrElseGet(String value) {
        // orElseGet(supplier): Obtém o valor contido no Optional, ou
        // retorna um valor fornecido por um Supplier se o Optional estiver vazio.
        Optional<String> optionalValue = Optional.ofNullable(value);
        String result = optionalValue.orElseGet(() -> "Value from Supplier*****");
        System.out.println("optionalOf orElseGet  SDK 11 :" + result);

    }

    public void optionalOfOrElseThrow(String value) {
        // orElseThrow(exceptionSupplier): Obtém o valor contido no Optional, ou lança
        // uma exceção
        // fornecida por um Supplier se o Optional estiver vazio.
        Optional<String> optionalValue = Optional.ofNullable(value);
        String result = optionalValue
                .orElseThrow(() -> new RuntimeException("orElseThrow Value not present *********"));
        System.out.println("optionalOf orElseThrow  SDK 11 :" + result);
    }

    public void optionalifPresentSDK11(String msg) {
        // ifPresent(consumer): Executa uma ação fornecida por
        // um Consumer se o Optional contiver um valor.
        Optional<String> optionalValue = Optional.of(msg);
        optionalValue.ifPresent(value -> System.out.println("optionalif ifPresent SDK 11 :" + value));

    }

}
