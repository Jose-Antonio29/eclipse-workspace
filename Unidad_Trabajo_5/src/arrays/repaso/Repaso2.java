package arrays.repaso;

public class Repaso2 {
	
	/**
	 * Programa que genere de forma aleatoria dos conjuntos de valores enteros y los almacene cada uno 
	 * en un array. El programa debe indicar cuántos valores comunes almacenan los arrays
	 * (es decir, qué valores aparecen tanto en el primer como en el segundo array).
	 */

	final static int TAM=5;
	final static int LIMIT=10;
	
	/**
	 * Procedimiento que muestra por pantalla los valores almacenados en un array de números enteros
	 * @param V - un array de números enteros
	 */
	public static void mostrar (int[] V) {
		for (int i=0; i<V.length; i++) {
			System.out.print(V[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// Creamos dos arrays con valores aleatorios
		int[] A = new int[TAM];
		int[] B = new int[TAM];
		
		for (int i=0; i<TAM; i++) {
			A[i]=(int)(Math.random()*LIMIT+1);
			B[i]=(int)(Math.random()*LIMIT+1);
		}
		
		// Comprobamos cuantos valores en común tienen los dos arrays 
		int conta=0; 		// Contador de valores coincidentes
		for (int i=0; i<A.length; i++) {
			for (int j=0; j<B.length; j++) {
				if (B[j]==A[i]) {
					conta++;
				}
			}			
		}
		
		// Mostramos los arrays y el resultado por pantalla
		System.out.print("Valores de A: ");
		mostrar(A);
		
		System.out.print("\nValores de B: ");
		mostrar(B);
		
		System.out.println("\n>> Tienen "+conta+" valores en común.");
	}

}
