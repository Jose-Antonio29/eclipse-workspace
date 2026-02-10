package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {

			// Pedimos un número entero positivo
			System.out.print("Dime un número entero postivo: ");
			int n = sc.nextInt();
			if (n<=0) {
				System.out.println("El número debe ser positivo.");
			} else {
				if (n%2==0) {
					System.out.println(n+" es múltiplo de 2");
				} else 
					System.out.println(n+" no es múltiplo de 2");


				if (n%3==0) {
					System.out.println(n+" es múltiplo de 3");
				} else 
					System.out.println(n+" no es múltiplo de 3");


				if (n%5==0) {
					System.out.println(n+" es múltiplo de 5");
				} else 
					System.out.println(n+" no es múltiplo de 5");


				if (n%7==0) {
					System.out.println(n+" es múltiplo de 7");
				} else 
					System.out.println(n+" no es múltiplo de 7");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número entero positivo.");
		}
		// Cerramos el Scanner
		sc.close();
	}

}
