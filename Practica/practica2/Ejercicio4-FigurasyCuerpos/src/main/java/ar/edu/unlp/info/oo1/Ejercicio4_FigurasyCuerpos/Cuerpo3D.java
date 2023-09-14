package ar.edu.unlp.info.oo1.Ejercicio4_FigurasyCuerpos;

public class Cuerpo3D {
	private double altura;
	private funciones caraBasal;

	public Cuerpo3D() {
		this.altura = 0;
		this.caraBasal = null;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCaraBasal(funciones figura) {
		this.caraBasal = figura;
	}

	public double getAltura() {
		return altura;
	}

	public double getVolumen() {
		return this.caraBasal.getArea() * this.getAltura();
	}
	
	public double getSuperficieExterior() {
		return ((2* this.caraBasal.getArea()) + (this.caraBasal.getPerimetro() *this.getAltura()));
	}
}
