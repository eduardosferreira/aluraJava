package conta;
import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static long nr_countador=0L;
	private long id;
	private String nome;
	private String cpf;
	private String profissao;
	
	/**
	 * @return the nr_countador
	 */
	public long getNr_countador() {
		return Cliente.nr_countador;
	}

	/**
	 * @param nr_countador the nr_countador to set
	 */
	private void setNr_countador() {
		Cliente.nr_countador++;
	}
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	private void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the profissao
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * @param profissao the profissao to set
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Cliente() {
		super();
		this.setNr_countador();
		this.setId(this.getNr_countador());
	}

	public Cliente(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Cliente(String nome, String cpf) {
		this();
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public Cliente(String nome, String cpf, String profissao) {
		this();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setProfissao(profissao);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		return id == other.id;
	}

	
	
}
