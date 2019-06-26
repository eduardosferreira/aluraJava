package br.com.bytebank.banco.teste;

public class TesteContas {

	public static void main(String[] args) throws br.com.bytebank.banco.modelo.SaldoInsuficienteException{
		//String : br.com.bytebank.banco.teste
		//int a = 3;
		//int b = a / 0;
		
		
		//br.com.bytebank.banco.modelo.ContaCorrente outra = null;
		//outra.deposita(200.0); 
					
		br.com.bytebank.banco.modelo.ContaCorrente cc = new br.com.bytebank.banco.modelo.ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		br.com.bytebank.banco.modelo.ContaPoupanca cp = new br.com.bytebank.banco.modelo.ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
