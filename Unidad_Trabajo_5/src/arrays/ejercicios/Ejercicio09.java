package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de valores enteros (int)
	 * @param v - Array de valores enteros
	 */
	public static void mostrar (int[] v) {
		for (int i=0; i<CANT; i++) {
			System.out.print(v[i]+" ");
		}
	}

	final static int CANT = 5;

	public static void main(String[] args) {
		// Creamos el array A
		int[] A = new int[CANT];

		// Leemos y almacenamos 5 valores enteros en A
		Scanner sc = new Scanner(System.in);

		int rotacion;
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}

			// Mostramos los valores de A[] por pantalla
			System.out.print("Valores de A: ");
			mostrar(A);

			// Pedimos cuantas posiciones queremos rotar
			System.out.print("\n\nIntroduce cuántas posiciones quieres rotar: ");
			rotacion = sc.nextInt();

			// Rotamos los valores de A
			int ultimo;

			for (int i=0; i<rotacion; i++) {
				ultimo=A[CANT-1];
				for (int j=CANT-2; j>=0; j--) {
					A[j+1]=A[j];
				}
				A[0]=ultimo;
			}
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

		// Mostramos los valores actualizados de A[]
		System.out.print("\nValores actualizados de A: ");
		mostrar(A);
	}
}
