package ejemplos.condicionales;

public class Par {

	public static void main(String[] args) {
		// Generamos el valor aleatorio entre 1 y 50
		int a=Mayor_de_3_V3.aleatorio(50);
		
		// Indicamos si el número es par o impar
		if (a%2==0) 
			System.out.println(a+" es PAR");
		else
			System.out.println(a+" es IMPAR");
			

	}

}
