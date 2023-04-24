package tp03.ejercicio4;

import tp03.ejercicio2.ArbolBinario;

public class probando {

	public static void main(String[] args) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> ab1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> ab2= new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> ab3 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> ab4 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> ab5 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> ab6 = new ArbolBinario<Integer>(2);
		ab.agregarHijoDerecho(ab3);
		ab.agregarHijoIzquierdo(ab1);
		ab3.agregarHijoDerecho(ab2);
		ab3.agregarHijoIzquierdo(ab5);
		ab1.agregarHijoDerecho(ab4);
		ab1.agregarHijoIzquierdo(ab6);
		
		RedBinariaLlena red = new RedBinariaLlena ();
		
		System.out.println(red.retardoReenvio(ab));
	}
	

}
