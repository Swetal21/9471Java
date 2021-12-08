import java.util.Scanner;
public class Arrayexe6 {
	public static void main(String args[])
	{
		int[]a= {15,20,95,78};
		int x;
		
		
		for(int NA:a) 
		{
			System.out.println(NA);}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to check Index");
		x=sc.nextInt();
		
        int i = 0;
        while(i < a.length) {
            if(a[i] == x) {
                index = i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+NA+" is : "+i);
    }
}
