package br.com.rangeldev.repositories;




import br.com.rangeldev.domain.Email;
import br.com.rangeldev.external.datasource.IEnvioEmailDatasource;

public class SendEmailRepository implements ISendEmailRepository {
final IEnvioEmailDatasource datasource;
    public SendEmailRepository(IEnvioEmailDatasource datasource) {
    this.datasource = datasource;
}
    @Override
    public void enviaEmail(Email email) {
      try {
        datasource.enviaEmail(email);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
        
    }

}
