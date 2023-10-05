package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTest {

	Cilindro cilindro;
	
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro("Hierro", "Dorado", 3, 10);
	}
	
	@Test
	void testGetMaterial() {
		assertEquals("Hierro", cilindro.getMaterial());
	}
	@Test
	void testGetColor() {
		assertEquals("Dorado", cilindro.getColor());
	}
	
	@Test
	void testGetRadio() {
		assertEquals(3, cilindro.getRadio());
	}
	@Test
	void testGetAltura() {
		assertEquals(10, cilindro.getAltura());
	}
	@Test
	void testGetVolumen() {
		assertEquals(282.7433388230814, cilindro.getVolumen());
	}
	@Test
	void testGetSuperficie() {
		assertEquals(245.04422698000386, cilindro.getSuperficie());
	}
	
}
