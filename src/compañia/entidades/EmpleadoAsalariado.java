package compañia.entidades;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal; 
	
	public EmpleadoAsalariado(String identificacion, String nombre) {
		super(identificacion, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double obtenerSalario() {
		
		return 0;
	}

	
	
}
