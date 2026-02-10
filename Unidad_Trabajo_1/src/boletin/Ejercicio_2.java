package boletin;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables 
		int horas=11, mins=5, segundos=29;
		
		// Realizamos los cálculos
		segundos=(horas*3600)+(mins*60)+segundos;
		
		// Imprimimos resultado por pantalla
		System.out.println("Siendo ahora las 11:05:29 desde que ha empezado el día, llevamos "+segundos+"s de día");
	}

}
