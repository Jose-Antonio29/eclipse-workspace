/**
 * Crear una matriz 3x4 que almacene valores generados de forma aleatoria entre 1 y 20.
 * Mostrar los valoresd almacenados por pantalla
 * Buscar y mostrar por pantalla el mayor y el menor valor almacenado en la matriz
 */

package matrices.ejemplos;

public class EjMatriz06 {

	final static int FILAS = 3;
	final static int COLUMNAS = 4;
	final static int RANGO = 20;

	/**
	 * Procedimiento que muestra por pantalla los valores almacenados de una matriz
	 * 
	 * @param M - Matriz de números enteros
	 */
	public static void mostrar(int[][] M) {
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Creamos matriz
		int[][] matriz = new int[FILAS][COLUMNAS];

		// Generamos de forma aleatoria los valores de la matriz
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = (int) (Math.random() * RANGO + 1);
			}
		}

		// Mostramos los valores almacenados en la matriz
		System.out.println("Matriz: ");
		mostrar(matriz);

		// Buscar y generar el mayor y el menor valor almacenado
		int mayor = matriz[0][0]; 
		int menor = matriz[0][0];

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				// Actualizamos el valor mayor
				if (mayor < matriz[i][j])
					mayor = matriz[i][j];
				// Actualizamos el valor menor
				if (menor > matriz[i][j])
					menor = matriz[i][j];
			}
		}
		// Mostramos el mayor valor
		System.out.print("\nMayor valor: " + mayor);

		// Mostramos el menor valor
		System.out.print("\nMenor valor: " + menor);
	}
}
