package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta();
		this.carpetas = new ArrayList<>();
		this.carpetas.add(inbox);
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carpetas;
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarEmail(email); 
		destino.agregarEmail(email);
	}
	public Email buscar(String texto) {
	    return carpetas.stream().map(carpeta->carpeta.buscar(texto)).filter(email-> email!=null).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return  this.carpetas.stream().mapToInt(carpeta-> carpeta.espacioOcupado()).sum();
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
}
