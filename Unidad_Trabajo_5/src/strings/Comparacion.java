package strings;

public class Comparacion {

	public static void main(String[] args) {
		String s1 = "ANTONIA";
		String s2 = new String("ANTONIA");

		// 1. Métodos compareTo compareToIgnoreCase
		if (s1.compareTo(s2)==0) {
			System.out.println(s1+" y "+s2+" son iguales");
		} else
			System.out.println(s1+" y "+s2+" son distintos");


		if (s1.compareToIgnoreCase(s2)==0) {
			System.out.println(s1+" y "+s2+" son iguales");
		} else
			System.out.println(s1+" y "+s2+" son distintos");

		// 2. Método equals
		if (s1.equals(s2)) {
			System.out.println(s1+" y "+s2+" son iguales");
		} else
			System.out.println(s1+" y "+s2+" son distintos");

		// 3. Con la igualdad ==
		if (s1==s2)	{
			System.out.println(s1+" y "+s2+" son iguales");
		} else
			System.out.println(s1+" y "+s2+" son distintos");
	}

}
