package br.com.rangeldev.controllers;

import br.com.rangeldev.domain.Cliente;
import br.com.rangeldev.domain.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente,int numeroConta) {
		super(cliente,numeroConta);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
