package ejemplos.bucles;

public class Contar1a10dowhile {

	public static void main(String[] args) {
		// Declaramos la variable contadora
		int conta;
		
		// Mostramos la cuenta del 1 al 10
		System.out.println("Cuenta del 1 al 10: ");
		conta=1;
		do {
			System.out.print(conta++ +" ");
		} while (conta<=10);
		
		// Mostramos la cuenta del 10 al 1
		System.out.println("\n\nCuenta del 10 al 1: ");
		conta=10;
		do {
			System.out.print(conta-- +" ");
		} while (conta>=1);

	}

}
