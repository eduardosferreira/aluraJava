package fluxo;

public class Program {

	private static void Ex1() {
		ExemploClasse1 ex1 = new ExemploClasse1();
		try {
			ex1.depositarChecked1();
		} catch (MinhaExcessaoChecked1 e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void Ex2() {
		ExemploClasse1 ex2 = new ExemploClasse1();
		ex2.depositarUnChecked1();
		
	}
	
	public Program() {
		Ex1();
		Ex2();
	}
	
	public static void main(String[] args) {
		new Program();
	}
	
}
