package ejemplos.Jugador;

public class Jugador {
	

	// Atributos
	private int codigo;
	private String nombre;
	private double altura;
	private int sueldo;
	
	/**
	 * Constructor
	 * @param codigo - Código del jugador
	 * @param nombre - Nombre del jugador
	 * @param altura - Altura del jugador
	 * @param sueldo - Sueldo del jugador
	 */
	public Jugador (int codigo, String nombre, double altura, int sueldo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.altura = altura;
		this.sueldo = sueldo;
	}

	/**
	 * Devuelve el código del jugador
	 * @return tel codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Establece el código del jugador
	 * @param codigo - El código a establecer para el Jugador (int)
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Devuelve el nombre del jugador
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del jugador
	 * @param nombre - El nombre a establecer para el Jugador (String)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la altura del jugador
	 * @return la altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Establece la altura del jugador
	 * @param altura - La altura a establecer para el Jugador (double)
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Devuelve el sueldo del jugador
	 * @return sueldo del jugador
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * Establece el sueldo del jugador
	 * @param sueldo - El sueldo a establecer para el Jugador (int)
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	/**
	 * Muestra por pantalla la información del jugador
	 */
	public void mostrarJugador() {
		System.out.println("Jugador "+codigo+ ": ");
		System.out.println(nombre+", "+altura+"m ---> Salario: "+sueldo+"€\n");
	}

}
