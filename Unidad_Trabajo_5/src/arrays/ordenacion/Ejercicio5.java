package arrays.ordenacion;

public class Ejercicio5 {

	/**
	 * Función que calcula y devuelve la media de los valores almacenados en un array de números enteros
	 * @param array - un array de números enteros
	 * @return - La media de los valores almacenados
	 */
	public static double media (int array[]) {
		double suma=0;
		for (int i=0; i<array.length; i++) {
			suma+=array[i];
		}
		return suma/array.length;
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
	 * Procedimiento que imprime por pantalla los valores almacenados en un array
	 * @param array
	 */
	public static void mostrar (int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	// Programa principal
	public static void main(String[] args) {
		// Creamos el array A[]
		int[] A = new int[50];

		for (int i=0; i<A.length; i++) {
			A[i]=(int)(Math.random()*50+1);
		}

		
		// Ordenamos y mostramos los valores de A
		bubblesort(A);
		System.out.print("Valores de A: ");
		mostrar(A);

		// Mostramos el menor valor, el mayor valor y la media de los valores
		System.out.println("\nEl mayor valor es: "+A[A.length-1]);
		System.out.println("El menor valor es: "+A[0]);
		System.out.println("La media de los valores es: "+media(A));
	}

}
