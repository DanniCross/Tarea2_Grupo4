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
		ControlCompania buscarEmpleado = gestorBD.find(ControlCompania.class,"123");
		ControlCompania buscarEmpleado2 = gestorBD.find(ControlCompania.class,"124");
		ControlCompania buscarEmpleado3 = gestorBD.find(ControlCompania.class,"125");
		gestorBD.close();
	}
	
	
}
