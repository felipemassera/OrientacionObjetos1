package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {

	InversionEnAcciones inversion;
	
	@BeforeEach
	void setUp(){
		inversion= new InversionEnAcciones("facebook", 3, 100);
	}
	
	@Test
	void testGetNombre() {
		assertEquals("facebook", inversion.getNombre());
	}

	@Test
	void testGetCantidad() {
		assertEquals(3, inversion.getCantidad());
	}
	
	@Test
	void testGetValorUnitario() {
		assertEquals(100, inversion.getValorUnitario());
	}
	
	@Test
	void testNombre() {
		assertEquals(300, inversion.valorActual());
	}
}
