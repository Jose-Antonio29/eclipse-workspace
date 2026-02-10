package arrays.repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Repaso6 {

	/**
	 * Función que devuelve la cantidad de números en común que hay entre dos arrays de números enteros
	 * @param A - Un array de números enteros
	 * @param B - Un array de números enteros
	 * @return El número de valores que coinciden entre los dos arrays
	 */
	public static int coincidencias (int[] A, int[] B) {
		int conta=0;
		bubblesort(A); bubblesort(B);
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B.length; j++) {
				if (A[i]==B[j]) {
					conta++;
				}
			}
		}			
		return conta;
	}

	/**
	 * Función que devuelve un número aleatorio entre 1 y N
	 * @param N - Límite superior del número que puede devolver la función
	 * @return Un número aleatorio entre 1 y N
	 */
	public static int random (int N) {
		return (int)(Math.random()*N+1);
	}

	/**
	 * Procedimiento que ordena los valores almacenados de un array de números enteros con el método de Burbuja
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

	final static int TAM = 6;		// Número de apuestas
	final static int LIM = 49;		// Los números aceptados para las apuestas se encontrarán entre 1 y LIM

	public static void main(String[] args) {
		// Array que almacenará las apuestas del usuario (números leídos por teclado)
		int Apuestas[] = new int[TAM];

		// Array que almacenará los números ganadores de la lotería (generados aleatoriamente
		int Ganadores[] = new int[TAM];

		// Leemos los valores de las apuestas y los almacenamos en el array Apuestas
		Scanner sc = new Scanner(System.in);	
		try {
			System.out.println("Elige 6 apuestas para la lotería primitiva:");
			for (int i=0; i<Apuestas.length; i++) {
				do {
					System.out.print("["+(i+1)+"] Número: ");
					Apuestas[i]=sc.nextInt();					
					if (Apuestas[i]<1 || Apuestas[i]>LIM) {
						System.out.println("El número debe estar entre 1 y "+LIM+".");
					}
				} while(Apuestas[i]<1 || Apuestas[i]>LIM);
			}

		} catch (InputMismatchException ime) {
			System.err.println();
		} finally {
			sc.close();
		}

		// Mostramos los números de las apuestas del usuario
		bubblesort(Apuestas);
		System.out.print("\nNúmeros apostados: ");
		mostrar(Apuestas);

		// Generamos los números ganadores y los almacenamos en su array
		int num;
		for (int i=0; i<TAM; i++) {
			do {
				num=random(LIM);
			} while(repetido(num,Ganadores,i));
			Ganadores[i]=num;
		}

		// Mostramos los números ganadores ordenados
		bubblesort(Ganadores);
		System.out.print("\nNúmeros ganadores: ");
		mostrar(Ganadores);

		// Mostramos la cantidad de números que coinciden entre las apuestas y los ganadores, es decir, el número de aciertos
		System.out.println("\nTotal de aciertos: "+coincidencias(Apuestas,Ganadores));
	}
}
