package boletín;

public class Ejercicio1 {
	
	final static double PI=3.1416;
	
	/**
	 * Función que calcula el volúmen de un círculo
	 * @param radio - radio del círculo
	 * @return - Volúmen del círculo
	 */
	public static double volumen(int radio) {
		radio=3;
		double Volumen=(4.0/3)*PI*radio*radio*radio;
		return Volumen;
	}

	// Programa principal
	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int radio=3;
		
		// Mostramos resultados en pantalla
		System.out.println("Radio: "+radio);
		System.out.println("Volumen de la esfera: "+volumen(3));
		

	}

}
