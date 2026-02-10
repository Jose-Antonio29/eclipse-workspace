package ejemplos.numero;

public class Entero {
	
	// Atributo
	private int numero;

	// Métodos
	
	/**
	 * Constructor
	 */
	Entero() {
		numero=0;
	}
	
	/**
	 * Constructor
	 * @param valor (nº netero)
	 */
	Entero(int valor) {
		numero=valor;
	}

	/**
	 * Devuelve el valor del nº entero almacenado
	 * @return nº entero 
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Establece un valor para el nº entero
	 * @param valor (nº entero)
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Indica si el nº entero es positivo
	 * @return TRUE si 'numero' es positivo, FALSE si 'numero' es negativo
	 */
	public boolean esPositivo() {
		return numero>0;
	}
	
	/**
	 * Indica si el nº entero es el 0
	 * @return TRUE si 'numero' es 0, FALSE si 'numero' no es 0
	 */
	public boolean esCero() {
		return numero==0;
	}
	
	/**
	 * Indica si 'numero' es mayor que el nº pasado como parámetro
	 * @param valor (nº entero)
	 * @return TRUE si es mayor, FLASE si no lo es
	 */
	public boolean esMayor(int valor) {
		return numero>valor;
	}
	
	/**
	 * Calcula el doble de 'numero'
	 * @return El doble de 'numero'
	 */
	public int doble() {
		return numero*2;
	}
	
	/**
	 * Calcula el triple de 'numero'
	 * @return El triple de 'numero'
	 */
	public int triple() {
		return numero*3;
	}
	
	/**
	 * Calcula la mitad de 'numero'
	 * @return La mitad de 'numero'
	 */
	public double mitad() {
		return numero/2.0;
	}
	
	/**
	 * Función que calcula 'numero' elevado a un exponente elegido por el usuario
	 * @param exponente - Exponente para la potencia (int)
	 * @return Resultado de 'numero'^'exponente'
	 */
	public int potencia(int exponente) {
		int pot=numero;
		if (exponente!=0) {
		for (int i=2; i<=exponente; i++) {
			pot*=numero;
		}
		return pot;
		} else
			return 1;
	}
	
	/**
	 * Indica si un número es par o no
	 * @return TRUE si es par, FALSE si no lo es
	 */
	public boolean esPar() {
		return numero%2==0;
	}
	
	/**
	 * Función que indica si un número es primo o no
	 * @return TRUE si es primo, FALSE si no lo es
	 */
	public boolean esPrimo() {
		for (int i=2; i<=numero/2; i++) {
			if (numero%i==0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Función que convierte un int a un double
	 * @return 'numero' (int) convertido a double
	 */
	public double toDouble() {
		return (double)numero;
	}
	
	
	
	
	
	
	

}
