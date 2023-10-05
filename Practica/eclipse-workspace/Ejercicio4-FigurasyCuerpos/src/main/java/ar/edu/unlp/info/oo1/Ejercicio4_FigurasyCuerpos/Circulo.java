package ar.edu.unlp.info.oo1.Ejercicio4_FigurasyCuerpos;

public class Circulo implements funciones{
	private double radio;
	private double diametro;
	
	public Circulo() {
		this.radio = 0;
		this.diametro = 0;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double getDiametro() {
		return this.getRadio()*2;
	}

// preguntar si el parametro que recibe es el radio o es el diametro directamente.
	public void setDiametro(double valor) {
		this.diametro = valor;
		this.radio = radio / 2;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(),2);
	}

	@Override
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
}
