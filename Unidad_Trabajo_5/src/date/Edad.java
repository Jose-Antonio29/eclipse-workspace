package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// Creamos la fecha actual y la formateamos para obtener el año, mes y día
		Date hoy = new Date();
		SimpleDateFormat formato;

		// Obtenemos el año actual
		formato = new SimpleDateFormat("yyyy");
		String year = formato.format(hoy);

		// Obtenemos el mes actual
		formato = new SimpleDateFormat("MM");
		String month = formato.format(hoy);

		// Obtenemos el día actual
		formato = new SimpleDateFormat("dd");
		String day = formato.format(hoy);

		// Convertimos cada String a un int con parseInt
		int aHoy = Integer.parseInt(year);
		int mHoy = Integer.parseInt(month);
		int dHoy = Integer.parseInt(day);

		System.out.println("Fecha actual: "+day+"/"+month+"/"+year+"\n");

		// Pedimos al usuario que introduzca su fecha de nacimiento
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduce tu fecha de nacimiento: ");
			System.out.print("  Día: ");
			int d = sc.nextInt();

			System.out.print("  Mes: ");
			int m = sc.nextInt();

			System.out.print("  Año: ");
			int a = sc.nextInt();

			// Calculamos la edad
			int edad = aHoy-a;

			if (mHoy!=m) {
				if (mHoy<m) 
					edad--;	
			} else {
				if (dHoy<d)
					edad--;
			}

			System.out.println("Tienes "+edad+" años.");

		} catch (InputMismatchException ime) {
			System.err.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}
	}
}
