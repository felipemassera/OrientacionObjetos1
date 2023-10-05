package ar.edu.unlp.info.oo1.Ejercicio3bis_BalanzaMejorada;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		this.peso=0;
		this.precioPorKilo= 0;
		this.descripcion = "";
	}
	
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso= peso;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}

	public void setPrecioPorKilo(double precio) {
		this.precioPorKilo= precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return this.getPrecioPorKilo() * this.getPeso();
	}
}
