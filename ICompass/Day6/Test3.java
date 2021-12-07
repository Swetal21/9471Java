class Test3
{
public static void main(String args[])
{
try
{
doMath(5);
System.out.println("Hi");
}
finally{
System.out.println("From Finally");
}
}
public static void doMath(int den)
{
int num=7/den;
}
}