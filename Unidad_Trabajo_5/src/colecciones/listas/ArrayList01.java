package colecciones.listas;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		// Creamos una lista de nombres
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		// Insertamos 6 nombres en la lista
		listaNombres.add("Ana");
		listaNombres.add("Rocio");
		listaNombres.add("Miguel");
		listaNombres.add("Juan");
		listaNombres.add("Maya");
		listaNombres.add("Luis");
		
		// Número de nombres de la lista
		System.out.println("Cantidad de nombres en la lista: "+listaNombres.size());
		
		// Eliminimamos un nombre de la lista
		String nom = "Juan";
		if (listaNombres.remove(nom)) {
			System.out.println("El nombre "+nom+" ha sido eliminado de la lista");
		} else {
			System.out.println("No existe el nombre "+nom+" en la lista");
		}	
		
		// Comprobamos si existe un nombre en la lista
		nom = "Sergio";
		if (listaNombres.contains(nom)) {
			System.out.println("SÍ existe el nombre "+nom+" en la lista");
		} else {
			System.out.println("NO existe el nombre "+nom+" en la lista");
		}

	}

}
