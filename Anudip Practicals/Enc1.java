class Enc
{private int No;

public int getempNo()
{
return No;
}
public void setNo(int newvalue)
{
No=newvalue
}
class Enc1{

 public static void main(String args[])
{
Enc obj=new Enc();
obj.setNo(15);
System.out.println("No value" +obj.getNo);
}
}
}