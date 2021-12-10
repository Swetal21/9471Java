import java.util.HashMap;
import java.util.Map;
 
public class MyClass {
    public static void main(String args[]) {
           Map<String, String> hashMap = new HashMap<String, String>();
           hashMap.put(new String("a"), "audi");
           hashMap.put(new String("a"), "ferrari");
           System.out.println(hashMap);
    }
 
}