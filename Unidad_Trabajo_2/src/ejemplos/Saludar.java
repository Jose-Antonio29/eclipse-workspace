package ejemplos;

public class Saludar {

	/**
	 * Muestra una serie de mensajes por pantalla para saludar
	 * @param nombre  nombre de la persona a la que queremos saludar
	 */
	
	public static void saludar (String nombre) {
		System.out.println("Hola "+nombre);
		System.out.println("Bienvenido al CES Vega Media");
		System.out.println("este curso aprenderás a programar en java");
		System.out.println("Espero que te guste!\n");
	}
	
	// Programa principal
	public static void main(String[] args) {
		saludar("Fran");          // Se denomina llamada
		saludar("Cristobal");
		saludar("Rafa");
		saludar("Mario");
		saludar("Juanjo");
		saludar("Diego");
		saludar("Rocio");
		saludar("Lucía");
		saludar("Javi");

	}
	
	//Comentario de una única línea
	
	/*
	 * Comentario de varias líneas
	 */
	
	/**
	 * Comentario para documentar las funciones
	 */
}

