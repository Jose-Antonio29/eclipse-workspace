package ejemplos.condicionales;

public class Mayor_4 {
	
	/**
	 * Función que devuelve un número entero aleatorio entre 1 y N
	 * @param N - Límite superior
	 * @return - número aleatorio entre 1 y N
	 */
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	/**
	 * Función que devuelve el mayor valor entre dos valores pasados como parámetro
	 * @param x - primer valor(entero)
	 * @param y - segundo valor(entero)
	 * @return - mayor valor entre x e y
	 */
	public static int menor(int x, int y) {
		if (x<y) {
			return x;
		}
	    return y;
	}
	
	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=aleatorio(10), b=aleatorio(10);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b));

	}

}
