package ar.edu.unlp.info.oo1.Ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDeDias;
	private DateLapse dateLapse;
	
	public Reserva(LocalDate fechaInicio , LocalDate fechaFin) {
		dateLapse = new DateLapse(fechaInicio, fechaFin);		
		this.cantidadDeDias = this.dateLapse.sizeInDays();
	}
	
		
}
