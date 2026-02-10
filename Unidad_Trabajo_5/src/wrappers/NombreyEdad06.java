package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NombreyEdad06 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos la edad
			System.out.print("Introduce tu edad: ");
			int edad = Integer.parseInt(sc.nextLine());

			// Pedimos el nombre
			System.out.print("Introduce tu nombre: ");
			String nom = sc.nextLine();

			// Pedimos la nota media
			System.out.print("Introduce tu nota: ");
			float f = Float.parseFloat(sc.nextLine());

			// Mostramos los valores leídos
			System.out.println("\nTe llamas "+nom+" y tu edad es "+edad+" años.");
			System.out.println("El año que viene tendrás "+(edad+1)+" años.");
			System.out.println("Subimos un punto tu nota "+(f+1));

		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} catch (NumberFormatException nume) {
			System.err.println("Error en la introducción del formato del número.");
		} finally {
			sc.close();
		}
	}
}
