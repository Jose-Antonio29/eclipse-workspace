package ejemplos.condicionales;

public class Primer_If {

	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int a=5;
		
		// Ejemplo de condicional simple
		if (a==5) {
			System.out.println("La variable es igual a 5");
		}
		
		// Ejemplo de condicional compuesto
		if (a>6) {
			System.out.println("La variable es mayor que 6");
		} 
		else {
				System.out.println("La variable es menor que 7");
			}
		
		// Ejemplo de condicional anidado
		if (a>6) {
			System.out.println("La variable es mayor que 6");
		}  
		else if (a==6) {
				System.out.println("La variable es menor que 7");
			}
		else {
			System.out.println("La variable es menor que 6");
		}
	}
}
