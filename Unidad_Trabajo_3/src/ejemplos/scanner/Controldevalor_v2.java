package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controldevalor_v2 {

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
				// Contamos de 1 a n
				for (conta=1; conta<=n; conta++) {
					System.out.print(conta+" ");
				}
				System.out.println();

				//Contamos de n a 1
				for (conta=n; conta>=1; conta--) {
					System.out.print(conta+" ");
				}
			}
		} catch (InputMismatchException e) {
			System.err.println("Tipo de valor incorrecto.");
			System.err.println("Debes introducir un valor entero positivo.");
		}

		// Cerramos el lector 
		sc.close();
	}
}
