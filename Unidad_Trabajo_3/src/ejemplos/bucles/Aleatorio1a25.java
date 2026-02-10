package ejemplos.bucles;

public class Aleatorio1a25 {
	
	public static int random() {
		return (int)(Math.random()*25+1);
	}

	public static void main(String[] args) {
		// Declaramos e inicializamos la variable contadora
		int num=1;
		// Contamos desde 1 a random con un bucle WHILE
		int random=random();
		System.out.println("Contamos del 1 al "+random+" con WHILE");
		
		while (num<=random) {
			System.out.print(num++ +" ");
		}
		System.out.println("\n");
		
		
		
		// Contamos desde 1 a random con un bucle DOWHILE
		num=1;
		System.out.println("Contamos del 1 al "+random+" con DOWHILE");
		do {
			System.out.print(num++ +" ");
		} while (num<=random);
		System.out.println("\n");
		
		
		
		// Contamos desde 1 a random con un bucle FOR
		System.out.println("Contamos del 1 al "+random+" con FOR");
		for (num=1; num<=random; num++) {
			System.out.print(num+" ");
		}
		
		
	}

}
