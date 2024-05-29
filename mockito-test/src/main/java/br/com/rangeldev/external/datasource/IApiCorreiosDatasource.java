package br.com.rangeldev.external.datasource;

import br.com.rangeldev.domain.DadosLocalizacao;

import java.util.concurrent.CompletableFuture;

public interface IApiCorreiosDatasource {
    public CompletableFuture<DadosLocalizacao> getDadosLocalizacao(String cep);
}