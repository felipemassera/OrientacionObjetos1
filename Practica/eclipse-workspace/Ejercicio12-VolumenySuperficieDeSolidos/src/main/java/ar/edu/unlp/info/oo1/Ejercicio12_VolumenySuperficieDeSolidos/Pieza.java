package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

public abstract class Pieza implements Figura{
	private String material;
	private String color;
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}
	
}
