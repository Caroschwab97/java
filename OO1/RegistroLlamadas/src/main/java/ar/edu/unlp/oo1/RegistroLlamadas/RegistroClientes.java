package ar.edu.unlp.oo1.RegistroLlamadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroClientes {
	private List<Cliente> clientes;
	private List<Integer> numerosTelefonicos;
	
	public RegistroClientes () {
		clientes = new ArrayList<Cliente>();
		numerosTelefonicos = new ArrayList<Integer>();
	}
	
	public Factura facturar (Cliente c, LocalDate inicio, LocalDate fin) {
		if (clientes.contains(c)) {
			c.getFactura(inicio, fin);
		}
		System.out.println("el cliente no existe");
		return null;
	}
	
	public void agregarNumero (int numero) {
		this.numerosTelefonicos.add(numero);
	}
	
	public PersonaFisica altaPersonaFisica (int dni, String nombre, String dir) {
		if (!this.numerosTelefonicos.isEmpty()) {
			PersonaFisica pf = new PersonaFisica(nombre,dir, this.numerosTelefonicos.get(0),dni);
			this.numerosTelefonicos.remove(0);
			this.clientes.add(pf);
			return pf; }
		System.out.println("no quedan numeros");
		return null;
	}
	
	public PersonaJuridica altaPersonaJuridica (String nombre, String dir, int cuit, String tipo) {
		if (!this.numerosTelefonicos.isEmpty()) {
			PersonaJuridica pj = new PersonaJuridica(nombre,dir, this.numerosTelefonicos.get(0),cuit, tipo);
			this.numerosTelefonicos.remove(0);
			this.clientes.add(pj);
			return pj; }
		System.out.println("no quedan numeros");
		return null;
	}
	
	public Cliente getCliente (int indice) {
		return clientes.get(indice);
	}
}
