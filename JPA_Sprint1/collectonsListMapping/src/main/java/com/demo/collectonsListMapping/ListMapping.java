package com.demo.collectonsListMapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.collectionsListMapping.entity.Address;
import com.demo.collectionsListMapping.entity.employee;


public class ListMapping 
{
    public static void main( String[] args )
    {
    	
    	    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Collection_Type");  
    	        EntityManager em=emf.createEntityManager();  
    	          
    	        em.getTransaction().begin();  
    	          
    	          
    	  
    	          
    	        Address a1=new Address();  
    	        a1.setE_pincode(201301);  
    	        a1.setE_city("Noida");  
    	        a1.setE_state("Uttar Pradesh");  
    	          
    	          
    	          
    	          
    	          
    	        Address a2=new Address();  
    	        a2.setE_pincode(302001);  
    	        a2.setE_city("Jaipur");  
    	        a2.setE_state("Rajasthan");  
    	          
    	      
    	          
    	    employee e1=new employee();  
    	   // e1.setE_id(1);  
    	    e1.setE_name("Vijay");  
    	    e1.getAddress().add(a1);  
    	      
    	    employee e2=new employee();  
    	   // e2.setE_id(2);  
    	    e2.setE_name("John");  
    	    e2.getAddress().add(a2);  
    	      
    	    em.persist(e1);  
    	    em.persist(e2);  
    	      
    	    em.getTransaction().commit();  
    	      
    	    em.close();  
    	    emf.close();  
    	          
    	    }
    	}
    

