import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   String str = in.readLine();
	   System.out.println(reverseString(str));
    }
    private static String reverseString(String str) {
	   if(str.equals("")) {
		  return "";
	   }
	   String rest = str.substring(1);
	   return reverseString(rest)+str.charAt(0);
    }
    
}