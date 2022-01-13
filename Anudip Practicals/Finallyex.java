package exceptionhandling;
import java.io.*;
public class Finallyex {
	
	public static void main(String args[]) {
		try
		{
			int a[] = new int[2];
			System.out.println("ascess element :" +a[3]);
			
		}
		
		catch (Exception e)
		{
			System.out.println("Execption thrwom" +e);
				
		}
		finally {
			System.out.println("Finally is block");
		}
		
		
		
		  System.out.println("Out of the block");

	}
	}


