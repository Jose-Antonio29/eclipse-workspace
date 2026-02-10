package ejemplos.bucles;

public class Impares1al50 {

	public static void main(String[] args) {
		int num=1;
		while (num<=50) {
			if (num%2!=0) {
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println();
		
		// 2º Forma
		num=1;
		while (num<=50) {
			System.out.print(num+" ");
			num+=2;
		}
		System.out.println();
		
		// 3º Forma
		num=1;
		do {
			System.out.print(num+" ");
			num+=2;
		} while (num<=50);
		System.out.println();
		
		// 4º Forma
		for (num=1; num<=50; num+=2) {
			System.out.print(num+" ");
		}
	
	}
}
