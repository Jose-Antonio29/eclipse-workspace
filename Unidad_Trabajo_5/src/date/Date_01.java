package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_01 {

	public static void main(String[] args) {
		// Creamos la fecha actual
		Date hoy = new Date();					// Crea un objeto Date con la fecha de hoy
		System.out.println("Fecha actual (sin formato): "+hoy);		// Muestra la fecha de hoy
		
		// Creamos la fecha actual con formato dd/mm/yyyy
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha (con formato): "+formato.format(hoy));
		
		// Mostramos la hora
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Hora: "+f.format(new Date()));
		
		// Obtenemos parte de la fecha
		formato = new SimpleDateFormat("yyyy");
		String a = formato.format(hoy);
		System.out.println("\nAño: "+a);
		
		formato = new SimpleDateFormat("MM");
		System.out.println("Mes: "+formato.format(hoy));
		
		formato = new SimpleDateFormat("DD");
		System.out.println("Día: "+formato.format(hoy));
		
		formato = new SimpleDateFormat("HH");
		System.out.println("\nHora: "+formato.format(hoy));
		
		formato = new SimpleDateFormat("mm");
		System.out.println("Minutos: "+formato.format(hoy));
		
		formato = new SimpleDateFormat("ss");
		System.out.println("Segundos: "+formato.format(hoy));
	}

}
