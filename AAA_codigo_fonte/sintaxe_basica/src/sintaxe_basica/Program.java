package sintaxe_basica;

public class Program {
	
	public static String Imprimir(){
		return "[IMPRIMIR]: ";
	}
	
	public static void Imprimir(String strDado) {
		System.out.println(Program.Imprimir() + " " + strDado);
	}
	
	public Program() {
		Program.Imprimir("oi");
	}
	public static void main(String[] args) {
		new Program();
	}

}
