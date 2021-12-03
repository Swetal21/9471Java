abstract class demo{
public abstract void display();
 
public void display1()
{
System.out.println("In Display1");
}
}
class child extends demo
{
public void display()
{
System.out.println("In child");
}
}
class baby{
public static void main(String args[])
{
child obj = new child();
obj.display();
obj.display1();
}
}

