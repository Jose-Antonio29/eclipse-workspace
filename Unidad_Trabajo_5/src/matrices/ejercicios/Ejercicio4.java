package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
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
	
	/**
	 * Función que suma los valores almacenados en una fila de de una Matriz
	 * @param M - Una matriz de números enteros
	 * @param fila - La fila que queremos sumar
	 * @return La suma de los valores almacenados en la fila elegida
	 */
	public static int SumaFilaMatriz (int[][] M, int fila) {
		int suma=0;
		for (int i=fila; i<=fila; i++) {
			for (int j=0; j<M[i].length; j++) {
				suma+=M[i][j];
			}
		}
		
		return suma;
	}
	
	final static int FILAS=5;
	final static int COLUMNAS=3;


	public static void main(String[] args) {
		int[][] A = new int[FILAS][COLUMNAS];
		
		// Leemos y almacenamos los datos de A
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce los valores de A:");
			for (int i=0; i<A.length; i++) {
				for (int j=0; j<A[i].length; j++) {
					System.out.print("Valor ["+(i+1)+"]["+(j+1)+"]: ");
					A[i][j]=sc.nextInt();
				}
			}
			
			
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		System.out.println("Valores de A: ");
		mostrarMatriz(A);
		
		// Comparamos y almacenamos el mayor valor, el menor y la media de valores
		int menor = A[0][0];
		int mayor = A[0][0];
		int suma=0;
		
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length; j++) {
				if (menor>A[i][j]) 
					menor = A[i][j];
				
				if (mayor<A[i][j])
					mayor = A[i][j];
				
				suma+=A[i][j];
			}
		}
		
		// Mostramos el mayor valor, el menor y la media
		System.out.println("\nMayor: "+mayor);
		System.out.println("Menor: "+menor);
		System.out.println("Media: "+suma/(FILAS+COLUMNAS));
		

	}

}
