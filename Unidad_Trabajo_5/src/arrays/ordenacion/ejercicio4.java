package arrays.ordenacion;

public class ejercicio4 {
	
	/**
	 * Función que combina dos arrays pasados como parámetros
	 * @param A - un array de números enteros
	 * @param B - un array de números enteros
	 * @return - un array de números enteros ordenados
	 */
	public static int[] combina (int A[], int B[]) {
		// Juntamos los valores de dos array distintos en uno solo
		int[] C = new int[A.length+B.length];
		
		int i=0;
		for (int j=0; j<A.length; j++) {
			C[i]=A[j];
			i++;
		}
		for (int j=0; j<B.length; j++) {
			C[i]=B[j];
			i++;
		}		
		// Ordenamos los valores del nuevo array 
		int aux;
		boolean cambio;
		for (int j=C.length; j>0; j--) {
			cambio = false;
			for (int k=0; k<j-1; k++) {
				if (C[k]>C[k+1]) {
					aux = C[k+1];
					C[k+1] = C[k];
					C[k] = aux;
					cambio = true;
				}
			}
			if (!cambio) {
				return C;
			}
		}
		return C;
	}
	
	/**
	 * Procedimiento que imprime por pantalla los valores almacenados en un array de valores enteros
	 * @param array - un array de valores enteros
	 */
	public static void mostrar (int array[]) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		// Creamos dos arrays
		int A[] = {2,7,12,25,1};
		int B[] = {3,3,9,0};
		
		// Juntamos los dos arrays y los ordenamos mediante la función juntar_y_ordenar
		System.out.print("Valores de A: ");
		mostrar(A);
		
		System.out.print("\nValores de B: ");
		mostrar(B);
		
		System.out.print("\nValores de C: ");
		mostrar(combina(A,B));

	}

}
