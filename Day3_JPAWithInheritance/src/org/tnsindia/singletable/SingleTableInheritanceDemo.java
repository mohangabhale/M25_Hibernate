package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create an emp1
		Employee e=new Employee();
		e.setEmpID(101);
		e.setName("mohan");
		e.setSalary(20000.20);
		em.persist(e);
		
		//Create an emp1
		Employee e1=new Employee();
		e1.setEmpID(102);
		e1.setName("Supriya");
		e1.setSalary(35000.40);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setEmpID(103);
		m.setName("Mangesh");
		m.setSalary(120000.00);
		m.setDeptname("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	}
}