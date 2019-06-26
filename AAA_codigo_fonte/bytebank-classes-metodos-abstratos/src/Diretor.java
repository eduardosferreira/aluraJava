import java.math.BigDecimal;

public final class Diretor extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	@Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.60)).add(super.getSalario());
    }
	public Diretor(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf, salario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Diretor : " + super.toString() ;
	}
	
}
