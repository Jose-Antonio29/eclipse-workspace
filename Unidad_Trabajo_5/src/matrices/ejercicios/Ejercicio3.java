package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	
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
	
	final static int FILAS=3;
	final static int COLUMNAS=4;


	public static void main(String[] args) {
		int[][] A = new int[FILAS][COLUMNAS];
		
		// Leemos y almacenamos los valores de A
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce los valores de A:");
			for (int i=0; i<FILAS; i++) {
				for (int j=0; j<COLUMNAS; j++) {
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
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<A[i].length; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("\t--> Suma: "+SumaFilaMatriz(A,i));
			System.out.println();
		}		
	}
}
