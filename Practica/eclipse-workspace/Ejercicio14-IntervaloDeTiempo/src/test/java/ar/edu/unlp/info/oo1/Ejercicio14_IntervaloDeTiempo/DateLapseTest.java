package ar.edu.unlp.info.oo1.Ejercicio14_IntervaloDeTiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	DateLapse dateLapse; 
	
	@BeforeEach
	void setUp() {
		dateLapse = new DateLapse(LocalDate.of(1988, 2,19), LocalDate.of(2023, 10,4));
	}

	@Test
	void testGetFrom() {
		assertEquals("1988-02-19", dateLapse.getFrom().toString());
	}

	@Test
	void testGetTo() {
		assertEquals("2023-10-04", dateLapse.getTo().toString());;
	}

	@Test
	void testSizeInDays() {
		assertEquals(13011, dateLapse.sizeInDays());;
	}

	@Test
	void testIncludesDate() {
		assertTrue(dateLapse.includesDate(LocalDate.of(1990, 10, 10)));
	}

}
