
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("teste escopo");
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}

		boolean foiPromovido = true;

		if (foiPromovido) {
			double salario = 4200.0;
			System.out.println(salario);

		} else {
			double salario = 3800.0;
			System.out.println(salario);

		}

		// NÃO Fuciona System.out.println(salario);

	}
}
