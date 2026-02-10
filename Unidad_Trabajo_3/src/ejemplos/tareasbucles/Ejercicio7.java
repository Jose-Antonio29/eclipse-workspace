package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos al usuario que introduzca el primer valor y lo leemos
			System.out.print("Dime un valor entero entre 1 y 10: ");
			int n = sc.nextInt();

			while (n<1 || n>10) {
				System.err.println(n+" no se encuentra entre 1 y 10.");
				System.out.print("Dime un valor entero entre 1 y 10: ");
				n = sc.nextInt();
			}

			// Mostramos el vqalor por pantalla
			System.out.print("Has introducido el valor: "+n);

		} catch (InputMismatchException e) {
			System.err.println("ERROR: Tipo de datos introducido es incorrecto.");
		}

		// Cerramos el Scanner
		sc.close();

	}
}
