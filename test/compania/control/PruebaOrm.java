package compania.control;

import javax.persistence.*;

import org.junit.jupiter.api.Test;

import compania.entidades.*;




public class PruebaOrm {
	
	public static void main(String[] args) {
	
		
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Compania");
		EntityManager gestorBD = fabrica.createEntityManager();
		gestorBD.getTransaction().begin();
		ControlCompania controlCompania = new ControlCompania();
		controlCompania.adicionarEmpleado("123", "Juan", 170000, 0,0, 0, 'a');
		controlCompania.adicionarEmpleado("124", "Camilo", 0, 20000,60, 0, 'h');
		controlCompania.adicionarEmpleado("125", "Chepe", 160000, 0,0, 500000, 'c');
		gestorBD.persist(controlCompania);
		gestorBD.getTransaction().commit();
		Empleado buscarEmpleado = gestorBD.find(Empleado.class,"123");
		Empleado buscarEmpleado2 = gestorBD.find(Empleado.class,"124");
		Empleado buscarEmpleado3 = gestorBD.find(Empleado.class,"125");
		System.out.println(buscarEmpleado.getNombre());
		System.out.println(buscarEmpleado2.getNombre());
		System.out.println(buscarEmpleado3.getNombre());
		gestorBD.close();
	}
	
	
}
