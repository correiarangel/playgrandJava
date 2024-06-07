package br.com.rangeldev.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import br.com.rangeldev.controller.GeradorDeNumeros;

/**
 * Teste da classe {@Link GeradorDeNumeros} exemplificando testes de métodos
 * estáticos
 */
@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {
    static MockedStatic<GeradorDeNumeros> gerador;

    @BeforeAll
    public static void setUp() throws IOException {
        gerador = Mockito.mockStatic(GeradorDeNumeros.class);
    }

    @Test
    void validaGeracaoListaDeNumeros() {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        gerador.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt()))
                .thenReturn(integers);

        Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios(8));
    }

    @Test
    void validaGeracaoListaDeNumerosSemInformarTamanho() {

        List<Integer> integers = List.of(10, 9, 8, 6);

        gerador.when(GeradorDeNumeros::geraNumerosAleatorios).thenReturn(integers);

        Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios());
    }
}
