package tp03.ejercicio3;
import tp03.ejercicio2.ArbolBinario;
import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class ContadorArbol {

	private ArbolBinario<Integer> ab;
	
	public ContadorArbol (ArbolBinario<Integer> ab1) {
		this.ab = ab1;
	}
	
	public ListaDeEnterosEnlazada numerosPares() {
		ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
		ArbolBinario<Integer> arbolito = this.ab;
		if (arbolito != null);
			contar (list,arbolito);
		return list;
	}
	
	private ListaDeEnterosEnlazada contar (ListaDeEnterosEnlazada list, ArbolBinario<Integer> arbolito) {
		if ((arbolito.getDato() % 2) == 0)
			System.out.println(arbolito.getDato());
		if (arbolito.getHijoIzquierdo() != null)
			contar (list,arbolito.getHijoIzquierdo());
		if (arbolito.getHijoDerecho() != null)
			contar (list,arbolito.getHijoDerecho());
		return list;
	}
}
