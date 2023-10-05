package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<>();
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}

	public List<Archivo> getAdjuntos() {
		return this.adjuntos;
	}
	public void agregarAdjuntos(Archivo arch) {
		this.adjuntos.add(arch);
	}
	public int espacioOcupado(){
		return this.titulo.length() + this.cuerpo.length()+ (int) this.getAdjuntos().stream().mapToDouble(archivos-> archivos.tamanio()).sum();
	}
}
