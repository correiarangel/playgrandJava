package br.com.rangeldev.domain;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente,int numeroConta) {
		super(cliente,numeroConta);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
