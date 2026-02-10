package arrays.ordenacion;

public class Ejercicio6 {
	
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

	public static void main(String[] args) {
		// Creamos un array A[] de tamaño 100 y que contenga números aleatorios entre 1 y 1000
		int[] A = new int[100];
		
		for (int i=0; i<A.length; i++) {
			A[i]=(int)(Math.random()*1000+1);
		}
		
		// Mostramos los 10 valores más grandes
		bubblesort(A);
		System.out.print("Valores de A: ");
		mostrar(A);
		System.out.print("\nLos 10 valores más grandes:");
		for (int i=A.length-1; i>=A.length-10; i--) {
			System.out.print(A[i]+" ");
		}

	}

}
