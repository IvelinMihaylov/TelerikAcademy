import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BracketsExpressions {
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(in.readLine());
	   generateBracketsExpressions("", n).forEach(System.out::println);
    }
    
    private static HashSet<String> generateBracketsExpressions(String exp, int n) {
	   HashSet<String> bracketsExpressions = new HashSet<>();
	   if(exp.length() >= n) {
		  bracketsExpressions.add(exp);
		  return bracketsExpressions;
	   }
	   HashSet<String> result = generateBracketsExpressions("(" + exp + ")", n);
	   bracketsExpressions.addAll(result);
	   result = generateBracketsExpressions("()" + exp, n);
	   bracketsExpressions.addAll(result);
	   result = generateBracketsExpressions(exp + "()", n);
	   bracketsExpressions.addAll(result);
	   return bracketsExpressions;
    }
}
