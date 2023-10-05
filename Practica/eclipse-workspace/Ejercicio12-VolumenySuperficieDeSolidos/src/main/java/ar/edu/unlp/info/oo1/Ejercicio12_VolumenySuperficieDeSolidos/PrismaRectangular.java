package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

public class PrismaRectangular extends Pieza{
	private int ladoMenor;
	private int ladoMayor;
	private int altura;
	
	public PrismaRectangular(String material, String color, int ladoMenor, int ladoMayor, int altura) {
		super(material, color);
		this.ladoMenor = ladoMenor;
		this.ladoMayor = ladoMayor;
		this.altura = altura;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public double getVolumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
	}

	@Override
	public double getSuperficie() {
		return 2*(this.getLadoMayor() * this.getLadoMenor() + this.getLadoMayor() * this.getAltura() + this.getLadoMenor() * this.getAltura());
	}
	
}
