package br.com.rangeldev.external.datasource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.Mocks;

import br.com.rangeldev.domain.Email;
import br.com.rangeldev.domain.Formato;


@ExtendWith(MockitoExtension.class)
public class EnviaEmailDatasourceTest {
    @Mock
    private EnvioEmailDatasource datasource;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void validaSeEmailEstaComDadosCorretos() {
        datasource.enviaEmail(Mocks.email);
        Mockito.verify(datasource).enviaEmail(emailCaptor.capture());
        Email emailCapturado = emailCaptor.getValue();
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }

    @Test
    void deveRetornarNullAoEnviarEmail() {
        datasource.enviaEmail(null);
        Mockito.verify(datasource).enviaEmail(emailCaptor.capture());
        Email emailCapturado = emailCaptor.getValue();
        assertNull(emailCapturado );
    }
}
