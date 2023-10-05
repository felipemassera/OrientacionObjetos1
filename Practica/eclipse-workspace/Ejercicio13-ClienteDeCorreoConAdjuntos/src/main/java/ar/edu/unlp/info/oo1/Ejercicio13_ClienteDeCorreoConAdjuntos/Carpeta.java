package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta() {
		this.emails= new ArrayList<>();
	}

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails= new ArrayList<>();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public List<Email> getEmails(){
		return this.emails;
	}
	public void eliminarEmail(Email email) {
		emails.remove(email);
	}
	public void agregarEmail(Email email) {
		emails.add(email);
	}
	public Email buscar(String text) {
		return this.getEmails().stream().filter(email-> email.getTitulo().equals(text)).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.emails.stream().mapToInt(emails->emails.espacioOcupado()).sum();
	}
	
}
