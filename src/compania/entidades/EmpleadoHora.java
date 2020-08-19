package compania.entidades;

import javax.persistence.*;

@Entity
@DiscriminatorValue("hora")
/*
 * Clase con el funcionamiento de los empleados por horas
 * @author Juan Camilo Gómez
 * @version 1.0
 */
public class EmpleadoHora extends Empleado{
	
	private double valorHora;
	private int horasTrabajadas;

	public EmpleadoHora(String identificacion, String nombre, double valorHora, int horasTrabajadas) {
		super(identificacion, nombre);
		this.valorHora = valorHora;
		this.horasTrabajadas = horasTrabajadas;
		
	}
	
	@Override
	public double obtenerSalario() {
		if (horasTrabajadas > 40) {
			return (valorHora*horasTrabajadas) + 200000;
		}
		return (valorHora*horasTrabajadas);
	}
}
