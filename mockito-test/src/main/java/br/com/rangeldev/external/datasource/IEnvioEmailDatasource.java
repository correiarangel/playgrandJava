package br.com.rangeldev.external.datasource;

public interface IEnvioEmailDatasource {
    void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml);
}
