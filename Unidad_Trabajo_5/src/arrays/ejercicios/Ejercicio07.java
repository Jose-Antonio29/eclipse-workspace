package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void mostrar(int[] v) {
		for (int i=0; i<CANT; i++) {
			System.out.print(v[i]+" ");
		}
	}

	final static int CANT=9;

	public static void main(String[] args) {
		// Creamos el array A
		int[] A = new int[CANT];

		// Leemos 8 valores y los almacenamos en A
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce 8 valores enteros...");
			for (int i=0; i<CANT-1; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}

			// Mostramos los valores de A
			System.out.print("\nValores de A: ");
			mostrar(A);

			// Pedimos un número entero nuevo y una posición donde ponerlo
			int posi, num;
			System.out.println("\n\nDime un número y la posición (entre 1 y "+CANT+") en la que insertarlo:");
			System.out.print("Nuevo num: ");
			num = sc.nextInt();
			do {
				System.out.print("Posición: ");
				posi = sc.nextInt();
				if (posi<1 || posi>CANT) {
					System.out.println("Esta posición no es válida.");
				}
			} while (posi<1 || posi>CANT);
			
			// Desplazamos el número a su posición y los números que tenga delante
			for (int i=CANT-2; i>=posi-1; i--) {
				A[i+1]=A[i];
			}
			A[posi-1]=num;
			
			// Mostramos los valores actualizados de A
			System.out.print("Valores de A actualizados: ");
			mostrar(A);
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
	}

}
