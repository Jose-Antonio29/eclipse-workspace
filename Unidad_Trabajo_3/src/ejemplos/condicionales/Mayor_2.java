package ejemplos.condicionales;

public class Mayor_2 {

	public static void main(String[] args) {
		// Declaramos e inicializamos las variables
		int a=(int)(Math.random()*10+1);
		int b=(int)(Math.random()*10+1);
		
		// Comparamos y mostramos el resultado por pantalla
				if (a>b) {
					System.out.println(a+" es mayor que "+b);
				} 
				else if (a==b) {
					System.out.println(a+" es igual a "+b);
				}
				else {
					System.out.println(a+" es menor que "+b);
				}
			}
}
