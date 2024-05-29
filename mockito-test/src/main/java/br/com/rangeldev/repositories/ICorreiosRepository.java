package br.com.rangeldev.repositories;

import br.com.rangeldev.domain.DadosLocalizacao;

public interface ICorreiosRepository {
  public DadosLocalizacao  buscaDadosComBaseNoCep(String cep);
}