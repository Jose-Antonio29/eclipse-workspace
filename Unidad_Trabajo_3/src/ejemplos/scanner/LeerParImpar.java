package ejemplos.scanner;

import java.util.Scanner;

public class LeerParImpar {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		int num;
		try {
			// Leemos el número entero
			System.out.print("Dime un número entero: ");
			num = sc.nextInt();
			
			// Comprobamos si par o impar
			if (num%2!=0) {
				System.out.println(num+" es impar");
			} else
				System.out.println(num+" es par");
		} catch (Exception e) {
			num = 0;
		}
		
		if (num==0) {
			System.err.println(">> ERROR!!  Debes introducir un número entero");
		}		
		
		// Cerramos el scanner
		sc.close();

	}

}
