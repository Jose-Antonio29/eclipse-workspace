package arrays.ordenacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo {

	public static void bubblesort (int array[]) {
		int aux;
		boolean cambio;		// Tomará el valor TRUE cuando se produzca un intercambio
		// Damos tantas pasadas como posiciones tenga el array
		for (int i=array.length; i>0; i--)  {
			cambio=false;
			for (int j=0; j<i-1; j++) {
				if (array[j]>array[j+1]) {
					// Intercambio de valores
					aux = array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}

			}
			if (!cambio) 
				return;
		}
	}

	public static void mostrar (int[] v) {
		for (int i=0; i<CANT; i++) {
			System.out.print(v[i]+" ");
		}
	}

	final static int CANT=10;

	public static void main(String[] args) {
		// Creamos un array A[]
		int[] A = new int[CANT];

		// Leemos y almacenamos los valores de A[]
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce "+CANT+" valores enteros...");
			for (int i=0; i<CANT; i++) {
				System.out.print("Valor ["+i+"]: ");
				A[i]=sc.nextInt();
			}

		} catch(InputMismatchException ime) {
			System.out.println(">> ERROR: El tipo de datos introducido no es correcto.");
		} finally {
			sc.close();
		}

		// Mostramos los valores de A[]
		System.out.print("Valores de A: ");
		mostrar(A);

		// Mostramos los valores de A[] ordenados
		bubblesort(A);
		System.out.print("\nValores de A ordenados: ");
		mostrar(A);
	}

}
