package showroom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CarSelectApplication {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c=em.find(Car.class,1);
		
	
//		Selecting one object
		System.out.println(c);
		
		
//		Selecting all objects
		
		Query q = em.createNamedQuery("select c from Car c");
		
		List <Car> cars = q.getResultList();
		
		for(Car car:cars) {
			System.out.println(car);
		}
		
		
	}
}
