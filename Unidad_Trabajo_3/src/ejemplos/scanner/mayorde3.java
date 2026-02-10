package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mayorde3 {
	
	public static int mayor(int x, int y) {
		if (x>y) {
			return x;
		} else
			return y;
	}

	public static void main(String[] args) {
		// Cremaos el lector 
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos el primer número
			System.out.print("Dime el primer número: ");
			int a = sc.nextInt();

			// Pedimos el segundo número 
			System.out.print("Dime el segundo número: ");
			int b = sc.nextInt();

			// Pedimos el tercer número
			System.out.print("Dime el tercer número: ");
			int c = sc.nextInt();

			// Comprobamos cuál es el mayor número y mostramos resultado
			if (a>b) {
				if (a>c) {
					System.out.println(a+" es el mayor de los tres");
				} else 
					System.out.println(c+" es el mayor de los tres");
			} 	else if (b>c) {
				System.out.println(b+ " es el mayor de los tres");
			} else 
				System.out.println(c+ " es el mayor de los tres");
		} catch (InputMismatchException e) {
			System.err.println(">>  ERROR!!  Has introducido un valor incorrecto.");
		}


		// Cerramos el lector
		sc.close();

	}

}
