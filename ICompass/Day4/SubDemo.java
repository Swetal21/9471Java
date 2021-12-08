class Demo2{
	{}
}
public class SubDemo extends Demo2 {
	public static void main(String[] args) {
		Demo2 obj = new SubDemo();
		System.out.println(obj instanceof Demo2);
	}
}