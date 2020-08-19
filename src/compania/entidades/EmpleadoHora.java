package compania.entidades;

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
