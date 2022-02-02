package com.demo.OTMMapping;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.OTMMapping.entity.Library;
import com.demo.OTMMapping.entity.Student;



public class OTMMapping 
{
    public static void main( String[] args )
    {
    	
    	    		        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
    	    			        EntityManager em=emf.createEntityManager();  
    	    	         
    	    			        em.getTransaction().begin();  
    	    		          
    	    			         Library lib1=new Library();  
    	    			           		//lib1.setB_id(101);  
    	    			           		lib1.setB_name("Data Structure");  
    	    			            
    	    			             
    	    			           Library lib2=new Library();  
    	    			           		//lib2.setB_id(102);  
    	    			           		lib2.setB_name("DBMS"); 
    	    			           		
    	    			           Library lib3=new Library();  
    	 			           		//lib2.setB_id(102);  
    	 			           		lib3.setB_name("MySQL");
    	    			           
    	    			           		em.persist(lib1);  
    	    			           		em.persist(lib2); 
    	    			           		em.persist(lib3); 
    	    		             
    	    			           ArrayList<Library> list=new ArrayList<Library>();  
    	    			           		list.add(lib1);  
    	    			           		list.add(lib2); 
    	    			           		
    	    			           		
    	    			            List<Library> list1 = new ArrayList<>(); 
    	    			            	list1.add(lib3);
    	    		             
    	    			             
    	    			             
    	              
    	    			          
    	    			        Student st1=new Student();  
    	    			        	//st1.setS_id(1);  
    	    			        	st1.setS_name("Swetal");  
    	    			        	st1.setBooks_issued(list); 
    	    			        	em.persist(st1);
    	    			        	
    	    			        	 Student st2=new Student();  
    	     			        	//st1.setS_id(1);  
    	     			        	st2.setS_name("Ayush");  
    	     			        	st2.setBooks_issued(list1); 
    	    			             
    	    			          
    	    			        	em.persist(st2);  
    	    			           
    	    			             
    	    			           	em.getTransaction().commit();  
    	    			           	em.close();  
    	    			        	emf.close();  
    	    			             
    	    			          
    	    		    }		 
    	    }
    
