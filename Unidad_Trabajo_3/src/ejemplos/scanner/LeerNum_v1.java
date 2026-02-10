package ejemplos.scanner;

import java.util.Scanner;

public class LeerNum_v1 {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner teclado = new Scanner(System.in);
		
		try {
			// Leemos desde el teclado un número con decimales
			System.out.print("Dime un valor con decimales: ");
			float num = teclado.nextFloat();
			
			// Mostramos por pantalla el valor introducido
			System.out.println("Has introducido el valor: "+num);
			
		} catch (Exception e) {
			System.err.println(">> Debes introducir un valor con decimales!");
		}
		
		// Cerramos el lector
		teclado.close();
		

	}

}
