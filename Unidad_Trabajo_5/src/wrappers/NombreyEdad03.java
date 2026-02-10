package wrappers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NombreyEdad03 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos la edad
			System.out.print("Introduce tu edad: ");
			int edad = sc.nextInt();
			sc.nextLine();
			
			// Pedimos el nombre
			System.out.print("Introduce tu nombre: ");
			String nom = sc.nextLine();
			
			// Mostramos los valores leídos
			System.out.println("Te llamas "+nom+" y tu edad es "+edad+" años.");
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

	}

}
