package ar.edu.unlp.oo1.OOBnB;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testOOBnB {

	
	private OOBnB algo;
	private propiedades p,c;
	
	@BeforeEach
	public void setUp() {
		algo = new OOBnB ();
		p = new propiedades("h", 10.0, "ss", "d");
		algo.registrarPropAlquiler("s", 0, "s", "d");
		c = new propiedades("a", 10.0, "ds", "g");
		algo.registrarPropAlquiler("w", 0, "a", "g");
	}
	
	@Test
	public void buscar() {
		List<propiedades> prop = algo.buscarPropPeriodo(LocalDate.of(2022, 10, 1), null);
		
	}
}
