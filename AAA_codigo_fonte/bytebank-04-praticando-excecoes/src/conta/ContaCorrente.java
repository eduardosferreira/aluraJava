package conta;

import exception.SaldoInsuficienteExceptionChecked;

public class ContaCorrente extends Conta implements Tributavel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int agencia, long numero, Cliente titular) {
		super(agencia, numero, titular);
	}

	public ContaCorrente(int agencia, long numero, String nome, String cpf, String profissao) {
		super(agencia, numero, nome, cpf, profissao);
	}

	public ContaCorrente(int agencia, long numero) {
		super(agencia, numero);
	}

	public ContaCorrente(long numero) {
		super(numero);
	}

	@Override
	public String toString() {
		return "Conta Corrente - > " + super.toString(); 
	}
	
	@Override
	public void sacar(double valor) {
		double taxa = 0.2;
		super.sacar(valor+taxa);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteExceptionChecked {
		double taxa = 0.2;
		super.saca(valor+taxa);
	}
}
