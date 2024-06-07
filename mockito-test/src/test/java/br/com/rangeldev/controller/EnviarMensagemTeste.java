package br.com.rangeldev.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.controller.EnviarMensagem;
import br.com.rangeldev.domain.Mensagem;

import static org.mockito.Mockito.verify;

/**
 * Teste da classe {@link EnviarMensagem} exemplificando Spy
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    @Spy
    EnviarMensagem enviarMensagem = new EnviarMensagem();

    @Test
    void adicionarMensagem() {
        Mensagem mensagem = new Mensagem("Hello World");

        enviarMensagem.adicionarMensagem(mensagem);

        verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertEquals(1, enviarMensagem.getMensagens().size());
    }

}
