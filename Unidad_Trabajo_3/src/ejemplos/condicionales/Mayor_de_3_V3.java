package ejemplos.condicionales;

public class Mayor_de_3_V3 {
	
	/**
	 * Función que calcula un número aleatorio entre 1 y N 
	 * @param N - Límite superior del número
	 * @return  Número aleatorio entre 1 y N
	 */
	public static int aleatorio (int N) {
		return (int)(Math.random()*N+1);
	}
	
	/**
	 * Función que compara dos valores y devuelve el mayor de ellos
	 * @param x - primer valor
	 * @param y - segundo valor
	 * @return El mayor valor de los dos
	 */
	public static int comparar(int x, int y) {
		if (x>y) {
			return x;
	    } else {
			return y;
	    }
	}
	
	/**
	 * Función que compara y devuelve el mayor valor entre cuatro valores enteros
	 * @param x - primer valor
	 * @param y - segundo valor
	 * @param z - tercer valor
	 * @param f - cuarto valor
	 * @return  El mayor valor entre tres valores enteros
	 */
	public static int comparar (int x, int y, int z, int f) {
		return comparar(comparar(x,y),comparar(z,f));
	}
		
	//Programa principal
	public static void main(String[] args) {
		//Declaramos e inicializamos las variables
		int a=aleatorio(10);
		int b=aleatorio(10);
		int c=aleatorio(10);
		int d=aleatorio(10);
	
		//Mostramos resultado por pantalla
		System.out.println("Valores: "+a+" "+b+" "+c+" "+d);
		System.out.println("El mayor es: "+comparar(a,b,c,d));
	
	}
}
