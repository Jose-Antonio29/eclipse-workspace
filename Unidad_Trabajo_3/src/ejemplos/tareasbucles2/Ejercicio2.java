package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int n;
			// Pedimos un número entre 1 y 99999
			do {
				System.out.print("Dime un número entre 1 y 99999: ");
				n = sc.nextInt();
			} while (n<1 || n>99999);

			// Guardamos el valor de las unidades, decenas, centenas, millares y decenas de millares
			int u, d, c, m, dm;

			// Unidades
			u=n%10;

			// Decenas
			d=(n/10)%10;

			// Centenas
			c=((n/10)/10)%10;

			// Millares
			m=(((n/10)/10)/10)%10;

			// Decenas de millares
			dm=((((n/10)/10)/10)/10)%10;

			// Comprobamos si es capcicua
			int capi;
			if (dm!=0) {
				capi = u*10000+d*1000+c*100+m*10+dm;
				if (capi==n) {
					System.out.println("Tu número es capicua.");
				} else
					System.out.println("Tu número no es capicua.");
			} else if (m!=0) {
				capi = u*1000+d*100+c*10+m;
				if (capi==n) {
					System.out.println("Tu número es capicua.");
				} else
					System.out.println("Tu número no es capicua.");
			} else if (c!=0) {
				capi = u*100+d*10+c;
				if (capi==n) {
					System.out.println("Tu número es capicua.");
				} else {
					System.out.println("Tu número no es capcicua.");
				} 
			}else if (d!=0) {
				capi = u*10+d;
				if (capi==n) {
					System.out.println("Tu número es capicua.");
				} else
					System.out.println("Tu número no es capicua.");
			} else if (u!=0) {
				System.out.println("Tu número no es capicua");
			}
			
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}

		// Cerramos el scanner
		sc.close();

	}

}
