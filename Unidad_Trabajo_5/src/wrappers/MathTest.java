package wrappers;

public class MathTest {

	public static void main(String[] args) {
		int a = 5, b = 8;
		
		// Menor y mayor
		System.out.println("Mayor ("+a+","+b+"): "+Math.max(a, b));
		System.out.println("Menor ("+a+","+b+"): "+Math.min(a, b));
		
		// Potencias
		System.out.println("\nCuadrado de "+a+": "+Math.pow(a, 2));
		System.out.println("Cubo de "+a+": "+Math.pow(a, 3));
		
		// Números aleatorios
		System.out.print("\nNúmero aleatorio entre 1 y 100: ");
		System.out.println((int)(Math.random()*100+1));
		System.out.print("Número aleatorio entre 0 y a: ");
		System.out.println(Math.round(Math.random()*a));
		
		// Área de un círculo
		int radio = 3;
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("\nÁrea de un círculo de radio "+radio+": "+area);

	}

}
