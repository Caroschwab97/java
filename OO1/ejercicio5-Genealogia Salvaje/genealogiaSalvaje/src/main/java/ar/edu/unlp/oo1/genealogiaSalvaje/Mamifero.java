package ar.edu.unlp.oo1.genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate FechaNacimiento; 
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero (String s) {
		setIdentificador(s);
	}
	public Mamifero() {
		
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		if (madre != null) {
		return madre.getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaMaterna() {
		if (madre != null) {
			return madre.getMadre();
			}
			return null;
	}
	public Mamifero getAbueloPaterno() {
		if (padre != null) {
			return padre.getPadre();
			}
			return null;
	}
	public Mamifero getAbuelaPaterna() {
		if (padre != null) {
			return padre.getMadre();
			}
			return null;

	}
	public boolean tieneComoAncestroA(Mamifero m) {
		if ((madre != null) && (padre!= null)){
			if (madre == m) {
				return true;
			}
			if ((madre.getMadre() != null) && (madre.getMadre() == m)) {
				return true;
			}
			if ((madre.getPadre() != null) && (madre.getPadre() == m)) {
				return true;
			}
			if (padre == m) {
				return true;
			}
			if ((padre.getPadre() != null) && (padre.getPadre() == m)) {
				return true;
			}
			if ((padre.getMadre() != null) && (padre.getMadre() == m)) {
				return true;
			}
		}
		return false;
	}
}
