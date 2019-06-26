package bytebank_herdado_conta.br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListJavaUtil {

	private static void Ex1() {
		ArrayList lst = new ArrayList();
		lst.add(new ContaCorrente(0, 1));
		lst.add(new ContaPoupanca(13, 4));
		lst.add(1, new ContaPoupanca(11, 41));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst);
		}

		System.out.println(lst.size());
		System.out.println(lst.get(0));
		Conta ref = (Conta) lst.get(1);
		System.out.println(ref);
		System.out.println(((Conta) lst.get(0)).getNumero());
		ContaCorrente cc1 = null;
		if (lst.get(0) instanceof ContaCorrente) {
			cc1 = (ContaCorrente) lst.get(0);
		}
		System.out.println(cc1);
		lst.remove(1);
		for (Object iRef : lst) {
			System.out.println(iRef);
		}
	}

	private static void Ex2() {
		ArrayList<Conta> lst = new ArrayList<>();
		lst.add(new ContaCorrente(0, 1));
		lst.add(new ContaPoupanca(13, 4));
		lst.add(1, new ContaPoupanca(11, 41));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst);
		}

		System.out.println(lst.size());
		System.out.println(lst.get(0));
		Conta ref = lst.get(1);
		System.out.println(ref);
		System.out.println(lst.get(0).getNumero());
		ContaCorrente cc1 = null;
		if (lst.get(0) instanceof ContaCorrente) {
			cc1 = (ContaCorrente) lst.get(0);
		}
		System.out.println(cc1);
		lst.remove(1);
		for (Conta iRef : lst) {
			System.out.println(iRef);
		}
	}

	private static void Ex3() {
		ArrayList array = new ArrayList(26);
		System.out.println(array.size());
		for (int i = 0; i < 30; i++) {
			String s = new String("" + (i + 1) + "");
			array.add(i, new String("[" + i + "] " + s));
		}
		System.out.println(array.size());
		for (Object string : array) {
			System.out.println(string);
		}

	}

	public static void Ex4() {
		Scanner ler = new Scanner(System.in);

		// [ A ] declarando e instanciando uma agenda de contatos
		ArrayList<String> agenda = new ArrayList();

		// [ B ] usando o m�todo add() para gravar 4 contatos na agenda
		agenda.add("Juca Bala;11 1111-1111");
		agenda.add("Marcos Paqueta;22 2222-2222");
		agenda.add("Maria Antonieta;33 3333-3333");
		agenda.add("Ant�nio Conselheiro;44 4444-4444");

		int i;

		// [ C ] mostrando os "n" contatos da agenda (usando o �ndice)
		// n�mero de elementos da agenda: m�todo size()
		System.out.printf("Percorrendo o ArrayList (usando o �ndice)\n");
		int n = agenda.size();
		for (i = 0; i < n; i++) {
			System.out.printf("Posi��o %d- %s\n", i, agenda.get(i));
		}

		System.out.printf("\nInforme a posi��o a ser exclu�da:\n");
		i = ler.nextInt();

		try {
			// [ D ] remove o i-�simo contato da agenda
			agenda.remove(i);
		} catch (IndexOutOfBoundsException e) {
			// exce��o lan�ada para indicar que um �ndice (i)
			// est� fora do intervalo v�lido (de 0 at� agenda.size()-1)
			System.out.printf("\nErro: posi��o inv�lida (%s).", e.getMessage());
		}

		// [ E ] mostrando os "n" contatos da agenda (usando for-each)
		System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
		i = 0;
		for (String contato : agenda) {
			System.out.printf("Posi��o %d- %s\n", i, contato);
			i++;
		}

		// [ F ] mostrando os "n" contatos da agenda (com iterator)
		System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
		i = 0;
		Iterator<String> iterator = agenda.iterator();
		while (iterator.hasNext()) {
			System.out.printf("Posi��o %d- %s\n", i, iterator.next());
			i++;
		}
	}

	private static void Ex5() {
		ArrayList<Conta> lst = new ArrayList<>();
		lst.add(new ContaCorrente(0, 1));
		lst.add(new ContaPoupanca(13, 4));
		lst.add(1, new ContaPoupanca(11, 41));
		ContaCorrente cc2 = new ContaCorrente(13, 121);
		lst.add(cc2);
		ContaCorrente cc3 = new ContaCorrente(13, 121);
		lst.add(cc3);
		ContaPoupanca cc4 = new ContaPoupanca(13, 121);
		lst.add(cc4);
		
		System.out.println(cc2 + "  Existe ? " + (lst.contains(cc2) ? "Sim":"N�o") );
		System.out.println("Existe ContaPoupanca(11, 41) ? " + (lst.contains(new ContaPoupanca(11, 41)) ? "Sim":"N�o") );
		for (int i = 0; i < lst.size(); i++) {
			System.out.println((lst.get(i).ehIgual(cc2) ? " Achou!!! ":" ") + lst.get(i));
		}
		System.out.println(lst.size());
		System.out.println(lst.get(lst.size()-1));
	}
	
	private static void Ex6() {
		LinkedList<Conta> linkLst = new LinkedList<>();
		ArrayList nameLst = new ArrayList();
		
		ArrayList<Conta> lst = new ArrayList<>();
		lst.add(new ContaCorrente(0, 1));
		lst.add(new ContaPoupanca(13, 4));
		lst.add(1, new ContaPoupanca(11, 41));
		ContaCorrente cc2 = new ContaCorrente(13, 121);
		lst.add(cc2);
		ContaCorrente cc3 = new ContaCorrente(13, 121);
		lst.add(cc3);
		ContaPoupanca cc4 = new ContaPoupanca(13, 121);
		lst.add(cc4);
		
		System.out.println(cc2 + "  Existe ? " + (lst.contains(cc2) ? "Sim":"N�o") );
		System.out.println("Existe ContaPoupanca(11, 41) ? " + (lst.contains(new ContaPoupanca(11, 41)) ? "Sim":"N�o") );
		for (int i = 0; i < lst.size(); i++) {
			System.out.println((lst.get(i).ehIgual(cc2) ? " Achou!!! ":" ") + lst.get(i));
		}
		System.out.println(lst.size());
		System.out.println(lst.get(lst.size()-1));
	}	
	
	public TesteArrayListJavaUtil() {
		super();
		//Ex2();
		//Ex1();
		//Ex3();
		//Ex5();
		Ex6();
	}

	public static void main(String[] args) {
		new TesteArrayListJavaUtil();
		List argLst = Arrays.asList(args);
		for (Object object : argLst) {
			System.out.println(object);
		}
	}

}
