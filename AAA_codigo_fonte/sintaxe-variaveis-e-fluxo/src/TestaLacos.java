
public class TestaLacos {
	
	
	public static void Fatorial() {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
    }
	
	public static void Multiplos3() {
        for(int linha = 1; linha < 104; linha++) {
            if(linha % 3 == 0) {
                System.out.print(" " + linha);
            }
            
        }
    }
	
	public static void Ex1() {
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
	public static void Ex2() {
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                if(coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
	public static void Ex3() {
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for(int contador = 0; contador <= 10; contador++) {
                System.out.println(multiplicador * contador);
            }
        }
    }
	
	
	public static void Ex4() {
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for(int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		TestaLacos.Ex1();
		TestaLacos.Ex2();
		TestaLacos.Ex3();
		TestaLacos.Ex4();
		TestaLacos.Multiplos3();
		TestaLacos.Fatorial();
	}

}
