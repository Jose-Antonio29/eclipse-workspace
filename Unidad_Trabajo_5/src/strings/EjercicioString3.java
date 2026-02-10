package strings;

import java.util.Scanner;

public class EjercicioString3 {

	public static void main(String[] args) {
		// Pedimos al usuario una cadena y una subcadena
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cadena: ");
		String cadenaOriginal = sc.nextLine();
		System.out.print("¿Qué quieres buscar?: ");
		String subcadena = sc.nextLine();
		sc.close();
		
		// Comprobamos cuantas veces aparece la subacadena dentro de la cadena original
		int posicion = 0;
		int apariciones = 0;
		while (posicion>=0) {
			posicion = cadenaOriginal.indexOf(subcadena, posicion);
			if (posicion >= 0) {
				posicion++;
				apariciones++;
			}
		}
		
		// Mostramos por pantalla el número de apariciones
		System.out.println("Aparece "+apariciones+" veces");
		
		

	}

}
