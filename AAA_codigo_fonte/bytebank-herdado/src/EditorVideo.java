import java.math.BigDecimal;

public class EditorVideo extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.05)).add(super.getSalario());
    }
	public EditorVideo(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf, salario);
	}
	
}
