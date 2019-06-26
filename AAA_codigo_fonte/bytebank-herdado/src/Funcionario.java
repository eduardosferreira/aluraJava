import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Long bonificacaoPorcentagemSalario = 10L;

	private static long contator = 0;
	private long codigo;
	private String nome;
	private String cpf;
	private BigDecimal salario;
	private int tipo = 0; // 0 - normal / 1 - gerente / 2 - diretor

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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
		Funcionario.contator = contator;
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

	/**
	 * @return the salario
	 */
	public BigDecimal getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the Bonus
	 */
	public BigDecimal getBonificacao() {
		BigDecimal bonificacao = this.getSalario();
		switch (this.getTipo()) {
		case 0:
			bonificacao = bonificacao.multiply(new BigDecimal(Funcionario.bonificacaoPorcentagemSalario))
					.divide(new BigDecimal(100));
			break;
		case 2:
			bonificacao = bonificacao.add(new BigDecimal(2000.1));
			break;
		default:
			break;
		}
		return bonificacao;
	}

	public BigDecimal getBonus() {
		BigDecimal bonus = this.getSalario().add(this.getBonificacao());
		return bonus;
	}

	public Funcionario() {
		super();
		Funcionario.setContator(Funcionario.getContator() + 1);
		this.setCodigo(Funcionario.getContator());
	}

	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}

	public Funcionario(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}

	public Funcionario(String nome, String cpf, BigDecimal salario) {
		this(nome, cpf);
		this.setSalario(salario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		if (!(obj instanceof Funcionario)) {
			return false;
		}
		Funcionario other = (Funcionario) obj;
		return codigo == other.codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Funcionario.getSerialversionuid() + " - Funcionario " + Funcionario.getContator() + " [codigo="
				+ this.getCodigo() + ", nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", salario=" + this.getSalario()
				+ ", ( bonificacao=" + this.getBonificacao() + "  - > total : " + this.getBonus() + " ) " + "]";
	}

}
