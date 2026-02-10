package ejemplos.equipo;

public class Equipo {

	// Atributos
	public int codigo;
	public String nombre;
	public String ciudad;
	public String pabellon;
	
	
	/**
	 * Constructor
	 * @param codigo
	 * @param nombre
	 * @param ciudad
	 * @param pabellon
	 */
	public Equipo(int codigo, String nombre, String ciudad, String pabellon) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pabellon = pabellon;
	}


	/**
	 * Muestra el código del equipo
	 * @return el codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * Establece el código del equipo
	 * @param codigo - El codigo a establecer para el Equipo (int)
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * Muestra el nombre del equipo
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * Establece el nombre del Equipo
	 * @param nombre - El nombre a establecer para el Equipo (String)
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Muestra la ciudad del Equipo
	 * @return la ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}


	/**
	 * Establece la ciudad del Equipo
	 * @param ciudad - La ciudad a establecer para el Equipo (String)
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * Muestra el pabellon del equipo
	 * @return el pabellon
	 */
	public String getPabellon() {
		return pabellon;
	}


	/**
	 * Establece el pabellon del Equipo
	 * @param pabellon - El pabellon a establecer para el equipo (String)
	 */
	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}
	
	/**
	 * Muestra los datos de los Equipos
	 */
	public void mostrarEquipo() {
		System.out.println("Equipo "+codigo+": ");
		System.out.println(nombre+", "+ciudad+", "+pabellon);
	}

	
}
