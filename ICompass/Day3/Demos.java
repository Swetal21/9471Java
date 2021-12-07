import java.util.regex.Pattern;
public class Demos {
	public static void main(String[] args) {
		String input = "Hello Welcome";
		String pattern = "\\sHello\\sWelcome\\s";
		boolean flag = Pattern.matches(pattern, input);
		System.out.println(flag);
	}

}
