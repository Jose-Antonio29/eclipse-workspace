package colecciones.listas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList03 {
	
	/**
	 * Muestra por pantalla los elementos  almacenados en una lista de números enteros
	 * @param l - Una lista de números enteros
	 */
	private static void printList(ArrayList<Integer> l) {
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

	public static void main(String[] args) {
		// Creamos una lista de números enteros
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		// Leemos valores enteros por teclado hasta que se introduzca el 0
		// y los almacenamos en la lista
		Scanner sc = new Scanner(System.in);
		System.out.println("> Introduce números (introduce el 0 para finalizar).");
		try {
			int num;
			int conta=1;
			do {
				System.out.print("Valor "+conta+": ");
				num = sc.nextInt();
				if (num!=0) 
					lista.add(num);	
				conta++;
			} while (num!=0);
			
		} catch (InputMismatchException ime) {
			System.out.println("> ERROR: El tipo de datos introducido no es correcto.");
			System.out.println("> Se finalizará el programa.");
		} finally {
			sc.close();
		}
		
		// Mostramos el tamaño y los elementos de la lista por pantalla
		System.out.println("\n> Número de valores introducidos: "+lista.size());
		System.out.print("> Lista: ");
		printList(lista);
		lista.sort(null);
		System.out.print("\n> Lista ordenada: ");
		printList(lista);
	}

}
