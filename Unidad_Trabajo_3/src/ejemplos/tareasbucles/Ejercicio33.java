package ejemplos.tareasbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int lim, n, total, max, min;
			float numN;
			// Pedimos un valor entero positivo
			do {
				System.out.print("Dime cuántos números quieres introducir: ");
				lim = sc.nextInt();
			} while (lim<1);
			
			System.out.print("Dime el primer valor: ");
			n = sc.nextInt();
			max = min = total = n;
			numN = 1;
			
			for (int i=1; i<=lim-1; i++) {
				System.out.print("Dime otro valor: ");
				n = sc.nextInt();
				
				if (n>max)
					max = n;
				if (n<min)
					min = n;
				
				numN++;
				total+=n;
				
			}
			
			System.out.println("Media de los valores introducidos: "+total/numN);
			System.out.println("Mayor valor introducido: "+max);
			System.out.println("Menor valor introducido: "+min);
			
		} catch (InputMismatchException ime) {
			System.err.println("Debes introducir un valor entero positivo: ");
		}
		
		// Cerramos el scanner
		sc.close();
	}

}
