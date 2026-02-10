package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			int n,sumaP=0,sumaN=0,ceros=0;
			float numP=0,numN=0;
			
			
			
			for (int i=1; i<=10; i++) {
				System.out.print("Dime un valor: ");
				n = sc.nextInt();
				if (n>0) {
					sumaP+=n;
					numP++;
				} else if (n<0) {
					sumaN+=n;
					numN++;
				} else
					ceros++;
			}
			
			System.out.println();
			if (numP!=0) {
			System.out.println("Media de números positivos introducidos: "+(sumaP/numP));
			} else
				System.out.println("Media de números positivos introducidos: 0");
			
			if (numN!=0) {
			System.out.println("Media de números negativos introducidos: "+(sumaN/numN));
			} else
				System.out.println("Media de números negativos introducidos: 0");
			
			System.out.println("Total de ceros introducidos: "+ceros);
			
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
