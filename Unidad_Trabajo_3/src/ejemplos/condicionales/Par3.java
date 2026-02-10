package ejemplos.condicionales;

public class Par3 {
	
	/**
	 * Función que indica si un número entero es par o impar
	 * @param num - valro enter del que queremos determinar si es par o impar
	 * @return TRUE si número es par, FALSE en el otro caso
	 */
	public static boolean esPar (int num) {
		if (num%2==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// Generamos el valor aleatorio entre 1 y 50
		int a=Mayor_de_3_V3.aleatorio(50);
		int b=Mayor_de_3_V3.aleatorio(50);
		int c=Mayor_de_3_V3.aleatorio(50);
		int d=Mayor_de_3_V3.aleatorio(50);
		
		// Indicamos si el número es par o impar
		System.out.println("Valores: "+a+" "+b+" "+c+" "+d);
		System.out.print("PARES: ");
		if (esPar(a))
			System.out.print(a+" ");
		if (esPar(b))
			System.out.print(b+" ");
		if (esPar(c))
			System.out.print(c+" ");
		if (esPar(d))
			System.out.print(d);
	}
}
