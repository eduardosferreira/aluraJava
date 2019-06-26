package bytebank_herdado_conta.br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Cliente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Conta;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.ContaPoupanca;
import bytebank_herdado_conta.br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteAula6 {

	static void println() {
	}

	static void println(int a) {
	}

	static void println(boolean valor) {
	}

	static void println(Object referencia) {
	}

	private static void Ex1() {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();

		System.out.println(cc);
		System.out.println(cp);

		println(cliente);

	}

	private static void Ex2() {

		int[] idades;

		int[] idades1 = new int[5];

		int[] idades2 = new int[5]; // inicializa o array com os valores padroes

		int idade1 = 29;
		int idade2 = 39;
		int idade3 = 19;
		int idade4 = 69;
		int idade5 = 59;

		idades2[0] = 29;
		idades2[1] = 39;
		idades2[2] = 49;
		idades2[3] = 59;
		idades2[4] = 69;

		int idade10 = idades2[0];

		System.out.println(idade10);
		System.out.println(idades2.length);

		for (int i = 0; i < idades2.length; i++) {
			idades2[i] = i * i;
		}

		for (int i = 0; i < idades2.length; i++) {
			System.out.println(idades2[i]);
		}

	}

	private static void Ex3() {
		// TestArrayReferencias
		// int[] idades = new int[5];
		ContaCorrente[] contas = new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		System.out.println(cc1);
		contas[0] = cc1;
		for (int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente(i + 3 + (int) Math.random(), i + (int) Math.random());
		}
		for (int i = 0; i < contas.length; i++) {
			System.out.println("[ " + i + " ] : " + contas[i] + " - > " + contas[i].getSaldo());
		}

		cc1 = contas[4];
		System.out.println(cc1);

		Object[] contasO1 = new Object[5]; // ContaCorrente[5];
		for (int i = 0; i < contasO1.length; i++) {
			contasO1[i] = (ContaCorrente) new ContaCorrente(i + 3 + (int) Math.random(), i + (int) Math.random());
		}
		for (int i = 0; i < contasO1.length; i++) {
			System.out.println("[ " + i + " ] : " + contasO1[i]);
		}

		Object[] contasO2 = new ContaPoupanca[5];
		for (int i = 0; i < contasO2.length; i++) {
			contasO2[i] = (ContaPoupanca) new ContaPoupanca(i + 3 + (int) Math.random(), i + (int) Math.random());
		}
		for (int i = 0; i < contasO2.length; i++) {
			System.out.println("[ " + i + " ] : " + contasO2[i]);
		}

		Object[] contasO3 = new ContaCorrente[5];
		for (int i = 0; i < contasO3.length; i++) {
			contasO3[i] = (ContaCorrente) new ContaCorrente(i + 3 + (int) Math.random(), i + (int) Math.random());
		}
		for (int i = 0; i < contasO3.length; i++) {
			System.out.println("[ " + i + " ] : " + contasO3[i] + " - > " + ((Conta) contasO3[i]).getSaldo());
		}

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				// contasO3[i] = contasO1[i];
				contasO1[i] = contasO2[i];
			} else {
				contasO1[i] = contasO3[i];
				// contasO2[i] = contasO1[i];
			}
			if (contasO1[i] instanceof ContaCorrente) {
				System.out.println("[ " + i + " ] : " + ((ContaCorrente) contasO1[i]).contaCorrente());
			} else if (contasO1[i] instanceof ContaPoupanca) {
				System.out.println("[ " + i + " ] : " + ((ContaPoupanca) contasO1[i]).contaPoupanca());
			}
		}

	}

	private static Object ContaCorrente() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void Ex4() {
		System.out.println("");
	}

	private static void Ex5() {
		System.out.println("--5--");
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		int tamanho = guardador.getQuantidadeDeElementos();
		Conta ref = guardador.getReferencia(tamanho - 1);
	}

	public static void Ex001() {
		// [] - s�o inseridos em uma vari�vel que referecia um array
		int[] a = new int[4];
		// OUTRA MANEIRA DE FAZER UMA DECLARA��O DE ARRAY
		int[] b;
		b = new int[10];
		// DECLARANDO V�RIOS ARRAYS
		int[] r = new int[44], k = new int[23];

		// {} - inicializar valores em um array sua declara��o
		int[] iniciaValores = { 12, 32, 54, 6, 8, 89, 64, 64, 6 };

		// DECLARA UM ARRAY DE INTEIROS
		int[] meuArray;

		// ALOCA MEM�RIA PARA 10 INTEIROS
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
		// meuArray [10] = 564; //ESTOURA A PILHA POIS N�O EXISTE O �NDICE 10

		System.out.println(meuArray[9]);
		System.out.println(meuArray[2]);
	}

	private static void Ex6() {
		System.out.println("------------- Ex6  ---------------------");
		int[] idadees = { 0, 1, 2, 3, 4 };
		int[] idades = new int[5];
		int[] idades1 = idades;
		System.out.println(idades1[0]);

		String[] nomes = new String[5];
		String[] nomees = { "0", "1", "2", "3", "4" };

		int idade = 29;

		Integer idadeRef = Integer.valueOf(29);
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(Integer.valueOf(29)); // autoboxing : do primitivo para referencia
		Integer int1 = 1;
		int int2 = Integer.valueOf(0);
		System.out.println(int2);
		int[] arrayUm = { 12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321 };
		int[] arrayDois = { 43, 42, 4, 8, 55, 21, 2, 45 };

		if (arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		} else {
			System.out.println("Tamanho do ArrayDois - Menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = " + arrayUm.length);
		
		
	}

	private static void Ex7() {
		String s = "00000000000000000000000011111111";
		int intS = Integer.parseInt(s);
		System.out.println(intS);
		Integer intAuboxing1 = Integer.valueOf(99); // AutoBoxing
		int intUnboxing1 = intAuboxing1.intValue();
		System.out.println(intUnboxing1);
		double doubleS = intAuboxing1.doubleValue();
		Double doubleS1 = Double.valueOf(doubleS);
		
		System.out.println(Integer.BYTES);
		System.out.println(intAuboxing1.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(intAuboxing1.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(intAuboxing1.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(intAuboxing1.SIZE);

        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);		
	}
	
	public TesteAula6() {
//		Teste.Ex1();
//		Teste.Ex2();
//		Teste.Ex3();
//		Teste.Ex4();
//		Teste.Ex6();
		TesteAula6.Ex7();

	}

	public TesteAula6(String[] args) {
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
		new TesteAula6();
		// new Teste(args);

	}

}
