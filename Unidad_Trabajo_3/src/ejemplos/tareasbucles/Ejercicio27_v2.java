package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio27_v2 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entero positivo
			do {
				System.out.print("Dime un número entero positivo: ");
				n = sc.nextInt();
			} while (n <= 0);

			// Compruebo que sea un entero positivo y mostramos resultado por pantalla
			if (n <= 0) {
				System.err.print("Debes introducir un número entero positivo.");
			} else {
				System.out.print("Los divisores de " + n + " son: ");
				for (int i = 2; i <= n/2; i++) {
					if (n % i == 0) {
						System.out.print(i + " ");
					}
				}
			}

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
