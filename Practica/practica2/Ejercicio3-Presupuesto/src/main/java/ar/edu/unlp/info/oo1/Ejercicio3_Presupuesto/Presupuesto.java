package ar.edu.unlp.info.oo1.Ejercicio3_Presupuesto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> lista;
	
	public Presupuesto(String nombre) {
		this.cliente = nombre;
		this.fecha = LocalDate.now();
		this.lista = new ArrayList<Item>();
	}
	
	public LocalDate getFecha(){
		return this.fecha;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void agregarItem(Item item) {
		this.lista.add(item);
	}
	
	public double calcularTotal(){
		return this.lista.stream().mapToDouble(item -> item.costo()).sum();
	}
}
