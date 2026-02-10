package ejemplos.condicionales;

public class Menor_1 {
	
	public static int aleatorio() {
		return (int)(Math.random()*10+1);
	}

	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int a=aleatorio(), b=aleatorio();
		
		// Comparamos e imprimimos resultado en pantalla
		if (a>b) {
			System.out.println(a+" es mayor que "+b);
		} else if (a<b) {
			System.out.println(a+" es menor que "+b);
		} else {
			System.out.println(a+" es igual a "+b);
		}

	}

}
