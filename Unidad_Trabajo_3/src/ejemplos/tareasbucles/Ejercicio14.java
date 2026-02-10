package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {
	
	public static int cifras (int n) {
		int i=1;
		while (n/10!=0) {
			n/=10;
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos un número entero
			System.out.print("Dime un número entero: ");
			int n = sc.nextInt();
			
			// Mostramos resultado en pantalla
			if (cifras(n)==1) {
			System.out.println("Tu número tiene "+cifras(n)+" cifra.");
			} else {
				System.out.println("Tu número tiene "+cifras(n)+" cifras.");
			}
			
		} catch(InputMismatchException ime) {
			System.err.println("Debes introducir un número entero");
		}
		
	
		// Cerramos el lector
		sc.close();

	}

}
