package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {

	PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular("Plomo","Gris", 10, 20, 25);
	}
	
	@Test
	void testGetMaterial() {
		assertEquals("Plomo", prisma.getMaterial());
	}
	@Test
	void testGetColor() {
		assertEquals("Gris", prisma.getColor());
	}
	
	@Test
	void testGetLadoMayor() {
		assertEquals(20, prisma.getLadoMayor());
	}
	@Test
	void testGetLadoMenor() {
		assertEquals(10, prisma.getLadoMenor());
	}
	@Test
	void testGetAltura() {
		assertEquals(25, prisma.getAltura());
	}
	@Test
	void testGetVolumen() {
		assertEquals(5000.0, prisma.getVolumen());
	}
	@Test
	void testGetSuperficie() {
		assertEquals(1900.0, prisma.getSuperficie());
	}
	
}
