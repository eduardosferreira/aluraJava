package conta;

import java.io.Serializable;

public class Conta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static long contador=0;
	private long codigo;
	private double saldo;
	private int agencia;
	private long numero;
	private Cliente titular;

	/**
	 * @return the contador
	 */
	public static long getContador() {
		return Conta.contador;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	private void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the agencia
	 */
	public int getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(long numero) {
		this.numero = numero;
	}

	/**
	 * @return the titular
	 */
	public Cliente getTitular() {
		return titular;
	}
	
	public String getNomeTitular() {
		return titular.getNome();
	}

	
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

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
		if (this.sacar(valor)) {
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
		Conta.contador++;
		this.setCodigo(Conta.contador);
		this.setAgencia(1);		
	}	
	public Conta(long numero) {
		this();
		this.setNumero(numero);
	}

	public Conta(int agencia, long numero) {
		this(numero);
		this.setAgencia(agencia);
	}

	public Conta(int agencia, long numero,Cliente titular) {
		this(numero);
		this.setAgencia(agencia);
		this.setTitular(titular);
	}
	
	public Conta(int agencia, long numero, String nome, String cpf, String profissao) {
		this(numero);
		this.setAgencia(agencia);
		this.titular = new Cliente();
		this.titular.setNome(nome);
		this.titular.setCpf(cpf);
		this.titular.setProfissao(profissao);
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  Conta.getContador() + " - Conta " + this.getCodigo() +  " [saldo=" + this.getSaldo() + ", agencia=" + this.getAgencia() + ", numero=" + this.getNumero() + ", titular=" + this.getTitular() + "]";
	}

	
	
}