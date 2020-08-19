package compania.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase donde se realizan pruebas par la nómina cuando no hay empleados creados
 * @author Marco Contreras
 * @version 1.0.1
 */
class SinNominaTest {

	/**
	 * Método para probar el funciomaiento del calculo de la nómina cuando no hay empleados
	 */
	@Test
	void nominaNoEmpleado() {
		ControlCompania controlCompania = new ControlCompania();
		assertThrows(Exception.class,
				() -> controlCompania.calcularNomina());
	}

}
