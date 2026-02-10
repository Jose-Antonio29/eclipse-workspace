package ejercicios;

public class Tiempo2 {

	public static void main(String[] args) {
		// Declaramos e inicializamos la variable t
		int t=7388;
		
		// Declaramos las variables
		int horas=t/3600;
		int min=(t%3600)/60;
		int segundos=(t%3600)%60;
		
		// Imprimimos resultados en pantalla
		System.out.println(horas+"h "+min+"mins "+segundos+"s ");
	}

}
