package ejemplos.tareasbucles;

public class Ejercicio16 {



	public static void main(String[] args) {
		final int ALT=4;
		for (int i=0; i<=ALT-1; i++) {
			for (int j=ALT-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
