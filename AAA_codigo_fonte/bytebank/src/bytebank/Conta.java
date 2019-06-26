package bytebank;

import java.io.Serializable;

public class Conta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double saldo = 0;
	int agencia;
	int numero;
	String titular;

	public void depositar(double saldo) {
		this.setSaldo(this.getSaldo() + saldo);
	}

	public boolean sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			contaDestino.depositar(valor);
			return true;
		} 
		return false;

	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		super();
		this.agencia = 43;
	}

}