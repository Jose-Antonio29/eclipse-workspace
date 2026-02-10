package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HoraOK {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int h, min, s;
			// Pedimos horas, minutos y segundos
			System.out.println("Introduce la hora...");

			System.out.print("Dime la hora: ");
			h = sc.nextInt();
			if (h<0 || h>23) {
				System.err.println("Horas fuera del rango permitido.");
			} else {			
				System.out.print("Dime los minutos: ");
				min = sc.nextInt();
				if (min<0 || min>59) {
					System.err.println("Minutos fuera del rango permitido.");
				} else {
					System.out.print("Dime los segundos: ");
					s = sc.nextInt();
					if (s<0 || s>59) {
						System.err.println("Segundos fuera del rango permitido.");
					} else {
						System.out.println("La hora es correcta.");
					}
				}
			}
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		} finally {
			sc.close();
		}
	}
}
