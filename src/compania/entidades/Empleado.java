package compania.entidades;
<<<<<<< HEAD

=======
>>>>>>> e136c932ab95feb31b9968684c94a6ef66685470

public abstract class Empleado {

	private String identificacion;
	private String nombre;
	
	
	public Empleado(String identificacion, String nombre) {
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	
	public abstract double obtenerSalario();
}
