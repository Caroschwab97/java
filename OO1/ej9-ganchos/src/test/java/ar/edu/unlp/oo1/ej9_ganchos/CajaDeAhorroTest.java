package ar.edu.unlp.oo1.ej9_ganchos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

	private CajaDeAhorro caro;
	
	@BeforeEach
	public void setUp() {
		caro = new CajaDeAhorro ();
		
	}
	
	
	@Test
	public void depositar() {
		caro.depositar(100);
		assertEquals(98, caro.getSaldo());
		assertNotEquals(0, caro.getSaldo());
	}
	
	public void extraerTransferir() {
		assertFalse(caro.extraer(10));
		assertFalse(caro.transferencia(10, caro));
		caro.depositar(100);
		assertTrue(caro.extraer(10));
		assertTrue(caro.transferencia(10, caro));
	}

}
