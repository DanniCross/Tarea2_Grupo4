package compania.control;

import compania.entidades.*;
import compania.persistencia.*;
import java.util.*;

/**
 * Clase con la lógica para el control de los procesos de la compañia
 * @author José Cruz
 * @version 1.0.2
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
	 * @param identificacion es el código que identifica a un empleado
	 * @param nombre es el nombre completo del empleado a adicionar
	 * @param salarioSemanal es el valor que se le paga semanalmente
	 * @param valorHoras es el valor que se le paga a un empleado por hora trabajada
	 * @param horasTrabajadas es la cantidad de horas que trabaja un empleado
	 * @param ventasRealizadas es la cantidad de ventas que un empleado a realizado
	 * @param tipo que tipo de empleado es: 'a' para asalariado 'c' para por comisión y 'h' para por horas.
	 * @return True si se puede añadir el empleado, en caso contrario retorna False
	 */
	public boolean adicionarEmpleado(String identificacion, String nombre, double salarioSemanal,
									 double valorHoras, int horasTrabajadas, double ventasRealizadas, char tipo) {
		
		Empleado empleadoBuscado = buscarEmpleado(identificacion);
		if (empleadoBuscado == null) {
			Empleado empleadoNuevo = FabricaEmpleado.crearEmpleado(identificacion, nombre, salarioSemanal, 
																	valorHoras, horasTrabajadas, ventasRealizadas, 
																	tipo);
			return this.repositorioCompania.adicionarEmpleado(empleadoNuevo);
		}
		
		return true;
	}
	
	/**
	 * Método que dada una identificación de empleado devuelve el objeto de este empleado
	 * @param identificacion el código que identifica a un empleado 
	 * @return El objeto de tipo empleado si existe y en caso conrario retorna null
	 */
	public Empleado buscarEmpleado(String identificacion) {
		return this.repositorioCompania.buscarEmpleado(identificacion);
	}
	
	/**
	 * Método que obtiene la nomina semanal a pagar a todos los empleados por la compañia
	 * @return el valor total de la nomina
	 */
	public double calcularNomina() {
		List<Empleado> empleados = this.repositorioCompania.consultarEmpleados();
		double nomina = 0;
		for (Empleado empleado: empleados) {
			nomina += empleado.obtenerSalario();
		}
		
		return nomina;
	}
	
	
	
}
