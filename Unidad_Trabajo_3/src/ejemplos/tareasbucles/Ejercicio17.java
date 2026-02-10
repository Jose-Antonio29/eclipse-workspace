package ejemplos.tareasbucles;

public class Ejercicio17 {

	public static void main(String[] args) {
		final int ALT=6;
		for (int i=1; i<=ALT; i++) {
			for (int j=ALT-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
