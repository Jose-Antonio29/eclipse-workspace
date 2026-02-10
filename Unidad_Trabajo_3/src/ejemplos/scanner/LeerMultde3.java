package ejemplos.scanner;

import java.util.Scanner;

public class LeerMultde3 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		int num;
		
		try {
			
			// Leemos el número entero
			System.out.print("Dime un número entero: ");
			num = sc.nextInt();
			
			// Comprobamos si es múltiplo de 3
			if (num%3==0) {
				System.out.println(num+" es múltiplo de 3.");
			} else 
				System.out.println(num+ " no es múltiplo de 3.");
			
		} catch (Exception e) {
			num = 0;
		}
		
		if (num==0)
			System.err.println(">> ERROR!!   Debes introducir un número entero.");
		
		// Cerramos el scanner
		sc.close();
		

	}

}
