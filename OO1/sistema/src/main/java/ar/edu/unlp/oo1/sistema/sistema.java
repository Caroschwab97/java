package ar.edu.unlp.oo1.sistema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sistema {
	
	private List<exportaciones> listExportaciones;
	
	public sistema() {
		listExportaciones = new ArrayList<exportaciones>();
	}
	
	public exportaciones alta(String destino, LocalDate fecha, String nombre) {
		exportaciones e= new exportaciones(destino,fecha,nombre);
		this.listExportaciones.add(e);
		return e;
	}
	
	public exportaciones getPedidoExportacion(String nombreEmpresa) {
		return this.listExportaciones.stream()
				.filter(c -> c.getNombre().equals(nombreEmpresa))
				.findFirst().orElse(null);
	}
	
	public void agregarBienes(exportaciones expor, String descripcion, int unidades, double pesoKG, double valor) {
		bienes b= new bienes(descripcion, unidades, pesoKG,valor);
		expor.agregarBienes(b);
	}
	
	public void agregarServicio(exportaciones expor, String descripcion, double costoS, double costoM) {
		servicios s= new servicios(descripcion, costoS, costoM);
		expor.agregarServicios(s);
	}
	
	public factura facturaFechas (LocalDate fecha1, LocalDate fecha2) {
		List<exportaciones> e =  this.listExportaciones.stream()
				.filter(c -> c.getFactura().getFecha().isBefore(fecha2) && (c.getFactura().getFecha().isAfter(fecha1)))
				.collect(Collectors.toList());
		exportaciones exp = e.stream()
				.max((a1, a2)-> Double.compare(a1.getFactura().getCostoFinal(), a2.getFactura().getCostoFinal())).orElse(null);
		return exp.getFactura();
	}
	
}
