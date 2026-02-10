package ejemplos.scanner;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner teclado = new Scanner(System.in);
		
		// Se pide un dato al usuario
		System.out.print("Por favor, dime tu nombre: ");
		
		// Se lee el nombre con nextLine() que devuelve un String
		String nombre = teclado.nextLine();
		
		// Trabajamos con el dato
		System.out.print("Bienvenido "+nombre+". Por favor, dime tu edad: ");
		
		// Se lee y se guarda la edad con nextInt()
		int edad = teclado.nextInt();
		
		System.out.println
		(nombre+", en 10 años tendrás "+(edad+10)+" años.");
		
		// Le pedimos su nota media
		System.out.print("Dime tu nota media: ");
		float nota = teclado.nextFloat();
		
		System.out.println(nombre+", tu nota media es: "+nota);
		
		// Cerramos el lector
		teclado.close();

	}

}
