import java.util.Random;

public class Program {

	private static void ExConta1() {
		// TODO Auto-generated method stub
		Random random = new Random();

		Cliente clientePaulo = new Cliente("Paulo", "0000000000-1", "programador java");
		Conta contaPaulo = new ContaCorrente(1, (long) random.nextInt(10), clientePaulo);
		contaPaulo.depositar(100d);
		System.out.println(contaPaulo);

		Conta contaPedro = new ContaPoupanca(1, (long) random.nextInt(100), "Pedro", "0001118889-1", "analista");
		System.out.println(contaPedro);

		Conta contaJose = new ContaCorrente(1, (long) random.nextInt(100),
				new Cliente("Jose", "0000000000-1", "programador java"));
		System.out.println(contaJose);
		contaJose.depositar(100d);
		System.out.println(contaJose);
		if (!contaJose.sacar(1100d)) {
			System.out.println("Não foi possivel de sacar ! " + contaJose);
		}

	}

	
	private static void ExCC1() {
		Conta cc = new ContaCorrente(1,11111);
		cc.depositar(100);
		System.out.println(cc);
	}

	private static void ExCP1() {
		Conta cp = new ContaPoupanca(2,2222);
		cp.depositar(1);
		System.out.println(cp);
	}

	private static void ExConta2() {
		Cliente c = new Cliente("Eduardo", "04345873622", "Analista");
		
		ContaCorrente cc = new ContaCorrente(1,11111,c);
		cc.depositar(100);
		System.out.println(cc);

		ContaPoupanca cp = new ContaPoupanca(2,2222,c);
		cp.depositar(1);
		System.out.println(cp);
		
		System.out.println("Transfere da conta poupança para corrente 0.5 reais: " + cp.transferir(0.5, cc));
		System.out.println(cc);
		System.out.println(cp);

		System.out.println("Transfere da conta corrente para poupança 12 reais: " + cc.transferir(12, cp));
		System.out.println(cc);
		System.out.println(cp);
		
	}
	
	public Program() {
		super();
		//Program.ExConta1();
		//Program.ExCC1();
		//Program.ExCP1();
		Program.ExConta2();
	}

	public static void main(String[] args) {
		new Program();
	}

}
