package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LongitudyArea {

	final static double PI = 3.1416;
	
	public static double longitud (int r) {
		return 2*PI*r;
	}
	
	public static double area (int r) {
		return PI*r*r;
	}
	
	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		
		try {
			// Leemos el radio
			System.out.print("Dime el radio: ");
			int r = sc.nextInt();
			
			// Mostramos la longitud de una circunferencia de radio r
			System.out.println("Longitud de la circunferencia: "+longitud(r));
			
			// Mostramos el área de una circunferencia de radio r
			System.out.println("Área de la circunferencia: "+area(r));
			
		} catch (InputMismatchException ime) {
			System.err.println("Has introducido un valor incorrecto.");
		}
		
		// Cerramos el lector
		sc.close();
	}

}
