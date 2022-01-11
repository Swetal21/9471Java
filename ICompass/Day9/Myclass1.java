class Test implements Runnable{
public void run()
{
System.out.println("Run");
}
}
class Myclass1{
public static void main(String[]args)
{
Thread t1 = new Thread();
t1.start();
System.out.println("Main");
}
}