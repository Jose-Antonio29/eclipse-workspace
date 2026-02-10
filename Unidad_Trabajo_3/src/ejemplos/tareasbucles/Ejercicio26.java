package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n, min, max;
			min=0; max=0;

			// Pedimos números entre -100 y 100
			System.out.println("Dime valores entre -100 y 100...");
			System.out.print("Primer valor: ");
			n = sc.nextInt();

			if (n<-100||n>100) {
				System.err.println("Debes introducir números entre -100 y 100.");
			} else {
				min = n;
				max = n;
			}
			while (n!=0) {
				System.out.print("Dime otro valor: ");
				n = sc.nextInt();
				if (n>100||n<-100) {
					System.err.println("Debes introducir números entre -100 y 100."); 
				} else {
					if (max<n && (max>-100||max<100)) {
						max = n;
					} 
				
				if (min>n && (min>-100||min<100)) {
					min = n;
				}
			}
		}

		//Mostramos resultados por pantalla
		System.out.println("El mayor número introducido es: "+max);
		System.out.println("El menor número introducido es: "+min);
		System.out.println("Media = ("+min+" + "+max+")/2 = "+(min+max)/2.0);

	} catch (InputMismatchException ime) {
		System.err.println("Tipo de valor incorrecto.");
	}

	// Cerramos el scanner
	sc.close();

}

}
