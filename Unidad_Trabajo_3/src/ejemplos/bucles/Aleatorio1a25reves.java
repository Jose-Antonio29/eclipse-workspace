package ejemplos.bucles;

public class Aleatorio1a25reves {
	
	public static int random() {
		return (int)(Math.random()*25+1);
	}

	public static void main(String[] args) {
		// Contamos desde random a 1 con un bucle WHILE
		int random=random();
		int num=random;
		System.out.println("Contamos de "+random+" a 1 con WHILE");
		
		while (num>=1) {
			System.out.print(num-- +" ");
		}
		System.out.println("\n");
		
		
		
		// Contamos desde random a 1 con un bucle DOWHILE
		num=random;
		System.out.println("Contamos de "+random+" a 1 con DOWHILE");
		do {
			System.out.print(num-- +" ");
		} while (num>=1);
		System.out.println("\n");
		
		
		
		// Contamos desde 1 a random con un bucle FOR
		System.out.println("Contamos de "+random+" a 1 con FOR");
		for (num=random; num>=1; num--) {
			System.out.print(num+" ");
		}
		
		
	}

}
