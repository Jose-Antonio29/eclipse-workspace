package arrays.ordenacion;

public class Ejercicio7B {
	
	// Constantes comunes
	final static int TAM = 100;
	final static int LIMIT = 100;
	
	// Variables comunes
	static int[] lista;			// Array global
	
	/**
	 * Procedimiento que imprime por pantalla los valores almacenados en un array
	 */
	public static void mostrar () {
		for (int i=0; i<lista.length; i++) {
			System.out.print(lista[i]+" ");
		}
	}
	
	/**
	 * Procedimiento que ordena los valores almacenados en un array de números enteros 
	 */
	public static void bubblesort () {
		int aux;
		boolean cambio;
		for (int i=lista.length; i>0; i--) {
			cambio=false;
			for (int j=0; j<i-1; j++) {
				if (lista[j]>lista[j+1]) {
					aux = lista[j+1];
					lista[j+1]=lista[j];
					lista[j]=aux;
					cambio=true;
				}
			}
			if (!cambio) {
				return;
			}
		}
	}
	
	/**
	 * Funciónq que comprueba si un valor entero N se encuantra en un array
	 * Requisito: el array debe estar ordenado
	 * @param N - un número entero
	 * @return TRUE si N está entre los valores almacenados en el array, FALSE si no lo está
	 */
	public static boolean encuentra (int N) {
		for (int i=0; i<lista.length; i++) {
			if(N==lista[i]) 
				return true;
			if(N<lista[i])
				return false;
		}
		return false;
	}

	// Programa principal
	public static void main(String[] args) {
		// Creamos un array A[] de tamaño 100 y que contenga números entre el 1 y el 100
		lista = new int[TAM];
		
		for (int i=0; i<lista.length; i++) {
			lista[i]=(int)(Math.random()*LIMIT+1);
		}
		
		// Ordenamos y mostramos los valores de A[]
		System.out.print("Valores de A desordenados:\n");
		mostrar();
		bubblesort();
		System.out.print("\n\nValores de A ordenados:\n");
		mostrar();
		
		// Buscamos y mostramos los valores que no se han almacenado entre 1 y 100
		System.out.println("\n\nValores no almacenados en A:");
		for (int num=1; num<=LIMIT; num++) {
			if (!encuentra(num)) {
				System.out.print(num+" ");
			}
		}
	}
}
