package compania.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NominaTest {
	
	/*
	 * @author Marco Contreras
	 * @Version 1.0
	 */
	
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
