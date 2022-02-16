package com.demo.JpaSports;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JpaSports.entity.Player;
import com.demo.JpaSports.entity.Team;

public class JpaSports 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Player_details");
	    EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();

	    Team team = new Team();
	    Player p1 = new Player();
	    Player p2 = new Player();

	    em.persist(team);
	    em.persist(p1);
	    em.persist(p2);

	    team.setName("Mumbai Indians");
	    p1.setNickName("Rohit");
	    p1.setTeam(team);
	    p2.setNickName("Bumrah");
	    p2.setTeam(team);
	    
	    
	    Team team1 = new Team();
	    Player p3 = new Player();
	    Player p4 = new Player();

	    em.persist(team1);
	    em.persist(p3);
	    em.persist(p4);

	    team1.setName("Chennai ");
	    p3.setNickName("Dhoni");
	    p3.setTeam(team1);
	    p4.setNickName("Raina");
	    p4.setTeam(team1);
	    em.getTransaction().commit();
	
    }
}
