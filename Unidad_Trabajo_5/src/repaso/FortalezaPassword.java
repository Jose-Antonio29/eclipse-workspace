package repaso;

import java.util.Scanner;

public class FortalezaPassword {
	
	private static void reglasContraseña () {
		System.out.println(" ----------------------------------------------------------------------------------- ");
		System.out.println("|  Fortaleza de un password:                                                        |");
		System.out.println("|     ---> DÉBIL: si contiene menos de 8 caracteres                                 |");
		System.out.println("|     ---> MODERADA: si contiene, al menos, 8 caracteres                            |");
		System.out.println("|     ---> FUERTE: si contiene como mínimo 8 caracteres y                           |");
		System.out.println("|                     cumple con tres de las siguientes condiciones:                |");
		System.out.println("|                      - 1 minúscula                                                |");
		System.out.println("|                      - 1 mayúscula                                                |");
		System.out.println("|                      - 1 número (del 0 al 9)                                      |");
		System.out.println("|                      - 1 carácter especial                                        |");
		System.out.println("|     ---> EXCELENTE: si contiene como mínimo 8 caracteres y                        |");
		System.out.println("|                     cumple con todas las condiciones anteriores                   |");
		System.out.println(" -----------------------------------------------------------------------------------");
	}
	
	/**
	 * Indica si el carácter es una letra minúscula de la 'a' a la 'z'
	 * @param c (char) El carácter comprobado
	 * @return TRUE si es una letra minúscula, FALSE si no lo es
	 */
	private static boolean esMin(char c) {
		if (c>='a' && c<='z') {
			return true;
		}
		return false;
	}
	
	/**
	 * Indica si el carácter es una letra mayúscula de la 'A' a la 'Z'
	 * @param c (char) El carácter comprobado
	 * @return TRUE si es una letra mayúscula, FALSE si no lo es
	 */
	private static boolean esMayus(char c) {
		if (c>='A' && c<='Z') {
			return true;
		}
		return false;
	}
	
	/**
	 * Indica si el carácter es un número
	 * @param c (char) El carácter comprobado
	 * @return TRUE si es un número, FALSE si no lo es
	 */
	private static boolean esNum(char c) {
		if (c>='0' && c<='9') {
			return true;
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// 1. Mostramos una ayuda con la definición de la fortaleza
		reglasContraseña();
		
		// 2. Pedimos al usuario que introduzca una contraseña
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce password: ");
		String password = sc.nextLine();
		sc.close();
		
		// 3. Comprobamos la fortaleza de la contraseña
		System.out.print("---> Fortaleza del password: ");
		// 3.1. Si la longitud de la contraseña es menor de 8 caracteres, es DÉBIl
		if (password.length()<8) {
			System.out.println("DÉBIL");
		} else {
			// 3.2. En otro caso, recorremos carácter a carácter el String introducido
		    //		contando minúsculas, mayúsculas, números y otros caracteres
			char c;
			int contaMin, contaMay, contaNum, contaEtc;
			contaMin=contaMay=contaNum=contaEtc=0;
			
			for (int i=0; i<password.length(); i++) {
				c=password.charAt(i);
				if(esMin(c)) {
					contaMin++;
				} else if (esMayus(c)) {
					contaMay++;
				} else if (esNum(c)) {
					contaNum++;
				} else
					contaEtc++;
			}
			
			int cumplidos=0;
			if (contaMin>=1) cumplidos++;
			if (contaMay>=1) cumplidos++;
			if (contaNum>=1) cumplidos++;
			if (contaEtc>=1) cumplidos++;
			
			// 3.3. Informamos sobre la fortaleza de la contraseña según las reglas que cumple
			if (cumplidos>3) {
				System.out.println("EXCELENTE");
			} else if (cumplidos==3) {
				System.out.println("FUERTE");
			} else
				System.out.println("MODERADA");
		}
		
		
		

	}

}
