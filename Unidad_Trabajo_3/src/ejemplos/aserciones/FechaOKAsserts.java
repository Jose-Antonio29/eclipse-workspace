package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FechaOKAsserts {
	
	// Programa principal
	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int anno, mes ,dia;

			// Pedimos la fecha
			System.out.println("Introduce la fecha...");

			System.out.print("Introduce el año: ");
			anno = sc.nextInt();
			assert anno!=0 : "El año introducido no existe.";

			System.out.print("Introduce el mes: ");
			mes = sc.nextInt();
			assert mes>=1 && mes<=12 : "El mes introducido no existe.";

			System.out.print("Introduce el día: ");
			dia = sc.nextInt();
			assert dia>=1 && dia<=FechaOK.diasMes(mes) : "El día introducido no existe.";
			
			System.out.println("La fecha "+dia+"/"+mes+"/"+anno+" es correcta.");

		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto");
		} catch (AssertionError ae) {
			System.err.println(ae.getMessage());
		}finally {
			sc.close();
		}
	}
}
