package repaso;

public class FortalezaPassword {
	
	private static void reglasContraseña () {
		System.out.println(" ----------------------------------------------------------------------- ");
		System.out.println("|  Fortaleza de un password:											|");
		System.out.println("|  	  ---> DÉBIL: si contiene menos de 8 caracteres                     |");
		System.out.println("|     ---> MODERADA: si contiene, al menos, 8 caracteres                |");
		System.out.println("|     ---> FUERTE: si contiene como mínimo 8 caracteres y               |");
		System.out.println("| 				   cumple con tres de las siguientes condiciones:       |");
		System.out.println("|					   - 1 minúscula                                    |");
		System.out.println("| 					   - 1 mayúscula");
		System.out.println("| 					   - 1 número (del 0 al 9)");
		System.out.println("|                      - 1 carácter especial");
		System.out.println("|     ---> EXCELENTE: si contiene como mínimo 8 caracteres y");
		System.out.println("|                     cumple con todas las condiciones anteriores");
	}

	public static void main(String[] args) {
		

	}

}
