package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static int menor(int x, int y) {
		if (x<y) {
			return x;
		} else 
			return y;
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		try {
			// Pedimos dos números enteros
			System.out.print("Dime un número entero: ");
			int a = sc.nextInt();
			
			System.out.print("Dime otro número entero: ");
			int b = sc.nextInt();
			
			// Comparamos los números
			System.out.println(menor(a,b)+" es el menor de los dos.");
			
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número entero");
		}
		
		
		// Cerramos el scanner
		sc.close();
		

	}

}
