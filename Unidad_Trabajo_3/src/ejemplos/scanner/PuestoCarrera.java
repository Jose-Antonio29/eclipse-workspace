package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PuestoCarrera {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos la posición en la que ha quedado el competidor
			System.out.print("Dime en qué puesto has quedado: ");
			int puest = sc.nextInt();
			
			// Enseñamos su puesto
			switch (puest) {
			case 1: System.out.println("Oro"); break;
			case 2: System.out.println("Plata"); break;
			case 3: System.out.println("Bronce"); break;
			case 4:
			case 5: System.out.println("Diploma"); break;
			default: System.out.println("Sin premio");
	
			} 
		} catch (InputMismatchException i) {
			System.err.println("Has introducido un valor incorrecto");
		}
		
		// Cerramos el lector
		sc.close();

	}

}
