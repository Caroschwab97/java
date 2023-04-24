package ar.edu.unlp.oo1.Empresa;

import java.time.LocalDate;

public class Empleado {
	//Se indica el nombre, apellido, CUIL y fecha de nacimiento. Se indica si tiene cónyuge a cargo. Se indica si tiene hijos a cargo
		private String nombre;
		private String apellido;
		private int cuil;
		private LocalDate nacimiento;
		private double hijosACargo;
		private double conyugeACargo;
		
		public Empleado(String nombre, String apellido, int cuil, LocalDate nacimiento, double hijosACargo,
				double conyugeACargo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.cuil = cuil;
			this.nacimiento = nacimiento;
			this.hijosACargo = hijosACargo;
			this.conyugeACargo = conyugeACargo;
			
		}
		
}
