package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	PlazoFijo plazoFijo;
	Inversor inversor;
	InversionEnAcciones inversionesAcciones;
	
	@BeforeEach
	void setUp() throws Exception{
		inversor = new Inversor("Virginia");
		plazoFijo= new PlazoFijo(100,5);
		inversionesAcciones= new InversionEnAcciones("facebook", 3, 100);
	}
	
	@Test
	void testName() {
		assertEquals("Virginia", inversor.getNombre());
	}

	@Test
	void testAgregarInversion() {
		inversor.agregarInversion(plazoFijo);
		inversor.agregarInversion(inversionesAcciones);
		assertEquals(2, inversor.getInversiones().size());
	}
	
	@Test
	void testValorActual(){
		inversor.agregarInversion(plazoFijo);
		inversor.agregarInversion(inversionesAcciones);
		assertEquals(400, inversor.valorActual());
	}
}
