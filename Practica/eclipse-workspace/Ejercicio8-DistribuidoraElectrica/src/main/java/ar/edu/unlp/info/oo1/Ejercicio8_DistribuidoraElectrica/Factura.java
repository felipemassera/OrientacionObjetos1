package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.time.LocalDate;


public class Factura {

	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
		
	public Factura(double montoEnergiaActiva, double descuento,Usuario usuario) {
		this.usuario = usuario;
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
	}

	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}

	public double getDescuento() {
		return this.descuento;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public double montoTotal() {
		return this.getMontoEnergiaActiva() - (this.getMontoEnergiaActiva()/this.descuento);
	}
	
}
