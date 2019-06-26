import java.math.BigDecimal;

public class Designer extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.15)).add(super.getSalario());
    }
	public Designer(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf, salario);
	}
	
}
