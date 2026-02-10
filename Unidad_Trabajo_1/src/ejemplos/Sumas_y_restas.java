package ejemplos;

public class Sumas_y_restas {

	public static void main(String[] args) {
		// Declaración de variables
		int a, b;
		
		// Inicialización
		a = 1;
		b = 10;
		
		// Declaramos e inicializamos nuevas variables.
		int suma=a+b;
		int resta=a-b;
		
		// Mostramos las variables por pantalla
		System.out.println(suma);
		System.out.println(a+b);
		System.out.println("La suma es: "+suma);
		System.out.println(a+" + "+b+" = "+suma);
		System.out.println("Suma: "+a+b);               //Siempre concadena si en la función hay una cadena de caracteres
		System.out.println("Suma: "+(a+b));             //Aquí resuelve primero la operación porque va dentro de parentesis
		System.out.println("Resta: "+resta);
		System.out.println("Resta: "+(a-b));
		
	}

}
