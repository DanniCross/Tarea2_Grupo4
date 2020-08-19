<<<<<<< HEAD:src/compaÃ±ia/entidades/EmpleadoComision.java
package compañia.entidades;
=======
package compania.entidades;
>>>>>>> 4c34cf7ae3783f825d1b37851b450b281f6214e9:src/compania/entidades/EmpleadoComision.java

public class EmpleadoComision extends Empleado{
	
	private final double INTERES = 0.5;
	private double salarioSemanal;
	private double ventasRealizadas;

	public EmpleadoComision(String identificacion, String nombre, double salarioSemanal, double ventasRealizadas) {
		super(identificacion, nombre);
		this.salarioSemanal = salarioSemanal;
		this.ventasRealizadas = ventasRealizadas;
	}

	@Override
	public double obtenerSalario() {
		return salarioSemanal + (ventasRealizadas*INTERES);
	}
}
