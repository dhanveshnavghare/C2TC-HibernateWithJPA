package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();//EMPLOYEE CLASS OBJECT
		employee.setName("karan");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();//MANAGER CLASS OBJECT
		manager.setName("shruti");
		manager.setSalary(10000);
		manager.setDepartmentName("HR");
		em.persist(manager);
		
		
		
		em.getTransaction().commit();
		
		
		em.close();
		factory.close();
		System.out.println("Added one employee and manager to database.");
	}
}