package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	Email email;
	Archivo arch1;
	Archivo arch2;
	
	@BeforeEach
	void SetUp() {
		email = new Email("Hola", "Que tal estoy probando el programa"); //38
		arch1 = new Archivo("Soy el uno"); //10
		arch2 = new Archivo("Soy el dos"); //10
		email.agregarAdjuntos(arch1);
		email.agregarAdjuntos(arch2);
	}

	@Test
	void testGetTitulo() {
		assertEquals("Hola", email.getTitulo());
	}

	@Test
	void testGetCuerpo() {
		assertEquals("Que tal estoy probando el programa", email.getCuerpo());
	}

	@Test
	void testAgregarAdjuntos() {
		assertEquals(2, email.getAdjuntos().size());
	}

	@Test
	void testEspacioOcupado() {
		assertEquals(58, email.espacioOcupado());
	}

}
