package repaso;

import java.util.Scanner;

public class Cifrado {

	public static final int CESAR = 3; // Clave a aplicar en el cifrado de cesar
	public static final int ROT13 = 13; // Clave a aplicar en el cifrado de ROT13

	/**
	 * Sustituye cada caracter del mensaje a cifrar por el caracter que ocupa
	 * 'clave' posiciones en el alfabeto cifra solo los caracteres del alfabeto de
	 * la A a la Z(sin ñ) cualquier otro caracter incluidos los espacios en blanco
	 * se copiaran igual sin cifrar considera el alfabeto circular:despues de la Z
	 * continuaria la a
	 * 
	 * @param mensaje (String) mensaje a cifrar
	 * @param clave   (int) clave a aplicar
	 * @return
	 */
	public static String sustitucion(String mensaje, int clave) {
		String criptograma = "";
		int caracter;
		for (int i = 0; i < mensaje.length(); i++) {
			if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z') {
				caracter = mensaje.charAt(i) + clave;
				if ((char) (caracter) > 'Z')
					caracter -= 26;
				criptograma += (char) caracter;
			} else if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
				caracter = mensaje.charAt(i) + clave;
				if ((char) (caracter) > 'z')
					caracter -= 26;
				criptograma += (char) caracter;
			}//en otro caso no se trata de un  caracter en el alfabeto 
			else
				criptograma+=mensaje.charAt(i);
		}
		return criptograma;
	}

	/**
	 * Cifrar ppor la transposicion de riel 
	 * El mensaje se cifra alternando las letras en dos cadenas separadas y concatenando estas dos cadenas
	 * @param mensaje (String) mensaje a mostrar
	 * @return criptograma (String )que se obtiene al aplicar la transposicion de riel 
	 */
	public static String transposicionRiel(String mensaje) {
		String cad1="";
		String cad2="";
		for(int i=0;i<mensaje.length();i++) {
			if(i%2==0)
				cad1+=mensaje.charAt(i);
			else
				cad2+=mensaje.charAt(i);
		}
		return cad1+cad2;
	}

	// Programa principal
	public static void main(String[] args) {
		// leemos por tecaldo un mensaje a cifrar
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el mensaje a cifrar: ");
		String texto = sc.nextLine().toUpperCase();
		sc.close();

		// mostramos el texto plano y los correspondientes criptogramas
		System.out.println("Texto plano: " + texto);
		System.out.println("Critograma (César): " + sustitucion(texto, CESAR));
		System.out.println("Critograma (ROT13): " + sustitucion(texto, ROT13));
		System.out.println("Critograma (T.Riel): "+transposicionRiel(texto));
	}

}
