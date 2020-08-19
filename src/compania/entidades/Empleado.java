package compania.entidades;

import javax.persistence.*;

/**
 * 
 * @author Marco Contreras
 * @version 1.0
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	@Id
	private String identificacion;
	private String nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	
	/*
	 *Funcion encargada de obtener el salario de los empleados 
	 *@return el valor del salario del empleado
	 */
	public abstract double obtenerSalario();
	
	public String getNombre() {
		return this.nombre;
	}
}
