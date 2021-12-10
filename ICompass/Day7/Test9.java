import java.util.*;
public class Test9 {
public static void main(String args[])
{
	Queue<String> obj= new PriorityQueue<String>();
	obj.add("One");
	obj.add("two");
	obj.add("TWO");
	System.out.println(obj.poll());
	
}
}
