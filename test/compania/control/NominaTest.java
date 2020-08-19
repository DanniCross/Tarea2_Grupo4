package compania.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la nomina cuando existen empleados
 * @author Marco Contreras
 * @version 1.0
 */
class NominaTest {
	
	/*
	 * Prueba para calcular la nomina con los empleados creados
	 */
	@Test
	void CalcularNominaEmpleados() throws EmpleadoException {
		ControlCompania controlCompania = new ControlCompania();
		double resultado = controlCompania.calcularNomina();
        assertEquals(1755000,resultado);
	}

}
