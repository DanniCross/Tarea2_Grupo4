package compania.entidades;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	@Id
	private String identificacion;
	private String nombre;
	
	
	public Empleado(String identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	
	public abstract double obtenerSalario();
}
