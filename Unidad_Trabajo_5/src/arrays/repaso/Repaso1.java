package arrays.repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso1 {
	/* Programa que lea dos conjuntos de valores enteros y los almacene cada uno en un array.
	 * El programa, haciendo uso de funciones, debe indicar si los arrays son iguales (es decir,
	 * almacenan los mismos valores en las mismas posiciones) y si almacenan el mismo conjunto 
	 * de números (sin importar el orden).
	 */

	/**
	 * Procedimiento que imprime por pantalla los valores almacenados en un array
	 * @param array
	 */
	public static void mostrar (int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	/**
	 * Procedimiento que ordena los valores almacenados en un array de números enteros 
	 * @param array - un array de números enteros
	 */
	public static void bubblesort (int[] array) {
		int aux;
		boolean cambio;
		for (int i=array.length; i>0; i--) {
			cambio=false;
			for (int j=0; j<i-1; j++) {
				if (array[j]>array[j+1]) {
					aux = array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}
			}
			if (!cambio) {
				return;
			}
		}
	}

	/**
	 * Función que determina si dos arrays son idénticos, es decir, tiene los mismos valores en las mismas posiciones
	 * @param A - un array de números enteros
	 * @param B - un array de números enteros
	 * @return TRUE si son idénticos, FALSE si no lo son
	 */
	public static boolean identico (int A[], int B[]) {
		for (int i=0; i<TAM; i++) {
			if (A[i]!=B[i])
				return false;
		}
		return true;
	}

	final static int TAM = 5;

	// Programa principal
	public static void main(String[] args) {
		// Creamos dos arrays
		int[] A = new int[TAM];
		int[] B = new int[TAM];
		
		// Leemos y almacenamos los valores de A y B
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce los valores de A");
			for (int i=0; i<A.length; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}
			
			System.out.println("Introduce los valores de B");
			for (int i=0; i<B.length; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				B[i]=sc.nextInt();
			}
			
			// Mostramos por pantallas si son idénticos o no
			if (identico(A,B)) {
				System.out.println("Los arrays son idénticos.");
			} else
				System.out.println("Los arrays no son idénticos.");
			
			// Mostramos por pantalla si son equivalentes o no, para eso primero ordenamos los dos arrays
			bubblesort(A);
			bubblesort(B);
			
			if (identico(A,B)) {
				System.out.println("Los arrays son equivalentes");
			} else 
				System.out.println("Los arrays no son equivalentes.");
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto");
		} finally {
			sc.close();
		}
	}

}
