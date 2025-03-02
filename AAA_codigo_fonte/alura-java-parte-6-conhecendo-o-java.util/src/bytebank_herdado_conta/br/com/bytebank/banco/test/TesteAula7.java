package bytebank_herdado_conta.br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Cliente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public final class TesteAula7 {

	private static void Ex1() {
	
		System.out.println(" ------------- Ex1  -------------------- ");

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        lista.sort(new NumeroDaContaComparatorCrecente());
		for (Conta contaLst : lista) {
			System.out.println(contaLst);
		}
        // ou
        NumeroDaContaComparatorDeCrecente ordernar = new NumeroDaContaComparatorDeCrecente();
        lista.sort(ordernar);
		System.err.println(" ------------------- ");
        for (Conta contaLst : lista) {
			System.err.println(contaLst);
		}
        
	}

	private static void Ex2() {
		
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

		System.err.println(" ------- ordernacao normal ----------- ");
        lista.sort(new NumeroDaContaComparatorCrecente());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
 		System.err.println(" --------decrecente----------- ");
        lista.sort(new NumeroDaContaComparatorDeCrecente());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
		System.err.println(" --------crecente----------- ");
        lista.sort(new NumeroDaContaComparatorCrecente());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
		System.err.println(" --------por nome titular compareTo----------- ");
        lista.sort(new TitularDaContaComparator());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
		System.err.println(" -------- NORMAL ----------- ");
        lista.sort(new NumeroDaContaComparator());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
		System.err.println(" --------Compare * melhor----------- ");
        lista.sort(new NumeroDaContaComparatorCompare());
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
        
        Collections.sort(lista, new TitularDaContaComparator()); 
		System.err.println(" -------- Utilizando Collections, repassando comparador ----------- ");
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}

        Collections.sort(lista); 
		System.err.println(" -------- Utilizando Collections, de acordo com a ordem natural ----------- ");
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
        
        lista.sort(null); 
		System.err.println(" -------- Utilizando sort, de acordo com a ordem natural ----------- ");
        for (Conta contaLst : lista) {
			System.out.println(contaLst + " " + contaLst.getTitular().getNome()+ " " + contaLst.getSaldo());
		}
        
	}
	
	private static void Ex() {
		System.out.println(" ------------- Ex  -------------------- ");

	}

	public TesteAula7() {
		Ex2();
	
	}

	public TesteAula7(String[] args) {
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
		new TesteAula7();
		new TesteAula7(args);

	}

}

class NumeroDaContaComparatorCompare implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero() , c2.getNumero());
	}
	
}

class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return  c1.getNumero() - c2.getNumero();
	}
	
}

class NumeroDaContaComparatorCrecente implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumero() < c2.getNumero()) 
			return - 1;
		
		if (c1.getNumero() > c2.getNumero()) 
			return  1;
			
		return 0;
	}
	
}

class NumeroDaContaComparatorDeCrecente implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumero() > c2.getNumero()) 
			return - 1;
		
		if (c1.getNumero() < c2.getNumero()) 
			return  1;
			
		return 0;
	}
	
}


class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
	}

}