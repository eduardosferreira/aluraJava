
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("teste");
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 1;
		
		if ((idade >= 18 || quantidadePessoas >= 2) && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
		
		
		
	}
}
