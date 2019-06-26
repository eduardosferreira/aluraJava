
public class ContaCorrente extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, long numero, Cliente titular) {
		super(agencia, numero, titular);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, long numero, String nome, String cpf, String profissao) {
		super(agencia, numero, nome, cpf, profissao);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, long numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(long numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Conta Corrente - > " + super.toString(); 
	}
	
	@Override
	public boolean sacar(double valor) {
		double taxa = 0.2;
		return super.sacar(valor+taxa);
	}
}
