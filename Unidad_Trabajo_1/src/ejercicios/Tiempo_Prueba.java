package ejercicios;

public class Tiempo_Prueba {
	
	public static void main(String[] args) {
		// Declaramos e inicializamos la variable t
		int t=4000;
		
		// Declaramos las variables
		int horas=t/3600;
		int min=(t%3600)/60;
		int segundos=(t%3600)%60;
		
		// Estructuramos el condicional
		
		if (horas!=0) {
			System.out.println(horas+"h "+min+"mins "+segundos+"s ");
		}
		if ((horas==0)&&(min!=0)) {
			System.out.println(min+"mins "+segundos+"s ");
		}
		if ((horas==0)&&(min==0)) {
			System.out.println(segundos+"s ");
		}
	}

}
