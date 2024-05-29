package br.com.rangeldev.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.rangeldev.Mocks;
import br.com.rangeldev.domain.DadosLocalizacao;
import br.com.rangeldev.domain.Pessoa;
import br.com.rangeldev.repositories.ICorreiosRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyString;

/**
 * Teste da classe {@link CadastrarPessoa} apresentando cenários básicos de uso
 * do Mockito, usando o recurso
 * de mocks e a manipulação de retornos, da forma mais simples e com manipulação
 * de erros
 */
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ICorreiosRepository repository;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void deveCadastrarPessoa() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao(
                "MG",
                "Uberaba",
                "Rua Castro Alves",
                "Casa",
                "Nova Floresta");

        Mockito.when(repository.buscaDadosComBaseNoCep(Mocks.cepMock)).thenReturn(dadosLocalizacao);

        Pessoa jose = cadastrarPessoa.cadastrarPessoa(
                "José",
                "28578527976",
                LocalDate.of(1947, 1, 15),
                Mocks.cepMock);

        DadosLocalizacao enderecoJose = jose.getEndereco();

        assertEquals(dadosLocalizacao.getBairro(), enderecoJose.getBairro());
        assertEquals(dadosLocalizacao.getCidade(), enderecoJose.getCidade());
        assertEquals(dadosLocalizacao.getUf(), enderecoJose.getUf());
    }

    @Test
    void deveRetornaErroAoCadastrarPessoa() {

        Mockito.when(repository.buscaDadosComBaseNoCep(anyString())).thenThrow(RuntimeException.class);

        Assertions.assertThrows(RuntimeException.class,
                () -> cadastrarPessoa.cadastrarPessoa(
                        "José",
                        "28578527976",
                        LocalDate.of(1947, 1, 15),
                        Mocks.cepErrorMock));
    }

}
