package compania.entidades;


/**
 * 
 * @author Marco Contreras
 * @version 1.0
 */
public class FabricaEmpleado {
	
	/*
	 * Metodo que dada la información crea el empleado según su tipo
	 * @param identificaicon
	 * @param nombre
	 * @param salarioSemanal
	 * @param valorHoras
	 * @param horasTrabajadas
	 * @param ventasRealizadas
	 * @param tipo
	 * 
	 */

	public static Empleado crearEmleado(String identificacion, String nombre, double salarioSemanal,double valorHoras, int horasTrabajadas, double ventasRealizadas, char tipo) {
		Empleado empleado = null;
		switch(tipo) {
		case 'A': 
			empleado = new EmpleadoAsalariado(identificacion,  nombre,salarioSemanal);
		case 'H':
			empleado = new EmpleadoHora(identificacion, nombre, valorHoras,horasTrabajadas);
		case 'C':
			empleado = new EmpleadoComision(identificacion,nombre,salarioSemanal,ventasRealizadas);
		}
		return empleado;
	}
}
