package matriz1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Program implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5039031196046101093L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static long autoincremento;

	public static long getAutoincremento() {
		return autoincremento;
	}

	private static void setAutoincremento(long autoincremento) {
		Program.autoincremento = autoincremento;
	}

	public Program() {
		super();
		setAutoincremento(getAutoincremento() + 1);
	}

	private long codigo;
	private String descricao;
	private Double value;
	private static List<String> lst = new ArrayList<String>();
	private static int[] iniciaValores;
	private static int[] bs;

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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValue() {
		return value;
	}

	public void addValue(Double value) {
		if (value != null) {
			if (getValue() == null) {
				this.value = 0d;
			} else {
				this.value += value;
			}

		}
	}

	public Program(String descricao) {
		this();
		setCodigo(getAutoincremento());
		setDescricao(descricao);
		addValue(0.0);
		lst.add(toString());
	}

	@Override
	public String toString() {
		return " [codigo= " + getCodigo() + ", descricao= " + getDescricao() + ", value= " + getValue() + "] ";
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
		if (!(obj instanceof Program)) {
			return false;
		}
		Program other = (Program) obj;
		return codigo == other.codigo;
	}

	public static void print() {
		for (String string : lst) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new Program("teste");
		Program p = new Program();
		Program.lst.add(p.toString());
		Program.print();
		int[] vet = { 0, 1, 2 };
		// [] - são inseridos em uma variável que referecia um array
		int[] a = new int[4];
		bs = new int[10];
		// DECLARANDO VÁRIOS ARRAYS
		int[] r = new int[44];
		int[] k = new int[23];

		iniciaValores = new int[] { 12, 32, 54, 6, 8, 89, 64, 64, 6 };

//DECLARA UM ARRAY DE INTEIROS
		int[] meuArray;

		// ALOCA MEMÓRIA PARA 10 INTEIROS
		meuArray = new int[10];

		// INICIALIZA O PRIMEIRO ELEMENTO
		meuArray[0] = 100;
		meuArray[1] = 85;
		meuArray[2] = 88;
		meuArray[3] = 93;
		meuArray[4] = 123;
		meuArray[5] = 952;
		meuArray[6] = 344;
		meuArray[7] = 233;
		meuArray[8] = 622;
		meuArray[9] = 8522;
		// meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

		System.out.println(meuArray[9]);
		System.out.println(meuArray[2]);

		int[] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321 };
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45 };

		if (arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
	}
}
