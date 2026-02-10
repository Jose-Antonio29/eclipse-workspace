package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {
	
	final static int TOTAL = 5;

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int n,max,min;
			// Pedimos 10 números enteros
			System.out.println("Introduce "+TOTAL+" números...");
			System.out.print("Dime un valor: ");
			max = min = sc.nextInt();
			
			for (int i=1; i<TOTAL; i++) {
				System.out.print("Dime otro valor: ");
				n = sc.nextInt();
				if (n>max) {
					max = n;
				} 
				if (n<min) {
					min = n;
				}
			}
			
		System.out.println("El mayor es "+max);
		System.out.println("El menor es "+min);
		
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de dato incorrecto.");
		}
		
		
		// Cerramos el scanner
		sc.close();

	}

}
