package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n, error, mayor;
			error = 0;
			// Pedimos números incrementales
			System.out.println("Dime números cada vez mayores...");
			System.out.print("Primer valor: ");
			n = sc.nextInt();
			mayor = n;

			while (n!=0) {
				System.out.print("Otro valor: ");
				n = sc.nextInt();
				if (mayor<n && mayor!=0) {
					mayor=n;
				} else if (n!=0){
					System.err.println("Debes introducir números cada vez mayores.");
					error++;
				}

			}

			// Mostramos resultados
			System.out.println("Número de errores cometidos: "+error);

		} catch(InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
