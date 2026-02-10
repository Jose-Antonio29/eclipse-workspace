package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	final static int I=1;
	final static int FIN=999;

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entre 1 y 999
			do {
				System.out.print("Dime un número entre 1 y 999: ");
				n = sc.nextInt();
			} while (n<I || n>FIN);
			
			int a =0;
			
			System.out.println(n/a);   // Lanzará una excepción por dividir entre 0
			System.out.println("hola");  // No se llega a ejecutar


		} catch (InputMismatchException ime) {
			// Se ejecuta si el n introducido no es un número entero
			System.err.println("Tipo de valor incorrecto.");
		} catch (Exception e) {
			// Se ejecuta con cualquier otra excepción (en este caso la división de un número entre 0
			System.err.println("Se ha producido otra excepción.");
		} finally {

			// Cerramos el scanner
			sc.close();

		}
	}

}
