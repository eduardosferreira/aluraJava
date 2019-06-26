package bytebank_herdado_conta.br.com.bytebank.banco.test;

import java.util.Arrays;
import java.util.List;

public class TesteAula {

	private static void Ex1() {
		System.out.println(" ------------- Ex1  -------------------- ");

	}

	private static void Ex() {
		System.out.println(" ------------- Ex  -------------------- ");

	}

	public TesteAula() {
		Ex1();
	}

	public TesteAula(String[] args) {
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
		new TesteAula();
		new TesteAula(args);

	}

}
