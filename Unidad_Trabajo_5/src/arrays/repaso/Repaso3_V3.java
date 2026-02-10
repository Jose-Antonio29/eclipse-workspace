package arrays.repaso;

public class Repaso3_V3 {

	/*
	 * Programa que genere de forma aleatoria 5 valores entre 1 y 10 que se almacenen en un array
	 * Si alguno de los números generados ya se encuentra en el array (es decir, está repetido),
	 * debe indicarlo con un mensaje.
	 */

	// Constantes
	final static int TAM=5;
	final static int LIMIT=10;

	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de números enteros
	 * @param V - un array de números enteros
	 */
	public static void mostrar (int[] V) {
		for (int i=0; i<V.length; i++) {
			System.out.print(V[i]+" ");
		}
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

	// Programa principal
	public static void main(String[] args) {
		// Declaramos y creamos el array
		int[] A = new int[TAM];

		// Generamos valores aleatorios y los almacenamos en el array
		for (int i=0; i<TAM; i++) {
			A[i]=random(LIMIT);
			System.out.print(A[i]);

			if (repetido(A[i],A,i)) {
				System.out.print(" --> Repetido");
			}
			System.out.println();
		}
		System.out.println();
	}
}
