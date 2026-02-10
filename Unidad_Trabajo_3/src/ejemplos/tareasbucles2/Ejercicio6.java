package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	
	final static int ALUM=5;

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int e, sumaEdad=0, mayores=0, altos=0;
			float a, sumaAlt=0;
			// Pedimos la edad y la altura de 5 alumnos
			for (int i=1; i<=ALUM; i++) {
				
				do {
				System.out.print("("+i+") Dime tu edad: ");
				e = sc.nextInt();
				sumaEdad+=e;
				if (e>=18) 
					mayores++;
				} while (e<12);

				do {
				System.out.print("("+i+") Dime tu altura: ");
				a = sc.nextFloat();
				sumaAlt+=a;
				if (a>1.75)
					altos++;
				} while (a <1.3);
				
			}
			System.out.println("Edad media: "+(sumaEdad/ALUM));
			System.out.println("Estatura media: "+(sumaAlt/ALUM));
			System.out.println("Alumnos mayores de 18: "+mayores);
			System.out.println("Alumnos más altos que 1,75: "+altos);

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		}


		// Cerramos el scanner
		sc.close();

	}

}
