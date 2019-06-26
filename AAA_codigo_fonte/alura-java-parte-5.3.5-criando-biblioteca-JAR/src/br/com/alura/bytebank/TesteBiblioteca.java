package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public TesteBiblioteca() {
		br.com.bytebank.banco.modelo.Conta conta = new br.com.bytebank.banco.modelo.ContaCorrente(1,1);
		conta.deposita(200.3);
		System.out.println(conta);
	}

	public static void main(String[] args) {
		new TesteBiblioteca();
		ContaCorrente c = new ContaCorrente(1, 1);
		c.deposita(0);
		System.out.println(c);
	}

}
