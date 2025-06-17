package showroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarInsertApplication {

	public static void main(String[] args) {
		
		Car c = new Car(0, "BYD", "BYD Seal", "Black", 1200);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(c);
		
		et.commit();
	
	}
}
