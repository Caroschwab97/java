package tp02.ejercicio3;

public class PilaGenerica <E>{
	
	private int apuntador;
	private int numElementos;
	private E elementos[];
	
	public PilaGenerica(int elem) {
		this.numElementos = elem;
		this.apuntador = -1;
		this.elementos = (E[]) new Object [this.numElementos];
	}
	
	public void apilar(E elemen) {
		this.elementos[this.apuntador++]= elemen;
	}
	
	public E desapilar() {
		E elemen = this.elementos[this.apuntador];
		this.elementos[this.apuntador] = null;
		this.apuntador--;
		return elemen;
	}
	
	public E tope() {
		return this.elementos[this.apuntador];
	}
	
	public boolean esVacia() {
		if (this.apuntador == -1) {
			return true;
		}
		else
			return false;
	}
}
