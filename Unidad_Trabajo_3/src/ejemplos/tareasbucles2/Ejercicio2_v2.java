package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2_v2 {

	/**
	 * Función que comprueba si un número es capicua o no (solo para números entre 1 y 5 dígitos)
	 * @param n - Número que comprueba si es capicua o no
	 * @return TRUE si es capicua, FALSE si no es capicua
	 */
	public static boolean capi (int n) {
		// Guardamos el valor de las unidades, decenas, centenas, millares y decenas de millares
		int u, d, c, m, dm;

		// Unidades
		u=n%10;

		// Decenas
		int num = n/10;
		d=num%10;

		// Centenas
		num/=10;
		c=num%10;

		// Millares
		num/=10;
		m=num%10;

		// Decenas de millares
		num/=10;
		dm=num%10;

		// Si el número es de cinco cifras (dm,m,c,d,u)
		if (dm==u && m==d) 
			return true;
		
		// Si el número es de cuatro cifras (m,c,d,u)
		if (dm==0 && m==u && c==d)
			return true;
		
		// Si el número es de tres cifras (c,d,u)
		if (dm==0 && m==0 && c==u)
			return true;
		
		// Si el número de dos cifras (d,u)
		if (dm==0 && m==0 && c==0 && d==u)
			return true;
		
		return false;
		
	}

	
	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos 

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
