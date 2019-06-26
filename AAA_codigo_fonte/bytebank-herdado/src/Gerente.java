import java.math.BigDecimal;

public class Gerente extends Funcionario {

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
	public void setSenha(int senha) {
		this.senha = senha;
	}
    
    public boolean autentica(int senha) {
    	if (this.getSenha() == senha) 
			return true;
    	else 
    		return false;
		
    }
    
    @Override
    public BigDecimal getBonificacao() {
		return super.getSalario().multiply(new BigDecimal(0.10)).add(super.getSalario());
    }

	public Gerente(String nome, String cpf) {
		super(nome, cpf);
	}	
    
	public Gerente(String nome, String cpf, int senha) {
		super(nome, cpf);
		this.setSenha(senha);
	}	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Gerente.getSerialversionuid() + " - Gerente " + Gerente.getContator() + " [codigo="
				+ this.getCodigo() + ", nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", salario=" + this.getSalario()
				+ ", ( bonificacao=" + this.getBonificacao() + "  - > total : " + this.getBonus() + " ) " + "] Senha : " + this.getSenha();
	}
    
    
}
