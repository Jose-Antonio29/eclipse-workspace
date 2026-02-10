package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio28 {

	/**
	 * Función que indica si un número entero es o no un número primo Un número
	 * primo es un número mayor que 1 que tiene únicamente por divisores el 1 y el
	 * propio número.
	 * 
	 * @param N - Número entero
	 * @return - TRUE si N es un número primo, FALSE si no lo es.
	 */
	public static boolean primo(int N) {
		if (N <= 1)
			return false;
		else {
			// Recorremos los posibles divisores (hasta la mitad)
			for (int i = 2; i <= N / 2; i++) {
				if (N % i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos un número entero
			System.out.print("Dime un número entero: ");
			int n = sc.nextInt();

			// Mostramos resultado por pantalla
			if (primo(n))
				System.out.println("Tu número es primo.");
			else
				System.out.println("Tu número no es primo.");

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();
	}

}
