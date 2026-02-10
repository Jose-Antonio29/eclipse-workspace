package ejemplos.Jugador;

public class Jugador_Test {

	public static void main(String[] args) {
		// Crear objetos Jugador
		Jugador jug1 = new Jugador(1,"Pau Gasol",2.16,300000);
		Jugador jug2 = new Jugador(2,"Marc Gasol",2.12,250000);
		Jugador jug3 = new Jugador(3,"Jaycee Carroll",1.88,120000);
		Jugador jug4 = new Jugador(4,"LeBron James",2.06,500000);
		
		// Mostramos los datos de los Jugadores
		jug1.mostrarJugador();
		jug2.mostrarJugador();
		jug3.mostrarJugador();
		jug4.mostrarJugador();

		// Subimos 10.000€ el salario de Pau Gasol
		jug1.setSueldo(jug1.getSueldo()+10000);
		jug1.mostrarJugador();
		
		// Bajar 15.000€ el salario del jugador 4
		jug4.setSueldo(jug4.getSueldo()-15000);
		jug4.mostrarJugador();
		
		// Ponemos la misma altura para el jugador 1 y el jugador 2 (la más alta)
		double alturaJ1=jug1.getAltura();
		double alturaJ2=jug2.getAltura();
		
		if (alturaJ1>alturaJ2) {
			jug2.setAltura(jug1.getAltura());
		} else {
			jug1.setAltura(jug2.getAltura());
		}
		
		jug1.mostrarJugador();
		jug2.mostrarJugador();
		
		// El jugador 3 va a cobrar el doble que el jugador 2
		jug3.setSueldo(jug2.getSueldo()*2);
		jug3.mostrarJugador();

	}
}
