package br.com.rangeldev.domain;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)@ExtendWith(MockitoExtension.class)
public class BootcampTest {

    final Curso curso1 = new Curso();
    final Mentoria mentoria = new Mentoria();
    final Bootcamp bootcamp = new Bootcamp();
    LocalDate data = LocalDate.now();
    final String desclMock = "Descrição Bootcamp Java Developer";
    final String nameMock = "Bootcamp Java Developer";



    @Test
    @DisplayName(" Deve retornar Nome ------")
    void getNome() {
        bootcamp.setNome(nameMock);
        assertEquals(nameMock, bootcamp.getNome());
    }

    @Test
    @DisplayName(" Deve retornar Descrição ------")
    void getDescricao() {
        bootcamp.setDescricao(desclMock);
        assertEquals(desclMock, bootcamp.getDescricao());
    }

    @Test
    @DisplayName(" Deve retornar true ao add curso  ------")
    void getConteudosCurso() {
        assertEquals(true, bootcamp.getConteudos().add(curso1));
    }

    @Test
    @DisplayName(" Deve retornar true ao add mentoria  ------")
    void getConteudosMentoria() {
        assertEquals(true, bootcamp.getConteudos().add(mentoria));
    }

    @Test
    @DisplayName(" Deve retornar data inicial  ------")
    void getDataInicial() {
        mentoria.setData(data);
        assertEquals(data, bootcamp.getDataInicial());
    }

    @Test
    @DisplayName(" Deve retornar data final  ------")
    void getDataFinal() {
        data = bootcamp.getDataInicial();
        assertEquals(data, bootcamp.getDataInicial());
    }

}
