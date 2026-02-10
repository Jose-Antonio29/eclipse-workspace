package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	final static int LS=100;

	public static int random () {
		return (int)(Math.random()*LS+1);
	}

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n ,random, intentos=0;
			random = random();
			// Pedimos un número entre 1 y LS
			System.out.println(random);
			System.out.println("Intenta adivinar el número entre 1 y "+LS+" que he pensado...");

			do {
				System.out.print("Adivina mi número: ");
				n = sc.nextInt();
				intentos++;

				if (n<random) {					
					System.out.println("Mayor");
				}

				if (n>random) {	
					System.out.println("Menor");
				}

			} while (n!=random);

			System.out.println("Has acertado!!");
			System.out.println("Total de intentos realizados: "+intentos);

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
