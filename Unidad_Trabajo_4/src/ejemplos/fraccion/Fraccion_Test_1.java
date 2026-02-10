package ejemplos.fraccion;

public class Fraccion_Test_1 {

	public static void main(String[] args) {
		// Creamos dos fracciones
		Fraccion f1 = new Fraccion();
		Fraccion f2 = new Fraccion(1,4);
		
		f1.setNumerador(5);
		f1.setDenominador(8);
		
		// Mostramos por pantalla las fracciones
		System.out.println("Primera fracción: "+f1);
		System.out.println("Segunda fracción: "+f2);

	}

}
