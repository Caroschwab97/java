package tp02.ejercicio2;

import tp01.ejercicio1.Alumno;


public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Alumno a = new Alumno ("12345", "carito", "sch",54321, "caro@mail");
		Alumno b = new Alumno ("2345", "carito", "sch",54321, "caro@mail");
		Alumno c = new Alumno ("345", "carito", "sch",54321, "caro@mail");
		Alumno d = new Alumno ("45", "carito", "sch",54321, "caro@mail");
		
		ListaEnlazadaGenerica<Alumno> listAlum = new ListaEnlazadaGenerica<>();
		
		listAlum.agregarFinal(a);
		listAlum.agregarFinal(b);
		listAlum.agregarFinal(c);
		listAlum.agregarFinal(d);
		
		System.out.println(listAlum.toString());
	}

}
