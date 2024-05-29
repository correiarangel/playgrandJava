package br.com.rangeldev.external.datasource;

import br.com.rangeldev.domain.Email;
import br.com.rangeldev.domain.Formato;
import br.com.rangeldev.repositories.PlataformaDeEnvio;

public class EnvioEmailDatasource {

    private PlataformaDeEnvio plataforma;

    void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if(formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        }else{
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        plataforma.enviaEmail(email);
    }
}
