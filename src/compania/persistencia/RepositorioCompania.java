package compania.persistencia;

import java.util.List;

import compania.entidades.Empleado;

/**
 * Interfaz que controla los métodos de manejro de empleados para la persistecia
 * @author José Cruz
 * @version 1.0.3
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
	
	/**
	 * Método que dado un empleado lo borra de la persistencia
	 * @param empleado el empleado a eliminar
	 * @return un booleano indicando si se pudo eliminar o no el empleado
	 */
	public abstract boolean eliminarEmpleado(Empleado empleado);
		
	/**
	 * Método que obtiene la lista de empleados existentes
	 * @return la lista de empleados
	 */
	public abstract List<Empleado> consultarEmpleados(); 
}