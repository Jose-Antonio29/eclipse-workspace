package boletin;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// Declaramos e inicializamos la variable
		int dinero=50, cambio, billetes, monedas, monedas2e, monedas1e;
		
		// Realizamos los cálculos
		cambio=dinero-7;
		billetes=cambio/20;
		monedas=cambio%20;
		monedas2e=monedas/2;
		monedas1e=monedas%2;
		
		// Imprimos resultado en pantalla
		System.out.println("Billetes de 20€: "+billetes);
		System.out.println("Billetes de 10€: "+0);
		System.out.println("Billetes de 5€: "+0);
		System.out.println("Monedas de 2€: "+monedas2e);
		System.out.println("monedas de 1€: "+monedas1e);

	}

}
