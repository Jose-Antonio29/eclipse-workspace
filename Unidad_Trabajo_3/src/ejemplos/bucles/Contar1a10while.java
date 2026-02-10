package ejemplos.bucles;

public class Contar1a10while {

	public static void main(String[] args) {
		// Declaramos e inicializamos la variable contadora (contador)
		int conta=1;
		
		// Mostramos la cuenta del 1 al 10
		System.out.println("Contamos del 1 al 10:");
		while (conta<=10) {
			System.out.print(conta++ +" ");
			
		}
		
		// Mostramos la cuenta del 10 al 1
		conta=10;
		System.out.println("\n\nContamos del 10 al 1:");
		while (conta>=1) {
			System.out.print(conta-- +" ");
			
		}


	}
}
