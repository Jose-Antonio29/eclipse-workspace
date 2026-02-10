package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int num;
			// Pedimos números hasta que den el 0
			System.out.println("Dime números, para finalizar pon el 0...");
			System.out.print("Dime un valor: ");
			num = sc.nextInt();
			// Si el número introducido no es 0
			if (num == 0) {
				System.out.println("Fin.");
			} else {
				int min, max;
				min = max = num;
				
				while(num!=0) {
					if (num<min) {
						min = num;
					}
					if (num>max) {
						max = num;
					}
					System.out.print("Dime otro valor: ");
					num = sc.nextInt();
				}
			  // Mostramos el mayor y menor
				System.out.println("Mayor: "+max+"\nMenor: "+min);
			}
			
				
			
				
		} catch (InputMismatchException ime) {
			System.err.println("Valor incorrecto.");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
