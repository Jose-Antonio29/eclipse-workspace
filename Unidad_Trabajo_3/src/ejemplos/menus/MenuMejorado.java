package ejemplos.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMejorado {
	
	/**
	 * Procedimiento que muestra un menu de 4 opciones
	 */
	public static void menu() {
		System.out.println("\n-----MENU-----");
		System.out.println("1) Opcion 1");
		System.out.println("2) Opcion 2");
		System.out.println("3) Opcion 3");
		System.out.println("4) Salir");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int option;			// Opción elegida por el usuario

			do {
				// Mostramos el menu
				menu();
				
				do {
				// Leemos la opción elegida por el usuario
				System.out.print("Elige una opción: ");
				option = sc.nextInt();

				// Ejecutamos la opción elegida por el usuario
				switch (option) {
				case 1: System.out.println("Has elegido la opción "+option); break;
				case 2: System.out.println("Has elegido la opción "+option); break;
				case 3: System.out.println("Has elegido la opción "+option); break;
				case 4: System.out.println("Fin de programa... Bye bye!"); break;
				default: System.err.println("La opción elegida no es válida."); break;
				}
				} while (option<1 || option>4); 
			} while (option!=4);

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de datos incorrecto.");
		} finally {
			sc.close();
		
		}		

	}

}
