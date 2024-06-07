package br.com.rangeldev.lab_padroes_projeto_spring.gof.service;

import br.com.rangeldev.lab_padroes_projeto_spring.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author rangel
 */
public interface IClienteService {
	Iterable<Cliente> findAll();
	Cliente findClientID(Long id);
	void insertClient(Cliente cliente);
	void updateClient(Long id, Cliente cliente);
	void deleteClient(Long id);
}
