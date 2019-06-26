import java.math.BigDecimal;

public class Program {

	private void Ex1() {
		Funcionario f = new Funcionario("Eduardo","04345873622",new BigDecimal(2001.12));
		f.setTipo(2);
		System.out.println(f);

		Gerente g = new Gerente("Francisco", "00000000000");
		g.setTipo(1);		
		g.setSenha(123456);
		g.setSalario(new BigDecimal(200012.12));
		System.out.println(g + " autentica senha : " + g.autentica(12345));
				
		EditorVideo e = new EditorVideo("Eduardo","04345873622",new BigDecimal(2001.12));
		e.setTipo(2);
		System.out.println(e);
		

		Funcionario e1 = new EditorVideo("Eduardo E","22222222222",new BigDecimal(2001.12));
		System.out.println(e1);
		
		Funcionario g1 = new Gerente("Eduardo G","11111111111");
		g1.setSalario(new BigDecimal(200012.12));
		System.out.println(g1);

		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g);
		System.out.println(controle.getSoma());
		controle.registra(f);
		System.out.println(controle.getSoma());
		controle.registra(e);
		System.out.println(controle.getSoma());
		controle.registra(g1);
		System.out.println(controle.getSoma());
		controle.somar(g1);
		controle.somar(e1);
			
	}
	
	
	public Program() {
		super();
		this.Ex1();
	}


	public static void main(String[] args) {
		 new Program();
		 
	}

}
