package pessoa;
import java.math.BigDecimal;

public abstract class Funcionario extends Pessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Long bonificacaoPorcentagemSalario = 10L;

	private BigDecimal salario = new BigDecimal(0);
	
	/**
	 * @return the bonificacaoporcentagemsalario
	 */
	public static Long getBonificacaoporcentagemsalario() {
		return bonificacaoPorcentagemSalario;
	}

	
	/**
	 * @return the salario
	 */
	public BigDecimal getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	/**
	 * @return the Bonus
	 */
	public abstract BigDecimal getBonificacao();
	
	public BigDecimal getBonus() {
		BigDecimal bonus = this.getSalario().add(this.getBonificacao());
		return bonus;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String nome) {
		super(nome);
	}

	public Funcionario(String nome, String cpf) {
		super(nome,cpf);
	}

	public Funcionario(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf);
		this.setSalario(salario);
	}
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " (tipo funcionario)  " + super.toString() 
				+ " , salario = " + this.getSalario()
				+ " , ( bonificacao=" + this.getBonificacao() + "  - > total : " + this.getBonus() + " ) " ;
	}

}
