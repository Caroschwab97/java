package ar.edu.unlp.oo1.ej11_inversor;

public class acciones extends Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	
	
	public acciones(String nombre, int cantidad, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}



	public double valorActual() {
		double aux= this.cantidad * this.valorUnitario;
		return aux;
	}
}
