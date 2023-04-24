package ar.edu.unlp.oo1.figurasYCuerpos;

public class Cuadrado extends figura{

		private double lado;

		public double getLado() {
			return lado;
		}

		public void setLado(double lado) {
			this.lado = lado;
		}
		
		public double getPerimetro () {
			return getLado()*4;
		}
		
		public double getArea() {
			return Math.pow(getLado(), 2);
		}
}
