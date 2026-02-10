package ejemplos.condicionales;

public class Mayor_3 {
	
	/**
	 * Función que devuelve un número entero aleatorio entre 1 y N
	 * @param N - Límite superior
	 * @return - número aleatorio entre 1 y N
	 */
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int a=aleatorio(10), b=aleatorio(10);
		
		// Comparamos y mostramos el resultado en pantalla
		if (a>b) {
			System.out.println(a+" es mayor que "+b);
		} 
		else if (a==b) {
			System.out.println(a+" es igual a "+b);
		}
		else {
			System.out.println(a+" es menor que "+b);
		}
	}
}
