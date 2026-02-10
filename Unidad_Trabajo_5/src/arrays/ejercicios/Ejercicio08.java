package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {
	
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
		
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Mostramos los valores de A[] por pantalla
		System.out.print("Valores de A: ");
		mostrar(A);
		
		// Rotamos los valores de A
		int ultimo = A[CANT-1];
		
		for (int i=CANT-2; i>=0; i--) {
			A[i+1]=A[i];
		}
		A[0]=ultimo;
		
		// Mostramos los valores actualizados de A[]
		System.out.print("\nValores actualizados de A: ");
		mostrar(A);

	}

}
