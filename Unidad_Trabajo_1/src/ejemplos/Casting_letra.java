package ejemplos;

public class Casting_letra {

	public static void main(String[] args) {
		// Declaración de variables
		int num;
		char letra;
		
		// Asignación de valores
		letra='A';
		num=letra;                                 
	    
		// Casting implícito  
		System.out.println(letra);                   // A
		System.out.println(num);                     // 65
		
		// Casting explícito
		System.out.println((char)(num+1));           // B
		System.out.println((char)97);                // a
	}
}
