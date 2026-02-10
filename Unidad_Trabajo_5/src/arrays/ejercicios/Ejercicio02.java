package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	final static int CANT = 10;

	public static void main(String[] args) {
		// Creamos el array
		int vector[] = new int[CANT];
		
		// Leemos y almacenamos los valores en el array
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<vector.length; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				vector[i]=sc.nextInt();
			}
		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Mostramos la media de los valores introducidos
		double suma=0;
		for (int i=0; i<vector.length; i++) {
			suma+=vector[i];
		}
		System.out.println("\nMedia de los valores introducidos: "+(suma/vector.length));
		
		// Mostramos el mayor valor almacenado en el array
		int mayor = vector[0];
		for (int i=1; i<vector.length; i++) {
			if (mayor<vector[i]) {
				mayor=vector[i];
			}
		}
		System.out.println("Mayor valor: "+mayor);
		
		// Mostramos el menor valor almacenado en el array
		int menor = vector[0];
		for (int i=1; i<vector.length; i++) {
			if (menor>vector[i]) {
				menor=vector[i];
			}
		}
		System.out.println("Menor valor: "+menor);
	}
}
