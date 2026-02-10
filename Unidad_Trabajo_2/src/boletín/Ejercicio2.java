package boletín;

public class Ejercicio2 {
	
	/**
	 * Función que calcula total de segundos en una hora
	 * @param h - número de horas
	 * @param min - número de minutos
	 * @param s - número de segundos inicial
	 * @return - total de segundos
	 */
	public static int segundos(int h, int min, int s) {
		int totalseg=h*3600+min*60+s;
		return totalseg;
	}
	
	// Programa principal
	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int h=10, min=15, s=50;
		
		// Mostramos resultado por pantalla;
		System.out.println("Hora: "+h+":"+min+":"+s);
		System.out.println("Total segundos: "+segundos(h,min,s));
		
	}

}
