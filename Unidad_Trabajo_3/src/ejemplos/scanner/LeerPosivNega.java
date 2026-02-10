package ejemplos.scanner;

import java.util.Scanner;

public class LeerPosivNega {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Leemos el número entero
			System.out.print("Dime un número entero: ");
			int num = sc.nextInt();
			
			// Comprobamos si es negativo, positivo o 0
			if (num<0) {
				System.out.println(num+ " es negativo");
			} else if (num>0) {
				System.out.println(num+ " es positivo");
			} else
				System.out.println(num);
		} catch (Exception e) {
			System.err.println(">> ERROR!!  Debes introducir un número entero.");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
