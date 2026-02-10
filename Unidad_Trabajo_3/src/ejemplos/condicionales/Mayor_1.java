package ejemplos.condicionales;

public class Mayor_1 {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=15, b=5;
		
		// Comparamos y mostramos el resultado por pantalla
		if (a>b) {
			System.out.println(a+" es mayor que "+b);
		} 
		else if (a==b) {
			System.out.println(a+" es igual a "+b);
		}
		else {
			System.out.println(a+" es menor que "+b);
		}

	}

}
