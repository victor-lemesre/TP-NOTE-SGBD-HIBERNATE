package bddutils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityClass {
	private static EntityManagerFactory emf;
	public static EntityManager em;

	public static void init() {
		emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();

	}

	public static void close() {
		em.close();
		emf.close();
	}

}
