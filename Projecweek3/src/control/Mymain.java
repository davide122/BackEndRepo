package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mymain {
static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Projecweek3");
	    static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		
	}

}
