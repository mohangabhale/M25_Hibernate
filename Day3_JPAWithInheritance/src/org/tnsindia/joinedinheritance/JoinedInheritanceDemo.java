package org.tnsindia.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver class
public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a sales
		
		Sales s=new Sales();
		s.setSales_id(22);
		s.setPrice(6000.60);
		em.persist(s);
		
		Sales s1=new Sales();
		s1.setSales_id(33);
		s1.setPrice(5500.60);
		em.persist(s1);
		
		//create a dept
		
		SalesDepartment d=new SalesDepartment();
		d.setSales_id(44);
		d.setPrice(5345.90);
		d.setDept_id(1217);
		d.setDept_name("Cosmetics");
		em.persist(d);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();

	}

}
