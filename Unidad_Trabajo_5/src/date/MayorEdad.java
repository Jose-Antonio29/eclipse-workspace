package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorEdad {

	/**
	 * Determina si una persona es mayor de edad en función a su fecha de nacimiento, pasada como parámatro
	 * Una persona es mayor de eda cuando ya ha cumplido 18 años
	 * @param a - Año de nacimiento
	 * @param m - Mes de nacimiento
	 * @param d - Día de nacimiento
	 * @return TRUE si la persona es mayor de edad, FALSE si no lo es.
	 */
	public static boolean mayorEdad(int a, int m, int d) {
		Date hoy = new Date();

		int y = Integer.parseInt(new SimpleDateFormat("yyyy").format(hoy));
		int mm = Integer.parseInt(new SimpleDateFormat("MM").format(hoy));
		int dd = Integer.parseInt(new SimpleDateFormat("dd").format(hoy));	

		int edad = y-a;
		if (edad<18)
			return false;
		if (edad==18) {
			if (m!=mm) {
				if (mm<m) {
					return false;
				}
			} else
				if (dd<d) {
					return false;
				}
		}
		return true;
	}

	public static void main(String[] args) {
		// Pedimos al usuario que introduzca su fecha de nacimiento
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce tu fecha de nacimiento: ");
			System.out.print("Día: ");
			int d = sc.nextInt();

			System.out.print("Mes: ");
			int m = sc.nextInt();

			System.out.print("Año: ");
			int a = sc.nextInt();

			if (mayorEdad(a,m,d)) {
				System.out.println("Eres mayor de edad");
			} else
				System.out.println("No eres mayor de edad");

		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
	}
}
