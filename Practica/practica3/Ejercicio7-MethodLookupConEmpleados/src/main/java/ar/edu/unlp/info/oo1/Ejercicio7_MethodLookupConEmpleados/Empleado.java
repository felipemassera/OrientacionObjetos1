package ar.edu.unlp.info.oo1.Ejercicio7_MethodLookupConEmpleados;

public class Empleado {
	private String nombre;
	private double aportes;
	private double montoBasico;
	
	
	public Empleado() {
	}
	public Empleado(String nombre, double aportes, double montoBasico) {
		this.nombre = nombre;
		this.aportes = aportes;
		this.montoBasico = montoBasico;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBasico() {
		return this.getMontoBasico()+this.getAportes();
	}
	public double getMontoBasico() {
		return montoBasico;
	}
	public void setMontoBasico(double montoBasico) {
		this.montoBasico = montoBasico;
	}
	public double getAportes() {
		return aportes;
	}
	public void setAportes(double aportes) {
		this.aportes = aportes;
	}
	
}
