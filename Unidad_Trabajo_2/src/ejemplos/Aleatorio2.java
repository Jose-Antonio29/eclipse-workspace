package ejemplos;

public class Aleatorio2 {

	/**
	 * Devuelve un número entre 1 y num
	 * @param num límite superior
	 * @return un número entero entre 1 y num
	 */
	public static int aleatorio(int num) {
		int numero=(int)(Math.random()*num+1);
		return numero;
	}
	// Programa principal
	public static void main(String[] args) {
		// Generamos un número aleatorio entre 1 y 10
		System.out.println("Número aleatorio entre 1 y 10: "+aleatorio(10));
		
		// Generamos un número aleatorio entre 1 y 10
		System.out.println("Número aleatorio entre 1 y 50: "+aleatorio(50));
		
		// Generamos un número aleatorio entre 1 y 10
		System.out.println("Número aleatorio entre 1 y 100: "+aleatorio(100));
		
		// Generamos un número aleatorio entre 1 y 10
		System.out.println("Número aleatorio entre 1 y 1000: "+aleatorio(1000));
		
		// Generamos un número aleatorio entre 1 y 10
		System.out.println("Número aleatorio entre 1 y 6: "+aleatorio(6));
	}

}
