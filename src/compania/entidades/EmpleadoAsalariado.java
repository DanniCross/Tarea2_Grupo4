package compania.entidades;
import javax.persistence.*;

/**
 * 
 * @author Marco Contreras
 * @version 1.0
 */

@Entity
@DiscriminatorValue("asalariado")

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal; 
	
	public EmpleadoAsalariado(String identificacion, String nombre, double salarioSemanal) {
		super(identificacion, nombre);
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double obtenerSalario() {
		return salarioSemanal;
	}
}