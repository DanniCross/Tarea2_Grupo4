package compania.control;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmpeladoTest {

	/*
	 * Prueba de obtener la nomina cuando no existen empleados
	 */
	@Test
	void nominaNoEmpleado() {
		ControlCompania controlCompania = new ControlCompania();
		double resultado = controlCompania.calcularNomina();
		assertEquals(0,resultado);
	}
	

}
