package compania.control;

import compania.entidades.Empleado;
import compania.persistencia.*;

/**
 * Clase con la lógica para el control de los procesos de la compañia
 * @author José Cruz
 * @version 1.0
 */
public class ControlCompania {
	
	private RepositorioCompania repositorioCompania;
	
	public ControlCompania() {
		repositorioCompania = new Orm();
	}
	
	public ControlCompania(RepositorioCompania repositorioCompania) {
		this.repositorioCompania = repositorioCompania;
	}
	
	/**
	 * Método que dada la información de un empleado se verifica que no exista con anterioridad
	 * se crea el objeto empleado y se añade a la lista de empleados 
	 * @param identificacion
	 * @param nombre
	 * @param salarioSemanal
	 * @param valorHoras
	 * @param horasTrabajadas
	 * @param ventasRealizadas
	 * @param tipo
	 * @return True si se puede añadir el empleado, en caso contrario retorna False
	 */
	public boolean adicionarEmpleado(String identificacion, String nombre, double salarioSemanal,
									 double valorHoras, int horasTrabajadas, double ventasRealizadas, char tipo) {
		return true;
	}
	
	/**
	 * Método que dada una identificación de empleado devuelve el objeto de este empleado
	 * @param identificacion
	 * @return El objeto de tipo empleado si existe y en caso conrario retorna null
	 */
	public Empleado buscarEmpleado(String identificacion) {
		return null;
	}
	
	/**
	 * Método que obtiene la nomina semanal a pagar a todos los empleados por la compañia
	 * @return el valor total de la nomina
	 */
	public double calcularNomina() {
		return 0;
	}
	
}
