package arrays.ejemplos;

public class Ejem2 {

	public static void main(String[] args) {
		// Array
		int A[] = new int[10];

		// Mostramos la longitud del array
		System.out.println("Longitud: "+A.length);

		// Mostramos los valores contenidos en el array 
		System.out.print("Valores iniciales: ");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}

		// Asignamos nuevos valores que guardaremos en las posiciones del array
		for ( int i=0; i<A.length; i++) {
			A[i]=i+1;
		}

		// Mostramos los valores contenidos en el array 
		System.out.print("\nValores actuales: ");
		for (int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		
		// Mostramos los valores contenidos en el array en orden inverso
		System.out.print("\nValores en orden inverso: ");
		for (int i=A.length-1; i>=0; i--) {
			System.out.print(A[i]+" ");
		}
		
		// Mostramos el primero y el último de los valores alamacenados en el array
		System.out.println("\nPrimer valor: "+A[0]);
		System.out.println("Último valor: "+A[A.length-1]);

	}

}
