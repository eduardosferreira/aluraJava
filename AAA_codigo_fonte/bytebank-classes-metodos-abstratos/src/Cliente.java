public final class Cliente extends Pessoa implements Autenticavel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int senha;
	
	@Override
	public final int getSenha() {
		return this.senha;
	}

	@Override
	public final void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public final boolean autentica(int senha) {
		if (this.getSenha() == senha) 
			return true;
		else
			return false;
		
	}

	public Cliente() {
		super();
	}

	public Cliente(String nome) {
		super(nome);
	}

	public Cliente(String nome, String cpf) {
		super(nome,cpf);
	}

	public Cliente(String nome, String cpf, int senha) {
		super(nome,cpf);
		this.setSenha(senha);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " (tipo cliente) : " + super.toString();
	}
	
	
}
