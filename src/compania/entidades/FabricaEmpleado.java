package compania.entidades;

/**
 * Clase con la lógica para crear cualquier objeto de tipo empleado
 * @author Marco Contreras
 * @version 1.0.1
 */
public class FabricaEmpleado {

	/**
	 * Método para crear cualquier objeto de tipo Empleado según los parametros ingresados
	 * @param identificacion es la código que identifica a un empleado
	 * @param nombre es el nombre completo del empleado a crear
	 * @param salarioSemanal es el salario semanal que se le paga a un empelado si es asalariado o por comisión
	 * @param valorHoras es el valor que se le paga por hora a un empleado que trabaja por horas
	 * @param horasTrabajadas es la cantidad de horas que trabaja un empleado si es por horas
	 * @param ventasRealizadas es la cantidad de ventas que ha realizado un empleado si es por comisión
	 * @param tipo indica el tipo de empleado: 'a' asalariado, 'h' por horas o 'c' por comisión.
	 * @return el objeto de tipo empleado que se ha creado
	 */
	public static Empleado crearEmpleado(String identificacion, String nombre, 
										double salarioSemanal,double valorHoras, int horasTrabajadas, 
										double ventasRealizadas, char tipo) {
		Empleado empleado = null;
		switch(tipo) {
		case 'a':
		case 'A': 
			empleado = new EmpleadoAsalariado(identificacion, nombre, salarioSemanal);
			break;
		case 'h':
		case 'H':
			empleado = new EmpleadoHora(identificacion, nombre, valorHoras, horasTrabajadas);
			break;
		case 'c':
		case 'C':
			empleado = new EmpleadoComision(identificacion, nombre, salarioSemanal, ventasRealizadas);
			break;
		}
		
		return empleado;
	}
}
