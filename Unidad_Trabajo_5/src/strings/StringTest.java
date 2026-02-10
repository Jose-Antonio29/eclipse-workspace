package strings;

public class StringTest {
	
	public static void main(String[] args) {
		// trim()
		System.out.println("--trim()--");
		String nombre=new String("   Harry Potter   ");
		System.out.println(nombre.trim());
		System.out.println(nombre);
		nombre=nombre.trim();
		
		// replace()
		System.out.println("\n--replace()--");
		System.out.println(nombre.replace('e', 'X'));
		System.out.println(nombre.replace('t', 'T'));
		System.out.println(nombre.replace('r', 'R'));
		
		// substring()
		System.out.println("\n--substring()--");
		System.out.println(nombre.substring(0, 5));
		System.out.println(nombre.substring(6));
		
		// indexOf 
		System.out.println("\n--indexOf()--");
		System.out.println("Posición de la 'H': "+nombre.indexOf('H'));
		System.out.println("Posición de la 'P': "+nombre.indexOf('P'));
		System.out.println("Posición de la 't': "+nombre.indexOf('t'));
		
		System.out.println(nombre.substring(nombre.indexOf('P')));
		System.out.println(nombre.substring(0, nombre.indexOf('y')+1));
		
		// startsWith()
		System.out.println("\n--startsWith()--");
		System.out.println(nombre.startsWith("Harry"));
		System.out.println(nombre.startsWith("Hary"));
		
		if (nombre.startsWith("Harry")) {
			System.out.println("El nombre empieza por Harry");
		} else {
			System.out.println("El nombre NO empieza por Harry");
		}
	}

}
