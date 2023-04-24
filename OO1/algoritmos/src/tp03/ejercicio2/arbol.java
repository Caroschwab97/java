package tp03.ejercicio2;

import tp02.ejercicio1.ListaDeEnterosConArreglos;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
import tp03.ejercicio3.ContadorArbol;

public class arbol {

	public static void main(String[] args) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> ab1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> ab2= new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> ab3 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> ab4 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> ab5 = new ArbolBinario<Integer>(6);
		ab.agregarHijoDerecho(ab1);
		ab1.agregarHijoDerecho(ab2);
		ab.agregarHijoIzquierdo(ab3);
		ab3.agregarHijoDerecho(ab4);
		ab2.agregarHijoIzquierdo(ab5);
		
		ContadorArbol abcont = new ContadorArbol (ab);
		
		ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
		
		list = abcont.numerosPares();
		if (list !=null)
			list.leerLista(list);
	}

}
