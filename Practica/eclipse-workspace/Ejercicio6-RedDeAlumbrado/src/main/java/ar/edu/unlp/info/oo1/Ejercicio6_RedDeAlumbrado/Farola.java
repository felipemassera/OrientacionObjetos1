package ar.edu.unlp.info.oo1.Ejercicio6_RedDeAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean state; 
	private List<Farola> farolas;
	
	//Crear una farola. Debe inicializarla como apagada
	public Farola () {
		this.state =false;
		this.farolas = new ArrayList<>();
	}
	
	/*Crea la relación de vecinos entre las farolas. La relación de vecinos
	entre las farolas es recíproca, es decir el receptor del mensaje será vecino
	de otraFarola, al igual que otraFarola también se convertirá en vecina del
	receptor del mensaje */
	public void pairWithNeighbor( Farola otraFarola ) {
		this.farolas.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	//Retorna sus farolas vecinas 
	public List<Farola> getNeighbors (){
		return this.farolas;
	}
	// Si la farola no está encendida, la enciende y propaga la acción.
	public void turnOn() {
		if (!this.state) {
			this.state=true;
			this.getNeighbors().forEach(farola -> farola.turnOn());
		}
	}
	//Si la farola no está apagada, la apaga y propaga la acción.
	public void turnOff() {
		if (this.state) {
			this.state=false;
			this.getNeighbors().forEach(farola-> farola.turnOff());
		}
	}
	
	// Retorna true si la farola está encendida.
	public boolean isOn() {
		return this.state;
	}
	
}
