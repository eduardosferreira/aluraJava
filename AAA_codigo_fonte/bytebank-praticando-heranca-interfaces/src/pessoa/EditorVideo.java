package pessoa;
import java.math.BigDecimal;

public final class EditorVideo extends Funcionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    @Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.02)).add(super.getSalario());
    }
	public EditorVideo(String nome, String cpf, BigDecimal salario) {
		super(nome, cpf, salario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Editor Video : " + super.toString() ;
	}
	
}
