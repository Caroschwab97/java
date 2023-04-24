package tp01.ejercicio1;

public class Alumno {

	String legajo;
	String nombre;
	String apellido;
	int dni;
	String email;
	
	public Alumno () {
		
	}
	public Alumno(String legajo, String nombre, String apellido, int dni, String email) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", email=" + email + "]";
	}

	

}
