package compañia.entidades;

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
