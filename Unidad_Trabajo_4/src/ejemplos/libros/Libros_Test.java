package ejemplos.libros;

public class Libros_Test {

	public static void main(String[] args) {
		// Creamos los onjetos Libro
		Libros lib1 = new Libros("Don Quijote de la Mancha", "Miguel de Cervantes", 830);
		Libros lib2 = new Libros("1984", "George Orwell", 545);
		Libros lib3 = new Libros("El retrato de Dorian Gray", "Oscar Wilde", 450);
		
		
		// Aumentamos en 100 el número de páginas de cada libro
		lib1.setPaginas(lib1.getPaginas()+100);
		lib2.setPaginas(lib2.getPaginas()+100);
		lib3.setPaginas(lib3.getPaginas()+100);
		
		// Mostramos la información actualizada
		lib1.mostrarLibro();
		lib2.mostrarLibro();
		lib3.mostrarLibro();
		
		

	}

}
