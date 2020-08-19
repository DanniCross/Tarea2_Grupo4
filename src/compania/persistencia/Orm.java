package compania.persistencia;

import java.util.List;
import javax.persistence.*;

import compania.entidades.Empleado;

/**
 * Clase donde se manejará la conexión y las peticiones a la base de datos
 * @author José Cruz
 * @version 1.0.2
 */
public class Orm implements RepositorioCompania {
	
	private EntityManager gestorDB;
	
	public Orm() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Compania");
		gestorDB = fabrica.createEntityManager();
	}

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try	{
			gestorDB.getTransaction().begin();
			gestorDB.persist(empleado);
			gestorDB.getTransaction().commit();
		}
		catch (Exception error)	{
			return false;
		}
		return true;
	}

	@Override
	public Empleado buscarEmpleado(String identificacion) {
		Empleado empleado = gestorDB.find(Empleado.class, identificacion);
		return empleado;
	}
	
	@Override
	
	public boolean eliminarEmpleado(Empleado empleado) {
		
		try	{
			gestorDB.getTransaction().begin();
			gestorDB.remove(empleado);
			gestorDB.getTransaction().commit();
		}
		catch (Exception errorBorrar)	{
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> consultarEmpleados() {
		Query query = gestorDB.createQuery("select e from Empleado e");
		List<Empleado> empleados = query.getResultList();
		return empleados;
	}
	
	/**
	 * Cierra el EntitiyManager cuando se vaya a destruir este objeto
	 */
	@Override
	protected void finalize() {
		gestorDB.close();
	}
	
}
