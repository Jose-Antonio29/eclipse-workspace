package ejemplos;

public class Operacion_asignacion_2 {

	public static void main(String[] args) {
		// Declaración e inicialización de variables
		int a=8, b=5;
		
		a+=2;                     // a=a+2;
		System.out.println(a);    // 10
		a-=b;                     // a=a-b;
		System.out.println(a);    // 5
		--b;                      // b=b-1;
		System.out.println(b);    // 4
		b--;                      // b=b-1;
		System.out.println(b);    // 3
		System.out.println(a--);  // 5
		                          // a=a-1;
		System.out.println(a);    // 4
		System.out.println(--a);  // a=a-1;
		                          // 3

	}

}
