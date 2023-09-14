package ar.edu.unlp.info.oo1.Ejercicio4_FigurasyCuerpos;

public class Cuadrado implements funciones {

	private double lado;
	
	public Cuadrado() {
		this.lado =0;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double getArea() {
		return this.lado * this.lado;
	}

	@Override
	public double getPerimetro() {
		return this.lado*4;
	}

}
