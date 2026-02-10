package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos el día de la semana
			System.out.print("Dime el nº del día de la semana: ");
			int dia = sc.nextInt();
			
			// Mostramos el día de la semana por pantalla
			switch (dia) {
				case 1: System.out.println("Lunes"); break;
				case 2: System.out.println("Martes"); break;
				case 3: System.out.println("Miércoles"); break;
				case 4: System.out.println("Jueves"); break;
				case 5: System.out.println("Viernes"); break;
				case 6: System.out.println("Sábado"); break;
				case 7: System.out.println("Domingo"); break;
				default: System.err.println("Has introducido un valor incorrecto.");
			}
		} catch (InputMismatchException i) {
			System.err.println("Has introducido un valor incorrecto.");
		}
		
		// Cerramos el lector
		sc.close();
		
		
		

	}

}
