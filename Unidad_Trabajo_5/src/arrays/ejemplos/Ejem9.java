package arrays.ejemplos;

public class Ejem9 {
	
	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de valores enteros 
	 * @param vector - array de valores enteros
	 */
	public static void visualizar (int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

	public static void main(String[] args) {
		// Creamos dos arrays A y B
		int[] A = {1,3,5,7,9};
		
		int[] B = {2,4,6,8,10};
		
		// Mostramos los valores alamacenados en los arrays
		System.out.print("Vector A: ");
		visualizar(A);
		System.out.print("\nVector B: ");
		visualizar(B);
		
		// Creamos un array C que contenga los valores de A y de B
		int C[] = new int[A.length+B.length];
		
		int i=0;		// Índice para el array C
		
		// Copiamos los valores de A y B en C
		for (int j=0; j<A.length; j++) {
			C[i]=A[j];
			i++;
		}
		for (int j=0; j<B.length; j++) {
			C[i]=B[j];
			i++;
		}
		
		// Mostramos los valores alamacenados en C
		System.out.print("\nVector C: ");
		visualizar(C);
		
		

	}

}
