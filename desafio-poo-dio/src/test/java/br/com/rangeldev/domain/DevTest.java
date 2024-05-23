package br.com.rangeldev.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DevTest {

    final Set<Conteudo> conteudos = new LinkedHashSet();
    final Curso curso1 = new Curso();
    final Mentoria mentoria = new Mentoria();
    final Bootcamp bootcamp = new Bootcamp();
    LocalDate data = LocalDate.now();
    final String desclMock = "Descrição Bootcamp Java Developer";
    final String nameMock = "Juca Pirama";
    Dev dev = new Dev();

    void initFakes() {
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        conteudos.add(curso1); 
        bootcamp.setConteudos(conteudos);
        dev.inscreverBootcamp(bootcamp);
    }

    @Test
    @DisplayName(" Deve retornar nome Dev  ------")
    void getCodigoBanco() {
        dev.setNome(nameMock);
        assertEquals(nameMock, dev.getNome());
    }

    @Test
    @DisplayName(" Deve retornar set de Conteudo Dev------")
    void getConteudos() {
        dev.inscreverBootcamp(bootcamp);
        Set<Conteudo> set = dev.getConteudosConcluidos();
        assertEquals(set, dev.getConteudosConcluidos());
    }

    @Test
    @DisplayName(" Deve retornar set de Inscritos Dev------")
    void getIncricao() {
        dev.inscreverBootcamp(bootcamp);
        Set<Conteudo> set = dev.getConteudosInscritos();
        assertEquals(set, dev.getConteudosInscritos());
    }

    @Test
    @DisplayName(" Deve calcular XP  Dev------")
    void calcularXp() {    
        initFakes();    
        dev.progredir();
        assertEquals(80, dev.calcularTotalXp());
    }


}
