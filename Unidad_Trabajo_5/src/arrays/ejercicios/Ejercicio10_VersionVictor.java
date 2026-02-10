package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10_VersionVictor {

	/**
	 * Procedimiento que imprime los valores almacenados en un array de valores enteros
	 * @param v - Array de valores enteros (int)
	 * @param tam - cantidad de posiciones que queremos mostrar
	 */
	public static void mostrar (int[] v, int tam) {
		for (int i=0; i<tam; i++) {
			System.out.print(v[i]+" ");
		}
	}

	final static int CANT=10;

	public static void main(String[] args) {
		// Creamos un array A
		int[] A = new int[CANT];

		// Leemos y almacenamos los valores del array A[]
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce "+A.length+" números enteros...");
			for (int i=0; i<A.length; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}

			// Mostramos los valores de A[]
			System.out.print("\nValores del vector: ");
			mostrar(A,CANT);

			// Pedimos un valor que eliminar
			System.out.println("\nElige el valor que quieres eliminar según su posición (0 a "+(CANT-1)+")");
			int posi=CANT;
			do {
				System.out.print("Posición: ");
				posi = sc.nextInt();

				if (posi<0 || posi>CANT-1) {
					System.out.println("La posición elegida no es válida.");
				}
			} while(posi<0 || posi>CANT-1);
			
			// Actualizamos los valores de A[] según la posición elegida
			for (int i=posi; i<CANT-1; i++) {
				A[i]=A[i+1];
			}
			
			// Mostramos los valores de B
			System.out.print("Valores del vector actualizados: ");
			mostrar(A,CANT-1);
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
	}
}
