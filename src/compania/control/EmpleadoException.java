package compania.control;

/**
 * Excepción que controla errores de negocio en cuanto a los empleados
 * @author José Cruz
 * @version 1.0
 */
@SuppressWarnings("serial")
public class EmpleadoException extends Exception {
	
	public EmpleadoException() {
		
	}
	
	public EmpleadoException(String mensaje) {
		super(mensaje);
	}

}
