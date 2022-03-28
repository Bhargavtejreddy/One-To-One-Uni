package onetoone.controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.Pan;
import onetoone.dto.Person;

public class TestPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("teja");
		person.setPhone(99770);
		person.setGender("male");
		
		Pan pan=new Pan();
		pan.setPanNumber("EEOOP99");
		pan.setDate(LocalDateTime.now());
		pan.setCountry("india");
		
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
