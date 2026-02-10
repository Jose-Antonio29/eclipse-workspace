package strings;

import java.util.Scanner;

public class EjercicioString2 {

	public static void main(String[] args) {
		// Pedimos una cadena al usuario
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cadena: ");
		StringBuffer cadena = new StringBuffer(sc.nextLine());
		sc.close();
		
		// Mostramos la cadena espejada por pantalla
		System.out.println("Cadena espejada: "+cadena+cadena.reverse().delete(0, 1));

	}

}
