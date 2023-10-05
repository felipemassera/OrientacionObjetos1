package ar.edu.unlp.info.oo1.Ejercicio7_MethodLookupConEmpleados;

public class Gerente extends EmpleadoJerarquico{
	public double aportes() {
		return super.getMontoBasico() * 0.05;
	}
}



