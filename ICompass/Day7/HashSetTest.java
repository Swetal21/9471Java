import java.util.HashSet;
import java.util.Set;
public class HashSetTest {
public static void main(String args[])
{
Set haseSet=new HashSet<>();
haseSet.add("1");
haseSet.add(1);
haseSet.add("null");
haseSet.add(null);
System.out.println(haseSet);
}
}
