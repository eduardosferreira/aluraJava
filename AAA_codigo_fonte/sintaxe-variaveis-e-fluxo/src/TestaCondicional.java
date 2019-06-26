
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18, mas " + "pode entrar, pois está acompanhado");
			} else
				System.out.println("infelizmente você não pode entrar");

		}

		double salario = 3300.0;

		if (salario < 2600.0)
			System.out.println("A sua aliquota é de 15%");
		System.out.println("Você pode deduzir até R$ 350");

		if (salario < 3750.0)
			System.out.println("A sua aliquota é de 22,5%");
		System.out.println("Você pode deduzir até R$ 636");

	}
}
