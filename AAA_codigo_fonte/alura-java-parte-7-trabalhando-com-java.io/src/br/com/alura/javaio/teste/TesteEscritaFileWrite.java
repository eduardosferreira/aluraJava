package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class TesteEscritaFileWrite {

	private static InputStream isFile(final String nomeArquivo) throws Exception {
		InputStream is = new FileInputStream(nomeArquivo);
		return is;
	}

	public static void exemploEscritaArquivo21() {

		// System.err.println(" ---------- Exemplo : InputStream -> OutputStream
		// ---------------- ");

		InputStream is;
		Reader r;

		FileWriter fw;

		try {
			is = isFile("lorem.txt");
			r = new InputStreamReader(is);
			fw = new FileWriter("lorem211.txt");
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedReader br = new BufferedReader(r)) {
			String string = br.readLine();
			while (string != null && !string.isEmpty()) {
				fw.write(string + " - ");
				fw.write(System.lineSeparator());
				string = br.readLine();
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Fim");
	}

	public static void exemploEscritaArquivo22() {

		// System.err.println(" ---------- Exemplo : InputStream -> OutputStream
		// ---------------- ");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("lorem213.txt"))) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")))) {
				String string = br.readLine();
				while (string != null && !string.isEmpty()) {
					bw.write(string);
					bw.newLine();
					string = br.readLine();
				}				
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}
		
		System.out.println("Fim");
	}

	public static void exemploEscritaArquivo23() {

		// System.err.println(" ---------- Exemplo : InputStream -> OutputStream
		// ---------------- ");

		InputStream is;
		Reader r;

		
		try {
			is = isFile("lorem.txt");
			r = new InputStreamReader(is);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("lorem212.txt"))) {
			try (BufferedReader br = new BufferedReader(r)) {
				String string = br.readLine();
				while (string != null && !string.isEmpty()) {
					bw.write(string);
					bw.newLine();
					string = br.readLine();
				}				
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}
		
		System.out.println("Fim");
	}
	
	public static void Ex() {
		System.err.println(" ---------- Ex ---------------- ");
	}

	public TesteEscritaFileWrite() {
		super();
		// Ex();
		//exemploEscritaArquivo21();
		exemploEscritaArquivo22();
	}

	public TesteEscritaFileWrite(String[] args) {
		super();
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new TesteEscritaFileWrite();
		new TesteEscritaFileWrite(args);
	}

}
