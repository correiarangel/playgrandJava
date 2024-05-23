package br.com.rangeldev.domain;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.rangeldev.controllers.ContaCorrente;
import br.com.rangeldev.controllers.ContaPoupanca;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {

    Banco banco = new Banco();
    List<Conta> contas = new ArrayList<Conta>();
    Cliente cliente = new Cliente("Juca Pirama", "309.300.898.54");
    Conta conta = new ContaCorrente(cliente, 0002);
    Conta contaPoupanca = new ContaPoupanca(cliente, 0002);

    @Test
    @DisplayName(" Deve retornar codigo banco  ------")
    void getCodigoBanco() {
        banco.setCodigoBanco(00015);
        assertEquals(00015, banco.getCodigoBanco());
    }

    @Test
    @DisplayName(" Deve retornar nome banco  ------")
    void setNome() {
        banco.setNome("MyBank");
        assertEquals("MyBank", banco.getNome());
    }

    @Test
    @DisplayName(" Deve inserir contas ------")
    void setCodigoBanco() {
        contas.add(conta);
        assertEquals(0001, contas.get(0).getAgencia());
    }

    @Test
    @DisplayName(" Deve retornar contas ------\n")
    void getContas() {
        contas.add(conta);
        contas.add(contaPoupanca);
        banco.setContas(contas);
        assertEquals(2, banco.getContas().size());
    }

}
