package tp02.ejercicio3;

public class ColaGenerica<E> {

	private int apuntador;
	private int numElementos;
	private E elementos[] ;
	
	@SuppressWarnings("unchecked")
	public ColaGenerica(int elem) {
		this.numElementos = elem;
		this.apuntador = -1;
		this.elementos = (E[]) new Object [this.numElementos];
	}
	
	public void encolar (E elem) {
		if (this.apuntador == this.numElementos-1) {
			System.out.println("cola llena");
	}
		else
			apuntador++;
			elementos[apuntador] = elem;
	}
	
	public E desencolar () {
		if (this.numElementos == -1) {
			System.out.println("no hay elementos en la cola");
			return null;
		}
		else {
			E elemen = elementos[0];
			for (int i=0; i<numElementos-1; i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.elementos[this.apuntador] = null;
			this.apuntador--;
			return elemen;
		}
	}
	
	public E tope() {
		return elementos[0];
	}
	
	public boolean esVacia() {
		if (apuntador == -1) {
			return true;
		}
		else
			return false;
	}
}
