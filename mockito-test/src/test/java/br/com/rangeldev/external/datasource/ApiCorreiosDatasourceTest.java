package br.com.rangeldev.external.datasource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.Mocks;
import br.com.rangeldev.domain.DadosLocalizacao;
import br.com.rangeldev.repositories.ICorreiosRepository;

@ExtendWith(MockitoExtension.class)
public class ApiCorreiosDatasourceTest {
    @Mock
    private ICorreiosRepository apiDosCorreios;


    @Test
    void deveRetornarNullAoBuscaCep() {
        when(apiDosCorreios.buscaDadosComBaseNoCep(Mocks.cepErrorMock)).thenReturn(null);

        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(Mocks.cepErrorMock);

        assertNull(dadosLocalizacao);
    }

    @Test
    void deveRetornarEstaddoAoBuscaCep() {
        when(apiDosCorreios.buscaDadosComBaseNoCep(Mocks.cepMock)).thenReturn(Mocks.dadosMock);

        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(Mocks.cepMock);

        assertEquals("SP", dadosLocalizacao.getUf());
    }
}
