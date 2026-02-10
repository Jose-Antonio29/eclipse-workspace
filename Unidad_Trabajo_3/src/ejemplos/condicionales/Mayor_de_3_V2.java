package ejemplos.condicionales;

public class Mayor_de_3_V2 {
	
	/**
	 * Función que calcula un número aleatorio entre 1 y N 
	 * @param N - Límite superior del número
	 * @return  Número aleatorio entre 1 y N
	 */
	public static int aleatorio (int N) {
		return (int)(Math.random()*N+1);
	}
	
	/**
	 * Función que compara y devuelve el mayor valor entre tres valores
	 * @param x - primer valor
	 * @param y - segundo valor
	 * @param z - tercer valor
	 * @return  El mayor valor entre tres valores
	 */
	public static int comparar (int x, int y, int z) {
		if (x>y) {
			if (x>z) {
				return	x;
			}
			else 
				return	z;
		}  else if (y>z) {
			 return y;
		}  else 
			 return z;
		}

	//Programa principal
	public static void main(String[] args) {
		//Declaramos e inicializamos las variables
		int a=aleatorio(10);
		int b=aleatorio(10);
		int c=aleatorio(10);
	
		//Mostramos resultado por pantalla
		System.out.println("Valores: "+a+" "+b+" "+c);
		System.out.println("El mayor es: "+comparar(a,b,c));

	}

}
