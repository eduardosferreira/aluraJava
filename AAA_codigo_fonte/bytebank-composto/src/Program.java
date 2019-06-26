
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Random random = new Random();
		
		Cliente clientePaulo = new Cliente("Paulo","0000000000-1","programador java");
		Conta   contaPaulo = new Conta(1, (long) random.nextInt(10), clientePaulo);
		contaPaulo.depositar(100d);		
		System.out.println(contaPaulo);
		
		Conta contaPedro = new Conta(1,  (long) random.nextInt(100), "Pedro", "0001118889-1", "analista");
		System.out.println(contaPedro);

		Conta contaJose = new Conta(1,  (long) random.nextInt(100), new Cliente("Jose","0000000000-1","programador java"));
		System.out.println(contaJose);
		contaJose.depositar(100d);
		System.out.println(contaJose);
		if (!contaJose.sacar(1100d)) {
			System.out.println("Não foi possivel de sacar ! " + contaJose);
		}
		
		
	}
	
}
