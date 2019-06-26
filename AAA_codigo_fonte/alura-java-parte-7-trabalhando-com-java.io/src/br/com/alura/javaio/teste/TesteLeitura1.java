package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class TesteLeitura1 {

	private static FileInputStream fisFile(final String nomeArquivo) throws IOException {
		FileInputStream fis = new FileInputStream(nomeArquivo);
		return fis;
	}

	private static InputStream fiFile(final String nomeArquivo) throws Exception {
		InputStream fi = new FileInputStream(nomeArquivo);
		return fi;
	}

	public static void exemploLeituraArquivo1() {
		System.err.println(" ---------- Exemplo : FileInputStream ---------------- ");

		FileInputStream fis;
		InputStreamReader isr;

		try {
			fis = fisFile("lorem.txt");
			isr = new InputStreamReader(fis);

		} catch (Exception e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedReader br = new BufferedReader(isr)) {
			String string = br.readLine();
			while (string != null) {
				System.out.println(string);
				string = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Erro na leitura dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Fim");

	}

	public static void exemploLeituraArquivo2() {
		System.err.println(" ---------- Exemplo : InputStream ---------------- ");

		InputStream is;
		Reader r;

		try {
			is = fiFile("lorem.txt");
			r = new InputStreamReader(is);

		} catch (Exception e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedReader br = new BufferedReader(r)) {
			String string = br.readLine();
			while (string != null) {
				System.out.println(string);
				string = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Erro na leitura dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Fim");

	}

	public static void Ex() {
		System.err.println(" ---------- Ex ---------------- ");
	}

	public TesteLeitura1() {
		super();
		Ex();
		exemploLeituraArquivo1();
		exemploLeituraArquivo2();
	}

	public TesteLeitura1(String[] args) {
		super();
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new TesteLeitura1();
		new TesteLeitura1(args);
	}

}
