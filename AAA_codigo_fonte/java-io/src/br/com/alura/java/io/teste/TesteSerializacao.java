package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class TesteSerializacao {

	private static final String DEPRECATION = "deprecation";

	public static void Ex1() throws Exception {
		String nome = "Nico Steppat";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();
	}

	public static void Ex2() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		@SuppressWarnings(DEPRECATION)
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
	}

	public static void ExCliente1() throws Exception {

		Cliente cliente = new Cliente();
		cliente.setNome("Eduardo da Silva Ferreira");
		cliente.setProfissao("Analista de Sistema");
		cliente.setCpf("04345873622");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		@SuppressWarnings(DEPRECATION)
		Cliente newCliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(newCliente.getNome());

	}

	public TesteSerializacao() {
		try {
			// Ex1();
			// Ex2();
			ExCliente1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TesteSerializacao();

	}

}
