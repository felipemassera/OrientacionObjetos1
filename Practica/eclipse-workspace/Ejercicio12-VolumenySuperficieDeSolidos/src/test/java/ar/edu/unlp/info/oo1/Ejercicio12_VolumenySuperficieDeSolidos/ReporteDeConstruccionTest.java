package ar.edu.unlp.info.oo1.Ejercicio12_VolumenySuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReporteDeConstruccionTest {
	
	ReporteDeConstruccion reporte;
	Cilindro cilindro;
	Esfera esfera;
	PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		prisma = new PrismaRectangular("Plomo","Gris", 10, 20, 25);
		esfera = new Esfera("plomo", "rojo", 3);
		cilindro = new Cilindro("Plata", "Gris", 3, 10);
	}
	
	@Test
	void testAgregar() {
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(prisma);
		assertEquals(3, reporte.getPiezas().size());
	}
    @Test
    void testSuperficieDeColor(){
    	assertEquals(0.0, reporte.superficieDeColor("Gris"));
    }
    @Test
    void testVolumenDeMaterial(){
    	assertEquals(0.0, reporte.volumenDeMaterial("Plomo"));
    }
}
