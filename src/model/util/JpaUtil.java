package model.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaUtil {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("fuctura_rf");
	
	//static {
	//	factory = Persistence.createEntityManagerFactory("jpaProject");
	//}
	
	/**
	 * Metodo responsavel por retornar um entityManager
	 *@return EntityManager
	 */
	public EntityManager getEntityManager() {
		return factory.createEntityManager();
		
	}
	
	public void closeEntityManager() {
		factory.close();
	}
}
