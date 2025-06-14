package school;

	import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class InsertApp {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Student s = new Student(0,"Goku","Goku@gmail.com",17171717,"Goku008");
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			
			EntityManager em = emf.createEntityManager();	
			
			EntityTransaction et=em.getTransaction();
			
			et.begin();
			
			em.persist(s);
			
			et.commit();

		}
	}
