

import java.util.ArrayList;

public class Arrayclone {
	public static void main(String args[]) {
		ArrayList<String>L1=new ArrayList<String>();	
		 L1.add("Swetal");
		 L1.add("Mohan");
		 L1.add("Ninave");
		 
		System.out.println("ArrayList 1"  +L1);
		ArrayList<String>newL1= (ArrayList<String>)L1.clone();
		System.out.println("Clone list"  +newL1);
	}
}