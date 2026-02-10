package ejemplos.fraccion;

public class Fraccion {

	// Atributos
	private int numerador;
	private int denominador;

	// Constructores

	/**
	 * Contructor
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
	}

	/**
	 * Constructor
	 * @param numerador
	 */
	public Fraccion(int numerador) {
		this.numerador = numerador;
		this.denominador = 1;
	}
	
	/**
	 * Constructor
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		if (denominador==0) 
			this.denominador = 1;
		else
			this.denominador = denominador;
	}
	
	// Métodos
	
	/**
	 * Devuelve el valor del numerador
	 * @return El valor del numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Devuelve el valor del denominador
	 * @return El valor del denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * Establece el valor del numerador
	 * @param numerador El valor a establecer del numerador
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * Establece el valor del denominador
	 * @param denominador El valor a establecer del denominador
	 */
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	/**
	 * Sumar dos fracciones
	 * @param f Fracción
	 * @return Fracción resultado de la suma
	 */
	public Fraccion sumar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
		aux.denominador = this.denominador * f.denominador;
		return aux;
	}
	
	/**
	 * restar dos fracciones
	 * @param f Fracción 
	 * @return Fracción resultado de la resta
	 */
	public Fraccion restar(Fraccion f) {
		Fraccion aux = new Fraccion();
		aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
		aux.denominador = this.denominador * f.denominador;
		return aux;
	}
	
	/**
	 * Multiplicar dos fracciones
	 * @param f Fracción
	 * @return Fracción resultado de la multiplicación
	 */
	public Fraccion multiplicar(Fraccion f) {
		return (new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador));
	}
	
	/**
	 * Dividir dos fracciones
	 * @param f Fracción
	 * @return Fracción resultado de la división
	 */
	public Fraccion dividir(Fraccion f) {
		return (new Fraccion(this.numerador*f.denominador, this.denominador*f.numerador));
	}
	
	/**
	 * Obtiene el máximo común divisor del numerador y del denominador
	 * Para ello, utilizaremos el algoritmo de Euclides
	 * @return máximo camún divisor (nº entero)
	 */
	public int mcd() {
		int u=Math.abs(numerador);
		int v=Math.abs(denominador);
		if (v==0)
			return u;
		int r;
		while(v!=0) {
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}
	
	/**
	 * Simplifica la fracción haciendo uso del máximo común divisor
	 */
	public void simplificar() {
		int n= mcd(); // Calculamos el máximo común divisor de la fracción
		numerador = numerador/n;
		denominador = denominador/n;
	}
	
	/**
	 * Devuelve una cadena de caracteres que representa la fracción
	 */
	@Override
	public String toString() {
		if (denominador==1)
			return numerador+"";
		return numerador+"/"+denominador;
	}
	
	
	
	
	
	
	
	



}
