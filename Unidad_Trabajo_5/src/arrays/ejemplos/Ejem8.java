package arrays.ejemplos;

public class Ejem8 {
	
	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de valores enteros 
	 * @param vector - array de valores enteros
	 */
	public static void visualizar (int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de valores enteros en orden inverso  
	 * @param vector - array de valores enteros
	 */
	public static void OrdenInverso (int[] vector) {
		for (int i=vector.length-1; i>=0; i--) {
			System.out.print(vector[i]+" ");
		}
	}
	
	/**
	 * Función que compara los valores de un array de valores enteros y determina cuál es el mayor
	 * @param vector - vector de valores enteros
	 * @return - El mayor valor entre los valores almacenados en el array
	 */
	public static int Mayor (int[]vector) {
		int mayor = vector[0];
		for (int i=1; i<vector.length; i++){
			if (mayor<vector[i]) {
				mayor = vector[i];
			}
		}
		return mayor;
	}
	
	/**
	 * Función que compara los valores de un array de valores enteros y determina cuál es el menor
	 * @param vector - vector de valores enteros
	 * @return - El menor valor entre los valores almacenados en el array
	 */
	public static int Menor (int[] vector) {
		int menor = vector[0];
		for (int i=1; i<vector.length; i++){
			if (menor>vector[i]) {
				menor = vector[i];
			}
		}
		return menor;
	}
	
	/**
	 * Función que calcula la media de los valores almacenados en un array de valores enteros
	 * @param vector - array de valores enteros
	 * @return - La media de los valores almacenados en un array
	 */
	public static double Media (int[] vector) {
		double suma = 0;
		for (int i=0; i<vector.length; i++) {
			suma+=vector[i];
		}
		return suma/vector.length;
	}

	// Programa principal
	public static void main(String[] args) {
		// Creamos un array de números enteros
		int tabla[]= {11, 23, 32 , 4, 51, 21, 8, -10, 17};
		
		// Mostramos el array por pantalla
		System.out.println("Valores alamacenados en el array: ");
		visualizar(tabla);
		
		// Mostramos el array por pantalla en orden inverso
		System.out.println("\n\nValores almacenados en el array en orden inverso: ");
		OrdenInverso(tabla);
		
		// Mostramos el mayor valor almacenado en el array
		System.out.println("\n\nMayor valor almacenado: "+Mayor(tabla));
		
		// Mostramos el menor valor alamacenado en el array
		System.out.println("\nMenor valor almacenado: "+Menor(tabla));
		
		// Mostramos la media de los valores almacenados en el array
		System.out.println("\nMedia de los valores almacenados: "+Media(tabla));
	}
}
