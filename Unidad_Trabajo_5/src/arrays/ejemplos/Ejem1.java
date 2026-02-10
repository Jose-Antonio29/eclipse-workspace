package arrays.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem1 {
	
	final static int TAM = 3;

	public static void main(String[] args) {
		// Creamos el scanner
				Scanner sc = new Scanner(System.in);

				try {
					// Pedimos 5 números
					System.out.println("Introduce 5 números:");
					
					// Declaración y creación del array
					int numeros[] = new int[TAM];
					
					// Leemos los números que va introduciendo el usuario por teclado
					for(int i=0; i<TAM; i++) {
						System.out.print("Num "+(i+1)+": ");
						numeros[i] = sc.nextInt();
					}

					// Mostramos los datos introducidos en el mismo orden
					System.out.print("Números: ");
					for (int i=0; i<TAM; i++) {
						System.out.print(numeros[i]+" ");
					}
					
					// Mostramos los datos introducidos en el orden inverso
					System.out.print("\nNúmeros: ");
					for (int i=TAM-1; i>=0; i--) {
						System.out.print(numeros[i]+" ");
					}
					
					// Mostramos el primero y el último
					System.out.println("\nPrimer número: "+numeros[0]);
					System.out.println("Último número: "+numeros[TAM-1]);

				} catch (InputMismatchException ime) {
					System.err.println(">> ERROR: El tipo de datos introducidos no es correcto.");
				} finally {
					sc.close();
				}
	}

}
