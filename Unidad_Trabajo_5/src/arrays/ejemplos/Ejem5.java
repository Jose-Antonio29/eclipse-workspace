package arrays.ejemplos;

public class Ejem5 {

	private static void visualizar(int vector[]) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// 1. Declaramos y creamos el array
		int[] vector = {1, 2, 3, 4, 5, 6, 7, 8};
		
		// 2. Visualizamos el array
		System.out.print("Vector: ");
		visualizar(vector);
		
		// 3. Incrementamos los valores pares y decrementamos los valores impares 
		for (int i=0; i<vector.length; i++) {
			if (vector[i]%2==0) {
				vector[i]++;
			} else {
				vector[i]--;
			}
		}
		
		// 4. Visualizamos el array con las modificaciones 
		System.out.print("\nVector modificado: ");
		visualizar(vector);
		
		// 5. Multiplicamos por 10 los valores impares 
		for (int i=0; i<vector.length; i++) {
			if (vector[i]%2!=0) {
				vector[i]*=10;
			}
		}
		
		// 6. Visualizamos el array con los valores actuales
		System.out.print("\nValores actuales: ");
		visualizar(vector);
	}
}
