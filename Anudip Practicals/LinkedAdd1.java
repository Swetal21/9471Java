

import java.util.LinkedList;

public class LinkedAdd1 {
	public static void main(String args[]) {
		LinkedList<String>L1=new LinkedList<String>();	
		 L1.add("Swetal");
		 L1.add("Nandini");
		 
		System.out.println("Linked list before Adding"  +L1);
     L1.addFirst("Chandani");
     L1.addLast("Prasad");
     System.out.println("Linked list After Adding"  +L1);
	
	}
}