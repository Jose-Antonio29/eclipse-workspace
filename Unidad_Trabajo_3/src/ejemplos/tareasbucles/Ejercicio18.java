package ejemplos.tareasbucles;

public class Ejercicio18 {

	public static void main(String[] args) {
		final int ALT=8;
		for (int i=1; i<=ALT; i++) {
			for (int j=ALT-1; j>=i; j--) {
				System.out.print(" ");
			}

			for (int k=1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
