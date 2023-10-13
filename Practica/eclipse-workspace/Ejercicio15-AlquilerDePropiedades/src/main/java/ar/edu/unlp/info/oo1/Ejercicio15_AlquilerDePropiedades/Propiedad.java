package ar.edu.unlp.info.oo1.Ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private String direccion;
	private String precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, String direccion, String precioPorNoche) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<>();
	}
	
	public void agregarReserva() {
		Reserva reserva = new Reserva();
		
	}
	
}
