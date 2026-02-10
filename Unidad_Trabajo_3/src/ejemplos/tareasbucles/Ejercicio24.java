package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int n, par, impar;
			par = impar = 0;
			// Pedimos números hasta que se introduzca el 0
			System.out.println("Introduce números enteros, para finalizar introduce el 0...");
			System.out.print("Dime un valor: ");
			n = sc.nextInt();
			
			while(n!=0) {
				if (n%2==0) {
					par++;
				} else 
					impar++;
				System.out.print("Dime otro valor: ");
				n = sc.nextInt();
			}
			
			// Mostramos resultado por pantalla
			System.out.println("Números pares introducidos: "+par);
			System.out.println("Números impares introducidos: "+impar);
			
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
