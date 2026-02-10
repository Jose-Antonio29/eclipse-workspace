package ejemplos.aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FechaOK {
	
	/**
	 * Función que devuelve la cantidad de días que tiene un mes.
	 * Enero(mes 1), marzo (3), mayo (5), julio(7), agosto(8), octubre(10), diciembre(12) tiene 31 días.
	 * Abril (4), junio(6), septiembre(9), noviembre(11) tienen 30 días.
	 * Febrero (2) tiene 28 días. No vamos a considerar años bisiestos.
	 * @param mes - Número correspondiente al mes: 1 enero, 2 febrero, 3 marzo......, 12 diciembre.
	 * @return La cantidad de días en un mes.
	 */
	public static int diasMes (int mes) {
		int numdias=31;
		
		if (mes==2) {
			numdias=28;
		}
		
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			numdias=30;
		}
		return numdias;
	}
	
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
			if (anno==0) {
				System.err.println("El año introducido no existe.");
			} else {
				System.out.print("Introduce el mes: ");
				mes = sc.nextInt();
				if (mes<1 || mes>12) {
					System.err.println("El mes introducido es incorrecto.");
				} else {
					System.out.print("Introduce el día: ");
					dia = sc.nextInt();
					if (dia<1 || dia>diasMes(mes)) {
						System.err.println("El día introducido no existe.");
					} else {
						System.out.println("La fecha "+dia+"/"+mes+"/"+anno+" es correcta.");
					}
				}
			}
		} catch (InputMismatchException ime) {
			System.err.println("Tipo de valor incorrecto");
		} finally {
			sc.close();
		}



	}

}
