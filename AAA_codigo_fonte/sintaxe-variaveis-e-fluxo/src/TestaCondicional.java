
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� n�o tem 18, mas " + "pode entrar, pois est� acompanhado");
			} else
				System.out.println("infelizmente voc� n�o pode entrar");

		}

		double salario = 3300.0;

		if (salario < 2600.0)
			System.out.println("A sua aliquota � de 15%");
		System.out.println("Voc� pode deduzir at� R$ 350");

		if (salario < 3750.0)
			System.out.println("A sua aliquota � de 22,5%");
		System.out.println("Voc� pode deduzir at� R$ 636");

	}
}
