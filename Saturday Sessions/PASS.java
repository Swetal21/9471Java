import java.util.Scanner;
import java.util.regex.*;
public class PASS {

	  
	    
	    public static boolean
	    isValidPassword(String password)
	    {
	  	       
	        String regex = "[a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{3}";
	  
	       
	        Pattern p = Pattern.compile(regex);
	  
	       
	        if (password == null) {
	            return false;
	        }
	  
	        
	        Matcher m = p.matcher(password);
	  
	      
	        return m.matches();
	    }
	  
	    
	    public static void main(String args[])
	    {
	  
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter id");
			String id = sc.nextLine();   
	        System.out.println(isValidPassword(id));
	  
	       
	}
}
