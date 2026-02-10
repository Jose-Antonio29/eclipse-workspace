package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
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
	
	final static int TOTAL=3;


	public static void main(String[] args) {
		int[][] A = new int[TOTAL][TOTAL];
		int[][] B = new int[TOTAL][TOTAL];
		
		// Leemos y almacenamos los valores de A y B
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Matriz A 3X3:");
			for (int i=0; i<A.length; i++) {
				for (int j=0; j<A[i].length; j++) {
					System.out.print("A["+i+"]["+j+"]: ");
					A[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("\nMatriz B 3X3:");
			for (int i=0; i<B.length; i++) {
				for (int j=0; j<B[i].length; j++) {
					System.out.print("B["+i+"]["+j+"]: ");
					B[i][j]=sc.nextInt();
				}
			}
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Mostramos A y B por pantalla
		System.out.println("\nMatriz A: ");
		mostrarMatriz(A);
		
		System.out.println("\nMatriz B: ");
		mostrarMatriz(B);
		
		// Sumamos los valores de A y B y los almacenamos en C
		int[][] C = new int[TOTAL][TOTAL];
		
		for (int i=0; i<C.length; i++) {
			for (int j=0; j<C[i].length; j++) {
				C[i][j]=(A[i][j]+B[i][j]);
			}
		}
		
		// Mostramos los valores de C1
		System.out.println("\nMatriz Suma: ");
		mostrarMatriz(C);
	}
}
