package arrays.repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso5 {
	/*
	 * Programa que lea 5 valores entre 1 y 10 introducidos por un usuario que se almacenen en un array,
	 * de forma que no se repitan los números (no pueden haber valores duplicados).
	 */

	/**
	 * Función que determina si un valor N se encuentra almacenado en el array V
	 * @param N - Valor entero a buscar
	 * @param V - Array de valores enteros
	 * @param pos - Posición del array hasta la que vamos a comparar valores
	 * @return TRUE si N se encuentra entre los valores almacenados en V
	 * 		   FALSE en otro caso.
	 */
	public static boolean repetido (int N ,int[] V, int pos) {
		for (int i=0; i<pos; i++) {
			if (N==V[i]) 
				return true;
		}
		return false;
	}

	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de números enteros
	 * @param V - un array de números enteros
	 */
	public static void mostrar (int[] V) {
		for (int i=0; i<V.length; i++) {
			System.out.print(V[i]+" ");
		}
	}
	
	// Constantes
	final static int TAM=5;

	// Programa principal
	public static void main(String[] args) {
		// Generamos y almacenamos los valores del array
		int A[] = new int[TAM];
		
		// Leemos y almacenamos los valores de A[]
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce 5 valores sin repetirlos...");
			for (int i=0; i<TAM; i++) {
				do {
					System.out.print("Valor ["+(i+1)+"]: ");
					A[i]=sc.nextInt();
					
					if (repetido(A[i],A,i)) 
						System.out.println("El valor no puede ser repetido...");
					
				} while (repetido(A[i],A,i));
			}
					
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducidos no es correcto.");
		} finally {
			sc.close();
		}
	
		// Mostramos los valores de A
		System.out.print("\nValores de A: ");
		mostrar(A);
	}

}
