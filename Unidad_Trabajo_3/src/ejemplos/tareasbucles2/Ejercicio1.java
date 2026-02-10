package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	final static int I=1;
	final static int FIN=999;

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entre 1 y 999
			do {
				System.out.print("Dime un número entre 1 y 999: ");
				n = sc.nextInt();
			} while (n<I || n>FIN);
			
			// Descomponer el número en unidades (u), decenas (d) y centenas (c)
			int u, d, c;
			
			// Unidades
			u = n%10;
			n/=10;
			
			// Decenas
			d = n%10;
			n/=10;
			
			// Centenas
			c= n;
			
			if (c==0) {
				if (d==0) {
					System.out.println(u);
				} else
					System.out.println(u+""+d);
			} else
				System.out.println(u+""+d+""+c);


		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		} finally {
			// Cerramos el scanner
			sc.close();

		}
	}

}
