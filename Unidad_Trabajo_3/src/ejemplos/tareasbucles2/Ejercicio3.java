package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entre 1 y 10
			do {
				System.out.print("Dime tu nota: ");
				n = sc.nextInt();
			} while (n<1 || n>10);
			
			// Indicamos si es insuficiente, suficiente, bien, notable o sobresaliente
			switch (n) {
			case 1:
			case 2:
			case 3:
			case 4: System.out.println("Insuficiente"); break;
			case 5: System.out.println("Suficiente"); break;
			case 6: System.out.println("Bien"); break;
			case 7:
			case 8: System.out.println("Notable"); break;
			case 9:
			case 10: System.out.println("Sobresaliente"); break;
			}
			

		} catch(InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");		
		}

		// Cerramos el scanner
		sc.close();
	}

}
