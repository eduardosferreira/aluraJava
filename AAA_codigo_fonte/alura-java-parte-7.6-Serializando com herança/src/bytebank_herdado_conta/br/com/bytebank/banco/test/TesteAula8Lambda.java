package bytebank_herdado_conta.br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Cliente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public final class TesteAula8Lambda {

	private static void Ex1() {

		System.out.println(" ------------- Ex2  -------------------- ");

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.err.println(" -------  ----------- ");
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		lista.forEach(new Consumer<Conta>() {

			@Override
			public void accept(Conta contaLst) {
				System.out.println(contaLst + " " + contaLst.getTitular().getNome() + " " + contaLst.getSaldo());

			}

		});

		System.err.println(" -------- ----------- ");
		lista.sort((Conta o1, Conta o2) -> {
			return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
		});
		lista.forEach((Conta contaLst) -> {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome() + " " + contaLst.getSaldo());
		});

		System.err.println(" -------  ----------- ");
		lista.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		lista.forEach((contaLst) -> System.out.println(contaLst + " " + contaLst.getTitular().getNome() + " " + contaLst.getSaldo()));

		
		System.err.println(" ------- ----------- ");
		lista.sort((Conta o1, Conta o2) -> {
			return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
		});
		for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome() + " " + contaLst.getSaldo());
		}

		System.err.println(" -------- Utilizando Collections ");
		Comparator<Conta> comparaConta = (c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero());
		Collections.sort(lista, comparaConta);
		for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome() + " " + contaLst.getSaldo());
		}

	}

	private static void Ex() {
		System.out.println(" ------------- Ex  -------------------- ");
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}		

	}

	public TesteAula8Lambda() {
		Ex1();
		Ex();
	}

	public TesteAula8Lambda(String[] args) {
		if (!args.equals("")) {
			for (String string : args) {
				System.out.println(string);
			}
		}
		List<String> argsArray = Arrays.asList(args);
		for (String string : argsArray) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new TesteAula8Lambda();
		new TesteAula8Lambda(args);

	}

}
