package br.com.rangeldev.domain;
public class Main {

	public static void main(String[] args) {
		Cliente jucapirama = new Cliente("Juca Pirama","309.300.895-04");

		
		Conta cc = new ContaCorrente(jucapirama,0001);
		Conta poupanca = new ContaPoupanca(jucapirama,0001);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
