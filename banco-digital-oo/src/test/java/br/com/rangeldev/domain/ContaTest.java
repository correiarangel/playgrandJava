package br.com.rangeldev.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.rangeldev.controllers.ContaCorrente;
import br.com.rangeldev.controllers.ContaPoupanca;

public class ContaTest {

    final Cliente clienteFake = new Cliente("Juca Pirama", "309.300.898.54");
    final Conta contaFake = new ContaCorrente(clienteFake, 0002);
    final Conta contaPoupancaFake = new ContaPoupanca(clienteFake, 0002);



    @Test
    @DisplayName(" Deve retornar nome Cliente  ------")
    void getCodigoBanco() {
        assertEquals("Juca Pirama", contaFake.getCliente().getNome());
    }

    @Test
    @DisplayName(" Deve retornar saldo R$ 990.0 ------")
    void deposito() {
        contaFake.depositar(1000.0);
        assertEquals(true, contaFake.sacar(10));
        assertEquals(990.0, contaFake.getSaldo());
    }

    @Test
    @DisplayName(" Deve sacar valor  ------")
    void sacar() {
        contaFake.depositar(1000);
        assertEquals(true, contaFake.sacar(800));
    }

    @Test
    @DisplayName(" Deve tranrerir retornar saldo 0 em contaFake, 1000 em  contaPoupancaFake ------\n")
    void tranferir() {
        contaFake.depositar(1000);
        assertEquals(true, contaFake.transferir(1000, contaPoupancaFake));
        assertEquals(0, contaFake.getSaldo());
        assertEquals(1000, contaPoupancaFake.getSaldo());
    }

}
