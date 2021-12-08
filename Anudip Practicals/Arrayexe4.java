public class Arrayexe4 {

	public static void main(String args[])
	{
		int[]a= {4,8,9,5};
                    int sum=0;
	   
		for(int element:a) 
                          sum += element  ;
		double average=sum/a.length;
   
			System.out.println("Average is" +average);
	           
}
}