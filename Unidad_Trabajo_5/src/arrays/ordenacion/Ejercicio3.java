package arrays.ordenacion;

public class Ejercicio3 {
	
	/**
	 * Procedmiento que ordena los valores de un array mediante el método de Cocktailsort
	 * @param array - un array de valores enteros
	 */
	public static void cocktailsort (int array[]) {
		boolean cambio=true;
		int aux;
		int i=0, j=array.length-1;
		while (i<j && cambio) {
			cambio=false;
			for (int k=i; k<j; k++) {
				if (array[k]>array[k+1]) {
					aux = array[k+1];
					array[k+1] = array[k];
					array[k] = aux;
					cambio = true;
				}
			}
			j--;
			if (cambio) {
				cambio=false;
				for (int k=j; k>i; k--) {
					if (array[k]<array[k-1]) {
						aux = array[k];
						array[k] = array[k-1];
						array[k-1] = aux;
						cambio = true;
					}
				}
			}
			i++;
		}
	}
}


