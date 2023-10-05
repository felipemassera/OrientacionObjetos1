package ar.edu.unlp.info.oo1.Ejercicio11_ElInversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlazoFijoTest {

	PlazoFijo inversion;
	
	@BeforeEach
	void setUp(){
		inversion =new PlazoFijo(100, 10);
	}
	
	@Test
	void testGetMontoDepositado() {
		assertEquals(100,inversion.getMontoDepositado());
	}
	@Test
	void testGetPorcentaje() {
		assertEquals(0.1,inversion.getPorcentajeDeInteresDiario());
	}
	@Test
	void testGetFechaDeConstitucion() {
		assertEquals(LocalDate.now(),inversion.getFechaDeConstitucion());
	}
	@Test
	void testValorActual() {
		assertEquals(100,inversion.valorActual());
	}

}
