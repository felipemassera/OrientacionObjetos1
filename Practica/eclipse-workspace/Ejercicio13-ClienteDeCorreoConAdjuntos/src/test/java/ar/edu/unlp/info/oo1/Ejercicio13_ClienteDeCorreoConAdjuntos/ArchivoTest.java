package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArchivoTest {
	Archivo archivo;
	@BeforeEach
	void setUp() {
		archivo = new Archivo("Tito");
	}
	@Test
	void testGetNombre() {
		assertEquals("Tito", archivo.getNombre());
	}

	@Test
	void testSetNombre() {
		archivo.setNombre("Branca");
		assertEquals("Branca", archivo.getNombre());
	}

	@Test
	void testTamanio() {
		assertEquals(4, archivo.tamanio());
	}

}
