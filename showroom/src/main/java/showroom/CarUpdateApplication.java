package showroom;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarUpdateApplication {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Car c=em.find(Car.class,1);
		
		c.setName("");
		c.setBrand("");
		c.setCc(0);
		c.setColor("");
		
		et.begin();
		
		em.merge(c);
		
		et.commit();
	}
	
}
