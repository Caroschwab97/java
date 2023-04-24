package tp03.ejercicio4;

import tp03.ejercicio2.*;

public class RedBinariaLlena {

	public int retardoReenvio (ArbolBinario<Integer> ab) {
		int aux = ab.getDato();
		int HI =0 , HD =0;
		
		
		return recorrer (ab,aux, HI,HD);
	}
	
	private int recorrer (ArbolBinario<Integer> ab, int aux,int HI, int HD) {
		if (!ab.esHoja()) {
			aux += ab.getHijoIzquierdo().getDato();
			HI = recorrer (ab.getHijoIzquierdo(),aux,HI,HD);
			aux = aux - ab.getHijoIzquierdo().getDato();
			aux += ab.getHijoDerecho().getDato();
			HD = recorrer (ab.getHijoDerecho(),aux,HI,HD);
			if (HI < HD)
				return HD;
			else
				return HI;
		} 
		
		return aux;
	}
}
