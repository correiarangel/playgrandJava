package br.com.rangeldev.repositories;

import br.com.rangeldev.domain.Email;

public interface ISendEmailRepository {
    public void enviaEmail(Email email);
}
