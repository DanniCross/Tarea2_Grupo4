package compania.control;

import javax.persistence.*;

import org.junit.jupiter.api.Test;

import compania.entidades.*;

/**
 * Clase donde se prueba el funcionamiento de la persistencia a través de un main
 * @author Marco Contreras
 * @version 1.0.1
 */
public class PruebaOrm {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Compania");
		EntityManager gestorBD = fabrica.createEntityManager();
		EntityManager gestorBD2 = fabrica.createEntityManager();
		EntityManager gestorBD3 = fabrica.createEntityManager();
		
		Empleado asalariado = new EmpleadoAsalariado("136", "Juan", 170000);
		gestorBD.getTransaction().begin();
		gestorBD.persist(asalariado);
		gestorBD.getTransaction().commit();
		Empleado buscarEmpleado = gestorBD.find(Empleado.class,"136");
		gestorBD.close();
		
		Empleado porHora = new EmpleadoHora("137", "Camilo", 20000, 60);
		gestorBD2.getTransaction().begin();
		gestorBD2.persist(porHora);
		gestorBD2.getTransaction().commit();
		Empleado buscarEmpleado2 = gestorBD2.find(Empleado.class,"137");
		gestorBD2.close();
		
		Empleado porComision = new EmpleadoComision("138", "Chepe", 160000, 500000);
		gestorBD3.getTransaction().begin();
		gestorBD3.persist(porComision);
		gestorBD3.getTransaction().commit();
		Empleado buscarEmpleado3 = gestorBD3.find(Empleado.class,"138");
		gestorBD3.close();
		
		System.out.println(buscarEmpleado.getNombre());
		System.out.println(buscarEmpleado2.getNombre());
		System.out.println(buscarEmpleado3.getNombre());
		
		/*
		ControlCompania control = new ControlCompania();
		control.eliminarEmpleado();*/
		
	}
	
	
}
