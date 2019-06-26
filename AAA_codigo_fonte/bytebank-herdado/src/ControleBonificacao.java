import java.math.BigDecimal;

public class ControleBonificacao {

	private BigDecimal soma = new BigDecimal(0);
	
	public void registra(Gerente g){
		
		BigDecimal boni = g.getBonificacao();
		soma = soma.add(boni);
	
	}

	public void registra(Funcionario g){
		
		BigDecimal boni = g.getBonificacao();
		soma = soma.add(boni);
	
	}

	public void registra(EditorVideo g){
		
		BigDecimal boni = g.getBonificacao();
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
