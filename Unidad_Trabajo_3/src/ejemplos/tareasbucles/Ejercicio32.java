package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio32 {

	public static int mayor (int n) {
		int div=1;
		for (int i=n/2; i>=2; i--) {
			if (n%i==0)
				return div=i;
		}
		return div;
	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n, error, bien;
			error=0;
			bien=0;
			// Pedimos un número entre 1 y 100
			do {
				System.out.print("Dime un número: ");
				n = sc.nextInt();

				if ((n<1 || n>100) && n!=0) {
					System.out.println("Debes introducir un número entre 1 y 100!");
					error++;
				} else if (n!=0) {
					System.out.println("El mayor divisor de "+n+" es: "+mayor(n));
					bien++;
				}
			} while (n!=0);
			System.out.println();
			System.out.println("Númerros correctos (dentro de rango): "+bien);
			System.out.println("Número incorrectos (fuera de rango): "+error);

		} catch (InputMismatchException ime) {
			System.out.println("Debes introducir un valor entero.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
