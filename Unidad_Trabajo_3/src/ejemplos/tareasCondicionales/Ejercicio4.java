package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos un número positivo de un dígito
			System.out.print("Dime un número entero positivo de un dígito: ");
			int n = sc.nextInt();
			if (n<=0) {
				System.err.println("Error: debes introducir un número entero positivo de un dígito.");
			} else {
				switch (n) {
				case 1: System.out.println("Uno"); break;
				case 2: System.out.println("Dos"); break;
				case 3: System.out.println("Tres"); break;
				case 4: System.out.println("Cuatro"); break;
				case 5: System.out.println("Cinco"); break;
				case 6: System.out.println("Seis"); break;
				case 7: System.out.println("Siete"); break;
				case 8: System.out.println("Ocho"); break;
				case 9: System.out.println("Nueve"); break;
				default : System.err.println("Error: no es un número de un dígito.");
				}
			}

		} catch (InputMismatchException e) {
			System.err.println("Error: debes introducir un número entero positivo de un dígito.");
		}

		// Cerramos el Scanner
		sc.close();

	}

}
