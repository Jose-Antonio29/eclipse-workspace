package ejemplos.estudiantes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiantes_Test_3 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos por teclado la información del estudiante
			System.out.print("Dime el nombre del estudiante: ");
			String name = sc.nextLine();
			
			System.out.print("Dime la nota de la primera evaluación: ");
			int nota1 = sc.nextInt();
			
			System.out.print("Dime la nota de la segunda evaluación: ");
			int nota2 = sc.nextInt();
			
			System.out.print("Dime la nota de la tercera evaluación: ");
			int nota3 = sc.nextInt();
			System.out.println();
			
			// Creamos el estudiante con los datos introducidos
			Estudiantes e = new Estudiantes(name, nota1, nota2, nota3);
			
			// Mostramos los datos del estudiante
			e.mostrarEstudiante();
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
	}

}
