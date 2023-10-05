package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor{
	private String nombre;
	private List<Inversiones> inversiones;
	
	public Inversor(String nombre) {
		super();
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversiones>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Inversiones> getInversiones(){
		return this.inversiones;
	}
	
	public void agregarInversion(Inversiones inv) {
		this.inversiones.add(inv);
	}

	public double valorActual() {
		return this.getInversiones().stream().mapToDouble(inversion -> inversion.valorActual()).sum();
	}
}

