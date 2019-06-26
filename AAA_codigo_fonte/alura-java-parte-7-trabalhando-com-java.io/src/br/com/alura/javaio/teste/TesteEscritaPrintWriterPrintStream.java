package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public final class TesteEscritaPrintWriterPrintStream {

	public static void exemploEscritaArquivo31() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")))) {
			PrintWriter ps = new PrintWriter("lorem31.txt");
			String string = br.readLine();
			while (string != null && !string.isEmpty()) {
				ps.println(string);
				ps.println();
				string = br.readLine();
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}

	public static void exemploEscritaArquivo311() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")))) {
			PrintStream ps = new PrintStream(new File("lorem311.txt"));
			String string = br.readLine();
			while (string != null && !string.isEmpty()) {
				ps.println(string);
				ps.println();
				string = br.readLine();
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}
	
	public static void exemploEscritaArquivo310() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")))) {
			PrintStream ps = new PrintStream("lorem310.txt");
			String string = br.readLine();
			while (string != null && !string.isEmpty()) {
				ps.println(string);
				ps.println();
				string = br.readLine();
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

	}
	
	public static void Ex() {
		System.err.println(" ---------- Ex ---------------- ");
	}

	public TesteEscritaPrintWriterPrintStream() {
		super();
		// Ex();
		exemploEscritaArquivo31();
		System.out.println("Fim");

	}

	public TesteEscritaPrintWriterPrintStream(String[] args) {
		super();
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new TesteEscritaPrintWriterPrintStream();
		new TesteEscritaPrintWriterPrintStream(args);
	}

}
