package compania.entidades;

import javax.persistence.*;

/**
 * Clase con la lógica para manipular la infromación de um empleado que es asalariado
 * @author Marco Contreras
 * @version 1.0
 */
@Entity
@DiscriminatorValue("asalariado")
public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal; 
	
	public EmpleadoAsalariado() {
		
	}
	
	public EmpleadoAsalariado(String identificacion, String nombre, double salarioSemanal) {
		super(identificacion, nombre);
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double obtenerSalario() {
		return salarioSemanal;
	}
}