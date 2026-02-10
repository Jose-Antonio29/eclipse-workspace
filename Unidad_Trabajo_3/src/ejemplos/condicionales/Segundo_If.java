package ejemplos.condicionales;

public class Segundo_If {

	public static void main(String[] args) {
		// Declaramos e inicializamos variables
		int mates=7, lengua=8;
		
		if (mates >=5 ) {
			if (lengua >= 5) {
				System.out.println("Has aprobado las asignaturas");
			} else {
				System.out.println("Has aprobado solo Matemáticas");
			}
		} else if (lengua >=5) {
			System.out.println("Has aprobado solo Lengua");
		} else {
			System.out.println("No has aprobado ninguna asignatura");
		}
		

	}

}
