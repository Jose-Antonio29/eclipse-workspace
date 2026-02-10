package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30 {

	/**
	 * Función que comprueba si un número entero mayor que 1 es primo o no
	 * Un número primo es un número entero mayor que 1 que solo es divisible 
	 * por 1 y por sí mismo.
	 * @param n - Número que se comprueba
	 * @return - FALSE si no es primo, TRUE si es primo
	 */
	public static boolean primo (int n) {
		if (n<=1) 
			return false;
		else {
			for (int i=2; i<=n/2; i++) {
				if (n%i==0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entero positivo
			System.out.print("Dime un número: ");
			n = sc.nextInt();

			while (n!=0) {
				if (n<0) 
					System.err.println("Debes introducir un número entero positivo!");
				else {
					if (primo(n)==true)
						System.out.println("> Es primo");
					else 
						System.out.println("> No es primo");
				}
				System.out.print("Dime un número: ");
				n = sc.nextInt();
			}

			System.out.println("FIN.");

		} catch (InputMismatchException ime) {
			System.err.println("No has introducido un valor entero positivo.");
		}

		// Cerramos el scanner
		sc.close();
	}

}
