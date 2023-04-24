package ar.edu.unlp.oo1.OOBnB;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.ChronoUnit.YEARS;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse (LocalDate f, LocalDate t) {
		this.from = f;
		this.to = t;
	}
	
	public LocalDate getFrom () {
		return this.from;
	}
	
	public LocalDate getTo () {
		return this.to;
	}
	
	public int sizeInDays () {
		return (int) this.getFrom().until(this.getTo(), DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return ((other.isBefore(to)) && (other.isAfter(from))) ;
	}
	

	
	
	
	}

	

