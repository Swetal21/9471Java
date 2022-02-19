package com.demo.JPQLFetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.JPQLFetch.entity.Student;

public class FetchColumn 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
                  
        Query query = em.createNamedQuery("find name");  
        @SuppressWarnings("unchecked")  
      List<Student> list =query.getResultList();  
        System.out.println("Student id"+" "+"Student Name"+" "+"Student age");  
        for(Student s:list) {  
              
           System.out.println(s.getS_id()+"         "+s.getS_name()+"             "+s.getS_age());  
        
             
        }  
          
        em.getTransaction().commit();
        em.close();  
        emf.close();    
    }
}
