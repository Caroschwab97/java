package ar.edu.unlp.oo1.OOBnB;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class propiedades {
	
	private List<reserva> fechasReservadas; 
	private String nombre;
	private double precioXNoche;
	private String direccion;
	private String descripcion;
	
	public propiedades (String n, double p, String dir, String d) {
		fechasReservadas = new ArrayList<reserva>();
		this.nombre=n;
		this.precioXNoche=p;
		this.direccion=dir;
		this.descripcion=d;
	}
	
	public List<reserva> getLibre(LocalDate from, LocalDate to) {
		DateLapse d = new DateLapse(from,to);
		return  fechasReservadas.stream()
				.filter(a->a.getFecha().equals(d)) //si es igual a la que mandaron, no esta libre
				.collect(Collectors.toList());//si es d
	}
}
//si esto devuelve algo la propiedad no esta disponible