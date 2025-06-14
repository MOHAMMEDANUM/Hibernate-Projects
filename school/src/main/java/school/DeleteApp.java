package school;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class DeleteApp {

		public static void main(String[] args) {
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			
			EntityManager em = emf.createEntityManager();	
			
			EntityTransaction et=em.getTransaction();
			
			Student s = em.find(Student.class,11);
			
			et.begin();
			
			em.remove(s);
			
			et.commit();
		}
		
	}
