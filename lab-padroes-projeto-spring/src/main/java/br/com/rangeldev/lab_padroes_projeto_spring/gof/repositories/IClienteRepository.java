package br.com.rangeldev.lab_padroes_projeto_spring.gof.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rangeldev.lab_padroes_projeto_spring.gof.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {}