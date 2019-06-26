package pessoa;
import java.math.BigDecimal;

public final class Program {

	private void Ex1() {
		Funcionario f = new Diretor("Eduardo","04345873622",new BigDecimal(2001.12));
		System.out.println(f);

		Gerente g = new Gerente("Francisco", "00000000000");
		g.setSenha(123456);
		g.setSalario(new BigDecimal(200012.12));
		System.out.println(g + " autentica senha : " + g.autentica(12345));
				
		EditorVideo e = new EditorVideo("Eduardo","04345873622",new BigDecimal(2001.12));
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
	
	private static final void ExSistemaInterno1() {
		Gerente g = new Gerente("Eduardo","04345873622",123456);
		System.out.println(g);
		SistemaInterno s = new SistemaInterno();
		s.autentica(g);
	}

	private static final void ExSistemaInterno2() {
		SistemaInterno s = new SistemaInterno();

		Gerente g = new Gerente("Eduardo Gerente","04345873622",123456);
		System.out.println(g);
		s.autentica(g);

		Administrador a = new Administrador("Eduardo Administrador","04345873622",123456);
		System.out.println(a);
		s.autentica(a);

		Autenticavel g1 = new Gerente("Eduardo Gerente 1 ","04345873622",123456);
		System.out.println(g1);
		s.autentica(g1);

		Autenticavel a1 = new Administrador("Eduardo Administrador 1","04345873622",123456);
		System.out.println(a1);
		s.autentica(a1);

		Autenticavel c1 = new Cliente("Eduardo Cliente 1","04345873622",123456);
		System.out.println(c1);
		s.autentica(c1);
		
		
	}	
	public Program() {
		super();
		//this.Ex1();
		//Program.ExSistemaInterno1();
		Program.ExSistemaInterno2();
	}


	public static void main(String[] args) {
		 new Program();
		 
	}

}
