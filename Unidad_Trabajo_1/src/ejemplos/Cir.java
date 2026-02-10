package ejemplos;

public class Cir {

	public static void main(String[] args) {
		// Declaramos e inicializamos los datos que necesitamos
		int radio=3;
		final double PI=3.141592;
		
		// Calculamos la longitud de una circunferencia 
		double longitud;
		longitud=2*PI*radio;
		
		// Calculamos el área de un circulo
		double area;
		area=PI*radio*radio;
		
		// Mostramos en pantalla los resultados
		System.out.println("La longitud de una circunferencia con radio "+radio+ " es "+longitud);
		System.out.println("El área de un círculo con radio "+radio+" es "+area);
		

	}

}
