import java.util.Scanner;
public class New {
public static void main(String args[]) {
	int x,y,z,c,d;
	Scanner a= new Scanner(System.in);
	System.out.println("Enter  1st  number");
	x=a.nextInt();
	System.out.println("Enter  2nd number");
	y=a.nextInt();
	System.out.println("Enter  3rd  number");
	z=a.nextInt();
	c=x+y+z;
 	// Sum is 
	System.out.println("The sum is " +c);
    d=c/3;
   // Average is  
    System.out.println("Average is " +d);

    // For maximum 
    
     if(x>y && x>z) {
    	 System.out.println("max value is " +x);
     }
     if(y>x && y>z) {
    	 System.out.println("max value is " +y);
     }    
       
     if(z>y && z>x) {
    	 System.out.println("max value is " +z);
     }
    // For Minimum
     
     if(x<y && x<z) {
    	 System.out.println("min value is " +x);
     }
     if(y<x && y<z) {
    	 System.out.println("min  value is " +y);
     }    
       
     if(z<y && z<x) {
    	 System.out.println("min value is " +z);
     }
     
}

}
