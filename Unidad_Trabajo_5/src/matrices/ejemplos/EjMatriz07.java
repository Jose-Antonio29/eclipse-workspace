package matrices.ejemplos;

public class EjMatriz07 {

	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en una matriz
	 * @param M - Matriz de valores enteros 
	 */
	public static void mostrar (int M[][]) {
		for(int i=0; i<M.length; i++) {
			for (int j=0; j<M[i].length; j++) {
				System.out.print(M[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	final static int FILAS=4;
	final static int COLUMNAS=4;
	final static int RANGO=20;
	
	public static void main(String[] args) {
		// Creamos la matriz
		int[][] M = new int[FILAS][COLUMNAS];
		
		//Generamos los valores aleatorios de la matriz 
		for(int i=0; i<FILAS; i++) {
			for (int j=0; j<COLUMNAS; j++) {
				M[i][j]=(int)(Math.random()*RANGO+1);
				System.out.print(M[i][j]+"\t");
			}
			System.out.println();
		}
		
		// Mostramos la matriz 
		System.out.println("Matriz: ");
		mostrar(M);
		
		// Mostramos la diagonal principal
		System.out.println("\nDiagonal principal: ");
		for(int i=0; i<FILAS; i++) {
			System.out.print(M[i][i]+" ");
		}
		
	}

}
