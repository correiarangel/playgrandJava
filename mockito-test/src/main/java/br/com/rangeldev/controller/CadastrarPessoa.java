package br.com.rangeldev.controller;


import java.time.LocalDate;


import br.com.rangeldev.domain.DadosLocalizacao;
import br.com.rangeldev.domain.Pessoa;
import br.com.rangeldev.repositories.ICorreiosRepository;

public class CadastrarPessoa {

    private ICorreiosRepository apiDosCorreios;

    public CadastrarPessoa(final ICorreiosRepository apiDosCorreios) {
        this.apiDosCorreios = apiDosCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiDosCorreios.buscaDadosComBaseNoCep(cep);
        pessoa.adicionaDadosDeEndereco(dadosLocalizacao);
        return pessoa;
    }

}
