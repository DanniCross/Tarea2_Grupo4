<<<<<<< HEAD:src/compaÃ±ia/entidades/FabricaEmpleado.java
package compañia.entidades;

=======
package compania.entidades;
>>>>>>> 4c34cf7ae3783f825d1b37851b450b281f6214e9:src/compania/entidades/FabricaEmpleado.java

public class FabricaEmpleado {

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
