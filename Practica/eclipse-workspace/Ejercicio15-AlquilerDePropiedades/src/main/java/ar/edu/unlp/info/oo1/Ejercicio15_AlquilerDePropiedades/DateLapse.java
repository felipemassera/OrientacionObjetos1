package ar.edu.unlp.info.oo1.Ejercicio15_AlquilerDePropiedades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(this.from, this.to);
	}
	
	/* contempla que las fecha "otra" < que "desde", y > "despues" y lo niego (para que sea si o si en el medio),
	 * */
	public boolean includesDate(LocalDate other) {
		return !(other.isBefore(this.from) || other.isAfter(this.to));
	}
	
	/**
	 * retorna true si el periodo de tiempo del receptor se superpone con el recibido por parametro
	 */
	public boolean overlaps (DateLapse anotherDateLapse) {
		return includesDate(anotherDateLapse.getFrom())||(includesDate(anotherDateLapse.getTo()));
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