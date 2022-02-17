package com.demo.JpaCriteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.demo.JpaCriteria.entity.Student;

public class Criteria 
{
    public static void main( String[] args )
    {
    	
    	//Criteria.selectSingleRecord();
    	//Criteria.selectMultiRecords();
    	//criteria.selectASCOrderByRecords();
    	Criteria.selectDSCOrderByRecords();
    }
    
           
    
		private static void selectSingleRecord() {
    		  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
              EntityManager em = emf.createEntityManager();  
              em.getTransaction().begin( );
              Student s2=new Student();
              s2.setS_age(22);
              s2.setS_name("Swetal");
              em.persist(s2);
              
              Student s3=new Student();
              s3.setS_age(22);
              s3.setS_name("Nandini");
              em.persist(s3);
             
              Student s4=new Student();
              s4.setS_age(21);
              s4.setS_name("Chandni");
              em.persist(s4);

              
              CriteriaBuilder cb=em.getCriteriaBuilder();  
              CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
                
              Root<Student> stud=cq.from(Student.class);  
               
              //cq.multiselect(stud.get("s_name")); 
              cq.select(stud);
              CriteriaQuery<Student> select = cq.select(stud);  
              TypedQuery<Student> q = em.createQuery(select);  
              List<Student> list = q.getResultList(); 
           
      
              System.out.println("s_id");  
                   
                
              for(Student s:list)  
              {  
              System.out.println(s.getS_id() + " " + s.getS_name() + " " + s.getS_age());  
          
              }  
                
              em.getTransaction().commit();  
              em.close();  
              emf.close(); 
 }
    	 
		
		
		private static void selectMultiRecords() {
  		  EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
            EntityManager em = emf.createEntityManager();  
            em.getTransaction().begin( );

            Student s2=new Student();
            s2.setS_age(22);
            s2.setS_name("Swetal");
            em.persist(s2);
            
            Student s3=new Student();
            s3.setS_age(22);
            s3.setS_name("Nandini");
            em.persist(s3);
           
            Student s4=new Student();
            s4.setS_age(21);
            s4.setS_name("Chandni");
            em.persist(s4);
            CriteriaBuilder cb=em.getCriteriaBuilder();  
            CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
              
            Root<Student> stud=cq.from(Student.class);  
             
            cq.multiselect(stud.get("s_id"), stud.get("s_name"));	//, stud.get("s_age")); 
           
            CriteriaQuery<Student> select = cq.select(stud);  
            TypedQuery<Student> q = em.createQuery(select);  
            List<Student> list = q.getResultList(); 
         
    
            System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
                 
              
            for(Student s:list)  
            {  
            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
        
            }  
              
            em.getTransaction().commit();  
            em.close();  
            emf.close();  
  	  }
		
		private static void selectASCOrderByRecords() {
			
	         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	         EntityManager em = emf.createEntityManager();  
	          			   em.getTransaction().begin( );  
	          			 Student s2=new Student();
	          	        s2.setS_age(22);
	          	        s2.setS_name("Swetal");
	          	        em.persist(s2);
	          	        
	          	        Student s3=new Student();
	          	        s3.setS_age(22);
	          	        s3.setS_name("Nandini");
	          	        em.persist(s3);
	          	       
	          	        Student s4=new Student();
	          	        s4.setS_age(21);
	          	        s4.setS_name("Chandni");
	          	        em.persist(s4);
	          				
		     CriteriaBuilder cb=em.getCriteriaBuilder();  
	         CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
	         Root<Student> stud =	cq.from(Student.class);  
	           
		     cq.orderBy(cb.asc(stud.get("s_age")));  
		     
		     CriteriaQuery<Student> select = cq.select(stud);  
		     TypedQuery<Student> q = em.createQuery(select);  
	         List<Student> list = q.getResultList();  
		  
	         System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
             
             
	            for(Student s:list)  
	            {  
	            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
	        
	            }  
	              
	            em.getTransaction().commit();  
	            em.close();  
	            emf.close();     
		     }  
		
		private static void selectDSCOrderByRecords() {
			
	         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
	         EntityManager em = emf.createEntityManager();  
	          			   em.getTransaction().begin( );  
	          			 Student s2=new Student();
	          	        s2.setS_age(22);
	          	        s2.setS_name("Swetal");
	          	        em.persist(s2);
	          	        
	          	        Student s3=new Student();
	          	        s3.setS_age(22);
	          	        s3.setS_name("Nandini");
	          	        em.persist(s3);
	          	       
	          	        Student s4=new Student();
	          	        s4.setS_age(21);
	          	        s4.setS_name("Chandni");
	          	        em.persist(s4);
		     CriteriaBuilder cb=em.getCriteriaBuilder();  
	         CriteriaQuery<Student> cq=cb.createQuery(Student.class);  
	         Root<Student> stud =	cq.from(Student.class);  
	           
		     cq.orderBy(cb.desc(stud.get("s_age")));  
		     
		     CriteriaQuery<Student> select = cq.select(stud);  
		     TypedQuery<Student> q = em.createQuery(select);  
	         List<Student> list = q.getResultList();  
		  
	         System.out.println("s_id" + "   " + "s_name" + "\t" + "s_age");  
             
             
	            for(Student s:list)  
	            {  
	            System.out.println(s.getS_id() + "      " + s.getS_name() + "\t" + s.getS_age());  
	        
	            }  
	           
	           
	            
	            em.getTransaction().commit();  
	            em.close();  
	            emf.close(); 
		     }  
}