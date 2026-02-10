package ejemplos.condicionales;

public class Menor_3 {

	public static void main(String[] args) {
		int primero, segundo;
	
		// Usamos funciones creadas en otros class ya que al ser declaradas como public son accesibles/leíbles por otos archivos.
		primero=Menor_2.aleatorio(25);              // Se realiza la llamada de esta función indicando de qué archivo es.
		segundo=Menor_2.aleatorio(25);
		
		int menor=Menor_2.menor(primero, segundo);
		
		System.out.println("Valores: "+primero+" "+segundo);
		System.out.println("Menor: "+menor);

	}

}
