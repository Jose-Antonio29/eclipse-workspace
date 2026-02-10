package ejemplos;

public class Operacion_asignacion {

	public static void main(String[] args) {
		// Declaración y asignación
		int a=3, b=5;
		
		a+=b;                 	// a=a+b;
		System.out.println(a);  // 8
		
		a-=b*2;                 // a=a-(b*2);
		System.out.println(a);  // -2
		
		a*=b+1;                 // a=a*(b+1)
		System.out.println(a);  // -12
		
		a/=b*(-1);              // a=a/(b*(-1));
		System.out.println(a);  // 2
		
		a%=b-1;                 // a=a%(b-1);
		System.out.println(a);  // 2
		
	}

}
