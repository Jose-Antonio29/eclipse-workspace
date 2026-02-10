package arrays.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem6 {

	final static int CANT=5;
	
	// Programa principal
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			// Declaramos y creamos el array
			int array[] = new int[CANT];
			
			// Pedimos al usuario que introduzca los valores
			System.out.println("Introduce "+CANT+" valores de tipo entero...");
			for (int i=0; i<array.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=teclado.nextInt();
			}
			
			// Visualizamos los valores
			System.out.println("\nValores introducidos por teclado: ");
			for (int i=0; i<array.length; i++) {
				System.out.print(array[i]+" ");
			}
			
		} catch (InputMismatchException e) {
			System.out.println(">> ERROR: Has introducido un valor incorrecto");
		} catch (ArrayIndexOutOfBoundsException ob) {
			System.out.println(">> ERROR del programador. Ha excedido los límites del array");
		} finally {
			teclado.close();
		}
	}
}
