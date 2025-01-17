package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

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

		ContaCorrente cc = new ContaCorrente(10, 20);
		cc.setTitular(cliente);
		cc.deposita(120d);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		@SuppressWarnings(DEPRECATION)
		ContaCorrente newCC = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(newCC.getNumero());

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
