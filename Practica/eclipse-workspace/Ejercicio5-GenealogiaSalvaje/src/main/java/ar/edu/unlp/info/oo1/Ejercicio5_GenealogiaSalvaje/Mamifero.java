package ar.edu.unlp.info.oo1.Ejercicio5_GenealogiaSalvaje;

import java.util.Date;

public class Mamifero {
	private String id;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;

	public Mamifero () {
		this.id = "";
	}
	public Mamifero (String nombre) {
		this.id = nombre;
		this.especie = "";
	}
	
	public String getIdentificador() {
		return this.id;
	}
	public void setIdentificador (String nombre) {
		this.id = nombre;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie (String especie) {
		this.especie = especie;
	}
	public Date getFechaDNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(Date fecha) {
		this.fechaNacimiento = fecha;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbuelaMaterna() {
		Mamifero madre = this.getMadre();
		if (madre!=null) {
			madre = madre.getMadre();
		}
		return madre;
	}
	public Mamifero getAbueloMaterno() {
		Mamifero madre =this.getMadre();
		if (madre!=null) {
			madre= madre.getPadre();
		}
		return madre;
	}
	public Mamifero getAbuelaPaterna() {
		Mamifero padre =this.getPadre();
		if (padre!=null) {
			padre= padre.getMadre();
		}
		return padre;
	}
	public Mamifero getAbueloPaterno() {
		Mamifero padre =this.getPadre();
		if (padre!=null) {
			padre= padre.getPadre();
		}
		return padre;
	}
	
	public Boolean tieneComoAncestroA (Mamifero unMamifero) {
		boolean ok = false;
		if ((unMamifero == this.getPadre())||(unMamifero == this.getMadre())) {
			ok = true;
		}else {
			if (this.getPadre()!= null ) {
				ok = this.getPadre().tieneComoAncestroA(unMamifero);
			}
			if ((!ok)&&(this.getMadre()!=null)) {
				ok = this.getMadre().tieneComoAncestroA(unMamifero);
			}
		}
		return ok;
	}
}