import java.util.Scanner;
public class Great
{
public static void main(String args[])
{
 int a,b,c;
Scanner sc= new Scanner(System.in);
System .out.print("Enter 1st number");
a=sc.nextInt();
System .out.print("Enter 2nd number");
b=sc.nextInt();
System .out.print("Enter 3rd number");
c=sc.nextInt();
  

if(a > b &&  a > c)
{
System.out.println("Gretest number is :"+a);
}
else if( a > b)
{
System.out.println("Gretest number is :"+b);
}
else
{
System.out.println("Gretest Number is :"+c);
}

}
}