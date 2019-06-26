package bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias = new Object[10];
	private int index; 
	
	public GuardadorDeReferencias() {
		super();
		this.referencias = new Conta[10];
	}
	
	public GuardadorDeReferencias(int tamanho) {
		super();
		this.referencias = new Conta[tamanho];
	}
	
	public void adiciona(Conta cc) {
		this.referencias[index] = cc; 
		this.index++;
	}

	public int getQuantidadeDeElementos() {
		return this.index;
	}

	public Object getReferencia(int index) {
		return this.referencias[index];
	}

}
