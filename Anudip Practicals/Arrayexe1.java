
import java.util.Arrays; 
public class Arrayexe1{
public static void main(String args[])
{
	int[]a= {4,8,9,5};
    String[]b= {"S","N","A"}; 
  System.out.println("Before Sorting");
	for(int element:a) {
		System.out.println(element);
           
}
  System.out.println("After Sorting");
              for(int element:a) {

                 Arrays.sort(a);
              System.out.println(element);
	}
              System.out.println("Before Sorting");
		
	for(String Sc:b) {
		System.out.println(Sc);
              
	}		
	
           
        System.out.println("After Sorting");
              for(String Sc:b) {

                 Arrays.sort(b);
              System.out.println(Sc);
	}

		

	
}
}
