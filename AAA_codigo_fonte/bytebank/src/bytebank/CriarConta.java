package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		boolean sacar; 
		Conta primeiraConta = new Conta();
		primeiraConta.depositar(200d);
		System.out.println("1c: " + primeiraConta.getSaldo());
		primeiraConta.depositar(100d);
		System.out.println("1c: " + primeiraConta.getSaldo());

		Conta segundaConta = new Conta();
		segundaConta.depositar(100d);
		System.out.println("2c: " + segundaConta.getSaldo());

		System.out.println("primeira conta [ Agencia: " + primeiraConta.agencia + " - CC: " + primeiraConta.numero
				+ " - Titular: " + primeiraConta.titular + " ] tem de saldo : " + primeiraConta.getSaldo());
		segundaConta.agencia = 31;
		System.out.println("segunda conta [ Agencia: " + segundaConta.agencia + " - CC: " + segundaConta.numero
				+ " - Titular: " + segundaConta.titular + " ] tem de saldo : " + segundaConta.getSaldo());

		Pessoa pessoa = new Pessoa("Jo�o");
		System.out.println(pessoa);

		Pessoa pessoa2 = new Pessoa("Maria");
		System.out.println(pessoa2);

		Conta terceiraConta = segundaConta;
		segundaConta.depositar(100d);
		segundaConta.agencia = 11;
		System.out.println("segunda conta [ Agencia: " + segundaConta.agencia + " - CC: " + segundaConta.numero
				+ " - Titular: " + segundaConta.titular + " ] tem de saldo : " + segundaConta.getSaldo());

		System.out.println("terceira conta [ Agencia: " + terceiraConta.agencia + " - CC: " + terceiraConta.numero
				+ " - Titular: " + terceiraConta.titular + " ] tem de saldo : " + terceiraConta.getSaldo());

		terceiraConta.depositar(100d);
		System.out.println("segunda conta [ Agencia: " + segundaConta.agencia + " - CC: " + segundaConta.numero
				+ " - Titular: " + segundaConta.titular + " ] tem de saldo : " + segundaConta.getSaldo());

		System.out.println("terceira conta [ Agencia: " + terceiraConta.agencia + " - CC: " + terceiraConta.numero
				+ " - Titular: " + terceiraConta.titular + " ] tem de saldo : " + terceiraConta.getSaldo());

		if (terceiraConta == segundaConta) {
			System.out.println("3 = 2 conta ! ");
		} else {
			System.out.println("3 !=2 conta ! ");
		}

		if (terceiraConta.equals(segundaConta)) {
			System.out.println("3 = 2 conta ! ");
		} else {
			System.out.println("3 !=2 conta ! ");
		}
		if (terceiraConta.sacar(1000)) {
			System.out.println("N�o tem valor para sacar!");
		}
		terceiraConta.sacar(1000);
		System.out.println("Saldo : " + terceiraConta.getSaldo());
		
		sacar = terceiraConta.sacar(100);
		if (sacar) {
			System.out.println("Tem valor para sacar! Saldo : " + terceiraConta.getSaldo());
		}

		System.out.println("primeira conta [ Agencia: " + primeiraConta.agencia + " - CC: " + primeiraConta.numero
				+ " - Titular: " + primeiraConta.titular + " ] tem de saldo : " + primeiraConta.getSaldo());
		System.out.println("segunda conta [ Agencia: " + segundaConta.agencia + " - CC: " + segundaConta.numero
				+ " - Titular: " + segundaConta.titular + " ] tem de saldo : " + segundaConta.getSaldo());
		System.out.println("terceira conta [ Agencia: " + terceiraConta.agencia + " - CC: " + terceiraConta.numero
				+ " - Titular: " + terceiraConta.titular + " ] tem de saldo : " + terceiraConta.getSaldo());
		
		if (primeiraConta.transferir(100, segundaConta)) {
			System.out.println("Transferido com sucesso o dinheiro da primeira conta para segunda!");
		} else {
			System.out.println("N�o foi transferido o dinheiro da primeira conta para segunda!");
		}
		
		System.out.println("primeira conta [ Agencia: " + primeiraConta.agencia + " - CC: " + primeiraConta.numero
				+ " - Titular: " + primeiraConta.titular + " ] tem de saldo : " + primeiraConta.getSaldo());
		System.out.println("segunda conta [ Agencia: " + segundaConta.agencia + " - CC: " + segundaConta.numero
				+ " - Titular: " + segundaConta.titular + " ] tem de saldo : " + segundaConta.getSaldo());

		System.out.println("terceira conta [ Agencia: " + terceiraConta.agencia + " - CC: " + terceiraConta.numero
				+ " - Titular: " + terceiraConta.titular + " ] tem de saldo : " + terceiraConta.getSaldo());
		
	}

}
