package compania.entidades;

import javax.persistence.*;

@Entity
@DiscriminatorValue("comision")
/*
 * Clase con el funcionamiento de los empleados por comisiones
 * @author Juan Camilo Gómez
 * @version 1.0
 */
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
