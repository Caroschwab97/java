package ar.edu.unlp.oo1.sistema;

public class bienes extends items {

	private String descripcion;
	private int unidades;
	private double pesoKG;
	private double valor;
	
	public bienes(String descripcion, int unidades, double pesoKG, double valor) {
		super();
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.pesoKG = pesoKG;
		this.valor = valor;
	}

	public int getUnidades() {
		return unidades;
	}

	public double getPesoKG() {
		return pesoKG;
	}

	public double getValor() {
		return valor;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
	
}
