package ejemplos.numero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entero_Test {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			Entero e = new Entero();
			// Pedimos el número
			System.out.print("Dime un número entero: ");
			e.setNumero(sc.nextInt());
			
			// Mostramos resultados
			System.out.println();
			System.out.println("Número: "+e.getNumero());
			System.out.println("Doble: "+e.doble());
			System.out.println("Triple: "+e.triple());
			System.out.println("Mitad: "+e.mitad());
			System.out.println("Elevado a 0: "+e.potencia(0));
			System.out.println("Elevado a 1: "+e.potencia(1));
			System.out.println("Elevado a 2: "+e.potencia(2));
			System.out.println("Elevado a 3: "+e.potencia(3));
			
			if (!e.esPar()) {
				System.out.println("Es un nº impar");
			} else
				System.out.println("No es un nº impar");
			
			if (e.esPrimo()) {
				System.out.println("Es un nº primo");
			} else {
				System.out.println("No es un nº primo");
			}
			
			System.out.println("Conversión a double: "+e.toDouble());
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

	}

}
