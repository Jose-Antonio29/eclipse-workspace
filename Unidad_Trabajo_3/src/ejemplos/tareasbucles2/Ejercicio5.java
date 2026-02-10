package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
	final static int NOTAS=5;

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n,i=1,susp=0;
			// Pedimos un número entre 1 y 10
			do {
				System.out.print("Dime tu nota: ");
				n = sc.nextInt();
				if (n>=1 && n<=10) {
					i++;
					if (n<NOTAS) 
						susp++;
					
				} else
					System.out.println("Debes introducir un valor entre 1 y 10!");
			} while (i<=5);

			if (susp==1) {
				System.out.println("Hay un suspenso.");
			} else if (susp>0 && susp!=1) {
				System.out.println("Hay varios suspensos");
			}

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();


	}

}
