package ejemplos;

public class Doble_y_triple {
	
	public static void main(String[] args) {
		
		// Declaro e inicializo la variable num
		int num=5;
		
		// Declaro las variables que me van a ayudar a hacer los cálculos
		int doble, triple; 
		double mitad;
		
		// Hago los cálculos
		doble=num*2;
		triple=num*3;
		mitad=num/2.0;
		
		// Muestro resultados por pantalla
		System.out.println("El doble de "+num+" es "+doble);
		System.out.println("El triple de "+num+" es "+triple);
		System.out.println("La mitad de "+num+" es "+mitad);
	}
}
