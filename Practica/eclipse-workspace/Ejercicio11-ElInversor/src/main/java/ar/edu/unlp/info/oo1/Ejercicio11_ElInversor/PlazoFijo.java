package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario/100;
	}

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	@Override
	public double valorActual() {
		LocalDate fechaActual= LocalDate.now();
		long diferenciaDias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), fechaActual);		
		return (diferenciaDias*(this.getPorcentajeDeInteresDiario() * this.getMontoDepositado()))+this.getMontoDepositado();
	}	
}
