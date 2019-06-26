package pessoa;
import java.math.BigDecimal;

public final class Administrador extends Funcionario implements Autenticavel {

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


	

}
