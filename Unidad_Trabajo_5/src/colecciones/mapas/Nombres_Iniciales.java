package colecciones.mapas;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Nombres_Iniciales {

	final static int CANT = 3;

	public static void main(String[] args) {
		// Pedimos al usuario que introduzca su nombre y dos apellidos
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca "+CANT+" alumnos (nombre + apellido)...");
		String nom="";
		String apell="";
		String nomCompleto="";
		String iniciales="";
		Map<String,String> registroAlumnos = new HashMap<String,String>();
		for (int i=0; i<CANT; i++) {
			System.out.println("Alumno "+(i+1));
			System.out.print("Nombre: ");
			nom = sc.nextLine();
			System.out.print("Apellido: ");
			apell = sc.nextLine();
			System.out.println();
			nomCompleto = nom+" "+apell;
			iniciales = ""+nom.toUpperCase().charAt(0)+apell.toUpperCase().charAt(0);
			registroAlumnos.put(nomCompleto, iniciales);
		}
		sc.close();

		// Mostramos por pantalla los valores introducidos
		// a) Creamos el iterator
		Iterator<Entry<String,String>> i = registroAlumnos.entrySet().iterator();
		
		// b) Recorremos con while
		while(i.hasNext()) {
			Entry<String,String> alum = i.next();
			System.out.println("Nombre: "+alum.getKey()+" - Iniciales: "+alum.getValue());
		}
	}
}
