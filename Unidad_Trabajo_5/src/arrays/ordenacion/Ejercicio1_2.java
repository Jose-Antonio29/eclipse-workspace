package arrays.ordenacion;

public class Ejercicio1_2 {
	
	/**
	 * Procedimiento que ordena un array por método de Burbuja 
	 * @param array - un array de valores enteros
	 */
	public static void bubblesort (int array[]) {
		int aux;
		boolean cambio;
		for (int i=array.length; i>0; i--) {
			cambio=false;
			for (int j=0; j<i-1; j++) {
				if (array[j]>array[j+1]) {
					aux = array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio = true;
				}
			}
			if (!cambio) {
				return;
			}
		}
	}
	
	/**
	 * Procedimiento que imprime por pantalla los valores almacenados en un array de valores enteros
	 * @param array - un array de valores enteros
	 */
	public static void mostrar (int[] array) {
		for (int i=0; i<array.length; i++) {	
			System.out.print(array[i]+" ");
		}	
	}
	
	final static int TOTAL=50;

	public static void main(String[] args) {
		// Creamos un array A[] compuesto de 50 números aleatorios
		int[] A = new int[TOTAL];
		
		for (int i=0; i<A.length; i++) {
			A[i]=(int)(Math.random()*100+1);
		}

		// Mostramos los valores de A[]
		System.out.print("Valores de A: ");
		mostrar(A);
		
		// Mostramos los valores de A ordenados de menor a mayor
		System.out.print("\nValores de A (de menor a mayor): ");
		bubblesort(A);
		mostrar(A);
	}

}
