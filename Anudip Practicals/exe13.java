import java.util.Scanner;
public class exe13 {
	
	public static void main(String args[])
	{
		double a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Height");
	a=sc.nextDouble();
	System.out.println("Enter Width");
	b=sc.nextDouble();
    double Area=a*b;
   System.out.println("Area is " +Area);
   double Perimeter=2*(a+b);
   System.out.println("Perimeter is " +Perimeter);
	}
	}
