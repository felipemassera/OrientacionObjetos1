package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	ClienteDeCorreo cliente;
	Carpeta carpeta;
	Email email1;
	Email email2;
	Email email3;
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;
	Archivo archivo4;
	
	@BeforeEach
	void setUp() {
		cliente = new ClienteDeCorreo();
		carpeta = new Carpeta("Enviados");  // 83
		archivo4 =new Archivo("Santiago");//8
		archivo3 =new Archivo("virginia");//8
		archivo2 =new Archivo("Teodoro");//7
		archivo1 =new Archivo("sofia");//5
		email1 = new Email("Anana", "SOy un anana"); //17  == 30
		email2 = new Email("manzana", "SOy un batman"); //19 == 27
		email3 = new Email("banana", "SOy un anana"); //18 == 26
		email1.agregarAdjuntos(archivo1);
		email1.agregarAdjuntos(archivo2);
		email2.agregarAdjuntos(archivo3);
		email3.agregarAdjuntos(archivo4);
		carpeta.agregarEmail(email1);
		carpeta.agregarEmail(email2);
		carpeta.agregarEmail(email3);
		cliente.agregarCarpeta(carpeta);
	}
	

	@Test
	void testGetCarpetas() {
		assertEquals(2, cliente.getCarpetas().size());
	}

	@Test
	void testRecibir() {
		Email email4 = new Email("email4", "soy email4");
		cliente.recibir(email4);
		assertEquals("email4", cliente.buscar("email4").getTitulo());
	}

	@Test
	void testMover() {
		cliente.mover(email1, carpeta, cliente.getInbox());
		assertEquals("Anana", cliente.getInbox().buscar("Anana").getTitulo());
	}

	@Test
	void testBuscar() {
		assertEquals("manzana", cliente.buscar("manzana").getTitulo());
	}

	@Test
	void testEspacioOcupado() {
		assertEquals(83, cliente.espacioOcupado());
	}

}
