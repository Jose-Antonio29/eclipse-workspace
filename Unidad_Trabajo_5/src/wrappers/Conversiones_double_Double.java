package wrappers;

import java.util.Scanner;

public class Conversiones_double_Double {

	public static void main(String[] args) {
		// Envolver un double a Double (autoboxing)
		double num = 25.76;
		Double numWrapper = num;				// Autoboxing (automático)
		System.out.println("Valor (Double): "+numWrapper);
		
		// Convertir un Double a double (unboxing)
		double numDesenvuelto = numWrapper;
		System.out.println("Valor (double): "+numDesenvuelto);
		
		// Conversión de String a Double usando parseDouble
		String textoNum = "123.45";
		Double numConvertido = Double.parseDouble(textoNum);
		System.out.println("Conversión de String a Double: "+numConvertido);
		
		// Crear un Double a partir de un String con valueOf
		Double numValueOf = Double.valueOf("20.25");
		System.out.println("Creado con valueOf desde un String: "+numValueOf);
		
		// Conversión de Double a String
		String textoNum2 = numWrapper.toString();
		System.out.println("Conversión de Double a String: "+textoNum2);
		
		
		// Entrada de usuario con Scanner y conversión a Double
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número decimal: ");
		String entrada = sc.nextLine();
		
		try {
			Double numUsuario = Double.parseDouble(entrada);
			System.out.println("Has introducido el número: "+numUsuario);
			
		} catch (NumberFormatException nfe) {
			System.err.println("No se pudo convertir "+entrada+" a un número decimal.");
		} finally {
			sc.close();
		}
		

	}

}
