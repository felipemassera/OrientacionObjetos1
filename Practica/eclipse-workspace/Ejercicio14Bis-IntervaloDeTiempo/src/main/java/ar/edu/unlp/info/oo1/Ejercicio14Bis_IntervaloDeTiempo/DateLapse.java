package ar.edu.unlp.info.oo1.Ejercicio14Bis_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int)ChronoUnit.DAYS.between(from, to);
	}
	public LocalDate getFrom() {
		return this.from;
	}
	public int sizeInDays() {
		return this.sizeInDays;
	}
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays());
	}
	public boolean includesDate(LocalDate other) {
		
		return !(other.isBefore(this.from) || other.isAfter(this.getTo()));
	}
}


//Investigue cómo hacer para crear una fecha determinada, por ejemplo 15/09/1972. -> LocalDate.of(1972, 9, 15);
//	
//● Investigue cómo hacer para determinar si la fecha de hoy se encuentra entre las
//fechas 15/12/1972 y 15/12/2032. Sugerencia: vea los métodos permiten comparar
//LocalDates y que retornan booleans. 
//					LocalDate fechaInicio = LocalDate.of(1972, 12, 15);
//					LocalDate fechaFin = LocalDate.of(2032, 12, 15);	
//					LocalDate fechaHoy = LocalDate.now();
//					boolean estaDentroDelRango = fechaHoy.isAfter(fechaInicio) && fechaHoy.isBefore(fechaFin);

//● Investigue cómo hacer para calcular el número de días entre dos fechas. Lo mismo
//para el número de meses y de años Sugerencia: vea el método until.
//Tenga en cuenta que los métodos de LocalDate colaboran con otros objetos que
//están definidos a partir de enums, clases e interfaces de java.time; por ejemplo
//java.time.temporal.ChronoUnit.DAYS

//					LocalDate fechaInicio = LocalDate.of(1972, 12, 15);
//					LocalDate fechaFin = LocalDate.of(2032, 12, 15);

// Calcular el número de días entre las dos fechas
//					long diasEntreFechas = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
// Calcular el número de meses entre las dos fechas
//					long mesesEntreFechas = ChronoUnit.MONTHS.between(fechaInicio, fechaFin);
// Calcular el número de años entre las dos fechas
//					long añosEntreFechas = ChronoUnit.YEARS.between(fechaInicio, fechaFin);