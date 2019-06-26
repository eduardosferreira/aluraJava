package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public final class TesteEscrita1 {

	private static FileOutputStream fosFile(final String nomeArquivo) throws IOException {
		FileOutputStream fos = new FileOutputStream(nomeArquivo);
		return fos;
	}

	private static OutputStream osFile(final String nomeArquivo) throws Exception {
		OutputStream os = new FileOutputStream(nomeArquivo);
		return os;
	}
	
	private static InputStream isFile(final String nomeArquivo) throws Exception {
		InputStream is = new FileInputStream(nomeArquivo);
		return is;
	}

	
	
	
	public static void exemploEscritaArquivo1() {
		System.err.println(" ---------- Exemplo : FileOutputStream ---------------- ");

		FileOutputStream fos;
		OutputStreamWriter osw;

		try {
			fos = fosFile("lorem1.txt");
			osw = new OutputStreamWriter(fos);
		} catch (Exception e) {
			System.out.println("Erro na escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(osw)) {
			String string = "Linha";
			for (int i = 0; i < 11; i++) {
				bw.write(string);
				bw.newLine();
			}
		} catch (Exception e) {
			System.out.println("Erro na leitura dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Fim");
		TesteLeitura1.exemploLeituraArquivo1();
	}

	public static void exemploEscritaArquivo2() {
		System.err.println(" ---------- Exemplo : OutputStream ---------------- ");

		OutputStream os;
		Writer w;

		try {
			os = osFile("lorem2.txt");
			w = new OutputStreamWriter(os);

		} catch (Exception e) {
			System.out.println("Erro na escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
			String string = Long.toString(System.nanoTime()); 
			for (int i = 0; i < 11; i++) {
				bw.write(string);
				bw.newLine();
			}
		} catch (Exception e) {
			System.out.println("Erro na escrita dos dados do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}
		
		System.out.println("Fim");
		TesteLeitura1.exemploLeituraArquivo2();
	}

	public static void exemploEscritaArquivo3() {

		System.err.println(" ---------- Exemplo : InputStream -> OutputStream ---------------- ");

		InputStream is;
		Reader r;

		OutputStream os;
		Writer w;

		try {
			is = isFile("lorem.txt");
			r = new InputStreamReader(is);
			os = osFile("lorem3.txt");
			w = new OutputStreamWriter(os);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
			try (BufferedReader br = new BufferedReader(r)) {
				String string = br.readLine();
				while (string != null) {
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

	public static void exemploEscritaArquivo4() {

		//System.err.println(" ---------- Exemplo : InputStream -> OutputStream ---------------- ");

		InputStream is;
		Reader r;

		OutputStream os;
		Writer w;

		try {
			is = System.in;
			r = new InputStreamReader(is);
			os = osFile("lorem4.txt");
			w = new OutputStreamWriter(os);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
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

	public static void exemploEscritaArquivo5() {

		//System.err.println(" ---------- Exemplo : InputStream -> OutputStream ---------------- ");

		InputStream is;
		Reader r;

		OutputStream os;
		Writer w;

		try {
			is = isFile("lorem.txt");
			r = new InputStreamReader(is);
			os = System.out;
			w = new OutputStreamWriter(os);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
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

	public static void exemploEscritaArquivo6() {

		//System.err.println(" ---------- Exemplo : InputStream -> OutputStream ---------------- ");

		InputStream is;
		Reader r;

		OutputStream os;
		Writer w;

		try {
			is = System.in;
			r = new InputStreamReader(is);
			os = System.out;
			w = new OutputStreamWriter(os);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
			try (BufferedReader br = new BufferedReader(r)) {
				String string = br.readLine();
				while (string != null && !string.isEmpty()) {
					bw.write(string);
					bw.newLine();
					bw.flush();
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

	public static void exemploEscritaArquivo7() {

		//System.err.println(" ---------- Exemplo : InputStream -> OutputStream ---------------- ");
		Socket s = new Socket();
		
		InputStream is;
		Reader r;

		OutputStream os;
		Writer w;

		try {
			is = s.getInputStream();
			r = new InputStreamReader(is);
			os = s.getOutputStream();
			w = new OutputStreamWriter(os);
		} catch (Exception e) {
			System.out.println("Erro na leitura/escrita do arquivo: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(w)) {
			try (BufferedReader br = new BufferedReader(r)) {
				String string = br.readLine();
				while (string != null && !string.isEmpty()) {
					bw.write(string);
					bw.newLine();
					bw.flush();
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

	public TesteEscrita1() {
		super();
		//Ex();
		//exemploEscritaArquivo1();
		//exemploEscritaArquivo2();
		//exemploEscritaArquivo3();
		//exemploEscritaArquivo4();
		//exemploEscritaArquivo5();
		//exemploEscritaArquivo6();
		exemploEscritaArquivo7();
	}

	public TesteEscrita1(String[] args) {
		super();
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		new TesteEscrita1();
		new TesteEscrita1(args);
	}

}
