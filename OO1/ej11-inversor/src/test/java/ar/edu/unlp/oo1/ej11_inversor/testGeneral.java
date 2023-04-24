package ar.edu.unlp.oo1.ej11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testGeneral {

	private Inversor inv ;
	private plazoFijo uno, dos, tres;
	private acciones cuatro, cinco, seis;
	
	@BeforeEach
	public void setUp() {
		inv = new Inversor("caro");
		
		uno = new plazoFijo (LocalDate.now().minusDays(10), 1000, 2);
		dos = new plazoFijo (LocalDate.now().minusDays(10), 1000, 2);
		tres = new plazoFijo (LocalDate.now().minusDays(10), 1000, 2);
		
		cuatro = new acciones ("caro", 10, 100);
		cinco = new acciones ("caro", 5, 100);
		seis = new acciones ("caro", 2, 100);
		
		inv.agregarInversion(uno);
		inv.agregarInversion(dos);
		inv.agregarInversion(tres);
		inv.agregarInversion(cuatro);
		inv.agregarInversion(cinco);
		inv.agregarInversion(seis);

	}
	
	@Test
	public void testValor() {
		
		assertEquals(4760, inv.valorActual());
		
	}
	
	
}
