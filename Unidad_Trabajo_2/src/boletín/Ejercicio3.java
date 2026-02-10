package boletín;

public class Ejercicio3 {
	
	/**
	 * Función que calcula el precio rebajado de un producto
	 * @param precio - coste original del producto
	 * @param dscnto - descuento aplicado sobre el precio total
	 * @return - precio rebajado
	 */
	public static double rebaja(double precio, int dscnto) {
		double rebaja=precio-(precio*dscnto/100);
		return rebaja;
	}
	
	// Programa principal
	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		double precio=85;
		int descuento=30;
		
		// Mostramos resultados en pantalla
		System.out.println("Precio (€): "+precio);
		System.out.println("Descuento (%): "+descuento);
		System.out.println("Precio rebajado (€): "+rebaja(precio,descuento));
		

	}

}
