package onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetoone.dto.Pan;
import onetoone.dto.Person;

public class FindPersonById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Pan pan=entityManager.find(Pan.class, 1);
		
		Person person=pan.getPerson();
		
		System.out.println("pan num :"+pan.getPanNumber());
		System.out.println("county:"+pan.getCountry());
		System.out.println("date :"+pan.getDate());
		System.out.println("_----------------");
		System.out.println(person.getName());
		System.out.println(person.getPhone());
		System.out.println(person.getGender());
		
	}

}
