package ar.edu.unlp.oo1.OOBnB;

import java.time.LocalDate;

public class reserva {
	
	private DateLapse fecha;
	
	public reserva (LocalDate from, LocalDate to) {
		fecha = new DateLapse (from,to);
	}
	
	public DateLapse getFecha() {
		return this.fecha;
	}
	
}
