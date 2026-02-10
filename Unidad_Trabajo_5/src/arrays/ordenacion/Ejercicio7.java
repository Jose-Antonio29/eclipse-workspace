package arrays.ordenacion;

public class Ejercicio7 {
	
	final static int TAM = 100;
	final static int LIMIT = 100;
	
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
	 * Funciónq que comprueba si un valor entero N se encuantra en un array
	 * Requisito: el array debe estar ordenado
	 * @param N - un número entero
	 * @param array - un array de números enteros
	 * @return TRUE si N está entre los valores almacenados en el array, FALSE si no lo está
	 */
	public static boolean encuentra (int N, int[] array) {
		for (int i=0; i<array.length; i++) {
			if(N==array[i]) 
				return true;
			if(N<array[i])
				return false;
		}
		return false;
	}

	// Programa principal
	public static void main(String[] args) {
		// Creamos un array A[] de tamaño 100 y que contenga números entre el 1 y el 100
		int[] A = new int[TAM];
		
		for (int i=0; i<A.length; i++) {
			A[i]=(int)(Math.random()*LIMIT+1);
		}
		
		// Ordenamos y mostramos los valores de A[]
		System.out.print("Valores de A desordenados:\n");
		mostrar(A);
		bubblesort(A);
		System.out.print("\n\nValores de A ordenados:\n");
		mostrar(A);
		
		// Buscamos y mostramos los valores que no se han almacenado entre 1 y 100
		System.out.println("\n\nValores no almacenados en A:");
		for (int num=1; num<=LIMIT; num++) {
			if (!encuentra(num,A)) {
				System.out.print(num+" ");
			}
		}
	}
}
