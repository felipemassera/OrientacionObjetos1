package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsferaTest {

	Esfera esfera;
	
	@BeforeEach
	void setUp(){
		esfera= new Esfera("Plata","Dorado", 3);
	}
	@Test
	void testGetMaterial() {
		assertEquals("Plata", esfera.getMaterial());
	}
	@Test
	void testGetColor() {
		assertEquals("Dorado", esfera.getColor());
	}
	
	@Test
	void testGetRadio() {
		assertEquals(3, esfera.getRadio());
	}
	@Test
	void testGetVolumen() {
		assertEquals(0.0, esfera.getVolumen());
	}
	@Test
	void testGetSuperficie() {
		assertEquals(113.09733552923255, esfera.getSuperficie());
	}

}
