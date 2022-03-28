package onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetoone.dto.Address;
import onetoone.dto.Branch;

public class FindBranchById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Branch branch=entityManager.find(Branch.class, 1);
		Address address=branch.getAddress();
		
		System.out.println("name :"+branch.getName());
		System.out.println("phone num  :"+branch.getPhone());
		System.out.println("-------------");
		System.out.println("pincode  :"+address.getPin());
		System.out.println("state :"+ address.getState());
		System.out.println("address :"+address.getAddress());
	}

}
