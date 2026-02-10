package ejemplos.estudiantes;

public class Estudiantes {

	// Atributos
	private String Nombre;
	private int Nota1;
	private int Nota2;
	private int Nota3;


	/**
	 * Constructor
	 * @param nombre - Nombre del alumno
	 * @param nota1 - Primera nota del estudiante
	 * @param nota2 - Segunda nota del estudiante
	 * @param nota3 - Tercera nota del estudiante
	 */
	public Estudiantes(String nombre, int nota1, int nota2, int nota3) {
		Nombre = nombre;
		Nota1 = validarNota(nota1);
		Nota2 = validarNota(nota2);
		Nota3 = validarNota(nota3);
	}


	/**
	 * Devuelve el nombre del estudiante
	 * @return - Nombre del estudiante
	 */
	public String getNombre() {
		return Nombre;
	}


	/**
	 * Establece el nombre del estudiante
	 * @param nombre - El nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	/**
	 * Devuelve la primera nota del estudiante
	 * @return - La primera nota del estudiante
	 */
	public int getNota1() {
		return Nota1;
	}


	/**
	 * Establece la primera nota del estudiante
	 * @param nota1 - La primera nota a establecer
	 */
	public void setNota1(int nota1) {
		this.Nota1 = validarNota(nota1);
	}


	/**
	 * Devuelve la segunda nota del estudiante
	 * @return - La segunda nota del estudiante
	 */
	public int getNota2() {
		return Nota2;
	}


	/**
	 * Establece la segunda nota del estudiante
	 * @param nota2 - La segunda nota a establecer
	 */
	public void setNota2(int nota2) {
		this.Nota2 = validarNota(nota2);
	}


	/**
	 * Devuelve la tercera nota del estudiante
	 * @return - La tercera nota del estudiante
	 */
	public int getNota3() {
		return Nota3;
	}


	/**
	 * Establece la tercera nota del estudiante
	 * @param nota3 - La tercera nota a establecer
	 */
	public void setNota3(int nota3) {
		this.Nota3 = validarNota(nota3);
	}

	/**
	 * Calcula el promedio entre 3 notas
	 * @return El promedio entre 3 notas
	 */
	public double calcularPromedio() {
		return (Nota1+Nota2+Nota3)/3.0; 
	}
	
	/**
	 * Determina si un estudiante ha aprobado o no
	 * @return TRUE si ha aprobado, FALSE si ha suspendido
	 */
	public boolean Aprobado () {
		return calcularPromedio()>=5;
	}

	/**
	 * Valida la nota para que se encuentre entre 0 y 10
	 * @param nota (int) - Nota que queremos validar
	 * @return nota si se encuentra en el rango 0...10, 0 si nota es menor que 0, 10 si la nota es mayor que 10
	 */
	private int validarNota(int nota) {
		if (nota<0) {
			nota=0;
		}
		if (nota>10) {
			nota=10;
		}
		return nota;
	}

	/**
	 * Muestra por pantalla toda la información del estudiante
	 */
	public void mostrarEstudiante(){
		System.out.println("Estudiante: "+Nombre);
		System.out.println("Nota primera evaluación: "+Nota1);
		System.out.println("Nota segunda evaluación: "+Nota2);
		System.out.println("Nota tercera evaluación: "+Nota3);
		System.out.println("Promedio: "+calcularPromedio());
		if (Aprobado()) {
			System.out.println("Este estudiante ha aprobado.");
		} else {
			System.out.println("Este estudiante ha suspendido. Debe presentarse a la recuperación.");
		}
		System.out.println();
	}
}
