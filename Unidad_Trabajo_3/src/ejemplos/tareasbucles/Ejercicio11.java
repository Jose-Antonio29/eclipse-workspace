package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {
	
	public static void tablas(int N) {
		for (int min=1; min<=N; min++) {
			System.out.println(min+"\t"+2*min+"\t"+3*min);
		}
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos el valor entero positivo
			System.out.print("Dime un valor entero positivo: ");
			int n = sc.nextInt();
			
			
			
			// Mostramos tablas por pantalla
			System.out.println("Num\tDoble\tTriple");
			tablas(n);
			
			
		} catch (InputMismatchException e) {
			System.err.println("No has introducido un valor válido");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
