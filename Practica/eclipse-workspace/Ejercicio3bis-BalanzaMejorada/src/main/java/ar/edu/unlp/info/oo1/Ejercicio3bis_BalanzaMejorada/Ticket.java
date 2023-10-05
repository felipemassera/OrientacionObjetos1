package ar.edu.unlp.info.oo1.Ejercicio3bis_BalanzaMejorada;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> lista;
	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal,List<Producto> lista) {
		super();
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.lista=lista;
		
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
}
