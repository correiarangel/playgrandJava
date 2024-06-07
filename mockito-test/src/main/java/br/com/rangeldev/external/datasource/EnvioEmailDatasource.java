package br.com.rangeldev.external.datasource;

import java.util.concurrent.CompletableFuture;
import br.com.rangeldev.domain.Email;

public class EnvioEmailDatasource implements IEnvioEmailDatasource {

    @Override
    public CompletableFuture<Email> enviaEmail(Email email) {
        return CompletableFuture.supplyAsync(() -> {

            try {
                // Simulando tempo de espera de 3 segundos
                Thread.sleep(3000);
                return email;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
    }
}
