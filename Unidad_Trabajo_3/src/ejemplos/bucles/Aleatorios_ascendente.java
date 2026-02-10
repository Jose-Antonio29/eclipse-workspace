package ejemplos.bucles;

public class Aleatorios_ascendente {
	
	public static int random () {
		return (int)(Math.random()*50+1);
	}

	public static void main(String[] args) {
		int num1=random();
		int num2=random();
		
		if (num1<num2) {
			System.out.println("Contamos de "+num1+" a "+num2);
			for (int n=num1; n<=num2; n++) {
			System.out.print(n+" ");
		}
	   }else 
		   System.out.println("Contamos de "+num1+" a "+num2);
		   for (int n=num1; n>=num2; n--) {
			   System.out.print(n+" ");
		   }

	}
}
