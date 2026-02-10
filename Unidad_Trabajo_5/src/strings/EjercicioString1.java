package strings;

import java.util.Scanner;

public class EjercicioString1 {

	public static void main(String[] args) {
		// Pedimos una cadena al usuario
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cadena: ");
		StringBuffer cadena = new StringBuffer(sc.nextLine());
		sc.close();
		
		// Mostramos el resultado por pantalla
		System.out.println("Nombre: "+cadena);
		System.out.println("Nombre invertido: "+cadena.reverse());

	}

}
