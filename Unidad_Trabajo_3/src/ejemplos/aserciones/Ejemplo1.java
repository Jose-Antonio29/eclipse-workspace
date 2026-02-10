package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entero positivo
			System.out.print("Introduce un valor positivo: ");
			n = sc.nextInt();

			// Aserción para verificar que el número introducido sea positivo
			assert n > 0 : "No has introducido un valor positivo.";

			// Mostramos los números impares menores que n desde el 2
			for (int i=3; i<n; i+=2) {
				System.out.print(i+" ");
			}

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de dato incorrecto.");
		} catch (AssertionError a) {
			System.err.println(a.getMessage());
		} finally {
			sc.close();
		}
	}

}
