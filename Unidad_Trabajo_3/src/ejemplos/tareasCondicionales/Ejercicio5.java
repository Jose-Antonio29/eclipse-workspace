package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos las horas, minutos y segundos
			System.out.print("Dime una hora: ");
			int h = sc.nextInt();
			
			System.out.print("Dime los minutos: ");
			int m = sc.nextInt();
			
			System.out.print("Dime los segundos: ");
			int s = sc.nextInt();
			
			// Comprobamos el formato
			if (h<0 || h>23) {
				System.err.println("Las horas son incorrectas.");
			} else  
				System.out.println("Las horas son correctas.");
		
			
			if (m<1 || m>59) {
				System.err.println("los minutos son incorrectos.");
			} else 
				System.out.println("Los minutos son correctos");
			
			if (s<1 || s>59) {
				System.err.println("Los segundos son incorrectos.");
			} else 
				System.out.println("Los segundos son correctos.");
			
			
			
		} catch (InputMismatchException e) {
			System.err.println("El valor introducido es incorrecto.");
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
