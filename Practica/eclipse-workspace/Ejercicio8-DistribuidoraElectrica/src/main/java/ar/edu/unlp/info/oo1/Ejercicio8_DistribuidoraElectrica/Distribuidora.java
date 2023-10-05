package ar.edu.unlp.info.oo1.Ejercicio8_DistribuidoraElectrica;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

	private List<Usuario> usuarios;
	private double precioKWh;

	// Constructor
	public Distribuidora(double precio) {
		this.precioKWh = precio;
		this.usuarios = new ArrayList<Usuario>();
	}

	// GETTER DE precioKWh usuarios;

	public double getPrecioKWh() {
		return precioKWh;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public List<Factura> facturar() {
		List<Factura> facturas = new ArrayList<>();
		
		return facturas;

	}

	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(usuario -> usuario.ultimoConsumoActiva()).sum();	
	}

	public void precioKWh(double precio) {
		this.precioKWh = precio;
	}

}
