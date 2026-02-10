package ejemplos.tareasCondicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void valor (int v) {
		int b200, b100, b50, b20, b10, b5, resto;
		// Calculamos billetes de 200
		b200 = v/200;
		resto = v%200;

		// Calculamos billetes de 100
		b100 = resto/100;
		resto = resto%100;

		// Calculamos billetes de 50
		b50 = resto/50;
		resto = resto%50;

		// Calculamos billetes de 20
		b20 = resto/20;
		resto = resto%20;

		// Calculamos billetes de 10
		b10 = resto/10;
		resto = resto%10;

		// Calculamos billetes de 5
		b5 = resto/5;
		resto = resto%5;

		// Mostramos resultados
		if (b200>0 && b200!=1) {
			System.out.println(b200+" billetes de 200€.");
		} else if (b200==1) 
			System.out.println(b200+" billete de 200€.");

		if (b100>0 && b100!=1)  {
			System.out.println(b100+" billetes de 100€.");
		} else if (b100==1) 
			System.out.println(b100+" billete de 200€.");

		if (b50>0 && b50!=1) {
			System.out.println(b50+" billetes de 50€.");
		} else if (b50==1) 
			System.out.println(b50+" billete de 200€.");

		if (b20>0 && b20!=1) {
			System.out.println(b20+" billetes de 20€.");
		} else if (b20==1) 
			System.out.println(b20+" billete de 200€.");

		if (b10>0 && b10!=1) {
			System.out.println(b10+" billetes de 10€.");
		} else if (b10==1) 
			System.out.println(b10+" billete de 200€.");

		if (b5>0 && b5!=1) {
			System.out.println(b5+" billetes de 5€.");
		} else if (b5==1) 
			System.out.println(b5+" billete de 200€.");

		if (resto>0) 
			System.out.println("Resto: "+resto+"€");
		
	}

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		try {
			// Pedimos el valor exacto
			System.out.print("Dime el valor exacto de un producto: ");
			int v = sc.nextInt();

			// Calculamos cantidad de billetes
			if (v<=0) {
				System.err.println("El valor debe ser mayor que 0");
			} else
				valor(v);

		} catch (InputMismatchException e) {
			System.err.println("Valor introducido incorrecto.");
		}

		//Cerramos el Scanner
		sc.close();

	}

}
