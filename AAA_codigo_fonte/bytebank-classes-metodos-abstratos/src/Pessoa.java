import java.io.Serializable;
import java.util.Objects;

public abstract class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static long contator = 0;
	private long codigo;
	private String nome;
	private String cpf;

	/**
	 * @return the contator
	 */
	public static long getContator() {
		return contator;
	}

	/**
	 * @param contator the contator to set
	 */
	private static void setContator(long contator) {
		Pessoa.contator = contator;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	private void setCodigo(long codigo) {
		this.codigo = codigo;
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

	public Pessoa() {
		super();
		Pessoa.setContator(Pessoa.getContator() + 1);
		this.setCodigo(Pessoa.getContator());
	}
	
	public Pessoa(String nome) {
		this();
		this.setNome(nome);
	}

	public Pessoa(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "   nro = " + Pessoa.getContator() + 
				" , codigo = " + this.getCodigo() + 
				" , nome = " + this.getNome() + 
				" , cpf = " + this.getCpf();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.codigo);
	}

	/*
	 * (non-Javadoc)
	 * 
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
		if (!(obj instanceof Pessoa)) {
			return false;
		}
		Pessoa other = (Pessoa) obj;
		return codigo == other.codigo;
	}

	
	
}
