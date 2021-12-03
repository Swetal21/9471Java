import java.util.Scanner;
public class Multi
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter 1st Number: ");
int number1 = scan.nextInt();
System.out.println("Enter 2nd Number:");
int number2 = scan.nextInt();
int product = number1*number2;
System.out.println("Output: " +product);
}
}