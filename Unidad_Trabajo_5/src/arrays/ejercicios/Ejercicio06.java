package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	
	final static int CANT = 5;

	public static void main(String[] args) {
		// Creamos el array A[]
		int[] A = new int[CANT];
		
		// Leemos los valores de A y los almacenamos
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				A[i]=sc.nextInt();
			}
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducidos no es correcto.");
		} finally {
			sc.close();
		}
		
		// Comprobamos el orden de los valores y mostramos resultado por pantalla
		boolean creciente = false;
		boolean decreciente = false;
		for (int i=0; i<A.length-1; i++) {
			if (A[i]<A[i+1]) {
				creciente=true;
			}
			if (A[i]>A[i+1]) {
				decreciente=true;
			}
		}
		
		if (creciente && !decreciente) {
			System.out.println("El vector está en orden creciente.");
		}
		if (!creciente && decreciente) {
			System.out.println("El vector está en orden decreciente.");
		}
		if (creciente && decreciente) {
			System.out.println("El vector está desordenado");
		}
		if (!creciente && !decreciente) {
			System.out.println("Todos los números son iguales");
		}

	}

}
