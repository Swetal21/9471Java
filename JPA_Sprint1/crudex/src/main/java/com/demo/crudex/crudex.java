package com.demo.crudex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.crudex.entity.Player;

public class crudex 
{
    public static void main( String[] args )
    {
    	//crudex.createRecord(); 
		//crudex.retrieveRecord(); 
		//crudex.updateRecord(); 
		//crudex.deleteRecord(); 
		//crudex.queryRecords();
		//crudex.findByNamedQuery();
		crudex.findByFuzzyNamedQuery();
}



private static void createRecord() {
	try {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_CRUD");  
    EntityManager em=emf.createEntityManager();  
      
    em.getTransaction().begin();
    Calendar c = new GregorianCalendar();
    
	Player 	p1 = new Player();
			p1.setLoginName("Swetal");
			p1.setEmailAddress("ninaveswetal.com");
			p1.setPassword("Swetal@210");
			p1.setLastAccessTime(new Date());
			p1.setRegistrationDate(new java.util.GregorianCalendar(2017,12,28));
			p1.setVerified(true);
			
			
	Player 	p2 = new Player();
			p2.setLoginName("Nandini");
			p2.setEmailAddress("nandini@gmail.com");
			p2.setPassword("nandini@210");
			p2.setLastAccessTime(new Date());
			p2.setRegistrationDate(new java.util.GregorianCalendar(2018,5,10));
			p2.setVerified(true);
			
	Player 	p3 = new Player();
			p3.setLoginName("Chandani");
			p3.setEmailAddress("chandani@gmail.com");
			p3.setPassword("chandani@210");
			p3.setLastAccessTime(new Date());
			p3.setRegistrationDate(new java.util.GregorianCalendar(2016,07,14));
			p3.setVerified(true);
			
			
    
    Player 	p4 = new Player();
			p4.setLoginName("Ayush");
			p4.setEmailAddress("ayush@gmail.com");
			p4.setPassword("ayush@210");
			p4.setLastAccessTime(new Date());	// can add (new java.util.Date());
			p4.setRegistrationDate(c); // can add (new java.util.GregorianCalendar(2020,07,14));
			p4.setVerified(false);
			
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.persist(p4);
			em.getTransaction().commit();
			
			Query query =  em.createQuery("Select p1 from Player p1");  
	         @SuppressWarnings("unchecked")  
	       List<Player> plist =query.getResultList();  
	         System.out.println("Player Details :");  
	         for(Player p:plist) {
	            System.out.println(p.getId() + " " + p.getEmailAddress() + " " + p.getLastAccessTime() + " " + p.getLoginName() + " " + p.getPassword() 
	            + " " + p.getRegistrationDate() + " " + p.getVerified());     
	         }
			
			em.close();
			emf.close();
	}
	catch(Exception e) {}
	}



private static void retrieveRecord() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();

	Long key = Long.valueOf(1);
	Player p = em.find(Player.class, key);
	System.out.println(p.getPassword() + " " + p.getLoginName());

	em.getTransaction().commit();
	em.close();
	emf.close();
}

public static void updateRecord() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin(); 

	Long key = Long.valueOf(1);
	Player p = em.find(Player.class, key);
	p.setPassword("swetalninave");

	em.getTransaction().commit();
	em.close();
	emf.close();
}

public static void deleteRecord() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
    
	Long key = Long.valueOf(4);
	Player p = em.find(Player.class, key);
	em.remove(p); // record is deleted

	em.getTransaction().commit();
	em.close();
	emf.close();
}
public static void queryRecords() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();

	Query query = em.createQuery("select distinct p from Player as p", Player.class);
	

	List<Player> players = query.getResultList();

	for (Player p : players) {
		System.out.println("The password is :" + p.getPassword());
	}

	for (int i = 0; i < players.size(); i++) {
		Player player = players.get(i);
		System.out.println(player.getLoginName());
	}
	em.flush();		// to clean memory of buffer same like clean project 
	//entityManager.detach(arg0);h();
	em.getTransaction().commit();
}

public static void findByNamedQuery() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();

	Query query=  em.createNamedQuery("Player.findByPASS");
	query.setParameter("pass", "nandini@gmail.com");		// yeh tha iss line peh("email", "tinathorat141@gmail.com");
	List<Player> players = query.getResultList();

	for (Player p : players) {
		System.out.println(p);
	}

	for (int i = 0; i < players.size(); i++) {
		Player p = players.get(i);
		System.out.println(p.getLoginName());
	}
	
	em.getTransaction().commit();
}

public static void findByFuzzyNamedQuery() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();

	Query query=  em.createNamedQuery("Player.findByFuzzyEmail");
	query.setParameter("email", "%2899%");	// to be checked
	List<Player> players = query.getResultList();

	for (Player p : players) {
		System.out.println(p);
	}

	for (int i = 0; i < players.size(); i++) {
		Player p = players.get(i);
		System.out.println(p.getLoginName());
	}
	em.getTransaction().commit();
}






    
}
