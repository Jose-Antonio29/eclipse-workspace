package ejemplos.bucles;

public class Tabla_de_multiplicar {
	
	public static void multi(int num) {
		for (int conta=1; conta<=10; conta++)
			System.out.println(num+" X "+conta+" = "+(num*conta));
	}
	
	public static void main(String[] args) {
		for (int num=1; num<=10; num++) {
			multi(num);
			System.out.println();
		}
		

	
	}

}
