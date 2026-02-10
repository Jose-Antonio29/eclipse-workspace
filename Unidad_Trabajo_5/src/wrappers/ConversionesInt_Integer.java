package wrappers;

public class ConversionesInt_Integer {

	public static void main(String[] args) {
		// Envolver un int a Integer (autoboxing)
		int num = 5;
		Integer numWrapper = num;					// Autoboxing (automático)
		System.out.println("Valor (Integer): "+numWrapper);
		
		// Convertir un Integer a int (unboxing)
		int numDesenvuelto = numWrapper;			// Unboxing (automático)
		System.out.println("Valor (int): "+numDesenvuelto);
		
		// Conversión de String a Integer con parseInt
		String textoNum = "123";
		Integer numConvertido = Integer.parseInt(textoNum);
		System.out.println("Conversión de String a Integer: "+numConvertido);
		
		// Crear un Integer a partir de un String con valueOf
		Integer numValueOf = Integer.valueOf("2025");
		System.out.println("Creado con valueOf a partir de un String: "+numValueOf);
		
		// Conversión de Integer a String
		String textoNum2 = numWrapper.toString();
		System.out.println("Conversión de Integer a String: "+textoNum2);
		
		// Convertir un int a binario, octal y decimal
		int numbase=42;
		String binario = Integer.toBinaryString(numbase);
		String octal = Integer.toOctalString(numbase);
		String hex = Integer.toHexString(numbase);
		System.out.println("Representación de "+numbase+" en binario: "+binario);
		System.out.println("Representación de "+numbase+" en octal: "+octal);
		System.out.println("Representación de "+numbase+" en hexadecimal: "+hex);
	}

}
