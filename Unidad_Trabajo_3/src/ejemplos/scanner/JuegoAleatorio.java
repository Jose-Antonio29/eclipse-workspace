package ejemplos.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoAleatorio {

	public static void main(String[] args) {
		int random=(int)(Math.random()*5+1);
		final int MAX=5;
		// Creamos el lector
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos un número de 1 a 5
			System.out.print("Elige un número del 1 al "+MAX+"(ambos incluidos): ");
			int num = sc.nextInt();

			// Comprobamos que ha acertado el número

			if (num<=MAX && num>=1) {
				// Comprobamos si el número introducido coincide con el aleatorio
				if (num==random) {
					System.out.println("Has acertado!!");
				} else {
					System.out.println("Oohhh! Has fallado! Era el "+random);
					System.out.println("Intentalo de nuevo");
				}
			} else
				System.out.println("No has introducido un número entre 1 y "+MAX+"...");

		} catch (InputMismatchException e) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el lector
		sc.close();

	}

}
