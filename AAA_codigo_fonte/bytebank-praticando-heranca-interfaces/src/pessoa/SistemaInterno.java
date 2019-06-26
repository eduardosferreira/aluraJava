package pessoa;
import java.io.Serializable;

public class SistemaInterno implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int senha;
	/**
	 * @return the senha
	 */
	public int getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	protected void setSenha(int senha) {
		this.senha = senha;
	}

	public void autentica(Autenticavel g) {
		boolean autenticar = g.autentica(this.getSenha());
		
		if (autenticar) {
			System.out.println("OK!");
		}else {
			System.out.println("NOK!");
		}
		
	}
	
}
