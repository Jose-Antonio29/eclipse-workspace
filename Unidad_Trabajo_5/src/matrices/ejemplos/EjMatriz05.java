/**
 * Crear una matriz 3x4 con valoers entre 1 y 20 generados de forma aleatoria.
 * Mostrar por pantalla los valores almacenados en la matriz.
 * después, motrat solo los valores almacennados que sean pares.
 * Por último, mostrar solo los vlaores almacenados que sean impares.
 */
package matrices.ejemplos;

public class EjMatriz05 {

	final static int FILAS = 3;
	final static int COLUMNAS = 4;
	final static int RANGO = 20;

	public static void main(String[] args) {
		// Creamos la matriz
		int[][] matriz = new int[FILAS][COLUMNAS];

		// Generamos de forma aleatoria los valores que se almacenarán en la matriz
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				matriz[i][j] = (int) (Math.random() * RANGO + 1);
			}
		}

		// Visualizamos los valores almacenados en la matriz
		System.out.println("Matriz:");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		// Visualizamos los valores PARES almacenados en la matriz
		System.out.println("\nMatriz  (solo valores pares): ");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] % 2 == 0)
					System.out.print(matriz[i][j] + "\t");
				else
					System.out.print("*\t");
			}
			System.out.println();
		}

		// Visualizamos los valores IMPARES almacenados en la matriz
		System.out.println("\nMatriz  (solo valores impares): ");
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (matriz[i][j] % 2 != 0)
					System.out.print(matriz[i][j] + "\t");
				else
					System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
