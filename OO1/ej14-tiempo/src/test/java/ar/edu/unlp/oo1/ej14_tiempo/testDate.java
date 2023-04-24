package ar.edu.unlp.oo1.ej14_tiempo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testDate {

	private DateLapse date;
	private LocalDate uno;
	private LocalDate dos;
	
	@BeforeEach
	public void setUp () {
		uno = LocalDate.of(2022, 2, 10);
		dos= LocalDate.of(2022, 2, 21);
		
		date = new DateLapse (uno,dos);
	}
	
	@Test
	public void testCosntructor () {
		assertEquals(uno, this.date.getFrom());
		assertEquals(dos, this.date.getTo());
	}
	
	@Test
	public void testLapse () {
		assertEquals(11, this.date.sizeInDays());
	}
	
	@Test
	public void testParte () {
		LocalDate tres = LocalDate.of(2022, 2, 15);
		assertTrue(this.date.includesDate(tres));
		LocalDate cuatro = LocalDate.of(2022, 8, 15);
		assertFalse(this.date.includesDate(cuatro));
	}
}
