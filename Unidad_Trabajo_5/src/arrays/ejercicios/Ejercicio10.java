package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	/**
	 * Procedimiento que imprime los valores almacenados en un array de valores enteros
	 * @param v - Array de valores enteros (int)
	 */
	public static void mostrar (int[] v) {
		for (int i=0; i<v.length; i++) {
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
			mostrar(A);

			// Pedimos un valor que eliminar
			System.out.println("\nElige el valor que quieres eliminar según su posición (1 a "+CANT+")");
			int posi;
			do {
				System.out.print("Posición: ");
				posi = sc.nextInt();

				if (posi<1 || posi>CANT) {
					System.out.println("La posición elegida no es válida.");
				}
			} while(posi<1 || posi>CANT);
			
			// Creamos un array B que no contenga el valor almacenado en la posición elegida por el usuario
			int[] B = new int[A.length-1];
			int j=0;
			for (int i=0; i<A.length; i++) {
				if (i!=posi-1) {
					B[j]=A[i];
					j++;
				}
			}
			
			// Mostramos los valores de B
			System.out.print("Valores del vector actualizados: ");
			mostrar(B);
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
	}
}
