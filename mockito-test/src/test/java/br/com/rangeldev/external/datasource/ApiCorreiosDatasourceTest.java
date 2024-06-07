package br.com.rangeldev.external.datasource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.Mocks;
import br.com.rangeldev.domain.DadosLocalizacao;


@ExtendWith(MockitoExtension.class)
public class ApiCorreiosDatasourceTest {
    @Mock
    private IApiCorreiosDatasource apiDosCorreios;


    @Test
    void deveRetornarNullAoBuscaCep()  {
        when(apiDosCorreios.getDadosLocalizacao(Mocks.cepErrorMock)).thenThrow(RuntimeException.class);
        assertThrows(RuntimeException.class,()->apiDosCorreios.getDadosLocalizacao(Mocks.cepErrorMock));
    }

    @Test
    void deveRetornarEstaddoAoBuscaCep() throws InterruptedException, ExecutionException {
        when(apiDosCorreios.getDadosLocalizacao(Mocks.cepMock)).thenReturn(CompletableFuture.completedFuture(Mocks.dadosMock));
        CompletableFuture<DadosLocalizacao> dadosLocalizacao = apiDosCorreios.getDadosLocalizacao(Mocks.cepMock);
        assertEquals("SP", dadosLocalizacao.get().getUf());
    }
}
