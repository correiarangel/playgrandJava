package br.com.rangeldev.lab_padroes_projeto_spring.gof.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rangeldev.lab_padroes_projeto_spring.gof.model.Cliente;
import br.com.rangeldev.lab_padroes_projeto_spring.gof.model.Endereco;
import br.com.rangeldev.lab_padroes_projeto_spring.gof.repositories.IClienteRepository;
import br.com.rangeldev.lab_padroes_projeto_spring.gof.repositories.IEnderecoRepository;

/**
 * Implementação da <b>Strategy</b> {@link IClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements IClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private IClienteRepository clienteRepository;
	@Autowired
	private IEnderecoRepository enderecoRepository;
	@Autowired
	private IViaCepService viaCepService;

	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> findAll() {
		Iterable<Cliente> result = null;
		try {
			result = clienteRepository.findAll();
			if (result.iterator().hasNext())
				return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ops! Lista de clientes esta vazia!");
		}
		throw new RuntimeException("Ops! Lista de clientes esta vazia!");
	}

	@Override
	public Cliente findClientID(Long id) {
		try {
			Optional<Cliente> cliente = clienteRepository.findById(id);
			if (cliente.isPresent())
				return cliente.get();
			throw new RuntimeException("Ops! Cliente não encontrado!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ops! Erro na busca por Cliente !");
		}
	}

	@Override
	public void insertClient(Cliente cliente) {
		try {
			updateAdreessClient(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ops! Erro ao  Cliente !");
		}
	}

	@Override
	public void updateClient(Long id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista:

		try {
			Optional<Cliente> clienteBd = clienteRepository.findById(id);
			if (clienteBd.isPresent()) {
				updateAdreessClient(cliente);
			}
			throw new RuntimeException("Ops! Sem Cliente para atulisar !");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ops! Erro ao atulisar Cliente !");
		}
	}

	@Override
	public void deleteClient(Long id) {
		try {
			clienteRepository.deleteById(id);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ops! Erro ao deletar Cliente !");
		}
	}

	private void updateAdreessClient(Cliente cliente) {
		// Verificar se o Endereco do Cliente já existe (pelo CEP).
		Endereco addreess =  findNewZipCode(cliente);
		cliente.setEndereco(addreess);
		// Inserir Cliente, vinculando o Endereco (novo ou existente).
		clienteRepository.save(cliente);
	}

	private Endereco findNewZipCode(Cliente cliente) {
		// Verificar se o Endereco do Cliente já existe (pelo CEP).
		String zipCode = cliente.getEndereco().getCep();
		Endereco addreess = enderecoRepository.findById(zipCode).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(zipCode);
			novoEndereco = enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		return addreess;
	}
}
