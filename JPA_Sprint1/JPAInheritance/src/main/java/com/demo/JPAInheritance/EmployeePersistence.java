package com.demo.JPAInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JPAInheritance.entity.ActiveEmployee;
import com.demo.JPAInheritance.entity.RetiredEmployee;

public class EmployeePersistence 
{
    public static void main( String[] args )
    {
    	 
   	      
    		  
    		    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
    		    EntityManager em=emf.createEntityManager();  
    		      
    		    em.getTransaction().begin();  
    		      
    		      
    		ActiveEmployee ae1=new ActiveEmployee(101,"Swetal",10000,5);  
    		ActiveEmployee ae2=new ActiveEmployee(102,"Nandini",12000,7);  
    		  
    		RetiredEmployee re1=new RetiredEmployee(103,"Chandani",5000, 5);  
    		RetiredEmployee re2=new RetiredEmployee(104,"Prasad",4000, 7);  
    		  
    		    em.persist(ae1);  
    		    em.persist(ae2);  
    		      
    		    em.persist(re1);  
    		    em.persist(re2);  
    		      
    		    em.getTransaction().commit();  
    		      
    		    em.close();  
    		    emf.close();  
    }
}
