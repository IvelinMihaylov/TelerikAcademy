import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BitConvert {
    
    public static void main(String[] args) throws Exception {
	   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	   int[] nums = Arrays.stream(in.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
	   StringBuilder result = new StringBuilder();
	   for(int i = 0; i < nums.length; i++) {
		  StringBuilder num = new StringBuilder(Integer.toBinaryString(nums[i]));
		  while(num.length() != 8) {
			 num.insert(0, 0);
		  }
		  if(i % 2 == 0) {
			 for(int j = 1; j < num.length(); j += 2) {
				result.append(num.charAt(j));
			 }
		  } else {
			 for(int j = 0; j < num.length(); j += 2) {
				result.append(num.charAt(j));
			 }
		  }
	   }
	   System.out.println(result);
    }
}