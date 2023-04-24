package ar.edu.unlp.oo1.Ejercicio2_Balanza;

public class Producto {
	
	private double precioPorKilo;
	private double peso;
	private String descripcion;
	
	public Producto() {
		super();
		this.precioPorKilo =0;
		this.peso = 0;
		this.descripcion = "";
	}
	
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
	public void setPrecioPorKilo(double p) {
		this.precioPorKilo = p;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
