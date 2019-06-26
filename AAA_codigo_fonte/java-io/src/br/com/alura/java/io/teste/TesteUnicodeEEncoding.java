package br.com.alura.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void Ex1() {
		try {
			String string = "C";
			Charset charset = Charset.defaultCharset();
			System.out.println(string.codePointAt(0) + ", " + charset.displayName());

			byte[] bytes = string.getBytes();
			System.out.print(bytes.length + " , windows-1252 : ");
			String newStringC1 = new String(bytes, "windows-1252");
			System.out.println(newStringC1);

	
			System.out.println();
			System.err.println(" --- CODIFICA INCORRETA!  ----");
			System.out.println();
			
			bytes = string.getBytes(StandardCharsets.UTF_8);
			System.out.print(bytes.length + " , UTF-8 : ");
			newStringC1 = new String(bytes, "windows-1252");
			System.out.println(newStringC1);

			bytes = string.getBytes(StandardCharsets.UTF_16);
			System.out.print(bytes.length + " , UTF_16 : ");
			newStringC1 = new String(bytes, "windows-1252");
			System.out.println(newStringC1);
			
			bytes = string.getBytes(StandardCharsets.US_ASCII);
			System.out.print(bytes.length + " , StandardCharsets.US_ASCII : ");
			newStringC1 = new String(bytes, "windows-1252");
			System.out.println(newStringC1);

			System.out.println();
			System.err.println(" --- CODIFICA CORRETA!  ----");
			System.out.println();
			
			bytes = string.getBytes("UTF-8");
			System.out.print(bytes.length + " , UTF-8 : ");
			newStringC1 = new String(bytes, StandardCharsets.UTF_8);
			System.out.println(newStringC1);

			bytes = string.getBytes(StandardCharsets.US_ASCII);
			System.out.print(bytes.length + " , ASCII : ");
			newStringC1 = new String(bytes, StandardCharsets.US_ASCII);
			System.out.println(newStringC1);
			
			bytes = string.getBytes(StandardCharsets.UTF_16);
			System.out.print(bytes.length + " , UTF_16 : ");
			newStringC1 = new String(bytes, StandardCharsets.UTF_16);
			System.out.println(newStringC1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		System.err.println(" --- outro exemplo  ----");
		System.out.println();
		
		try {
			System.out.println();
			System.err.println(" --- incorreto  ----");
			System.out.println();
			
			String s1 = "13� �rg�o Oficial";
			byte[] bytes = s1.getBytes();
			String s2 = new String(bytes, "UTF-8");
			System.out.println(s2);

			System.out.println();
			System.err.println(" --- correto  ----");
			System.out.println();
			Charset utf8 = StandardCharsets.UTF_8;
			bytes = s1.getBytes(utf8);
			s2 = new String(bytes, "UTF-8");
			System.out.println(s2);			

			String[] codes = { "ISO-8859-1", "UTF-8", "UTF-16" };
			String palavra = "�";
			 
			for (String encoding : codes) {
			  byte[] b = palavra.getBytes(encoding);
			  System.out.printf("%10s\t%d\t", encoding, b.length);
			  for (int k = 0; k < b.length; k++) {
			    String hex = Integer.toHexString((b[k] + 256) % 256);
			    if (hex.length() == 1)
			      hex = "0" + hex;
			    System.out.print(hex);
			  }
			  System.out.println();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TesteUnicodeEEncoding() {
		Ex1();
	}

	public static void main(String[] args) {
		new TesteUnicodeEEncoding();
		
		
	}

}
