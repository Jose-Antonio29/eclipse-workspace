package repaso;

import java.util.Scanner;

public class Ahorcado {
	
	/**
	 * Selecciona de forma aleatoria una palabra de un array de palabras
	 * @return String
	 */
	private static String generaPalabra() {
		String array[] = {"PIZARRA","DROMEDARIO","EMPANADILLA","AUSTRALOPITHECUS","ANTICAPITALISMO",
						  "GERIFALTE","EPITAFIO","LINFOCITO","ACELERADORA","FONTANERO","MATASUEGRAS"};
		
		
		return array[(int)(Math.random()*array.length)];
	}
	
	/**
	 * Indica si un carácter está dentro de una cadena o no
	 * @param s (String) Cadena que puede contener o no el carácter
	 * @param c (Char) Carácter comprobado
	 * @return TRUE si está en la cadena, FALSE si no lo está
	 */
	private static boolean acertado(String s, char c) {
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)==c) {
				return true;
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// Informamos sobre el número de letras que tiene la palabra que debe acertar el usuario
		String palabra = generaPalabra();
		System.out.println("Nº de letras de la palabra a acertar: "+palabra.length());
		
		// Pedimos letras al usuario hasta que se agoten sus intentos
		int intentos=10;
		int turnos=0;
		char letra;
		
		Scanner sc = new Scanner(System.in);
		String asteriscos = palabra;
		
		for (int i=0; i<asteriscos.length(); i++) {
			asteriscos=asteriscos.replace(asteriscos.charAt(i), '*');
		}
		
		do {
		System.out.println("\nPalabra a acertar: "+asteriscos);
		System.out.println("Nº de intentos realizados: "+turnos);
		turnos++;
		System.out.println("Nº de intentos restantes: "+intentos);
		intentos--;
		System.out.print("Introduce una letra: ");
		letra = sc.nextLine().toUpperCase().charAt(0);
		
		// Comprobamos si el carácter introducido está en la palabra que se debe acertar,
		// En caso de que lo esté lo reemplazamos 
		if (acertado(palabra,letra)) {
			for (int i=0; i<palabra.length(); i++) {
				if (palabra.charAt(i)==letra) {
					asteriscos=asteriscos.replace(asteriscos.charAt(i), letra);
				}
			}
			System.out.println("¡ACERTASTE! La letra "+letra+" se encuentra en la cadena");
		} else {
			System.out.println("¡OHHHHHHH! La letra "+letra+" no se encuentra en la cadena");
		}
			
		
		} while (intentos>=1);
		sc.close();
	}

}
