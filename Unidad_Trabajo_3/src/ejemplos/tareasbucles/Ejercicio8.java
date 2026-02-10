package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	/**
	 * Función que cuenta los números impares hasta n desde el 2
	 * @param n - Límite superior de la función
	 */
	public static void imp (int n) {
		for (int conta=3; conta<=n; conta+=2) {
			System.out.print(conta+" ");
		}
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos un número entero positivo
			System.out.print("Dime un número entero positivo: ");
			int n = sc.nextInt();

			// Contamos los impares hasta n
			if (n<1) {
				System.err.println("Debes introducir un número entero positivo.");
			} else {
				System.out.print("Contamos todos los números primos hasta "+n+": ");
				imp(n);
			}

		} catch (InputMismatchException e) {
			System.err.println("Tipo de dato incorrecto.");
		}

		// Cerramos el Scanner
		sc.close();

	}

}
