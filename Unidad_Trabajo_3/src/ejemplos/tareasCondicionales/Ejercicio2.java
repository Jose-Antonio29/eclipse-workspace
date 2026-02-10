package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static int menor(int x, int y, int z) {
		if (x<y) {
			if (x<z) {
				return x;
			} else 
				return  z;
		} else if(y<z) {
			return y;
		} else 
			return z;
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos los tres números
			System.out.print("Dime un número entero: ");
			int a = sc.nextInt();
			
			System.out.print("Dime otro número entero: ");
			int b = sc.nextInt();
			
			System.out.print("Dime un último número entero: ");
			int c = sc.nextInt();
			
			// Comparamos los tres números
			if (a==b && b==c) {
				System.out.println("Los tres son iguales");
			} else 
			System.out.println(menor(a,b,c)+" es el menor de los tres.");
			
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un número entero.");
		}
		
		
		// Cerramos el Scanner
		sc.close();
	}

}
