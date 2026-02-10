package ejemplos.condicionales;

public class Par2 {
	
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
		
		// Indicamos si el número es par o impar
		if (esPar(a)==true) 
			System.out.println(a+" es PAR");
		else
			System.out.println(a+" es IMPAR");
		
		if (esPar(b)==true) 
			System.out.println(b+" es PAR");
		else
			System.out.println(b+" es IMPAR");
		
		if (esPar(c)==true) 
			System.out.println(c+" es PAR");
		else
			System.out.println(c+" es IMPAR");

	}

}
