package ar.edu.unlp.oo1.figurasYCuerpos;

public class Cuerpo3D {

	private double altura;
	private figura caraBasal;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(figura f) {
		this.caraBasal = f;
	}
	
	public double getVolumen() {
		return altura * this.caraBasal.getArea();
	}
	
	public double getSuperficieExterior () {
		return ((2*this.caraBasal.getArea())+(this.caraBasal.getPerimetro()*getAltura()));
	}
}
