package ejemplos.menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
	
	/**
	 * Procedimiento que muestra por pantalla los números del 1 hasta N
	 * @param n - Número elegido por un usuario
	 */
	public static void cuenta(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
	}
	
	/**
	 * Procedimiento que muestra por pantalla todos los divisores de un número desde el 2 hasta el propio número
	 * @param n - Número elegido por un usuario
	 */
	public static void divisores(int n) {
		for (int i=2; i<=n; i++) {
			if (n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	/**
	 * Procedimiento que muestra por pantalla la tabla de multiplicar de un número
	 * @param n - Número elegido por un usuario
	 */
	public static void tabla(int n) {
		for (int i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
	
	/**
	 * Procedimiento que muestra por pantalla el despliegue de un menu
	 */
	public static void menu () {
		System.out.println("\n---------------MENU----------------");
		System.out.println("Elige una opción:");
		System.out.println("1) Introducir un número N");
		System.out.println("2) Mostrar el número introducido N");
		System.out.println("3) Contar desde 1 hasta N");
		System.out.println("4) Mostrar los divisores");
		System.out.println("5) Mostrar la tabla de multiplicar de N");
		System.out.println("6) Salir");
	}
	
	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int n=0;  		// Número que usará el programa para los cálculos(introducido por el usuario
			int option;		// Opción elegida por el usuario
			do {
				// Mostramos el menu
				menu();
				
				do {
					// Pedimos la opción elegida al usuario
					System.out.print("Opción elegida: ");
					option = sc.nextInt();
					
					switch (option) {
					case 1: // Pedimos N al usuario, N debe ser un número entero positivo
						    do {
						    	System.out.print("Introduce un N entero positivo: ");
						    	n = sc.nextInt();
						    	if (n<=0) {
						    		System.out.println(">>Debe ser un número entero positivo...");
						    	}
						    } while (n<=0);
							break;
					
					case 2: // Mostramos N
							if (n!=0) {
								System.out.println(">>Valor introducido: "+n);
							} else {
								System.err.println("\n>>Primero debes introducir un valor de N.");
							}							
							break;
					
					case 3: // Contamos desde 1 hasta N
							if (n!=0) {
								System.out.print(">>Cuenta desde 1 a "+n+": ");
								cuenta(n);
								System.out.println();
							} else {
								System.err.println("\n>>Primero debes introducir un valor de N.");
							}
							break;
					
					case 4: // Mostramos los divisores de N
							if (n!=0) {
								System.out.print(">>Divisores de "+n+ ": ");
								divisores(n);
								System.out.println();
							} else {
								System.err.println("\n>>Primero debes introducir un valor de N.");
							}
							break;
					
					case 5: // Mostrar la tabla de multiplicar de N
							if (n!=0) {
								System.out.println(">>Tabla de multiplicar de "+n+":");
								tabla(n);
							} else {
								System.err.println("\n>>Primero debes introducir un valor de N.");
							}
							break;
					
					case 6: // Fin de programa
							System.out.println(">>Fin de programa.");
							break;
					}
				} while (option<1 || option>6);
				
			} while (option!=6);
						
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de dato incorrecto.");
		} finally {
			sc.close();
		}		
	}
}
