package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String nombre;
	private String direccion;
	private int telefono;
	private List<Llamada> llamadas;
	
	
	public Cliente(String nombre, String direccion, int telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.llamadas = new ArrayList<Llamada>();
	}

	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract Factura getFactura(LocalDate inicio, LocalDate fin);
	
	public double calcularMonto(LocalDate inicio, LocalDate fin) {
		double montoTotal = llamadas.stream()
				.filter(l -> l.getFecha().isAfter(inicio))
				.filter(l -> l.getFecha().isBefore(fin))
				.filter(l -> l.getTelefonoLlama() == this.telefono)
				.mapToDouble(l -> l.getMontoLlamada())
				.sum();
		return montoTotal;
	}
	
	public LlamadasLocales registrarLlamadaLocal (int hora, int duracion, int telefonoLlama, int telefonoRecibe) {
		LlamadasLocales l = new LlamadasLocales (LocalDate.now(),hora, duracion,telefonoLlama, telefonoRecibe);
		llamadas.add(l);
		return l;
	}
	
	
	public LlamadasInterurbanas registrarLlamadaInterUrbana (int hora, int duracion, int telefonoLlama, int telefonoRecibe, double distancia) {
		LlamadasInterurbanas lu = new LlamadasInterurbanas (LocalDate.now(),hora, duracion,telefonoLlama, telefonoRecibe,distancia);
		llamadas.add(lu);
		return lu;
	}

	public LlamadasInternacionales registrarLlamadaInternacional(int hora, int duracion, int telefonoLlama, int telefonoRecibe,String origen, String destino) {
		LlamadasInternacionales ln = new LlamadasInternacionales(LocalDate.now(),hora, duracion,telefonoLlama, telefonoRecibe,origen, destino);
		llamadas.add(ln);
		return ln;
	}
}
