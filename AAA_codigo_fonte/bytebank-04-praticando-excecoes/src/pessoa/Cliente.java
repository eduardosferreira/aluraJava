package pessoa;
public final class Cliente extends Pessoa implements Autenticavel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AutenticacaoUtil util = new AutenticacaoUtil();
	/**
	 * @return the util
	 */
	public AutenticacaoUtil getUtil() {
		return util;
	}

	/**
	 * @param util the util to set
	 */
	public void setUtil(AutenticacaoUtil util) {
		this.util = util;
	}

	
	@Override
	public final int getSenha() {
		return this.getUtil().getSenha();
	}

	@Override
	public final void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public final boolean autentica(int senha) {
		return this.util.autentica(senha);
		
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
