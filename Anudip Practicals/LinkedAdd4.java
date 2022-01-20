
import java.util.LinkedList;

public class LinkedAdd4 {
	public static void main(String args[]) {
		LinkedList<String>L1=new LinkedList<String>();	
		 L1.add("Swetal");
		 L1.add("Nandini");
		 L1.add("Chandani");
		System.out.println("Linked list before Adding"  +L1);
     
		LinkedList<String>L2=new LinkedList<String>();	
		 L2.add("Prasad");
		
		 L1.addAll(2,L2);
     
     
     
     System.out.println("Linked list After Adding"  +L1);
	
	}
}