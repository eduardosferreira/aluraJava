package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public final class TesteString {

	public TesteString() {
		String nome = "Alura";
		String nome1 = new String("Alura");
		System.out.println(nome.replace('A', 'a') + " " + nome1.toLowerCase());
	}

	public static void main(String[] args) {
		new TesteString();
		String nome = "Mario"; // object literal
		String outro = new String("Alura"); // má prática, sempre prefira a sintaxe literal

		String novo = outro.replace("A", "a").toLowerCase(); // também teste toUpperCase();

		System.out.println(novo);

		char c = nome.charAt(3); // char i
		System.out.println(c);

		int pos = nome.indexOf("rio");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);

		CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");

		System.out.println(cs);

		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();

		System.out.println(cc.toString());
		System.out.println(cp);
	}

}
