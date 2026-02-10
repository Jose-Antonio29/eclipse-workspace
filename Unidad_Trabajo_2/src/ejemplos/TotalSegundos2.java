package ejemplos;

public class TotalSegundos2 {

	/**
	 * Calcula el total de segundos en una hora
	 * @param h - horas que queremos convertir a segundos
	 * @param m - minutos que queremos convertir a segundos
	 * @param s - segundos de una hora
	 * @return eltotal de segundos de una hora
	 */
	public static int segundos(int h, int m, int s) {
		return 3600*h+60*m+s;
	}
	
	public static void main(String[] args) {
		int h, m, s;
		
		h=0; m=0; s=1;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+segundos(h,m,s)+" segundos ");

		h=1; m=5; s=55;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+segundos(h,m,s)+" segundos ");
		
		h=3; m=15; s=21;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+segundos(h,m,s)+" segundos ");
		
		h=10; m=10; s=1;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+segundos(h,m,s)+" segundos ");
		
		h=0; m=59; s=59;
		System.out.println(h+" horas "+m+" min "+s+" seg --> Total: "+segundos(h,m,s)+" segundos ");
	}

}
