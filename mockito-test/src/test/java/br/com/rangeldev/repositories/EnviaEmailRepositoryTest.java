package br.com.rangeldev.repositories;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.Mocks;
import br.com.rangeldev.domain.DadosLocalizacao;

@ExtendWith(MockitoExtension.class)
public class EnviaEmailRepositoryTest {
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
