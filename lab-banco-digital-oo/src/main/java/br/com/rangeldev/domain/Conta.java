package br.com.rangeldev.domain;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	// private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroConta;
	protected double saldo;
	protected Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public Conta(Cliente cliente, int numeroConta) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(double valor) {
		boolean result = validSaldo(saldo, valor);
		if (result) {
			saldo -= valor;
			return true;
		}
		System.out.println("Saldo atual :" + saldo + "\n insuficiente para saque ou tranferencia : " + valor + "\n");
		return false;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public boolean transferir(double valor, IConta contaDestino) {
		boolean result = sacar(valor);
		if (result) {
			contaDestino.depositar(valor);
			return true;
		}
		return true;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	boolean validSaldo(double saldo, double saque) {
		if (saldo >= saque)
			return true;
		return false;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numeroConta;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia != other.agencia)
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		return true;
	}
}
