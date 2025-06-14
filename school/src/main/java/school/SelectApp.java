package school;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class SelectApp {

		public static void main(String[] args) {
			
			EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
			
			EntityManager em = emf.createEntityManager();	
			
			EntityTransaction et=em.getTransaction();
			
			Student s1 =em.find(Student.class,1);
			Student s2 =em.find(Student.class,2);
			
			System.out.println(s1);
			System.out.println(s2);
				
		}
		
	}
