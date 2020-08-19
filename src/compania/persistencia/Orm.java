package compania.persistencia;

import javax.persistence.*;

/**
 * Clase donde se manejará la conexión y las peticiones a la base de datos
 * @author José Cruz
 * @version 1.0
 */
public class Orm implements RepositorioCompania {
	
	private EntityManager gestorDB;
	
	public Orm() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("Compania");
		gestorDB = fabrica.createEntityManager();
	}
	
}
