package colecciones.listas;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// Creamos una lista de números enteros
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		// Añadimos 6 valores a la lista
		lista.add(1);
		lista.add(5);
		lista.add(7);
		lista.add(1);
		lista.add(14);
		lista.add(21);
		lista.add(13);
		
		// Mostramos la lista de valores
		System.out.println("Lista: "+lista);
		
		// Eliminar el valor que ocupa la posición 5 en la lista
		System.out.println("\nEliminamos el valor que ocupa la posición 5 en la lista");
		lista.remove(5);
		System.out.println("Lista: "+lista);

		// Eliminamos el valor 5 de la lista
		System.out.println("\nEliminamos el valor 5 de la lista");
		lista.remove(Integer.valueOf(5));
		System.out.println("Lista: "+lista);
		

	}

}
