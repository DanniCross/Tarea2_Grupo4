<<<<<<< HEAD:src/compaÃ±ia/entidades/EmpleadoAsalariado.java
package compañia.entidades;
=======
package compania.entidades;
>>>>>>> 4c34cf7ae3783f825d1b37851b450b281f6214e9:src/compania/entidades/EmpleadoAsalariado.java

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