package br.com.alura.javaio.teste;

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public final class TesteProperties {

	public static void Ex1() {
		Properties props = new Properties();        
		try {
			props.load(new FileReader("conf.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}
	
	public TesteProperties() {
		super();
		Locale.setDefault(new Locale("pt","BR"));
		Ex1();
	}
	
	public static void main(String[] args) {
		new TesteProperties();
	}

}
