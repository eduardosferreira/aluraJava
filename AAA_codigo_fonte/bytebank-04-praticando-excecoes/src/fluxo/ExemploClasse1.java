package fluxo;

public final class ExemploClasse1 {

	public void depositarChecked1() throws MinhaExcessaoChecked1 {
		System.out.println("depositar 1.... ");
		throw new MinhaExcessaoChecked1("Erro !!! ");
		// System.out.println("depositar 2.... ");
	}

	public void depositarUnChecked1() {
		System.out.println("depositar 1.... ");
		throw new MinhaExcessaoUnChecked1("Erro !!! ");
		//System.out.println("depositar 2.... ");
	}
	
}
