package ejemplos.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOperaciones {
	
	/**
	 * Programa que calcula una potencia
	 * @param base - Base de la potencia
	 * @param exponente - Exponente de la potencia
	 * @return Devuelve el resultado de la potencia 
	 */
	public static int pot (int base, int exponente) {
		int res=1;
		for (int i=1; i<=exponente; i++) {
			res*=base;
		}
		return res;
	}
	
	
	/**
	 * Procedimiento que muestra un menu de 4 opciones
	 */
	public static void menu() {
		System.out.println("\n-----MENU-----");
		System.out.println("Elige una operación artimética:");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicación");
		System.out.println("4) División");
		System.out.println("5) Potencia");
		System.out.println("6) Salir");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int option, a, b;			// Opción elegida por el usuario
			do {
				// Mostramos el menu
				menu();
				
				do {
					// Leemos la opción elegida por el usuario
					System.out.print("Elige una opción: ");
					option = sc.nextInt();
	
					// Ejecutamos la opción elegida por el usuario
					switch (option) {
					case 1: System.out.println("\nSUMA"); 
							System.out.print("Dime el primer sumando: ");
							a = sc.nextInt();					
							System.out.print("Dime el segundo: ");
							b = sc.nextInt();
							System.out.println(a+" + "+b+" = "+(a+b));
							break;
							
					case 2: System.out.println("\nRESTA");
							System.out.print("Dime el minuendo: ");
							a = sc.nextInt();
							System.out.print("Dime el sustraendo: ");
							b = sc.nextInt();
							System.out.println(a+" - "+b+" = "+(a-b));
							break;
							
					case 3: System.out.println("\nMULTIPLICACIÓN"); 
							System.out.print("Dime el primer multiplicando: ");
							a = sc.nextInt();
							System.out.print("Dime el multiplicando: ");
							b = sc.nextInt();
							System.out.println(a+" X "+b+" = "+(a*b));
							break;
							
					case 4: System.out.println("\nDIVISIÓN"); 
							System.out.print("Dime el dividendo: ");
							a = sc.nextInt(); 
							System.out.print("Dime el divisor: ");
							b = sc.nextInt();
							
							if (b!=0) {
							System.out.println(a+" / "+b+" = "+((float)a/b));	
							} else {
							System.out.println("No se puede dividir entre 0...");
							}
							break;
							
					case 5: System.out.println("\nPOTENCIA"); 
							System.out.print("Dime la base: ");
							a = sc.nextInt(); 
							System.out.print("Dime el exponente: ");
							b = sc.nextInt();
							System.out.println(a+"^"+b+" = "+pot(a,b));
							break;
							
					case 6: System.out.println("Fin de programa... Bye bye!");
							break;
							
					case 7: System.err.println("No has elegido una opción válida.");
				}
				} while (option<1 || option>7); 
			} while (option!=6);

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de datos incorrecto.");
		} finally {
			sc.close();
		
		}		

	}

}
