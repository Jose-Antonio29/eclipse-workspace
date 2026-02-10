package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NombreyEdad04 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos la edad
			System.out.print("Introduce tu edad: ");
			String edad = sc.nextLine();
			int e = Integer.parseInt(edad);
			
			// Pedimos el nombre
			System.out.print("Introduce tu nombre: ");
			String nom = sc.nextLine();
			
			// Mostramos los valores leídos
			System.out.println("Te llamas "+nom+" y tu edad es "+e+" años.");
			System.out.println("El año que viene tendrás "+(e+1)+" años.");
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

	}

}
