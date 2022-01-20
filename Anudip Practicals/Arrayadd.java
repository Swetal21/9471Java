

import java.util.ArrayList;
import java.util.Collections;
public class Arrayadd {
public static void main(String args[]) {
ArrayList<String>L1=new ArrayList<String>();	
 L1.add("Swetal");
 L1.add("Mohan");
 L1.add("Ninave");
 
System.out.println("ArrayList 1"  +L1);


ArrayList<String>L2=new ArrayList<String>();	
L2.add("Mumabi");
L2.add("Pune");
L2.add("Banglore");

System.out.println("ArrayList 1"  +L1);
L1.addAll(L2);

System.out.println("Joined ArrayList "  +L1);

}
}
