package ejercicios;

public class Tiempo {

	public static void main(String[] args) {
		// Declaramos e inicializamos la variable t
		int t=7265;
		
		// Declaramos las variables
		int horas=t/3600;
		int resto=t%3600;
		int min=resto/60;
		int segundos=resto%60;
		
		// Imprimimos resultados en pantalla
		System.out.println(horas+"h "+min+"mins "+segundos+"s ");
	}

}
