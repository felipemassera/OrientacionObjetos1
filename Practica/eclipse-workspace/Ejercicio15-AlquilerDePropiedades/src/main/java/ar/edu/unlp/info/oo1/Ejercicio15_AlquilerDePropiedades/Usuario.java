package ar.edu.unlp.info.oo1.Ejercicio15_AlquilerDePropiedades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedadesEnAlquiler;
	private List<Reserva> reservas;
	private List<Propiedad> propiedadAlquilada;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedadesEnAlquiler = new ArrayList<>();
		this.reservas = new ArrayList<>();
		this.propiedadAlquilada = new ArrayList<>();
	}
	
	
	
	
	
}
