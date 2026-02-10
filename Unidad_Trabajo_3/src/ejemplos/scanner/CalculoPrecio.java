package ejemplos.scanner;

import java.util.Scanner;

public class CalculoPrecio {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos el precio inicial
			System.out.print("Precio (€): ");
			double pi = sc.nextDouble();
			
			// Pedimos el descuento
			System.out.print("Descuento (%): ");
			int desc = sc.nextInt();
			
			// Mostramos precio final
			double fin = pi-(pi*desc/100);
			System.out.print("Precio final (€): "+fin+"€");
			
		} catch (Exception e){
			System.err.println(">> ERROR!!  Ha introducido el valor incorrecto.");
		}
		
		
		// Cerramos el scanner
		sc.close();

	}

}
