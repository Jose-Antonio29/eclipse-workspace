package ejemplos;

public class AreaCir {
	
	/**
	 * Función para calcular el área de un círculo
	 * @param rad  -  radio del círculo
	 * @return  -  área del círculo
	 */
	public static double area(int rad) {
		final double PI=3.1416;
		return PI*rad*rad;
	}

	//Programa principal
	public static void main(String[] args) {
		System.out.println("Área de un circulo de radio "+2+": "+area(2));
		System.out.println("Área de un circulo de radio "+3+": "+area(3));
		System.out.println("Área de un circulo de radio "+4+": "+area(4));
		System.out.println("Área de un circulo de radio "+5+": "+area(5));
	}

}
