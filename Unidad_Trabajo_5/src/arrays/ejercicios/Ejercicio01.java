package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	final static int CANT=10;

	public static void main(String[] args) {
		// Creamos el array
		int vector[] = new int[CANT];

		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		// Leemos y almacenamos los valores de vector[]
		try {
			System.out.println("Introduce "+CANT+" valores enteros...");
			for (int i=0; i<vector.length; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				vector[i]=sc.nextInt();
			}
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

		// Mostramos los valores almacenados en vector[] en orden normal y en orden inverso
		System.out.print("Valores almacenados en el array: ");
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}

		System.out.print("\nValores almacenados en el array en orden inverso: ");
		for (int i=vector.length-1; i>=0; i--) {
			System.out.print(vector[i]+" ");
		}
	}
}
