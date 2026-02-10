package matrices.ejercicios;

public class Ejercicio2 {
	
	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en una matriz
	 * @param M - Una matriz de números enteros
	 */
	public static void mostrarMatriz (int[][] M) {
		for (int i=0; i<M.length; i++) {
			for (int j=0; j<M[i].length; j++) {
				System.out.print(M[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	final static int FILAS=8;
	final static int COLUMNAS=6;

	public static void main(String[] args) {
		int [][] marco = new int[FILAS][COLUMNAS];
		
		for (int i=0; i<marco.length; i++) {
			for (int j=0; j<marco[i].length; j++) {
				if (i==0 || i==FILAS-1 || j==0 || j==COLUMNAS-1) {
					marco[i][j]=1;
				}
			}
		}
		
		mostrarMatriz(marco);

	}

}
