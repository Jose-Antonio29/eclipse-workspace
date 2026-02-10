package strings;

import java.util.Scanner;

public class NombreyApellidos {

	public static void main(String[] args) {
		// 1. Pedimos al usuario que introduzca por teclado su nombre y apellidos
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime tu nombre y apellidos: ");
		String nombre = sc.nextLine();
		sc.close();
		
		// 2. Mostramos por pantalla el nombre y apellidos separados
		int pos = nombre.indexOf(' ');
		
		if (pos==-1) {
			System.out.println("Nombre: "+nombre);
		} else {
			System.out.println("Nombre: "+nombre.substring(0,pos));
			System.out.println("Apellido: "+nombre.substring(pos+1));
		}
		}

}
