package arrays.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem0 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos 5 números 
			System.out.println("Introduce 5 números: ");
			System.out.print("Num 1: ");
			int n1 = sc.nextInt();

			System.out.print("Num 2: ");
			int n2 = sc.nextInt();

			System.out.print("Num 3: ");
			int n3 = sc.nextInt();

			System.out.print("Num 4: ");
			int n4 = sc.nextInt();

			System.out.print("Num 5: ");
			int n5 = sc.nextInt();

			// Mostramos los resultados
			System.out.println("\nNúmeros introducidos: "+n1+" "+n2+" "+n3+" "+n4+" "+n5);
			System.out.println("Del revés: "+n5+" "+n4+" "+n3+" "+n2+" "+n1);
			System.out.println("Primero: "+n1);
			System.out.println("Último: "+n5);

		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducidos no es correcto.");
		} finally {
			sc.close();
		}
	}
}
