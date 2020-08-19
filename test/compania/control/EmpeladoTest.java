package compania.control;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmpeladoTest {

	/*
	 * 
	 * Calcular la nomina cuando no hay empleados registrados
	 */
	@Test
	void nominaNoEmpleado() {
		ControlCompania controlCompania = new ControlCompania();
		assertThrows(Exception.class,
				() -> controlCompania.calcularNomina());
	}
	

}
