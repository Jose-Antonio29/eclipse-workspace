package arrays.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	
	/**
	 * Función que calcula la media de los valores enteros almacenados en un array de números enteros
	 * @param vector - array de números enteros (int)
	 * @return - La media de los valores almacenados en un array
	 */
	public static double Media (int[] vector) {
		double suma=0;
		for (int i=0; i<CANT; i++) {
			suma+=vector[i];
		}
		
		return suma/vector.length;
	}
	
	/**
	 * Función que compara y devuelve el mayor valor alamcenado en un array de números enteros
	 * @param v - array de números enteros (int)
	 * @return - El mayor valor almacenado en un array
	 */
	public static int Mayor (int[] v) {
		int max = v[0];
		for (int i=1; i<CANT; i++) {
			if (max<v[i]) {
				max=v[i];
			}
		}
		return max;
	}
	
	/**
	 * Función que compara y devuelve el menor valor alamcenado en un array de números enteros
	 * @param v - array de números enteros (int)
	 * @return - El menor valor almacenado en un array
	 */
	public static int Menor (int[] v) {
		int min = v[0];
		for (int i=1; i<CANT; i++) {
			if (min>v[i]) {
				min=v[i];
			}
		}
		return min;
	}
	
	final static int CANT=10;

	public static void main(String[] args) {
		// Creamos el array vector[]
		int[] vector = new int[CANT];
		
		// Leemos y almacenamos 10 números enteros en vector[]
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce "+CANT+" números enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+(i+1)+"]: ");
				vector[i]=sc.nextInt();
			}
			
		} catch(InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
		
		// Mostramos resultados por pantalla haciendo uso de las funciones
		System.out.println("\nMedia de los valores almacenados: "+Media(vector));
		System.out.println("Mayor valor almacenado: "+Mayor(vector));
		System.out.println("Menor valor almacenado: "+Menor(vector));
		

	}

}
