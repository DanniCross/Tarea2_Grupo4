package compañia.entidades;

public abstract class Empleado {

	private String identificacion;
	private String nombre;
	
	
	public Empleado(String identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	
	public abstract double obtenerSalario();
	
	
}
