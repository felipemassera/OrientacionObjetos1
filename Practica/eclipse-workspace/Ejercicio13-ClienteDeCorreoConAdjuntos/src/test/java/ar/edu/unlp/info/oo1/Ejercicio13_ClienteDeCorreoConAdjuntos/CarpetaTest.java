package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
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
	}
	
	@Test
	void testSetNombre() {
		carpeta.setNombre("recibido");
		assertEquals("recibido", carpeta.getNombre());
	}

	@Test
	void testGetNombre() {
		assertEquals("Enviados", carpeta.getNombre());
	}

	@Test
	void testGetEmails() {
		assertEquals(3,carpeta.getEmails().size());
	}

	@Test
	void testEliminarEmail() {
		carpeta.eliminarEmail(email1);
		assertEquals(2, carpeta.getEmails().size());
	}

	@Test
	void testAgregarEmail() {
		Email email4 =new Email("nuevo", "nuevo email");
		carpeta.agregarEmail(email4);
		assertEquals(4, carpeta.getEmails().size());
	}

	@Test
	void testBuscar() {
		assertEquals("banana", carpeta.buscar("banana").getTitulo());
		//assertNull(carpeta.buscar("mandarina").getTitulo());
	}

	@Test
	void testEspacioOcupado() {
		assertEquals(83, carpeta.espacioOcupado());
	}

}
