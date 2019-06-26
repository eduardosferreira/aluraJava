package bytebank_herdado_conta.br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bytebank_herdado_conta.br.com.bytebank.banco.modelo.Aula;

public class Teste {

	private static void Ex1() {
		Aula aulaIntro = new Aula("Introdu��o �s Cole��es", 20);
		Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
		Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

		List<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aulaIntro);
		aulas.add(aulaModelando);
		aulas.add(aulaSets);

		for (Aula aula : aulas) {
			System.out.println(aula);
		}
	}

	private static void Ex4() {
		System.out.println("");
	}

	public Teste() {
		Ex1();

	}

	public Teste(String[] args) {
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
		new Teste();
		new Teste(args);

	}

}
