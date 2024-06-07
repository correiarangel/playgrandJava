package br.com.rangeldev.lab_padroes_projeto_spring.gof.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rangeldev.lab_padroes_projeto_spring.gof.model.Endereco;

@Repository
public interface IEnderecoRepository extends CrudRepository<Endereco, String> {}