package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<>()	;
	}
	
	public double volumenDeMaterial(String material) {
		List<Pieza> filtrados= this.piezas.stream().filter(elem-> elem.getMaterial() == material).collect(Collectors.toList());
		return filtrados.stream().mapToDouble(elem->elem.getVolumen()).sum();
	}
	
	public double superficieDeColor(String color) {
		List<Pieza> filtrados = this.piezas.stream().filter(elem -> elem.getColor() == color).collect(Collectors.toList());
		return filtrados.stream().mapToDouble(elem -> elem.getSuperficie()).sum();
	}
	
	public List<Pieza> getPiezas(){
		return this.piezas;
	}
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
}
