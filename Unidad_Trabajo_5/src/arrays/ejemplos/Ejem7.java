package arrays.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejem7 {
	
	final static int CANT=5;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			// Declaramos y creamos el array
			int array[] = new int[CANT];
			
			// Pedimos el primer valor 
			System.out.println("Introduce "+CANT+" valores de tipo entero...");
			System.out.print("Valor[1]: ");
			array[0] = teclado.nextInt();
			int mayor = array[0];
			
			// Pedimos al usuario que introduzca los valores
			for (int i=1; i<array.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=teclado.nextInt();
				
				// Comparamos y vemos cual es el mayor valor
				if (array[i]>mayor) {
					mayor=array[i];
				}
			}
			
			// Visualizamos los valores
			System.out.print("\nValores introducidos por teclado: ");
			for (int i=0; i<array.length; i++) {
				System.out.print(array[i]+" ");
			}
			
			// Mostramos cual es el mayor valor
			System.out.println("\nEl mayor valor es: "+mayor);
			
		} catch (InputMismatchException e) {
			System.out.println(">> ERROR: Has introducido un valor incorrecto");
		} catch (ArrayIndexOutOfBoundsException ob) {
			System.out.println(">> ERROR del programador. Ha excedido los límites del array");
		} finally {
			teclado.close();
		}

	}

}
