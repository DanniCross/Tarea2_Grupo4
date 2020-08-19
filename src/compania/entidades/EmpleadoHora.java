<<<<<<< HEAD:src/compaÃ±ia/entidades/EmpleadoHora.java
package compañia.entidades;
=======
package compania.entidades;
>>>>>>> 4c34cf7ae3783f825d1b37851b450b281f6214e9:src/compania/entidades/EmpleadoHora.java

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
			return (valorHora*horasTrabajadas)+200000;
		}
		return (valorHora*horasTrabajadas);
	}
}
