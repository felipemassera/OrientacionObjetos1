package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate localDate, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = localDate;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}

	
	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public double costoEnBaseA(double precioKWh) {
		
		return this.getConsumoEnergiaActiva()*precioKWh;
	}
	
	public double factorDePotencia() {
		double fpe = this.consumoEnergiaActiva/ (Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2)+Math.pow(this.consumoEnergiaReactiva,2)));
		return fpe;
	}
}
