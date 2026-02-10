package ejemplos.scanner;

import java.util.Scanner;

public class Calculos_v2 {

	public static void main(String[] args) {
		// Creamos el lector
		Scanner sc = new Scanner(System.in);
		
		try {
			// Pedimos los números enteros
			System.out.println("Introduce dos números enteros...");
			System.out.print("Primer número: ");
			int num1 = sc.nextInt();
			System.out.print("Segundo número: ");
			int num2 = sc.nextInt();
			
			// Hacemos los cálculos
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			System.out.println(num1+" X "+num2+" = "+(num1*num2));
			if (num2!=0) {
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
			} else {
				System.out.println("No se puede dividir entre 0.");
			}
		} catch (Exception e) {
			System.err.println(">> ERROR!!  Has introducido un valor incorrecto.");
		}
		
		// Cerramos el lector 
		sc.close();
	}

}
