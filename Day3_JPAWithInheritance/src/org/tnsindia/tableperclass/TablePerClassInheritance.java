package org.tnsindia.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//driver class
public class TablePerClassInheritance {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a vehicle
		
		Vehicle v=new Vehicle();
		v.setVehicle_no(1234);
		v.setVehicle_name("Mercedes");
		v.setVehicle_type("Four wheeler");
		em.persist(v);
		
		//create a vehicle
		
		Vehicle v1=new Vehicle();
		v1.setVehicle_no(5234);
		v1.setVehicle_name("lamborghini");
		v1.setVehicle_type("Four wheeler");
		em.persist(v1);
		
		
		//create a car
		
		Car c=new Car();
		c.setVehicle_no(3245);
		c.setVehicle_name("Alto");
		c.setVehicle_type("four-wheeler");
		c.setPrice(150000);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();

	}

}
