package onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.Address;
import onetoone.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Branch branch=new Branch();
		branch.setName("JP");
		branch.setPhone(334);
		
		
		Address address=new Address();
		address.setPin(560076);
		address.setState("KA");
		address.setAddress("btm");
		
		
		branch.setAddress(address);
		
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
		
		
	}

}
