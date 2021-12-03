class Disp
{
 void display(char c)
{
System.out.println(c);
}
 void display(char c, int num)
{
System.out.println(c + " " +num);
}
}
class Disp2
{
public static void main(String args[])
{
Disp obj=new Disp();
obj.display('a');
obj.display('a',6);
}
}
