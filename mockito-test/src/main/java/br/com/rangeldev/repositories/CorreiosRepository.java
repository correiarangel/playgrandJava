package br.com.rangeldev.repositories;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import br.com.rangeldev.domain.DadosLocalizacao;
import br.com.rangeldev.external.datasource.IApiCorreiosDatasource;


public class CorreiosRepository implements ICorreiosRepository {
  final IApiCorreiosDatasource datasource;

  public CorreiosRepository(IApiCorreiosDatasource datasource) {
    this.datasource = datasource;
  }

  @Override
  public DadosLocalizacao buscaDadosComBaseNoCep(String cep) {

    CompletableFuture<DadosLocalizacao> result = datasource.getDadosLocalizacao(cep);

    // Utilizando get() para esperar o resultado da chamada assíncrona
    try {
      return result.get();
    } catch (InterruptedException | ExecutionException e) {
      //e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

}
