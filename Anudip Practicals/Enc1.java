class Enc
{
private int i;

public int geti()
{
return i;
}
public void seti(int newvalue)
{
i=newvalue;}
}
class Enc1{

public static void main(String args[])
{
Enc obj=new Enc();
obj.seti(15);
System.out.println("i value" +obj.geti());
}
}
