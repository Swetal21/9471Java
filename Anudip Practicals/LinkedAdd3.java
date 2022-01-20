

import java.util.LinkedList;

public class LinkedAdd3{
	public static void main(String args[]) {
		LinkedList<String>L1=new LinkedList<String>();	
		 L1.add("Swetal");
		 L1.add("Nandini");
		 
		System.out.println("Linked list before Adding"  +L1);
     L1.addLast("Chandani");
    
     System.out.println("Linked list After Adding"  +L1);
	
	}
}