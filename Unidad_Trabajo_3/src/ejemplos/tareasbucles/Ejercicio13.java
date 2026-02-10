package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos un número entre 1 y 10
			System.out.print("Dime un número entre 1 y 10: ");
			int n = sc.nextInt();
			
			if (n<1 || n>10) {
				System.err.println("No has introducido un número entre 1 y 10.");
			} else {
				System.out.println("Tabla de "+n+":");
				for (int i=1; i<=10; i++) {
					System.out.println(n+" X "+i+" = "+(n*i));
				}
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Tipo de valor incorrecto.");
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
