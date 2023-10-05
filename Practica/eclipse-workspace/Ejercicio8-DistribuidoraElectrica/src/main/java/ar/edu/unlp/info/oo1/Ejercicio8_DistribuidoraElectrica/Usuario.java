package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;

	public Usuario() {

	}

	public Usuario(String nombre, String domicilio) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.facturas = new ArrayList<>();
		this.consumos = new ArrayList<>();
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}

	public Consumo ultimoConsumo() {
		return this.consumos.stream().max((c1, c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}

	public double ultimoConsumoActiva() {
		double consumo =0;
		Consumo ultiConsumo = this.ultimoConsumo();
		if (ultiConsumo != null) {
			consumo = ultiConsumo.getConsumoEnergiaActiva();
		}
		return consumo;
	}

	public Factura facturarEnBaseA(double precioKWh) {
		double monto = 0;
		double descuento = 0;
		Consumo ultimo_consumo = this.ultimoConsumo();
		if (ultimo_consumo != null) {
			double pfe = ultimo_consumo.factorDePotencia();
			monto = ultimo_consumo.costoEnBaseA(precioKWh);
			if (pfe > 0.8) {
				descuento = 10;
			}
		}
		Factura factura = new Factura(monto, descuento, this);
		return factura;
	}

	public List<Factura> facturas() {
		return this.facturas;
	}

}
