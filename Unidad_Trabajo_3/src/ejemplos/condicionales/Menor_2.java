package ejemplos.condicionales;

public class Menor_2 {
		
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
		int a=aleatorio(10); 
		int b=aleatorio(10);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b)+"\n");
		
		a=aleatorio(3);
		b=aleatorio(3);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b)+"\n");
		
		a=aleatorio(100);
		b=aleatorio(100);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b)+"\n");
		
		a=aleatorio(15);
		b=aleatorio(15);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b)+"\n");
		
	    a=aleatorio(30);
	    b=aleatorio(30);
		
		System.out.println("Valores: "+a+" "+b);
		System.out.println("Menor: "+menor(a,b)+"\n");
	

	}

}
