package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class startall {
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestProject");
		static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
	}

}
