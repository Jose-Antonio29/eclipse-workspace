package ejemplos;

public class Dado {
	
	/**
	 * Función que devuelve el resultado aleatorio de un dado
	 * @return número de 1 al 6
	 */
	public static int dado() {
		return (int)(Math.random()*6+1);
	}

	public static void main(String[] args) {
		System.out.println("Primera tirada: "+dado());
		System.out.println("Segunda tirada: "+dado());
		System.out.println("Tercera tirada: "+dado());
		System.out.println("Cuarta tirada: "+dado());
		System.out.println("Quinta tirada: "+dado());
	}

}
