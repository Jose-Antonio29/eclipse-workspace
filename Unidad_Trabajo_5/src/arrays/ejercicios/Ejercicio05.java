package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	
	public static void mostrar (int[] v) {
		for (int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
	}
	
	final static int CANT=5;

	public static void main(String[] args) {
		// Creamos los arrays A y B
		int[] A = new int[CANT];
		int[] B = new int[CANT];
		
		// Leemos y almacenamos los valores de los arrays
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce "+CANT+" números enteros para A: ");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}
			
			System.out.println("Introduce "+CANT+" números enteros para B: ");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				B[i]=sc.nextInt();
			}
			
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Juntamos los valores de A y B en un array C en el siguiente orden: 1º A, 1º B, 2ºA, 2ºB...
		int[] C = new int[A.length+B.length];
		
		int i=0;
		for (int j=0; j<CANT; j++) {
			C[i]=A[j];
			i++;
			C[i]=B[j];
			i++;
		}
		
		// Mostramos los valores de los vectores por pantalla por pantalla
		System.out.print("\nValores de A: ");
		mostrar(A);
		System.out.print("\nValores de B: ");
		mostrar(B);
		System.out.print("\nValores de C: ");
		mostrar(C);
	}

}
