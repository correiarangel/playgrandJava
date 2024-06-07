package br.com.rangeldev.external.datasource;

import java.util.concurrent.CompletableFuture;

import br.com.rangeldev.domain.Email;

public interface IEnvioEmailDatasource {
      public CompletableFuture<Email>  enviaEmail(Email email); 
}
