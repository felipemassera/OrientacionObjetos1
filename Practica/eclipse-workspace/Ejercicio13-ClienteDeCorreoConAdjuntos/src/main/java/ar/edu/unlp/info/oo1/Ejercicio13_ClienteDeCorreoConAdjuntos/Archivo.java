package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

public class Archivo {
	private String nombre;

	public Archivo() {
	}

	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double tamanio() {
		return this.nombre.length();
	}
}
