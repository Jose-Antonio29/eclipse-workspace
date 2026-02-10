package ejemplos;

public class Longitudes {

	public static void main(String[] args) {
		// Definición y declaración de datos
		final double PI=3.141592;
		int rad=2;
		
		// Calculamos la longitud de la circunferencia
		double longitud;
		longitud=2*PI*rad;
		
		// Mostramos los resultados
		System.out.println("Longitud de la circunferencia de radio "+rad+": "+longitud);
		
		rad=3;
		longitud=2*PI*rad;
		System.out.println("Longitud de la circunferencia de radio "+rad+": "+longitud);
		
		rad=4;
		longitud=2*PI*rad;
		System.out.println("Longitud de la circunferencia de radio "+rad+": "+longitud);
		
		rad=5;
		longitud=2*PI*rad;
		System.out.println("Longitud de la circunferencia de radio "+rad+": "+longitud);
	}

}
