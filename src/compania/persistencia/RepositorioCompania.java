package compania.persistencia;

import compania.entidades.Empleado;

/**
 * Interfaz que controla los métodos de manejro de empleados para la persistecia
 * @author José Cruz
 * @version 1.0.1
 */
public interface RepositorioCompania {

	/**
	 * Método que adiciona un nuevo empleado al repositorio para hacerlo persistente
	 * @param empleado objeto que se va a guardar, debe ser diferente de null
	 * @return un valor booleano indicando si se pudo guardar o no
	 */
	public abstract boolean adicionarEmpleado(Empleado empleado);
	
	/**
	 * Método que dada la identificación de un empleado busca si existe
	 * @param identificacion el código que identifica a un empleado
	 * @return un objeto de tipo empleado o null
	 */
	public abstract Empleado buscarEmpleado(String identificacion);
	
	
}