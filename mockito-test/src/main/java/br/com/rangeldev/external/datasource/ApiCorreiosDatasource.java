package br.com.rangeldev.external.datasource;

import br.com.rangeldev.domain.DadosLocalizacao;

import java.util.concurrent.CompletableFuture;

public class ApiCorreiosDatasource implements IApiCorreiosDatasource {

    // Método que simula a chamada GET
    @Override
    public CompletableFuture<DadosLocalizacao> getDadosLocalizacao(String cep) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulando tempo de espera de 3 segundos
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Retornando dados simulados
            return new DadosLocalizacao("SP", "São Paulo", "Avenida Paulista", "1234", "Bela Vista");
        });
    }

}