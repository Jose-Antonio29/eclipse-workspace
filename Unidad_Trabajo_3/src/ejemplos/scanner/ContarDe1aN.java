package ejemplos.scanner;

import java.util.Scanner;

public class ContarDe1aN {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
		
			// Pedimos el número y leemos la entrada por teclado como número entero
			System.out.print("Dime un valor: ");
			int num = teclado.nextInt();
		
			// Mostramos la cuenta desde el 1 hasta num
			System.out.println("Vamos a contar hasta "+num);
			for (int conta=1; conta<=num; conta++)
				System.out.print(conta+" ");
			
			teclado.close();
		} catch (Exception e) {
			System.err.println(">> ERROR!! Has introducido un valor incorrecto.");
		}
	
	}
		
}
