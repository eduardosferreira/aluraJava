package fluxo;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Erro ! " + e.getMessage());
		} 
		
	}

}
