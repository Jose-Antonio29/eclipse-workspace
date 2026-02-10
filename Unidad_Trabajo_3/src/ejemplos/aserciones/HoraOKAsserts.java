package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HoraOKAsserts {

	public static void main(String[] args) {
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);

		try {
			int h, min, s;
			// Pedimos horas, minutos y segundos
			System.out.println("Introduce la hora...");
			
			System.out.print("Dime la hora: ");
			h = sc.nextInt();
			assert h >=0 && h<=23 : "> Horas fuera del rango permitido";
			
			System.out.print("Dime los minutos: ");
			min = sc.nextInt();
			assert min >=0 && min<=59 : "> Minutos fuera del rango permitido";
			
			System.out.print("Dime los segundos: ");
			s = sc.nextInt();
			assert s>=0 && s<=59 : "> Segundos fuera del rango permitido";
			
			System.out.println("La hora es correcta.");
			
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto.");
		} catch (AssertionError ae) {
			System.err.println(ae.getMessage());					
		}	finally {
			sc.close();
		}
	}
}