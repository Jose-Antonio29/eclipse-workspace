package ejemplos.tareasbucles2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int sup=100, inf=1;			// Límite superior e inferior del rango de búsqueda
			int n;						// Variable para almacenar el número que vamos a probar
			int intentos=0;				// Número de intentos realizados
			int opcion;					// Guarda la opción introducida por el usuario     		
			boolean correcto = false;   // TRUE cuando se haya acertado el valor, FALSE mientras no se haya acertado

			// Le decimos al usuario que piense en un número entre 1 y 100
			System.out.println("Piensa en un número entre "+inf+"+ y "+sup+" e intentaré adivinarlo...");

			while (correcto==false) {
				intentos++;
				n=(sup+inf)/2;
				System.out.println("Es el "+n+"?");
				System.out.println("Pulsa:");
				System.out.println("1) Si "+n+" es tu número");
				System.out.println("2) Si "+n+" es MENOR que tu número.");
				System.out.println("3) Si "+n+" es MAYOR que tu número.");
				System.out.print("Opción elegida: ");
				opcion = sc.nextInt();

				switch (opcion) {
				case 1: System.out.println("\nHe acertadooo!!"); 
						System.out.println("He necesitado "+intentos+" intentos.");
						correcto=true; 
						break;
				case 2: inf=n+1; 
						break;
				case 3: sup=n-1; 
						break;
				default: System.out.println("No has introducido una opción válida.");
				}
			}

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		} finally {
			sc.close();
		}


	}

}
