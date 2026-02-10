package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio31 {

	public static int mayor (int n) {
		int div=1;
		for (int i=Math.abs(n/2); i>=2; i--) {
			if (n%i==0)
				return div=i;
		}
		return div;
	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;

			// Pedimos el número entero positivo
			System.out.print("Dime un número entero: ");
			n = sc.nextInt();


			System.out.println("El mayor divisor de "+n+" es: "+mayor(n));

		} catch (InputMismatchException ime) {
			System.out.println("No has introducido un número entero positivo.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
