package com.demo.CascadeRemove;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.CascadeRemove.entity.studentEntity;




public class CascadeRemove 
{
    public static void main( String[] args )
    {
    	
    	    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpaCascadePersist" );  
    	         
    	         EntityManager em = emf.createEntityManager( );  
    	       em.getTransaction().begin();  
    	 
    	          
    	         studentEntity s=em.find(studentEntity.class, 101);  
    	        em.remove(s);  
    	           
    	         
    	         em.getTransaction().commit();  
    	 
    	         em.close( );  
    	         emf.close( );  
    	    }
    	}
    

