package matrices.ejercicios;

public class Ejercicio1 {
	
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
	
	final static int TAM=5;

	public static void main(String[] args) {
		int[][] A = new int[TAM][TAM];
		
		for (int i=0; i<A.length; i++) {
			A[i][i]=1;
		}
		
		mostrarMatriz(A);
	}

}
