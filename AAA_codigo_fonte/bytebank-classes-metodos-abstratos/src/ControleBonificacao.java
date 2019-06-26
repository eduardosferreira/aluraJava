import java.math.BigDecimal;

public class ControleBonificacao {

	private BigDecimal soma = new BigDecimal(0);
	
	public void registra(Funcionario g){
		
		BigDecimal boni = g.getBonificacao();
		System.out.println(g + " - " + this.soma.toString());
		soma = soma.add(boni);
	
	}

	public void somar(Funcionario f){
		
		BigDecimal bonus = f.getBonificacao();
		soma = soma.add(bonus);
		System.out.println(f.getNome() + " : " + f.getBonificacao() + " - " + this.soma.toString());
	
	}
	
	
	public BigDecimal getSoma() {
		return soma;
	}
	
}
