package tp03.ejercicio2;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}
	
	private int contarHojasRev (int a) {
		if (this.esHoja()) {
			a++;
		}
		else {
			if (this.tieneHijoIzquierdo()) {
				a = this.getHijoIzquierdo().contarHojasRev(a);
			}
			if (this.tieneHijoDerecho()) {
				a = this.getHijoDerecho().contarHojasRev(a);
			}
		}
		return a;
	}

	public int contarHojas() {
		int a = 0;
		return contarHojasRev(a);
		
	}
	
	private ArbolBinario<T> espejoRev(ArbolBinario<T> esp, ArbolBinario<T> act){
		if (act.tieneHijoDerecho()){
			ArbolBinario<T> a = new ArbolBinario<T>(act.getHijoDerecho().getDato());
			esp.agregarHijoIzquierdo(a);
			esp.espejoRev(esp.getHijoIzquierdo(),act.getHijoDerecho());
		}
		if (act.tieneHijoIzquierdo()){
			ArbolBinario<T> b = new ArbolBinario<T>(act.getHijoIzquierdo().getDato());
			esp.agregarHijoDerecho(b);
			esp.espejoRev(esp.getHijoDerecho(),act.getHijoIzquierdo());
		}							
		
		return esp;
	}
	
    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> ab1 = new ArbolBinario<T>(this.getDato());
    	ArbolBinario<T> ab2 = this;
    	if (ab2 != null) {
    		espejoRev(ab1, ab2);
    	}
		return ab1;
	}
    
    public void leer (ArbolBinario<T> ab) {
    	if (ab != null) {
    	System.out.println(ab.toString());
    	leer(ab.getHijoDerecho());
    	leer(ab.getHijoIzquierdo());}
    }

	public void entreNiveles(int n, int m){
		ListaGenerica<ListaGenerica<T>> listaElem = new ListaEnlazadaGenerica<ListaGenerica<T>> ();
		
		if ((this != null) && (!this.esVacio())){
			ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>(100);
			ListaGenerica<T> listaPorNivel = new ListaEnlazadaGenerica<T> ();
			ArbolBinario <T> arbol = null;
			cola.encolar(this);
			cola.encolar(null);
			while (!cola.esVacia()) {
				if (arbol != null) {
					System.out.println(arbol.getDato());}
				arbol = cola.desencolar();
				if (arbol != null) {
					listaPorNivel.agregarFinal(arbol.getDato());
					if (arbol.tieneHijoIzquierdo()) 
						cola.encolar(arbol.getHijoIzquierdo());
					if (arbol.tieneHijoDerecho())
						cola.encolar(arbol.getHijoDerecho());					
				}
				else {
					listaElem.agregarFinal(listaPorNivel);
					listaPorNivel = new ListaEnlazadaGenerica<T> ();
					
					if (!cola.esVacia())
						cola.encolar(null);
				}
			}
		}
	}

	

}
