package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5_v2 {
	
	
	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n,i=1;
			boolean suspenso = false;
			// Pedimos un número entre 1 y 10
			do {
				System.out.print("Dime tu nota: ");
				n = sc.nextInt();
				if (n>=1 && n<=10) {
					i++;
					if (n<5) 
						suspenso=true;
					
				} else
					System.out.println("Debes introducir un valor entre 1 y 10!");
			} while (i<=5);

			if (suspenso) {
				System.out.println("Hay alumnos suspensos.");
			} else {
				System.out.println("No hay añumnos suspensos");
			}

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();


	}

}
