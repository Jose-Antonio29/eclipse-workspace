package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {
	
	/**
	 * Programa que calcula el factorial de un número entero positivo.
	 * @param N Número sobre el que se calcula el factorial.
	 * @return Resultado del factorial de N.
	 */
	public static int factorial(int N) {
		int i;
		for (i=N-1; i>1; i--) {
			N*=i;
		}
		return N;
	}
	
	public static int facto(int N) {
		// Caso base
		if (N==1)
			return 1;
		else 
			return N*factorial(N-1);
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos un número entero positivo
			System.out.print("Dime un número entero positivo: ");
			int n = sc.nextInt();
			
			if (n<1) {
				System.err.println("Debes introducir un número positivo.");
			} else {
				System.out.println("El factorial de "+n+" es: "+factorial(n));
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Tipo de valor incorrecto.");
		}
		
		// Cerramos el Scanner
		sc.close();

	}

}
