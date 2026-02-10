package ejemplos.estudiantes;

public class Estudiantes_Test {

	public static void main(String[] args) {
		// Creamos los objetos Estudiantes
		Estudiantes e = new Estudiantes("Harry Potter", 7, 6, 8);
		
		e.mostrarEstudiante();
		
		// Modifiacmos las notas y mostramos resultado actualizado
		e.setNota1(9);
		e.setNota2(e.getNota2()+1);		// Subimos un punto
		e.setNota3(e.getNota3()-1); 	// Bajamos un punto
		
		e.mostrarEstudiante();
	}

}
