<<<<<<< HEAD:src/compaÃ±ia/entidades/Empleado.java
package compañia.entidades;
=======
package compania.entidades;
>>>>>>> 4c34cf7ae3783f825d1b37851b450b281f6214e9:src/compania/entidades/Empleado.java

public abstract class Empleado {

	private String identificacion;
	private String nombre;
	
	
	public Empleado(String identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	
	public abstract double obtenerSalario();
}
