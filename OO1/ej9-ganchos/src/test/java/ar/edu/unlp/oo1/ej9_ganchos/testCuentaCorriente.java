package ar.edu.unlp.oo1.ej9_ganchos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class testCuentaCorriente {

	private CuentaCorriente caro;
	
	@BeforeEach
	public void setUp () {
		this.caro = new CuentaCorriente () ;
		
	}
	
	
	@Test
	public void extraer () {
		caro.depositar(10);
		assertFalse(caro.extraer(100));
		caro.setDescubierto(10);
		assertTrue(caro.extraer(20));
		caro.depositar(200);
		assertTrue(caro.extraer(100));
	}
}
