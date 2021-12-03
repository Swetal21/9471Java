import java.util.Scanner;
public class Check
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter Num: ");
int Num= scan.nextInt();
  
if(Num>0)  
{  
System.out.println("The number is positive.");  
}  

else if(Num<0)  
{  
System.out.println("The number is negative.");  
}  

else  
{  
System.out.println("The number is zero.");  
}  
}  
}  
