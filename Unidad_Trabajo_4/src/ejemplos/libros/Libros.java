package ejemplos.libros;

public class Libros {
	
	// Atributos
	private String Titulo;
	private String Autor;
	private int paginas;
	
	
	/**
	 * Constructor
	 * @param titulo - Título del libro
	 * @param autor - Autor del libro
	 * @param paginas - Número de páginas que tiene el libro
	 */
	public Libros(String titulo, String autor, int paginas) {
		super();
		this.Titulo = titulo;
		this.Autor = autor;
		this.paginas = paginas;
	}


	/**
	 * Devuelve el título del libro
	 * @return - El título del libro
	 */
	public String getTitulo() {
		return Titulo;
	}


	/**
	 * Establece el título del libro
	 * @param titulo - El título a establecer para el libro (String)
	 */
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	/**
	 * Devuelve el autor del libro
	 * @return - El autor del libro
	 */
	public String getAutor() {
		return Autor;
	}


	/**
	 * Establece el autor del libro
	 * @param autor - El autor a establecer para el libro (String)
	 */
	public void setAutor(String autor) {
		Autor = autor;
	}


	/**
	 * Devuelve el número de páginas del libro
	 * @return - El número de páginas del libro 
	 */
	public int getPaginas() {
		return paginas;
	}


	/**
	 * Establece el número de páginas del libro
	 * @param paginas - El número de paginas a establecer (int)
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void mostrarLibro () {
		System.out.println("Libro: "+Titulo+", "+Autor+" / Número de páginas: "+paginas+"\n");
	}
	
	
	

}
