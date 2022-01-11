class Test extends Thread{
public void run()
{
System.out.println("Run");
}
}
class Myclass2{
public static void main(String[]args)
{
Thread t = new Test();
t.start();
System.out.println("Main");
}
}