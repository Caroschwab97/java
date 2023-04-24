package ar.edu.unlp.oo1.correo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test1 {
	
	private mail m;
	private carpeta a,b;
	private correo d,e,f;
	private archivo g;
	@BeforeEach
	public void setUp() {
		g= new archivo ("archivo");
		
		m = new mail ();
		
		a= new carpeta();
		b= new carpeta();
		
		d= new correo ( "cuerpo","1", g);
		e= new correo ( "cuerpo","2", g);
		f= new correo ( "cuerpo","3", g);
	}
	
	@Test
	public void cambio() {

		a.agregar(e);
		assertTrue(a.esta(e));
		m.agregarCarpeta(a);
		m.agregarCarpeta(b);
		m.mover(e, a, b);
		assertTrue(b.esta(e));
		assertFalse(a.esta(e));
		
	}
	
	@Test
	public void buscar() {
		a.agregar(d);
		a.agregar(e);
		b.agregar(f);
		
		m.agregarCarpeta(a);
		m.agregarCarpeta(b);
		
		
		assertEquals("1", m.buscar("1").getTitulo() );
	}
}
