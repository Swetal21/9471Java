import java.util.Scanner;
class cls1 
{
void add(int p ,int q)
{
System.out.println(p+q);
}
}

class cls2 extends cls1
{
void mul(int p,int q)
{
System.out.println(p*q);
}

void task(int p, int q)
{
System.out.println((p*p)+(q*q));
}
}

class GeeksInheritance
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
cls2 obj =new cls2();

obj.add(a,b);
obj.mul(a,b);
obj.task(a,b);
}
}