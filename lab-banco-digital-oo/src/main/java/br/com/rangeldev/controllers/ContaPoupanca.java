package br.com.rangeldev.controllers;

import br.com.rangeldev.domain.Cliente;
import br.com.rangeldev.domain.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente,int numeroConta) {
		super(cliente,numeroConta);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" Extrato Conta Poupan�a ");
		super.imprimirInfosComuns();
	}


}
