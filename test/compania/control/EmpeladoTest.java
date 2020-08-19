package compania.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpeladoTest {

	/*
	 * 
	 */
	
	@Test
	void nominaNoEmpleado() {
		ControlCompania controlCompania = new ControlCompania();
		double resultado = controlCompania.calcularNomina();
		assertEquals(0,resultado);
	}
	

}
