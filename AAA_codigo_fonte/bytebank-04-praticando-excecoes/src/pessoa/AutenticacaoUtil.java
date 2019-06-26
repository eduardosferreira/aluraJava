package pessoa;

public class AutenticacaoUtil {

	private int senha;
	
	public final int getSenha() {
		return this.senha;
	}

	public final void setSenha(int senha) {
		this.senha = senha;
	}

	public final boolean autentica(int senha) {
		if (this.getSenha() == senha) 
			return true;
		else
			return false;
		
	}
	
	
}
