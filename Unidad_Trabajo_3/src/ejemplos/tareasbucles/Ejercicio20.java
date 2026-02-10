package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio20 {
	
	public static void imprimir(int a, int b) {
		
			for (int i=a; i<=b; i++) {
				if (i%2==0)
				System.out.print(i+" ");
			}

	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos dos números enteros positivos
			int n1, n2;
			do {
				System.out.print("Dime un número entero positivo: ");
				n1 = sc.nextInt();
			} while (n1<1);

			do {
				System.out.print("Dime otro: ");
				n2 = sc.nextInt();
			} while (n2<1);
			
			if (n1<n2) {
				imprimir (n1, n2);
				
			} else {
				imprimir (n2, n1);
			}
				


		} catch (InputMismatchException ime) {
			System.err.println("Debes introducir un número entero positivo.");
		}
		// Cerramos el Scanner
		sc.close();

	}

}
