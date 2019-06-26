
public class TestaWhile {

	public static void main(String[] args) {
		int contador = 0;
		System.out.println("contador : " + contador);
		while (contador <= 10) {
			System.out.println(contador);
			contador = contador + 1;
		}
		System.out.println("contador : " + contador);
		while (contador <= 20) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("contador : " + contador);
		while (contador <= 30) {
			System.out.println(contador);
			contador+=1;
		}
		System.out.println("contador : " + contador);
		/*
		while (false) {
			System.out.println(1);	
		}	
		*/	
	}

}
