package conta;

public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto() * 10.0;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
