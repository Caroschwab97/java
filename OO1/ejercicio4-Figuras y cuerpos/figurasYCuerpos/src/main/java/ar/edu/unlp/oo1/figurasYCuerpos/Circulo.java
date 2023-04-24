package ar.edu.unlp.oo1.figurasYCuerpos;

public class Circulo extends figura {

	private double diametro;
	private double radio;
	
	public Circulo () {
		
	}
	
	public double getDiametro() {
		return diametro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}
	
	public double getPerimetro() {
		return Math.PI*getDiametro();
	}
	
	public double getArea() {
		double r = Math.pow(getRadio(), 2);
		return (Math.PI * r );
	}
}
