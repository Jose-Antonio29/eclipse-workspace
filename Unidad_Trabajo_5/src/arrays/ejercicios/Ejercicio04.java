package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	
	final static int CANT=10;

	public static void main(String[] args) {
		// Creamos el array vector[]
		int[] vector = new int[CANT];
		
		// Leemos y almacenamos los valores en vector[]
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				vector[i]=sc.nextInt();
			}
			
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Mostramos por pantalla el vector en orden alternado (primero -> último , segundo --> penúltimo)
		for (int i=0; i<vector.length/2; i++) {
			System.out.print(vector[i]+" ");
			System.out.print(vector[vector.length-1-i]+" ");
		}

	}

}
