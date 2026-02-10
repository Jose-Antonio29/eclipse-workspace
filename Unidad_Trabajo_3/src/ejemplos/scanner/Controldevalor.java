package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controldevalor {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos un valor entero positivo
			System.out.print("Dime un valor entero positivo: ");
			int n = sc.nextInt();
			int conta;
			
			// Comprobamos que se trata de un valor entero positivo
			if (n<=0) {
				System.err.println("Debes introducir un valor entero positivo.");
			} else {

				// Contamos del 1 a n con WHILE
				conta=1;
				System.out.print("Con WHILE: ");
				while (conta<=n) {
					System.out.print(conta++ +" ");
				}
				System.out.println();

				// Contamos del 1 a n con DO WHILE
				conta=1;
				System.out.print("Con DO WHILE: ");
				do {
					System.out.print(conta++ +" ");			
				} while (conta<=n);
				System.out.println();

				// Contamos del 1 a n con FOR
				System.out.print("Con FOR: ");
				for (conta=1; conta<=n; conta++) {
					System.out.print(conta+" ");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el lector 
		sc.close();
	}
}
