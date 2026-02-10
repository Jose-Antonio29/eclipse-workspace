package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int num;
			int total = 0;
			float numN = 0;
			
			// Pedimos números hasta que den el 0
			System.out.println("Dime números, para finalizar pon un número negativo...");
			System.out.print("Dime un valor: ");
			num = sc.nextInt();
			
			// Si el número introducido no es 0
			while(num>=0) {
				total+=num;
				numN++;
				System.out.print("Dime otro valor: ");
				num = sc.nextInt();
			}

			if (numN==0) {
				System.out.println("No has introducido valores para realizar el cálculo.");
			} else {
				// Mostramos el mayor y menor
				System.out.println("La media es: "+(total/numN));
			}

		} catch (InputMismatchException ime) {
			System.err.println("Valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
