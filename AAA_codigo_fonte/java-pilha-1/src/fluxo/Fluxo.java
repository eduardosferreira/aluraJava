package fluxo;

public final class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException|MinhaExcessaoUnChecked1|MinhaExcessaoChecked1 e) {
			String msg = e.getMessage();
			System.out.println("Falha ao executar metodo 1! ArithmeticException|MinhaExcessaoUnChecked1|MinhaExcessaoChecked1: " + msg);
			e.printStackTrace();
		} catch (NullPointerException | AbstractMethodError e) {
			String msg = e.getMessage();
			System.out.println("Falha ao executar metodo 1! NullPointerException|AbstractMethodError: " + msg);
			e.printStackTrace();
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println("Falha ao executar metodo 1! Exception: " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcessaoChecked1 {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		throw new MinhaExcessaoUnChecked1("Deu errado !!! ");
	}

	private static void metodo2() throws MinhaExcessaoChecked1 {
		System.out.println("Ini do metodo2");
		metodo2();
		throw new MinhaExcessaoChecked1("Deu errado 2");
		// ArithmeticException a = new ArithmeticException("Deu errado !!! ");
		// throw a;
		/*
		 * for (int i = 5; i >= 0; i--) { int j = (int) Math.random() / i;
		 * System.out.println(i + " " + j); BigDecimal c = null;
		 * System.out.println(c.toString()); }
		 */
		// System.out.println("Fim do metodo2");
	}
}
