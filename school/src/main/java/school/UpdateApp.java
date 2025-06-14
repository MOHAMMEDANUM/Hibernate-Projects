package school;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class UpdateApp {

		public static void main(String[] args) {
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			
			EntityManager em = emf.createEntityManager();	
			
			EntityTransaction et=em.getTransaction();
			
			Student s = em.find(Student.class,1);
			
//			s.setName("Luffy");
//			s.setEmail("Luffy@gmail.com");
			s.setPassword("Goko001");
			s.setPhone(111111111);
			
			et.begin();
			
			em.merge(s);
			
			et.commit();
			
		}
	}
