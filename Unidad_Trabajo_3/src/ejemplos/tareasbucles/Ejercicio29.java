package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio29 {

	public static boolean primo(int N) {
		if (N <= 1)
			return false;
		else {
			for (int i=2; i<=N/2; i++) {
				if (N%i==0)
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
			do {
				System.out.print("Dime un número entero positivo: ");
				n = sc.nextInt();
			} while (n<1);

			// Mostramos todos los números primos menores que el número dado
			System.out.print("Los números primos menores que " + n + " son: ");
			for (int i=2; i<n; i++) {
				if (primo(i))
					System.out.print(i + " ");
			}

		} catch (InputMismatchException ime) {
			System.err.println("No has introducido un valor entero positivo.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
