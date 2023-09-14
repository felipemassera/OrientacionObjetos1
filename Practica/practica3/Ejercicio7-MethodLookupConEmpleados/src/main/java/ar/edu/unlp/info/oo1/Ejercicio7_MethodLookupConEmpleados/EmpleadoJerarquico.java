package ar.edu.unlp.info.oo1.Ejercicio7_MethodLookupConEmpleados;

public class EmpleadoJerarquico extends Empleado{
	private double bonoPorCategoria;
	
	
	public EmpleadoJerarquico() {
		super();
	}
	
	public double getBonoPorCategoria() {
		return bonoPorCategoria;
	}
	public void setBonoPorCategoria(double bonoPorCategoria) {
		this.bonoPorCategoria = bonoPorCategoria;
	}	
	public double bonoPorCategoria() {
		return this.bonoPorCategoria;
	}
	public double sueldoBasico() {
		return super.getSueldoBasico()+this.bonoPorCategoria();
	}
	
}
