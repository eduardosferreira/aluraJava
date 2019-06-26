import java.math.BigDecimal;

public final class Administrador extends Funcionario implements Autenticavel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int senha;

	public Administrador() {
		super.setSalario(new BigDecimal(0d));
	}	
    
	public Administrador(String nome, String cpf) {
		this();
		super.setNome(nome);
		super.setCpf(cpf);
	}	
    
	public Administrador(String nome, String cpf, int senha) {
		this(nome, cpf);
		this.setSenha(senha);
	}	

    @Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.31)).add(super.getSalario());
    }
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Administrador : " + super.toString()  + " - senha : " + this.getSenha();
	}

	@Override
	public int getSenha() {
		return this.senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public final boolean autentica(int senha) {
		if (this.getSenha() == senha) 
			return true;
		else
			return false;
		
	}

	

}
