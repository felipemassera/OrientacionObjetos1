package ar.edu.unlp.info.oo1.Ejercicio3bis_BalanzaMejorada;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private Integer cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> lista;
	
	public Balanza(){
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.lista = new ArrayList<Producto>();
	}
	
	public Integer getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}

	public void ponerEnCero(){
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
		this.lista.clear();
	}
	
	public List<Producto> getProductos(){
		return this.lista;
	}
	
	public void agregarProducto(Producto producto) {
		this.lista.add(producto);
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
		this.cantidadDeProductos+=1;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(), this.getProductos());
		return ticket; 
	}
}
